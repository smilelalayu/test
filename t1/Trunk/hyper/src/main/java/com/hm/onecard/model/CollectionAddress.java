package com.hm.onecard.model;

public class CollectionAddress {
	
	private String address1; //地址行1
	private String address2; //地址行2
	private String address3; //地址行3
	private String address4; //地址行4
	private String address5; //地址行5
	private String postCode; //邮政编码
	private String provCode; //省市代码
	private String addressType; //地址类型
	private String addressKey; //客户、商户地址标志
	private String dealerCode; //商户代码
	private String isForeignAddress; //是否境外地址
	private String updateDate; //修改日期
	private String updateTime; //修改时间
	private String increaseDate; //新增日期
	private String increaseTime; //新增时间
	
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getAddress4() {
		return address4;
	}
	public void setAddress4(String address4) {
		this.address4 = address4;
	}
	public String getAddress5() {
		return address5;
	}
	public void setAddress5(String address5) {
		this.address5 = address5;
	}
	public String getAddressKey() {
		return addressKey;
	}
	public void setAddressKey(String addressKey) {
		this.addressKey = addressKey;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getProvCode() {
		return provCode;
	}
	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	public String getDealerCode() {
		return dealerCode;
	}
	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}
	public String getIsForeignAddress() {
		return isForeignAddress;
	}
	public void setIsForeignAddress(String isForeignAddress) {
		this.isForeignAddress = isForeignAddress;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getIncreaseDate() {
		return increaseDate;
	}
	public void setIncreaseDate(String increaseDate) {
		this.increaseDate = increaseDate;
	}
	public String getIncreaseTime() {
		return increaseTime;
	}
	public void setIncreaseTime(String increaseTime) {
		this.increaseTime = increaseTime;
	}
	
	
	@Override
	public String toString() {
		return "CollectionAddress [address1=" + address1 + ", address2=" + address2 + ", address3=" + address3
				+ ", address4=" + address4 + ", address5=" + address5 + ", postCode=" + postCode + ", provCode="
				+ provCode + ", addressType=" + addressType + ", addressKey=" + addressKey + ", dealerCode="
				+ dealerCode + ", isForeignAddress=" + isForeignAddress + ", updateDate=" + updateDate + ", updateTime="
				+ updateTime + ", increaseDate=" + increaseDate + ", increaseTime=" + increaseTime + "]";
	}

}
