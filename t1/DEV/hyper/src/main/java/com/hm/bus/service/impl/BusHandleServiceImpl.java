package com.hm.bus.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.eip.common.model.FrameResp;
import com.eip.service.biz.bjbus.inf.BusLoanAfService;
import com.eip.service.biz.bjbus.model.CommonObject;
import com.eip.service.biz.bjbus.model.FactorAndCashLoanToBusReqDto;
import com.eip.service.biz.bjbus.model.FactorAndCashLoanToBusRespDto;
import com.eip.service.biz.bjbus.model.LoanApp;
import com.eip.service.biz.bjbus.model.RecordLoanAttach;
import com.eip.service.biz.bjbus.model.RecordLoanContact;
import com.eip.service.biz.bjbus.model.TLoanAccount;
import com.gep.core.lock.RedisDisLock;
import com.gep.core.lock.RedisDisLockPool;
import com.gep.core.util.RedisUtils;
import com.gep.core.util.StringUtil;
import com.gep.util.PropertyUtils;
import com.hm.bus.constants.BusMapping;
import com.hm.bus.constants.BusReturn;
import com.hm.bus.constants.LoanAppHelper;
import com.hm.bus.dao.BusBatchInfoMapper;
import com.hm.bus.dao.BusLnAppBatchMappingMapper;
import com.hm.bus.dao.BusLnAppCustInfoMapper;
import com.hm.bus.dao.BusLnAppMapper;
import com.hm.bus.dao.BusLnContractInfoMapper;
import com.hm.bus.dao.BusSentLogMapper;
import com.hm.bus.dao.CustAccFyMapper;
import com.hm.bus.dao.LnAppCashWhiteCustMapper;
import com.hm.bus.dao.LnAppContractInfoMapper;
import com.hm.bus.dao.LnAttachInfoMapper;
import com.hm.bus.dao.LnRiskFicoResultMapper;
import com.hm.bus.module.BusBatchInfo;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.module.BusLnAppCustInfo;
import com.hm.bus.module.BusLnContractInfo;
import com.hm.bus.module.BusSentLog;
import com.hm.bus.module.CustAccFy;
import com.hm.bus.module.LnAppCashWhiteCust;
import com.hm.bus.module.LnAppContractInfo;
import com.hm.bus.module.LnAttachInfo;
import com.hm.bus.service.BusCallQuotaService;
import com.hm.bus.service.BusCallWanCardService;
import com.hm.bus.service.BusHandleService;
import com.hm.bus.service.BusLnAppService;
import com.hm.bus.service.BusSysErrorLogService;
import com.hm.bus.util.BusBaseInfoHelper;
import com.hm.bus.util.Result;
import com.hm.bus.webservice.cnloan.TransHead;
import com.plm.model.AppReplayPlanVo;
import com.plm.model.RPCResult;
import com.plm.model.RpcException;
import com.plm.service.RepayPlanService;

/**
 * Created by jiufu on 2017/1/12.
 */
@Service
public class BusHandleServiceImpl implements BusHandleService {

	private static final Logger LOG = Logger.getLogger(BusHandleServiceImpl.class);

	@Autowired
	private BusLnContractInfoMapper busLnContractInfoMapper;
	@Autowired
	private BusLnAppService busLnAppService;
	@Autowired
	private BusLnAppMapper busLnAppMapper;
	@Autowired
	private BusLnAppCustInfoMapper busLnAppCustInfoMapper;
	@Autowired
	private LnRiskFicoResultMapper lnRiskFicoResultMapper;
	@Autowired
	private BusSentLogMapper busSentLogMapper;
	@Autowired
	private BusLnAppBatchMappingMapper busLnAppBatchMappingMapper;
	@Autowired
	private LnAttachInfoMapper lnAttachInfoMapper;
	@Autowired
	private LnAppContractInfoMapper lnAppContractInfoMapper;
	@Autowired
	private LnAppCashWhiteCustMapper lnAppCashWhiteCustMapper;
	@Autowired
	private BusSysErrorLogService busSysErrorLogService;
	@Autowired
	private BusBatchInfoMapper busBatchInfoMapper;
	@Autowired
	private RepayPlanService repayPlanService;
	@Autowired
	private ThreadPoolTaskExecutor threadPoolTaskExecutor;
	@Autowired
	private ThreadPoolTaskExecutor busThreadPoolTaskExecutor36To32;
	@Autowired
	private RedisDisLockPool redisDisLockPool;
	@Autowired
	private CustAccFyMapper custAccFyMapper;
	@Autowired
	private BusCallWanCardService busCallWanCardService;
	@Autowired
	private BusCallQuotaService busCallQuotaService;
	@Autowired
	private BusLoanAfService busLoanAfService;

	/**
	 * 推bus
	 */
	@Override
	public void handleBus(String lnAppAndBatchNO) {
		String butSwitch = PropertyUtils.getConfig("bus", "com.hm.bus.posdbl2bl.switch");
		String[] lnAppAndBatchNOs = lnAppAndBatchNO.split("@");
		if (StringUtils.isEmpty(lnAppAndBatchNO) || lnAppAndBatchNOs == null || lnAppAndBatchNOs.length < 2) {
			LOG.info("推bus从redis消费的数据错误：" + lnAppAndBatchNO);
			return;
		}
		String lnApp = lnAppAndBatchNOs[0];
		String batchNo = lnAppAndBatchNOs[1];
		LOG.info("[BusHandleServiceImpl] handleBus method 捕获到待推BUS工单:" + lnApp);
		BusLnApp busLnApp = busLnAppMapper.selectByPrimaryKey(Long.valueOf(lnApp));
		busLnApp.setBatchNO(batchNo);

		//Future<Result> fa = null;
		if (busLnApp != null && "36".equals(busLnApp.getAppState()) && StringUtils.isEmpty(busLnApp.getBusAppid())) {

			// 获取额度系统模型号
			String wancardSwitch = PropertyUtils.getConfig("bus", "com.hm.bus.wancard.switch"); // 调用额度系统的开关
			String modelValue = null;
			if ("Y".equals(wancardSwitch)) {
				modelValue = busCallWanCardService.callWanCardService(busLnApp);
				busLnApp.setAmountSystemSerial(modelValue);
			}
			// 调用sc额度接口（圈存额度）
			String scquotaSwitch = PropertyUtils.getConfig("bus", "com.hm.bus.scquota.switch"); // 调用sc圈存额度系统的开关
			LOG.info("[BusHandleServiceImpl] handleBus method " + lnApp + "SC额度开关状态是:" + scquotaSwitch);
			Boolean scquotaValue = false;

			if ("Y".equals(scquotaSwitch)) {
				scquotaValue = busCallQuotaService.callQuotaService(busLnApp);
			}

			// Sc额度接口返回的值是true或者scquotaSwitch开关关掉时
			if (scquotaValue || !"Y".equals(scquotaSwitch)) {
				String json = JSON.toJSONString(busLnApp);

				// LOG.info("[busCallWanCardServiceImpl] callWanCardService
				// method bus工单相关信息:"+json);
				if ("POS".equalsIgnoreCase(busLnApp.getLoanType())
						&& "BL".equalsIgnoreCase(busLnApp.getCapitalType())) {
					LOG.info("[BusHandleServiceImpl] handleBus method 开始调用POS贷保理" + lnApp);
					busThreadPoolTaskExecutor36To32.submit(new CallableThreadPosBL(json, lnApp, false));
				} else if ("POS".equalsIgnoreCase(busLnApp.getLoanType())
						&& "DBL".equalsIgnoreCase(busLnApp.getCapitalType())) {
					if ("Y".equals(butSwitch)) {
						String dbl2blSwitch = RedisUtils.getObject("BUS_POS_DBL2BL_SWITCH");
						if ("Y".equals(dbl2blSwitch)) {
							LOG.info("[BusHandleServiceImpl] handleBus method [反保理使用保理推送]开始调用POS贷保理" + lnApp);
							busLnApp.setCapitalType("BL");
							json = JSON.toJSONString(busLnApp);
							busThreadPoolTaskExecutor36To32.submit(new CallableThreadPosBL(json, lnApp, true));
						} else {
							LOG.info("[BusHandleServiceImpl] handleBus method 开始调用POS贷反保理" + lnApp);
							busThreadPoolTaskExecutor36To32.submit(new CallableThreadPosDBL(json, lnApp));
						}
					} else {
						LOG.info("[BusHandleServiceImpl] handleBus method 开始调用POS贷反保理" + lnApp);
						busThreadPoolTaskExecutor36To32.submit(new CallableThreadPosDBL(json, lnApp));
					}
				} else if ("CASH".equalsIgnoreCase(busLnApp.getLoanType())
						&& "DBL".equalsIgnoreCase(busLnApp.getCapitalType())) {
					LOG.info("[BusHandleServiceImpl] handleBus method 开始调用现金贷" + lnApp);
					busThreadPoolTaskExecutor36To32.submit(new CallableThreadCash(json, lnApp));
					// add by leimeng 20170329 新增农机贷
				} else if ("AGR".equalsIgnoreCase(busLnApp.getLoanType())
						&& "DBL".equalsIgnoreCase(busLnApp.getCapitalType())) {
					LOG.info("[BusHandleServiceImpl] handleBus method 开始调用AGR农机贷" + lnApp);
					busThreadPoolTaskExecutor36To32.submit(new CallableThreadPosDBL(json, lnApp));
				}
			} else {
				LOG.info("[BusHandleServiceImpl] handleBus method 调用sc额度接口失败！APPID:" + lnApp + "，不推BUS！");
			}

		}
	}

	/**
	 * 现金贷推bus
	 */
	@Override
	public Result handleBusCash(String lnApp) throws Exception {
		BusLnApp busLnApp = JSON.parseObject(lnApp, BusLnApp.class);
		Result checkResult = checkLnAppCash(busLnApp);
		if (checkResult == null || !checkResult.isSuccess()) {
			// 失败则更新，退出
			return checkResult;
		}
		FactorAndCashLoanToBusReqDto reqDto = new FactorAndCashLoanToBusReqDto();
		LoanApp lonApp = new LoanApp();

		Result custInfoResult = getBusLnAppCustInfoCash(busLnApp);
		if (!custInfoResult.isSuccess()) {
			return custInfoResult;
		}
		BusLnAppCustInfo busLnAppCustInfo = (BusLnAppCustInfo) custInfoResult.getT();

		Result checkCustResult = checkLnAppCustCash(busLnAppCustInfo, lonApp, busLnApp);
		if (checkCustResult != null && !checkCustResult.isSuccess()) {
			return checkCustResult;
		}

		Result result = setLonAppCash(busLnApp, lonApp, busLnAppCustInfo);
		if (!result.isSuccess()) {
			return result;
		}
		ArrayList<RecordLoanContact> recordLoanContacts = new ArrayList<RecordLoanContact>();
		Result contractResult = setContractInfoDBL(lonApp, busLnApp, busLnAppCustInfo, recordLoanContacts);
		if (!contractResult.isSuccess()) {
			return contractResult;
		}
		ArrayList<RecordLoanAttach> recordLoanAttaches = new ArrayList<RecordLoanAttach>();
		Result attachInfoResult = getRecordLoanAttachCash(lonApp, busLnApp.getId(), recordLoanAttaches);
		if (!attachInfoResult.isSuccess()) {
			return attachInfoResult;
		}
		ArrayList<CommonObject> modelBusinessData = new ArrayList<CommonObject>();
		Result bussinessResult = getModelBussinessData(lonApp, busLnApp, modelBusinessData);
		if (!bussinessResult.isSuccess()) {
			return bussinessResult;
		}

		Result extendResult = getExtendMap(lonApp, busLnApp);
		if (!extendResult.isSuccess()) {
			return extendResult;
		}
		reqDto.setLoanApp(lonApp);
		reqDto.setRecordLoanContact(recordLoanContacts);
		reqDto.setRecordLoanAttach(recordLoanAttaches);
		reqDto.setModelBusinessData(modelBusinessData);
		Result busResult = sendPosCash36To32(busLnApp, reqDto);

		/*
		 * //写log List<BusLnAppBatchMapping> batchMappingList =
		 * busLnAppBatchMappingMapper.selectByLnAppId(busLnApp.getId()+"");
		 * insertBusSendLog(busResult, busLnApp,
		 * batchMappingList==null?null:batchMappingList.get(0));
		 */
		return busResult;
	}

	/**
	 * 反保理推bus
	 */
	@Override
	public Result handleBusPosDBL(String lnApp) throws Exception {
		BusLnApp busLnApp = JSON.parseObject(lnApp, BusLnApp.class);
		Result checkResult = checkLnAppDBL(busLnApp);
		if (checkResult == null || !checkResult.isSuccess()) {
			// 失败则更新，退出
			return checkResult;
		}
		FactorAndCashLoanToBusReqDto reqDto = new FactorAndCashLoanToBusReqDto();
		LoanApp lonApp = new LoanApp();

		// add 20170313 设置额度系统模型编号
		lonApp.setChannelModelValue(busLnApp.getAmountSystemSerial());
		LOG.info("设置额度系统模型编号getChannelModelValue=" + lonApp.getChannelModelValue());
		Result custInfoResult = getBusLnAppCustInfoDBL(busLnApp);
		if (!custInfoResult.isSuccess()) {
			return custInfoResult;
		}
		BusLnAppCustInfo busLnAppCustInfo = (BusLnAppCustInfo) custInfoResult.getT();

		Result checkCustResult = checkLnAppCustDBL(busLnAppCustInfo, lonApp, busLnApp);
		if (!checkCustResult.isSuccess()) {
			return checkCustResult;
		}

		Result result = setLonAppDBL(busLnApp, lonApp, busLnAppCustInfo);
		if (!result.isSuccess()) {
			return result;
		}
		ArrayList<TLoanAccount> tLonAccountList = new ArrayList<TLoanAccount>();
		Result accountResult = setTlonAccountList(lonApp, busLnApp, tLonAccountList);
		if (!accountResult.isSuccess()) {
			return accountResult;
		}

		// 20170330 增加农机贷不传递保费控制
		if ("POS".equals(busLnApp.getLoanType())) {
			ArrayList<CommonObject> modelBusinessData = new ArrayList<CommonObject>();
			setPremium(lonApp, busLnApp, modelBusinessData);
			reqDto.setModelBusinessData(modelBusinessData);
		}
		ArrayList<RecordLoanContact> recordLoanContact = new ArrayList<RecordLoanContact>();
		Result contractResult = setContractInfoDBL(lonApp, busLnApp, busLnAppCustInfo, recordLoanContact);
		if (!contractResult.isSuccess()) {
			return contractResult;
		}

		LOG.info("推bus的实体类lonApp=" + lonApp);
		reqDto.setLoanApp(lonApp);
		reqDto.settLonAccountList(tLonAccountList);
		reqDto.setRecordLoanContact(recordLoanContact);
		Result busResult = sendPosDBL36To32(busLnApp, reqDto);

		/*
		 * //写log List<BusLnAppBatchMapping> batchMappingList =
		 * busLnAppBatchMappingMapper.selectByLnAppId(busLnApp.getId()+"");
		 * insertBusSendLog(busResult, busLnApp,
		 * batchMappingList==null?null:batchMappingList.get(0));
		 */
		return busResult;
	}

