package com.times.acs.pojo.admin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/** @author Hibernate CodeGenerator */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true, value = {
		"hibernateLazyInitializer", "strPermissions" })
public class UserInfoPOJO implements Serializable {

	private static final long serialVersionUID = -706222287219542726L;

	public static String USER_TYPE_ADMINISTRATOR = "government";

	public static String USER_TYPE_ENTERPRISE = "enterprise";

	public static String USER_TYPE_MIIT = "miit";

	/**
	 * 系统管理员
	 */
	public static String USER_TYPE_ADMIN = "1";

	/**
	 * 安全保密员
	 */
	public static String USER_TYPE_SECURITY = "2";

	/**
	 * 安全审计员
	 */
	public static String USER_TYPE_AUDITOR = "3";

	/**
	 * 一般业务人员
	 */
	public static String USER_TYPE_BIZ = "4";

	/** identifier field */
	@Id
	@GeneratedValue
	private Long userId;

	/** persistent field */
	private String userName;

	private String loginName;

	private String password;

	private String email;
	
	private String cardId;
	
	private int initPwdType;
    
	private Date updatePwdTime;
	
	
	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Long getDepartId() {
		return departId;
	}

	public void setDepartId(Long departId) {
		this.departId = departId;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}



	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	private String sex;
	
	private Long departId; 
	
	private String userStatus;
	
	private Date entryTime;
	
	private String position;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/** nullable persistent field */
	private String employeeId;

	/** nullable persistent field */
	private String mobTel1;

	/** nullable persistent field */
	private String mobTel2;

	/** nullable persistent field */
	private String famTel;

	/** nullable persistent field */
	private String comTel;

	/** nullable persistent field */
	private String department;

	/** nullable persistent field */
	private String title;

	/** nullable persistent field */
	private String stop = "y";

	/** nullable persistent field */
	private java.util.Date modifyTime;

	/** nullable persistent field */
	private java.util.Date createTime;

	/** nullable persistent field */
	private String reserver1;

	/** nullable persistent field */
	private String reserver2;

	private String loginIP;

	private String groupName;// 树形菜单显示使用

	/**
	 * 申请者标识
	 */
	private Long applicantId;

	/**
	 * 主账号ID
	 */
	private Long accountId;
	
	//访问令牌
	private String token;
	
	private String stopStatus;//用户停用状态
	
	public String getStopStatus() {
		return stopStatus;
	}

	public void setStopStatus(String stopStatus) {
		this.stopStatus = stopStatus;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getLoginIP() {
		return loginIP;
	}

	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}

	private UserGroupPOJO userGroup;

	private List<String> roleNames = new ArrayList<String>();

	private List<String> roleCodes = new ArrayList<String>();

	private List<UserGroupPOJO> userGroups = new ArrayList<UserGroupPOJO>();// 一个用户对应多个机构

	private List<Long> userGroupIds = new ArrayList<Long>();// 一个用户对应多个机构ID

	public List<String> getRoleNames() {
		return roleNames;
	}

	public void setRoleNames(List<String> roleNames) {
		this.roleNames = roleNames;
	}

	public List<String> getRoleCodes() {
		if (roleCodes.size() <= 0) {
			for (UserRolePOJO uRole : roles) {
				roleCodes.add(uRole.getRole().getRoleCode());
			}
		}
		return roleCodes;
	}

