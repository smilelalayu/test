package com.hm.product.model;

import java.math.BigDecimal;
import java.util.Date;

public class BsProduct {
    private Long id;

    private Long productSeriesId;

    private String productName;

    private BigDecimal minLoanAmount;

    private BigDecimal maxLoanAmount;

    private BigDecimal downPaymentRatio;

    private String downPaymentType;

    private Integer periods;

    private BigDecimal monthlyInterestRate;

    private BigDecimal discountRate;

    private String saBonusType;

    private BigDecimal saBonus;

    private BigDecimal dsmBonus;

    /**
     * 月保费比例
     */
    private BigDecimal monthlyPremiumRate;

    private String status;

    private String createdby;

    private Date createdon;

    private String modifiedby;

    private Date modifiedon;

    private Integer version;

    private String productCode;

    private String busProductId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductSeriesId() {
        return productSeriesId;
    }

    public void setProductSeriesId(Long productSeriesId) {
        this.productSeriesId = productSeriesId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getMinLoanAmount() {
        return minLoanAmount;
    }

    public void setMinLoanAmount(BigDecimal minLoanAmount) {
        this.minLoanAmount = minLoanAmount;
    }

    public BigDecimal getMaxLoanAmount() {
        return maxLoanAmount;
    }

    public void setMaxLoanAmount(BigDecimal maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }

    public BigDecimal getDownPaymentRatio() {
        return downPaymentRatio;
    }

    public void setDownPaymentRatio(BigDecimal downPaymentRatio) {
        this.downPaymentRatio = downPaymentRatio;
    }

    public String getDownPaymentType() {
        return downPaymentType;
    }

    public void setDownPaymentType(String downPaymentType) {
        this.downPaymentType = downPaymentType == null ? null : downPaymentType.trim();
    }

    public Integer getPeriods() {
        return periods;
    }

    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    public BigDecimal getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(BigDecimal monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public String getSaBonusType() {
        return saBonusType;
    }

    public void setSaBonusType(String saBonusType) {
        this.saBonusType = saBonusType == null ? null : saBonusType.trim();
    }

    public BigDecimal getSaBonus() {
        return saBonus;
    }

    public void setSaBonus(BigDecimal saBonus) {
        this.saBonus = saBonus;
    }

    public BigDecimal getDsmBonus() {
        return dsmBonus;
    }

    public void setDsmBonus(BigDecimal dsmBonus) {
        this.dsmBonus = dsmBonus;
    }

    public BigDecimal getMonthlyPremiumRate() {
        return monthlyPremiumRate;
    }

    public void setMonthlyPremiumRate(BigDecimal monthlyPremiumRate) {
        this.monthlyPremiumRate = monthlyPremiumRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getBusProductId() {
        return busProductId;
    }

    public void setBusProductId(String busProductId) {
        this.busProductId = busProductId == null ? null : busProductId.trim();
    }
}