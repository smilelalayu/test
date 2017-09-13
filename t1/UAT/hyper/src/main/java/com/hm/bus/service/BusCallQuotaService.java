package com.hm.bus.service;

import com.gep.core.base.BaseService;
import com.hm.bus.module.BusLnApp;

public interface BusCallQuotaService  extends  BaseService<Object, Long>{
	/**
	 * 触发SC圈存额度接口
	 * @param busLnApp 
	 * @return
	 */
	public Boolean callQuotaService(BusLnApp busLnApp);
}
