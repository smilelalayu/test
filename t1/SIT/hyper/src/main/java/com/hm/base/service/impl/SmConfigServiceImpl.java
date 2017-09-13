package com.hm.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.base.dao.SmConfigHmMapper;
import com.hm.base.model.SmConfig;
import com.hm.base.service.SmConfigService;

@Service
public class SmConfigServiceImpl extends BaseServiceImpl<SmConfig, Long> implements SmConfigService{

	@Autowired
	private SmConfigHmMapper smConfigMapper;
	
	@Override
	public BaseMapper<SmConfig, Long> getMapper() {
		return smConfigMapper;
	}

	@Override
	public SmConfig getOption(String confKey) throws Exception {
		return smConfigMapper.getOption(confKey);
	}

	@Override
	public SmConfig getOption(SmConfig smConfig) throws Exception
	{
		List<SmConfig> list = smConfigMapper.getOptions(smConfig);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
