package com.times.acs.service.admin.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import com.times.acs.pojo.admin.User;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.pojo.admin.UserRolePOJO;
import com.times.acs.service.admin.LoginService;
import com.times.acs.service.admin.UserinfoService;
import com.times.framework.service.ServiceLocator;

@WebService(serviceName = "LoginService", portName = "LoginServicePort", targetNamespace = "http://service.jj.com/", endpointInterface = "com.times.acs.service.admin.LoginService")
public class LoginServiceImpl implements LoginService {
	Logger log = Logger.getLogger(LoginServiceImpl.class);

	public LoginServiceImpl() {
	}

	@Override
	public User login(String applicationCode, String userName, String password) {
		User user = new User();

		// 1.验证用户是否存在
		log.info("userName=" + userName + " --- password=" + password);
		UserinfoService userinfoService = (UserinfoService) ServiceLocator
				.getService("userinfoServiceProxy");
		UserInfoPOJO userInfoPOJO = userinfoService.getUserinfo(userName);
		if (userInfoPOJO == null || userInfoPOJO.getUserId() == null) {
			user.setErrorMsg("User is not exist with userName:" + userName);
			return user;
		}
		user.setName(userName);
		// 2.验证用户密码
		if (userInfoPOJO.getPassword() == null
				|| !userInfoPOJO.getPassword().equals(password)) {
			user.setErrorMsg("password error");
			return user;
		}
		// 3.获取用户角色
		List<Long> roles = new ArrayList<Long>();
		Set<UserRolePOJO> userRolePOJOs = userInfoPOJO.getRoles();
		for (UserRolePOJO role : userRolePOJOs) {
			if (role.getRole().getSmApplication().getCode()
					.equalsIgnoreCase(applicationCode)) {
				roles.add(role.getRole().getRoleId());
			}
		}

		user.setRoles(roles);
		// 4.获取用户组织机构

		user.setOrgCode(userInfoPOJO.getUserGroup().getGroupCode());
		user.setOrgName(userInfoPOJO.getUserGroup().getGroupName());

		return user;
	}

	@Override
	public boolean rePassword(String userName, String oldPassword,
			String newPassword) {
		boolean isSuccess = false;

		// 1.验证用户是否存在
		log.info("userName=" + userName + " --- oldPassword=" + oldPassword
				+ " --- newPassword=" + newPassword);
		UserinfoService userinfoService = (UserinfoService) ServiceLocator
				.getService("userinfoServiceProxy");
		UserInfoPOJO userInfoPOJO = userinfoService.getUserinfo(userName);
		if (userInfoPOJO == null || userInfoPOJO.getUserId() == null) {
			log.warn("User id not exist with userName:" + userName);
			return isSuccess;
		}
		// 2.验证用户密码
		if (userInfoPOJO.getPassword() == null
				|| !userInfoPOJO.getPassword().equals(oldPassword)) {
			log.warn("password error");
			return isSuccess;
		}
		// 3.修改用户密码
		userInfoPOJO.setPassword(newPassword);
		try {
			userinfoService.updateUserinfo(userInfoPOJO);
		} catch (Exception e) {
			log.error("update user password error.", e);
			return isSuccess;
		}

		isSuccess = true;
		return isSuccess;
	}

}
