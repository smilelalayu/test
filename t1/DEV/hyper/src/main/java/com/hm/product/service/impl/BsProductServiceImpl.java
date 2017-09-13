package com.hm.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.util.ObjectUtils;
import com.hm.product.dao.BsProductHmMapper;
import com.hm.product.model.BsProduct;
import com.hm.product.service.BsProductService;

@Service
public class BsProductServiceImpl extends BaseServiceImpl<BsProduct, Long> implements BsProductService
{

	@Autowired
	private BsProductHmMapper bsProductMapper;

	@Override
	public BaseMapper<BsProduct, Long> getMapper()
	{
		return bsProductMapper;
	}

	@Override
	public BsProduct getBsProductById(Long id) {
		BsProduct t = new BsProduct();
		t.setId(id);
		return ObjectUtils.convertObject(super.list(t));
	}

}
