package com.hm.bus.webservice;

import java.io.Serializable;

public class LnAppJsonHead implements Serializable {

	private static final long serialVersionUID = 3099946401341030930L;

	// 此秘钥需要通过RSA方式进行加密
	private String secretKey;
	// *必选，是否对数据进行加密 1、密码校验2、无密码校验
	private Integer isSecret;

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public Integer getIsSecret() {
		return isSecret;
	}

	public void setIsSecret(Integer isSecret) {
		this.isSecret = isSecret;
	}
}
