package com.hm.bus.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.eip.common.model.FrameResp;
import com.eip.service.biz.bjbus.inf.BusLoanAfService;
import com.eip.service.biz.bjbus.model.CloseLoanAppReqDto;
import com.eip.service.biz.bjbus.model.CreateRepayPlan;
import com.eip.service.biz.bjbus.model.CreateRepayPlanReqDto;
import com.eip.service.biz.bjbus.model.CreateRepayPlanRespDto;
import com.eip.service.biz.bjbus.model.LoanConfirmReqDto;
import com.eip.service.biz.bjbus.model.LoanConfirmRespDto;
import com.gep.core.util.DateUtils;
import com.gep.core.util.HttpUtils;
import com.gep.core.util.ObjectUtils;
import com.gep.core.util.RedisUtils;
import com.gep.core.util.StringUtil;
import com.gep.util.PropertyUtils;
import com.google.common.collect.Lists;
import com.hm.bus.dao.BusGoodsDictMapper;
import com.hm.bus.dao.BusLnAppBatchMappingMapper;
import com.hm.bus.dao.BusLnAppMapper;
import com.hm.bus.dao.BusSentLogMapper;
import com.hm.bus.dao.LnAppColsedInfoMapper;
import com.hm.bus.dao.LnAppStatuschangelogMapper;
import com.hm.bus.dao.LnCommodityInfoMapper;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.module.BusLnAppBatchMapping;
import com.hm.bus.module.BusSentLog;
import com.hm.bus.module.LnAppColsedInfo;
import com.hm.bus.module.LnAppStatuschangelog;
import com.hm.bus.module.LnCommodityInfo;
import com.hm.bus.service.BusLnAppService;
import com.hm.bus.service.BusSentService;
import com.hm.bus.service.BusSysErrorLogService;
import com.hm.bus.util.BusSentRunnable;
import com.hm.bus.util.CryptoUtils;
import com.hm.bus.util.LnAppQueryBody;
import com.hm.bus.util.Result;
import com.hm.bus.webservice.LnAppJsonHead;
import com.hm.bus.webservice.cnloan.CnLoanService;
import com.hm.bus.webservice.cnloan.LnAppClosedBody;
import com.hm.bus.webservice.cnloan.LoanClientCXF;
import com.hm.bus.webservice.cnloan.RepaymentNoticeModel;
import com.hm.bus.webservice.cnloan.RepaymentNoticeResult;
import com.hm.bus.webservice.cnloan.TransHead;
import com.hm.bus.webservice.cnloan.TransModel;
import com.hm.sys.constants.SysConstants;

@Service
public class BusSentServiceImpl implements BusSentService {

	private static final Logger LOG = Logger
			.getLogger(BusSentServiceImpl.class);

	@Autowired
	private BusLnAppMapper busLnAppMapper;
	@Autowired
	private LnCommodityInfoMapper lnCommodityInfoMapper;
	@Autowired
	private BusLnAppService busLnAppService;
	@Autowired
	private BusGoodsDictMapper busGoodsDictMapper;
	@Autowired
	private BusSentLogMapper busSentLogMapper;
	@Autowired
	private LnAppColsedInfoMapper lnAppColsedInfoMapper;
	@Autowired
	private BusSysErrorLogService busSysErrorLogService;
	@Resource
	private ThreadPoolTaskExecutor busThreadPoolTaskExecutor;

	@Autowired
	private BusLnAppBatchMappingMapper busLnAppBatchMappingMapper;
	@Autowired
	private LnAppStatuschangelogMapper lnAppStatuschangelogMapper;

	@Autowired
	private BusLoanAfService busLoanAfService;

