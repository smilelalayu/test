package com.hm.fk.service;
import com.fk.api.model.LnAppModel;
import com.gep.core.entity.Result;
import com.hm.appinfo.model.LnApp;
public interface FKService {
	/**
	 * 工单提交调用风控系统
	 * @param appId
	 * @param clientIp
	 * @param loginName
	 * @param model
	 */
	public Boolean lnAppRuleCheck(LnApp lnApp ,String clientIp,String loginName,LnAppModel model);
	/**
	 *  
	 *验证bus规则进件和数据检查
	 * @param fkTpModel
	 * @param rs
	 */
	public Result validateBusRuleAndData(Result rs,LnApp lnApp);
	
	/**
	 * 重发风控Service
	 * @param request
	 * @param model
	 * @param appId
	 */
	public Result reSendFK(String clientIp, Long appId, String loginName,LnApp lnApp);
	
}
