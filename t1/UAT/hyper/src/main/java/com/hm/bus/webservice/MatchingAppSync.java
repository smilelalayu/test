
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>matchingAppSync complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="matchingAppSync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acceptBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acquisitionCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acquisitionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="career" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelComName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coopBusType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coopOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distinctName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="earnestMoneyComName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ensure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ensureAssure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileUpEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantorCertId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantorComName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantyFils" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isMortgageMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isTransFund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lnAppType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ltiSeq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthRepayLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mortgageAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mortgageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldAssetOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldAssetValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pawnFiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pawnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prior" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBillDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="termSort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uumCustNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yearRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchingAppSync", propOrder = {
    "acceptBankName",
    "acquisitionCompanyName",
    "acquisitionType",
    "address",
    "appCode",
    "appId",
    "appLoanType",
    "approveAmt",
    "approveEndTime",
    "approveLimit",
    "assure",
    "bankCardNo",
    "bankName",
    "batchNo",
    "billNo",
    "career",
    "cashAccountName",
    "certId",
    "channel",
    "channelComName",
    "channelId",
    "channelName",
    "companyAddress",
    "companyPhone",
    "companyType",
    "contractAmt",
    "contractCode",
    "coopBusType",
    "coopOrgName",
    "createTime",
    "creditLevel",
    "customerId",
    "customerName",
    "distinctName",
    "earnestMoneyComName",
    "ensure",
    "ensureAssure",
    "fileUpEndDate",
    "guarantorCertId",
    "guarantorComName",
    "guarantorName",
    "guarantyFils",
    "guarantyType",
    "insuranceCompanyName",
    "insuranceLimit",
    "insuranceType",
    "invoiceBankName",
    "isMortgageMode",
    "isTransFund",
    "lnAppType",
    "loanCode",
    "loanDate",
    "loanPurpose",
    "ltiSeq",
    "maritalStatus",
    "matchOrderType",
    "monthRepayLimit",
    "mortgageAccount",
    "mortgageName",
    "oldAssetOwner",
    "oldAssetValue",
    "organizationCode",
    "pawnFiles",
    "pawnType",
    "phone",
    "prior",
    "productId",
    "productName",
    "receiveBillDt",
    "repayAccount",
    "repayCardId",
    "repayCardName",
    "repayCardNo",
    "repayType",
    "reviewEndTime",
    "signDate",
    "tellPhone",
    "termSort",
    "type",
    "uumCustNo",
    "yearRate",
    "eMail"
})
public class MatchingAppSync {

    protected String acceptBankName;
    protected String acquisitionCompanyName;
    protected String acquisitionType;
    protected String address;
    protected String appCode;
    protected String appId;
    protected String appLoanType;
    protected String approveAmt;
    protected String approveEndTime;
    protected String approveLimit;
    protected String assure;
    protected String bankCardNo;
    protected String bankName;
    protected String batchNo;
    protected String billNo;
    protected String career;
    protected String cashAccountName;
    protected String certId;
    protected String channel;
    protected String channelComName;
    protected String channelId;
    protected String channelName;
    protected String companyAddress;
    protected String companyPhone;
    protected String companyType;
    protected String contractAmt;
    protected String contractCode;
    protected String coopBusType;
    protected String coopOrgName;
    protected String createTime;
    protected String creditLevel;
    protected String customerId;
    protected String customerName;
    protected String distinctName;
    protected String earnestMoneyComName;
    protected String ensure;
    protected String ensureAssure;
    protected String fileUpEndDate;
    protected String guarantorCertId;
    protected String guarantorComName;
    protected String guarantorName;
    protected String guarantyFils;
    protected String guarantyType;
    protected String insuranceCompanyName;
    protected String insuranceLimit;
    protected String insuranceType;
    protected String invoiceBankName;
    protected String isMortgageMode;
    protected String isTransFund;
    protected String lnAppType;
    protected String loanCode;
    protected String loanDate;
    protected String loanPurpose;
    protected Long ltiSeq;
    protected String maritalStatus;
    protected String matchOrderType;
    protected String monthRepayLimit;
    protected String mortgageAccount;
    protected String mortgageName;
    protected String oldAssetOwner;
    protected String oldAssetValue;
    protected String organizationCode;
    protected String pawnFiles;
    protected String pawnType;
    protected String phone;
    protected int prior;
    protected String productId;
    protected String productName;
    protected String receiveBillDt;
    protected String repayAccount;
    protected String repayCardId;
    protected String repayCardName;
    protected String repayCardNo;
    protected String repayType;
    protected String reviewEndTime;
    protected String signDate;
    protected String tellPhone;
    protected String termSort;
    protected String type;
    protected String uumCustNo;
    protected String yearRate;
    protected String eMail;

