package com.hm.appinfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.appinfo.dao.LnAppStatusChangeLogMapper;
import com.hm.appinfo.model.LnAppStatusChangeLog;
import com.hm.appinfo.service.LnAppStatusChangeLogService;

@Service
public class LnAppStatusChangeLogServiceImpl extends BaseServiceImpl<LnAppStatusChangeLog, Long> implements LnAppStatusChangeLogService {
    @Autowired
    private LnAppStatusChangeLogMapper lnAppStatusChangeLogMapper;

    @Override
    public BaseMapper<LnAppStatusChangeLog, Long> getMapper() {
        return lnAppStatusChangeLogMapper;
    }

	@Override
	public LnAppStatusChangeLog querNextStatusByNewStatus(LnAppStatusChangeLog statusLog) {
		return lnAppStatusChangeLogMapper.querNextStatusByNewStatus(statusLog);
	}

}
