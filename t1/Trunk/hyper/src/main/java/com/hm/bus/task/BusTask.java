//package com.hm.bus.task;
//
//import java.util.List;
//
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import com.hm.bus.module.BusLnApp;
//import com.hm.bus.service.BusLnAppService;
//import com.hm.bus.service.BusSentService;
//
///**
// * 推BUS定时任务器
// * 
// * @author leimeng E-mail: leimeng@9fchaoneng.com
// * @version 创建时间：2017年1月16日 上午11:43:46
// */
//@Component
//public class BusTask {
//	private static final Logger LOG = Logger.getLogger(BusTask.class);
//
//	@Autowired
//	private BusLnAppService busLnAppService;
//	
//	@Autowired
//	private BusSentService busSentService;
//
//	/**
//	 * 定时更新放款成功标识，每隔30分钟更新一次，整点0分/30分执行
//	 */
//	// cron = "0 0/30 * * * ? " cron = "0/10 * *  * * ? "
//	@Scheduled(cron = "0/60 * *  * * ? ")
//	public void updateLnAppLoanSuccess() {
//		LOG.info("[BusTask] updateLnAppLoanSuccess method begin...");
//		busSentService.runTaskThree("admin");
//		busSentService.runTaskFour();
//		// 第一步：获取获取已经转32状态的工单列表
//		List<BusLnApp> busLnAppList = busLnAppService.queryLoanSuccessBusLnAppList();
//		LOG.info("[BusTask] updateLnAppLoanSuccess method 有[" + busLnAppList.size() + "]笔工单需更新状态!");
//
//		// TODO 第二步：调用接口，获取放宽成功标识
//
//		// 第三步：更新工单状态32-->50
//		Long lnAppID = 0000L;
//		boolean flag = busLnAppService.updateLnAppLoanSuccessState(lnAppID);
//		if (flag) {
//			LOG.info("[BusTask] updateLnAppLoanSuccess method 工单号[" + lnAppID + "]成功放款,更新工单状态为50!");
//		} else {
//			LOG.error("[BusTask] updateLnAppLoanSuccess method 工单号[" + lnAppID + "]成功放款,更新工单状态为50失败!");
//		}
//		LOG.info("[BusTask] updateLnAppLoanSuccess method end...");
//	}
//
//}
