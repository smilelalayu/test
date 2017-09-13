package com.hm.bus.module;

import java.util.Date;

public class LnAppColsedInfo {
    private Long id;

    private Long appId;

    private String busAppid;

    private String causeDesc;

    private String operatorby;

    private Date createTime;

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

    public String getBusAppid() {
        return busAppid;
    }

    public void setBusAppid(String busAppid) {
        this.busAppid = busAppid == null ? null : busAppid.trim();
    }

    public String getCauseDesc() {
        return causeDesc;
    }

    public void setCauseDesc(String causeDesc) {
        this.causeDesc = causeDesc == null ? null : causeDesc.trim();
    }

    public String getOperatorby() {
        return operatorby;
    }

    public void setOperatorby(String operatorby) {
        this.operatorby = operatorby == null ? null : operatorby.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}