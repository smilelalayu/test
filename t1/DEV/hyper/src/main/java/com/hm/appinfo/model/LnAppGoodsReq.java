package com.hm.appinfo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class LnAppGoodsReq  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5755384399272115838L;
	

	/**
	 * 产品Id
	 */
	private Long productId;

	private String productName;

	/**
	 * 货物类别
	 */
	private String cargoType;

	/**
	 * 货物类别
	 */
	private String cargoTypeName;

	/**
	 * 商品类型
	 */
	private String commodityClass;

	/**
	 * 商品类型
	 */
	private String commodityClassName;

	/**
	 * 商品品牌
	 */
	private String commodityName;
	/**
	 * 商品型号
	 */
	private String commodityType;
	/**
	 * 商品价格
	 */
	private BigDecimal commodityPrice;

	public String getCargoType()
	{
		return cargoType;
	}

	public void setCargoType(String cargoType)
	{
		this.cargoType = cargoType;
	}

	public String getCommodityClass()
	{
		return commodityClass;
	}

	public void setCommodityClass(String commodityClass)
	{
		this.commodityClass = commodityClass;
	}

	public Long getProductId()
	{
		return productId;
	}

	public void setProductId(Long productId)
	{
		this.productId = productId;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public String getCommodityName()
	{
		return commodityName;
	}

	public void setCommodityName(String commodityName)
	{
		this.commodityName = commodityName;
	}

	public String getCommodityType()
	{
		return commodityType;
	}

	public void setCommodityType(String commodityType)
	{
		this.commodityType = commodityType;
	}

	public BigDecimal getCommodityPrice()
	{
		return commodityPrice;
	}

	public void setCommodityPrice(BigDecimal commodityPrice)
	{
		this.commodityPrice = commodityPrice;
	}

	public String getCargoTypeName()
	{
		return cargoTypeName;
	}

	public void setCargoTypeName(String cargoTypeName)
	{
		this.cargoTypeName = cargoTypeName;
	}

	public String getCommodityClassName()
	{
		return commodityClassName;
	}

	public void setCommodityClassName(String commodityClassName)
	{
		this.commodityClassName = commodityClassName;
	}

}
