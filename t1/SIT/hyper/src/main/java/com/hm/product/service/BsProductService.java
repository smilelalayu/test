package com.hm.product.service;

import com.gep.core.base.BaseService;
import com.hm.product.model.BsProduct;

/**
 * 产品
 * @author 洪秋霞
 * 2016年4月27日
 */
public interface BsProductService extends BaseService<BsProduct, Long>
{

	/**
	 * @Method: getBsProductById
	 * @Description: 根据ID获取产品信息
	 * @author qiuyuan
	 * @param id
	 * @return
	 */
	BsProduct getBsProductById(Long id);
}