	/**
	 * 保理推bus
	 */
	@Override
	public Result handleBusPosBL(String lnApp, boolean isswitch) {
		BusLnApp busLnApp = JSON.parseObject(lnApp, BusLnApp.class);
		if(busLnApp == null){
			return new Result(false, "handleBusPosBL " + BusReturn.APP_NULL);
		}
		Result checkResult = checkLnApp(busLnApp);
		if (checkResult == null || !checkResult.isSuccess()) {
			// 失败则更新，退出
			return checkResult;
		}
		FactorAndCashLoanToBusReqDto reqDto = new FactorAndCashLoanToBusReqDto();
		LoanApp lonApp = new LoanApp();
		// add 20170313 设置额度系统模型编号
		lonApp.setChannelModelValue(busLnApp.getAmountSystemSerial());
		LOG.info("start handleBusPosBL推bus设置额度系统模型编号ChannelModelValue=" + lonApp.getChannelModelValue());
		Result custInfoResult = getBusLnAppCustInfo(busLnApp);
		if (!custInfoResult.isSuccess()) {
			return custInfoResult;
		}
		BusLnAppCustInfo busLnAppCustInfo = (BusLnAppCustInfo) custInfoResult.getT();

		Result checkCustResult = checkLnAppCust(busLnAppCustInfo, lonApp, busLnApp);
		if (!checkCustResult.isSuccess()) {
			return checkCustResult;
		}

		setLonAppBL(busLnApp, lonApp, busLnAppCustInfo, isswitch);
		Result extendMapResult = setExtendMap(busLnApp, lonApp, busLnAppCustInfo);
		if (!extendMapResult.isSuccess()) {
			return extendMapResult;
		}
		ArrayList<RecordLoanContact> recordLoanContacts = new ArrayList<RecordLoanContact>();
		Result contractResult = setContractInfo(lonApp, busLnApp, busLnAppCustInfo, recordLoanContacts);
		if (!contractResult.isSuccess()) {
			return contractResult;
		}
		reqDto.setLoanApp(lonApp);
		reqDto.setRecordLoanContact(recordLoanContacts);
		LOG.info("end handleBusPosBL推bus的 lonApp=" + lonApp);
		Result busResult = sendPosBl36To32(busLnApp, reqDto);

		BusLnApp record = new BusLnApp();
		record.setId(busLnApp.getId());
		String msg = busResult.getMessage();
		record.setBusRetInfo(msg.length() > 60 ? msg.substring(0, 60) : msg);
		// record.setBusRetInfo(busResult.getMessage());
		record.setSendBusTime(new Date());
		busLnAppMapper.updateByPrimaryKeySelective(record);
		return busResult;
	}

	/**
	 * 现金贷36状态发送BUS至32
	 * @param busLnApp BUS工单号
	 * @param reqDto  外联请求对象
	 * @return Result
	 * @throws Exception 异常
	 */
	private Result sendPosCash36To32(BusLnApp busLnApp, FactorAndCashLoanToBusReqDto reqDto) throws Exception {
		//UUID uuid = UUID.randomUUID();
		//Date currentDate = new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//String startDate = sdf.format(currentDate);
		//sdf = new SimpleDateFormat("HH:mm:ss");
		//String startTime = sdf.format(currentDate);

		// TransHead transHead = new TransHead();
		// transHead.setSourceClient("1");
		// transHead.setTransSerialNo(uuid.toString().replace("-", ""));
		// transHead.setTransType("11301");
		// transHead.setTransExeDate(startDate);// 交易日期
		// transHead.setTransExeTime(startTime);// 交易时间
		LoanApp lonApp = reqDto.getLoanApp();
		LOG.info("[CL]调用外联北京接口[APP_ID:" + busLnApp.getId() + "][TransBody]".concat(JSON.toJSONString(lonApp)));
		/**********************************
		 * TransHead END
		 ************************************/
		LOG.info("[CL]调用外联接口[cashAndAntiFactorToBus]开始...[APP_ID:" + busLnApp.getId() + "]");
		// 交叉贷WSDL
		// String cashwsdl = PropertyUtils.getConfig("bus",
		// "wsdl.cash.loan.path");
		// LOG.info("[CL]调用外联接口[PATH]".concat(cashwsdl));
		// URL wsdlURL = new URL(cashwsdl);
		// QName SERVICE_NAME = new QName("microloan", "loanService");
		// LoanService_Service ss = new LoanService_Service(wsdlURL,
		// SERVICE_NAME);
		// LoanService cashLoanService = ss.getLoanServiceImplPort();
		// TransModel recordLoan = cashLoanService.recordLoan(transHead,
		// lonApp);
		reqDto.setCallerSysCode("HM");
		reqDto.setCallerSysName("超级管理系统");
		LOG.info("推bus--36-32现金贷入参：" + JSON.toJSONString(reqDto));
		FrameResp<FactorAndCashLoanToBusRespDto> dto = busLoanAfService.cashAndAntiFactorToBus(reqDto);
		LOG.info("推bus--36-32现金贷返回参数：" + JSON.toJSONString(dto));
		LOG.info("[CL]调用外联接口[cashAndAntiFactorToBus]完毕...[APP_ID:" + busLnApp.getId() + "]");

		if (dto.getHead() != null) {
			LOG.info("[CL]调用外联接口[cashAndAntiFactorToBus]...[APP_ID:" + busLnApp.getId() + "]...返回retCode="
					+ dto.getHead().getCode() + " ,retMsg=" + dto.getHead().getMsg());
			if (dto.getHead().getCode() == 200) {
				// List<Object> tb = recordLoan.getTransBody().getEntity();
				// lonApp =(LonApp) tb.get(0);
				lonApp = dto.getData().getLoanApp().get(0);
				if ("50".equals(busLnApp.getAppState()) || "70".equals(busLnApp.getAppState())
						|| "80".equals(busLnApp.getAppState())) {
					LOG.info("[CL]调用外联接口[非36状态，不予以更新]");
					return new Result(true, BusReturn.SUCCESS);
				}
				LOG.info("[CL]调用外联接口[APPID]".concat(busLnApp.getId().toString()).concat(" [BUSID]")
						.concat(lonApp.getAppId()));
				busLnApp.setBusAppid(lonApp.getAppId());
				BusLnApp record = new BusLnApp();
				record.setId(busLnApp.getId());
				record.setAppState("32");
				record.setAppStatusName("待放款");
				record.setBusAppid(lonApp.getAppId());
				record.setSendBusTime(new Date());
				record.setBusRetInfo("success");
				busLnAppMapper.updateByPrimaryKeySelective(record);

				BusLnApp busLnApp1 = busLnAppMapper.selectByPrimaryKey(busLnApp.getId());
				busLnAppService.updateAppStatus(busLnApp.getId(), "36", "32");

				Result re = new Result(true, BusReturn.SUCCESS);
				re.setStatusCode(Integer.valueOf(dto.getHead().getCode()));
				return re;
			} else {
				BusLnApp record = new BusLnApp();
				record.setId(busLnApp.getId());
				record.setSendBusTime(new Date());
				String msg = dto.getHead().getMsg();
				record.setBusRetInfo(msg.length() > 60 ? msg.substring(0, 60) : msg);
				busLnAppMapper.updateByPrimaryKeySelective(record);

				Result re = new Result(false, dto.getHead().getMsg());
				re.setStatusCode(Integer.valueOf(dto.getHead().getCode()));
				return re;
			}
		}
		return new Result(false, BusReturn.BUS_EXCEPTION);
	}

	private Result sendPosDBL36To32(BusLnApp busLnApp, FactorAndCashLoanToBusReqDto reqDto) throws Exception {
		// TransHead transHead = getTransHeadDBL();
		LoanApp lonApp = reqDto.getLoanApp();
		LOG.info("[RF]调用外联接口[TransBody]".concat(JSON.toJSONString(lonApp)));
		// ********************************** TransHead END
		// ************************************//*
		LOG.info("[RF]调用外联接口[cashAndAntiFactorToBus]开始...[APP_ID:" + busLnApp.getId() + "]");
		// 玖富信贷系统WSDL
		// String cashwsdl = PropertyUtils.getConfig("bus",
		// "wsdl.cash.loan.path");
		// LOG.info("[RF]调用外联接口[PATH]".concat(cashwsdl));
		// URL wsdlURL = new URL(cashwsdl);
		// QName SERVICE_NAME = new QName("microloan", "loanService");
		// LoanService_Service ss = new LoanService_Service(wsdlURL,
		// SERVICE_NAME);
		// LoanService cashLoanService = ss.getLoanServiceImplPort();
		// TransModel recordLoan = cashLoanService.recordLoan(transHead,
		// lonApp);
		reqDto.setCallerSysCode("HM");
		reqDto.setCallerSysName("超级管理系统");
		LOG.info("推bus--36-32反保理入参：" + JSON.toJSONString(reqDto));
		FrameResp<FactorAndCashLoanToBusRespDto> dto = busLoanAfService.cashAndAntiFactorToBus(reqDto);
		LOG.info("推bus--36-32反保理返回参数：" + JSON.toJSONString(dto));
		LOG.info("[RF]调用外联接口[cashAndAntiFactorToBus]完毕...[APP_ID:" + busLnApp.getId() + "]");
		if (dto.getHead() != null) {
			LOG.info("[RF]调用外联接口[cashAndAntiFactorToBus]...[APP_ID:" + busLnApp.getId() + "]...返回retCode="
					+ dto.getHead().getCode() + " ,retMsg=" + dto.getHead().getMsg());
			if (dto.getHead().getCode() == 200) {
				// List<Object> tb = recordLoan.getTransBody().getEntity();
				lonApp = dto.getData().getLoanApp().get(0);
				if ("50".equals(busLnApp.getAppState()) || "70".equals(busLnApp.getAppState())
						|| "80".equals(busLnApp.getAppState())) {
					LOG.info("[RF]调用外联接口[非36状态，不予以更新]");
					return new Result(true, BusReturn.SUCCESS);
				}
				LOG.info("[RF]调用外联接口[APPID]".concat(busLnApp.getId().toString()).concat(" [BUSID]")
						.concat(lonApp.getAppId()));
				busLnApp.setBusAppid(lonApp.getAppId());
				BusLnApp record = new BusLnApp();
				record.setId(busLnApp.getId());
				record.setAppState("32");
				record.setSendBusTime(new Date());
				record.setAppStatusName("待放款");
				record.setBusAppid(lonApp.getAppId());
				record.setBusRetInfo("success");
				busLnAppMapper.updateByPrimaryKeySelective(record);

				BusLnApp busLnApp1 = busLnAppMapper.selectByPrimaryKey(busLnApp.getId());
				busLnAppService.updateAppStatus(busLnApp.getId(), "36", "32");

				Result re = new Result(true, BusReturn.SUCCESS);
				re.setStatusCode(Integer.valueOf(dto.getHead().getCode()));
				return re;
			} else {
				BusLnApp record = new BusLnApp();
				record.setId(busLnApp.getId());
				record.setSendBusTime(new Date());
				String msg = dto.getHead().getMsg();
				record.setBusRetInfo(msg.length() > 60 ? msg.substring(0, 60) : msg);
				busLnAppMapper.updateByPrimaryKeySelective(record);

				Result re = new Result(false, dto.getHead().getMsg());
				re.setStatusCode(Integer.valueOf(dto.getHead().getCode()));
				return re;
			}
		}
		return new Result(false, BusReturn.BUS_EXCEPTION);
	}

	private TransHead getTransHeadDBL() {
		UUID uuid = UUID.randomUUID();
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String startDate = sdf.format(currentDate);
		sdf = new SimpleDateFormat("HH:mm:ss");
		String startTime = sdf.format(currentDate);

		TransHead transHead = new TransHead();
		transHead.setSourceClient("1");
		transHead.setTransSerialNo(uuid.toString().replace("-", ""));
		transHead.setTransType("11301");
		transHead.setTransExeDate(startDate);// 交易日期
		transHead.setTransExeTime(startTime);// 交易时间
		return transHead;
	}

	private Result sendPosBl36To32(BusLnApp busLnApp, FactorAndCashLoanToBusReqDto reqDto) {
		SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sd2 = sdfm.format(busLnApp.getSignTime());
		LoanApp lonApp = reqDto.getLoanApp();
		lonApp.setAppayDate(sd2);
		/*
		 * lonApp.setCreator(CurrentUser.currentUser() != null ?
		 * CurrentUser.currentUser().getUserId() + "|" +
		 * CurrentUser.currentUser().getUserName() : "auto");
		 */
		lonApp.setCreator("auto");
		lonApp.setRepayBranch("北京银行支行");

		// LoanService loanServiceImplPort = LoanClientCXF.createLoanService();
		// TransHead transHead = new TransHead();
		// transHead.setSourceClient("1");

		LOG.info("调用外联接口[recordLoan]开始...");
		// TransModel recordLoan = loanServiceImplPort.recordLoan(transHead,
		// lonApp);
		reqDto.setCallerSysCode("HM");
		reqDto.setCallerSysName("超级管理系统");
		reqDto.setLoanApp(lonApp);
		LOG.info("推bus--36-32保理入参：" + JSON.toJSONString(reqDto));
		FrameResp<FactorAndCashLoanToBusRespDto> resp = busLoanAfService.factorToBus(reqDto);
		LOG.info("调用外联接口[recordLoan]完毕...");
		// System.out.println(JsonUtil.object2Json(lonApp));
		LOG.info("推bus--36-32保理返回参数：" + JSON.toJSONString(resp));
		if (resp.getHead() != null) {
			LOG.info("调用外联接口[recordLoan]返回retCode=" + resp.getHead().getCode() + " ,retMsg=" + resp.getHead().getMsg());
			if (resp.getHead().getCode() == 200) {
				List<LoanApp> tb = resp.getData().getLoanApp();
				LoanApp lonAppInfo = (LoanApp) tb.get(0);
				String Appid = lonAppInfo.getAppId();
				busLnApp.setBusAppid(Appid);

				BusLnApp record = new BusLnApp();
				record.setId(busLnApp.getId());
				record.setBusAppid(Appid);
				busLnAppMapper.updateByPrimaryKeySelective(record);

				BusLnApp busLnApp1 = busLnAppMapper.selectByPrimaryKey(busLnApp.getId());
				busLnAppService.updateAppStatus(busLnApp.getId(), "36", "32");

				Result re = new Result(true, BusReturn.SUCCESS);
				re.setStatusCode(Integer.valueOf(resp.getHead().getCode()));
				return re;
			} else {
				/*
				 * BusLnApp record = new BusLnApp();
				 * record.setId(busLnApp.getId()); String msg =
				 * recordLoan.getTransHead().getRetMsg();
				 * record.setBusRetInfo(msg.length()>60?msg.substring(0,
				 * 60):msg); busLnAppMapper.updateByPrimaryKeySelective(record);
				 */

				Result re = new Result(false, resp.getHead().getMsg());
				re.setStatusCode(Integer.valueOf(resp.getHead().getCode()));
				return re;
			}
		}
		return new Result(false, BusReturn.BUS_EXCEPTION);
	}

