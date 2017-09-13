package com.hm.bus.dao;

import java.util.List;
import java.util.Map;

import com.gep.core.base.BaseMapper;
import com.hm.bus.module.BsProdectSeries;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: BsProdectSeriesMapper
 * @Description: 产品系列mapper类
 * @author qiuyuan
 * @date 2016年9月9日 上午11:04:37
 * @Copyright (c) 2016, 9fchaoneng.com All Rights Reserved.
 */
@Repository
public interface BsProdectSeriesMapper extends BaseMapper<BsProdectSeries, Long> {
	
	/**
	 * @Method: listAll
	 * @Description: 查询所有产品系列
	 * @author qiuyuan
	 * @return
	 */
	List<BsProdectSeries> listAll();

	List<Map<String, Object>> selectAllReductionPeriod();
	
}