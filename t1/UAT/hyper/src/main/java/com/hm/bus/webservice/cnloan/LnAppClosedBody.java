package com.hm.bus.webservice.cnloan;

import java.io.Serializable;

/**
 * 工单关闭参数对象
 * 
 * @author leimeng E-mail: leimeng@9fchaoneng.com
 * @version 创建时间：2017年1月23日 下午2:52:29
 */
public class LnAppClosedBody implements Serializable {

	private static final long serialVersionUID = 4069784616994540397L;

	private String appId;// BUS工单号

	private String saleChannel;// 渠道号

	private String productId;// 产品ID

	private String saleChannelKey;// 渠道唯一码

	private String productIdKey;// 产品唯一码


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

	@Override
	public String toString() {
		return "LnAppClosedBody [appId=" + appId + ", saleChannel=" + saleChannel + ", productId=" + productId + ", saleChannelKey=" + saleChannelKey
				+ ", productIdKey=" + productIdKey + "]";
	}

}
