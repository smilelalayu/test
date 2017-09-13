package com.hm.bus.service;

import java.util.List;
import java.util.Map;

import com.gep.core.base.BaseService;
import com.hm.bus.module.BusLnApp;

/**
 * BUS工单处理Service
 * 
 * @author leimeng E-mail: leimeng@9fchaoneng.com
 * @version 创建时间：2017年1月12日 下午3:52:46
 */
public interface BusLnAppService extends BaseService<BusLnApp, Long> {

	public void updateAppStatus(Long appId, String oldstatus, String appState);

	public void updateAppStatus35To36(List<String> ids, String appState);

	/**
	 * 查询推bus失败笔数,待推bus笔数,确认放款状态失败笔数,待推确认放款状态笔数,生成还款计划失败笔数,待生成还款计划笔数
	 * 
	 * @return
	 */
	List<Map<String, Integer>> selectCountMap();

	/**
	 * 查询推送BUS失败笔数，待推BUS笔数
	 * 
	 * @return
	 */
	List<Map<String, Object>> selectBusCountMap();

	/**
	 * 查询确认放款状态失败笔数,待推确认放款状态笔数
	 * 
	 * @return
	 */
	List<Map<String, Object>> selectLoanConfirmCountMap();

	/**
	 * 查询生成还款计划失败笔数,待生成还款计划笔数
	 * 
	 * @return
	 */
	List<Map<String, Object>> selectrepaymentPlanCountMap();

	/**
	 * 查询所有的36失败工单
	 * 
	 * @return
	 */
	List<String> selectAppIds36To32();

	public void updateBatchState35To36(List<String> ids);

	/**
	 * 定时查找现金贷未推工单
	 * 
	 * @return
	 */
	List<String> listCashAppIds();

	/**
	 * 根据工单号查找工单
	 * @param lnAppIdLongList
	 * @return
	 */
	List<BusLnApp> selectByIds(List<Long> lnAppIdLongList);

}
