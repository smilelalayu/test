
package com.hm.bus.webservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>tRepRepayment complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tRepRepayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="advanAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="advanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="confeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditorRights" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="earlierRepayOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="earlyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exceedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exceedDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exceedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flagStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frozenStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lonApplication" type="{http://biz.webservice.macrosky.com/}tLonApplication" minOccurs="0"/&gt;
 *         &lt;element name="lonContact" type="{http://biz.webservice.macrosky.com/}tLonContact" minOccurs="0"/&gt;
 *         &lt;element name="offerAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="offerDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overdueFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="pettyCashFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="planRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="planRepayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="punishAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="remainPrincipalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repOfferDetail" type="{http://biz.webservice.macrosky.com/}tRepOfferDetail" minOccurs="0"/&gt;
 *         &lt;element name="repRealDetail" type="{http://biz.webservice.macrosky.com/}tRepRealDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="repayAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayAdvan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayOffAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayOverdueFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayPettyCashFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayPunish" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayRelAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayRisk" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayServiceFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayViolate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repaymentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="riskAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="riskOverDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="smsFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tempBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tempCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tempName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="violateAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="yearRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRepRepayment", propOrder = {
    "advanAmt",
    "advanStatus",
    "agentDate",
    "appId",
    "confeAmt",
    "creditorRights",
    "earlierRepayOffer",
    "earlyStatus",
    "exceedDate",
    "exceedDay",
    "exceedStatus",
    "flagStatus",
    "frozenStatus",
    "interest",
    "lastUpdateTime",
    "lonApplication",
    "lonContact",
    "offerAmt",
    "offerDate",
    "orgCode",
    "overdueFee",
    "pettyCashFee",
    "planRepayAmt",
    "planRepayDate",
    "principal",
    "punishAmt",
    "remainPrincipalAmt",
    "repOfferDetail",
    "repRealDetail",
    "repayAccount",
    "repayAdvan",
    "repayDate",
    "repayInterest",
    "repayOffAmt",
    "repayOverdueFee",
    "repayPettyCashFee",
    "repayPrincipal",
    "repayPunish",
    "repayRelAmt",
    "repayRisk",
    "repayServiceFee",
    "repayStatus",
    "repayType",
    "repayViolate",
    "repaymentId",
    "riskAmt",
    "riskOverDate",
    "serviceFee",
    "smsFlag",
    "stage",
    "tempBank",
    "tempCard",
    "tempName",
    "updateTime",
    "violateAmt",
    "yearRate"
})
public class TRepRepayment {

    protected BigDecimal advanAmt;
    protected String advanStatus;
    protected String agentDate;
    protected Integer appId;
    protected BigDecimal confeAmt;
    protected BigDecimal creditorRights;
    protected String earlierRepayOffer;
    protected String earlyStatus;
    protected String exceedDate;
    protected String exceedDay;
    protected String exceedStatus;
    protected String flagStatus;
    protected String frozenStatus;
    protected BigDecimal interest;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateTime;
    protected TLonApplication lonApplication;
    protected TLonContact lonContact;
    protected BigDecimal offerAmt;
    protected String offerDate;
    protected String orgCode;
    protected BigDecimal overdueFee;
    protected BigDecimal pettyCashFee;
    protected BigDecimal planRepayAmt;
    protected String planRepayDate;
    protected BigDecimal principal;
    protected BigDecimal punishAmt;
    protected BigDecimal remainPrincipalAmt;
    protected TRepOfferDetail repOfferDetail;
    @XmlElement(nillable = true)
    protected List<TRepRealDetail> repRealDetail;
    protected String repayAccount;
    protected BigDecimal repayAdvan;
    protected String repayDate;
    protected BigDecimal repayInterest;
    protected BigDecimal repayOffAmt;
    protected BigDecimal repayOverdueFee;
    protected BigDecimal repayPettyCashFee;
    protected BigDecimal repayPrincipal;
    protected BigDecimal repayPunish;
    protected BigDecimal repayRelAmt;
    protected BigDecimal repayRisk;
    protected BigDecimal repayServiceFee;
    protected String repayStatus;
    protected String repayType;
    protected BigDecimal repayViolate;
    protected Integer repaymentId;
    protected BigDecimal riskAmt;
    protected String riskOverDate;
    protected BigDecimal serviceFee;
    protected String smsFlag;
    protected String stage;
    protected String tempBank;
    protected String tempCard;
    protected String tempName;
    protected String updateTime;
    protected BigDecimal violateAmt;
    protected Float yearRate;

