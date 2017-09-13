package com.hm.bus.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.entity.Page;
import com.hm.bus.dao.BusLnAppMapper;
import com.hm.bus.dao.LnAppStatuschangelogMapper;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.module.LnAppStatuschangelog;
import com.hm.bus.service.BusLnAppService;

@Service
public class BusLnAppServiceImpl extends BaseServiceImpl<BusLnApp, Long> implements BusLnAppService {

	private static final Logger LOG = Logger.getLogger(BusLnAppServiceImpl.class);

	@Autowired
	private BusLnAppMapper busLnAppMapper;
	@Autowired
	private LnAppStatuschangelogMapper lnAppStatuschangelogMapper;

	@Override
	public Page<BusLnApp> list(Page<BusLnApp> page) {
		BusLnApp t = page.getT();
		return super.list(page);
	}

	@Override
	public BaseMapper<BusLnApp, Long> getMapper() {
		return busLnAppMapper;
	}

	@Override
	public void updateAppStatus(Long appId, String oldstatus, String appState) {
		LOG.info("[BusSentServiceImpl] updateStatus method begin...");

		/**
		 * 更新LnApp表
		 */
		BusLnApp updatelnApp = new BusLnApp();
		// add by leimeng 20170414 保存对内状态编码保存在ln_app表中字段APP_STATUS_INNER
		if ("36".equals(oldstatus) && "32".equals(appState)) {
			updatelnApp.setAppStatusInner("B22");
			updatelnApp.setId(appId);
			updatelnApp.setAppState(appState);
			updatelnApp.setAppStatusName("待放款");
			updatelnApp.setPaidSuccessTime(new Date());
		} else if ("32".equals(oldstatus) && "50".equals(appState)) {
			updatelnApp.setAppStatusInner("B38");
			updatelnApp.setId(appId);
			updatelnApp.setAppState(appState);
			updatelnApp.setAppStatusName("放款成功");
		}
		busLnAppMapper.updateByPrimaryKeySelective(updatelnApp);

		/**
		 * 记录状态扭转日志
		 */
		LnAppStatuschangelog lnAppStatuschangelog = new LnAppStatuschangelog();
		lnAppStatuschangelog.setAppId(appId);
		lnAppStatuschangelog.setStatus(oldstatus);
		lnAppStatuschangelog.setNewStatus(appState);
		lnAppStatuschangelog.setCreatedon(new Date());
		lnAppStatuschangelog.setCreatedby("auto");

		lnAppStatuschangelogMapper.insertSelective(lnAppStatuschangelog);
		
	}
	
	
	@Override
	public void updateAppStatus35To36(List<String> ids, String appState) {
		LOG.info("[BusSentServiceImpl] updateStatus method begin...");

		List<Long> appids = new ArrayList<Long>();
		for(String id:ids){
			appids.add(Long.parseLong(id));
		}
		List<BusLnApp> appList =  busLnAppMapper.selectByIds(appids);

		List<String> updateAppids = new ArrayList<String>();
		for(BusLnApp app:appList){
			String oldstatus = app.getAppState();
			if ("35".equals(oldstatus) && "36".equals(appState)) {
				updateAppids.add(app.getId()+"");
			}
		}
		
		// 35->36 add by leimeng 20170414 保存对内状态编码保存在ln_app表中字段APP_STATUS_INNER
		if(updateAppids.size()>0){
			busLnAppMapper.updateBatchState35To36(updateAppids);
		}

		/**
		 * 记录状态扭转日志
		 */
		for(String id:updateAppids){
			LnAppStatuschangelog lnAppStatuschangelog = new LnAppStatuschangelog();
			lnAppStatuschangelog.setAppId(Long.parseLong(id));
			lnAppStatuschangelog.setStatus("35");
			lnAppStatuschangelog.setNewStatus(appState);
			lnAppStatuschangelog.setCreatedon(new Date());
			lnAppStatuschangelog.setCreatedby("auto");
			lnAppStatuschangelogMapper.insertSelective(lnAppStatuschangelog);
		}
		
	}

	@Override
	public List<Map<String, Integer>> selectCountMap() {

		return busLnAppMapper.selectCountMap();
	}

	@Override
	public List<String> selectAppIds36To32() {
		return busLnAppMapper.selectAppIds36To32();
	}

	@Override
	public void updateBatchState35To36(List<String> ids) {
		busLnAppMapper.updateBatchState35To36(ids);
	}

	/**
	 * @see com.hm.bus.service.BusLnAppService#selectBusCountMap()
	 */
	@Override
	public List<Map<String, Object>> selectBusCountMap() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		int busFialCount = busLnAppMapper.selectBusFailCount();
		if (busFialCount == 0) {
			map.put("busFialFlag", false);
		} else {
			map.put("busFialFlag", true);
		}
		map.put("busFialCount", busFialCount);

		int busWaitCount = busLnAppMapper.selectBusWaitCount();
		if (busWaitCount == 0) {
			map.put("busWaitFlag", false);
		} else {
			map.put("busWaitFlag", true);
		}
		map.put("busWaitCount", busWaitCount);
		list.add(map);

		return list;
	}

	/**
	 * @see com.hm.bus.service.BusLnAppService#selectLoanConfirmCountMap()
	 */
	@Override
	public List<Map<String, Object>> selectLoanConfirmCountMap() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		int loanConfirmFailCount = busLnAppMapper.selectLoanConfirmFailCount();
		if (loanConfirmFailCount == 0) {
			map.put("loanConfirmFailFlag", false);
		} else {
			map.put("loanConfirmFailFlag", true);
		}
		map.put("locfFailCount", loanConfirmFailCount);

		int loanConfirmWaitCount = busLnAppMapper.selectLoanConfirmWaitCount();
		if (loanConfirmWaitCount == 0) {
			map.put("loanConfirmWaitFlag", false);
		} else {
			map.put("loanConfirmWaitFlag", true);
		}
		map.put("locfWaitCount", loanConfirmWaitCount);
		list.add(map);

		return list;
	}

	/**
	 * @see com.hm.bus.service.BusLnAppService#selectLoanAndRepaymentConfirmCountMap()
	 */
	@Override
	public List<Map<String, Object>> selectrepaymentPlanCountMap() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		int repaymentPlanFailCount = busLnAppMapper.selectRepaymentPlanFailCount();
		if (repaymentPlanFailCount == 0) {
			map.put("repaymentPlanFailFlag", false);
		} else {
			map.put("repaymentPlanFailFlag", true);
		}
		map.put("rePlanFailCount", repaymentPlanFailCount);

		int repaymentPlanWailCount = busLnAppMapper.selectRepaymentPlanWaitCount();
		if (repaymentPlanWailCount == 0) {
			map.put("repaymentPlanWailFlag", false);
		} else {
			map.put("repaymentPlanWailFlag", true);
		}
		map.put("rePlanWaitCount", repaymentPlanWailCount);
		list.add(map);

		return list;
	}

	@Override
	public List<String> listCashAppIds() {
		return busLnAppMapper.listCashAppIds();
	}

	@Override
	public List<BusLnApp> selectByIds(List<Long> lnAppIdLongList) {
		return busLnAppMapper.selectByIds(lnAppIdLongList);
	}

}
