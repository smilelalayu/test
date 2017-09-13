package com.hm.bus.module;

import java.util.Date;

public class BusLnAppBatchMapping extends BusLnAppBatchMappingKey {
    private Date updateTime;

    private String remark;

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}