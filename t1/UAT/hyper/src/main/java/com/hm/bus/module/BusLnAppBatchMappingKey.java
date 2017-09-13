package com.hm.bus.module;

public class BusLnAppBatchMappingKey {
    private String batchNo;

    private Long lnAppId;

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public Long getLnAppId() {
        return lnAppId;
    }

    public void setLnAppId(Long lnAppId) {
        this.lnAppId = lnAppId;
    }
}