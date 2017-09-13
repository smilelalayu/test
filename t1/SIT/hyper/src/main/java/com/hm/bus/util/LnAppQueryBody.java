package com.hm.bus.util;

import java.io.Serializable;

public class LnAppQueryBody implements Serializable {


	private static final long serialVersionUID = -3472056897884952268L;
	
	private String appId;
	private String saleChannel;
	private String productId;
	private String saleChannelKey;
	private String productIdKey;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getSaleChannel() {
		return saleChannel;
	}

	public void setSaleChannel(String saleChannel) {
		this.saleChannel = saleChannel;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSaleChannelKey() {
		return saleChannelKey;
	}

	public void setSaleChannelKey(String saleChannelKey) {
		this.saleChannelKey = saleChannelKey;
	}

	public String getProductIdKey() {
		return productIdKey;
	}

	public void setProductIdKey(String productIdKey) {
		this.productIdKey = productIdKey;
	}

}
