package com.hm.appinfo.service;



import java.util.List;

import com.gep.core.base.BaseService;
import com.hm.appinfo.model.LnAppStatus;

public interface LnStatusService extends BaseService<LnAppStatus, Long>
{
	
	
	/**
	 * @Method: listAppStatus
	 * @Description: 获取工单状态
	 * @author 
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<LnAppStatus> listAppStatus() throws Exception;
	
	/**
	 * 获取内部工单状态
	 * @param code
	 * @return
	 * @throws Exception
	 */
	public List<String> getTradeNosByCode(String code) throws Exception;
	
	
}
