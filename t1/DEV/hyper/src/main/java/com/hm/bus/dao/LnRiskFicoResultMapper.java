package com.hm.bus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gep.core.base.BaseMapper;
import com.hm.bus.module.LnRiskFicoResult;
import org.springframework.stereotype.Repository;

@Repository
public interface LnRiskFicoResultMapper extends BaseMapper<LnRiskFicoResult, Long> {

	LnRiskFicoResult list(Long id);

	LnRiskFicoResult query(Long appId);

	/**
	 * <b>deleteMarkTWByAppId</b><br/>
	 * 通过工单Id删除评分数据
	 * 
	 * @param appId
	 * @throws Exception
	 * @author zhoukailiang
	 * @createDate 2016年8月9日 下午5:14:25
	 * @version 1.0
	 * @description
	 *
	 */
	public void deleteMarkTWByAppId(@Param("appId") Long appId) throws Exception;

	public List<Map<String, Object>> selectByBatchNo(String batchNo);

	public List<Map<String, Object>> selectByAppId(String appId);
}