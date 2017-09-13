/*
 * �������� 2006-6-6
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.core.usermanager;

import org.apache.log4j.Logger;

import com.times.acs.pojo.admin.UserInfoPOJO;

public class CurrentUser {

	// private UserInfoPOJO user;
	private static final Logger log = Logger.getLogger(CurrentUser.class);
	private static final ThreadLocal<UserInfoPOJO> local = new ThreadLocal<UserInfoPOJO>();

	public static UserInfoPOJO currentUser() {
		log.info("get user!");
		// System.out.println("get user");
		UserInfoPOJO user = local.get();
		// if (user == null) {
		// // 测试的时候用，正式的生成环境去掉这一行
		// return createTempUser();
		// }
		return user;
	}

	// public static UserInfoPOJO createTempUser() {
	// UserinfoService service = (UserinfoService) ServiceLocator
	// .getService("userInfoPOJOServiceProxy");
	//
	// return service.getUserinfo(4L);
	// }

	public static void putUser(UserInfoPOJO user) {
		log.info("put user!");
		// System.out.println("put user");
		local.set(user);
	}

	public static void removeUser() {
		if (local.get() != null) {
			log.info("remove user!");
			local.set(null);
		}
	}

	public UserInfoPOJO getUser() {
		return CurrentUser.currentUser();
	}
}
