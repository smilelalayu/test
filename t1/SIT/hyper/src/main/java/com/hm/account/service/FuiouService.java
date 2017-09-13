package com.hm.account.service;

/**
 * 富友金账户
 * @author hongqiuxia
 *
 */
public interface FuiouService {
	
	/***
	 * 调用风控检查富友接口是否成功
	 * hongqiuxia
	 * 上午11:52:59
	 * @param cardId
	 * @return
	 */
	public String getFuiouResult(String cardId);
	
}
