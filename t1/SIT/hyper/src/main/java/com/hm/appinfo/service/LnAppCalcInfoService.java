package com.hm.appinfo.service;

import com.gep.core.base.BaseService;
import com.hm.appinfo.model.LnAppCalcInfo;

/**
 * 工单合同试算
 * @author fdl
 * 2017年6月30日
 */
public interface LnAppCalcInfoService extends BaseService<LnAppCalcInfo, Long>
{

	/**
	 * 根据工单号查询试算信息
	 * @param appId
	 * @return
	 * @throws Exception
	 * LnAppCalcInfo
	 */
	public LnAppCalcInfo selectByAppId(Long appId)throws Exception;
}
