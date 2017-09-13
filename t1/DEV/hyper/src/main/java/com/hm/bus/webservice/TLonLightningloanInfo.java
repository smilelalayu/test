
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonLightningloanInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonLightningloanInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cOneMonthAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cOneMonthCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cSixUserGrowth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="mCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mNature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pSixMonthAmtMcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pSixMonthCountMcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pSixMonthTotalMcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pThrMonthAmtMcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pThrMonthCountMcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pThrMonthTotalMcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sFirstDealTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sMonthAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sOneMonthDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSixMonthDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sThrMonthDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tMonthTotalCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tOneMonthDAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tOneMonthFAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tOneMonthJAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tOneMonthRiskRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tOneMostAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tSixMonthDAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tSixMonthFAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tSixMonthJAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tSixMonthRiskRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tThrMonthDAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tThrMonthFAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tThrMonthJAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tThrMonthRiskRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonLightningloanInfo", propOrder = {
    "appId",
    "id",
    "cOneMonthAmt",
    "cOneMonthCount",
    "cSixUserGrowth",
    "mAddress",
    "mCapital",
    "mCode",
    "mIndustry",
    "mName",
    "mNature",
    "mNumber",
    "mState",
    "mTime",
    "pSixMonthAmtMcc",
    "pSixMonthCountMcc",
    "pSixMonthTotalMcc",
    "pThrMonthAmtMcc",
    "pThrMonthCountMcc",
    "pThrMonthTotalMcc",
    "sFirstDealTime",
    "sMonthAge",
    "sOneMonthDay",
    "sSixMonthDay",
    "sThrMonthDay",
    "tMonthTotalCost",
    "tOneMonthDAmt",
    "tOneMonthFAmt",
    "tOneMonthJAmt",
    "tOneMonthRiskRatio",
    "tOneMostAmt",
    "tSixMonthDAmt",
    "tSixMonthFAmt",
    "tSixMonthJAmt",
    "tSixMonthRiskRatio",
    "tThrMonthDAmt",
    "tThrMonthFAmt",
    "tThrMonthJAmt",
    "tThrMonthRiskRatio"
})
public class TLonLightningloanInfo {

    protected Integer appId;
    protected Integer id;
    protected BigDecimal cOneMonthAmt;
    protected String cOneMonthCount;
    protected String cSixUserGrowth;
    protected String mAddress;
    protected BigDecimal mCapital;
    protected String mCode;
    protected String mIndustry;
    protected String mName;
    protected String mNature;
    protected String mNumber;
    protected String mState;
    protected String mTime;
    protected String pSixMonthAmtMcc;
    protected String pSixMonthCountMcc;
    protected String pSixMonthTotalMcc;
    protected String pThrMonthAmtMcc;
    protected String pThrMonthCountMcc;
    protected String pThrMonthTotalMcc;
    protected String sFirstDealTime;
    protected String sMonthAge;
    protected String sOneMonthDay;
    protected String sSixMonthDay;
    protected String sThrMonthDay;
    protected String tMonthTotalCost;
    protected BigDecimal tOneMonthDAmt;
    protected BigDecimal tOneMonthFAmt;
    protected BigDecimal tOneMonthJAmt;
    protected String tOneMonthRiskRatio;
    protected BigDecimal tOneMostAmt;
    protected BigDecimal tSixMonthDAmt;
    protected BigDecimal tSixMonthFAmt;
    protected BigDecimal tSixMonthJAmt;
    protected String tSixMonthRiskRatio;
    protected BigDecimal tThrMonthDAmt;
    protected BigDecimal tThrMonthFAmt;
    protected BigDecimal tThrMonthJAmt;
    protected String tThrMonthRiskRatio;

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
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * 获取cOneMonthAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCOneMonthAmt() {
        return cOneMonthAmt;
    }

