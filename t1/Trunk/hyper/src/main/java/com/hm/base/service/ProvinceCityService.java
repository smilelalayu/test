package com.hm.base.service;

import java.util.List;

import com.hm.base.model.BaseInfo;



/**
 * <p>Description: 省份城市服务类</p>
 *
 * @author evan
 * @version 1.0
 *          <p>Company:9fchaoneng</p>
 *          <p>Copyright:Copyright(c)2016</p>
 * @date 2016/4/13
 */
public interface ProvinceCityService {
	
	/**
	 * @Method: getProvinceById
	 * @Description: 根据ID查询省
	 * @author qiuyuan
	 * @param Id
	 * @return
	 */
	BaseInfo getProvinceById(String id);
	
	/**
	 * @Method: queryCityId
	 * @Description: 根据城市ID 查询城市
	 * @author qiuyuan
	 * @param cityId
	 * @return
	 */
	BaseInfo queryCityById(String cityId);

	/**
	 * 根据区域id获取数据
	 * @param id
	 * @return
	 * @author 洪秋霞
	 * @date
	 */
	BaseInfo queryDistrictById(String id);
	
	
	
	
	/**
	 * @Method: queryCityById
	 * @Description: 根据城市ID 查询城市并且把所属省份带出
	 * @author qiuyuan
	 * @param cityId
	 * @return
	 */
	BaseInfo queryCityByIdWithParent(String cityId);

	/**
	 * 根据区域id获取数据 并且把所属城市带出
	 * @param id
	 * @return
	 * @author 洪秋霞
	 * @date
	 */
	BaseInfo queryDistrictByIdWithParent(String id);
	
	
	
	/**
	 * @Method: getProvinceList
	 * @Description: 根据省份信息列表
	 * @return
	 */
	List<BaseInfo> queryProvinceList();
	
	/**
	 * @Method: queryCityList
	 * @Description: 查询城市信息列表
	 * @author qiuyuan
	 * @param cityId
	 * @return
	 */
	List<BaseInfo> queryCityList();

	/**
	 * 查询区域信息列表
	 * @param id
	 * @return
	 * @author 洪秋霞
	 * @date
	 */
	List<BaseInfo> queryDistrictList();
	
}
