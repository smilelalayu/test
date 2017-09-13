package com.times.acs.pojo.admin;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.miitgxt.common.model.BaseModel;



/** @author Hibernate CodeGenerator */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true, value = { "hibernateLazyInitializer"})
public class UserGroupPOJO extends BaseModel<UserGroupPOJO,Long> implements Serializable {

	/** identifier field */
	@Id
	@GeneratedValue
	private Long groupId;

	/** persistent field */
	private String groupName;

	/** nullable persistent field */
	private java.util.Date modifyTime;

	/** nullable persistent field */
	private java.util.Date createTime;

	/** nullable persistent field */
	private String reserver1;

	/** nullable persistent field */
	private String reserver2;

	private String groupCode;

	private Integer level;
	private String description;
	private String ordernum;
	private String address;
	private String contact1;
	private String contact2;
	private String contactPerson;
	private String telephone;
	private String fax;
	private Integer groupType;
	private Long id;
	/** 单用户多组织机构的多个groupId字符串，如1,2,3,4,5 */
	private String groupIds;
	
	public Long getId() {
		return this.groupId;
	}

	public void setId(Long id) {
		this.groupId = id;
	}

	/**
	 * 管局or司局ID
	 */
	private Long sjID;

	private String sjName;// 司局或管局名称
	/**
	 * 
	 * 字符串格式机构ID，用于内网
	 */
	private String strGroupId;

	private Set<UserInfoPOJO> users = new HashSet<UserInfoPOJO>();

	private Set<UsergroupRolePOJO> roles = new HashSet<UsergroupRolePOJO>();

	private UserGroupPOJO parent;

	
	private Set<UserGroupPOJO> childs = new HashSet<UserGroupPOJO>();

	@JsonIgnore
	public Set<UserInfoPOJO> getUsers() {
		return users;
	}

	public void setUsers(Set<UserInfoPOJO> users) {
		this.users = users;
	}
	@JsonIgnore
	public Set<UsergroupRolePOJO> getRoles() {
		return roles;
	}
	@JsonIgnore
	public void setRoles(Set<UsergroupRolePOJO> roles) {
		this.roles = roles;
	}

	public UserGroupPOJO getParent() {
		return parent;
	}

	public void setParent(UserGroupPOJO parent) {
		this.parent = parent;
	}
	@JsonIgnore
	public Set<UserGroupPOJO> getChilds() {
		return childs;
	}

	public void setChilds(Set<UserGroupPOJO> childs) {
		this.childs = childs;
	}

	/** full constructor */
	public UserGroupPOJO(java.lang.String groupName, java.util.Date modifyTime,
			java.util.Date createTime, java.lang.String reserver1,
			java.lang.String reserver2, String groupCode,String groupIds) {
		this.groupName = groupName;
		this.modifyTime = modifyTime;
		this.createTime = createTime;
		this.reserver1 = reserver1;
		this.reserver2 = reserver2;
		this.groupCode = groupCode;
		this.groupIds = groupIds;
	}

	/** default constructor */
	public UserGroupPOJO() {
	}

	/** minimal constructor */
	public UserGroupPOJO(java.lang.String groupName) {
		this.groupName = groupName;

	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public java.lang.String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(java.lang.String groupName) {
		this.groupName = groupName;
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

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact1() {
		return contact1;
	}

	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}

	public String getContact2() {
		return contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Integer getGroupType() {
		return groupType;
	}

	public void setGroupType(Integer groupType) {
		this.groupType = groupType;
	}

	@Version
	protected Integer version;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getStrGroupId() {
		return strGroupId;
	}

	public void setStrGroupId(String strGroupId) {
		this.strGroupId = strGroupId;
	}

	public Long getSjID() {
		return sjID;
	}

	public void setSjID(Long sjID) {
		this.sjID = sjID;
	}

	public String getSjName() {
		return sjName;
	}

	public void setSjName(String sjName) {
		this.sjName = sjName;
	}

	public String getGroupIds() {
		return groupIds;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
	}
}
