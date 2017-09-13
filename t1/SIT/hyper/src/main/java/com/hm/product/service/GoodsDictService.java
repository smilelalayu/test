package com.hm.product.service;

import java.util.List;

import com.gep.core.base.BaseService;
import com.hm.product.model.GoodsDict;

/**
 * 货物类别
 * @author 洪秋霞
 * 2016年4月26日
 */
public interface GoodsDictService extends BaseService<GoodsDict, Long>{

	/**
	 * 根据code查询货物类别
	 * @param code
	 * @return
	 * @author 洪秋霞
	 * @date
	 */
	public List<GoodsDict> listByCode(String code);
}
