package com.hm.userauth.model;

import java.util.Date;

/**
 * UumUserApp entity. @author MyEclipse Persistence Tools
 */

public class UserApp implements java.io.Serializable {

	/** 
     * serialVersionUID:TODO
     * 
     * @since Ver 1.0 
     */ 
        
    private static final long serialVersionUID = -3493995110473261753L;
    private Long id;
	private Integer userId;
	private String appCode;
	private String appName; 
	private String token;
	private String userStatus;
	private Long channelId;
	private String loginName;
	private String channelName;
	private String appCodeAndName;
	private String tokenStr;
	private Date tokenCreateTime;
	
	public Date getTokenCreateTime() {
		return tokenCreateTime;
	}

	public void setTokenCreateTime(Date tokenCreateTime) {
		this.tokenCreateTime = tokenCreateTime;
	}

	public String getTokenStr() {
        return tokenStr;
    }

    public void setTokenStr(String tokenStr) {
        this.tokenStr = tokenStr;
    }

    public String getAppCodeAndName() {
        return appCodeAndName;
    }

    public void setAppCodeAndName(String appCodeAndName) {
        this.appCodeAndName = appCodeAndName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public Long getChannelId() {
		return this.channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

}