	/**
	 * 放款成功确认 <br/>
	 * 线程安全
	 */
	@Override
	public void loanConfirmTask() {
		LOG.info("[BusSentServiceImpl] LoanConfirmTask method begin...");
		try {
			RedisUtils.putObject("BUS_TASK", "BUS_LOAN_CONFIRM", "true", 21600000L);
			
			// 加密的RSA公钥
			String RSAPUBLICKEY = PropertyUtils.getConfig("bus",
					"http.intf.encrypt.rsa");
			// 解密的RSA私钥
			String RSQPRIVATEKEY = PropertyUtils.getConfig("bus",
					"http.intf.decode.rsa");
			String LNAPP_QUERY_URL = PropertyUtils.getConfig("bus",
					"http.repayment.query.lnapp");

			// add by 20170309 增加反保理转保理业务
			String butSwitch = PropertyUtils.getConfig("bus",
					"com.hm.bus.posdbl2bl.switch");
			String dbl2blSwitch = RedisUtils.getObject("BUS_POS_DBL2BL_SWITCH");

			LOG.info("query lnapp queryLoan.intf begin...");

			List<BusLnApp> busLnAppList = busLnAppMapper
					.selectSendBusLnAppList();

			//  旧版获取产品ID方法,后期注释掉
			Map<String, String> busProductMap = new HashMap<String, String>();
			List<Map<String, Object>> busProductList = busLnAppMapper
					.selectBusProductIdByAppState("32");
			for (Map<String, Object> m : busProductList) {
				busProductMap.put(ObjectUtils.toString(m.get("id")),
						ObjectUtils.toString(m.get("busProductId")));
			}

			if (busLnAppList.size() > 0) {
				// 创建线程计数器
				final CountDownLatch latch = new CountDownLatch(
						busLnAppList.size());

				for (BusLnApp lnApp : busLnAppList) {
					String busAppId = lnApp.getBusAppid();
					Long appId = lnApp.getId(); // 工单id
					String oldstatus = lnApp.getAppState();
					String busPrdId = lnApp.getBusProductId();

					//  旧版获取产品ID方法,后期注释掉
					if (StringUtil.isBlank(busPrdId)) {
						busPrdId = busProductMap.get(lnApp.getId() + ""); // bus产品id
					}

					// add by 20170309 增加反保理转保理业务
					if ("Y".equals(butSwitch) && "Y".equals(dbl2blSwitch)) {
						if ("POS".equalsIgnoreCase(lnApp.getLoanType())
								&& "DBL".equalsIgnoreCase(lnApp
										.getCapitalType())) {
							busPrdId = PropertyUtils.getConfig("bus",
									"com.hm.bus.posdbl2bl.busproductid"
											+ busPrdId);
						}
					}

					LOG.info("[BusSentServiceImpl] LoanConfirmTask method busAppId:"
							+ busAppId
							+ ",appId:"
							+ appId
							+ ",busPrdId:"
							+ busPrdId);

					String directLinkBJSwtich = PropertyUtils.getConfig("bus",
							SysConstants.BUS_DIRECT_BJ_LINK_SWITCH_KEY);
					LOG.info("[BusSentServiceImpl] LoanConfirmTask method  com.hm.bus.direct.link.switch:"
							+ directLinkBJSwtich);

					Map<String, Object> paramMap = null;
					LoanConfirmReqDto loanConfirmReq = null;
					if (SysConstants.HYPER_DIRECT_CALL_BJ_SERVICE
							.equals(directLinkBJSwtich)) {
						paramMap = new HashMap<String, Object>();
						com.hm.bus.webservice.LnAppJsonHead head = new com.hm.bus.webservice.LnAppJsonHead();
						String key = CryptoUtils.randChar(10);
						String prikey = CryptoUtils
								.publicEnc(key, RSAPUBLICKEY);
						head.setSecretKey(prikey);
						head.setIsSecret(1);// 1、密码校验 2、无密码校验
						String jsonHead = JSONObject.toJSONString(head);
						// 组装报文内容
						LnAppQueryBody content = new LnAppQueryBody();
						content.setAppId(busAppId);
						content.setProductId(busPrdId);
						content.setSaleChannel("1028");
						content.setProductIdKey("JFCN");
						content.setSaleChannelKey("JFCN");
						String jsonContent = JSONObject.toJSONString(content);
						LOG.info("直连调用北京  [BusSentServiceImpl] LoanConfirmTask method 随机密钥"
								+ key + " ,发送报文:" + jsonContent);
						jsonContent = CryptoUtils
								.getEncString(jsonContent, key);
						paramMap.put("jsonHead", jsonHead);
						paramMap.put("jsonContent", jsonContent);
					} else {
						loanConfirmReq = new LoanConfirmReqDto();
						loanConfirmReq.setAppId(busAppId);
						loanConfirmReq.setProductId(busPrdId);
						loanConfirmReq.setSaleChannel("1028");
						loanConfirmReq.setProductIdKey("JFCN");
						loanConfirmReq.setSaleChannelKey("JFCN");
						loanConfirmReq
								.setCallerSysCode(SysConstants.HYPER_SYSTEM_CODE);
						loanConfirmReq
								.setCallerSysName(SysConstants.HYPER_SYSTEM_NAME);
					}

					// ==================多线程实现==============================
					busThreadPoolTaskExecutor.execute(new BusSentRunnable(
							appId, LNAPP_QUERY_URL, paramMap, RSQPRIVATEKEY,
							lnApp, oldstatus, loanConfirmReq) {
						@Override
						public void run() {
							try {
								String resp_code = null;
								String resp_msg = null;
								String status = null;
								
								//  记录操作日志
								BusSentLog sentLog = new BusSentLog();
								sentLog.setLnAppId(this.getAppId());
								sentLog.setBusType("2");// 2 放款确认(32->50)
								sentLog.setState("2");// 1.成功 2.失败
								

								if (null != this.getParamMap()) {
									LOG.info(this.getAppId()
											+ "[BusSentServiceImpl] 直连调用北京放款确认  LoanConfirmTask method 请求参数："
											+ this.getParamMap().toString());
									String resultStr = HttpUtils.URLPostResult(
											this.getLNAPP_QUERY_URL(),
											this.getParamMap(), "UTF-8");
									LOG.info(this.getAppId()
											+ "[BusSentServiceImpl] 直连调用北京放款确认 LoanConfirmTask method 请求返回的结果："
											+ resultStr);
									JSONObject object = JSON
											.parseObject(resultStr);
									resp_code = object.getString("resp_code");
									resp_msg = object.getString("resp_msg");

									if (SysConstants.HYPER_CALL_BJ_SUCCESS
											.equals(resp_code)) {
										String resp_aesKey = object
												.getString("resp_aesKey");
										String loanMap = object
												.getString("resp_result");

										String aeskey = CryptoUtils.privateDec(
												resp_aesKey,
												this.getRSQPRIVATEKEY());
										resultStr = CryptoUtils.getDecString(
												loanMap, aeskey);
										LOG.info(this.getAppId()
												+ "[BusSentServiceImpl] 直连调用北京放款确认   LoanConfirmTask method resultStr: "
												+ resultStr);
										JSONObject resultObj = JSON
												.parseObject(resultStr);
										status = resultObj
												.getString("appStatus");
										LOG.info(this.getAppId()
												+ "[BusSentServiceImpl] 直连调用北京放款确认   LoanConfirmTask method return status:"
												+ status);
										if ("F0243".equals(status)) {
											String resultAppId = resultObj
													.getString("appId");
											LOG.info(this.getAppId()
													+ "[BusSentServiceImpl] 直连调用北京放款确认   LoanConfirmTask method return success of resultAppId="
													+ resultAppId);
											sentLog.setState("1");
										}
									} else {
										LOG.info(this.getAppId()
												+ "|  直连调用北京webservice  |"
												+ resp_msg);
									}
								} else {
									LOG.info(this.getAppId()
											+ "[BusSentServiceImpl] 调用外联接口放款确认 LoanConfirmTask method 请求参数："
											+ JSONObject.toJSONString(this
													.getLoanConfirmReq()));
									FrameResp<LoanConfirmRespDto> resp = busLoanAfService
											.loanConfirm(this
													.getLoanConfirmReq());
									LOG.info(this.getAppId()
											+ "[BusSentServiceImpl] 调用外联接口放款确认 LoanConfirmTask method 请求返回的结果："
											+ JSONObject.toJSONString(resp));
									resp_code = String.valueOf(resp.getHead()
											.getCode());
									resp_msg = resp.getHead().getMsg();

									if (StringUtils
											.equals(SysConstants.HYPER_CALL_OUTLINK_SUCCESS,
													resp_code)) {
										LoanConfirmRespDto loanConfirmRespDto = resp
												.getData();

										status = loanConfirmRespDto
												.getAppStatus();
										LOG.info(this.getAppId()
												+ "[BusSentServiceImpl] 调用外联接口放款确认  LoanConfirmTask method return status:"
												+ status);
										if (SysConstants.HYPER_CALL_BJ_MAKE_LOAN_SUCCESS
												.equals(status)) {
											String resultAppId = loanConfirmRespDto
													.getAppId();
											LOG.info(this.getAppId()
													+ "[BusSentServiceImpl] 调用外联接口放款确认   LoanConfirmTask method return success of resultAppId="
													+ resultAppId);
											sentLog.setState("1");
										}
									} else {
										LOG.info(this.getAppId()
												+ "|  调用外联接口  |"
												+ resp_msg);
									}
								}

								sentLog.setReturnCode(resp_code);
								sentLog.setErrorCode(status);
								sentLog.setErrorMsg(resp_msg);
								sentLog.setUpdateTime(new Date());
								sentLog.setRecordType("1");
								sentLog.setErrorMsg(StringUtil.substring(
										sentLog.getErrorMsg(), 0, 50));
								busSentLogMapper.insertSelective(sentLog);

							} catch (Exception e) {
								LOG.error(
										this.getAppId()
												+ "[BusSentServiceImpl] LoanConfirmTask method Exception ",
										e);
								busSysErrorLogService.saveError(
										this.getAppId()
												+ "[BusSentServiceImpl] LoanConfirmTask method Exception ",
										e);
							} finally {
								// 计数器减一
								latch.countDown();
							}
						}
					});
				}
				// 等待所有的线程完成
				latch.await();
			}
			LOG.info("[BusSentServiceImpl] LoanConfirmTask method end...");
		} catch (Exception e) {
			LOG.error("[BusSentServiceImpl] LoanConfirmTask Exception: ", e);
			busSysErrorLogService.saveError(
					"[BusSentServiceImpl] LoanConfirmTask Exception: ", e);
		} finally{
			RedisUtils.putObject("BUS_TASK", "BUS_LOAN_CONFIRM", "false", 21600000L);
		}
	}

