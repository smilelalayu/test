
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>rePaymentWebServiceModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="rePaymentWebServiceModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="advanAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="advanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="confeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditorRights" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="earlyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exceedDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exceedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flagStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frozenStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="offerAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="offerDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="planRepayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="punishAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="remainPrincipalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayAdvan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayOffAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayPunish" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayRelAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayRisk" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayViolate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="riskAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "rePaymentWebServiceModel", propOrder = {
    "advanAmt",
    "advanStatus",
    "appId",
    "confeAmt",
    "creditorRights",
    "earlyStatus",
    "exceedDay",
    "exceedStatus",
    "flagStatus",
    "frozenStatus",
    "interest",
    "offerAmt",
    "offerDate",
    "orgCode",
    "planRepayAmt",
    "planRepayDate",
    "principal",
    "punishAmt",
    "remainPrincipalAmt",
    "repayAccount",
    "repayAdvan",
    "repayDate",
    "repayInterest",
    "repayOffAmt",
    "repayPrincipal",
    "repayPunish",
    "repayRelAmt",
    "repayRisk",
    "repayStatus",
    "repayType",
    "repayViolate",
    "riskAmt",
    "stage",
    "tempBank",
    "tempCard",
    "tempName",
    "updateTime",
    "violateAmt",
    "yearRate"
})
public class RePaymentWebServiceModel {

    protected BigDecimal advanAmt;
    protected String advanStatus;
    protected Integer appId;
    protected BigDecimal confeAmt;
    protected BigDecimal creditorRights;
    protected String earlyStatus;
    protected String exceedDay;
    protected String exceedStatus;
    protected String flagStatus;
    protected String frozenStatus;
    protected BigDecimal interest;
    protected BigDecimal offerAmt;
    protected String offerDate;
    protected String orgCode;
    protected BigDecimal planRepayAmt;
    protected String planRepayDate;
    protected BigDecimal principal;
    protected BigDecimal punishAmt;
    protected BigDecimal remainPrincipalAmt;
    protected String repayAccount;
    protected BigDecimal repayAdvan;
    protected String repayDate;
    protected BigDecimal repayInterest;
    protected BigDecimal repayOffAmt;
    protected BigDecimal repayPrincipal;
    protected BigDecimal repayPunish;
    protected BigDecimal repayRelAmt;
    protected BigDecimal repayRisk;
    protected String repayStatus;
    protected String repayType;
    protected BigDecimal repayViolate;
    protected BigDecimal riskAmt;
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
