package com.hm.bus.service;

import com.gep.core.base.BaseService;
import com.hm.bus.module.BusLnApp;

public interface BusCallWanCardService extends  BaseService<Object, Long> {
 
	/**
	 * 调用万卡额度系统接口获取额度系统编号
	 * @param mobile
	 * @param certId
	 * @return
	 */
	public String callWanCardService(BusLnApp busLnApp);
}
