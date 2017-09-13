package com.hm.sys.util;

import org.apache.commons.lang3.StringUtils;

import com.hm.base.model.BaseInfo;

public class CommonUtils {
	private static final String  DEFAULT_FULL_CITY_PATH_SPILTER_SIGNAL = "/";
	
	public static String  analyseNeedBusProductId(String srcBusProductId){
		//#1242  对于工单状态18之前的 BUS_PRODUCT_ID可能存在多个,需要分割处理
		String  busProductId = srcBusProductId;
	    if(StringUtils.isNotBlank(srcBusProductId)){
	    	int seperateIndex =  StringUtils.indexOf(srcBusProductId,",");
	    	if(seperateIndex != -1){
	    		busProductId =  StringUtils.substring(srcBusProductId, 0, seperateIndex);
	    	}
	    }
	    return busProductId;
	}
	
	
	public static String  getFullPathFromdistinctInfo(BaseInfo distinctInfo){
		return getFullPathFromdistinctInfo(distinctInfo, DEFAULT_FULL_CITY_PATH_SPILTER_SIGNAL);
	}
	
	public static String  getFullPathFromdistinctInfo(BaseInfo distinctInfo, String fullPathSpilter){
		String result = null;
		if(null != distinctInfo){
        	if(isCityPathFull(distinctInfo)){
        		result = distinctInfo.getParentBase().getParentBase().getName()+ fullPathSpilter +distinctInfo.getParentBase().getName() + fullPathSpilter + distinctInfo.getName();
        	} else if(isCityPathHalfFull(distinctInfo)){
        		result = distinctInfo.getParentBase().getName() + fullPathSpilter + distinctInfo.getName();
        	} else{
        		result = distinctInfo.getName();
        	}
        }
		
		return result;
	}
	
	
	private static boolean isCityPathHalfFull(BaseInfo ditrict) {
		return StringUtils.isNoneBlank(ditrict.getName()) && null != ditrict.getParentBase() && StringUtils.isNoneBlank(ditrict.getParentBase().getName()) ;
	}

	private static boolean isCityPathFull(BaseInfo ditrict) {
		return isCityPathHalfFull(ditrict) && null != ditrict.getParentBase().getParentBase() && StringUtils.isNoneBlank(ditrict.getParentBase().getParentBase().getName());
	}
}
