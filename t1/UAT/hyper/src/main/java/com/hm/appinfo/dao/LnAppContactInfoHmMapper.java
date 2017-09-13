package com.hm.appinfo.dao;

import java.util.List;

import com.gep.core.base.BaseMapper;
import com.hm.appinfo.model.LnAppContactInfo;

public interface LnAppContactInfoHmMapper extends BaseMapper<LnAppContactInfo, Long>
{
	List<LnAppContactInfo> listDetail(LnAppContactInfo t);
	
}