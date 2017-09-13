package com.hm.appinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.util.InputChecker;
import com.hm.appinfo.dao.LnAppCalcInfoMapper;
import com.hm.appinfo.model.LnAppCalcInfo;
import com.hm.appinfo.service.LnAppCalcInfoService;

/**
 * 合同信息
 * @author fdl
 * 2017年6月30日
 */
@Service
public class LnAppCalcInfoServiceImpl extends BaseServiceImpl<LnAppCalcInfo, Long> implements LnAppCalcInfoService
{

	@Autowired
	private LnAppCalcInfoMapper lnAppCalcInfoMapper;
	
	@Override
	public BaseMapper<LnAppCalcInfo, Long> getMapper()
	{
		return lnAppCalcInfoMapper;
	}

	@Override
	public LnAppCalcInfo selectByAppId(Long appId) throws Exception {
		LnAppCalcInfo calcInfo = new LnAppCalcInfo();
		calcInfo.setAppId(appId);
		List<LnAppCalcInfo>  list = lnAppCalcInfoMapper.list(calcInfo);
		if(InputChecker.isEmpty(list)){
			return null;
		}
		return list.get(0);
	}
	
}
