package com.hm.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.account.dao.CustAccFyHmMapper;
import com.hm.account.model.CustAccFy;
import com.hm.account.service.CustAccFyService;
/**
 * 富友开户信息对象
 * @author hongqiuxia
 *
 */
@Service
public class CustAccFyServiceImpl extends BaseServiceImpl<CustAccFy, String> implements CustAccFyService {
	public static final String FUIOU_PLATFORM_NO = "cash_fuiou_platform_no";//平台代码
	public static final String FUIOU_OPEN_BANK_CODE = "cash_fuiou_open_bank_code";//开户行地区代码
	
	@Autowired
	private CustAccFyHmMapper custAccFyMapper;
	
	@Override
	public BaseMapper<CustAccFy, String> getMapper() {
		return custAccFyMapper;
	}
}
