package com.hm.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.product.dao.GoodsDictHmMapper;
import com.hm.product.model.GoodsDict;
import com.hm.product.service.GoodsDictService;
/**
 * 货物类别
 * @author 洪秋霞
 * 2016年4月26日
 */
@Service
public class GoodsDictServiceImpl extends BaseServiceImpl<GoodsDict, Long> implements GoodsDictService{

	@Autowired
	private GoodsDictHmMapper bsGoodsCategoryMapper;
	
	@Override
	public BaseMapper<GoodsDict, Long> getMapper() {
		return bsGoodsCategoryMapper;
	}

	/**
	 * 根据code查询货物类别
	 * @param code
	 * @return
	 * @author 洪秋霞
	 * @date
	 */
	@Override
	public List<GoodsDict> listByCode(String code) {
		return bsGoodsCategoryMapper.listByCode(code);
	}

}
