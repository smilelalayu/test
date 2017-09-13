package com.hm.appinfo.dao;



import java.util.List;

import com.gep.core.base.BaseMapper;
import com.hm.appinfo.model.LnAppStatus;

public interface LnAppStatusHmMapper extends BaseMapper<LnAppStatus, Long>
{
	List<LnAppStatus> list();
	List<String> getTradeNosByCode(String code);
}