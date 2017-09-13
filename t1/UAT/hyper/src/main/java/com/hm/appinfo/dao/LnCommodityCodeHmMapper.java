package com.hm.appinfo.dao;

import java.util.List;

import com.gep.core.base.BaseMapper;
import com.hm.appinfo.model.LnCommodityCode;

public interface LnCommodityCodeHmMapper extends BaseMapper<LnCommodityCode, Long> {
    
	List<LnCommodityCode> list(LnCommodityCode lnCommodityCode);
	
	int attachDelete(LnCommodityCode lnCommodityCode);
	
}