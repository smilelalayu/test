package com.hm.bus.module;

import java.util.Date;

import com.gep.core.util.DateUtils;

public class BusSentLog {
    private Integer id;

    private String batchNo;

    private Long lnAppId;

    private String busType;

    private String state;

    private String returnCode;

    private String errorCode;

    private String errorMsg;

    private Date updateTime;

    private String remark;
    
    private String recordType;
    
    private String busTypeName;
    
    private String recordTypeName;
    
    private String stateName;
    
    @SuppressWarnings("unused")
    private String updateTimeFormat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getBusType() {
        return busType;
    }
    
    public void setBusType(String busType) {
        this.busType = busType == null ? null : busType.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

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
    
	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	
	public String getBusTypeName() {
	    if (busType != null) {
            switch (this.busType) {
            case "1":
                this.busTypeName = "发送至BUS";
                break;
            case "2":
                busTypeName = "确认放款状态";
                break;
            case "3":
                busTypeName = "生成还款计划";
                break;
            case "4":
                busTypeName = "查询万卡额度系统日志";
                break;
            }
            return busTypeName;
        }else{
            return busType;
        }
    }

    public String getRecordTypeName() {
        if (recordType != null) {
            switch (this.recordType) {
            case "1":
                this.recordTypeName = "交易日志";
                break;
            case "2":
                recordTypeName = "检查日志";
                break;
            }
            return recordTypeName;
        }else{
            return recordType;
        }
    }

    public String getStateName() {
        if (state != null) {
            switch (this.state) {
            case "1":
                this.stateName = "成功";
                break;
            case "2":
                stateName = "失败";
                break;
            }
            return stateName;
        }else{
            return state;
        }
    }

    public String getUpdateTimeFormat() {
        if (updateTime != null) {
            return DateUtils.formatDateTime(updateTime);
        }else{
            return null;
        }
    }

    @Override
	public String toString() {
		return "BusSentLog [id=" + id + ", batchNo=" + batchNo + ", lnAppId="
				+ lnAppId + ", busType=" + busType + ", state=" + state
				+ ", returnCode=" + returnCode + ", errorCode=" + errorCode
				+ ", errorMsg=" + errorMsg + ", updateTime=" + updateTime
				+ ", remark=" + remark + "]";
		
	}
    
    
}