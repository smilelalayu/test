
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tRepOfferDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡadvanStatus���Ե�ֵ��
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
     * ����advanStatus���Ե�ֵ��
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
     * ��ȡagentStatus���Ե�ֵ��
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
     * ����agentStatus���Ե�ֵ��
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
     * ��ȡappId���Ե�ֵ��
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
     * ����appId���Ե�ֵ��
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
     * ��ȡbizCode���Ե�ֵ��
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
     * ����bizCode���Ե�ֵ��
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
     * ��ȡbizMessage���Ե�ֵ��
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
     * ����bizMessage���Ե�ֵ��
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
     * ��ȡbizTime���Ե�ֵ��
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
     * ����bizTime���Ե�ֵ��
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
     * ��ȡcontractId���Ե�ֵ��
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
     * ����contractId���Ե�ֵ��
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
     * ��ȡexceedDetailDay���Ե�ֵ��
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
     * ����exceedDetailDay���Ե�ֵ��
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
     * ��ȡfromAccount���Ե�ֵ��
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
     * ����fromAccount���Ե�ֵ��
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
     * ��ȡfromBank���Ե�ֵ��
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
     * ����fromBank���Ե�ֵ��
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
     * ��ȡfromCard���Ե�ֵ��
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
     * ����fromCard���Ե�ֵ��
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
     * ��ȡfromCardName���Ե�ֵ��
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
     * ����fromCardName���Ե�ֵ��
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
     * ��ȡgoldTransStatus���Ե�ֵ��
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
     * ����goldTransStatus���Ե�ֵ��
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
     * ��ȡisBalance���Ե�ֵ��
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
     * ����isBalance���Ե�ֵ��
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
     * ��ȡlonApplication���Ե�ֵ��
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
     * ����lonApplication���Ե�ֵ��
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
     * ��ȡofferDetailAmt���Ե�ֵ��
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
     * ����offerDetailAmt���Ե�ֵ��
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
     * ��ȡofferDetailDate���Ե�ֵ��
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
     * ����offerDetailDate���Ե�ֵ��
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
     * ��ȡorgCode���Ե�ֵ��
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
     * ����orgCode���Ե�ֵ��
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
     * ��ȡrepAdjustRepay���Ե�ֵ��
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
     * ����repAdjustRepay���Ե�ֵ��
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
     * ��ȡrepOfferBatch���Ե�ֵ��
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
     * ����repOfferBatch���Ե�ֵ��
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
     * ��ȡrepRealDetail���Ե�ֵ��
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
     * ����repRealDetail���Ե�ֵ��
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
     * ��ȡrepRepayment���Ե�ֵ��
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
     * ����repRepayment���Ե�ֵ��
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
     * ��ȡrepayBatchId���Ե�ֵ��
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
     * ����repayBatchId���Ե�ֵ��
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
     * ��ȡrepayDetailAmt���Ե�ֵ��
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
     * ����repayDetailAmt���Ե�ֵ��
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
     * ��ȡrepayDetailId���Ե�ֵ��
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
     * ����repayDetailId���Ե�ֵ��
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
     * ��ȡrepayType���Ե�ֵ��
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
     * ����repayType���Ե�ֵ��
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
     * ��ȡrepaymentId���Ե�ֵ��
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
     * ����repaymentId���Ե�ֵ��
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
     * ��ȡsummarizeSwiftNo���Ե�ֵ��
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
     * ����summarizeSwiftNo���Ե�ֵ��
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
     * ��ȡswiftNo���Ե�ֵ��
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
     * ����swiftNo���Ե�ֵ��
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
     * ��ȡtoAccount���Ե�ֵ��
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
     * ����toAccount���Ե�ֵ��
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
     * ��ȡtoBank���Ե�ֵ��
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
     * ����toBank���Ե�ֵ��
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
     * ��ȡtoCard���Ե�ֵ��
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
     * ����toCard���Ե�ֵ��
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
     * ��ȡtoCardName���Ե�ֵ��
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
     * ����toCardName���Ե�ֵ��
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
