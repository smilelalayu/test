package com.hm.base.dao;

import java.util.List;

import com.gep.core.base.BaseMapper;
import com.hm.base.model.SmConfig;

public interface SmConfigHmMapper extends BaseMapper<SmConfig, Long> {
    
	public SmConfig getOption(String confKey) throws Exception;
	
	public List<SmConfig> getOptions(SmConfig smConfig) throws Exception;
}