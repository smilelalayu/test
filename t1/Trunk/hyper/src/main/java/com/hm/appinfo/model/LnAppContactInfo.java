package com.hm.appinfo.model;

import java.util.Date;

/**
 * @ClassName: LnAppContactInfo
 * @Description: 贷款客户联系人实体
 * @author qiuyuan
 * @date 2016年4月11日 下午2:25:36
 * @Copyright (c) 2016, 9fchaoneng.com All Rights Reserved.
 */
public class LnAppContactInfo {
	private Long id;

    private Long appId;

    /**
     * 联系人姓名
     */
    private String contractName;

    /**
     * 联系人电话
     */
    private String contractPhone;

    /**
     * 联系人性别
     */
    private String contractSex;

    /**
     * 联系人地址
     */
    private String contractAddress;

    /**
     * 是否紧急联系人
     */
    private String isUrgency;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String createdby;

    /**
     * 创建时间
     */
    private Date createdon;

    /**
     * 修改人
     */
    private String modifiedby;

    /**
     * 修改时间
     */
    private Date modifiedon;

    /**
     * 电话性质
     */
    private String mobileType;

    private Integer version;

    /**
     * 联系人性质
     */
    private String contractType;
    
    /**
     * 
     * 联系人类别
     */
    private String contractProperty;

    /**
     * 联系人工作单位
     */
    private String contractUnit;
    
    /** 联系人微信号 */
    private String contactWeixin;
    
    /** 联系人QQ号 */
    private String contactQq;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    public String getContractPhone() {
        return contractPhone;
    }

    public void setContractPhone(String contractPhone) {
        this.contractPhone = contractPhone == null ? null : contractPhone.trim();
    }

    public String getContractSex() {
        return contractSex;
    }

    public void setContractSex(String contractSex) {
        this.contractSex = contractSex == null ? null : contractSex.trim();
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress == null ? null : contractAddress.trim();
    }

    public String getIsUrgency() {
        return isUrgency;
    }

    public void setIsUrgency(String isUrgency) {
        this.isUrgency = isUrgency == null ? null : isUrgency.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
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
        this.modifiedby = modifiedby == null ? null : modifiedby.trim();
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
        this.mobileType = mobileType == null ? null : mobileType.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getContractProperty() {
        return contractProperty;
    }

    public void setContractProperty(String contractProperty) {
        this.contractProperty = contractProperty == null ? null : contractProperty.trim();
    }

    public String getContractUnit() {
        return contractUnit;
    }

    public void setContractUnit(String contractUnit) {
        this.contractUnit = contractUnit == null ? null : contractUnit.trim();
    }

	public String getContactWeixin() {
		return contactWeixin;
	}

	public void setContactWeixin(String contactWeixin) {
		this.contactWeixin = contactWeixin;
	}

	public String getContactQq() {
		return contactQq;
	}

	public void setContactQq(String contactQq) {
		this.contactQq = contactQq;
	}
    
    
	
}