package com.hm.bus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gep.core.base.BaseMapper;
import com.hm.bus.module.BusLnApp;

@Repository
public interface BusLnAppMapper extends BaseMapper<BusLnApp, Long> {

	BusLnApp selectByPrimaryKey(Long id);

	List<BusLnApp> selectByIds(@Param("ids") List<Long> ids);

	int updateByPrimaryKeySelective(BusLnApp record);

	String selectBusProductId(Long id);

	/**
	 * 根据BUS工单号查询超能工单
	 * 
	 * @param busAppId
	 * @return
	 */
	BusLnApp selectByBusAppId(Long busAppId);

	List<BusLnApp> selectListByAppState(@Param("appState") String appState);

	List<Map<String, Object>> selectBusProductIdByBatchNo(String batchNo);

	List<Map<String, Object>> selectBusProductIdById(String id);

	List<Map<String, Object>> selectBusProductIdByAppState(
			@Param("appState") String appState);

	/**
	 * 单笔更新状态
	 * 
	 * @param appState
	 * @param lnAppId
	 * @return
	 */
	int updateLnAppState(String appState, Long lnAppId);

	/**
	 * 批量更新状态
	 * 
	 * @param list
	 */
	void updateBatchState35To36(@Param("list") List<String> list);

	int updatePaidSuccessTimeById(Map<String, Object> params);

	/**
	 * 查询待确认放款状态工单记录
	 * 
	 * @return
	 */
	List<BusLnApp> selectSendBusLnAppList();

	/**
	 * 查询待生成还款计划工单记录
	 * 
	 * @return
	 */
	List<BusLnApp> selectRepaymentLnAppList();

	/**
	 * 查询推bus失败笔数,待推bus笔数,确认放款状态失败笔数,待推确认放款状态笔数,生成还款计划失败笔数,待生成还款计划笔数
	 * 
	 * @return
	 */
	List<Map<String, Integer>> selectCountMap();
	
	/**
	 * 查询BUS失败笔数
	 * 
	 * @return
	 */
	int selectBusFailCount();
	
	/**
	 * 查询待推BUS笔数
	 * 
	 * @return
	 */
	int selectBusWaitCount();
	
	/**
	 * 查询确认放款状态失败笔数
	 * 
	 * @return
	 */
	int selectLoanConfirmFailCount();
	
	/**
     * 查询待推确认放款状态笔数
     * 
     * @return
     */
    int selectLoanConfirmWaitCount();
    
    /**
     * 查询确认放款状态失败笔数
     * 
     * @return
     */
    int selectRepaymentPlanFailCount();
    
    /**
     * 查询待生成还款计划笔数
     * 
     * @return
     */
    int selectRepaymentPlanWaitCount();

	/**
	 * 返回所有的36失败工单
	 * @return
	 */
	List<String> selectAppIds36To32();
	
	int updateList(List<BusLnApp> list);
	/**
	 * 定时查找现金贷未推工单
	 * 
	 * @return
	 */
	List<String> listCashAppIds();
}