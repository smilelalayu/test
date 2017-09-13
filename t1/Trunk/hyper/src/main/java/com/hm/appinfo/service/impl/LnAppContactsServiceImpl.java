package com.hm.appinfo.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.util.ObjectUtils;
import com.hm.appinfo.dao.LnAppContactInfoHmMapper;
import com.hm.appinfo.model.LnAppContactInfo;
import com.hm.appinfo.service.LnAppContactsService;

@Service
public class LnAppContactsServiceImpl  extends BaseServiceImpl<LnAppContactInfo, Long> implements LnAppContactsService
{
	
	@Autowired
	private LnAppContactInfoHmMapper lnContractInfoMapper;
	@Override
	public BaseMapper<LnAppContactInfo, Long> getMapper()
	{
		return lnContractInfoMapper;
	}
	@Override
	public List<LnAppContactInfo> listDetail(LnAppContactInfo t) throws Exception
	{
		return lnContractInfoMapper.listDetail(t);
	}
	@Override
	public LnAppContactInfo getLnContractInfoByAppId(Long appId) throws Exception
	{
		LnAppContactInfo t = new LnAppContactInfo();
		t.setAppId(appId);
		return ObjectUtils.convertObject(super.list(t));
	}

	
}
