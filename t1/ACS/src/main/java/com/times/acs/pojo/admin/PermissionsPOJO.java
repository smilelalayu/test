package com.times.acs.pojo.admin;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Version;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Lenovo
 * 
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true, value = { "hibernateLazyInitializer"})
public class PermissionsPOJO implements Serializable {

	public static final String PERM_TYPE = "app";
	
	

	/** identifier field */
	private Long code;

	/** persistent field */
	private String comments;

	private String resources;
	
	private String url;
	private String isSystemApplicant;
	
	private String moduleCode;
	
	
	
	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getIsSystemApplicant() {
		return isSystemApplicant;
	}

	public void setIsSystemApplicant(String isSystemApplicant) {
		this.isSystemApplicant = isSystemApplicant;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 所属应用程序编码
	 */
	private String appCode;

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}

	/** full constructor */
	public PermissionsPOJO(java.lang.Long code, java.lang.String comments) {
		this.code = code;
		this.comments = comments;
	}

	/** default constructor */
	public PermissionsPOJO() {
	}

	public java.lang.Long getCode() {
		return this.code;
	}

	public void setCode(java.lang.Long code) {
		this.code = code;
	}

	public java.lang.String getComments() {
		return this.comments;
	}

	public void setComments(java.lang.String comments) {
		this.comments = comments;
	}

	@Version
	protected Integer version;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		if (obj instanceof PermissionsPOJO) {
			PermissionsPOJO perm = (PermissionsPOJO) obj;
			return perm.getCode().equals(this.getCode());
		}

		return super.equals(obj);
	}

}
