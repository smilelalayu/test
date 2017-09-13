package com.hm.bus.module;

import java.util.Date;

public class LnAppStatusPending {
    private Long id;

    private Long appId;

    private String inputTradeNo;

    private Date inputTime;

    private String outputTradeNo;

    private Date outputTime;

    private String status;

    private String desp;

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

    public String getInputTradeNo() {
        return inputTradeNo;
    }

    public void setInputTradeNo(String inputTradeNo) {
        this.inputTradeNo = inputTradeNo == null ? null : inputTradeNo.trim();
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getOutputTradeNo() {
        return outputTradeNo;
    }

    public void setOutputTradeNo(String outputTradeNo) {
        this.outputTradeNo = outputTradeNo == null ? null : outputTradeNo.trim();
    }

    public Date getOutputTime() {
        return outputTime;
    }

    public void setOutputTime(Date outputTime) {
        this.outputTime = outputTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp == null ? null : desp.trim();
    }
}