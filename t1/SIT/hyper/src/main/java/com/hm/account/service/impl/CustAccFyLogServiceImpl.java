/**
 * 
 */
package com.hm.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.account.dao.CustAccFyLogHmMapper;
import com.hm.account.model.CustAccFyLog;
import com.hm.account.service.CustAccFyLogService;

/**
 * @author hongqiuxia
 * 下午3:11:13
 */
@Service
public class CustAccFyLogServiceImpl extends BaseServiceImpl<CustAccFyLog, Long> implements CustAccFyLogService{

	@Autowired
	private CustAccFyLogHmMapper custAccFyLogMapper;
	
	@Override
	public BaseMapper<CustAccFyLog, Long> getMapper() {
		return custAccFyLogMapper;
	}
	
}