	public void setRoleCodes(List<String> roleCodes) {
		this.roleCodes = roleCodes;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	private String orgCode = "";

	@OneToMany
	private Set<UserRolePOJO> roles = new HashSet<UserRolePOJO>();

	@OneToMany
	private Set<PermissionsPOJO> permissions = new HashSet<PermissionsPOJO>();

	private boolean loginAgain = false;

	private String userType;

	private String userCategory;// 用户类型 1表示系统管理员admin 2:安全审计员3：安全保密员 4：业务人员

	/**
	 * 可以存放企业用户的角色code
	 */
	private String roleCode;

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

	/**
	 * 可以存放需要存放的字段
	 */
	private Map<String, Object> otherFields;

	/**
	 * 
	 * 字符串格式 用户ID，用于内网
	 */
	private String strUserId;

	/**
	 * 用户排序，用于内网
	 */
	private Integer userSort;

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public UserGroupPOJO getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(UserGroupPOJO userGroup) {
		this.userGroup = userGroup;
	}

	public String getStrUserId() {
		return strUserId;
	}

	public void setStrUserId(String strUserId) {
		this.strUserId = strUserId;
	}

	public Integer getUserSort() {
		return userSort;
	}

	public void setUserSort(Integer userSort) {
		this.userSort = userSort;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		if (obj != null && obj instanceof UserInfoPOJO) {
			return this.getUserId() == ((UserInfoPOJO) obj).getUserId();
		}

		return super.equals(obj);
	}

	/** full constructor */
	public UserInfoPOJO(java.lang.String userName, java.lang.String employeeId,
			java.lang.String mobTel1, java.lang.String mobTel2,
			java.lang.String famTel, java.lang.String comTel,
			java.lang.String department, java.lang.String title,
			java.lang.String stop, java.util.Date modifyTime,
			java.util.Date createTime, java.lang.String reserver1,
			java.lang.String reserver2, java.lang.String email,String token) {

		this.userName = userName;
		this.email = email;
		this.employeeId = employeeId;
		this.mobTel1 = mobTel1;
		this.mobTel2 = mobTel2;
		this.famTel = famTel;
		this.comTel = comTel;
		this.department = department;
		this.title = title;
		this.stop = stop;
		this.modifyTime = modifyTime;
		this.createTime = createTime;
		this.reserver1 = reserver1;
		this.reserver2 = reserver2;
		this.token = token;
	}

	/** default constructor */
	public UserInfoPOJO() {
	}

	/** minimal constructor */
	public UserInfoPOJO(java.lang.String userName) {

		this.userName = userName;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public java.lang.String getUserName() {
		return this.userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	public java.lang.String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(java.lang.String employeeId) {
		this.employeeId = employeeId;
	}

	public java.lang.String getMobTel1() {
		return this.mobTel1;
	}

	public void setMobTel1(java.lang.String mobTel1) {
		this.mobTel1 = mobTel1;
	}

	public java.lang.String getMobTel2() {
		return this.mobTel2;
	}

	public void setMobTel2(java.lang.String mobTel2) {
		this.mobTel2 = mobTel2;
	}

	public java.lang.String getFamTel() {
		return this.famTel;
	}

	public void setFamTel(java.lang.String famTel) {
		this.famTel = famTel;
	}

	public java.lang.String getComTel() {
		return this.comTel;
	}

	public void setComTel(java.lang.String comTel) {
		this.comTel = comTel;
	}

	public java.lang.String getDepartment() {
		return this.department;
	}

	public void setDepartment(java.lang.String department) {
		this.department = department;
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getStop() {
		return this.stop;
	}

	public void setStop(java.lang.String stop) {
		this.stop = stop;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JsonIgnore
	public String getStrPermissions() {
		String s = "";
		Iterator<PermissionsPOJO> it = permissions.iterator();
	
		while (it.hasNext()) {
			s += it.next().getCode()+",";
		}
		if(s.endsWith(",")){
			s=s.substring(0,s.length()-1);
		}
		return s;

	}

	@JsonIgnore
	public void setStrPermissions(String strPermissinos) {

	}
	
	
	@JsonIgnore
	public String getResources() {
		String s = "";
		Iterator<PermissionsPOJO> it = permissions.iterator();
	
		while (it.hasNext()) {
			s += it.next().getResources()+",";
		}
		if(s.endsWith(",")){
			s=s.substring(0,s.length()-1);
		}
		return s;

	}

	@JsonIgnore
	public void setResources(String resources) {

	}
	

	@JsonIgnore
	public Set<UserRolePOJO> getRoles() {
		return roles;
	}

	@JsonIgnore
	public void setRoles(Set<UserRolePOJO> roles) {
		this.roles = roles;
	}

	@JsonIgnore
	public Set<PermissionsPOJO> getPermissions() {
		return permissions;
	}

	@JsonIgnore
	public void setPermissions(Set<PermissionsPOJO> permissions) {
		this.permissions = permissions;
	}

	public boolean isLoginAgain() {
		return loginAgain;
	}

	public void setLoginAgain(boolean loginAgain) {
		this.loginAgain = loginAgain;
	}



	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public Map<String, Object> getOtherFields() {
		return otherFields;
	}

	public void setOtherFields(Map<String, Object> otherFields) {
		this.otherFields = otherFields;
	}

	@JsonIgnore
	public List<UserGroupPOJO> getUserGroups() {
		return userGroups;
	}

	@JsonIgnore
	public void setUserGroups(List<UserGroupPOJO> userGroups) {
		this.userGroups = userGroups;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getUserCategory() {
		return userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}

	public List<Long> getUserGroupIds() {
		return userGroupIds;
	}

	public void setUserGroupIds(List<Long> userGroupIds) {
		this.userGroupIds = userGroupIds;
	}

	public int getInitPwdType() {
		return initPwdType;
	}

	public void setInitPwdType(int initPwdType) {
		this.initPwdType = initPwdType;
	}

	public Date getUpdatePwdTime() {
		return updatePwdTime;
	}

	public void setUpdatePwdTime(Date updatePwdTime) {
		this.updatePwdTime = updatePwdTime;
	}
	
}
