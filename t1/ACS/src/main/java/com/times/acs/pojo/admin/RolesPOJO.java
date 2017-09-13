package com.times.acs.pojo.admin;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/** @author Hibernate CodeGenerator */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true, value = { "hibernateLazyInitializer","userRoles,userGroupRoles" })
public class RolesPOJO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 系统管理员，角色编码
	 */
	public static final String SYSTEM_ADMIN = "sysadmin";
	
	/**
	 * 系统管理员，角色编码
	 */
	public static final String ADMIN = "admin";

	/**
	 * 安全保密管理员，角色编码
	 */
	public static final String SYSTEM_SECURITY_OFFICER = "security_officer";

	/**
	 * 安全审计员，角色编码
	 */
	public static final String SYSTEM_AUDITOR = "auditor";

	/**
	 * 专家角色编码
	 */
	public static final String SYSTEM_EXPERT = "专家";

	/**
	 * 秘密角色编码
	 */
	public static final String SECRET_ROLE = "secret";

	/**
	 * 机密角色编码
	 */
	public static final String CONFIDENTIAL_ROLE = "confidential";

	/**
	 * 企业
	 */
	public static final String SYSTEM_ENTERPRISE = "enterprise";

	/**
	 * 个人人账号
	 */
	public static final String SYSTEM_INDIVIDUAL = "individual";

	/** identifier field */
	@Id
	@GeneratedValue
	private Long roleId;

	/** persistent field */
	private String roleName;

	/** persistent field */
	private String permissions;

	private String roleCode;

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
		// 兼容旧版本的设计，老系统用reserver1 作为角色编码
		if (this.getReserver1() == null || this.getReserver1().equals("")) {
			this.setReserver1(roleCode);
		}
	}

	/** nullable persistent field */
	private java.util.Date modifyTime;

	/** nullable persistent field */
	private java.util.Date createTime;

	/** nullable persistent field */
	private String reserver1;

	/** nullable persistent field */
	private String reserver2;

	@ManyToOne
	private SmApplication smApplication;

	public SmApplication getSmApplication() {
		return smApplication;
	}

	public void setSmApplication(SmApplication smApplication) {
		this.smApplication = smApplication;
	}

	@JsonIgnore
	private Set<UserRolePOJO> userRoles = new HashSet<UserRolePOJO>();
	@JsonIgnore
	private Set<UsergroupRolePOJO> userGroupRoles = new HashSet<UsergroupRolePOJO>();

	/** full constructor */
	public RolesPOJO(java.lang.String roleName, java.lang.String permissions,
			java.util.Date modifyTime, java.util.Date createTime,
			java.lang.String reserver1, java.lang.String reserver2) {
		this.roleName = roleName;
		this.permissions = permissions;
		this.modifyTime = modifyTime;
		this.createTime = createTime;
		this.reserver1 = reserver1;
		this.reserver2 = reserver2;
	}

	/** default constructor */
	public RolesPOJO() {
	}

	/** minimal constructor */
	public RolesPOJO(java.lang.String roleName, java.lang.String permissions) {

		this.roleName = roleName;
		this.permissions = permissions;
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public java.lang.String getRoleName() {

		return this.roleName;

	}

	public void setRoleName(java.lang.String roleName) {
		this.roleName = roleName;

	}

	public java.lang.String getPermissions() {
		return this.permissions;
	}

	public void setPermissions(java.lang.String permissions) {
		this.permissions = permissions;
	}

	public java.util.Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(java.util.Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public java.util.Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public java.lang.String getReserver1() {
		return this.reserver1;
	}

	public void setReserver1(java.lang.String reserver1) {
		this.reserver1 = reserver1;
	}

	public java.lang.String getReserver2() {
		return this.reserver2;
	}

	public void setReserver2(java.lang.String reserver2) {
		this.reserver2 = reserver2;
	}
	@JsonIgnore
	public Set<UserRolePOJO> getUserRoles() {
		return userRoles;
	}
	@JsonIgnore
	public void setUserRoles(Set<UserRolePOJO> userRoles) {
		this.userRoles = userRoles;
	}
	@JsonIgnore
	public Set<UsergroupRolePOJO> getUserGroupRoles() {
		return userGroupRoles;
	}
	@JsonIgnore
	public void setUserGroupRoles(Set<UsergroupRolePOJO> userGroupRoles) {
		this.userGroupRoles = userGroupRoles;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		if (obj != null && obj instanceof RolesPOJO) {
			return this.getRoleId() == ((RolesPOJO) obj).getRoleId();
		}

		return super.equals(obj);
	}

	@Version
	protected Integer version;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
