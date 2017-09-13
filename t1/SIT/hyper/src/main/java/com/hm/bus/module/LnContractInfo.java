package com.hm.bus.module;

// Generated 2015-8-10 8:39:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;


/**
 * 贷款客户联系人实体
 */
public class LnContractInfo {

	private Long id;
	private Integer version;
	private Long appId;
	private String contractType;
	private String contractName;
	private String contractPhone;
	private Character contractSex;
	private String contractAddress;
	private Character isUrgency;
	private String remark;
	private String createdby;
	private Date createdon;
	private String modifiedby;
	private Date modifiedon;
	private String mobileType;
	private String contractProperty;
	private String contractUnit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractPhone() {
		return contractPhone;
	}

	public void setContractPhone(String contractPhone) {
		this.contractPhone = contractPhone;
	}

	public Character getContractSex() {
		return contractSex;
	}

	public void setContractSex(Character contractSex) {
		this.contractSex = contractSex;
	}

	public String getContractAddress() {
		return contractAddress;
	}

	public void setContractAddress(String contractAddress) {
		this.contractAddress = contractAddress;
	}

	public Character getIsUrgency() {
		return isUrgency;
	}

	public void setIsUrgency(Character isUrgency) {
		this.isUrgency = isUrgency;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

	public String getMobileType() {
		return mobileType;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

	public String getContractProperty() {
		return contractProperty;
	}

	public void setContractProperty(String contractProperty) {
		this.contractProperty = contractProperty;
	}

	public String getContractUnit() {
		return contractUnit;
	}

	public void setContractUnit(String contractUnit) {
		this.contractUnit = contractUnit;
	}
}
