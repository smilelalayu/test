package com.times.acs.tools;

import com.times.framework.dao.hibernate.dto.HQLCondition;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.j2ee.util.PropertyManager;

/**
 * @author 赵森
 * 添加应用程序编码，在conf.property中配置appCode，主要应用与一个数据库对应多个
 * 应用程序数据
 *
 */
public class AppUtils {
	
	/**
	 * 在config配置中的应用程序编码名称
	 */
	public static String APP_CONFIG_NAME="app_code";
	
	/**
	 * 实体中标识应用程序编码的字段
	 */
	public static String APP_FIELD_NAME="appCode";

	public static void appendAppCond(HQLEntityString hes) {
		String appCode =getAppCode();

		if (appCode != null && !appCode.trim().equals("")) {
			hes.addCond(new HQLCondition(APP_FIELD_NAME, appCode));
		}

	}
	
	public static String getAppCode() {
		try {

			String value = PropertyManager.getString("app_code");

			return value;

		} catch (Exception e) {
			// e
		}
		return "";
	}

}
