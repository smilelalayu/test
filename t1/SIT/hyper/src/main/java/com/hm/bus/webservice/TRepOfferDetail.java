
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tRepOfferDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tRepOfferDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="advanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bizCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bizMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bizTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exceedDetailDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fromAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goldTransStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lonApplication" type="{http://biz.webservice.macrosky.com/}tLonApplication" minOccurs="0"/&gt;
 *         &lt;element name="offerDetailAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="offerDetailDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repAdjustRepay" type="{http://biz.webservice.macrosky.com/}tRepAdjustRepay" minOccurs="0"/&gt;
 *         &lt;element name="repOfferBatch" type="{http://biz.webservice.macrosky.com/}tRepOfferBatch" minOccurs="0"/&gt;
 *         &lt;element name="repRealDetail" type="{http://biz.webservice.macrosky.com/}tRepRealDetail" minOccurs="0"/&gt;
 *         &lt;element name="repRepayment" type="{http://biz.webservice.macrosky.com/}tRepRepayment" minOccurs="0"/&gt;
 *         &lt;element name="repayBatchId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="repayDetailAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayDetailId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="repayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repaymentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="summarizeSwiftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="swiftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRepOfferDetail", propOrder = {
    "advanStatus",
    "agentStatus",
    "appId",
    "bizCode",
    "bizMessage",
    "bizTime",
    "contractId",
    "exceedDetailDay",
    "fromAccount",
    "fromBank",
    "fromCard",
    "fromCardName",
    "goldTransStatus",
    "isBalance",
    "lonApplication",
    "offerDetailAmt",
    "offerDetailDate",
    "orgCode",
    "repAdjustRepay",
    "repOfferBatch",
    "repRealDetail",
    "repRepayment",
    "repayBatchId",
    "repayDetailAmt",
    "repayDetailId",
    "repayType",
    "repaymentId",
    "summarizeSwiftNo",
    "swiftNo",
    "toAccount",
    "toBank",
    "toCard",
    "toCardName"
})
public class TRepOfferDetail {

    protected String advanStatus;
    protected String agentStatus;
    protected Integer appId;
    protected String bizCode;
    protected String bizMessage;
    protected String bizTime;
    protected String contractId;
    protected Integer exceedDetailDay;
    protected String fromAccount;
    protected String fromBank;
    protected String fromCard;
    protected String fromCardName;
    protected String goldTransStatus;
    protected String isBalance;
    protected TLonApplication lonApplication;
    protected BigDecimal offerDetailAmt;
    protected String offerDetailDate;
    protected String orgCode;
    protected TRepAdjustRepay repAdjustRepay;
    protected TRepOfferBatch repOfferBatch;
    protected TRepRealDetail repRealDetail;
    protected TRepRepayment repRepayment;
    protected Integer repayBatchId;
    protected BigDecimal repayDetailAmt;
    protected Integer repayDetailId;
    protected String repayType;
    protected Integer repaymentId;
    protected String summarizeSwiftNo;
    protected String swiftNo;
    protected String toAccount;
    protected String toBank;
    protected String toCard;
    protected String toCardName;

    /**
     * 获取advanStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvanStatus() {
        return advanStatus;
    }

    /**
     * 设置advanStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvanStatus(String value) {
        this.advanStatus = value;
    }

    /**
     * 获取agentStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    /**
     * 设置agentStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentStatus(String value) {
        this.agentStatus = value;
    }

    /**
     * 获取appId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * 设置appId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppId(Integer value) {
        this.appId = value;
    }

    /**
     * 获取bizCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * 设置bizCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizCode(String value) {
        this.bizCode = value;
    }

    /**
     * 获取bizMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizMessage() {
        return bizMessage;
    }

    /**
     * 设置bizMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizMessage(String value) {
        this.bizMessage = value;
    }

    /**
     * 获取bizTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizTime() {
        return bizTime;
    }

    /**
     * 设置bizTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizTime(String value) {
        this.bizTime = value;
    }

    /**
     * 获取contractId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * 设置contractId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * 获取exceedDetailDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExceedDetailDay() {
        return exceedDetailDay;
    }

    /**
     * 设置exceedDetailDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExceedDetailDay(Integer value) {
        this.exceedDetailDay = value;
    }

    /**
     * 获取fromAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAccount() {
        return fromAccount;
    }

    /**
     * 设置fromAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAccount(String value) {
        this.fromAccount = value;
    }

    /**
     * 获取fromBank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBank() {
        return fromBank;
    }

    /**
     * 设置fromBank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBank(String value) {
        this.fromBank = value;
    }

    /**
     * 获取fromCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCard() {
        return fromCard;
    }

    /**
     * 设置fromCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCard(String value) {
        this.fromCard = value;
    }

    /**
     * 获取fromCardName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCardName() {
        return fromCardName;
    }

    /**
     * 设置fromCardName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCardName(String value) {
        this.fromCardName = value;
    }

    /**
     * 获取goldTransStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoldTransStatus() {
        return goldTransStatus;
    }

    /**
     * 设置goldTransStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoldTransStatus(String value) {
        this.goldTransStatus = value;
    }

    /**
     * 获取isBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBalance() {
        return isBalance;
    }

    /**
     * 设置isBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBalance(String value) {
        this.isBalance = value;
    }

    /**
     * 获取lonApplication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TLonApplication }
     *     
     */
    public TLonApplication getLonApplication() {
        return lonApplication;
    }

