package com.hm.contract.model;

import java.util.Date;

public class QzContractFile {
    private Long id;

    private Long appId;

    private String contractType;

    private String contractName;

    private String custSignStatus;

    private String firmSignStatus;

    private String ossId;

    private String contractCategory;

    private String url;

    private String source;

    private String creater;

    private Date createTime;

    private String modifieder;

    private Date modeifiedTime;

    private String status;

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

    public String getCustSignStatus() {
        return custSignStatus;
    }

    public void setCustSignStatus(String custSignStatus) {
        this.custSignStatus = custSignStatus == null ? null : custSignStatus.trim();
    }

    public String getFirmSignStatus() {
        return firmSignStatus;
    }

    public void setFirmSignStatus(String firmSignStatus) {
        this.firmSignStatus = firmSignStatus == null ? null : firmSignStatus.trim();
    }

    public String getOssId() {
        return ossId;
    }

    public void setOssId(String ossId) {
        this.ossId = ossId == null ? null : ossId.trim();
    }

    public String getContractCategory() {
        return contractCategory;
    }

    public void setContractCategory(String contractCategory) {
        this.contractCategory = contractCategory == null ? null : contractCategory.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifieder() {
        return modifieder;
    }

    public void setModifieder(String modifieder) {
        this.modifieder = modifieder == null ? null : modifieder.trim();
    }

    public Date getModeifiedTime() {
        return modeifiedTime;
    }

    public void setModeifiedTime(Date modeifiedTime) {
        this.modeifiedTime = modeifiedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}