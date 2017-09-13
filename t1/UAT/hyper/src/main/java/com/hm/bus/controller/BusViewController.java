package com.hm.bus.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gep.core.base.BaseController;
import com.gep.core.util.RedisUtils;
import com.gep.core.util.StringUtil;
import com.hm.bus.constants.BusReturn;
import com.hm.bus.module.BusLnAppBatchMapping;
import com.hm.bus.service.BusLnAppService;
import com.hm.bus.service.BusSentService;
import com.hm.bus.util.ResultInfo;
import com.hm.bus.util.SentBusRunnable;

/**
 * BUS总览
 * 
 * @author leimeng E-mail: leimeng@9fchaoneng.com
 * @version 创建时间：2017年1月20日 下午5:44:50
 */
@Controller
@RequestMapping("/bus/view")
public class BusViewController extends BaseController {

	private static final Logger LOG = Logger.getLogger(BusViewController.class);

	@Autowired
	private BusSentService busSentService;
	@Autowired
	private BusLnAppService busLnAppService;
	@Resource
	private ThreadPoolTaskExecutor threadPoolTaskExecutor;

	/**
	 * 推BUS总揽
	 * 
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "infopage")
	public String infopage(ModelMap model) {
		LOG.info("[BusViewController] infopage method begin...");
		try {
			// 获取任务执行状态,控制Button
			String BUS_LOAN_CONFIRM = RedisUtils.getObject("BUS_TASK", "BUS_LOAN_CONFIRM");
			String BUS_UPDATE_REPAYMENT_PLAN = RedisUtils.getObject("BUS_TASK", "BUS_UPDATE_REPAYMENT_PLAN");
			LOG.info("[BusViewController] infopage method BUS_LOAN_CONFIRM:" + BUS_LOAN_CONFIRM + " ,BUS_UPDATE_REPAYMENT_PLAN" + BUS_UPDATE_REPAYMENT_PLAN);
//			List<Map<String, Integer>> count = busLnAppService.selectCountMap();
//			Map<String, Integer> rsMap = new HashMap<String, Integer>();
//			for (Map<String, Integer> map : count) {
//				String key = map.get("flag") + "";
//				Integer val = Integer.valueOf(map.get("ct") + "");
//				rsMap.put(key, val);
//			}

//			Set<String> keys = rsMap.keySet();
//			Iterator<String> it = keys.iterator();
//			while (it.hasNext()) {
//				String key = it.next();
//				model.addAttribute(key, rsMap.get(key));
//			}
//			// 控制按钮是否显示
			if (StringUtil.isBlank(BUS_LOAN_CONFIRM)) {
				BUS_LOAN_CONFIRM = "false";
			}
			if (StringUtil.isBlank(BUS_UPDATE_REPAYMENT_PLAN)) {
				BUS_UPDATE_REPAYMENT_PLAN = "false";
			}
			model.addAttribute("loanflag", BUS_LOAN_CONFIRM);
			model.addAttribute("repaymentflag", BUS_UPDATE_REPAYMENT_PLAN);
		} catch (Exception e) {
			LOG.error("[BusViewController] infopage method 加载infopage页面异常", e);
		}
		return "/bus/view/infopage";
	}
	
	/**
     * 查询推BUS失败统计和待放款统计
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "busFailCount")
    @ResponseBody
    public ResultInfo busFailCount(HttpServletRequest request, HttpServletResponse response) {
        LOG.info("[BusViewController] busFailCount method begin...");
        ResultInfo rs = new ResultInfo();
        try {

            String BUS_LOAN_CONFIRM = RedisUtils.getObject("BUS_TASK", "BUS_LOAN_CONFIRM");
            LOG.info("[BusViewController] busFailCount method BUS_LOAN_CONFIRM:" + BUS_LOAN_CONFIRM);
            List<Map<String, Object>> count = busLnAppService.selectBusCountMap();
            rs.setStatus(true);
            rs.setMessage("查询推BUS统计成功");
            rs.setData(count.get(0));
        } catch (Exception e) {
            rs.setStatus(false);
            rs.setMessage("查询推BUS笔数失败");
            LOG.error("[BusViewController] busFailCount method 查询推BUS笔数失败", e);
        }

        LOG.info("[BusViewController] busFailCount method end");
        return rs;
    }
    
    /**
     * 查询放款失败统计和待放款统计
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "loanConfirmCount")
    @ResponseBody
    public ResultInfo loanConfirmCount(HttpServletRequest request, HttpServletResponse response) {
        LOG.info("[BusViewController] loanConfirmCount method begin...");
        ResultInfo rs = new ResultInfo();
        try {

            String BUS_LOAN_CONFIRM = RedisUtils.getObject("BUS_TASK", "BUS_LOAN_CONFIRM");
            LOG.info("[BusViewController] loanConfirmCount method BUS_LOAN_CONFIRM:" + BUS_LOAN_CONFIRM);
            List<Map<String, Object>> count = busLnAppService.selectLoanConfirmCountMap();
            rs.setStatus(true);
            rs.setMessage("查询放款统计成功");
            rs.setData(count.get(0));
        } catch (Exception e) {
            rs.setStatus(false);
            rs.setMessage("查询放款统计失败");
            LOG.error("[BusViewController] loanConfirmCount method 查询放款统计失败", e);
        }

        LOG.info("[BusViewController] loanConfirmCount method end");
        return rs;
    }
    
    /**
     * 查询查询生成还款计划统计和待生成还款计划统计
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "repaymentPlanCount")
    @ResponseBody
    public ResultInfo repaymentPlanCount(HttpServletRequest request, HttpServletResponse response) {
        LOG.info("[BusViewController] repaymentPlanCount method begin...");
        ResultInfo rs = new ResultInfo();
        try {

            String BUS_LOAN_CONFIRM = RedisUtils.getObject("BUS_TASK", "BUS_LOAN_CONFIRM");
            LOG.info("[BusViewController] repaymentPlanCount method BUS_LOAN_CONFIRM:" + BUS_LOAN_CONFIRM);
            List<Map<String, Object>> count = busLnAppService.selectrepaymentPlanCountMap();
            rs.setStatus(true);
            rs.setMessage("查询生成还款计划统计成功");
            rs.setData(count.get(0));
//            throw new RuntimeException("测试");
        } catch (Exception e) {
            rs.setStatus(false);
            rs.setMessage("查询生成还款计划统计失败");
            LOG.error("[BusViewController] repaymentPlanCount method 查询生成还款计划统计失败", e);
        }

        LOG.info("[BusViewController] repaymentPlanCount method end");
        return rs;
    }

	/**
	 * 确认放款状态任务 32->50
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "LoanConfirm")
	@ResponseBody
	public ResultInfo LoanConfirm(HttpServletRequest request, HttpServletResponse response) {
		LOG.info("[BusViewController] LoanConfirm method begin...");
		ResultInfo rs = new ResultInfo();
		try {

			String BUS_LOAN_CONFIRM = RedisUtils.getObject("BUS_TASK", "BUS_LOAN_CONFIRM");
			LOG.info("[BusViewController] LoanConfirm method BUS_LOAN_CONFIRM:" + BUS_LOAN_CONFIRM);
			/**
			 * 判断是否任务执行中<br>
			 * 如果没有,异步去执行任务<br>
			 * 如果有,直接跳过
			 */
			if ("false".equals(BUS_LOAN_CONFIRM) || StringUtil.isBlank(BUS_LOAN_CONFIRM)) {
				threadPoolTaskExecutor.execute(new Runnable() {
					@Override
					public void run() {
						busSentService.loanConfirmTask();
					}
				});
				rs.setStatus(true);
				rs.setMessage("启动确认放款状态任务成功!");
			} else {
				rs.setStatus(false);
				rs.setMessage("正在执行中,请稍等!");
			}
		} catch (Exception e) {
			rs.setStatus(false);
			rs.setMessage("启动确认放款状态任务失败!");
			RedisUtils.putObject("BUS_TASK", "BUS_LOAN_CONFIRM", "false", 21600000L);
			LOG.error("[BusViewController] LoanConfirm method 启动确认放款状态任务失败", e);
		}

		LOG.info("[BusViewController] LoanConfirm method end");
		return rs;
	}

	/**
	 * 生成还款计划
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "repaymentPlan")
	@ResponseBody
	public ResultInfo repaymentPlan(HttpServletRequest request, HttpServletResponse response) {
		LOG.info("[BusViewController] repaymentPlan method begin...");
		ResultInfo rs = new ResultInfo();
		try {
			String BUS_UPDATE_REPAYMENT_PLAN = RedisUtils.getObject("BUS_TASK", "BUS_UPDATE_REPAYMENT_PLAN");
			LOG.info("[BusViewController] repaymentPlan method BUS_UPDATE_REPAYMENT_PLAN" + BUS_UPDATE_REPAYMENT_PLAN);
			/**
			 * 判断是否任务执行中<br>
			 * 如果没有,异步去执行任务<br>
			 * 如果有,直接跳过
			 */
			if ("false".equals(BUS_UPDATE_REPAYMENT_PLAN) || StringUtil.isBlank(BUS_UPDATE_REPAYMENT_PLAN)) {
				threadPoolTaskExecutor.execute(new Runnable() {
					@Override
					public void run() {
						busSentService.updateRepaymentPlan();
					}
				});
				rs.setStatus(true);
				rs.setMessage("启动生成还款计划任务成功!");
			} else {
				rs.setStatus(false);
				rs.setMessage("正在执行中,请稍等!");
			}

		} catch (Exception e) {
			rs.setStatus(false);
			rs.setMessage("启动确认放款状态任务失败!");
			LOG.error("[BusViewController] repaymentPlan method 启动生成还款计划任务失败", e);
		}

		LOG.info("[BusViewController] repaymentPlan method end");
		return rs;
	}

	/**
	 * 确认放款状态及生成还款计划任务 32->50->isRepaymentSuccess
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "LoanAndRepaymentConfirm")
	@ResponseBody
	public ResultInfo LoanAndRepaymentConfirm(HttpServletRequest request, HttpServletResponse response) {
		LOG.info("[BusViewController] LoanAndRepaymentConfirm method begin...");
		ResultInfo rs = new ResultInfo();
		try {

			String BUS_LOAN_CONFIRM = RedisUtils.getObject("BUS_TASK", "BUS_LOAN_CONFIRM");
			String BUS_UPDATE_REPAYMENT_PLAN = RedisUtils.getObject("BUS_TASK", "BUS_UPDATE_REPAYMENT_PLAN");
			LOG.info("[BusViewController] LoanAndRepaymentConfirm method BUS_LOAN_CONFIRM:" + BUS_LOAN_CONFIRM + " ,BUS_UPDATE_REPAYMENT_PLAN" + BUS_UPDATE_REPAYMENT_PLAN);
			/**
			 * 判断是否任务执行中<br>
			 * 如果没有,异步去执行任务<br>
			 * 如果有,直接跳过
			 */
			if (!"true".equals(BUS_LOAN_CONFIRM) && !"true".equals(BUS_UPDATE_REPAYMENT_PLAN)) {

				threadPoolTaskExecutor.execute(new Runnable() {
					@Override
					public void run() {
						busSentService.loanConfirmTask();
						busSentService.updateRepaymentPlan();
					}
				});
				rs.setStatus(true);
				rs.setMessage("启动确认放款状态及任务成功!");
			} else {
				rs.setStatus(false);
				rs.setMessage("正在执行中,请稍等!");
			}
		} catch (Exception e) {
			rs.setStatus(false);
			rs.setMessage("启动确认放款状态任务失败!");
			LOG.error("[BusViewController] LoanConfirm method 启动确认放款状态任务失败", e);
		}

		LOG.info("[BusViewController] LoanConfirm method end");
		return rs;
	}

	// 所有36失败工单推BUS
	@RequestMapping(value = "fail36ToBus")
	@ResponseBody
	public ResultInfo fail36ToBus(HttpServletRequest request, HttpServletResponse response) {
		LOG.info("[BusViewController] fail36ToBus method begin...");
		ResultInfo rs = new ResultInfo();
		try {
			Integer length = RedisUtils.getLength(BusReturn.BUS_REDIS_LIST);

			LOG.info("[BusViewController] fail36ToBus method redisService.listLength:" + length);
			if (length != null && length > 0) {
				rs.setStatus(false);
				rs.setMessage(String.format("队列中还有%s单正在推送中,请稍后操作", length));
			} else {
				List<String> ids = busLnAppService.selectAppIds36To32();
				List<String> lnAppList = new ArrayList<String>();
				if (ids != null && ids.size() > 0) {
					for (String id : ids) {
						String bn = busSentService.selectByLnAppId(id + "");
						lnAppList.add(id + "@" + bn);
					}
					RedisUtils.removeObject("BUS_BATCH_NO");
					threadPoolTaskExecutor.execute(new SentBusRunnable(lnAppList) {
						@Override
						public void run() {
							RedisUtils.lPush(BusReturn.BUS_REDIS_LIST, this.getLists().toArray());
						}
					});

					rs.setStatus(true);
					rs.setMessage("已有" + ids.size() + "笔工单加入待推BUS队列!");
					LOG.info("[BusViewController] fail36ToBus method 失败工单共:" + ids.size() + "笔已加入待推BUS队列!");
				} else {
					rs.setStatus(false);
					rs.setMessage("未找到符合条件工单！");
					LOG.info("[BusViewController] fail36ToBus method 未找到符合条件工单!");
				}
			}
		} catch (Exception e) {
			rs.setStatus(false);
			rs.setMessage("推送异常");
			LOG.error("[BusViewController] fail36ToBus method 加载all方法异常", e);
		}
		LOG.info("[BusViewController] fail36ToBus method end...");
		return rs;
	}
}
