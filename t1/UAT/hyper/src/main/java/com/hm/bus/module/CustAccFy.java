package com.hm.bus.module;

import java.util.Date;

/**
 * 富友开户信息对象
 * 
 * @author hongqiuxia
 *
 */
public class CustAccFy {
	/** 身份证号码 */
	private String cardId;
	/** 平台代码 */
	private String platformNo;
	/** 流水号 */
	private String seqNo;
	/** 客户姓名 */
	private String custName;
	/** 手机号码 */
	private String mobileNo;
	/** 邮箱地址 */
	private String email;
	/** 开户行地区代码 */
	private String cityCode;
	/** 开户行行别 */
	private String bankCode;
	/** 开户行支行名称 */
	private String bankName;
	/** 帐号 */
	private String bankAcc;
	/** 提现密码 */
	private String password;
	/** 登录密码 */
	private String lpassword;
	/** 备注 */
	private String remark;
	/** 签名 */
	private String signature;
	/** 商户代码 */
	private String mchntCd;
	/** 响应码,0000：成功,其他失败 */
	private String respCode;
	/** 超能省级编码 */
	private String cnProvCode;
	/** 超能市级编码 */
	private String cnCityCode;
	/** 成功:Y，失败:N */
	private String status;
	/** 创建时间 */
	private Date createTime;
	/** 修改时间 */
	private Date updateTime;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId == null ? null : cardId.trim();
	}

	public String getPlatformNo() {
		return platformNo;
	}

	public void setPlatformNo(String platformNo) {
		this.platformNo = platformNo == null ? null : platformNo.trim();
	}

	public String getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo == null ? null : seqNo.trim();
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName == null ? null : custName.trim();
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo == null ? null : mobileNo.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode == null ? null : cityCode.trim();
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode == null ? null : bankCode.trim();
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName == null ? null : bankName.trim();
	}

	public String getBankAcc() {
		return bankAcc;
	}

	public void setBankAcc(String bankAcc) {
		this.bankAcc = bankAcc == null ? null : bankAcc.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getLpassword() {
		return lpassword;
	}

	public void setLpassword(String lpassword) {
		this.lpassword = lpassword == null ? null : lpassword.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature == null ? null : signature.trim();
	}

	public String getMchntCd() {
		return mchntCd;
	}

	public void setMchntCd(String mchntCd) {
		this.mchntCd = mchntCd == null ? null : mchntCd.trim();
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode == null ? null : respCode.trim();
	}

	public String getCnProvCode() {
		return cnProvCode;
	}

	public void setCnProvCode(String cnProvCode) {
		this.cnProvCode = cnProvCode == null ? null : cnProvCode.trim();
	}

	public String getCnCityCode() {
		return cnCityCode;
	}

	public void setCnCityCode(String cnCityCode) {
		this.cnCityCode = cnCityCode == null ? null : cnCityCode.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}