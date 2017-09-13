package com.hm.appinfo.service;



import java.util.List;

import com.gep.core.base.BaseService;
import com.gep.core.entity.Page;
import com.gep.core.entity.Result;
import com.gep.sys.model.UserInfo;
import com.hm.appinfo.model.LnApp;
import com.hm.appinfo.model.LnAppCash;

public interface LnAppService extends BaseService<LnApp, Long>
{
	
	/**
	 * @Method: listUnionProcess
	 * @Description: 查询列表包含审核状态结果
	 * @author 
	 * @param page
	 * @return
	 * @throws Exception
	 */
	Page<LnApp> listUnionProcess(Page<LnApp> page) throws Exception;

	public LnApp getLnAppByIdUnionBankInfo(Long appId) throws Exception;
	
	public List<LnApp> listUnionBankInfo(LnApp t) throws Exception;
	
	/**
	 * 查询工单数据
	 * @param lnApp
	 * @return
	 */
	List<com.sc.api.app.model.LnApp> queryLnAppSC(LnApp lnApp);
	
	
	LnAppCash selectCashInfoByAppId(Long appId);
	
	// 通过工单ID修改工单状态
	Boolean updateAppStatus(LnApp lnApp,UserInfo userInfo);
	
	/**
	 * 取消撤掉
	 * @param appDetail
	 * @param userInfo
	 * @throws Exception
	 */
	public void updateBackCancelAppStatus(LnApp appDetail,UserInfo userInfo) throws Exception;
	
	/**
	 * @Method: runUpdateDelayRefuse
	 * @Description:工单延时拒绝
	 * @author fdl
	 * @throws Exception
	 */
	public void runUpdateDelayRefuse() throws Exception;
	
	/**
	 * @Method: runUpdateRevoke
	 * @Description:工单撤销
	 * @author fdl
	 * @throws Exception
	 */
	public void runUpdateRevoke() throws Exception;
	
	public Result updateRevokeAppStatus(Long appId ,UserInfo userInfo) throws Exception;
}
