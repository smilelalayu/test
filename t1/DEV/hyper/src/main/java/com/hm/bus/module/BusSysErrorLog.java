package com.hm.bus.module;

import java.util.Date;

public class BusSysErrorLog {
	private Integer id;

	private String errMsg;

	private String errThrowable;
	private String err;

	private Date updateTime;
	private Date beginDate;
	private Date endDate;

	public String getErr() {
		return err;
	}

	public void setErr(String err) {
		this.err = err;
	}

	private String remark;

	public Integer getId() {
		return id;
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

	public void setId(Integer id) {
		this.id = id;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg == null ? null : errMsg.trim();
	}

	public String getErrThrowable() {
		return errThrowable;
	}

	public void setErrThrowable(String errThrowable) {
		this.errThrowable = errThrowable == null ? null : errThrowable.trim();
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
}