    /**
     * ��ȡadvanAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvanAmt() {
        return advanAmt;
    }

    /**
     * ����advanAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvanAmt(BigDecimal value) {
        this.advanAmt = value;
    }

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
     * ��ȡagentDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentDate() {
        return agentDate;
    }

    /**
     * ����agentDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentDate(String value) {
        this.agentDate = value;
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
     * ��ȡconfeAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConfeAmt() {
        return confeAmt;
    }

    /**
     * ����confeAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConfeAmt(BigDecimal value) {
        this.confeAmt = value;
    }

    /**
     * ��ȡcreditorRights���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditorRights() {
        return creditorRights;
    }

    /**
     * ����creditorRights���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditorRights(BigDecimal value) {
        this.creditorRights = value;
    }

    /**
     * ��ȡearlierRepayOffer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlierRepayOffer() {
        return earlierRepayOffer;
    }

    /**
     * ����earlierRepayOffer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlierRepayOffer(String value) {
        this.earlierRepayOffer = value;
    }

    /**
     * ��ȡearlyStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyStatus() {
        return earlyStatus;
    }

    /**
     * ����earlyStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyStatus(String value) {
        this.earlyStatus = value;
    }

    /**
     * ��ȡexceedDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceedDate() {
        return exceedDate;
    }

    /**
     * ����exceedDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceedDate(String value) {
        this.exceedDate = value;
    }

    /**
     * ��ȡexceedDay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceedDay() {
        return exceedDay;
    }

    /**
     * ����exceedDay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceedDay(String value) {
        this.exceedDay = value;
    }

    /**
     * ��ȡexceedStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceedStatus() {
        return exceedStatus;
    }

    /**
     * ����exceedStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceedStatus(String value) {
        this.exceedStatus = value;
    }

    /**
     * ��ȡflagStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagStatus() {
        return flagStatus;
    }

    /**
     * ����flagStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagStatus(String value) {
        this.flagStatus = value;
    }

    /**
     * ��ȡfrozenStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrozenStatus() {
        return frozenStatus;
    }

    /**
     * ����frozenStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrozenStatus(String value) {
        this.frozenStatus = value;
    }

    /**
     * ��ȡinterest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * ����interest���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterest(BigDecimal value) {
        this.interest = value;
    }

    /**
     * ��ȡlastUpdateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * ����lastUpdateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateTime(XMLGregorianCalendar value) {
        this.lastUpdateTime = value;
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
     * ��ȡlonContact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonContact }
     *     
     */
    public TLonContact getLonContact() {
        return lonContact;
    }

    /**
     * ����lonContact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonContact }
     *     
     */
    public void setLonContact(TLonContact value) {
        this.lonContact = value;
    }

    /**
     * ��ȡofferAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferAmt() {
        return offerAmt;
    }

    /**
     * ����offerAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferAmt(BigDecimal value) {
        this.offerAmt = value;
    }

    /**
     * ��ȡofferDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDate() {
        return offerDate;
    }

    /**
     * ����offerDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDate(String value) {
        this.offerDate = value;
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
     * ��ȡoverdueFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdueFee() {
        return overdueFee;
    }

    /**
     * ����overdueFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdueFee(BigDecimal value) {
        this.overdueFee = value;
    }

    /**
     * ��ȡpettyCashFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPettyCashFee() {
        return pettyCashFee;
    }

    /**
     * ����pettyCashFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPettyCashFee(BigDecimal value) {
        this.pettyCashFee = value;
    }

    /**
     * ��ȡplanRepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlanRepayAmt() {
        return planRepayAmt;
    }

    /**
     * ����planRepayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlanRepayAmt(BigDecimal value) {
        this.planRepayAmt = value;
    }

    /**
     * ��ȡplanRepayDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanRepayDate() {
        return planRepayDate;
    }

    /**
     * ����planRepayDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanRepayDate(String value) {
        this.planRepayDate = value;
    }

    /**
     * ��ȡprincipal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipal() {
        return principal;
    }

    /**
     * ����principal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipal(BigDecimal value) {
        this.principal = value;
    }

    /**
     * ��ȡpunishAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPunishAmt() {
        return punishAmt;
    }

    /**
     * ����punishAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPunishAmt(BigDecimal value) {
        this.punishAmt = value;
    }

    /**
     * ��ȡremainPrincipalAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainPrincipalAmt() {
        return remainPrincipalAmt;
    }

    /**
     * ����remainPrincipalAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainPrincipalAmt(BigDecimal value) {
        this.remainPrincipalAmt = value;
    }

    /**
     * ��ȡrepOfferDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TRepOfferDetail }
     *     
     */
    public TRepOfferDetail getRepOfferDetail() {
        return repOfferDetail;
    }

    /**
     * ����repOfferDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TRepOfferDetail }
     *     
     */
    public void setRepOfferDetail(TRepOfferDetail value) {
        this.repOfferDetail = value;
    }

    /**
     * Gets the value of the repRealDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repRealDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepRealDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRepRealDetail }
     * 
     * 
     */
    public List<TRepRealDetail> getRepRealDetail() {
        if (repRealDetail == null) {
            repRealDetail = new ArrayList<TRepRealDetail>();
        }
        return this.repRealDetail;
    }

