package com.hm.appinfo.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 销售用户数据实体
 */
public class SAUserInfo 
{
	public static String USER_TYPE_ADMIN = "1"; //系统管理员
	public static String USER_TYPE_SECURITY = "2"; //安全保密员 
	public static String USER_TYPE_AUDITOR = "3"; //安全审计员
	public static String USER_TYPE_BIZ = "4"; //一般业务人员
	private Long userId;
	private Long groupId;
	private String userName;
	private String loginName;
	private String password;
	private String employeeId;
	private String mobTel1;
	private Date modifyTime;
	private Date createTime;
	private String email;
	private String cardId;
	private int initPwdType;
	private Date updatePwdTime;
	private String position;
    private String stopStatus;
	private String parentUserLoginName;
	private String userType;
	private String userSex;
	private String userStatus;
	private String userCategory;
	private String isStop;
	/**
	 * 用户状态(新增字段)：job:正常,del:删除,stop:异常停用stop_sa: 异常停用销售冻结,stop_risk: 异常停用风控冻结
	 */
	private String status;
	
	/**************以下字段销售用户暂时用不上了 start*********/
	private Long deptId;
	private String department;
	private String token;
	private Date entryTime;
	private String appcode;
	private Long applicantId;
	private Long accountId;
	private String reserver1;
	private String reserver2;
	private String mobTel2;
	private String famTel;
	private String comTel;
	private String title;
	/**************以上字段销售用户暂时用不上了 end************/

	
	/**************销售用户新曾页面传的参数 start***************/
	private String company; //公司
	private String region; //大区
	private String province; //省
	private String city; //市 
	private String[] saRoles; //sa
	private String groupName; //上级所在地
	/**************销售用户新曾页面传的参数  end*****************/
	
	
	/**************销售用户查询存放用户状态传的参数  start*********/
	private List<String> groupIdList;
	
	//list查询设参数
	private List<String> userStatusList;
	private List<String> statusList;
	
	private String parentUserName;
	private String parentLoginName;
	/**************销售用户查询存放用户状态传的参数  end***********/
	
	
	/**************销售用户存放附属管辖区域 入参传值   start********/
	private String attachedCompany;
	private String attachedOgrIds;
	private List<String> attachedOgrIdList;
	/**************销售用户存放附属管辖区域 入参传值   end**********/

	
	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company = company;
	}

	public String getRegion()
	{
		return region;
	}

	public void setRegion(String region)
	{
		this.region = region;
	}

	public String getProvince()
	{
		return province;
	}

	public void setProvince(String province)
	{
		this.province = province;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String[] getSaRoles() {
		return saRoles;
	}

	public void setSaRoles(String[] saRoles) {
		this.saRoles = saRoles;
	}

	public String getParentUserName() {
		return parentUserName;
	}

	public void setParentUserName(String parentUserName) {
		this.parentUserName = parentUserName;
	}
	
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<String> getGroupIdList() {
		return groupIdList;
	}

	public void setGroupIdList(List<String> groupIdList) {
		this.groupIdList = groupIdList;
	}

	public String getParentLoginName() {
		return parentLoginName;
	}

	public void setParentLoginName(String parentLoginName) {
		this.parentLoginName = parentLoginName;
	}

	public String getAttachedOgrIds() {
		return attachedOgrIds;
	}

	public void setAttachedOgrIds(String attachedOgrIds) {
		this.attachedOgrIds = attachedOgrIds;
	}

	public List<String> getAttachedOgrIdList() {
		return attachedOgrIdList;
	}

	public void setAttachedOgrIdList(List<String> attachedOgrIdList) {
		this.attachedOgrIdList = attachedOgrIdList;
	}

	public String getAttachedCompany() {
		return attachedCompany;
	}

	public void setAttachedCompany(String attachedCompany) {
		this.attachedCompany = attachedCompany;
	}

	public List<String> getUserStatusList() {
		return userStatusList;
	}

	public void setUserStatusList(List<String> userStatusList) {
		this.userStatusList = userStatusList;
	}

	public List<String> getStatusList() {
		return statusList;
	}

	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getMobTel1() {
		return mobTel1;
	}

	public void setMobTel1(String mobTel1) {
		this.mobTel1 = mobTel1;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getStopStatus() {
		return stopStatus;
	}

	public void setStopStatus(String stopStatus) {
		this.stopStatus = stopStatus;
	}

	public String getParentUserLoginName() {
		return parentUserLoginName;
	}

	public void setParentUserLoginName(String parentUserLoginName) {
		this.parentUserLoginName = parentUserLoginName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserCategory() {
		return userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}

	public String getIsStop() {
		return isStop;
	}

	public void setIsStop(String isStop) {
		this.isStop = isStop;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public String getAppcode() {
		return appcode;
	}

	public void setAppcode(String appcode) {
		this.appcode = appcode;
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

	public String getReserver1() {
		return reserver1;
	}

	public void setReserver1(String reserver1) {
		this.reserver1 = reserver1;
	}

	public String getReserver2() {
		return reserver2;
	}

	public void setReserver2(String reserver2) {
		this.reserver2 = reserver2;
	}

	public String getMobTel2() {
		return mobTel2;
	}

	public void setMobTel2(String mobTel2) {
		this.mobTel2 = mobTel2;
	}

	public String getFamTel() {
		return famTel;
	}

	public void setFamTel(String famTel) {
		this.famTel = famTel;
	}

	public String getComTel() {
		return comTel;
	}

	public void setComTel(String comTel) {
		this.comTel = comTel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "SAUserInfo [userId=" + userId + ", groupId=" + groupId + ", userName=" + userName + ", loginName="
				+ loginName + ", password=" + password + ", employeeId=" + employeeId + ", mobTel1=" + mobTel1
				+ ", modifyTime=" + modifyTime + ", createTime=" + createTime + ", email=" + email + ", cardId="
				+ cardId + ", initPwdType=" + initPwdType + ", updatePwdTime=" + updatePwdTime + ", position="
				+ position + ", stopStatus=" + stopStatus + ", parentUserLoginName=" + parentUserLoginName
				+ ", userType=" + userType + ", userSex=" + userSex + ", userStatus=" + userStatus + ", userCategory="
				+ userCategory + ", isStop=" + isStop + ", status=" + status + ", deptId=" + deptId + ", department="
				+ department + ", token=" + token + ", entryTime=" + entryTime + ", appcode=" + appcode
				+ ", applicantId=" + applicantId + ", accountId=" + accountId + ", reserver1=" + reserver1
				+ ", reserver2=" + reserver2 + ", mobTel2=" + mobTel2 + ", famTel=" + famTel + ", comTel=" + comTel
				+ ", title=" + title + ", company=" + company + ", region=" + region + ", province=" + province
				+ ", city=" + city + ", saRoles=" + Arrays.toString(saRoles) + ", groupName=" + groupName
				+ ", groupIdList=" + groupIdList + ", userStatusList=" + userStatusList + ", statusList=" + statusList + ", parentUserName="
				+ parentUserName + ", parentLoginName=" + parentLoginName + ", attachedCompany=" + attachedCompany
				+ ", attachedOgrIds=" + attachedOgrIds + ", attachedOgrIdList=" + attachedOgrIdList + "]";
	} 
}
