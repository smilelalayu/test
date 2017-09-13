package com.hm.onecard.model;

import java.util.List;

public class BaseData {

	/**
	 * 名字
	 */
	private String name;
	/**
	 * 手机
	 */
	private String mobile;
	/**
	 * 身份证
	 */
	private String certId;
	/**
	 * 销售id
	 */
	private String saId;
	/**
	 * 客户类型 1 pos工单确认用户 2 超能存量用户
	 */
	private String custType;
	/**
	 * 额度信息
	 */
	private Quota quota;
	/**
	 * 个人信息
	 */
	private Extend extend;
	/**
	 * 身份证附件信息
	 */
	private Attach attach;
	
	/*
	 * 催收客户信息
	 */
	private CollectionCustomer csCustomer;
	/*
	 * 催收地址
	 */
	private List<CollectionAddress> csAddress;
	/*
	 * 催收联系人
	 */
	private List<CollectionMobile> csMobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCertId() {
		return certId;
	}
	public void setCertId(String certId) {
		this.certId = certId;
	}
	public String getSaId() {
		return saId;
	}
	public void setSaId(String saId) {
		this.saId = saId;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public Quota getQuota() {
		return quota;
	}
	public void setQuota(Quota quota) {
		this.quota = quota;
	}
	public Extend getExtend() {
		return extend;
	}
	public void setExtend(Extend extend) {
		this.extend = extend;
	}
	public Attach getAttach() {
		return attach;
	}
	public void setAttach(Attach attach) {
		this.attach = attach;
	}
	public CollectionCustomer getCsCustomer() {
		return csCustomer;
	}
	public void setCsCustomer(CollectionCustomer csCustomer) {
		this.csCustomer = csCustomer;
	}
	public List<CollectionAddress> getCsAddress() {
		return csAddress;
	}
	public void setCsAddress(List<CollectionAddress> csAddress) {
		this.csAddress = csAddress;
	}
	public List<CollectionMobile> getCsMobile() {
		return csMobile;
	}
	public void setCsMobile(List<CollectionMobile> csMobile) {
		this.csMobile = csMobile;
	}
	
}