	private Result getBusLnAppCustInfoCash(BusLnApp busLnApp) {
		try {
			BusLnAppCustInfo busLnAppCustInfo = null;
			String custInfoStr = RedisUtils.getObject(BusReturn.LN_APP_CUST_INFO_REDIS_KEY, busLnApp.getId() + "");
			if (StringUtils.isEmpty(custInfoStr)) {
				List<BusLnAppCustInfo> list = busLnAppCustInfoMapper.selectByAppId(busLnApp.getId() + "");
				if (list == null || list.isEmpty()) {
					return new Result(false, BusReturn.CUST_INFO_NULL);
				}
				busLnAppCustInfo = list.get(0);
			} else {
				busLnAppCustInfo = JSON.parseObject(custInfoStr, BusLnAppCustInfo.class);
			}
			Result result = new Result(true);
			result.setT(busLnAppCustInfo);
			return result;
		}catch(NullPointerException e){
			LOG.info("[BusHandleServiceImpl] getBusLnAppCustInfoCash method 查询客户信息，出现空指针异常:APPID:" +busLnApp.getId()+ e);
			return new Result(false, BusReturn.CUST_INFO_NULL);
		} catch (Exception e) {
			LOG.info("[BusHandleServiceImpl] getBusLnAppCustInfoCash method 查询客户信息，出现异常:APPID:" +busLnApp.getId()+ e);
			return new Result(false, BusReturn.CUST_INFO_NULL);
		}
	}

	private Result getBusLnAppCustInfoDBL(BusLnApp busLnApp) {
		BusLnAppCustInfo busLnAppCustInfo = null;
		String custInfoStr = RedisUtils.getObject(BusReturn.LN_APP_CUST_INFO_REDIS_KEY, busLnApp.getId() + "");
		if (StringUtils.isEmpty(custInfoStr)) {
			List<BusLnAppCustInfo> list = busLnAppCustInfoMapper.selectByAppId(busLnApp.getId() + "");
			if (list == null || list.size() == 0) {
				return new Result(false, BusReturn.CUST_INFO_NULL);
			}
			busLnAppCustInfo = list.get(0);
		} else {
			busLnAppCustInfo = JSON.parseObject(custInfoStr, BusLnAppCustInfo.class);
		}
		Result result = new Result(true);
		result.setT(busLnAppCustInfo);
		return result;
	}

	private Result getBusLnAppCustInfo(BusLnApp busLnApp) {
		BusLnAppCustInfo busLnAppCustInfo = null;
		String custInfoStr = RedisUtils.getObject(BusReturn.LN_APP_CUST_INFO_REDIS_KEY, busLnApp.getId() + "");
		if (StringUtils.isEmpty(custInfoStr)) {
			List<BusLnAppCustInfo> list = busLnAppCustInfoMapper.selectByAppId(busLnApp.getId() + "");
			if (list == null || list.size() == 0) {
				return new Result(false, BusReturn.CUST_INFO_NULL);
			}
			busLnAppCustInfo = list.get(0);
		} else {
			busLnAppCustInfo = JSON.parseObject(custInfoStr, BusLnAppCustInfo.class);
		}
		Result result = new Result(true);
		result.setT(busLnAppCustInfo);
		return result;
	}

	private Result setContractInfoDBL(LoanApp lonApp, BusLnApp busLnApp, BusLnAppCustInfo custInfo,
			List<RecordLoanContact> recordLoanContacts) {
		RecordLoanContact recordLoanContact = null;
		List<BusLnContractInfo> lnContractInfos = busLnContractInfoMapper.selectByAppId(busLnApp.getId());
		if (null == lnContractInfos || 0 >= lnContractInfos.size()) {
			return new Result(false, "联系人为空");
		}
		for (BusLnContractInfo lnContractInfo : lnContractInfos) {
			recordLoanContact = new RecordLoanContact();
			recordLoanContact.setContactName(lnContractInfo.getContractName()); // 姓名(必填)
			recordLoanContact.setContactRelation(BusMapping.contactRelation.get(lnContractInfo.getContractProperty())); // 与客户关系(必填)
			recordLoanContact.setContactPhone(lnContractInfo.getContractPhone()); // 手机号(必填)
			recordLoanContact.setContactCertId(""); // 身份证号码
			recordLoanContact.setContactSex(BusMapping.sex.get(lnContractInfo.getCustomerSex()));// 性别
			// lonApp.getRecordLoanContact().add(recordLoanContact);
			recordLoanContacts.add(recordLoanContact);
		}
		return new Result(true);
	}

	/**
	 * 月保费
	 * 
	 * @param lonApp
	 * @param busLnApp
	 * @return
	 */
	private Result setPremium(LoanApp lonApp, BusLnApp busLnApp, List<CommonObject> modelBusinessData) {
		CommonObject commonObject = new CommonObject();
		commonObject.setModelId(26l);

		// CommonObject.PropertyMap propertyMap = new
		// CommonObject.PropertyMap();
		// CommonObject.PropertyMap.Entry entry = new
		// CommonObject.PropertyMap.Entry();

		HashMap<String, Object> propertyMap = new HashMap<>();
		// entry.setKey("extendFl4"); //月保费费率(必填)
		// entry.setValue("0");

		propertyMap.put("extendFl4", "0");
		if (null != busLnApp.getMonthlyPremiumRate() && busLnApp.getBuyInsurance() == true) {
			BigDecimal val = busLnApp.getMonthlyPremiumRate().divide(new BigDecimal(100));
			// entry.setValue(val.toString());
			propertyMap.put("extendFl4", val.toString());
		}
		// propertyMap.getEntry().add(entry);
		commonObject.setPropertyMap(propertyMap);
		// lonApp.getModelBusinessData().add(commonObject);
		modelBusinessData.add(commonObject);
		return new Result(true);
	}

	private Result setContractInfo(LoanApp lonApp, BusLnApp busLnApp, BusLnAppCustInfo custInfo,
			List<RecordLoanContact> recordLoanContacts) {
		// List<RecordLoanContact> recordLoanContacts = new
		// ArrayList<RecordLoanContact>();
		List<BusLnContractInfo> lnContractInfos = busLnContractInfoMapper.selectByAppId(busLnApp.getId());
		for (BusLnContractInfo lnContractInfo : lnContractInfos) {
			RecordLoanContact recordLoanContact = new RecordLoanContact();
			recordLoanContact.setContactName(lnContractInfo.getContractName());
			if (lnContractInfo.getContractSex() != null) {
				recordLoanContact.setContactSex(BusMapping.sex.get(lnContractInfo.getContractSex().toString()));
			}
			if (lnContractInfo.getContractProperty() != null) {
				recordLoanContact
						.setContactRelation(BusMapping.contactRelation.get(lnContractInfo.getContractProperty()));
			}
			recordLoanContact.setContactPhone(lnContractInfo.getContractPhone());
			recordLoanContacts.add(recordLoanContact);
		}
		// 判断是否已婚
		if ("2".equals(custInfo.getMarry())) {
			RecordLoanContact record = new RecordLoanContact();
			record.setContactName(custInfo.getParterName());
			record.setContactPhone(custInfo.getMateMobel());
			record.setContactSex(BusMapping.sex.get("2"));
			record.setContactRelation("F1003");
			record.setContactType("F5002");
			recordLoanContacts.add(record);
		}
		// lonApp.setRecordLoanContact(recordLoanContacts);
		// bus 新加
		// 多个参数代码没有完全确定
		lonApp.setSaleChannel("1028");
		lonApp.setInterestRule("B2002");
		lonApp.setInstCode("110830");
		if (custInfo.getCustomerSex() == null) {
			return new Result(false, BusReturn.CUSTOMER_SEX_NULL);
		}
		lonApp.setCustomerSex(BusMapping.sex.get(custInfo.getCustomerSex()));
		lonApp.setCertType("B1301");
		lonApp.setReceiveName(busLnApp.getCustomerName());
		lonApp.setReceiveBranch("1000");

		String cnnameStr = RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY, "cnname");
		JSONObject cnname = JSON.parseObject(cnnameStr);
		lonApp.setProductName(cnname.getString("confValue"));// 不确定

		lonApp.setAppLoanType("B1701");// 不确定
		lonApp.setOrgCode("JFB");
		lonApp.setIsSignContact("2");
		lonApp.setIsCalTotalAmount("1");
		lonApp.setIsPayPlan("1");
		lonApp.setLoanTarget("2");
		lonApp.setRepaymentInitiator("1");
		lonApp.setIsRepayMent("1");
		lonApp.setIsOpenCard("2");
		lonApp.setInitStats("7");
		lonApp.setAppayAmt(busLnApp.getLoanMoney());
		// #285 随手记推BUS接口开发---反保理模式
		if ("DBL".equals(busLnApp.getCapitalType())) {
			lonApp.setRepayAccount("");
			lonApp.setRepayAccountName("");

			String baoliAccStr = RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY, "baoliAcc");
			JSONObject baoliAcc = JSON.parseObject(baoliAccStr);
			lonApp.setInstLoanCard(baoliAcc.getString("confValue"));

