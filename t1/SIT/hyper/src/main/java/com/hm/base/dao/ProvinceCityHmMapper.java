package com.hm.base.dao;

import java.util.List;
import java.util.Map;

import com.hm.base.model.BaseInfo;


public interface ProvinceCityHmMapper {

	
	/**
	 * @Method: queryCityId
	 * @Description: 根据ID查询城市
	 * @author qiuyuan
	 * @param cityId
	 * @return
	 */
	public List<BaseInfo> queryBaseInfoByCondition(Map<String,Object>  params);
	
	
}
