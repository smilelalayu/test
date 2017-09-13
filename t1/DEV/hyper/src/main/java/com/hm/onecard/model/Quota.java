package com.hm.onecard.model;

import java.math.BigDecimal;
/**
 * 
 * @description :额度信息
 * @author hewei
 * @date 2017年2月13日 下午3:32:47
 */
public class Quota {

	/*
	 * 超能额度
	 */
	private BigDecimal countQuota;
	/*
	 * 超能已用额度
	 */
	private BigDecimal usedQuota;
	/*
	 * 分期数
	 */
	private int peroid;
	/*
	 * 超能工单号
	 */
	private String appId;
	
	/*
	 * 超能渠道号
	 */
	private String channel;
	
	/*
	 * 超能POS贷产品名称
	 */
	private String productName;
	
	/*
	 * 超能产品ID
	 */
	private String productId;
	/*
	 * 借款日期（提交借款申请的日期）（格式：yyyy-MM-dd HH:mm:ss）
	 */
	private String borrowDate;
	/*
	 * 合同id
	 */
	private String contractId;
	/*
	 * 合同地址
	 */
	private String contractUrl;
	/*
	 * 合同签章时间格式（yyyy-MM-dd HH:mm:ss）
	 */
	private String contractDate;
	
	
	
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getContractUrl() {
		return contractUrl;
	}
	public void setContractUrl(String contractUrl) {
		this.contractUrl = contractUrl;
	}
	public String getContractDate() {
		return contractDate;
	}
	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}
	public BigDecimal getCountQuota() {
		return countQuota;
	}
	public void setCountQuota(BigDecimal countQuota) {
		this.countQuota = countQuota;
	}
	public BigDecimal getUsedQuota() {
		return usedQuota;
	}
	public void setUsedQuota(BigDecimal usedQuota) {
		this.usedQuota = usedQuota;
	}
	public int getPeroid() {
		return peroid;
	}
	public void setPeroid(int peroid) {
		this.peroid = peroid;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	
	@Override
	public String toString() {
		return "wkQuate [countQuota=" + countQuota + ", usedQuota=" + usedQuota + ", peroid=" + peroid + ", appId="
				+ appId + ", channel=" + channel + ", productName=" + productName + ", productId=" + productId
				+ ", borrowDate=" + borrowDate + ", contractId=" + contractId + ", contractUrl=" + contractUrl
				+ ", contractDate=" + contractDate + "]";
	}
}
