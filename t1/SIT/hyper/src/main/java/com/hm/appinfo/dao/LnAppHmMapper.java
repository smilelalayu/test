package com.hm.appinfo.dao;



import java.util.List;
import java.util.Map;

import com.gep.core.base.BaseMapper;
import com.gep.core.entity.Page;
import com.hm.appinfo.model.LnApp;

public interface LnAppHmMapper extends BaseMapper<LnApp, Long>
{

	List<LnApp> listUnionProcess(Page<LnApp> page, LnApp t);

	Long getTotalCount(Map<String, Object> map);

	List<LnApp> listUnionBankInfo(LnApp t);
	
	int updateAppStatus(LnApp lnApp);
	
	
}