    /**
     * 设置cOneMonthAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCOneMonthAmt(BigDecimal value) {
        this.cOneMonthAmt = value;
    }

    /**
     * 获取cOneMonthCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOneMonthCount() {
        return cOneMonthCount;
    }

    /**
     * 设置cOneMonthCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOneMonthCount(String value) {
        this.cOneMonthCount = value;
    }

    /**
     * 获取cSixUserGrowth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSixUserGrowth() {
        return cSixUserGrowth;
    }

    /**
     * 设置cSixUserGrowth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSixUserGrowth(String value) {
        this.cSixUserGrowth = value;
    }

    /**
     * 获取mAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAddress() {
        return mAddress;
    }

    /**
     * 设置mAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAddress(String value) {
        this.mAddress = value;
    }

    /**
     * 获取mCapital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCapital() {
        return mCapital;
    }

    /**
     * 设置mCapital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCapital(BigDecimal value) {
        this.mCapital = value;
    }

    /**
     * 获取mCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCode() {
        return mCode;
    }

    /**
     * 设置mCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCode(String value) {
        this.mCode = value;
    }

    /**
     * 获取mIndustry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIndustry() {
        return mIndustry;
    }

    /**
     * 设置mIndustry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIndustry(String value) {
        this.mIndustry = value;
    }

    /**
     * 获取mName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMName() {
        return mName;
    }

    /**
     * 设置mName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMName(String value) {
        this.mName = value;
    }

    /**
     * 获取mNature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMNature() {
        return mNature;
    }

    /**
     * 设置mNature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMNature(String value) {
        this.mNature = value;
    }

    /**
     * 获取mNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMNumber() {
        return mNumber;
    }

    /**
     * 设置mNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMNumber(String value) {
        this.mNumber = value;
    }

    /**
     * 获取mState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMState() {
        return mState;
    }

    /**
     * 设置mState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMState(String value) {
        this.mState = value;
    }

    /**
     * 获取mTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTime() {
        return mTime;
    }

    /**
     * 设置mTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTime(String value) {
        this.mTime = value;
    }

    /**
     * 获取pSixMonthAmtMcc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSixMonthAmtMcc() {
        return pSixMonthAmtMcc;
    }

    /**
     * 设置pSixMonthAmtMcc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSixMonthAmtMcc(String value) {
        this.pSixMonthAmtMcc = value;
    }

    /**
     * 获取pSixMonthCountMcc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSixMonthCountMcc() {
        return pSixMonthCountMcc;
    }

    /**
     * 设置pSixMonthCountMcc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSixMonthCountMcc(String value) {
        this.pSixMonthCountMcc = value;
    }

    /**
     * 获取pSixMonthTotalMcc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSixMonthTotalMcc() {
        return pSixMonthTotalMcc;
    }

    /**
     * 设置pSixMonthTotalMcc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSixMonthTotalMcc(String value) {
        this.pSixMonthTotalMcc = value;
    }

    /**
     * 获取pThrMonthAmtMcc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPThrMonthAmtMcc() {
        return pThrMonthAmtMcc;
    }

    /**
     * 设置pThrMonthAmtMcc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPThrMonthAmtMcc(String value) {
        this.pThrMonthAmtMcc = value;
    }

    /**
     * 获取pThrMonthCountMcc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPThrMonthCountMcc() {
        return pThrMonthCountMcc;
    }

    /**
     * 设置pThrMonthCountMcc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPThrMonthCountMcc(String value) {
        this.pThrMonthCountMcc = value;
    }

    /**
     * 获取pThrMonthTotalMcc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPThrMonthTotalMcc() {
        return pThrMonthTotalMcc;
    }

    /**
     * 设置pThrMonthTotalMcc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPThrMonthTotalMcc(String value) {
        this.pThrMonthTotalMcc = value;
    }

    /**
     * 获取sFirstDealTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFirstDealTime() {
        return sFirstDealTime;
    }

    /**
     * 设置sFirstDealTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFirstDealTime(String value) {
        this.sFirstDealTime = value;
    }

    /**
     * 获取sMonthAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMonthAge() {
        return sMonthAge;
    }

    /**
     * 设置sMonthAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMonthAge(String value) {
        this.sMonthAge = value;
    }

    /**
     * 获取sOneMonthDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOneMonthDay() {
        return sOneMonthDay;
    }

    /**
     * 设置sOneMonthDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOneMonthDay(String value) {
        this.sOneMonthDay = value;
    }

    /**
     * 获取sSixMonthDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSixMonthDay() {
        return sSixMonthDay;
    }

    /**
     * 设置sSixMonthDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSixMonthDay(String value) {
        this.sSixMonthDay = value;
    }

    /**
     * 获取sThrMonthDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSThrMonthDay() {
        return sThrMonthDay;
    }

    /**
     * 设置sThrMonthDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSThrMonthDay(String value) {
        this.sThrMonthDay = value;
    }

    /**
     * 获取tMonthTotalCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMonthTotalCost() {
        return tMonthTotalCost;
    }

    /**
     * 设置tMonthTotalCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMonthTotalCost(String value) {
        this.tMonthTotalCost = value;
    }

    /**
     * 获取tOneMonthDAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOneMonthDAmt() {
        return tOneMonthDAmt;
    }

    /**
     * 设置tOneMonthDAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOneMonthDAmt(BigDecimal value) {
        this.tOneMonthDAmt = value;
    }

    /**
     * 获取tOneMonthFAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOneMonthFAmt() {
        return tOneMonthFAmt;
    }

    /**
     * 设置tOneMonthFAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOneMonthFAmt(BigDecimal value) {
        this.tOneMonthFAmt = value;
    }

    /**
     * 获取tOneMonthJAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOneMonthJAmt() {
        return tOneMonthJAmt;
    }

    /**
     * 设置tOneMonthJAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOneMonthJAmt(BigDecimal value) {
        this.tOneMonthJAmt = value;
    }

    /**
     * 获取tOneMonthRiskRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOneMonthRiskRatio() {
        return tOneMonthRiskRatio;
    }

    /**
     * 设置tOneMonthRiskRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOneMonthRiskRatio(String value) {
        this.tOneMonthRiskRatio = value;
    }

    /**
     * 获取tOneMostAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOneMostAmt() {
        return tOneMostAmt;
    }

    /**
     * 设置tOneMostAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOneMostAmt(BigDecimal value) {
        this.tOneMostAmt = value;
    }

    /**
     * 获取tSixMonthDAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSixMonthDAmt() {
        return tSixMonthDAmt;
    }

    /**
     * 设置tSixMonthDAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSixMonthDAmt(BigDecimal value) {
        this.tSixMonthDAmt = value;
    }

    /**
     * 获取tSixMonthFAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSixMonthFAmt() {
        return tSixMonthFAmt;
    }

    /**
     * 设置tSixMonthFAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSixMonthFAmt(BigDecimal value) {
        this.tSixMonthFAmt = value;
    }

    /**
     * 获取tSixMonthJAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSixMonthJAmt() {
        return tSixMonthJAmt;
    }

    /**
     * 设置tSixMonthJAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSixMonthJAmt(BigDecimal value) {
        this.tSixMonthJAmt = value;
    }

    /**
     * 获取tSixMonthRiskRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSixMonthRiskRatio() {
        return tSixMonthRiskRatio;
    }

    /**
     * 设置tSixMonthRiskRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSixMonthRiskRatio(String value) {
        this.tSixMonthRiskRatio = value;
    }

    /**
     * 获取tThrMonthDAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTThrMonthDAmt() {
        return tThrMonthDAmt;
    }

    /**
     * 设置tThrMonthDAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTThrMonthDAmt(BigDecimal value) {
        this.tThrMonthDAmt = value;
    }

    /**
     * 获取tThrMonthFAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTThrMonthFAmt() {
        return tThrMonthFAmt;
    }

    /**
     * 设置tThrMonthFAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTThrMonthFAmt(BigDecimal value) {
        this.tThrMonthFAmt = value;
    }

    /**
     * 获取tThrMonthJAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTThrMonthJAmt() {
        return tThrMonthJAmt;
    }

    /**
     * 设置tThrMonthJAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTThrMonthJAmt(BigDecimal value) {
        this.tThrMonthJAmt = value;
    }

    /**
     * 获取tThrMonthRiskRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTThrMonthRiskRatio() {
        return tThrMonthRiskRatio;
    }

    /**
     * 设置tThrMonthRiskRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTThrMonthRiskRatio(String value) {
        this.tThrMonthRiskRatio = value;
    }

}
