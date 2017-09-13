package com.hm.appinfo.dao;

import java.util.List;

import com.gep.core.base.BaseMapper;
import com.hm.appinfo.model.LnAppCustInfo;

public interface LnAppCustInfoHmMapper extends BaseMapper<LnAppCustInfo, Long>
{
	List<LnAppCustInfo> listUnionJjCode(LnAppCustInfo t);

}