package com.hm.bus.service;

import com.hm.bus.util.Result;

public interface BusSentService {

	/**
	 * 放款成功确认 32->50
	 */
	public void loanConfirmTask();

	/**
	 * 生成还款计划
	 */
	public void updateRepaymentPlan();

	/**
	 * 关闭工单
	 */
	public Result closeBusLnApp(String busAppId, String causeDesc);

	/**
	 * 根据工单号查询批次号
	 * @param busAppId
	 * @return
	 */
	public String selectByLnAppId(String busAppId);
	
	/**
	 * 关闭工单(调用北京)
	 * @param busAppId
	 * @param causeDesc
	 * @return
	 */
	public Result closeBusBjLnApp(String busAppId, String causeDesc);
	
	/**
	 * 关闭工单(调用外联接口)
	 * @param busAppId
	 * @param causeDesc
	 * @return
	 */
	public Result closeBusEipLnApp(String busAppId, String causeDesc);

}
