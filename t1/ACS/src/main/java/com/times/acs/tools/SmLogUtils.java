package com.times.acs.tools;

import java.util.Date;

import com.miit.acs.service.audit.AuditLogManager;
import com.times.acs.pojo.admin.SmLog;
import com.times.acs.service.admin.SmLogService;
import com.times.framework.service.ServiceLocator;

public class SmLogUtils {

	public static String MODULE_SYSTEM = "系统";

	public static final ThreadLocal cLog = new ThreadLocal();

	/**
	 * 
	 * 
	 * @param log
	 */
	public static void setCurrentLog(SmLog log) {
		cLog.set(log);
	}

	public static void newCurrentLog() {
		SmLog log = new SmLog();

		cLog.set(log);
	}

	/**
	 * 
	 * 
	 */
	public static void removeCurrentLog() {
		// SmLog log = getCurrentLog();
		setCurrentLog(null);
		// page = null;
	}

	/**
	 * 
	 * 
	 * @return log instance
	 */
	public static SmLog getCurrentLog() {
		return (SmLog) cLog.get();
	}

	public static void setModuleName(String moduleName) {
		if (getCurrentLog() == null) {
			return;
		}
		getCurrentLog().setModuleName(moduleName);
	}

	public static void appendLog(String content) {
		if (getCurrentLog() == null) {
			return;
		}

		if (getCurrentLog().getLogContent() == null) {
			getCurrentLog().setLogContent("");
		}
		getCurrentLog()
				.setLogContent(getCurrentLog().getLogContent() + content);
	}

	public static void saveLogToDB() {

		if (getCurrentLog() == null) {
			return;
		}

		SmLogService logService = (SmLogService) ServiceLocator
				.getService("smLogService");

		if (getCurrentLog().getModuleName() == null
				|| getCurrentLog().getModuleName().trim().equals("")) {
			getCurrentLog().setModuleName(MODULE_SYSTEM);
		}

		if (getCurrentLog().getLogContent() == null
				|| getCurrentLog().getLogContent().equals("")) {
			// return;

			getCurrentLog().setLogContent(
					"请求url：" + getCurrentLog().getUrl());
		}
		if (getCurrentLog().getLogDate() == null) {
			getCurrentLog().setLogDate(new Date());
		}
		if (getCurrentLog().getRequestEndTime() == null) {
			getCurrentLog().setRequestEndTime(new Date());
		}
		if(getCurrentLog().getType()==null){
			SmLogUtils.getCurrentLog().setType(AuditLogManager.getSmLogType());
		}
		
		
		if(getCurrentLog().getResult()==null){
			SmLogUtils.getCurrentLog().setResult(SmLog.LOG_AUDIT_RESULT_SUCCESS);
		}
	
		logService.insertSmLog(getCurrentLog());
		removeCurrentLog();
	}
}
