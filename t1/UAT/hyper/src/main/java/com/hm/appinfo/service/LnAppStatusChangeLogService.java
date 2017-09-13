package com.hm.appinfo.service;

import com.gep.core.base.BaseService;
import com.hm.appinfo.model.LnAppStatusChangeLog;

public interface LnAppStatusChangeLogService extends BaseService<LnAppStatusChangeLog,Long>
{

	public LnAppStatusChangeLog querNextStatusByNewStatus(LnAppStatusChangeLog statusLog);
}
