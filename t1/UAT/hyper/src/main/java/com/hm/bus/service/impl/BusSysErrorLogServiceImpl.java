package com.hm.bus.service.impl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.entity.Page;
import com.hm.bus.dao.BusSysErrorLogMapper;
import com.hm.bus.module.BusSysErrorLog;
import com.hm.bus.service.BusSysErrorLogService;

@Service
public class BusSysErrorLogServiceImpl extends BaseServiceImpl<BusSysErrorLog, Long>
implements BusSysErrorLogService{ 

	@Autowired
	private BusSysErrorLogMapper busSysErrorLogMapper;

	@Override
	public void saveError(Object message) {
		BusSysErrorLog errlog = new BusSysErrorLog();
		errlog.setErrMsg(message.toString());
		errlog.setUpdateTime(new Date());
		busSysErrorLogMapper.insertSelective(errlog);
	}

	@Override
	public void saveError(Object message, Throwable e) {
		BusSysErrorLog errlog = new BusSysErrorLog();
		errlog.setErrMsg(message.toString());
		
		
		StringWriter sw = new StringWriter();
	    PrintWriter pw = new PrintWriter(sw, true);
	    e.printStackTrace(pw);
		String errstr = sw.toString();
		String errString = errstr.substring(0, (errstr.length() < 500 ?errstr.length() : 500))+" ......";
		errlog.setErrThrowable(errString);
		errlog.setUpdateTime(new Date());
		busSysErrorLogMapper.insertSelective(errlog);
	}
	@Override
	public BaseMapper<BusSysErrorLog, Long> getMapper() {
		return busSysErrorLogMapper;
	}

	@Override
	public Page<BusSysErrorLog> listAll(Page<BusSysErrorLog> page) {
		BusSysErrorLog t = page.getT();
		return super.list(page);
	}

}
