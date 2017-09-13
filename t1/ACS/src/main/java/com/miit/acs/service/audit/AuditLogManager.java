package com.miit.acs.service.audit;

import java.util.List;

import com.times.acs.core.usermanager.CurrentUser;
import com.times.acs.pojo.admin.RolesPOJO;
import com.times.acs.pojo.admin.SmLog;
import com.times.acs.pojo.admin.UserInfoPOJO;

/**
 * @author 赵森
 * 
 * @date 2013-6-20
 * 
 */
public class AuditLogManager {

	/**
	 * 根据登录的当前用户判定，当前审计日志类型
	 * 
	 * @return 审计日志的类型
	 */
	public static String getAuditType() {

		UserInfoPOJO user = CurrentUser.currentUser();
		if (user != null) {
			List<String> roleCodes = user.getRoleCodes();
			if (roleCodes.contains(RolesPOJO.SYSTEM_ADMIN)) {
				return SmLog.LOGTYPE_ADMIN;
			} else if (roleCodes.contains(RolesPOJO.SYSTEM_SECURITY_OFFICER)) {
				return SmLog.LOGTYPE_SECURITY;
			} else if (roleCodes.contains(RolesPOJO.SYSTEM_AUDITOR)) {
				return SmLog.LOGTYPE_AUDITOR;
			} else {
				return SmLog.LOGTYPE_BIZUSER;
			}
		}
		return SmLog.LOGTYPE_NOLOGIN;
	}
	
	/**
	 * 根据登录的当前用户判定，当前审计日志类型 （new）
	 * @return
	 */
	public static String getSmLogType() {
		UserInfoPOJO user = CurrentUser.currentUser();
		if (user != null) {
			String userCategory = user.getUserCategory();
			if(userCategory==null || userCategory.trim().equals("")){
				return getAuditType();
			}
			if (userCategory.equals(UserInfoPOJO.USER_TYPE_ADMIN)) {
				return SmLog.LOGTYPE_ADMIN;
			} else if (userCategory.equals(UserInfoPOJO.USER_TYPE_SECURITY)) {
				return SmLog.LOGTYPE_SECURITY;
			} else if (userCategory.equals(UserInfoPOJO.USER_TYPE_AUDITOR)) {
				return SmLog.LOGTYPE_AUDITOR;
			} else {
				return SmLog.LOGTYPE_BIZUSER;
			}
		}else{
			return SmLog.LOGTYPE_NOLOGIN;
		}
		//return "";
	}

	public static String getAttachmentSecret(String code) {

		String result = SmLog.LOG_AUDIT_NOSECRET;

		if (code == null) {
			return result;
		}
		
		if(code.equals(SmLog.SECRETTYPE_NO)){
			
		}else if(code.equals(SmLog.SECRETTYPE_SECRET)){
			result=SmLog.LOG_AUDIT_SECRET;
		}else if(code.equals(SmLog.SECRETTYPE_CONFIDENTIAL)){
			result=SmLog.LOG_AUDIT_CONFIDENTIAL;
		}
		

		return result;

	}

}
