package com.hm.bus.module;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: BsProdectSeries
 * @Description: 产品系列
 * @author qiuyuan
 * @date 2016年9月9日 上午11:03:53
 * @Copyright (c) 2016, 9fchaoneng.com All Rights Reserved.
 */
public class BsProdectSeries {
    private Long id;

    private String productSeriesName;

    private String productCategory;

    private Date startTime;

    private Date endTime;

    private BigDecimal minLoanAmount;

    private BigDecimal maxLoanAmount;

    private String phaseReduction;

    private String cooperationOrg;

    private String productChannel;

    private String delStatus;

    private BigDecimal penaltyRate;

    private BigDecimal lateExpeneseRate;

    private String repaymentSms;

    private String lateSms;

    private String createdby;

    private Date createdon;

    private String modifiedby;

    private Date modifiedon;

    private Integer version;

    private Boolean isAttachCheck;

    private String repaymentWay;

    private String seriesCode;

    private String positionId;

    private Integer reductionPeriod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductSeriesName() {
        return productSeriesName;
    }

    public void setProductSeriesName(String productSeriesName) {
        this.productSeriesName = productSeriesName == null ? null : productSeriesName.trim();
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory == null ? null : productCategory.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public String getPhaseReduction() {
        return phaseReduction;
    }

    public void setPhaseReduction(String phaseReduction) {
        this.phaseReduction = phaseReduction == null ? null : phaseReduction.trim();
    }

    public String getCooperationOrg() {
        return cooperationOrg;
    }

    public void setCooperationOrg(String cooperationOrg) {
        this.cooperationOrg = cooperationOrg == null ? null : cooperationOrg.trim();
    }

    public String getProductChannel() {
        return productChannel;
    }

    public void setProductChannel(String productChannel) {
        this.productChannel = productChannel == null ? null : productChannel.trim();
    }

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus == null ? null : delStatus.trim();
    }

    public BigDecimal getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(BigDecimal penaltyRate) {
        this.penaltyRate = penaltyRate;
    }

    public BigDecimal getLateExpeneseRate() {
        return lateExpeneseRate;
    }

    public void setLateExpeneseRate(BigDecimal lateExpeneseRate) {
        this.lateExpeneseRate = lateExpeneseRate;
    }

    public String getRepaymentSms() {
        return repaymentSms;
    }

    public void setRepaymentSms(String repaymentSms) {
        this.repaymentSms = repaymentSms == null ? null : repaymentSms.trim();
    }

    public String getLateSms() {
        return lateSms;
    }

    public void setLateSms(String lateSms) {
        this.lateSms = lateSms == null ? null : lateSms.trim();
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

    public Boolean getIsAttachCheck() {
        return isAttachCheck;
    }

    public void setIsAttachCheck(Boolean isAttachCheck) {
        this.isAttachCheck = isAttachCheck;
    }

    public String getRepaymentWay() {
        return repaymentWay;
    }

    public void setRepaymentWay(String repaymentWay) {
        this.repaymentWay = repaymentWay == null ? null : repaymentWay.trim();
    }

    public String getSeriesCode() {
        return seriesCode;
    }

    public void setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode == null ? null : seriesCode.trim();
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId == null ? null : positionId.trim();
    }

    public Integer getReductionPeriod() {
        return reductionPeriod;
    }

    public void setReductionPeriod(Integer reductionPeriod) {
        this.reductionPeriod = reductionPeriod;
    }
}