	/**
	 * 批量提交生成还款计划(每个批量有上限)<br/>
	 * 线程安全
	 */
	@Override
	public synchronized void updateRepaymentPlan() {
		LOG.info("[BusSentServiceImpl] updateRepaymentPlan method begin...");
		try {
			RedisUtils.putObject("BUS_TASK", "BUS_UPDATE_REPAYMENT_PLAN", "true", 21600000L);

			// 查询待生成还款计划工单记录
			List<BusLnApp> busLnAppSuperList = busLnAppMapper
					.selectRepaymentLnAppList();

			if (null != busLnAppSuperList && busLnAppSuperList.size() > 0) {
				// 批量查询待生成还款计划的商品信息
				List<LnCommodityInfo> lnCommodityList = lnCommodityInfoMapper
						.selectCommodityByRepaymentList();

				LOG.info("[BusSentServiceImpl] updateRepaymentPlan method 待生成还款计划工单共计"
						+ busLnAppSuperList.size() + "笔!");
				LOG.info("[BusSentServiceImpl] updateRepaymentPlan method 待生成还款计划工单对应商品信息共计"
						+ lnCommodityList.size() + "条!");

				List<Map<String, Object>> goodsDictCodeList = busGoodsDictMapper
						.selectGoodsDictCodeName();
				Map<String, String> goodsDistCodeMap = new HashMap<String, String>();
				for (Map<String, Object> m : goodsDictCodeList) {
					goodsDistCodeMap.put(ObjectUtils.toString(m.get("code")),
							ObjectUtils.toString(m.get("name")));
				}

				// ===================读取商品信息列表======================
				Map<Long, List<String>> waresListMap = getWareInfomation(
						lnCommodityList, goodsDistCodeMap);

				//  ==============分批次批量提交,对List进行切片操作===================
				int batchsentsize = Integer.parseInt(PropertyUtils.getConfig(
						"bus", "com.hm.bus.repayment.batchsentsize"));
				List<List<BusLnApp>> busLnAppSuperListArray = com.hm.bus.util.ListUtil
						.splitList(busLnAppSuperList, batchsentsize);
				for (List<BusLnApp> busLnAppList : busLnAppSuperListArray) {
					List<RepaymentNoticeModel> RepaymentNoticelist = new ArrayList<RepaymentNoticeModel>();
					Map<Long, BusLnApp> appIdBusIdMap = new TreeMap<Long, BusLnApp>();

					Map<Long, Boolean> appIdMap = new TreeMap<Long, Boolean>();
					List<Long> appIdList = new ArrayList<Long>();

					List<BusSentLog> logerrList = new ArrayList<BusSentLog>();

					String directLinkBJSwtich = PropertyUtils.getConfig("bus",
							"com.hm.bus.direct.link.switch");
					LOG.info("[BusSentServiceImpl] updateRepaymentPlan method  com.hm.bus.direct.link.switch = "
							+ directLinkBJSwtich);

					if (SysConstants.HYPER_DIRECT_CALL_BJ_SERVICE
							.equals(directLinkBJSwtich)) {
						directInvokeBJCreateLoanService(waresListMap,
								busLnAppList, RepaymentNoticelist,
								appIdBusIdMap, appIdMap, appIdList, logerrList);
					} else {
						goThroughOutLinkCreateLoanService(waresListMap,
								busLnAppList, appIdBusIdMap, appIdMap,
								appIdList, logerrList);
					}

				}
			} else {
				LOG.info("[BusSentServiceImpl] updateRepaymentPlan method 无工单可生成还款计划...");
			}
		} catch (Exception e) {
			LOG.error(
					"[BusSentServiceImpl] updateRepaymentPlan method Exception: ",
					e);
			busSysErrorLogService
					.saveError(
							"[BusSentServiceImpl] updateRepaymentPlan method Exception: ",
							e);
		}finally{
			RedisUtils.putObject("BUS_TASK", "BUS_UPDATE_REPAYMENT_PLAN", "false", 21600000L);
		}
		LOG.info("[BusSentServiceImpl] updateRepaymentPlan method end...");
	}

