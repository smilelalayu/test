package com.hm.appinfo.model;

import java.util.Date;

public class LnCommodityCode {
    private Long id;

    private Long appId;

    private Long codeType;

    private String codeName;

    private String createdby;

    private Date createtime;

    private String operationSeq;

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

    public Long getCodeType() {
        return codeType;
    }

    public void setCodeType(Long codeType) {
        this.codeType = codeType;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getOperationSeq() {
        return operationSeq;
    }

    public void setOperationSeq(String operationSeq) {
        this.operationSeq = operationSeq == null ? null : operationSeq.trim();
    }
}