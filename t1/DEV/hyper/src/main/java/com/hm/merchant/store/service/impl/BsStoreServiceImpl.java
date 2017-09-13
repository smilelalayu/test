package com.hm.merchant.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.util.ObjectUtils;
import com.hm.merchant.store.dao.BsStoreHmMapper;
import com.hm.merchant.store.model.BsStore;
import com.hm.merchant.store.service.BsStoreService;
/**
 * 门店
 * @author 洪秋霞
 * 2016年4月26日
 */
@Service
public class BsStoreServiceImpl extends BaseServiceImpl<BsStore, Long> implements BsStoreService{

	@Autowired
	private BsStoreHmMapper bsStoreHmMapper;
	
	@Override
	public BaseMapper<BsStore, Long> getMapper() {
		return bsStoreHmMapper;
	}
	
	
	@Override
	public BsStore 	getBsStoreById(Long Id)
	{
		BsStore bsStore=new BsStore();
		bsStore.setId(Id);
		return ObjectUtils.convertObject(bsStoreHmMapper.list(bsStore));
	}

}
