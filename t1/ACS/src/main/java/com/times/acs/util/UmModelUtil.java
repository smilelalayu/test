package com.times.acs.util;

import com.times.j2ee.util.PropertyManager;

/**
 * 
 * 
 *
 */
public class UmModelUtil {
	/**
	 * 获取系统三员管理模式， 1,分管局管理模式, 0普通模式
	 */
	public static String getSysUserManagerMode(){
		String flag="";
		try {
			flag = PropertyManager.getString("sys.mode");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		if(flag!=null &&!"".equals(flag)&&"1".equals(flag)){
			return "1";
		}else{
			return "0";
		}
	}
}
