package com.hm.bus.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hm.bus.module.LnCommodityInfo;

@Repository
public interface LnCommodityInfoMapper {
	int deleteByPrimaryKey(Long id);

	int insert(LnCommodityInfo record);

	int insertSelective(LnCommodityInfo record);

	LnCommodityInfo selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(LnCommodityInfo record);

	int updateByPrimaryKey(LnCommodityInfo record);

	/**
	 * 批量查询待生成还款计划的商品信息
	 */
	List<LnCommodityInfo> selectCommodityByRepaymentList();
}