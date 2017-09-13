package com.hm.appinfo.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.util.ObjectUtils;
import com.hm.appinfo.dao.LnAppCustInfoHmMapper;
import com.hm.appinfo.model.LnAppCustInfo;
import com.hm.appinfo.service.LnAppCustInfoService;

@Service
public class LnAppCustInfoServiceImpl  extends BaseServiceImpl<LnAppCustInfo, Long> implements LnAppCustInfoService
{
	
	@Autowired
	private LnAppCustInfoHmMapper lnAppCustInfoMapper;
	
	@Override
	public BaseMapper<LnAppCustInfo, Long> getMapper() {
		
		return lnAppCustInfoMapper;
	}
	
	@Override
	public LnAppCustInfo listCustInfoUnionJjCode(Long appId) throws Exception {
		LnAppCustInfo t = new LnAppCustInfo();
		t.setAppId(appId);
		return ObjectUtils.convertObject(lnAppCustInfoMapper.listUnionJjCode(t));
	}

	
}
