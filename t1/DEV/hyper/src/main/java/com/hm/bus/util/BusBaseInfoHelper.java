package com.hm.bus.util;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gep.core.util.RedisUtils;
import com.hm.bus.constants.BusReturn;

public class BusBaseInfoHelper {
	
	private static Logger LOGGER = LoggerFactory.getLogger(BusBaseInfoHelper.class);
	
	public static void settingCompanyBaseInfo(String provinceId,String cityId, String townId, Object targetObject){
		if(targetObject != null){
			try{
				BeanUtils.setProperty(targetObject, "companyAdressprovince", getBaseInfoNameFromRedis(BusReturn.PROVINCE_REDIS_KEY, provinceId));
				String cityName = getBaseInfoNameFromRedis(BusReturn.CITY_REDIS_KEY, cityId);
				BeanUtils.setProperty(targetObject, "companyAdressCity", cityName);
				if (StringUtils.isBlank(townId)) {
					BeanUtils.setProperty(targetObject, "companyAdressDist", cityName);
				} else {
					BeanUtils.setProperty(targetObject, "companyAdressDist", getBaseInfoNameFromRedis(BusReturn.DISTRICT_REDIS_KEY, townId));
				}
			}catch(Exception ex){
				LOGGER.error("BusBaseInfoHelper settingCompanyBaseInfo error,  provinceId = "+provinceId+", cityId = "+cityId+", townId = "+townId, ex);
			}
		}
	}
	
	public static void settingLiveBaseInfo(String provinceId,String cityId, String townId, Object targetObject){
		if(targetObject != null){
			try{
				BeanUtils.setProperty(targetObject, "liveaddressProvince", getBaseInfoNameFromRedis(BusReturn.PROVINCE_REDIS_KEY, provinceId));
				String cityName = getBaseInfoNameFromRedis(BusReturn.CITY_REDIS_KEY, cityId);
				BeanUtils.setProperty(targetObject, "liveaddressCity", cityName);
				if (StringUtils.isBlank(townId)) {
					BeanUtils.setProperty(targetObject, "liveaddressDistinct", cityName);
				} else {
					String distictName = getBaseInfoNameFromRedis(BusReturn.DISTRICT_REDIS_KEY, townId);
					if(StringUtils.isBlank(distictName)){
						BeanUtils.setProperty(targetObject, "liveaddressDistinct", cityName);
					}else{
						BeanUtils.setProperty(targetObject, "liveaddressDistinct", distictName);
					}
				}
			}catch(Exception ex){
				LOGGER.error("BusBaseInfoHelper settingLiveBaseInfo error,  provinceId = "+provinceId+", cityId = "+cityId+", townId = "+townId, ex);
			}
		}
	}
	
	
	public static void settingHouseHoldBaseInfo(String provinceId,String cityId, String townId, Object targetObject){
		if(targetObject != null){
			try{
				BeanUtils.setProperty(targetObject, "registAddressProvince", getBaseInfoNameFromRedis(BusReturn.PROVINCE_REDIS_KEY, provinceId));
				String cityName = getBaseInfoNameFromRedis(BusReturn.CITY_REDIS_KEY, cityId);
				BeanUtils.setProperty(targetObject, "registAddressCity", cityName);
				if (StringUtils.isBlank(townId)) {
					BeanUtils.setProperty(targetObject, "registAddressDistinct", cityName);
				} else {
					BeanUtils.setProperty(targetObject, "registAddressDistinct", getBaseInfoNameFromRedis(BusReturn.DISTRICT_REDIS_KEY, townId));
				}
			}catch(Exception ex){
				LOGGER.error("BusBaseInfoHelper settingHouseHoldBaseInfo error,  provinceId = "+provinceId+", cityId = "+cityId+", townId = "+townId, ex);
			}
		}
	}
	
	private static String getBaseInfoNameFromRedis(String baseInfoKey, String id) {
		String result = null;
		String baseInfoStr = RedisUtils.getObject(baseInfoKey, id);
		if(StringUtils.isNotBlank(baseInfoStr)){
			JSONObject baseInfo = JSON.parseObject(baseInfoStr);
			if(baseInfo != null){
				result = baseInfo.getString("name");
			}
		}
		return result;
	}
}
