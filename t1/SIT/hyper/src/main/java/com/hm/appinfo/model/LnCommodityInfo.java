package com.hm.appinfo.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: LnCommodityInfo
 * @Description: 贷款商品表
 * @author qiuyuan
 * @date 2016年4月11日 下午2:25:17
 * @Copyright (c) 2016, 9fchaoneng.com All Rights Reserved.
 */
public class LnCommodityInfo {
    
    private Long id;

   /**
    * 货物类别
    */
    private String cargoType;

   /**
    * 工单ID
    */
    private Long appId;

    /**
     * 商品类型
     */
    private String commodityClass;

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

    
    private String createdby;

    
    private Date createdon;

    
    private String modifiedby;

    
    private Date modifiedon;

    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType == null ? null : cargoType.trim();
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getCommodityClass() {
        return commodityClass;
    }

    public void setCommodityClass(String commodityClass) {
        this.commodityClass = commodityClass == null ? null : commodityClass.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType == null ? null : commodityType.trim();
    }

    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby == null ? null : modifiedby.trim();
    }

    public Date getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(Date modifiedon) {
        this.modifiedon = modifiedon;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}