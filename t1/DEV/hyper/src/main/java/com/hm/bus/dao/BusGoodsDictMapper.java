package com.hm.bus.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.gep.core.base.BaseMapper;
import com.hm.bus.module.BusGoodsDict;

@Repository
public interface BusGoodsDictMapper extends BaseMapper<BusGoodsDict, Long> {
	int deleteByPrimaryKey(Long id);

	int insert(BusGoodsDict record);

	int insertSelective(BusGoodsDict record);

	BusGoodsDict selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(BusGoodsDict record);

	int updateByPrimaryKey(BusGoodsDict record);

	BusGoodsDict selectByCode(String code);

	List<Map<String, Object>> selectGoodsDictCodeName();
}