			String baoliAccNameStr = RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY, "baoliAccName");
			JSONObject baoliAccName = JSON.parseObject(baoliAccNameStr);
			lonApp.setInstLoanCardName(baoliAccName.getString("confValue"));
			lonApp.setIsOpenCard("1"); // 是否开户
		}
		SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sd2 = sdfm.format(busLnApp.getSignTime());
		lonApp.setAppayDate(sd2);
		lonApp.setCreator("auto");// 此处得不到当然用户
		lonApp.setRepayBranch("北京银行支行");
		return new Result(true);
	}

	// 反保理
	private Result setLonAppDBL(BusLnApp busLnApp, LoanApp lonApp, BusLnAppCustInfo custInfo) {

		String busProductId = busLnApp.getBusProductId();
		if (StringUtils.isEmpty(busProductId)) {
			String busProductStr = RedisUtils.getObject(BusReturn.BUS_PRODUCT_REDIS_KEY, busLnApp.getId() + "");// bus产品ID
			if (StringUtils.isEmpty(busProductStr)) {
				List<Map<String, Object>> list = busLnAppMapper.selectBusProductIdById(busLnApp.getId() + "");
				if (list == null || list.size() == 0) {
					return new Result(false, BusReturn.BUS_PRODUCT_ID_NULL);
				}
				busProductId = list.get(0).get("busProductId").toString();
			} else {
				JSONObject busProduct = JSON.parseObject(busProductStr);
				busProductId = busProduct.getString("busProductId");
			}
		}

		lonApp.setProductId(busProductId);// BUS产品ID(必填)
		lonApp.setInstCode("110830"); // 所属机构(必填)
		lonApp.setSaleChannel("1028"); // 销售渠道
		lonApp.setBorrowerType("B154001");// 超能贷前进件借款人类型统一传B154001
		lonApp.setAppLoanType("B1706"); // 贷款类型(必填)
		lonApp.setOldAppId(busLnApp.getId().toString()); // 超能系统工单编号(必填)
		// lonApp.setProductId("301");
		lonApp.setCustomerName(busLnApp.getCustomerName()); // 客户名称(必填)
		lonApp.setCustomerSex(BusMapping.sex.get(custInfo.getCustomerSex())); // 性别(必填)
		// lonApp.setCertId(busLnApp.getCardId()); //身份证号(必填)
		// #809 Hyper系统推送BUS身份证兼容性优化
		lonApp.setCertId(busLnApp.getCardId().toUpperCase()); // 身份证号(必填)
		lonApp.setCertType("B1301"); // 证件类型(必填)
		lonApp.setQq(custInfo.getQqCode()); // QQ号码
		lonApp.setPhone(busLnApp.getMobile()); // 客户手机号(必填)
		lonApp.seteMail(custInfo.getEmaill().trim()); // 邮箱(必填)
		lonApp.setMarry(BusMapping.marry.get(custInfo.getMarry())); // 婚姻状况(必填)
		lonApp.setDegree(BusMapping.degree.get(custInfo.getDegree())); // 学历(必填)

		BusBaseInfoHelper.settingHouseHoldBaseInfo(custInfo.getHouseholdProv(), custInfo.getHouseholdCity(), custInfo.getHouseholdTown(), lonApp);

		lonApp.setRegistAddressRoad(custInfo.getHouseholdStr());

		BusBaseInfoHelper.settingLiveBaseInfo(custInfo.getLiveProv(), custInfo.getLiveCity(), custInfo.getLiveTown(), lonApp);

		lonApp.setLiveaddressRoad(custInfo.getLiveStr()); // 住宅所在道路信息(必填)
		lonApp.setLoanPurpose("F1112"); // 贷款用途(必填)

		/****************************** 取信用等级 **************************************/

		String riskCode = null;
		String scoreCode = null;
		String riskFicoStr = RedisUtils.getObject(BusReturn.LN_RISK_FICO_RESULT_REDIS_KEY, busLnApp.getId() + "");
		if (StringUtils.isEmpty(riskFicoStr)) {
			List<Map<String, Object>> list = lnRiskFicoResultMapper.selectByAppId(busLnApp.getId() + "");
			if (list == null || list.size() == 0) {
				return new Result(false, "riskCode,scoreCode is null");
			}
			riskCode = list.get(0).get("grade").toString();
			scoreCode = list.get(0).get("score").toString();
		} else {
			JSONObject riskFico = JSON.parseObject(riskFicoStr);
			riskCode = riskFico.getString("grade");// entity.getGrade();
			scoreCode = riskFico.getString("score");// entity.getScore();
		}

		if (StringUtils.isBlank(riskCode)) {
			return new Result(false, "riskCode is null");
		}
		if (StringUtils.isBlank(scoreCode)) {
			return new Result(false, "scoreCode is null");
		}
		// 兼容系统自动评分
		String riskGradeVal = "";
		String scoreVal = "";
		String jjCodeStr1 = "";
		String jjCodeStr2 = "";
		if (riskCode.length() == 1) {
			riskGradeVal = riskCode;
		} else {
			jjCodeStr1 = RedisUtils.getObject(BusReturn.JJ_CODE_REDIS_KEY, riskCode);
			JSONObject jjCode = JSON.parseObject(jjCodeStr1);
			riskGradeVal = jjCode.getString(riskCode);
		}
		if (scoreCode.length() >= 1 && scoreCode.length() <= 4) {
			scoreVal = scoreCode;
		} else {
			// 查询信用评分
			jjCodeStr2 = RedisUtils.getObject(BusReturn.JJ_CODE_REDIS_KEY, scoreCode);
			JSONObject jjCode = JSON.parseObject(jjCodeStr2);
			scoreVal = jjCode.getString(scoreCode);
		}

		if (StringUtils.isBlank(riskGradeVal)) {
			return new Result(false, "riskCode is null");
		}
		if (StringUtils.isBlank(scoreVal)) {
			return new Result(false, "scoreCode is null");
		}
		lonApp.setRiskGrade(riskGradeVal); // 信用等级评级
		lonApp.setScore(new BigDecimal(scoreVal)); // 信用评分

		lonApp.setDuty(BusMapping.duty.get(custInfo.getDuty())); // 职务级别(必填)
		lonApp.setIntustry(custInfo.getIndustryType()); // 所属行业(必填)
		lonApp.setInterestRule("B2002"); // 计息规则(必填)
		lonApp.setCompanyType(BusMapping.cashUnit.get(custInfo.getUnittype())); // 单位性质(必填)
		lonApp.setCompany(custInfo.getUnitname()); // 工作单位(必填)

		BusBaseInfoHelper.settingCompanyBaseInfo(custInfo.getUnitAddre(), custInfo.getUnitCity(), custInfo.getUnitTown(), lonApp);

		lonApp.setCompanyAdressRoad(custInfo.getUnitStr()); // 单位道路信息(必填)
		lonApp.setCompanyPhone(custInfo.getUnitPhone()); // 单位电话(必填)
		lonApp.setApproveSuggestAmt(busLnApp.getLoanMoney());// 审批金额(必填)
		lonApp.setAppayAmt(busLnApp.getLoanMoney()); // 申请金额(必填)
		lonApp.setTimeLimit(busLnApp.getPeriods().toString()); // 申请期限(必填)
		lonApp.setLoanTerm(busLnApp.getPeriods().toString()); // 审批期限(必填)

		// 301,302,357增加申请时间
		String busProductIdStr = PropertyUtils.getConfig("bus", "com.hm.bus.appayDate.productId");// 传参申请时间的bus产品id
		LOG.info("[BusHandleServiceImpl] setLonAppDBL method bus反保理" + busLnApp.getId().toString() + "的busProductId:"
				+ lonApp.getProductId());
		LOG.info("[BusHandleServiceImpl] setLonAppDBL method bus反保理" + busLnApp.getId().toString() + "传参申请时间的bus产品id:"
				+ busProductIdStr);
		String[] busProductIds = busProductIdStr.split(",");
		List<String> busProductIdsList = Arrays.asList(busProductIds);
		if (busProductIdsList.contains(lonApp.getProductId())) {
			BusBatchInfo bf = busBatchInfoMapper.selectByPrimaryKey(busLnApp.getBatchNO());
			if (bf != null && bf.getAppayDate() != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String ad = sdf.format(bf.getAppayDate());
				lonApp.setAppayDate(ad); // 申请时间
				LOG.info("[BusHandleServiceImpl] setLonAppDBL method bus反保理" + busLnApp.getId().toString() + "的申请时间:"
						+ lonApp.getAppayDate());
			}

		}

		lonApp.setApproveDstRate("0"); // 审批利率(必填)
		if (null != busLnApp.getInterestRate()) {
			BigDecimal rateDe = new BigDecimal(busLnApp.getInterestRate() + "");
			BigDecimal rateDe2 = rateDe.divide(new BigDecimal("100"));
			lonApp.setApproveDstRate(rateDe2.toString());
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// String signDate = sdf.format(busLnApp.getSignTime());
		// lonApp.setSignDate(signDate); //签约时间(必填)
		// 2017-05-04修改signDate为合同生成时间
		String createContTime = sdf.format(busLnApp.getCreateContTime());
		// #858 修改signDate为合同生成时间
		lonApp.setSignDate(createContTime); // 合同生成时间
		// ReplayPlanQuery replayPlanQuery = new ReplayPlanQuery();
		// replayPlanQuery.setIdentityCard(busLnApp.getCardId());// 身份证号码
		/*
		 * RPCResult rpcResult = null; try { rpcResult =
		 * repayPlanService.queryAppRepayPlanList("HYPER", busLnApp.getCardId(),
		 * "", ""); } catch (RpcException e) { e.printStackTrace();
		 * LOG.error("反保理 setLonAppDBL" + busLnApp.getId() + "查询是否结清异常:" +
		 * e.getMessage()); } List<AppReplayPlanVo> appReplayPlanList = (List)
		 * rpcResult.getData(); if (rpcResult != null && rpcResult.getData() !=
		 * null && appReplayPlanList != null && appReplayPlanList.size() != 0) {
		 * for (AppReplayPlanVo plan : appReplayPlanList) {
		 * if(!plan.isSettled()) { // 如果未结清signDate为申请时间 String woBuildTime =
		 * sdf.format(busLnApp.getWoBuildTime());
		 * lonApp.setSignDate(woBuildTime); // 工单申请时间 break; } } }
		 */
		LOG.info("[BusHandleServiceImpl] setLonAppDBL method bus反保理" + busLnApp.getId().toString() + "的signDate:"
				+ lonApp.getSignDate());
		lonApp.setRegistAddress(lonApp.getRegistAddressProvince() + lonApp.getRegistAddressCity()
				+ lonApp.getRegistAddressDistinct() + lonApp.getRegistAddressRoad()); // 户口所在地（必填）
		lonApp.setLiveAddress(lonApp.getLiveaddressProvince() + lonApp.getLiveaddressCity()
				+ lonApp.getLiveaddressDistinct() + lonApp.getLiveaddressRoad()); // 住宅所在地（必填）
		lonApp.setCompanyAddress(lonApp.getCompanyAdressprovince() + lonApp.getCompanyAdressCity()
				+ lonApp.getCompanyAdressDist() + lonApp.getCompanyAdressRoad()); // 单位所在地（必填）

		// 2017-03-30 增加农机贷借款人职业
		if ("AGR".equals(busLnApp.getLoanType())) {
			String careerVal = custInfo.getCareerType();
			if (StringUtils.isBlank(careerVal)) {
				return new Result(false, "CareerType is null");
			}
			// lonApp.setCareer(careerVal);
		}
		// LonApp.ExtendMap.Entry career = new LonApp.ExtendMap.Entry();
		// career.setKey(LoanAppHelper.career);
		// career.setValue(careerVal);
		// extendMap.getEntry().add(career);

		/*
		 * //联系人信息 //lonApp = getRecordLoanContact(lonApp, busLnApp.getId()); if
		 * (null == lonApp) {
		 * LOG.info("[RF] RecordLoanContact is Null,[APP_ID]"); return
		 * "[RF] RecordLoanContact is Null"; }
		 */
		return new Result(true);
	}

	// 报文-获取附件信息
	private Result getRecordLoanAttachCash(LoanApp lonApp, Long appId, List<RecordLoanAttach> recordLoanAttaches) {
		RecordLoanAttach recordLoanAttach = null;
		LnAttachInfo lnAttachInfo = new LnAttachInfo();
		lnAttachInfo.setAppId(appId);
		List<LnAttachInfo> lnAttachInfos = lnAttachInfoMapper.list(lnAttachInfo);
		if (null == lnAttachInfos || 0 >= lnAttachInfos.size()) {
			new Result(false, "附件信息为空");
		}
		for (LnAttachInfo entity : lnAttachInfos) {
			recordLoanAttach = new RecordLoanAttach();
			recordLoanAttach.setFileId(entity.getOssId()); // 文件编号(必填)--填写的是云空间地址
			recordLoanAttach.setAttachName(entity.getAttachName()); // 文件名称(必填)
			// lonApp.getRecordLoanAttach().add(recordLoanAttach);
			recordLoanAttaches.add(recordLoanAttach);
		}
		return new Result(true);
	}

	/*
	 * 报文-获取扩展信息 appId:工单号码
	 */
	private Result getModelBussinessData(LoanApp lonApp, BusLnApp busLnApp, List<CommonObject> modelBusinessData)
			throws RpcException {
		LnAppContractInfo lnAppContractInfo = new LnAppContractInfo();
		lnAppContractInfo.setAppId(busLnApp.getId());
		List<LnAppContractInfo> lnAppContractInfoList = lnAppContractInfoMapper.list(lnAppContractInfo);
		if (null == lnAppContractInfoList || 0 >= lnAppContractInfoList.size()) {
			return new Result(false, "工单合同计算信息为空");
		}
		String repayDayStr = lnAppContractInfoList.get(0).getRepyDay(); // 还款日
		LOG.info("[CL]业务信息[工单号:" + busLnApp.getId() + "] [还款日:" + repayDayStr + "]");
		Long loanAmount = 0l;
		// 取授信额度
		LnAppCashWhiteCust lnAppCashWhiteCust = lnAppCashWhiteCustMapper.queryByCardId(busLnApp.getCardId());
		if (null == lnAppCashWhiteCust) {
			return new Result(false, "授信额度为空");
		}
		loanAmount = lnAppCashWhiteCust.getMaxLoanAmount().longValue();
		// SimpleDateFormat sdf = new SimpleDateFormat("dd");
		// String repayDayStr = sdf.format(app.getWoBuildTime());
		CommonObject common37 = new CommonObject();
		common37.setModelId(37L);
		HashMap<String, Object> property37 = new HashMap<>();
		// CommonObject.PropertyMap property37 = new CommonObject.PropertyMap();
		// CommonObject.PropertyMap.Entry creditAmt = new
		// CommonObject.PropertyMap.Entry();
		// creditAmt.setKey("creditAmt"); //授信额度(必填)
		// creditAmt.setValue(loanAmount.toString());
		// property37.getEntry().add(creditAmt);
		property37.put("creditAmt", loanAmount.toString());// 授信额度(必填)
		// CommonObject.PropertyMap.Entry posIsOver = new
		// CommonObject.PropertyMap.Entry();
		// ReplayPlanQuery replayPlanQuery = new ReplayPlanQuery();
		// replayPlanQuery.setIdentityCard(busLnApp.getCardId());//身份证号码

		// posIsOver.setKey("posIsOver"); //POS贷是否结清(必填)
		// posIsOver.setValue("1"); //1.是 2.否
		property37.put("posIsOver", "1");
		/*
		 * RPCResult rpcResult =
		 * repayPlanService.queryRepayPlanList(replayPlanQuery);
		 * List<AppReplayPlan> appReplayPlanList = (List)rpcResult.getData();
		 * if(rpcResult==null||rpcResult.getData()==null||appReplayPlanList==
		 * null||appReplayPlanList.size()==0) { return new Result(false,
		 * "该客户没有办理超能业务：" + busLnApp.getCardId()); } for(AppReplayPlan plan :
		 * appReplayPlanList) {
		 * if("CN1401".equalsIgnoreCase(plan.getSettleStatus())) {
		 * posIsOver.setValue("2"); //1.是 2.否 break; } }
		 */

		RPCResult rpcResult = repayPlanService.queryAppRepayPlanList("HYPER", busLnApp.getCardId(), "", "");
		List<AppReplayPlanVo> appReplayPlanlist = (List) rpcResult.getData();
		if (rpcResult == null || rpcResult.getData() == null || appReplayPlanlist == null
				|| appReplayPlanlist.size() == 0) {
			return new Result(false, "该客户没有办理超能业务：" + busLnApp.getCardId());
		}
		for (AppReplayPlanVo plan : appReplayPlanlist) {
			if (!plan.isSettled()) {
				// posIsOver.setValue("2"); //1.是 2.否
				property37.put("posIsOver", "2");
				break;
			}
		}
		// property37.getEntry().add(posIsOver);
		// CommonObject.PropertyMap.Entry posLastPayDate = new
		// CommonObject.PropertyMap.Entry();
		// posLastPayDate.setKey("posLastPayDate"); //最近POS贷还款日(必填)
		// posLastPayDate.setValue(repayDayStr);
		property37.put("posLastPayDate", repayDayStr);// 最近POS贷还款日(必填)
		// property37.getEntry().add(posLastPayDate);
		// CommonObject.PropertyMap.Entry creditLoanType = new
		// CommonObject.PropertyMap.Entry();
		// creditLoanType.setKey("creditLoanType"); //信贷类型(必填)
		// creditLoanType.setValue("2"); //1-POS(AGR),2-CASH
		property37.put("creditLoanType", "2");// 信贷类型(必填)
		// property37.getEntry().add(creditLoanType);
		common37.setPropertyMap(property37);
		// lonApp.getModelBusinessData().add(common37);
		modelBusinessData.add(common37);
		CommonObject common26 = new CommonObject();
		common26.setModelId(26L);
		HashMap<String, Object> property26 = new HashMap();
		// CommonObject.PropertyMap property26 = new CommonObject.PropertyMap();
		// CommonObject.PropertyMap.Entry signDate = new
		// CommonObject.PropertyMap.Entry();
		// signDate.setKey("signDate"); //签约时间 (必填)

		// signDate.setValue(lonApp.getAppayDate());
		// 2017-05-04更新signDate
		// String value = (String) posIsOver.getValue(); // POS贷是否结清(必填)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		/*
		 * if ("1".equals(value)) {// 如果是已结清 String createContTime =
		 * sdf.format(busLnApp.getCreateContTime());
		 * signDate.setValue(createContTime);// 传合同生成时间 } else if
		 * ("2".equals(value)) { String woBuildTime =
		 * sdf.format(busLnApp.getWoBuildTime());
		 * signDate.setValue(woBuildTime);// 传工单申请时间 }
		 */
		// #858 修改signDate为合同生成时间
		String createContTime = sdf.format(busLnApp.getCreateContTime());
		property26.put("signDate", createContTime);// 签约时间 (必填) 传合同生成时间
		// signDate.setValue(createContTime);// 传合同生成时间
		// property26.getEntry().add(signDate);
		LOG.info("[BusHandleServiceImpl] getModelBussinessData method bus现金贷" + busLnApp.getId().toString()
				+ "的signDate:" + createContTime);
		// CommonObject.PropertyMap.Entry oldAppId = new
		// CommonObject.PropertyMap.Entry();
		// oldAppId.setKey("oldAppId"); //订单编号(必填)
		// oldAppId.setValue(busLnApp.getId().toString());
		// property26.getEntry().add(oldAppId);
		property26.put("oldAppId", busLnApp.getId().toString());// 订单编号(必填)
		// CommonObject.PropertyMap.Entry repayDay = new
		// CommonObject.PropertyMap.Entry();
		// repayDay.setKey("repayDay"); //指定还款日(必填)
		// repayDay.setValue(repayDayStr);
		// property26.getEntry().add(repayDay);
		property26.put("repayDay", repayDayStr);// 指定还款日(必填)
		// CommonObject.PropertyMap.Entry extendF14 = new
		// CommonObject.PropertyMap.Entry();
		// extendF14.setKey("extendFl4"); //月保费费率(必填)
		// extendF14.setValue("0");
		property26.put("extendFl4", "0");// 月保费费率(必填)
		if (null != busLnApp.getMonthlyPremiumRate() && busLnApp.getBuyInsurance() == true) {
			BigDecimal val = busLnApp.getMonthlyPremiumRate().divide(new BigDecimal(100));
			// extendF14.setValue(val.toString());
			property26.put("extendFl4", val.toString());
		}
		// property26.getEntry().add(extendF14);
		common26.setPropertyMap(property26);
		// lonApp.getModelBusinessData().add(common26);
		modelBusinessData.add(common26);
		return new Result(true);
	}

	private Result getExtendMap(LoanApp lonApp, BusLnApp busLnApp) {
		/****************************** 取信用等级 **************************************/
		String riskGrade = null; // 信用等级
		String score = null; // 信用评分
		String riskFicoStr = RedisUtils.getObject(BusReturn.LN_RISK_FICO_RESULT_REDIS_KEY, busLnApp.getId() + "");
		if (StringUtils.isEmpty(riskFicoStr)) {
			List<Map<String, Object>> list = lnRiskFicoResultMapper.selectByAppId(busLnApp.getId() + "");
			if (list == null || list.size() == 0) {
				return new Result(false, "riskCode,scoreCode is null");
			}
			riskGrade = list.get(0).get("grade").toString();
			score = list.get(0).get("score").toString();
		} else {
			JSONObject riskFico = JSON.parseObject(riskFicoStr);
			riskGrade = riskFico.getString("grade");// entity.getGrade();
			score = riskFico.getString("score");// entity.getScore();
		}

		if (StringUtils.isBlank(riskGrade)) {
			return new Result(false, "riskCode is null");
		}
		if (StringUtils.isBlank(score)) {
			return new Result(false, "scoreCode is null");
		}

		// 兼容系统自动评分
		String riskGradeVal = "";
		String scoreVal = "";
		String jjCodeStr1 = "";
		String jjCodeStr2 = "";
		if (riskGrade.length() == 1) {
			riskGradeVal = riskGrade;
		} else {
			jjCodeStr1 = RedisUtils.getObject(BusReturn.JJ_CODE_REDIS_KEY, riskGrade);
			JSONObject jjCode = JSON.parseObject(jjCodeStr1);
			riskGradeVal = jjCode.getString(riskGrade);
		}
		if (score.length() >= 1 && score.length() <= 4) {
			scoreVal = score;
		} else {
			// 查询信用评分
			jjCodeStr2 = RedisUtils.getObject(BusReturn.JJ_CODE_REDIS_KEY, score);
			JSONObject jjCode = JSON.parseObject(jjCodeStr2);
			scoreVal = jjCode.getString(score);
		}
		/***************************************************************************/
		// LonApp.ExtendMap extendMap = new LonApp.ExtendMap();
		// lonApp.setExtendMap(extendMap);
		// LonApp.ExtendMap.Entry riskGradeEntry = new LonApp.ExtendMap.Entry();
		// riskGradeEntry.setKey("riskGrade"); //信用等级(必填)
		// riskGradeEntry.setValue(riskGradeVal);
		HashMap<String, Object> extendMap = new HashMap();
		extendMap.put("riskGrade", riskGradeVal);
		// lonApp.getExtendMap().getEntry().add(riskGradeEntry);
		// LonApp.ExtendMap.Entry scoreEntry = new LonApp.ExtendMap.Entry();
		// scoreEntry.setKey("score"); //信用评分(必填)
		// scoreEntry.setValue(scoreVal);
		// lonApp.getExtendMap().getEntry().add(scoreEntry);
		extendMap.put("score", scoreVal);
		// LonApp.ExtendMap.Entry borrowerType = new LonApp.ExtendMap.Entry();
		// borrowerType.setKey("borrowerType"); //借款人类型(必填)
		// borrowerType.setValue("B154001");//POS贷规则：超能贷前进件借款人类型统一传 B154001
		// lonApp.getExtendMap().getEntry().add(borrowerType);
		extendMap.put("borrowerType", "B154001");
		// LonApp.ExtendMap.Entry receiveAccCertType = new
		// LonApp.ExtendMap.Entry();
		// receiveAccCertType.setKey("receiveAccCertType"); //银行开户证件类型(放款)-必填
		// receiveAccCertType.setValue(lonApp.getCertType());
		// lonApp.getExtendMap().getEntry().add(receiveAccCertType);
		extendMap.put("receiveAccCertType", lonApp.getCertType());
		// LonApp.ExtendMap.Entry receiveAccOwnIdCard = new
		// LonApp.ExtendMap.Entry();
		// receiveAccOwnIdCard.setKey("receiveAccOwnIdCard"); //银行开户证件号码(放款)-必填
		// receiveAccOwnIdCard.setValue(lonApp.getCertId());
		// lonApp.getExtendMap().getEntry().add(receiveAccOwnIdCard);
		extendMap.put("receiveAccOwnIdCard", lonApp.getCertId());
		// LonApp.ExtendMap.Entry repayAccProvince = new
		// LonApp.ExtendMap.Entry();
		// repayAccProvince.setKey("repayAccProvince"); //银行开户省(还款)-必填
		// repayAccProvince.setValue(lonApp.getReceiveProvince());
		// lonApp.getExtendMap().getEntry().add(repayAccProvince);
		extendMap.put("repayAccProvince", lonApp.getReceiveProvince());
		// LonApp.ExtendMap.Entry repayAccCity = new LonApp.ExtendMap.Entry();
		// repayAccCity.setKey("repayAccCity"); //银行开户市(还款)-必填
		// repayAccCity.setValue(lonApp.getReceiveCountry());
		// lonApp.getExtendMap().getEntry().add(repayAccCity);
		extendMap.put("repayAccCity", lonApp.getReceiveCountry());
		// LonApp.ExtendMap.Entry repayAccCertType = new
		// LonApp.ExtendMap.Entry();
		// repayAccCertType.setKey("repayAccCertType");//银行开户证件类型(还款)-必填
		// repayAccCertType.setValue(lonApp.getCertType());
		// lonApp.getExtendMap().getEntry().add(repayAccCertType);
		extendMap.put("repayAccCertType", lonApp.getCertType());
		// LonApp.ExtendMap.Entry repayAccOwnIdCard = new
		// LonApp.ExtendMap.Entry();
		// repayAccOwnIdCard.setKey("repayAccOwnIdCard");//银行开户证件号码(还款)-必填
		// repayAccOwnIdCard.setValue(lonApp.getCertId());
		// lonApp.getExtendMap().getEntry().add(repayAccOwnIdCard);
		extendMap.put("repayAccOwnIdCard", lonApp.getCertId());
		lonApp.setExtendMap(extendMap);
		return new Result(true);
	}

	// 现金贷
	private Result setLonAppCash(BusLnApp busLnApp, LoanApp lonApp, BusLnAppCustInfo custInfo) {
		try{
			String busProductId = busLnApp.getBusProductId();
			if (StringUtils.isEmpty(busProductId)) {
				String busProductStr = RedisUtils.getObject(BusReturn.BUS_PRODUCT_REDIS_KEY, busLnApp.getId() + "");// bus产品ID
				if (StringUtils.isEmpty(busProductStr)) {
					List<Map<String, Object>> list = busLnAppMapper.selectBusProductIdById(busLnApp.getId() + "");
					if (list == null || list.isEmpty()) {
						return new Result(false, BusReturn.BUS_PRODUCT_ID_NULL);
					}
					busProductId = list.get(0).get("busProductId").toString();
				} else {
					JSONObject busProduct = JSON.parseObject(busProductStr);
					busProductId = busProduct.getString("busProductId");
				}
			}
			lonApp.setProductId(busProductId);// BUS产品ID(必填)
			lonApp.setCustomerName(busLnApp.getCustomerName()); // 客户名称(必填)
			lonApp.setCertId(busLnApp.getCardId()); // 证件号码(必填)
			lonApp.setApproveSuggestAmt(busLnApp.getLoanMoney());// 审批金额(必填)
			lonApp.setLoanTerm(busLnApp.getPeriods().toString()); // 审批期限(必填)
			lonApp.setApproveDstRate("0"); // 审批利率(必填)
			lonApp.setIsSupportDeduction("2");
			if (null != busLnApp.getInterestRate()) {
				BigDecimal rateDe = new BigDecimal(busLnApp.getInterestRate() + "");
				BigDecimal rateDe2 = rateDe.divide(new BigDecimal("100"));
				lonApp.setApproveDstRate(rateDe2.toString());
			}
			lonApp.setDegree(BusMapping.degree.get(custInfo.getDegree())); // 学历(必填)
			lonApp.setMarry(BusMapping.marry.get(custInfo.getMarry())); // 婚姻状况(必填)
			lonApp.setPhone(busLnApp.getMobile()); // 客户手机号(必填)
			lonApp.seteMail(custInfo.getEmaill().trim()); // 邮箱(必填)
			lonApp.setLiveaddressRoad(custInfo.getLiveStr()); // 住宅所在道路信息(必填)
			lonApp.setLoanPurpose("F1112"); // 贷款用途(必填)
			lonApp.setCompany(custInfo.getUnitname()); // 工作单位(必填)
			lonApp.setCompanyType(BusMapping.cashUnit.get(custInfo.getUnittype())); // 单位性质(必填)
			lonApp.setCompanyAdressRoad(custInfo.getUnitStr()); // 单位道路信息(必填)
			lonApp.setCompanyPhone(custInfo.getUnitPhone()); // 单位电话(必填)
			lonApp.setIntustry(custInfo.getIndustryType()); // 所属行业(必填)
			lonApp.setIsCard(BusMapping.repaymentType.get(busLnApp.getRepaymentType()));// 卡或金账户还款
			lonApp.setRepayBankCard(busLnApp.getRepaymentAcc()); // 还款银行卡号
			lonApp.setRepayOpen(busLnApp.getRepaymentBank()); // 还款银行
			lonApp.setReceiveProvince("北京"); // 收款省市
			lonApp.setReceiveCountry("北京市");// 收款市
			lonApp.setReceiveCountryCode("1000"); // 收款市编号
			lonApp.setReceiveBankCard(busLnApp.getRepaymentAcc()); // 还款银行卡号
			lonApp.setReceiveOpen(busLnApp.getRepaymentBank());
			lonApp.setRepayName(busLnApp.getCustomerName());
			lonApp.setQq(custInfo.getQqCode()); // QQ号码
	
			BusBaseInfoHelper.settingHouseHoldBaseInfo(custInfo.getHouseholdProv(), custInfo.getHouseholdCity(), custInfo.getHouseholdTown(), lonApp);

			lonApp.setRegistAddressRoad(custInfo.getHouseholdStr());// 户口所在道路地区(必填)
	
			BusBaseInfoHelper.settingLiveBaseInfo(custInfo.getLiveProv(), custInfo.getLiveCity(), custInfo.getLiveTown(), lonApp);

	
			BusBaseInfoHelper.settingCompanyBaseInfo(custInfo.getUnitAddre(), custInfo.getUnitCity(), custInfo.getUnitTown(), lonApp);
	
			lonApp.setDuty(BusMapping.duty.get(custInfo.getDuty())); // 职务级别(必填)
			lonApp.setSaleChannel("1028"); // 销售渠道
			lonApp.setInterestRule("B2002"); // 计息规则(必填)
			lonApp.setInstCode("110830"); // 所属机构(必填)
			lonApp.setCustomerSex(BusMapping.sex.get(custInfo.getCustomerSex())); // 性别(必填)
			lonApp.setCertType("B1301"); // 证件类型(必填)
			lonApp.setReceiveName(busLnApp.getCustomerName()); // 收款卡开户人姓名
			lonApp.setReceiveBranch(""); // 收款支行
			lonApp.setProductName("超能借贷(交叉现金贷)");// 产品名称(必填)
			lonApp.setOrgCode("JFB"); // 运营机构(必填)
			lonApp.setIsSignContact("2"); // 是否需要签合同(必填)
			lonApp.setIsCalTotalAmount("1"); // 是否需要计算合同金额(必填)
			lonApp.setIsPayPlan("2"); // 是否需要生成还款计划(必填)
			lonApp.setLoanTarget("2"); // 放款类型(必填)
			lonApp.setRepaymentInitiator("1"); // 还款发起方(必填)
			lonApp.setIsRepayMent("1");// 是否BUS还款(必填)
			lonApp.setIsOpenCard("1"); // 是否开户(必填)
			lonApp.setInitStats("4"); // 初始状态-待债匹(必填)
			lonApp.setAppayAmt(busLnApp.getLoanMoney()); // 申请金额
			lonApp.setTimeLimit(busLnApp.getPeriods().toString()); // 申请期限
	
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// 1186需求 将此段代码注释掉
			//
			// String appayDate = sdf.format(busLnApp.getSignTime());
			// lonApp.setAppayDate(appayDate); //申请时间(必填)
			//
	
			/*
			 * 1186需求 现金贷（270）推BUS，appayDate根据推送时填入的申请时间推送， 1.如果推送时间为空，该字段不推送；
			 * 2.如果不为空，则传送该字段填入的值 北京接口也做相应的变更
			 */
			String busProductIdStr = PropertyUtils.getConfig("bus", "com.hm.bus.appayDate.cash.productId");// 传参申请时间的bus产品id
			LOG.info("[BusHandleServiceImpl] setLonAppCash method bus cash" + busLnApp.getId().toString() + "的busProductId:"
					+ lonApp.getProductId()+ "传参申请时间的bus产品id:" + busProductIdStr);
			if (busProductIdStr.equals(lonApp.getProductId())) {
				BusBatchInfo batchInfo = busBatchInfoMapper.selectByPrimaryKey(busLnApp.getBatchNO());
				if (batchInfo != null && batchInfo.getAppayDate() != null) {
					String appayDate = sdf.format(batchInfo.getAppayDate());
					lonApp.setAppayDate(appayDate); // 申请时间
					LOG.info("[BusHandleServiceImpl] setLonAppCash method bus cash" + busLnApp.getId().toString() + "的申请时间:"
							+ lonApp.getAppayDate());
				}
			}
			lonApp.setRepayBranch("北京银行支行"); // 还款支行
			lonApp.setCreator("JFCN");
			return new Result(true);
		} catch (Exception e) {
			LOG.info("[BusHandleServiceImpl] setLonAppCash method 为现金贷接口请求对象设置值出现异常:APPID:" +busLnApp.getId()+ e);
			return new Result(false,BusReturn.BUS_EXCEPTION);
		}
	}

	// 保理
	private Result setLonAppBL(BusLnApp busLnApp, LoanApp lonApp, BusLnAppCustInfo custInfo, boolean isswitch) {
		String busProductId = busLnApp.getBusProductId();
		if (StringUtils.isEmpty(busProductId)) {
			String busProductStr = RedisUtils.getObject(BusReturn.BUS_PRODUCT_REDIS_KEY, busLnApp.getId() + "");// bus产品ID
			if (StringUtils.isEmpty(busProductStr)) {
				List<Map<String, Object>> list = busLnAppMapper.selectBusProductIdById(busLnApp.getId() + "");
				if (list == null || list.isEmpty()) {
					return new Result(false, BusReturn.BUS_PRODUCT_ID_NULL);
				}
				busProductId = list.get(0).get("busProductId").toString();
			} else {
				JSONObject busProduct = JSON.parseObject(busProductStr);
				busProductId = busProduct.getString("busProductId");
			}
		}

		// add by 20170309 增加反保理转保理业务
		if (isswitch) {
			busProductId = PropertyUtils.getConfig("bus", "com.hm.bus.posdbl2bl.busproductid" + busProductId);
		}

		lonApp.setProductId(busProductId);
		lonApp.setCustomerName(busLnApp.getCustomerName());
		lonApp.setCertId(busLnApp.getCardId());
		lonApp.setApproveSuggestAmt(busLnApp.getLoanMoney());
		lonApp.setLoanTerm(busLnApp.getPeriods().toString());
		lonApp.setApproveDstRate("0");
		if (null != busLnApp.getInterestRate()) {
			BigDecimal rateDe = new BigDecimal(busLnApp.getInterestRate() + "");
			BigDecimal rateDe2 = rateDe.divide(new BigDecimal("100"));
			lonApp.setApproveDstRate(rateDe2.toString());
		}
		// 原来的富有账户改成了保理公司的
		String baoliAccStr = RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY, "baoliAcc");
		JSONObject baoliAcc = JSON.parseObject(baoliAccStr);
		String baoliAccNameStr = RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY, "baoliAccName");
		JSONObject baoliAccName = JSON.parseObject(baoliAccNameStr);
		String baoliAccBankStr = RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY, "baoliAccBank");
		JSONObject baoliAccBank = JSON.parseObject(baoliAccBankStr);
		String baoliAccBankCardStr = RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY, "baoliAccBankCard");
		JSONObject baoliAccBankCard = JSON.parseObject(baoliAccBankCardStr);
		lonApp.setRepayAccount(baoliAcc.getString("confValue"));
		lonApp.setRepayAccountName(baoliAccName.getString("confValue"));
		lonApp.setReceiveOpen(baoliAccBank.getString("confValue"));
		lonApp.setReceiveBankCard(baoliAccBankCard.getString("confValue"));

		
		//		lonApp.setRepayAccount(SmConfigUtil.getValue("baoliAcc"));
		//		lonApp.setRepayAccountName(SmConfigUtil.getValue("baoliAccName"));
		//		lonApp.setReceiveOpen(SmConfigUtil.getValue("baoliAccBank"));
		//		lonApp.setReceiveBankCard(SmConfigUtil.getValue("baoliAccBankCard"));

		lonApp.setIsCard(BusMapping.repaymentType.get(busLnApp.getRepaymentType()));// *****************不确定卡金
																					// 账户
																					// 主动还款
		lonApp.setRepayBankCard(busLnApp.getRepaymentAcc());
		lonApp.setRepayOpen(busLnApp.getRepaymentBank());
		lonApp.setReceiveProvince("北京");
		lonApp.setReceiveCountry("北京市");
		lonApp.setReceiveCountryCode("1000");
		
		BusBaseInfoHelper.settingHouseHoldBaseInfo(custInfo.getHouseholdProv(), custInfo.getHouseholdCity(), custInfo.getHouseholdTown(), lonApp);

		lonApp.setRegistAddressRoad(custInfo.getHouseholdStr());

		BusBaseInfoHelper.settingLiveBaseInfo(custInfo.getLiveProv(), custInfo.getLiveCity(), custInfo.getLiveTown(), lonApp);

		BusBaseInfoHelper.settingCompanyBaseInfo(custInfo.getUnitAddre(), custInfo.getUnitCity(), custInfo.getUnitTown(), lonApp);

		lonApp.setDuty(BusMapping.duty.get(custInfo.getDuty()));
		lonApp.setOldAppId(busLnApp.getId() + "");
		return new Result(true);
	}

	private void insertBusSendLog(Result busResult, BusLnApp busLnApp, String batchNO) {
		LOG.info(String.format("推bus添加推送记录开始：%s", JSON.toJSONString(busResult)));
		BusSentLog sentLog = new BusSentLog();
		sentLog.setLnAppId(busLnApp.getId());
		sentLog.setBusType("1");// 记录类型(1推bus,2放款确认,3生成还款计划)
		sentLog.setState("2");// 1.成功 2.失败

		if (busResult.isSuccess()) {
			sentLog.setState("1");// 1.成功 2.失败
		}
		sentLog.setErrorMsg(busResult.getMessage());
		sentLog.setRecordType("1");//
		if (!(busResult.getStatusCode() == 0)) {
			sentLog.setReturnCode(busResult.getStatusCode() + "");
			sentLog.setErrorCode(busResult.getStatusCode() + "");
		} else {
			if (!busResult.isSuccess()) {
				sentLog.setErrorMsg(sentLog.getErrorMsg() + " 检查参数错误");
				sentLog.setRecordType("2");
			}
		}

		sentLog.setBatchNo(batchNO);
		sentLog.setUpdateTime(new Date());
		LOG.info(String.format("推bus添加推送记录结束：%s", JSON.toJSONString(sentLog)));
		sentLog.setErrorMsg(StringUtil.substring(sentLog.getErrorMsg(), 0, 50));
		busSentLogMapper.insertSelective(sentLog);
	}

	private Result setTlonAccountList(LoanApp lonApp, BusLnApp busLnApp, List<TLoanAccount> tLonAccountList) {
		// #1222 取消委托账户信息推送
		// 受托账户
		/*
		 * String baoliAccStr =
		 * RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY, "baoliAcc");
		 * JSONObject baoliAcc = JSON.parseObject(baoliAccStr); String
		 * baoliAccNameStr = RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY,
		 * "baoliAccName"); JSONObject baoliAccName =
		 * JSON.parseObject(baoliAccNameStr);
		 * 
		 * String baoliAccBankStr =
		 * RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY, "baoliAccBank");
		 * JSONObject baoliAccBank = JSON.parseObject(baoliAccBankStr); String
		 * baoliAccBankCardStr =
		 * RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY,
		 * "baoliAccBankCard"); JSONObject baoliAccBankCard =
		 * JSON.parseObject(baoliAccBankCardStr);
		 * 
		 * String baoliLegalerStr =
		 * RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY, "baoliLegaler");
		 * JSONObject baoliLegaler = JSON.parseObject(baoliLegalerStr); String
		 * baoliAccBankCertIdStr =
		 * RedisUtils.getObject(BusReturn.SM_CONFIG_REDIS_KEY,
		 * "baoliAccBankCertId"); JSONObject baoliAccBankCertId =
		 * JSON.parseObject(baoliAccBankCertIdStr);
		 * 
		 * TLonAccount account = new TLonAccount();
		 * account.setAccBankName(baoliAccBank.getString("confValue"));
		 * //开户行（必填）
		 * account.setAccBankCard(baoliAccBankCard.getString("confValue"));
		 * //银行卡号（必填）baoliAccBankCard
		 * account.setAccOwnName(baoliAccName.getString("confValue"));//开户人姓名（必填
		 * ）baoliAccName account.setAccCity("1000");
		 * //account.setAccOwnPhone(SmConfigUtil.getValue("baoliLegalerPhone"));
		 * //开户人电话 （accType为放款卡时必填)
		 * account.setAccOwnPhone(baoliAcc.getString("confValue"));//baoliAcc
		 * account.setAccCorpRep(baoliLegaler.getString("confValue"));
		 * //法人代表名称(对公时，必填)baoliLegaler
		 * account.setAccCertType("B1301");//证件类型(必填) （填B1301）
		 * account.setAccOwnIdCard(baoliAccBankCertId.getString("confValue"));//
		 * 开户人身份证号（必填）baoliAccBankCertId account.setAccountType("02");
		 * //开户类型(01：对私 ,02：对公) （必填） account.setAccType("B6803");//账户类型（必填）
		 * account.setTrusteeType("B134002"); //托管或存管
		 * account.setAccAccount(baoliAcc.getString("confValue")); //账号baoliAcc
		 * account.setAccAccountName(baoliAccName.getString("confValue"));
		 * //账号开户名baoliAccName account.setAccountPro("B8002"); //支付公司-B8002:富友
		 * lonApp.getTLonAccountList().add(account);
		 */

		// 放款
		TLoanAccount account = new TLoanAccount();
		/*
		 * account.setAccBankName(busLnApp.getRepaymentBank()); //开户行（必填）
		 * account.setAccBankCard(busLnApp.getRepaymentAcc()); //银行卡号（必填）
		 * account.setAccOwnName(busLnApp.getRepaymentAccName());//开户人姓名（必填）
		 * account.setAccCity("1000");
		 * account.setAccOwnPhone(busLnApp.getMobile());//开户人电话 （accType为放款卡时必填
		 * account.setAccCertType("B1301");//证件类型(必填) （填B1301）
		 * account.setAccOwnIdCard(busLnApp.getCardId());//开户人身份证号（必填）
		 * account.setAccountType("01"); //开户类型(01：对私 ,02：对公) （必填）
		 * account.setAccType("B6802");//账户类型（必填）
		 * account.setTrusteeType("B134003"); //托管或存管
		 */

		// #382 放款账户改成开通富友账户的实体卡信息
		CustAccFy c = new CustAccFy();
		c.setCardId(busLnApp.getCardId());
		List<CustAccFy> custAccFyResults = custAccFyMapper.list(c);
		if (null != custAccFyResults && custAccFyResults.size() > 0) {
			CustAccFy custAccFy = custAccFyResults.get(0);
			account.setAccBankName(custAccFy.getBankCode()); // 开户行（必填）
			account.setAccBankCard(custAccFy.getBankAcc()); // 银行卡号（必填）
			account.setAccOwnName(custAccFy.getCustName());// 开户人姓名（必填）
			account.setAccCity(custAccFy.getCityCode());
			account.setAccOwnPhone(custAccFy.getMobileNo());// 开户人电话
															// （accType为放款卡时必填
			account.setAccCertType("B1301");// 证件类型(必填) （填B1301）
			// #763: 推送BUS富友身份证校验优化
			account.setAccOwnIdCard(custAccFy.getCardId().toUpperCase());// 开户人身份证号（必填）
			// String fyCardId = custAccFy.getCardId();
			// account.setAccOwnIdCard(fyCardId.toUpperCase());//开户人身份证号（必填）
			account.setAccountType("01"); // 开户类型(01：对私 ,02：对公) （必填）
			account.setAccType("B6802");// 账户类型（必填）
			account.setTrusteeType("B134003"); // 托管或存管
			// lonApp.getTLonAccountList().add(account);
			tLonAccountList.add(account);
		} else {
			account.setAccBankName(busLnApp.getRepaymentBank()); // 开户行（必填）
			account.setAccBankCard(busLnApp.getRepaymentAcc()); // 银行卡号（必填）
			account.setAccOwnName(busLnApp.getRepaymentAccName());// 开户人姓名（必填）
			account.setAccCity("1000");
			account.setAccOwnPhone(busLnApp.getMobile());// 开户人电话
															// （accType为放款卡时必填
			account.setAccCertType("B1301");// 证件类型(必填) （填B1301）
			// account.setAccOwnIdCard(busLnApp.getCardId());//开户人身份证号（必填）
			// #809 Hyper系统推送BUS身份证兼容性优化
			account.setAccOwnIdCard(busLnApp.getCardId().toUpperCase());// 开户人身份证号（必填）
			account.setAccountType("01"); // 开户类型(01：对私 ,02：对公) （必填）
			account.setAccType("B6802");// 账户类型（必填）
			account.setTrusteeType("B134003"); // 托管或存管
			// lonApp.getTLonAccountList().add(account);
			tLonAccountList.add(account);
			// new Result(false, "富友账户的实体卡信息为空");
		}

		// 还款
		account = new TLoanAccount();
		account.setAccBankName(busLnApp.getRepaymentBank()); // 开户行（必填）
		account.setAccBankCard(busLnApp.getRepaymentAcc()); // 银行卡号（必填）
		account.setAccOwnName(busLnApp.getRepaymentAccName());// 开户人姓名（必填）
		account.setAccCity("1000");
		account.setAccOwnPhone(busLnApp.getMobile());// 开户人电话 （accType为放款卡时必填
		account.setAccCertType("B1301");// 证件类型(必填) （填B1301）
		// account.setAccOwnIdCard(busLnApp.getCardId());//开户人身份证号（必填）
		// #809 Hyper系统推送BUS身份证兼容性优化
		account.setAccOwnIdCard(busLnApp.getCardId().toUpperCase());// 开户人身份证号（必填）
		account.setAccountType("01"); // 开户类型(01：对私 ,02：对公) （必填）
		account.setAccType("B6801");// 账户类型（必填）
		account.setTrusteeType("B134003"); // 托管、存管、实体卡
		// lonApp.getTLonAccountList().add(account);
		tLonAccountList.add(account);
		return new Result(true);
	}

	private Result setExtendMap(BusLnApp busLnApp, LoanApp lonApp, BusLnAppCustInfo custInfo) {
		HashMap<String, Object> extendMap = new HashMap<>();
		// LonApp.ExtendMap.Entry sign = new LonApp.ExtendMap.Entry();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sd = "";
		// if(busLnApp.getClientSignedTime()!=null){
		// sd = sdf.format(busLnApp.getClientSignedTime());
		// }
		// 2017-05-04更新signDate
		// #858 修改signDate为合同生成时间
		sd = sdf.format(busLnApp.getCreateContTime());// 合同生成时间
		// ReplayPlanQuery replayPlanQuery = new ReplayPlanQuery();
		// replayPlanQuery.setIdentityCard(busLnApp.getCardId());//
		// 根据身份证号码查询是否结清
		/*
		 * RPCResult rpcResult = null; try { rpcResult =
		 * repayPlanService.queryAppRepayPlanList("HYPER", busLnApp.getCardId(),
		 * "", ""); } catch (RpcException e) { e.printStackTrace();
		 * LOG.error("保理 setLonAppBL" + busLnApp.getId() + "查询是否结清异常:" +
		 * e.getMessage()); } List<AppReplayPlanVo> appReplayPlanList = (List)
		 * rpcResult.getData(); if (rpcResult != null && rpcResult.getData() !=
		 * null && appReplayPlanList != null && appReplayPlanList.size() != 0) {
		 * for (AppReplayPlanVo plan : appReplayPlanList) {
		 * if(!plan.isSettled()) { // 如果未结清signDate为申请时间 sd =
		 * sdf.format(busLnApp.getWoBuildTime()); break; } } }
		 */
		// sign.setKey(LoanAppHelper.signDate);
		// sign.setValue(sd);
		extendMap.put(LoanAppHelper.signDate, sd);
		LOG.info("[BusHandleServiceImpl] setExtendMap method bus保理" + busLnApp.getId().toString() + "的signDate:" + sd);
		// LonApp.ExtendMap.Entry receiveName = new LonApp.ExtendMap.Entry();
		// receiveName.setKey(LoanAppHelper.receiveName);
		// receiveName.setValue(busLnApp.getCustomerName());
		extendMap.put(LoanAppHelper.receiveName, busLnApp.getCustomerName());
		// LonApp.ExtendMap.Entry receiveNo = new LonApp.ExtendMap.Entry();
		// receiveNo.setKey(LoanAppHelper.receiveNo);
		// receiveNo.setValue(busLnApp.getPaymentAcc());
		extendMap.put(LoanAppHelper.receiveNo, busLnApp.getPaymentAcc());
		// LonApp.ExtendMap.Entry receiveBank = new LonApp.ExtendMap.Entry();
		// receiveBank.setKey(LoanAppHelper.receiveBank);
		// receiveBank.setValue(busLnApp.getPaymentBank());
		extendMap.put(LoanAppHelper.receiveBank, busLnApp.getPaymentBank());
		// LonApp.ExtendMap.Entry receiveBranch = new LonApp.ExtendMap.Entry();
		// receiveBranch.setKey(LoanAppHelper.receiveBranch);
		// receiveBranch.setValue("北京银行支行");
		extendMap.put(LoanAppHelper.receiveBranch, "北京银行支行");
		// LonApp.ExtendMap.Entry tie = new LonApp.ExtendMap.Entry();
		// tie.setKey(LoanAppHelper.tieCardId);
		// tie.setValue("1234567890");
		extendMap.put(LoanAppHelper.tieCardId, "1234567890");
		// LonApp.ExtendMap.Entry repayName = new LonApp.ExtendMap.Entry();
		// repayName.setKey(LoanAppHelper.repayName);
		// repayName.setValue(busLnApp.getSelfRepayName());
		extendMap.put(LoanAppHelper.repayName, busLnApp.getSelfRepayName());
		// LonApp.ExtendMap.Entry repayOpenAccount = new
		// LonApp.ExtendMap.Entry();
		// repayOpenAccount.setKey(LoanAppHelper.repayOpenAccount);
		// repayOpenAccount.setValue(busLnApp.getSelfRepayAccount());
		extendMap.put(LoanAppHelper.repayOpenAccount, busLnApp.getSelfRepayAccount());
		// LonApp.ExtendMap.Entry repayOpenBank = new LonApp.ExtendMap.Entry();
		// repayOpenBank.setKey(LoanAppHelper.repayOpenBank);
		// repayOpenBank.setValue("0102");
		extendMap.put(LoanAppHelper.repayOpenBank, "0102");
		// LonApp.ExtendMap.Entry monthRiskRate = new LonApp.ExtendMap.Entry();
		// monthRiskRate.setKey(LoanAppHelper.monthRiskRate);
		// monthRiskRate.setValue(0);
		extendMap.put(LoanAppHelper.monthRiskRate, 0);
		// Mid 2016-01-15 月保费比例不为空，并且购买了保险
		if (null != busLnApp.getMonthlyPremiumRate() && busLnApp.getBuyInsurance() == true) {
			BigDecimal val = busLnApp.getMonthlyPremiumRate().divide(new BigDecimal(100));
			// monthRiskRate.setValue(val.toString());
			extendMap.put(LoanAppHelper.monthRiskRate, val.toString());
		}
		// Mid 2016-11-08 增加信用等级、信用评分
		// 查询信用等级和信用评分
		String riskCode = null; // 信用等级
		String scoreCode = null; // 信用评分
		String riskFicoStr = RedisUtils.getObject(BusReturn.LN_RISK_FICO_RESULT_REDIS_KEY, busLnApp.getId() + "");
		if (StringUtils.isEmpty(riskFicoStr)) {
			List<Map<String, Object>> list = lnRiskFicoResultMapper.selectByAppId(busLnApp.getId() + "");
			if (list == null || list.size() == 0) {
				return new Result(false, busLnApp.getId() + "找不到对应的信用等级、信用评分");
			}
			riskCode = list.get(0).get("grade").toString();
			scoreCode = list.get(0).get("score").toString();
			if (list == null || list.size() == 0) {
				return new Result(false, "riskCode,scoreCode is null");
			}
		} else {
			JSONObject riskFico = JSON.parseObject(riskFicoStr);
			riskCode = riskFico.getString("grade");// entity.getGrade();
			scoreCode = riskFico.getString("score");// entity.getScore();
		}

		if (StringUtils.isBlank(riskCode)) {
			return new Result(false, "riskCode is null");
		}
		if (StringUtils.isBlank(scoreCode)) {
			return new Result(false, "scoreCode is null");
		}
		// 兼容系统自动评分
		String riskGradeVal = "";
		String scoreVal = "";
		String jjCodeStr1 = "";
		String jjCodeStr2 = "";
		if (riskCode.length() == 1) {
			riskGradeVal = riskCode;
		} else {
			jjCodeStr1 = RedisUtils.getObject(BusReturn.JJ_CODE_REDIS_KEY, riskCode);
			JSONObject jjCode = JSON.parseObject(jjCodeStr1);
			riskGradeVal = jjCode.getString(riskCode);
		}
		if (scoreCode.length() >= 1 && scoreCode.length() <= 4) {
			scoreVal = scoreCode;
		} else {
			// 查询信用评分
			jjCodeStr2 = RedisUtils.getObject(BusReturn.JJ_CODE_REDIS_KEY, scoreCode);
			JSONObject jjCode = JSON.parseObject(jjCodeStr2);
			scoreVal = jjCode.getString(scoreCode);
		}

		if (StringUtils.isBlank(riskGradeVal)) {
			return new Result(false, "riskCode is null");
		}
		if (StringUtils.isBlank(scoreVal)) {
			return new Result(false, "scoreCode is null");
		}

		// LonApp.ExtendMap.Entry riskGrade = new LonApp.ExtendMap.Entry();
		// riskGrade.setKey(LoanAppHelper.riskGrade);// 信用等级
		// riskGrade.setValue(riskGradeVal);
		extendMap.put(LoanAppHelper.riskGrade, riskGradeVal);
		// LonApp.ExtendMap.Entry score = new LonApp.ExtendMap.Entry();
		// score.setKey(LoanAppHelper.score);// 信用评分
		// score.setValue(scoreVal);
		extendMap.put(LoanAppHelper.score, scoreVal);
		// Mid Evan 2016-05-18 增加
		String careerVal = custInfo.getCareerType();
		if (StringUtils.isBlank(careerVal)) {
			return new Result(false, "CareerType is null");
		}
		// LonApp.ExtendMap.Entry career = new LonApp.ExtendMap.Entry();
		// career.setKey(LoanAppHelper.career);
		// career.setValue(careerVal);
		extendMap.put(LoanAppHelper.career, careerVal);
		// 蒙天宇 2016-09-12 增加减期字段
		// 查询产品系列减期数字段
		LOG.info("================reducePeriods:" + busLnApp.getProductSeriesId() + "==============");
		String reducePeriodsValue = null;

		String prodectSeriesStr = RedisUtils.getObject(BusReturn.BS_PRODECT_SERIES_REDIS_KEY,
				busLnApp.getProductSeriesId() + "");
		if (StringUtils.isEmpty(prodectSeriesStr)) {
			return new Result(false, "reducePeriods is null");
		} else {
			JSONObject prodectSeries = JSON.parseObject(prodectSeriesStr);
			reducePeriodsValue = prodectSeries.getString("reductionPeriod");// periodMap.get(0).get("REDUCTION_PERIOD")
																			// +
																			// "";
			if (StringUtils.isBlank(reducePeriodsValue)) {
				return new Result(false, "reducePeriods is null");
			}
		}
		// FIXME 减期字段
		// LonApp.ExtendMap.Entry reducePeriods = new LonApp.ExtendMap.Entry();
		// reducePeriods.setKey(LoanAppHelper.reducePeriods);
		// reducePeriods.setValue(reducePeriodsValue);
		extendMap.put(LoanAppHelper.reducePeriods, reducePeriodsValue);
		// Mid 20161-10-10 增加borrowerType借款人类型 B154001 个人,B154002 法人,B154003 机构
		// LonApp.ExtendMap.Entry borrowerType = new LonApp.ExtendMap.Entry();
		// borrowerType.setKey(LoanAppHelper.borrowerType);
		// borrowerType.setValue("B154001");//超能贷前进件借款人类型统一传B154001
		extendMap.put(LoanAppHelper.borrowerType, "B154001");
		// LonApp.ExtendMap extendMap = new LonApp.ExtendMap();
		// extendMap.getEntry().add(sign);
		// extendMap.getEntry().add(tie);
		// extendMap.getEntry().add(repayName);
		// extendMap.getEntry().add(repayOpenAccount);
		// extendMap.getEntry().add(repayOpenBank);
		// extendMap.getEntry().add(receiveName);
		// extendMap.getEntry().add(receiveNo);
		// extendMap.getEntry().add(receiveBank);
		// extendMap.getEntry().add(receiveBranch);
		// extendMap.getEntry().add(monthRiskRate);
		// extendMap.getEntry().add(riskGrade);
		// extendMap.getEntry().add(score);
		// extendMap.getEntry().add(career);
		// extendMap.getEntry().add(reducePeriods);
		// extendMap.getEntry().add(borrowerType);
		// lonApp.setExtendMap(extendMap);
		lonApp.setExtendMap(extendMap);
		return new Result(true);
	}

	private Result checkLnAppCustCash(BusLnAppCustInfo custInfo, LoanApp lonApp, BusLnApp busLnApp) {
		if (custInfo == null) {
			return new Result(false, BusReturn.CUST_INFO_NULL);
		}
		if (StringUtils.isBlank(custInfo.getCareerType())) {
			return new Result(false, "CareerType is null");
		}
		if (StringUtils.isEmpty(custInfo.getDegree())) {
			return new Result(false, BusReturn.DEGREE_NULL);
		}
		if (StringUtils.isEmpty(custInfo.getMarry())) {
			return new Result(false, BusReturn.MARRY_NULL);
		}
		if (StringUtils.isBlank(custInfo.getEmaill())) {
			return new Result(false, BusReturn.EMAIL_NULL);
		}
		if (StringUtils.isBlank(custInfo.getHouseholdProv())) {
			return new Result(false, BusReturn.HOUSE_HOLD_PROV_NULL);
		}
		if (StringUtils.isBlank(custInfo.getHouseholdCity())) {
			return new Result(false, BusReturn.HOUSE_HOLD_CITY_NULL);
		}
		if (StringUtils.isBlank(custInfo.getHouseholdStr())) {
			return new Result(false, BusReturn.HOUSE_HOLD_STR_NULL);
		}
		if (StringUtils.isBlank(custInfo.getLiveProv())) {
			return new Result(false, BusReturn.LIVE_PROV_NULL);
		}
		if (StringUtils.isBlank(custInfo.getLiveCity())) {
			return new Result(false, BusReturn.LIVE_STR_NULL);
		}
		if (StringUtils.isBlank(custInfo.getLiveStr())) {
			return new Result(false, BusReturn.LIVE_STR_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnitname())) {
			return new Result(false, BusReturn.UNITNAME_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnittype())) {
			return new Result(false, BusReturn.UNITTYPE_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnitAddre())) {
			return new Result(false, BusReturn.UNIT_PROV_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnitCity())) {
			return new Result(false, BusReturn.UNIT_CITY_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnitStr())) {
			return new Result(false, BusReturn.UNIT_STR_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnitPhone())) {
			return new Result(false, BusReturn.UNIT_PHONE_NULL);
		}
		if (StringUtils.isBlank(custInfo.getIndustryType())) {
			return new Result(false, BusReturn.UNIT_INDUSTRY_NULL);
		}
		if (StringUtils.isBlank(custInfo.getDuty())) {
			return new Result(false, BusReturn.DUTY_NULL);
		}
		if (custInfo.getCustomerSex() == null) {
			return new Result(false, BusReturn.CUSTOMER_SEX_NULL);
		}
		return new Result(true);
	}

	private Result checkLnAppCustDBL(BusLnAppCustInfo custInfo, LoanApp lonApp, BusLnApp busLnApp) {
		if (custInfo == null) {
			return new Result(false, BusReturn.CUST_INFO_NULL);
		}
		String careerVal = custInfo.getCareerType();
		if (StringUtils.isEmpty(custInfo.getDegree())) {
			return new Result(false, BusReturn.DEGREE_NULL);
		}
		if (StringUtils.isEmpty(custInfo.getMarry())) {
			return new Result(false, BusReturn.MARRY_NULL);
		}
		if (StringUtils.isBlank(custInfo.getEmaill())) {
			return new Result(false, BusReturn.EMAIL_NULL);
		}
		if (StringUtils.isBlank(custInfo.getHouseholdProv())) {
			return new Result(false, BusReturn.HOUSE_HOLD_PROV_NULL);
		}
		if (StringUtils.isBlank(custInfo.getHouseholdCity())) {
			return new Result(false, BusReturn.HOUSE_HOLD_CITY_NULL);
		}
		if (StringUtils.isBlank(custInfo.getHouseholdStr())) {
			return new Result(false, BusReturn.HOUSE_HOLD_STR_NULL);
		}
		if (StringUtils.isBlank(custInfo.getLiveProv())) {
			return new Result(false, BusReturn.LIVE_PROV_NULL);
		}
		if (StringUtils.isBlank(custInfo.getLiveCity())) {
			return new Result(false, BusReturn.LIVE_CITY_NULL);
		}
		if (StringUtils.isBlank(custInfo.getLiveStr())) {
			return new Result(false, BusReturn.LIVE_STR_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnitname())) {
			return new Result(false, BusReturn.UNITNAME_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnittype())) {
			return new Result(false, BusReturn.UNITTYPE_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnitAddre())) {
			return new Result(false, BusReturn.UNIT_PROV_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnitCity())) {
			return new Result(false, BusReturn.UNIT_CITY_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnitStr())) {
			return new Result(false, BusReturn.UNIT_STR_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnitPhone())) {
			return new Result(false, BusReturn.UNIT_PHONE_NULL);
		}
		if (StringUtils.isBlank(custInfo.getIndustryType())) {
			return new Result(false, BusReturn.UNIT_INDUSTRY_NULL);
		}
		if (StringUtils.isBlank(custInfo.getDuty())) {
			return new Result(false, BusReturn.DUTY_NULL);
		}
		if (custInfo.getCustomerSex() == null) {
			return new Result(false, BusReturn.CUSTOMER_SEX_NULL);
		}
		if (StringUtils.isBlank(careerVal)) {
			return new Result(false, "CareerType is null");
		}
		return new Result(true);
	}

	private Result checkLnAppCash(BusLnApp busLnApp) {
		if (busLnApp == null) {
			return new Result(false, BusReturn.APP_NULL);
		}
		if (busLnApp.getId() == null) {
			return new Result(false, BusReturn.APP_ID_NULL);
		}
		BusLnApp busLnApp_ = busLnAppMapper.selectByPrimaryKey(busLnApp.getId());
		if (!"36".equals(busLnApp_.getAppState())) {
			LOG.info("现金贷推bus状态为非36，超能工单号：" + busLnApp_.getId() + " state:" + busLnApp_.getAppState());
			return new Result(false, BusReturn.WRONG_STATUS);
		}
		if (StringUtils.isNotBlank(busLnApp_.getBusAppid())) {
			LOG.info("现金贷推bus，busid不为空，超能工单号：" + busLnApp_.getId() + " busid:" + busLnApp_.getBusAppid());
			return new Result(false, "现金贷推bus，busid不为空");
		}
		if (busLnApp.getStoreId() == null) {
			return new Result(false, BusReturn.STORE_ID_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getCustomerName())) {
			return new Result(false, BusReturn.CUSTOMER_NAME_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getCardId())) {
			return new Result(false, BusReturn.CARD_ID_NULL);
		}
		if (busLnApp.getLoanMoney() == null) {
			return new Result(false, BusReturn.LOAN_MONEY_NULL);
		}
		if (busLnApp.getPeriods() == null) {
			return new Result(false, BusReturn.PERIODS_NULL);
		}
		if (busLnApp.getSignTime() == null) {
			return new Result(false, BusReturn.SIGN_TIME_NULL);
		}

		if (StringUtils.isEmpty(busLnApp.getSelfRepayName())) {
			return new Result(false, BusReturn.SELF_REPAY_NAME_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getSelfRepayAccount())) {
			return new Result(false, BusReturn.SELF_REPAY_ACCOUNT_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getSelfRepayBank())) {
			return new Result(false, BusReturn.SELF_REPAY_BANK_NULL);
		}

		if (StringUtils.isEmpty(busLnApp.getPaymentBank())) {
			return new Result(false, BusReturn.PAYMENT_BANK_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getPaymentAcc())) {
			return new Result(false, BusReturn.PAYMENT_ACC_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getMobile())) {
			return new Result(false, BusReturn.MOBILE_NULL);
		}
		Long pdsid = busLnApp.getProductSeriesId(); // 产品序列
		Long pdid = busLnApp.getProductId(); // 产品ID
		if (pdid == null) {
			return new Result(false, BusReturn.PRODUCT_ID_NULL);
		}
		Double interestRate = busLnApp.getInterestRate();
		if (interestRate == null) {
			return new Result(false, BusReturn.INTEREST_RATE_NULL);
		}
		if (pdsid == null) {
			return new Result(false, BusReturn.PRODUCT_SERIES_ID_NULL);
		}
		return new Result(true);
	}

	private Result checkLnAppCust(BusLnAppCustInfo custInfo, LoanApp lonApp, BusLnApp busLnApp) {
		if (StringUtils.isEmpty(custInfo.getDegree())) {
			return new Result(false, BusReturn.DEGREE_NULL);
		}
		lonApp.setDegree(BusMapping.degree.get(custInfo.getDegree()));
		if (StringUtils.isEmpty(custInfo.getMarry())) {
			return new Result(false, BusReturn.MARRY_NULL);
		}
		lonApp.setMarry(BusMapping.marry.get(custInfo.getMarry()));
		if (StringUtils.isEmpty(busLnApp.getMobile())) {
			return new Result(false, BusReturn.MOBILE_NULL);
		}
		lonApp.setPhone(busLnApp.getMobile());
		if (StringUtils.isBlank(custInfo.getEmaill())) {
			lonApp.seteMail("");// Mid 2016-02-25
		} else {
			lonApp.seteMail(custInfo.getEmaill().trim());
		}
		if (StringUtils.isBlank(custInfo.getHouseholdProv())) {
			return new Result(false, BusReturn.HOUSE_HOLD_PROV_NULL);
		}
		if (StringUtils.isBlank(custInfo.getHouseholdCity())) {
			return new Result(false, BusReturn.HOUSE_HOLD_CITY_NULL);
		}
		if (StringUtils.isBlank(custInfo.getHouseholdStr())) {
			return new Result(false, BusReturn.HOUSE_HOLD_STR_NULL);
		}
		if (StringUtils.isBlank(custInfo.getLiveProv())) {
			return new Result(false, BusReturn.LIVE_PROV_NULL);
		}
		if (StringUtils.isBlank(custInfo.getLiveCity())) {
			return new Result(false, BusReturn.LIVE_CITY_NULL);
		}

		if (StringUtils.isBlank(custInfo.getLiveStr())) {
			return new Result(false, BusReturn.LIVE_STR_NULL);
		}
		lonApp.setLiveaddressRoad(custInfo.getLiveStr());
		lonApp.setLoanPurpose("F1112");
		if (StringUtils.isBlank(custInfo.getUnitname())) {
			return new Result(false, BusReturn.UNITNAME_NULL);
		}
		lonApp.setCompany(custInfo.getUnitname());
		if (StringUtils.isBlank(custInfo.getUnittype())) {
			return new Result(false, BusReturn.UNITTYPE_NULL);
		}
		lonApp.setCompanyType(BusMapping.unit.get(custInfo.getUnittype()));
		if (StringUtils.isBlank(custInfo.getUnitAddre())) {
			return new Result(false, BusReturn.UNIT_PROV_NULL);
		}
		if (StringUtils.isBlank(custInfo.getUnitCity())) {
			return new Result(false, BusReturn.UNIT_CITY_NULL);
		}

		if (StringUtils.isBlank(custInfo.getUnitStr())) {
			return new Result(false, BusReturn.UNIT_STR_NULL);
		}
		lonApp.setCompanyAdressRoad(custInfo.getUnitStr());
		if (StringUtils.isBlank(custInfo.getUnitPhone())) {
			return new Result(false, BusReturn.UNIT_PHONE_NULL);
		}
		lonApp.setCompanyPhone(custInfo.getUnitPhone());
		if (StringUtils.isBlank(custInfo.getIndustryType())) {
			return new Result(false, BusReturn.UNIT_INDUSTRY_NULL);
		}
		lonApp.setIntustry(custInfo.getIndustryType());
		if (StringUtils.isBlank(custInfo.getDuty())) {
			return new Result(false, BusReturn.UNIT_INDUSTRY_NULL);
		}
		return new Result(true);
	}

	private Result checkLnAppDBL(BusLnApp busLnApp) {
		String appStatus = busLnApp.getAppState();
		/************************** 数据校验 *****************************/
		if (busLnApp.getId() == null) {
			return new Result(false, BusReturn.APP_ID_NULL);
		}
		BusLnApp busLnApp_ = busLnAppMapper.selectByPrimaryKey(busLnApp.getId());
		if (!"36".equals(busLnApp_.getAppState())) {
			LOG.info("反保理推bus状态为非36，超能工单号：" + busLnApp_.getId() + " state:" + busLnApp_.getAppState());
			return new Result(false, BusReturn.WRONG_STATUS);
		}
		if (StringUtils.isNotBlank(busLnApp_.getBusAppid())) {
			LOG.info("反保理推bus，busid不为空，超能工单号：" + busLnApp_.getId() + " busid:" + busLnApp_.getBusAppid());
			return new Result(false, "反保理推bus，busid不为空");
		}
		if (busLnApp.getStoreId() == null) {
			return new Result(false, BusReturn.STORE_ID_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getCustomerName())) {
			return new Result(false, BusReturn.CUSTOMER_NAME_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getCardId())) {
			return new Result(false, BusReturn.CARD_ID_NULL);
		}
		if (null == busLnApp.getLoanMoney()) {
			return new Result(false, BusReturn.LOAN_MONEY_NULL);
		}
		if (null == busLnApp.getPeriods()) {
			return new Result(false, BusReturn.PERIODS_NULL);
		}
		if (null == busLnApp.getSignTime()) {
			return new Result(false, BusReturn.SIGN_TIME_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getPaymentBank())) {
			return new Result(false, BusReturn.PAYMENT_BANK_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getPaymentAcc())) {
			return new Result(false, BusReturn.PAYMENT_ACC_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getMobile())) {
			return new Result(false, BusReturn.MOBILE_NULL);
		}
		Long pdsid = busLnApp.getProductSeriesId(); // 产品序列
		Long pdid = busLnApp.getProductId(); // 产品ID
		if (pdid == null) {
			return new Result(false, BusReturn.PRODUCT_ID_NULL);
		}
		Double interestRate = busLnApp.getInterestRate();
		if (interestRate == null) {
			return new Result(false, BusReturn.INTEREST_RATE_NULL);
		}
		if (pdsid == null) {
			return new Result(false, BusReturn.PRODUCT_SERIES_ID_NULL);
		}
		return new Result(true);
	}

	private Result checkLnApp(BusLnApp busLnApp) {
		if (busLnApp == null) {
			return new Result(false, BusReturn.APP_NULL);
		}
		if (busLnApp.getId() == null) {
			return new Result(false, BusReturn.APP_ID_NULL);
		}
		BusLnApp busLnApp_ = busLnAppMapper.selectByPrimaryKey(busLnApp.getId());
		if (!"36".equals(busLnApp_.getAppState())) {
			LOG.info("保理推bus状态为非36，超能工单号：" + busLnApp_.getId() + " state:" + busLnApp_.getAppState());
			return new Result(false, BusReturn.WRONG_STATUS);
		}
		if (StringUtils.isNotBlank(busLnApp_.getBusAppid())) {
			LOG.info("保理推bus，busid不为空，超能工单号：" + busLnApp_.getId() + " busid:" + busLnApp_.getBusAppid());
			return new Result(false, "保理推bus，busid不为空");
		}
		if (busLnApp.getStoreId() == null) {
			return new Result(false, BusReturn.STORE_ID_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getCustomerName())) {
			return new Result(false, BusReturn.CUSTOMER_NAME_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getCardId())) {
			return new Result(false, BusReturn.CARD_ID_NULL);
		}

		Long pdsid = busLnApp.getProductSeriesId();
		Long pdid = busLnApp.getProductId();
		if (pdid == null) {
			return new Result(false, BusReturn.PRODUCT_ID_NULL);
		}
		Double interestRate = busLnApp.getInterestRate();
		if (interestRate == null) {
			return new Result(false, BusReturn.INTEREST_RATE_NULL);
		}
		if (pdsid == null) {
			return new Result(false, BusReturn.PRODUCT_SERIES_ID_NULL);
		}

		if (busLnApp.getLoanMoney() == null) {
			return new Result(false, BusReturn.LOAN_MONEY_NULL);
		}
		if (busLnApp.getPeriods() == null) {
			return new Result(false, BusReturn.PERIODS_NULL);
		}

		if (busLnApp.getSignTime() == null) {
			return new Result(false, BusReturn.SIGN_TIME_NULL);
		}

		if (StringUtils.isEmpty(busLnApp.getSelfRepayName())) {
			return new Result(false, BusReturn.SELF_REPAY_NAME_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getSelfRepayAccount())) {
			return new Result(false, BusReturn.SELF_REPAY_ACCOUNT_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getSelfRepayBank())) {
			return new Result(false, BusReturn.SELF_REPAY_BANK_NULL);
		}

		if (StringUtils.isEmpty(busLnApp.getPaymentBank())) {
			return new Result(false, BusReturn.PAYMENT_BANK_NULL);
		}
		if (StringUtils.isEmpty(busLnApp.getPaymentAcc())) {
			return new Result(false, BusReturn.PAYMENT_ACC_NULL);
		}

		return new Result(true);
	}

	class CallableThreadPosBL implements Callable<Result> {

		private String lnApp;

		private String id;

		private boolean isswitch;// 反保理转保理开关

		public CallableThreadPosBL(String lnApp, String id, boolean isswitch) {
			this.lnApp = lnApp;
			this.id = id;
			this.isswitch = isswitch;
		}

		@Override
		public Result call() {
			RedisDisLock lock = redisDisLockPool.getLock(id);
			//boolean isLock = lock.lock(Long.MAX_VALUE, Long.MAX_VALUE);
			try {
				Result result = handleBusPosBL(lnApp, isswitch);
				LOG.info(String.format("保理推bus call：%s", JSON.toJSONString(result)));
				if (result != null) {
					// 写log
					BusLnApp busLnApp = JSON.parseObject(lnApp, BusLnApp.class);
					String batchNo = busLnApp.getBatchNO();
					insertBusSendLog(result, busLnApp, batchNo);

					// 更新统计数据及结束时间
					Map<String, Long> map = busBatchInfoMapper.selectSentTotal(batchNo);
					BusBatchInfo batch = new BusBatchInfo();
					batch.setBatchNO(batchNo);
					Long total = map.get("total");
					Long totalFail = map.get("total_fail");
					Long totalSuccess = map.get("total_success");
					Long totalUnsent = map.get("total_unsent");
					batch.setTotalFail(totalFail);
					batch.setTotalSuccess(totalSuccess);
					batch.setTotalUnsent(totalUnsent);
					if (total.longValue() == totalSuccess.longValue()) {
						batch.setEndDate(new Date());
					}
					busBatchInfoMapper.updateByPrimaryKeySelective(batch);

				}

				return result;
			} catch (Exception e) {
				LOG.error(String.format("保理推bus from 36 To 32 error：%s", lnApp), e);
				busSysErrorLogService.saveError("[BusHandleServiceImpl] CallableThreadPosBL Exception: ", e);
			} finally {
				lock.unlock();
			}
			return null;
		}
	}

	class CallableThreadPosDBL implements Callable<Result> {

		private String lnApp;

		private String id;

		public CallableThreadPosDBL(String lnApp, String id) {
			this.lnApp = lnApp;
			this.id = id;
		}

		@Override
		public Result call() {
			RedisDisLock lock = redisDisLockPool.getLock(id);
			//boolean isLock = lock.lock(Long.MAX_VALUE, Long.MAX_VALUE);
			try {
				Result result = handleBusPosDBL(lnApp);
				LOG.info(String.format("反保理推bus call：%s", JSON.toJSONString(result)));
				if (result != null) {
					// 写log
					BusLnApp busLnApp = JSON.parseObject(lnApp, BusLnApp.class);
					String batchNo = busLnApp.getBatchNO();
					insertBusSendLog(result, busLnApp, batchNo);

					// 更新统计数据及结束时间
					Map<String, Long> map = busBatchInfoMapper.selectSentTotal(batchNo);
					BusBatchInfo batch = new BusBatchInfo();
					batch.setBatchNO(batchNo);
					Long total = map.get("total");
					Long totalFail = map.get("total_fail");
					Long totalSuccess = map.get("total_success");
					Long totalUnsent = map.get("total_unsent");
					batch.setTotalFail(totalFail);
					batch.setTotalSuccess(totalSuccess);
					batch.setTotalUnsent(totalUnsent);
					if (total.longValue() == totalSuccess.longValue()) {
						batch.setEndDate(new Date());
					}
					busBatchInfoMapper.updateByPrimaryKeySelective(batch);

				}
				return result;

			} catch (Exception e) {
				LOG.error(String.format("反保理推bus from 36 To 32 error：%s", lnApp), e);
				busSysErrorLogService.saveError("[BusHandleServiceImpl] CallableThreadPosDBL Exception: ", e);
			} finally {
				lock.unlock();
			}
			return null;
		}
	}

	class CallableThreadCash implements Callable<Result> {

		private String lnApp;

		private String id;

		public CallableThreadCash(String lnApp, String id) {
			this.lnApp = lnApp;
			this.id = id;
		}

		@Override
		public Result call() {
			RedisDisLock lock = redisDisLockPool.getLock(id);
			//boolean isLock = lock.lock(Long.MAX_VALUE, Long.MAX_VALUE);
			try {

				Result result = handleBusCash(lnApp);
				LOG.info(String.format("现金贷推bus call：%s", JSON.toJSONString(result)));
				if (result != null) {
					// 写log
					BusLnApp busLnApp = JSON.parseObject(lnApp, BusLnApp.class);
					String batchNo = busLnApp.getBatchNO();
					insertBusSendLog(result, busLnApp, batchNo);

					// 更新统计数据及结束时间
					Map<String, Long> map = busBatchInfoMapper.selectSentTotal(batchNo);
					BusBatchInfo batch = new BusBatchInfo();
					batch.setBatchNO(batchNo);
					Long total = map.get("total");
					Long totalFail = map.get("total_fail");
					Long totalSuccess = map.get("total_success");
					Long totalUnsent = map.get("total_unsent");
					batch.setTotalFail(totalFail);
					batch.setTotalSuccess(totalSuccess);
					batch.setTotalUnsent(totalUnsent);
					if (total.longValue() == totalSuccess.longValue()) {
						batch.setEndDate(new Date());
					}
					busBatchInfoMapper.updateByPrimaryKeySelective(batch);

				}
				return result;

			} catch (Exception e) {
				LOG.error(String.format("现金贷推bus from 36 To 32 error：%s", lnApp), e);
				busSysErrorLogService.saveError("[BusHandleServiceImpl] CallableThreadCash Exception: ", e);
			} finally {
				lock.unlock();
			}
			return null;
		}
	}
}
