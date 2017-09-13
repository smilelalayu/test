package com.miitgxt.common.security;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.j2se.util.MD5Utils;

public class GxtSessionUser extends User {

	private static final long serialVersionUID = 1L;

	private Long userInfoId;
	private Integer managerId;
	private String userPassword;
	private String license; // 禁化武办代码
	private String theme; // 主题
	private String ip;

	private UserInfoPOJO userInfo;

	public UserInfoPOJO getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfoPOJO userInfo) {
		this.userInfo = userInfo;
	}

	public Long getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(Long userInfoId) {
		this.userInfoId = userInfoId;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}



	public GxtSessionUser(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked, List<GrantedAuthority> authorities,
			Long userInfoId, String theme) {
		super(username, password, enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);
		this.userInfoId = userInfoId;
		this.userPassword = password;
		this.theme = (null == theme || "".equals(theme)) ? "arctic" : theme;
	}

}