    /**
     * 获取acceptBankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptBankName() {
        return acceptBankName;
    }

    /**
     * 设置acceptBankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptBankName(String value) {
        this.acceptBankName = value;
    }

    /**
     * 获取acquisitionCompanyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquisitionCompanyName() {
        return acquisitionCompanyName;
    }

    /**
     * 设置acquisitionCompanyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquisitionCompanyName(String value) {
        this.acquisitionCompanyName = value;
    }

    /**
     * 获取acquisitionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquisitionType() {
        return acquisitionType;
    }

    /**
     * 设置acquisitionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquisitionType(String value) {
        this.acquisitionType = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取appCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * 设置appCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppCode(String value) {
        this.appCode = value;
    }

    /**
     * 获取appId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置appId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * 获取appLoanType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppLoanType() {
        return appLoanType;
    }

    /**
     * 设置appLoanType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppLoanType(String value) {
        this.appLoanType = value;
    }

    /**
     * 获取approveAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveAmt() {
        return approveAmt;
    }

    /**
     * 设置approveAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveAmt(String value) {
        this.approveAmt = value;
    }

    /**
     * 获取approveEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveEndTime() {
        return approveEndTime;
    }

    /**
     * 设置approveEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveEndTime(String value) {
        this.approveEndTime = value;
    }

    /**
     * 获取approveLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveLimit() {
        return approveLimit;
    }

    /**
     * 设置approveLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveLimit(String value) {
        this.approveLimit = value;
    }

    /**
     * 获取assure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssure() {
        return assure;
    }

    /**
     * 设置assure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssure(String value) {
        this.assure = value;
    }

    /**
     * 获取bankCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * 设置bankCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCardNo(String value) {
        this.bankCardNo = value;
    }

    /**
     * 获取bankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置bankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * 获取batchNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 设置batchNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNo(String value) {
        this.batchNo = value;
    }

    /**
     * 获取billNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 设置billNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNo(String value) {
        this.billNo = value;
    }

    /**
     * 获取career属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareer() {
        return career;
    }

    /**
     * 设置career属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareer(String value) {
        this.career = value;
    }

    /**
     * 获取cashAccountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashAccountName() {
        return cashAccountName;
    }

    /**
     * 设置cashAccountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashAccountName(String value) {
        this.cashAccountName = value;
    }

    /**
     * 获取certId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * 设置certId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertId(String value) {
        this.certId = value;
    }

    /**
     * 获取channel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置channel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * 获取channelComName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelComName() {
        return channelComName;
    }

    /**
     * 设置channelComName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelComName(String value) {
        this.channelComName = value;
    }

    /**
     * 获取channelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 设置channelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * 获取channelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * 设置channelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * 获取companyAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * 设置companyAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddress(String value) {
        this.companyAddress = value;
    }

    /**
     * 获取companyPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * 设置companyPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPhone(String value) {
        this.companyPhone = value;
    }

    /**
     * 获取companyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 设置companyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyType(String value) {
        this.companyType = value;
    }

    /**
     * 获取contractAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractAmt() {
        return contractAmt;
    }

    /**
     * 设置contractAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractAmt(String value) {
        this.contractAmt = value;
    }

    /**
     * 获取contractCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置contractCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCode(String value) {
        this.contractCode = value;
    }

    /**
     * 获取coopBusType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoopBusType() {
        return coopBusType;
    }

    /**
     * 设置coopBusType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoopBusType(String value) {
        this.coopBusType = value;
    }

    /**
     * 获取coopOrgName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoopOrgName() {
        return coopOrgName;
    }

    /**
     * 设置coopOrgName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoopOrgName(String value) {
        this.coopOrgName = value;
    }

    /**
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * 获取creditLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLevel() {
        return creditLevel;
    }

    /**
     * 设置creditLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLevel(String value) {
        this.creditLevel = value;
    }

    /**
     * 获取customerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置customerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * 获取customerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置customerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * 获取distinctName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistinctName() {
        return distinctName;
    }

    /**
     * 设置distinctName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistinctName(String value) {
        this.distinctName = value;
    }

    /**
     * 获取earnestMoneyComName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnestMoneyComName() {
        return earnestMoneyComName;
    }

    /**
     * 设置earnestMoneyComName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnestMoneyComName(String value) {
        this.earnestMoneyComName = value;
    }

    /**
     * 获取ensure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnsure() {
        return ensure;
    }

    /**
     * 设置ensure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnsure(String value) {
        this.ensure = value;
    }

    /**
     * 获取ensureAssure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnsureAssure() {
        return ensureAssure;
    }

    /**
     * 设置ensureAssure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnsureAssure(String value) {
        this.ensureAssure = value;
    }

    /**
     * 获取fileUpEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileUpEndDate() {
        return fileUpEndDate;
    }

    /**
     * 设置fileUpEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUpEndDate(String value) {
        this.fileUpEndDate = value;
    }

    /**
     * 获取guarantorCertId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorCertId() {
        return guarantorCertId;
    }

    /**
     * 设置guarantorCertId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorCertId(String value) {
        this.guarantorCertId = value;
    }

    /**
     * 获取guarantorComName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorComName() {
        return guarantorComName;
    }

    /**
     * 设置guarantorComName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorComName(String value) {
        this.guarantorComName = value;
    }

    /**
     * 获取guarantorName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorName() {
        return guarantorName;
    }

    /**
     * 设置guarantorName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorName(String value) {
        this.guarantorName = value;
    }

    /**
     * 获取guarantyFils属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantyFils() {
        return guarantyFils;
    }

    /**
     * 设置guarantyFils属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantyFils(String value) {
        this.guarantyFils = value;
    }

    /**
     * 获取guarantyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantyType() {
        return guarantyType;
    }

    /**
     * 设置guarantyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantyType(String value) {
        this.guarantyType = value;
    }

    /**
     * 获取insuranceCompanyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    /**
     * 设置insuranceCompanyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompanyName(String value) {
        this.insuranceCompanyName = value;
    }

    /**
     * 获取insuranceLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceLimit() {
        return insuranceLimit;
    }

    /**
     * 设置insuranceLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceLimit(String value) {
        this.insuranceLimit = value;
    }

    /**
     * 获取insuranceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceType() {
        return insuranceType;
    }

    /**
     * 设置insuranceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceType(String value) {
        this.insuranceType = value;
    }

    /**
     * 获取invoiceBankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceBankName() {
        return invoiceBankName;
    }

    /**
     * 设置invoiceBankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceBankName(String value) {
        this.invoiceBankName = value;
    }

    /**
     * 获取isMortgageMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMortgageMode() {
        return isMortgageMode;
    }

    /**
     * 设置isMortgageMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMortgageMode(String value) {
        this.isMortgageMode = value;
    }

    /**
     * 获取isTransFund属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTransFund() {
        return isTransFund;
    }

    /**
     * 设置isTransFund属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTransFund(String value) {
        this.isTransFund = value;
    }

    /**
     * 获取lnAppType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnAppType() {
        return lnAppType;
    }

    /**
     * 设置lnAppType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnAppType(String value) {
        this.lnAppType = value;
    }

    /**
     * 获取loanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanCode() {
        return loanCode;
    }

    /**
     * 设置loanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanCode(String value) {
        this.loanCode = value;
    }

    /**
     * 获取loanDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanDate() {
        return loanDate;
    }

    /**
     * 设置loanDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanDate(String value) {
        this.loanDate = value;
    }

    /**
     * 获取loanPurpose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * 设置loanPurpose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurpose(String value) {
        this.loanPurpose = value;
    }

    /**
     * 获取ltiSeq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLtiSeq() {
        return ltiSeq;
    }

    /**
     * 设置ltiSeq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLtiSeq(Long value) {
        this.ltiSeq = value;
    }

    /**
     * 获取maritalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 设置maritalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * 获取matchOrderType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchOrderType() {
        return matchOrderType;
    }

    /**
     * 设置matchOrderType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchOrderType(String value) {
        this.matchOrderType = value;
    }

    /**
     * 获取monthRepayLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthRepayLimit() {
        return monthRepayLimit;
    }

    /**
     * 设置monthRepayLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthRepayLimit(String value) {
        this.monthRepayLimit = value;
    }

    /**
     * 获取mortgageAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageAccount() {
        return mortgageAccount;
    }

    /**
     * 设置mortgageAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageAccount(String value) {
        this.mortgageAccount = value;
    }

    /**
     * 获取mortgageName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageName() {
        return mortgageName;
    }

    /**
     * 设置mortgageName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageName(String value) {
        this.mortgageName = value;
    }

    /**
     * 获取oldAssetOwner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldAssetOwner() {
        return oldAssetOwner;
    }

    /**
     * 设置oldAssetOwner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldAssetOwner(String value) {
        this.oldAssetOwner = value;
    }

    /**
     * 获取oldAssetValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldAssetValue() {
        return oldAssetValue;
    }

    /**
     * 设置oldAssetValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldAssetValue(String value) {
        this.oldAssetValue = value;
    }

    /**
     * 获取organizationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * 设置organizationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
    }

    /**
     * 获取pawnFiles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPawnFiles() {
        return pawnFiles;
    }

    /**
     * 设置pawnFiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPawnFiles(String value) {
        this.pawnFiles = value;
    }

    /**
     * 获取pawnType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPawnType() {
        return pawnType;
    }

    /**
     * 设置pawnType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPawnType(String value) {
        this.pawnType = value;
    }

    /**
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取prior属性的值。
     * 
     */
    public int getPrior() {
        return prior;
    }

