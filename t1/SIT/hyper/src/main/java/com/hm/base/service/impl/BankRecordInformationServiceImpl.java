package com.hm.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.base.dao.BankRecordInformationHmMapper;
import com.hm.base.model.BankRecordInformation;
import com.hm.base.service.BankRecordInformationService;

@Service
public class BankRecordInformationServiceImpl extends BaseServiceImpl<BankRecordInformation, Long> implements BankRecordInformationService  	
{
	@Autowired
	private BankRecordInformationHmMapper bankRecordInformationMapper;

	@Override
	public BaseMapper<BankRecordInformation, Long> getMapper()
	{
		return bankRecordInformationMapper;
	}


}
