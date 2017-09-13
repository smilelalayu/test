package com.hm.userauth.model;

/**
 * UumWhiteIp entity. @author MyEclipse Persistence Tools
 */

public class WhiteIp implements java.io.Serializable {

	// Fields

	/** 
     * serialVersionUID:TODO
     * 
     * @since Ver 1.0 
     */ 
        
    private static final long serialVersionUID = 8039397509626061869L;
    private Long id;
	private String ip;
	private String appCode;
	private Integer status;
	private String description;

	
	// Property accessors

	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}