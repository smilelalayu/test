package com.hm.appinfo.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.appinfo.dao.LnAppStatusHmMapper;
import com.hm.appinfo.model.LnAppStatus;
import com.hm.appinfo.service.LnStatusService;

@Service
public class LnStatusServiceImpl  extends BaseServiceImpl<LnAppStatus, Long> implements LnStatusService
{
	
	@Autowired
	private LnAppStatusHmMapper lnAppStatusMapper;
	
	@Override
	public BaseMapper<LnAppStatus, Long> getMapper() {
		
		return lnAppStatusMapper;
	}
	
	@Override
	public List<LnAppStatus> listAppStatus() throws Exception {
		return lnAppStatusMapper.list();
	}
	
	public List<String> getTradeNosByCode(String code) throws Exception{
		return lnAppStatusMapper.getTradeNosByCode(code);
	}
	
}
