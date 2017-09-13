
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonLightningloanInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡid���Ե�ֵ��
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
     * ����id���Ե�ֵ��
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
     * ��ȡcOneMonthAmt���Ե�ֵ��
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
     * ����cOneMonthAmt���Ե�ֵ��
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
     * ��ȡcOneMonthCount���Ե�ֵ��
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
     * ����cOneMonthCount���Ե�ֵ��
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
     * ��ȡcSixUserGrowth���Ե�ֵ��
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
     * ����cSixUserGrowth���Ե�ֵ��
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
     * ��ȡmAddress���Ե�ֵ��
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
     * ����mAddress���Ե�ֵ��
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
     * ��ȡmCapital���Ե�ֵ��
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
     * ����mCapital���Ե�ֵ��
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
     * ��ȡmCode���Ե�ֵ��
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
     * ����mCode���Ե�ֵ��
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
     * ��ȡmIndustry���Ե�ֵ��
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
     * ����mIndustry���Ե�ֵ��
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
     * ��ȡmName���Ե�ֵ��
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
     * ����mName���Ե�ֵ��
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
     * ��ȡmNature���Ե�ֵ��
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
     * ����mNature���Ե�ֵ��
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
     * ��ȡmNumber���Ե�ֵ��
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
     * ����mNumber���Ե�ֵ��
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
     * ��ȡmState���Ե�ֵ��
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
     * ����mState���Ե�ֵ��
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
     * ��ȡmTime���Ե�ֵ��
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
     * ����mTime���Ե�ֵ��
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
     * ��ȡpSixMonthAmtMcc���Ե�ֵ��
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
     * ����pSixMonthAmtMcc���Ե�ֵ��
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
     * ��ȡpSixMonthCountMcc���Ե�ֵ��
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
     * ����pSixMonthCountMcc���Ե�ֵ��
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
     * ��ȡpSixMonthTotalMcc���Ե�ֵ��
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
     * ����pSixMonthTotalMcc���Ե�ֵ��
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
     * ��ȡpThrMonthAmtMcc���Ե�ֵ��
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
     * ����pThrMonthAmtMcc���Ե�ֵ��
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
     * ��ȡpThrMonthCountMcc���Ե�ֵ��
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
     * ����pThrMonthCountMcc���Ե�ֵ��
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
     * ��ȡpThrMonthTotalMcc���Ե�ֵ��
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
     * ����pThrMonthTotalMcc���Ե�ֵ��
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
     * ��ȡsFirstDealTime���Ե�ֵ��
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
     * ����sFirstDealTime���Ե�ֵ��
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
     * ��ȡsMonthAge���Ե�ֵ��
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
     * ����sMonthAge���Ե�ֵ��
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
     * ��ȡsOneMonthDay���Ե�ֵ��
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
     * ����sOneMonthDay���Ե�ֵ��
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
     * ��ȡsSixMonthDay���Ե�ֵ��
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
     * ����sSixMonthDay���Ե�ֵ��
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
     * ��ȡsThrMonthDay���Ե�ֵ��
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
     * ����sThrMonthDay���Ե�ֵ��
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
     * ��ȡtMonthTotalCost���Ե�ֵ��
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
     * ����tMonthTotalCost���Ե�ֵ��
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
     * ��ȡtOneMonthDAmt���Ե�ֵ��
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
     * ����tOneMonthDAmt���Ե�ֵ��
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
     * ��ȡtOneMonthFAmt���Ե�ֵ��
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
     * ����tOneMonthFAmt���Ե�ֵ��
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
     * ��ȡtOneMonthJAmt���Ե�ֵ��
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
     * ����tOneMonthJAmt���Ե�ֵ��
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
     * ��ȡtOneMonthRiskRatio���Ե�ֵ��
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
     * ����tOneMonthRiskRatio���Ե�ֵ��
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
     * ��ȡtOneMostAmt���Ե�ֵ��
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
     * ����tOneMostAmt���Ե�ֵ��
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
     * ��ȡtSixMonthDAmt���Ե�ֵ��
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
     * ����tSixMonthDAmt���Ե�ֵ��
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
     * ��ȡtSixMonthFAmt���Ե�ֵ��
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
     * ����tSixMonthFAmt���Ե�ֵ��
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
     * ��ȡtSixMonthJAmt���Ե�ֵ��
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
     * ����tSixMonthJAmt���Ե�ֵ��
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
     * ��ȡtSixMonthRiskRatio���Ե�ֵ��
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
     * ����tSixMonthRiskRatio���Ե�ֵ��
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
     * ��ȡtThrMonthDAmt���Ե�ֵ��
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
     * ����tThrMonthDAmt���Ե�ֵ��
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
     * ��ȡtThrMonthFAmt���Ե�ֵ��
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
     * ����tThrMonthFAmt���Ե�ֵ��
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
     * ��ȡtThrMonthJAmt���Ե�ֵ��
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
     * ����tThrMonthJAmt���Ե�ֵ��
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
     * ��ȡtThrMonthRiskRatio���Ե�ֵ��
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
     * ����tThrMonthRiskRatio���Ե�ֵ��
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
