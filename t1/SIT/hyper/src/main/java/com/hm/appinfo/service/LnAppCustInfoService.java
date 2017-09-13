package com.hm.appinfo.service;

import com.gep.core.base.BaseService;
import com.hm.appinfo.model.LnAppCustInfo;
/**
 * 客户基本信息
 * @author 洪秋霞
 * 2016年4月29日
 */
public interface LnAppCustInfoService extends BaseService<LnAppCustInfo, Long>
{
	
	/**
	 * 
	 * @Title listCustInfoUnionJjCode
	 * @Description 查询客户信息
	 * @param 
	 * @param 
	 * @param 
	 * @return LnAppCustInfo
	 * @throws
	 */
	public LnAppCustInfo listCustInfoUnionJjCode(Long appId) throws Exception;
	
}
