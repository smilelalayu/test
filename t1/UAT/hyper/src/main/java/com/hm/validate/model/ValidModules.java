package com.hm.validate.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * ValidateModules entity. @author MyEclipse Persistence Tools
 */

public class ValidModules implements java.io.Serializable {

	// Fields

	/** 
     * serialVersionUID:TODO
     * 
     * @since Ver 1.0 
     */ 
        
    private static final long serialVersionUID = 1647388400934238807L;
    private Long id;
	private String modelCode;
	private String modelName;
	private String context;
	private String actionCode;
	private Integer version;
	private String accessUrl;
	private String postUrl;
	private String lastOper;
	private Date lastUpdate;
	


	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelCode() {
		return this.modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getActionCode() {
		return this.actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getAccessUrl() {
		return this.accessUrl;
	}

	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}

	public String getPostUrl() {
		return this.postUrl;
	}

	public void setPostUrl(String postUrl) {
		this.postUrl = postUrl;
	}

	public String getLastOper() {
		return this.lastOper;
	}

	public void setLastOper(String lastOper) {
		this.lastOper = lastOper;
	}

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }



}