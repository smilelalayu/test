package com.hm.bus.module;

import java.util.Date;

public class BusBatchInfo {
	private String batchNO;

	private String fileKey;

	private String fileName;
	private Date appayDate;//批次的申请时间
	private Date beginDate;
	private Date endDate;

	private Long total;

	private Long totalSuccess = 0l;

	private Long totalFail = 0l;
	
	private Long totalUnsent = 0l;

	private String updateUser;
	private Date updateTime;

	private String remark;

	private String isNoParam;// 是否有查询参数
	
	private String updateUserName;
	private boolean sentToBus = false;//是否发送至bus

	public String getIsNoParam() {
		return isNoParam;
	}

	public void setIsNoParam(String isNoParam) {
		this.isNoParam = isNoParam;
	}

	public String getBatchNO() {
		return batchNO;
	}

	public void setBatchNO(String batchNO) {
		this.batchNO = batchNO == null ? null : batchNO.trim();
	}

	public String getFileKey() {
		return fileKey;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey == null ? null : fileKey.trim();
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getTotalSuccess() {
		return totalSuccess;
	}

	public void setTotalSuccess(Long totalSuccess) {
		this.totalSuccess = totalSuccess;
	}

	public Long getTotalFail() {
		return totalFail;
	}

	public void setTotalFail(Long totalFail) {
		this.totalFail = totalFail;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser == null ? null : updateUser.trim();
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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUpdateUserName() {
		return this.updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public boolean isSentToBus() {
		return sentToBus;
	}

	public void setSentToBus(boolean sentToBus) {
		this.sentToBus = sentToBus;
	}

	public Long getTotalUnsent() {
		return totalUnsent;
	}

	public void setTotalUnsent(Long totalUnsent) {
		this.totalUnsent = totalUnsent;
	}

	public Date getAppayDate() {
		return appayDate;
	}

	public void setAppayDate(Date appayDate) {
		this.appayDate = appayDate;
	}


}