    /**
     * ��ȡrepayAccount���Ե�ֵ��
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
     * ����repayAccount���Ե�ֵ��
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
     * ��ȡrepayAdvan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayAdvan() {
        return repayAdvan;
    }

    /**
     * ����repayAdvan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayAdvan(BigDecimal value) {
        this.repayAdvan = value;
    }

    /**
     * ��ȡrepayDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayDate() {
        return repayDate;
    }

    /**
     * ����repayDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayDate(String value) {
        this.repayDate = value;
    }

    /**
     * ��ȡrepayInterest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayInterest() {
        return repayInterest;
    }

    /**
     * ����repayInterest���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayInterest(BigDecimal value) {
        this.repayInterest = value;
    }

    /**
     * ��ȡrepayOffAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayOffAmt() {
        return repayOffAmt;
    }

    /**
     * ����repayOffAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayOffAmt(BigDecimal value) {
        this.repayOffAmt = value;
    }

    /**
     * ��ȡrepayOverdueFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayOverdueFee() {
        return repayOverdueFee;
    }

    /**
     * ����repayOverdueFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayOverdueFee(BigDecimal value) {
        this.repayOverdueFee = value;
    }

    /**
     * ��ȡrepayPettyCashFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayPettyCashFee() {
        return repayPettyCashFee;
    }

    /**
     * ����repayPettyCashFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayPettyCashFee(BigDecimal value) {
        this.repayPettyCashFee = value;
    }

    /**
     * ��ȡrepayPrincipal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayPrincipal() {
        return repayPrincipal;
    }

    /**
     * ����repayPrincipal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayPrincipal(BigDecimal value) {
        this.repayPrincipal = value;
    }

    /**
     * ��ȡrepayPunish���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayPunish() {
        return repayPunish;
    }

    /**
     * ����repayPunish���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayPunish(BigDecimal value) {
        this.repayPunish = value;
    }

    /**
     * ��ȡrepayRelAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayRelAmt() {
        return repayRelAmt;
    }

    /**
     * ����repayRelAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayRelAmt(BigDecimal value) {
        this.repayRelAmt = value;
    }

    /**
     * ��ȡrepayRisk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayRisk() {
        return repayRisk;
    }

    /**
     * ����repayRisk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayRisk(BigDecimal value) {
        this.repayRisk = value;
    }

    /**
     * ��ȡrepayServiceFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayServiceFee() {
        return repayServiceFee;
    }

    /**
     * ����repayServiceFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayServiceFee(BigDecimal value) {
        this.repayServiceFee = value;
    }

    /**
     * ��ȡrepayStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayStatus() {
        return repayStatus;
    }

    /**
     * ����repayStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayStatus(String value) {
        this.repayStatus = value;
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
     * ��ȡrepayViolate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayViolate() {
        return repayViolate;
    }

    /**
     * ����repayViolate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayViolate(BigDecimal value) {
        this.repayViolate = value;
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
     * ��ȡriskAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRiskAmt() {
        return riskAmt;
    }

    /**
     * ����riskAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRiskAmt(BigDecimal value) {
        this.riskAmt = value;
    }

    /**
     * ��ȡriskOverDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskOverDate() {
        return riskOverDate;
    }

    /**
     * ����riskOverDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskOverDate(String value) {
        this.riskOverDate = value;
    }

    /**
     * ��ȡserviceFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    /**
     * ����serviceFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceFee(BigDecimal value) {
        this.serviceFee = value;
    }

    /**
     * ��ȡsmsFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsFlag() {
        return smsFlag;
    }

    /**
     * ����smsFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsFlag(String value) {
        this.smsFlag = value;
    }

    /**
     * ��ȡstage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * ����stage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * ��ȡtempBank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempBank() {
        return tempBank;
    }

    /**
     * ����tempBank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempBank(String value) {
        this.tempBank = value;
    }

    /**
     * ��ȡtempCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempCard() {
        return tempCard;
    }

    /**
     * ����tempCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempCard(String value) {
        this.tempCard = value;
    }

    /**
     * ��ȡtempName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempName() {
        return tempName;
    }

    /**
     * ����tempName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempName(String value) {
        this.tempName = value;
    }

    /**
     * ��ȡupdateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * ����updateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(String value) {
        this.updateTime = value;
    }

    /**
     * ��ȡviolateAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getViolateAmt() {
        return violateAmt;
    }

    /**
     * ����violateAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setViolateAmt(BigDecimal value) {
        this.violateAmt = value;
    }

    /**
     * ��ȡyearRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getYearRate() {
        return yearRate;
    }

    /**
     * ����yearRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setYearRate(Float value) {
        this.yearRate = value;
    }

}
