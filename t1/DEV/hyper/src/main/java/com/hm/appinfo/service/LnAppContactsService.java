package com.hm.appinfo.service;

import java.util.List;

import com.gep.core.base.BaseService;
import com.hm.appinfo.model.LnAppContactInfo;

public interface LnAppContactsService extends BaseService<LnAppContactInfo, Long>
{

	List<LnAppContactInfo> listDetail(LnAppContactInfo t) throws Exception;
	
	LnAppContactInfo getLnContractInfoByAppId(Long appId) throws Exception;
}
