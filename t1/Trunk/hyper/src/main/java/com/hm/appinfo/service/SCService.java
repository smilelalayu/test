package com.hm.appinfo.service;

import java.util.List;

import com.gep.core.entity.Page;
import com.hm.appinfo.model.LnApp;
import com.sc.api.app.vo.LnAppSubsidiary;

public interface SCService {
	/**
	 * 查询工单所有数据
	 * @param lnAppQuery
	 * @return
	 */
	List<com.sc.api.app.model.LnApp> queryLnApp(LnApp lnApp);

	/**
	 * 查询工单附属信息
	 * @param appId
	 * @param subType
	 * @return
	 */
	LnAppSubsidiary queryLnAppSubsidiaryInfo(Long appId, int subType);
	
	public Page<LnApp> queryLnAppList(Page page) throws Exception;
	
}