	/**
	 * 读取商品信息列表
	 * @param lnCommodityList
	 * @param goodsDistCodeMap
	 * @return
	 */
	private Map<Long, List<String>> getWareInfomation(
			List<LnCommodityInfo> lnCommodityList,
			Map<String, String> goodsDistCodeMap) {
		Map<Long, List<String>> waresListMap = new HashMap<Long, List<String>>();
		for (LnCommodityInfo com : lnCommodityList) {
			Long appid = com.getAppId();
			List<String> waresList = waresListMap.get(appid);
			if (waresList == null) {
				waresList = new ArrayList<String>();
			}
			String typeName = goodsDistCodeMap.get(com
					.getCommodityClass()) + " ";
			String commodityName = com.getCommodityName() + " ";
			String commodityType = com.getCommodityType() + "";

			StringBuilder sb = new StringBuilder();
			sb.append(typeName);
			sb.append(commodityName);
			sb.append(commodityType);
			waresList.add(sb.toString());
			waresListMap.put(appid, waresList);
		}
		return waresListMap;
	}

	/**
	 * 通过外联接口调用创建还款计划
	 * 
	 * @param waresListMap
	 * @param busLnAppList
	 * @param appIdBusIdMap
	 * @param appIdMap
	 * @param appIdList
	 * @param logerrList
	 */
	private void goThroughOutLinkCreateLoanService(
			Map<Long, List<String>> waresListMap, List<BusLnApp> busLnAppList,
			Map<Long, BusLnApp> appIdBusIdMap, Map<Long, Boolean> appIdMap,
			List<Long> appIdList, List<BusSentLog> logerrList) {
		CreateRepayPlanReqDto createRepayPlanDto = new CreateRepayPlanReqDto();
		createRepayPlanDto.setCallerSysName(SysConstants.HYPER_SYSTEM_NAME);
		createRepayPlanDto.setCallerSysCode(SysConstants.HYPER_SYSTEM_CODE);
		ArrayList<CreateRepayPlan> createRepayPlanList = Lists.newArrayList();
		createRepayPlanDto.setNotices(createRepayPlanList);
		for (BusLnApp lnApp : busLnAppList) {
			CreateRepayPlan createRepayPlan = new CreateRepayPlan();
			String busAppId = lnApp.getBusAppid();
			Long appId = lnApp.getId();
			if (StringUtil.isNotBlank(busAppId)) {
				appIdBusIdMap.put(Long.parseLong(busAppId), lnApp);
			}
			appIdMap.put(appId, false);
			appIdList.add(appId);

			// Mid Evan 2016-06-07增加商品信息推送
			createRepayPlan.setAppId(busAppId);
			// Mid Evan 2016-01-29 帮卡ID字段不管代扣和自主都传个1(易宝==>快付通)
			createRepayPlan.setIdentityId("1");
			createRepayPlan.setWaresName(StringUtil.join(
					waresListMap.get(appId), ","));

			// 2017-02-10 增加三个字段:还款类型, 虚拟账号,借款类型
			String repaymentType = lnApp.getRepaymentType();
			String selfRepayAccount = lnApp.getSelfRepayAccount();
			String loanType = lnApp.getLoanType();
			Date createContTime = lnApp.getCreateContTime(); // 合同生成时间

			if (StringUtil.isNotBlank(repaymentType)) {
				if ("2".equals(repaymentType)) {
					createRepayPlan.setRepType("1");
				}
				if ("1".equals(repaymentType)) {
					createRepayPlan.setRepType("3");
				}
			}
			createRepayPlan.setFrmcod(selfRepayAccount);
			if (StringUtil.isNotBlank(loanType)) {
				if ("POS".equals(loanType)) {
					createRepayPlan.setCreditLoanType("2");
				}
				// 20170329 leimeng 新增AGR农机贷
				if ("AGR".equals(loanType)) {
					createRepayPlan.setCreditLoanType("2");
				}
				if ("CASH".equals(loanType)) {
					createRepayPlan.setCreditLoanType("1");
				}
			}

			String appayDate = "";
			// 2017-2-28 增加一个字段:合同申请日期
			if (createContTime != null) {
				appayDate = DateUtils.formatDate(createContTime, "yyyy-MM-dd");
			} else {
				LnAppStatuschangelog log = lnAppStatuschangelogMapper
						.selectByAppId(appId);
				if (log != null) {
					Date createdon = log.getCreatedon();
					appayDate = DateUtils.formatDate(createdon, "yyyy-MM-dd");
				}
			}
			createRepayPlan.setAppayDate(appayDate);

			createRepayPlanList.add(createRepayPlan);

			LOG.info("调用外联接口生成还款计划接口 [BusSentServiceImpl] updateRepaymentPlan method appId:"
					+ appId
					+ "|准备接口传递的数据|"
					+ createRepayPlan.getAppId()
					+ "|"
					+ createRepayPlan.getIdentityId()
					+ "|"
					+ createRepayPlan.getWaresName());
		}

		LOG.info("调用外联接口生成还款计划接口[generateRepaymentNotices]开始...");
		FrameResp<List<CreateRepayPlanRespDto>> createRepayPlanRespDtoList = busLoanAfService
				.createRepayPlan(createRepayPlanDto);
		LOG.info("调用外联接口生成还款计划接口[createRepayPlan]完毕...");
		if (null != createRepayPlanRespDtoList
				&& null != createRepayPlanRespDtoList.getHead()) {
			LOG.info("调用外联接口生成还款计划接口[generateRepaymentNotices]返回retCode="
					+ createRepayPlanRespDtoList.getHead().getCode()
					+ " ,retMsg="
					+ createRepayPlanRespDtoList.getHead().getMsg());
		}

		if (null != createRepayPlanRespDtoList
				&& null != createRepayPlanRespDtoList.getData()
				&& createRepayPlanRespDtoList.getData().size() > 0) {

			List<BusLnApp> updateLnAppList = new ArrayList<BusLnApp>();
			List<BusSentLog> busSentLogList = new ArrayList<BusSentLog>();
			for (int i = 0; i < createRepayPlanRespDtoList.getData().size(); i++) {
				CreateRepayPlanRespDto repaymentNoticeResult = createRepayPlanRespDtoList
						.getData().get(i);
				String isRepaymentSuccess = "failure";
				switch (repaymentNoticeResult.getCode()) {
				case "000000":
					isRepaymentSuccess = "success";
					break;
				case "800001":
					isRepaymentSuccess = "success";
					break;
				default:
					break;
				}
				Long busid = Long.parseLong(repaymentNoticeResult.getAppId());
				if (!appIdBusIdMap.containsKey(busid)) {
					String strid = StringUtil.substringBetween(
							repaymentNoticeResult.getMsg(), "工单编号为：[", "]");
					if (StringUtil.isNumeric(strid)) {
						busid = Long.parseLong(strid);
					}
				}
				if (appIdBusIdMap.containsKey(busid)) {
					LOG.info("[BusSentServiceImpl] 调用外联接口生成还款计划接口  updateRepaymentPlan method 接口返回BUS为:"
							+ busid);
					BusLnApp app = appIdBusIdMap.get(busid);
					//  生成还款计划后再更新50状态
					if ("success".equals(isRepaymentSuccess)) {
						busLnAppService
								.updateAppStatus(app.getId(), "32", "50");
						LOG.info("[BusSentServiceImpl] 调用外联接口生成还款计划接口   updateRepaymentPlan method 更新状态完成...");
					}

					BusLnApp updateLnApp = new BusLnApp();
					updateLnApp.setId(app.getId());
					updateLnApp.setIsRepaymentSuccess(isRepaymentSuccess);

					updateLnAppList.add(updateLnApp);

					//  记录操作日志
					BusSentLog sentLog = new BusSentLog();
					sentLog.setLnAppId(app.getId());
					sentLog.setBusType("3");// 3
					// 生成还款计划(50->isRepaymentSuccess)
					if ("success".equals(isRepaymentSuccess)) {
						sentLog.setState("1");
					} else {
						sentLog.setState("2");
					}
					sentLog.setReturnCode(repaymentNoticeResult.getCode());
					sentLog.setErrorCode(repaymentNoticeResult.getCode());
					sentLog.setErrorMsg(repaymentNoticeResult.getMsg());
					sentLog.setUpdateTime(new Date());
					sentLog.setRecordType("1");
					sentLog.setErrorMsg(StringUtil.substring(
							sentLog.getErrorMsg(), 0, 50));
					busSentLogList.add(sentLog);
					appIdMap.put(appIdList.get(i), true);
				} else {
					BusSentLog sentLog = new BusSentLog();
					sentLog.setBusType("3");// 3 生成还款计划(50->isRepaymentSuccess)
					if ("success".equals(isRepaymentSuccess)) {
						sentLog.setState("1");
					} else {
						sentLog.setState("2");
					}
					sentLog.setReturnCode(repaymentNoticeResult.getCode());
					sentLog.setErrorCode(repaymentNoticeResult.getCode());
					sentLog.setErrorMsg(repaymentNoticeResult.getMsg());
					sentLog.setUpdateTime(new Date());
					sentLog.setRecordType("1");
					sentLog.setErrorMsg(StringUtil.substring(
							sentLog.getErrorMsg(), 0, 50));
					logerrList.add(sentLog);
					LOG.error("调用外联接口生成还款计划接口[BusSentServiceImpl] updateRepaymentPlan method 接口返回无效BUS_ID: "
							+ busid);
				}
			}

			int i = 0;
			int j = 0;
			for (Map.Entry<Long, Boolean>  appIdEntry : appIdMap.entrySet()) {
				if (!appIdEntry.getValue()) {
					BusSentLog sentLog = logerrList.get(j);
					sentLog.setLnAppId(appIdList.get(i));
					busSentLogList.add(sentLog);
					j++;
				}
				i++;
			}

			if (updateLnAppList.size() > 0) {
				busLnAppMapper.updateList(updateLnAppList);
			}
			if (busSentLogList.size() > 0) {
				busSentLogMapper.insertList(busSentLogList);
			}
		}
		LOG.info("调用外联接口生成还款计划接口[generateRepaymentNotices]Complete...");
	}