    /**
     * 设置lonApplication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplication }
     *     
     */
    public void setLonApplication(TLonApplication value) {
        this.lonApplication = value;
    }

    /**
     * 获取offerDetailAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferDetailAmt() {
        return offerDetailAmt;
    }

    /**
     * 设置offerDetailAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferDetailAmt(BigDecimal value) {
        this.offerDetailAmt = value;
    }

    /**
     * 获取offerDetailDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDetailDate() {
        return offerDetailDate;
    }

    /**
     * 设置offerDetailDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDetailDate(String value) {
        this.offerDetailDate = value;
    }

    /**
     * 获取orgCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置orgCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

    /**
     * 获取repAdjustRepay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TRepAdjustRepay }
     *     
     */
    public TRepAdjustRepay getRepAdjustRepay() {
        return repAdjustRepay;
    }

    /**
     * 设置repAdjustRepay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TRepAdjustRepay }
     *     
     */
    public void setRepAdjustRepay(TRepAdjustRepay value) {
        this.repAdjustRepay = value;
    }

    /**
     * 获取repOfferBatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TRepOfferBatch }
     *     
     */
    public TRepOfferBatch getRepOfferBatch() {
        return repOfferBatch;
    }

    /**
     * 设置repOfferBatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TRepOfferBatch }
     *     
     */
    public void setRepOfferBatch(TRepOfferBatch value) {
        this.repOfferBatch = value;
    }

    /**
     * 获取repRealDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TRepRealDetail }
     *     
     */
    public TRepRealDetail getRepRealDetail() {
        return repRealDetail;
    }

    /**
     * 设置repRealDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TRepRealDetail }
     *     
     */
    public void setRepRealDetail(TRepRealDetail value) {
        this.repRealDetail = value;
    }

    /**
     * 获取repRepayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TRepRepayment }
     *     
     */
    public TRepRepayment getRepRepayment() {
        return repRepayment;
    }

    /**
     * 设置repRepayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TRepRepayment }
     *     
     */
    public void setRepRepayment(TRepRepayment value) {
        this.repRepayment = value;
    }

    /**
     * 获取repayBatchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepayBatchId() {
        return repayBatchId;
    }

    /**
     * 设置repayBatchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepayBatchId(Integer value) {
        this.repayBatchId = value;
    }

    /**
     * 获取repayDetailAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayDetailAmt() {
        return repayDetailAmt;
    }

    /**
     * 设置repayDetailAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayDetailAmt(BigDecimal value) {
        this.repayDetailAmt = value;
    }

    /**
     * 获取repayDetailId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepayDetailId() {
        return repayDetailId;
    }

    /**
     * 设置repayDetailId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepayDetailId(Integer value) {
        this.repayDetailId = value;
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
     * 获取repaymentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepaymentId() {
        return repaymentId;
    }

    /**
     * 设置repaymentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepaymentId(Integer value) {
        this.repaymentId = value;
    }

    /**
     * 获取summarizeSwiftNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummarizeSwiftNo() {
        return summarizeSwiftNo;
    }

    /**
     * 设置summarizeSwiftNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummarizeSwiftNo(String value) {
        this.summarizeSwiftNo = value;
    }

    /**
     * 获取swiftNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftNo() {
        return swiftNo;
    }

    /**
     * 设置swiftNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiftNo(String value) {
        this.swiftNo = value;
    }

    /**
     * 获取toAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAccount() {
        return toAccount;
    }

    /**
     * 设置toAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAccount(String value) {
        this.toAccount = value;
    }

    /**
     * 获取toBank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBank() {
        return toBank;
    }

    /**
     * 设置toBank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBank(String value) {
        this.toBank = value;
    }

    /**
     * 获取toCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCard() {
        return toCard;
    }

    /**
     * 设置toCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCard(String value) {
        this.toCard = value;
    }

    /**
     * 获取toCardName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCardName() {
        return toCardName;
    }

    /**
     * 设置toCardName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCardName(String value) {
        this.toCardName = value;
    }

}
