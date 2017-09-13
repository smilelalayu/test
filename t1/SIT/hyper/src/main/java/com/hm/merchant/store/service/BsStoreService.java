package com.hm.merchant.store.service;

import com.gep.core.base.BaseService;
import com.hm.merchant.store.model.BsStore;
/**
 * 门店
 * @author 洪秋霞
 * 2016年4月26日
 */
public interface BsStoreService extends BaseService<BsStore, Long>{

	
	/**
	 * 跟椐门店id 查询
	 * @Method: getBsStoreById
	 * @param Id 门店id
	 * @return BsStore
	 * @throws Exception
	 */
	public BsStore getBsStoreById(Long Id) throws Exception;
	
}