	/**
	 * 直接调用北京生成还款计划接口
	 * 
	 * @param waresListMap
	 * @param busLnAppList
	 * @param RepaymentNoticelist
	 * @param appIdBusIdMap
	 * @param appIdMap
	 * @param appIdList
	 * @param logerrList
	 */
	private void directInvokeBJCreateLoanService(
			Map<Long, List<String>> waresListMap, List<BusLnApp> busLnAppList,
			List<RepaymentNoticeModel> RepaymentNoticelist,
			Map<Long, BusLnApp> appIdBusIdMap, Map<Long, Boolean> appIdMap,
			List<Long> appIdList, List<BusSentLog> logerrList) {
		// ==================读取工单信息列表==================
		for (BusLnApp lnApp : busLnAppList) {
			String busAppId = lnApp.getBusAppid();
			Long appId = lnApp.getId();
			if (StringUtil.isNotBlank(busAppId)) {
				appIdBusIdMap.put(Long.parseLong(busAppId), lnApp);
			}
			appIdMap.put(appId, false);
			appIdList.add(appId);

			// Mid Evan 2016-06-07增加商品信息推送
			RepaymentNoticeModel repaymentNoticeModel = new RepaymentNoticeModel();
			repaymentNoticeModel.setAppId(busAppId);
			// Mid Evan 2016-01-29 帮卡ID字段不管代扣和自主都传个1(易宝==>快付通)
			repaymentNoticeModel.setIdentityId("1");
			repaymentNoticeModel.setWaresName(StringUtil.join(
					waresListMap.get(appId), ","));

			// 2017-02-10 增加三个字段:还款类型, 虚拟账号,借款类型
			String repaymentType = lnApp.getRepaymentType();
			String selfRepayAccount = lnApp.getSelfRepayAccount();
			String loanType = lnApp.getLoanType();
			// Date signTime = lnApp.getSignTime();//合同签订日期
			Date createContTime = lnApp.getCreateContTime(); // 合同生成时间
			// Date woBuildTime = lnApp.getWoBuildTime();//工单申请日期

			if (StringUtil.isNotBlank(repaymentType)) {
				if ("2".equals(repaymentType)) {
					repaymentNoticeModel.setRepType("1");
				}
				if ("1".equals(repaymentType)) {
					repaymentNoticeModel.setRepType("3");
				}
			}
			repaymentNoticeModel.setFrmcod(selfRepayAccount);
			if (StringUtil.isNotBlank(loanType)) {
				if ("POS".equals(loanType)) {
					repaymentNoticeModel.setCreditLoanType("2");
				}
				// 20170329 leimeng 新增AGR农机贷
				if ("AGR".equals(loanType)) {
					repaymentNoticeModel.setCreditLoanType("2");
				}
				if ("CASH".equals(loanType)) {
					repaymentNoticeModel.setCreditLoanType("1");
				}
			}

			String appayDate = "";
			// 2017-2-28 增加一个字段:合同申请日期
			if (createContTime != null) {
				appayDate = DateUtils.formatDate(createContTime, "yyyy-MM-dd");
			} else {
				LnAppStatuschangelog log = lnAppStatuschangelogMapper
						.selectByAppId(appId);
				if (log != null) {
					Date createdon = log.getCreatedon();
					appayDate = DateUtils.formatDate(createdon, "yyyy-MM-dd");
				}
			}
			repaymentNoticeModel.setAppayDate(appayDate);

			RepaymentNoticelist.add(repaymentNoticeModel);

			LOG.info("调用北京生成还款计划WebService接口 [BusSentServiceImpl] updateRepaymentPlan method appId:"
					+ appId + "|准备接口传递的数据|" + repaymentNoticeModel.getAppId()
					+ "|" + repaymentNoticeModel.getIdentityId() + "|"
					+ repaymentNoticeModel.getWaresName());
		}

		CnLoanService cnLoanService = LoanClientCXF.createCnLoanService();
		TransHead transHead = new TransHead();
		transHead.setSourceClient("1");
		
		LOG.info("调用北京生成还款计划WebService接口 [BusSentServiceImpl] updateRepaymentPlan method "
				+ "准备调用接口[generateRepaymentNotices]开始,  transHead = "+getJsonString(transHead)
				+"       <-参数分割->    RepaymentNoticelist="+getJsonString(RepaymentNoticelist));
		
		TransModel tran = cnLoanService.generateRepaymentNotices(transHead,
				RepaymentNoticelist);
		LOG.info("调用北京生成还款计划WebServicec完毕...");
		if (null != tran && null != tran.getTransHead()) {
			LOG.info("调用北京生成还款计划WebService接口[generateRepaymentNotices]返回retCode="
					+ tran.getTransHead().getRetCode() + " ,retMsg="
					+ tran.getTransHead().getRetMsg());
		}
		List result = tran.getTransBody().getEntity();

		if (null != result && result.size() > 0) {

			List<BusLnApp> updateLnAppList = new ArrayList<BusLnApp>();
			List<BusSentLog> busSentLogList = new ArrayList<BusSentLog>();
			for (int i = 0; i < result.size(); i++) {
				RepaymentNoticeResult repaymentNoticeResult = (RepaymentNoticeResult) result
						.get(i);
				String isRepaymentSuccess = "failure";
				switch (repaymentNoticeResult.getCode()) {
				case "000000":
					isRepaymentSuccess = "success";
					break;
				case "800001":
					isRepaymentSuccess = "success";
					break;
				default:
					break;
				}
				Long busid = Long.parseLong(repaymentNoticeResult.getAppId());
				if (!appIdBusIdMap.containsKey(busid)) {
					String strid = StringUtil.substringBetween(
							repaymentNoticeResult.getMsg(), "工单编号为：[", "]");
					if (StringUtil.isNumeric(strid)) {
						busid = Long.parseLong(strid);
					}
				}
				// BusLnApp app = busLnAppMapper.selectByBusAppId(busid);
				if (appIdBusIdMap.containsKey(busid)) {
					LOG.info("调用北京生成还款计划WebService接口  [BusSentServiceImpl] updateRepaymentPlan method 接口返回BUS为:"
							+ busid);
					BusLnApp app = appIdBusIdMap.get(busid);
					//  生成还款计划后再更新50状态
					if ("success".equals(isRepaymentSuccess)) {
						// String tradeNo = "B38";
						busLnAppService
								.updateAppStatus(app.getId(), "32", "50");
						LOG.info("调用北京生成还款计划WebService接口 [BusSentServiceImpl] updateRepaymentPlan method 更新状态完成...");
					}

					BusLnApp updateLnApp = new BusLnApp();
					updateLnApp.setId(app.getId());
					updateLnApp.setIsRepaymentSuccess(isRepaymentSuccess);

					// busLnAppMapper.updateByPrimaryKeySelective(updateLnApp);
					updateLnAppList.add(updateLnApp);

					//  记录操作日志
					BusSentLog sentLog = new BusSentLog();
					sentLog.setLnAppId(app.getId());
					sentLog.setBusType("3");// 3
											// 生成还款计划(50->isRepaymentSuccess)
					if ("success".equals(isRepaymentSuccess)) {
						sentLog.setState("1");
					} else {
						sentLog.setState("2");
					}
					sentLog.setReturnCode(repaymentNoticeResult.getCode());
					sentLog.setErrorCode(repaymentNoticeResult.getCode());
					sentLog.setErrorMsg(repaymentNoticeResult.getMsg());
					sentLog.setUpdateTime(new Date());
					sentLog.setRecordType("1");
					// busSentLogMapper.insertSelective(sentLog);
					sentLog.setErrorMsg(StringUtil.substring(
							sentLog.getErrorMsg(), 0, 50));
					busSentLogList.add(sentLog);
					appIdMap.put(appIdList.get(i), true);
				} else {
					BusSentLog sentLog = new BusSentLog();
					sentLog.setBusType("3");// 3 生成还款计划(50->isRepaymentSuccess)
					if ("success".equals(isRepaymentSuccess)) {
						sentLog.setState("1");
					} else {
						sentLog.setState("2");
					}
					sentLog.setReturnCode(repaymentNoticeResult.getCode());
					sentLog.setErrorCode(repaymentNoticeResult.getCode());
					sentLog.setErrorMsg(repaymentNoticeResult.getMsg());
					sentLog.setUpdateTime(new Date());
					sentLog.setRecordType("1");
					sentLog.setErrorMsg(StringUtil.substring(
							sentLog.getErrorMsg(), 0, 50));
					logerrList.add(sentLog);
					LOG.error("[调用北京生成还款计划WebService接口 BusSentServiceImpl] updateRepaymentPlan method 接口返回无效BUS_ID: "
							+ busid);
					// busSysErrorLogService.saveError("[BusSentServiceImpl] updateRepaymentPlan method 接口返回无效BUS_ID: "
					// + busid);
				}
			}

			int i = 0;
			int j = 0;
			for (Map.Entry<Long, Boolean>  appIdEntry : appIdMap.entrySet()) {
				
				if (!appIdEntry.getValue()) {
					BusSentLog sentLog = logerrList.get(j);
					sentLog.setLnAppId(appIdList.get(i));
					busSentLogList.add(sentLog);
					j++;
				}
				i++;
			}

			if (updateLnAppList.size() > 0) {
				busLnAppMapper.updateList(updateLnAppList);
			}
			if (busSentLogList.size() > 0) {
				busSentLogMapper.insertList(busSentLogList);
			}
		}
		
		LOG.info("调用北京生成还款计划WebService接口[generateRepaymentNotices]...");
	}

