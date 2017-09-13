package com.hm.bus.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.entity.Page;
import com.hm.bus.dao.BusSentLogMapper;
import com.hm.bus.module.BusSentLog;
import com.hm.bus.service.BusSentLogService;

/**
 * @author liujie
 * @date 2017/1/12
 * @time 15:55
 * @desc
 */
@Service
public class BusSentLogServiceImpl extends BaseServiceImpl<BusSentLog, Long>
		implements BusSentLogService {
	private static final Logger LOG = Logger
			.getLogger(BusSentLogServiceImpl.class);
	@Autowired
	private BusSentLogMapper busSentLogMapper;

	@Override
	public BaseMapper<BusSentLog, Long> getMapper() {
		return busSentLogMapper;
	}

	@Override
	public Page<BusSentLog> listAll(Page<BusSentLog> page) {
		BusSentLog t = page.getT();
		return super.list(page);
	}
}
