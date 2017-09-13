package com.miitgxt.common.security;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;

/**
 * @author Gao ZhongJie
 */
public class SecurityUtils {

	/**
	 * 用于标记已登录
	 */
//	public static String LOGIN_FLAG = "THREAD_LOGIN_FLAG";

	public static GxtSessionUser getUserFromPrincipal(Principal principal) {
		GxtSessionUser w = populateUserDetails(principal);
		if (w != null) {
			return w;
		}

		return null;
	}

	public static String getIPFromPrincipal(Principal principal) {
		GxtSessionUser w = populateUserDetails(principal);
		if (w != null) {
			return w.getIp();
		}

		return null;
	}

	private static GxtSessionUser populateUserDetails(Principal principal) {
		Authentication auth = (Authentication) principal;
		if (auth != null) {
			return (GxtSessionUser) auth.getPrincipal();
		}

		return null;
	}

	public static GxtSessionUser getCurrentUser() {
		GxtSessionUser currentUser = (GxtSessionUser) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();

		return currentUser;
	}

	/**
	 * 获取已登录的所有用户的session-登录退出提示
	 * 洪秋霞 20160121R
	 * @param sessionRegistry
	 * @return
	 */
	public static List<SessionInformation> getSessionInformations(SessionRegistry sessionRegistry) {
		List<SessionInformation> informations=new ArrayList<SessionInformation>();
		List<Object>  principals = sessionRegistry.getAllPrincipals();
		for (Object principal : principals) {
			informations=sessionRegistry.getAllSessions(principal,true);
		}
		return informations;
	}

}
