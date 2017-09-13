package com.times.acs.tools;

import java.util.Date;

import com.times.acs.core.usermanager.CurrentUser;
import com.times.acs.pojo.admin.SmLog;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.service.admin.SmLogService;
import com.times.framework.service.ServiceLocator;

/**
 * 存储操作日志
 * @author liwei
 *
 */
public class BzLogUtil {

	/**
	 * 模块名称常量
	 */
	public static final String MOUDLE_LOGIN = "登录系统";
	
	
	public static final String MOUDLE_USER ="用户";
	
	public static final String MOUDLE_ROLE ="角色";
	
	public static final String MOUDLE_ORG ="机构";
	
	public static final String MOUDLE_FlOWCONFIG ="流程配置";
	
	/**
	 * 操作常量
	 */
	public static final int OPER_UNKNOW = 0; //不确定
	
	public static final int OPER_NEW =1 ;//新建
	
	public static final int OPER_EDIT =2; //编辑
	
	public static final int OPER_DELETE =3; //删除
	
	public static final int OPER_PUBLISH =4; //发布
	/**
	 * 存储日志,servlet中调用
	 * IP获取办法：在servlet中调用  RequestUtils.getIpAddr(getThreadLocalRequest())；
	 * @param moduleName
	 * @param loginIp
	 * @param loginName
	 * @param content
	 */
	public static void saveLog(String moduleName,String loginIp,String loginName,String content,int operate){
		
		SmLog log = new SmLog();
		String operString = getOperString(operate);
		content = operString+"_"+content;
		log.setLoginIp(loginIp);
		log.setLoginName(loginName);
		log.setModuleName(moduleName);
		log.setLogContent(content);
		log.setLogDate(new Date());
		
		SmLogService logService = (SmLogService) ServiceLocator
				.getService("smLogService");
//		logService.insertSmLog(log);
	}
	public static void saveLog(String moduleName,String content,int operate){
		
		UserInfoPOJO user =  CurrentUser.currentUser();
		String loginName = "";
		String loginIp = "";
		
		if(user!=null){
			
			loginName=user.getLoginName();
			loginIp=user.getLoginIP();
			//兼容个别系统
			if(loginIp==null || loginIp.equals("")){
				loginIp=user.getReserver2();
			}
			
		}
		saveLog(moduleName, loginIp,loginName, content, operate);
		
	}
	private static  String getOperString(int operate){
		switch(operate){
		case OPER_NEW:
			return "新建";
		case OPER_EDIT:
			return "修改";
		case OPER_DELETE:
			return "删除";
		default:
			return "";
		}
		
	}
}