	private String getJsonString(Object object) {
		String  result = "";
		if(null != object){
			try {
				result =  JSONObject.toJSONString(object);
			} catch (Exception e) {
				LOG.info("BusSentServiceImpl  getJsonString   happen object = ["+object+"]      error", e);
			}
			
		}
		return result;
	}
	
	
	/**
	 * 关闭工单
	 * @param busAppId
	 * @param causeDesc
	 * @return
	 */
	public Result closeBusLnApp(String busAppId, String causeDesc) {
		Result result = new Result();
		//是否直连北京接口开关 Y:调北京 N:调外联
		String busLinkSwitch = PropertyUtils.getConfig("bus","com.hm.bus.direct.link.switch");
		LOG.info("[BusHandleServiceImpl] method closeBusLnApp com.hm.bus.direct.link.switch" +busLinkSwitch);
		if("Y".equals(busLinkSwitch)){
			//直接调用北京接口
			result=closeBusBjLnApp(busAppId, causeDesc);
		}else if("N".equals(busLinkSwitch)){
			//调用外联接口
			result=closeBusEipLnApp(busAppId, causeDesc);
		}
		return result;
	}
	
	/**
	 * 关闭工单(调用北京) 
	 * @param busAppId
	 * @param causeDesc
	 * @return
	 */
	public Result closeBusBjLnApp(String busAppId, String causeDesc){
		LOG.info("[BusSentServiceImpl] closeBusBjLnApp method begin...");
		Result result = new Result();
		try {
			BusLnApp lnApp = busLnAppMapper.selectByBusAppId(Long.parseLong(busAppId));
			if (lnApp == null) {
				result.setSuccess(false);
				result.error("BUS工单号输入有误");
				return result;
			}
			Long lnAppId = lnApp.getId();
			String productId = busLnAppMapper.selectBusProductId(lnAppId);

			LnAppColsedInfo bean = new LnAppColsedInfo();
			bean.setAppId(lnApp.getId());
			bean.setCreateTime(new Date());
			bean.setOperatorby("SYSTEM");

			LnAppClosedBody lnAppClosedBody = new LnAppClosedBody();
			lnAppClosedBody.setAppId(busAppId);
			lnAppClosedBody.setProductId(productId);
			lnAppClosedBody.setProductIdKey("JFCN");
			lnAppClosedBody.setSaleChannel("1028");
			lnAppClosedBody.setSaleChannelKey("JFCN");

			// 加密的RSA公钥
			String RSAPUBLICKEY = PropertyUtils.getConfig("bus", "http.intf.encrypt.rsa");
			String RSQPRIVATEKEY = PropertyUtils.getConfig("bus", "http.intf.decode.rsa");
			String LNAPP_COLSED_URL = PropertyUtils.getConfig("bus", "http.lnapp.end.loan");

			Map<String, Object> paramMap = new HashMap<String, Object>();
			// 组装请求头
			LnAppJsonHead head = new LnAppJsonHead();
			String key = CryptoUtils.randChar(10);
			String prikey = CryptoUtils.publicEnc(key, RSAPUBLICKEY);
			head.setSecretKey(prikey);
			head.setIsSecret(1);// 1、密码校验 2、无密码校验
			String jsonHead = com.alibaba.fastjson.JSONObject.toJSONString(head);

			String jsonContent = com.alibaba.fastjson.JSONObject.toJSONString(lnAppClosedBody);

			LOG.info("[BusSentServiceImpl] updateRepaymentPlan method 随机密钥" + key + " ,发送报文:" + jsonContent);
			jsonContent = CryptoUtils.getEncString(jsonContent, key);
			paramMap.put("jsonHead", jsonHead);
			paramMap.put("jsonContent", jsonContent);

			LOG.info("lnAppClosed 请求参数：" + paramMap.toString());

			String resultStr = HttpUtils.URLPostResult(LNAPP_COLSED_URL, paramMap, "UTF-8");

			LOG.info("lnAppClosed 请求返回的结果：" + resultStr);
			com.alibaba.fastjson.JSONObject object = JSON.parseObject(resultStr);
			String resp_code = object.getString("resp_code");
			String resp_msg = object.getString("resp_msg");

			if (resp_code.equals("0000")) {
				lnAppColsedInfoMapper.insert(bean);
				result.setSuccess(true);
				result.setMessage("工单关闭成功！");
			} else {
				result.setSuccess(false);
				result.error(resp_msg);
			}
		} catch (Exception e) {
			LOG.error("[BusSentServiceImpl] updateRepaymentPlan method 工单关闭失败！ ", e);
			busSysErrorLogService.saveError("[BusSentServiceImpl] updateRepaymentPlan method 工单关闭失败！ ", e);
		}

		LOG.info("[BusSentServiceImpl] closeBusBjLnApp method end... ");
		return result;
	}

	
	/**
	 * 关闭工单(调用外联接口) #1182
	 * @param busAppId
	 * @param causeDesc
	 * @return
	 */
	public Result closeBusEipLnApp(String busAppId, String causeDesc){
		LOG.info("[BusSentServiceImpl] closeBusEipLnApp method begin...");
		Result result = new Result();
		try {
			BusLnApp lnApp = busLnAppMapper.selectByBusAppId(Long.parseLong(busAppId));
			if (lnApp == null) {
				result.setSuccess(false);
				result.error("BUS工单号输入有误");
				return result;
			}
			Long lnAppId = lnApp.getId();
			String productId = busLnAppMapper.selectBusProductId(lnAppId);

			LnAppColsedInfo bean = new LnAppColsedInfo();
			bean.setAppId(lnApp.getId());
			bean.setCreateTime(new Date());
			bean.setOperatorby("SYSTEM");
			CloseLoanAppReqDto inputParamDto = new CloseLoanAppReqDto();
			inputParamDto.setAppId(String.valueOf(lnApp.getId()));//工单编号,参考数据字典可结束工单状态
			inputParamDto.setSaleChannel("1028"); //渠道号
			inputParamDto.setSaleChannelKey("JFCN");//渠道唯一码
			inputParamDto.setProductId(productId);//产品ID
			inputParamDto.setProductIdKey("JFCN");//产品唯一码
			inputParamDto.setCallerSysCode("HM");//调用系统代码
			inputParamDto.setCallerSysName("超级管理系统");//调用系统中文名称
			
			LOG.info("calling eip-interface closeLoan interface inputParamDto:"+JSONObject.toJSONString(inputParamDto));
			
			//调用外联 关闭工单接口
			FrameResp outputParamDto = busLoanAfService.closeLoanApp(inputParamDto);
			LOG.info("calling eip-interface closeLoan interface outputParamDto:"+JSONObject.toJSONString(outputParamDto));
			
			if(outputParamDto!=null){
				int code = outputParamDto.getHead().getCode();
				String msg = outputParamDto.getHead().getMsg();
				if(code==200){//返回成功
					lnAppColsedInfoMapper.insert(bean);
					result.setSuccess(true);
					result.setMessage("工单关闭成功！");
				}else{
					result.setSuccess(false);
					result.error(msg);
				}
			}
			
		} catch (Exception e) {
			LOG.error("[BusSentServiceImpl] updateRepaymentPlan method 工单关闭失败！ ", e);
			busSysErrorLogService.saveError("[BusSentServiceImpl] updateRepaymentPlan method 工单关闭失败！ ", e);
		}
	
		LOG.info("[BusSentServiceImpl] closeBusEipLnApp method end... ");
		return result;
	}

	@Override
	public String selectByLnAppId(String busAppId) {
		List<BusLnAppBatchMapping> batchMappingList = busLnAppBatchMappingMapper
				.selectByLnAppId(busAppId + "");
		if (batchMappingList != null && batchMappingList.size() > 0) {
			return batchMappingList.get(0).getBatchNo();
		}
		return "";
	}
}
