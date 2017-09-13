package com.hm.onecard.service;



import com.gep.core.base.BaseService;
import com.hm.appinfo.model.LnApp;

public interface LnAppOneCardService extends BaseService<LnApp, Long>
{
	

	/**
	 * @Method: reSendOneCardBatch
	 * @Description: 批量重发万卡
	 * @author 
	 * @param 
	 * @return
	 * @throws Exception
	 */
	public String reSendOneCardBatch() throws Exception;
	
	
}