    /**
     * 设置prior属性的值。
     * 
     */
    public void setPrior(int value) {
        this.prior = value;
    }

    /**
     * 获取productId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置productId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * 获取productName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置productName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * 获取receiveBillDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveBillDt() {
        return receiveBillDt;
    }

    /**
     * 设置receiveBillDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveBillDt(String value) {
        this.receiveBillDt = value;
    }

    /**
     * 获取repayAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayAccount() {
        return repayAccount;
    }

    /**
     * 设置repayAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayAccount(String value) {
        this.repayAccount = value;
    }

    /**
     * 获取repayCardId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayCardId() {
        return repayCardId;
    }

    /**
     * 设置repayCardId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayCardId(String value) {
        this.repayCardId = value;
    }

    /**
     * 获取repayCardName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayCardName() {
        return repayCardName;
    }

    /**
     * 设置repayCardName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayCardName(String value) {
        this.repayCardName = value;
    }

    /**
     * 获取repayCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayCardNo() {
        return repayCardNo;
    }

    /**
     * 设置repayCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayCardNo(String value) {
        this.repayCardNo = value;
    }

    /**
     * 获取repayType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayType() {
        return repayType;
    }

    /**
     * 设置repayType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayType(String value) {
        this.repayType = value;
    }

    /**
     * 获取reviewEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewEndTime() {
        return reviewEndTime;
    }

    /**
     * 设置reviewEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewEndTime(String value) {
        this.reviewEndTime = value;
    }

    /**
     * 获取signDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignDate() {
        return signDate;
    }

    /**
     * 设置signDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignDate(String value) {
        this.signDate = value;
    }

    /**
     * 获取tellPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellPhone() {
        return tellPhone;
    }

    /**
     * 设置tellPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellPhone(String value) {
        this.tellPhone = value;
    }

    /**
     * 获取termSort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermSort() {
        return termSort;
    }

    /**
     * 设置termSort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermSort(String value) {
        this.termSort = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取uumCustNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUumCustNo() {
        return uumCustNo;
    }

    /**
     * 设置uumCustNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUumCustNo(String value) {
        this.uumCustNo = value;
    }

    /**
     * 获取yearRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearRate() {
        return yearRate;
    }

    /**
     * 设置yearRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearRate(String value) {
        this.yearRate = value;
    }

    /**
     * 获取eMail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * 设置eMail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

}
