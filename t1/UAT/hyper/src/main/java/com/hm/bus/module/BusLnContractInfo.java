package com.hm.bus.module;

import java.util.Date;

public class BusLnContractInfo {
    private Long id;

    private Long appId;

    private String contractType;

    private String contractName;

    private String contractPhone;

    private String contractSex;

    private String contractAddress;

    private String isUrgency;

    private String remark;

    private String createdby;

    private Date createdon;

    private String modifiedby;

    private Date modifiedon;

    private String mobileType;

    private Integer version;

    private String contractProperty;

    private String contractUnit;

    private String contactWeixin;

    private String contactQq;

    private String customerSex;

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

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
        this.contactWeixin = contactWeixin == null ? null : contactWeixin.trim();
    }

    public String getContactQq() {
        return contactQq;
    }

    public void setContactQq(String contactQq) {
        this.contactQq = contactQq == null ? null : contactQq.trim();
    }
}