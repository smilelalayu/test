package com.hm.appinfo.dao;

import com.gep.core.base.BaseMapper;
import com.hm.appinfo.model.LnAppStatusChangeLog;

public interface LnAppStatusChangeLogMapper extends BaseMapper<LnAppStatusChangeLog,Long>{
	
	public LnAppStatusChangeLog querNextStatusByNewStatus(LnAppStatusChangeLog statusLog);

}