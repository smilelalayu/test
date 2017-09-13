package com.hm.base.service;

import com.gep.core.base.BaseService;
import com.hm.base.model.SmConfig;

public interface SmConfigService extends BaseService<SmConfig, Long> {

	public SmConfig getOption(String confKey) throws Exception;
	
	public SmConfig getOption(SmConfig smConfig) throws Exception;
}
