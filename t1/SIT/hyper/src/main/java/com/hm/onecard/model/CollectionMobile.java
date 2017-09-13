package com.hm.onecard.model;

public class CollectionMobile {
	
	private String name; //联系人姓名
	private String contractNO; //联系人证件号码
	private String contractPhone; //联系人电话
	private String contractPhone1; //联系人电话分机
	private String contractCompany; //联系人单位
	private String contractMobile; //联系人手机
	private String contractRelation; //联系人与客户关系
	private String contractType; //联系人类别
	private String updateTime; //记录变更日期
	private String contractAreaNo; //联系人电话区号
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContractNO() {
		return contractNO;
	}
	public void setContractNO(String contractNO) {
		this.contractNO = contractNO;
	}
	public String getContractPhone() {
		return contractPhone;
	}
	public void setContractPhone(String contractPhone) {
		this.contractPhone = contractPhone;
	}
	public String getContractPhone1() {
		return contractPhone1;
	}
	public void setContractPhone1(String contractPhone1) {
		this.contractPhone1 = contractPhone1;
	}
	public String getContractCompany() {
		return contractCompany;
	}
	public void setContractCompany(String contractCompany) {
		this.contractCompany = contractCompany;
	}
	public String getContractMobile() {
		return contractMobile;
	}
	public void setContractMobile(String contractMobile) {
		this.contractMobile = contractMobile;
	}
	public String getContractRelation() {
		return contractRelation;
	}
	public void setContractRelation(String contractRelation) {
		this.contractRelation = contractRelation;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getContractAreaNo() {
		return contractAreaNo;
	}
	public void setContractAreaNo(String contractAreaNo) {
		this.contractAreaNo = contractAreaNo;
	}
	@Override
	public String toString() {
		return "CnMobile [name=" + name + ", contractNO=" + contractNO + ", contractPhone=" + contractPhone
				+ ", contractPhone1=" + contractPhone1 + ", contractCompany=" + contractCompany + ", contractMobile="
				+ contractMobile + ", contractRelation=" + contractRelation + ", contractType=" + contractType
				+ ", updateTime=" + updateTime + ", contractAreaNo=" + contractAreaNo + "]";
	}
	
	
}
