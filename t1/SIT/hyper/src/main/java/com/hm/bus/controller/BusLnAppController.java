package com.hm.bus.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gep.core.base.BaseController;
import com.gep.core.entity.Page;
import com.gep.core.util.RedisUtils;
import com.hm.bus.constants.BusReturn;
import com.hm.bus.module.BusBatchInfo;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.service.BusBatchService;
import com.hm.bus.service.BusLnAppService;
import com.hm.bus.service.BusSentService;
import com.hm.bus.util.DateUtil;
import com.hm.bus.util.Result;
import com.hm.bus.util.ResultInfo;
import com.hm.bus.util.SentBusRunnable;

/**
 * 工单操作控制器
 * 
 * @author leimeng E-mail: leimeng@9fchaoneng.com
 * @version 创建时间：2017年1月11日 上午11:54:57
 */
@Controller
@RequestMapping("/bus/app")
public class BusLnAppController extends BaseController {
	private static final Logger LOG = Logger.getLogger(BusLnAppController.class);
	@Autowired
	private BusLnAppService busLnAppService;
	@Autowired
	private BusSentService busSentService;
	@Autowired
	private BusBatchService busBatchInfoService;
	@Resource
	private ThreadPoolTaskExecutor threadPoolTaskExecutor;

	// 跳到工单查询页面
	@RequestMapping(value = "list")
	public String list(ModelMap model) {
		return "bus/app/list";
	}

	// 条件查询
	@RequestMapping(value = "querylist")
	public String queryList(BusLnApp lnapp, ModelMap model) {
		LOG.info("[BusLnAppController] queryList method begin...");
		Page<BusLnApp> page = new Page<>();
		try {

			// 获取任务执行状态,控制Button
			String BUS_LOAN_CONFIRM = RedisUtils.getObject("BUS_TASK", "BUS_LOAN_CONFIRM");
			String BUS_UPDATE_REPAYMENT_PLAN = RedisUtils.getObject("BUS_TASK", "BUS_UPDATE_REPAYMENT_PLAN");
			if ("true".equals(BUS_LOAN_CONFIRM) || "true".equals(BUS_UPDATE_REPAYMENT_PLAN)) {
				model.addAttribute("btnflag", "true");
			} else {
				model.addAttribute("btnflag", "false");
			}

			if (lnapp != null) {
				if (lnapp.getSendBusTime() != null) {
					lnapp.setSendBusTime(DateUtil.getSimpleDate(lnapp.getSendBusTime()));
				}
			}
			
			page = getPage(lnapp);
			busLnAppService.list(page);

		} catch (Exception e) {
			LOG.error("[BusLnAppController] queryList method 加载List页面异常", e);
		}
		model.addAttribute("lnapp", lnapp);
		model.addAttribute("pageReq", page);
		LOG.info("[BusLnAppController] queryList method end...");
		return "bus/app/list";
	}

	// 单个推BUS
	// @RequestMapping(value = "singleImp")
	// @ResponseBody
	// public ResultInfo singleImp(HttpServletRequest request,
	// HttpServletResponse response) {
	// LOG.info("[BusLnAppController] singleImp method begin...");
	// String lnAppId = request.getParameter("lnAppId");
	// ResultInfo rs = new ResultInfo();
	// try {
	// if (StringUtils.isNotBlank(lnAppId)) {
	// List<String> lnAppList = new ArrayList<String>();
	// lnAppList.add(lnAppId);
	// RedisUtils.lPush(BusReturn.BUS_REDIS_LIST, lnAppList.toArray());
	// rs.setStatus(true);
	// rs.setMessage("工单号" + lnAppId + "已加入待推BUS队列！");
	// LOG.info("[BusLnAppController] singleImp method 工单号" + lnAppId +
	// "已加入待推BUS队列！");
	// } else {
	// rs.setStatus(false);
	// rs.setMessage("工单号不能为空！");
	// }
	//
	// } catch (Exception e) {
	// rs.setStatus(false);
	// rs.setMessage("工单号格式不正确！");
	// LOG.error("[BusLnAppController] singleImp method 加载singleImp方法异常", e);
	// }
	// LOG.info("[BusLnAppController] singleImp method end...");
	// return rs;
	// }

