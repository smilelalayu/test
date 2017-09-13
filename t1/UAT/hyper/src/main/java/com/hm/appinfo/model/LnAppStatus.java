package com.hm.appinfo.model;

import java.io.Serializable;

public class LnAppStatus implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8921662773404742587L;
    
	private long id;
	private String tradeNo;
	private String tradeName;
	private String code;
	private String type;
	private String statusDesc;
	private String statusDescOuter;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getStatusDescOuter() {
		return statusDescOuter;
	}
	public void setStatusDescOuter(String statusDescOuter) {
		this.statusDescOuter = statusDescOuter;
	}
	
	
}