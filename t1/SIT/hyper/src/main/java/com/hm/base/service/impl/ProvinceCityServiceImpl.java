package com.hm.base.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.util.ObjectUtils;
import com.google.common.collect.Maps;
import com.hm.base.dao.ProvinceCityHmMapper;
import com.hm.base.model.BaseInfo;
import com.hm.base.service.ProvinceCityService;

/**
 * <p>Description: 省份城市服务类</p>
 *
 * @author evan
 * @version 1.0
 *          <p>Company:9fchaoneng</p>
 *          <p>Copyright:Copyright(c)2016</p>
 * @date 2016/4/13
 */
@Service
public class ProvinceCityServiceImpl implements ProvinceCityService {

    @Autowired
    private ProvinceCityHmMapper provinceCityMapper;
    
    public static String BASE_INFO_TYPE_FOR_CITY = "C";
    
    public static String BASE_INFO_TYPE_FOR_PROVINCE = "P";
    
    public static String BASE_INFO_TYPE_FOR_DISTRICT = "D";

    
    /**
   	 * 根据区域id获取数据
   	 * @param id
   	 * @return
   	 * @author 洪秋霞
   	 * @date
   	 */
    @Override
   	public BaseInfo queryDistrictById(String id){
   		return queryBaseInfoById(BASE_INFO_TYPE_FOR_DISTRICT, id);
   	}

	@Override
	public BaseInfo getProvinceById(String id)
	{
		return queryBaseInfoById(BASE_INFO_TYPE_FOR_PROVINCE, id);
	}

	@Override
	public BaseInfo queryCityById(String cityId)
	{
		return queryBaseInfoById(BASE_INFO_TYPE_FOR_CITY, cityId);
	}
	
	
	@Override
	public BaseInfo queryCityByIdWithParent(String cityId) {
		BaseInfo cityInfo = null;
		if(StringUtils.isNoneBlank(cityId)){
			cityInfo = queryCityById(cityId);
			if(null != cityInfo && StringUtils.isNoneBlank(cityInfo.getParentId())){
				BaseInfo  parentInfo =  getProvinceById(cityInfo.getParentId());
				if(null != parentInfo){
					cityInfo.setParentBase(parentInfo);
				}
			}
		}
		
		return cityInfo;
	}

	@Override
	public BaseInfo queryDistrictByIdWithParent(String distinctId) {
		BaseInfo distinctInfo = null;
		if(StringUtils.isNoneBlank(distinctId)){
			distinctInfo = queryDistrictById(distinctId);
			if(null != distinctInfo && StringUtils.isNoneBlank(distinctInfo.getParentId())){
				BaseInfo  parentInfo =  queryCityByIdWithParent(distinctInfo.getParentId());
				if(null != parentInfo){
					distinctInfo.setParentBase(parentInfo);
				}
			}
		}
		
		return distinctInfo;
	}

	
	private BaseInfo queryBaseInfoById(String type, String id) {
		Map<String, Object> params = Maps.newHashMap();
   		params.put("type", type);
   		params.put("id", id);
   		return ObjectUtils.convertObject(provinceCityMapper.queryBaseInfoByCondition(params));
	}

	@Override
	public List<BaseInfo> queryProvinceList() {
		return queryBaseInfoList(BASE_INFO_TYPE_FOR_PROVINCE);
	}

	@Override
	public List<BaseInfo> queryCityList() {
		return queryBaseInfoList(BASE_INFO_TYPE_FOR_CITY);
	}

	@Override
	public List<BaseInfo> queryDistrictList() {
		return queryBaseInfoList(BASE_INFO_TYPE_FOR_DISTRICT);
	}
	
	
	private List<BaseInfo> queryBaseInfoList(String type) {
		Map<String, Object> params = Maps.newHashMap();
   		params.put("type", type);
   		return provinceCityMapper.queryBaseInfoByCondition(params);
	}
}
