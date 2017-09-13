package com.hm.contract.model;

import java.util.Date;

public class QzContractApp {
    private Long id;

    private Long appId;

    private String signStatus;

    private String custSignStatus;

    private String firmSignStatus;

    private Date custSignTime;

    private Date firmSignTime;

    private Date signTime;

    private Integer nonSignNums;

    private String laAttachStatus;

    private String creater;

    private Date createTime;

    private String modifieder;

    private Date modeifiedTime;

    private String custSource;

    private String firmSource;

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

    public String getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus == null ? null : signStatus.trim();
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

    public Date getCustSignTime() {
        return custSignTime;
    }

    public void setCustSignTime(Date custSignTime) {
        this.custSignTime = custSignTime;
    }

    public Date getFirmSignTime() {
        return firmSignTime;
    }

    public void setFirmSignTime(Date firmSignTime) {
        this.firmSignTime = firmSignTime;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Integer getNonSignNums() {
        return nonSignNums;
    }

    public void setNonSignNums(Integer nonSignNums) {
        this.nonSignNums = nonSignNums;
    }

    public String getLaAttachStatus() {
        return laAttachStatus;
    }

    public void setLaAttachStatus(String laAttachStatus) {
        this.laAttachStatus = laAttachStatus == null ? null : laAttachStatus.trim();
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

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource == null ? null : custSource.trim();
    }

    public String getFirmSource() {
        return firmSource;
    }

    public void setFirmSource(String firmSource) {
        this.firmSource = firmSource == null ? null : firmSource.trim();
    }
}