	// 批次推BUS
	@RequestMapping(value = "batchImp")
	@ResponseBody
	public ResultInfo batchImp(HttpServletRequest request, HttpServletResponse response) {
		LOG.info("[BusLnAppController] batchImp method begin...");
		String batchNO = request.getParameter("batchNO");
		ResultInfo rs = new ResultInfo();
		String bus_run_batch = RedisUtils.getObject("BUS_RUN_BATCH");
		if("true".equalsIgnoreCase(bus_run_batch)){
			rs.setStatus(false);
			rs.setMessage("当前有批次正在推送BUS，请稍后操作!");
		}else{
			try {
				Integer length = RedisUtils.getLength(BusReturn.BUS_REDIS_LIST);
				LOG.info("[BusLnAppController] batchImp method redisService.listSize:" + length);
				if (length != null && length > 0) {
					String busBatchNo = RedisUtils.getObject("BUS_BATCH_NO");
					if (StringUtils.isNotBlank(busBatchNo)) {
						if (batchNO.equals(busBatchNo)) {
							rs.setMessage("当前批次正在推送BUS!");
						} else {
							rs.setMessage("当前有批次正在推送BUS，请稍后操作!");
						}
					} else {
						rs.setMessage(String.format("队列中还有%s单正在推送中,请稍后操作!", length));
					}
					rs.setStatus(false);
				} else {
					RedisUtils.putObject("BUS_RUN_BATCH", "true", 10L);
					if (StringUtils.isNotBlank(batchNO)) {
						List<String> ids = busBatchInfoService.selectAppIdsByBatchNO(batchNO);
						List<String> lnAppList = new ArrayList<String>();
						if (ids != null && ids.size() > 0) {
							for(String id:ids){
								lnAppList.add(id+"@"+batchNO);
							}
	//						lnAppList.addAll(ids);
							// 存入批次号
							RedisUtils.putObject("BUS_BATCH_NO", batchNO);
							// 根据批次号查询此批工单是否已经推送过
							BusBatchInfo busBatchInfo = busBatchInfoService.selectByPrimaryKey(batchNO);
							if (busBatchInfo != null && busBatchInfo.getBeginDate() == null) {
								// 更新LnApp状态35->36
								//busLnAppService.updateBatchState35To36(ids);
//								for(String id:ids){
									busLnAppService.updateAppStatus35To36(ids,"36");
//								}
								// 更新数据库当前批次的开始推送时间及sentToBus状态
								busBatchInfoService.updateBeginDateAndSentToBusByBatchNO(batchNO);
							}
							busBatchInfoService.toRedisByBatchNo(batchNO);
							threadPoolTaskExecutor.execute(new SentBusRunnable(lnAppList) {
								@Override
								public void run() {
									RedisUtils.lPush(BusReturn.BUS_REDIS_LIST, this.getLists().toArray());
								}
							});
	
							rs.setStatus(true);
							rs.setMessage("已有" + ids.size() + "笔工单加入待推BUS队列！");
							LOG.info("[BusLnAppController] batchImp method 批次号:" + batchNO + "待推工单共:" + ids.size() + "笔已加入待推BUS队列！");
						} else {
							rs.setStatus(false);
							rs.setMessage("当前批次未找到符合条件工单！");
							LOG.info("[BusLnAppController] batchImp method 批次号:" + batchNO + "未找到符合条件工单！");
						}
					} else {
						rs.setStatus(false);
						rs.setMessage("批次号不能为空！");
					}
				}
			} catch (Exception e) {
				rs.setStatus(false);
				rs.setMessage("发送至BUS失败！");
				LOG.error("[BusLnAppController] batchImp method 加载batchImp方法异常", e);
			}
		}
		LOG.info("[BusLnAppController] batchImp method end...");
		return rs;
	}

	@RequestMapping(value = "closeinfo")
	protected String closeInfo() {
		LOG.info("[BusLnAppController] singleImp method return:" + "bus/colse/closeinfo");
		return "bus/colse/closeinfo";
	}

	/**
	 * 关闭工单
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "close")
	@ResponseBody
	public Result close(HttpServletRequest request, HttpServletResponse response) {
		LOG.info("[BusLnAppController] singleImp method begin...");
		String busAppId = request.getParameter("busAppId");
		String causeDesc = request.getParameter("causeDesc");
		Result result = new Result();
		try {
			if (StringUtils.isBlank(busAppId)) {
				result.error("BUS工单号不能为空");
				return result;
			}
			if (StringUtils.isBlank(causeDesc)) {
				result.error("BUS工单关闭原因不能");
				return result;
			}
			result = busSentService.closeBusLnApp(busAppId, causeDesc);
		} catch (Exception e) {
			result.error("工单关闭失败");
			LOG.error("[BusLnAppController] singleImp metho closed 工单关闭失败", e);
		}
		LOG.info("[BusLnAppController] singleImp method end...");
		return result;
	}

}
