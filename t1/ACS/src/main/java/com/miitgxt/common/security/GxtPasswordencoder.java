package com.miitgxt.common.security;

import org.springframework.security.authentication.encoding.PasswordEncoder;

import com.times.j2se.util.MD5Utils;

public class GxtPasswordencoder implements PasswordEncoder {

	@Override
	public String encodePassword(String rawPass, Object salt) {
		// TODO Auto-generated method stub
		return MD5Utils.getJavaSecurityMD5(rawPass);
	}

	@Override
	public boolean isPasswordValid(String encPass, String rawPass, Object salt) {
		// TODO Auto-generated method stub
		return encPass.equals(encodePassword(rawPass, salt));
	}

}
