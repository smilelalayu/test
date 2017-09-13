
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>payment58 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="payment58"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="certId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="downPayMent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firRegdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handleMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanTerm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mileage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="receiveAreaCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBankCardCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBranchCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCellCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCorporation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveIDCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveNameCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOpenCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgCell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receivebankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refuseMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="vehBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehTerritoral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="venderPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment58", propOrder = {
    "appayAmt",
    "appid",
    "certId",
    "downPayMent",
    "firRegdate",
    "handleMan",
    "handlePhone",
    "instruction",
    "loanTerm",
    "mileage",
    "monthRate",
    "receiveAreaCar",
    "receiveBankCardCar",
    "receiveBranchCar",
    "receiveCellCar",
    "receiveCorporation",
    "receiveCountryCode",
    "receiveIDCar",
    "receiveNameCar",
    "receiveOpen",
    "receiveOpenCar",
    "receiveOrgArea",
    "receiveOrgBankCard",
    "receiveOrgBranch",
    "receiveOrgCell",
    "receiveOrgID",
    "receiveOrgName",
    "receivebankCard",
    "refuseMsg",
    "repayBankCard",
    "repayOpen",
    "signtime",
    "userId",
    "vehBrand",
    "vehTerritoral",
    "vehTotal",
    "vehValue",
    "venderPhoneNum"
})
public class Payment58 {

    protected BigDecimal appayAmt;
    protected int appid;
    protected String certId;
    protected String downPayMent;
    protected String firRegdate;
    protected String handleMan;
    protected String handlePhone;
    protected String instruction;
    protected int loanTerm;
    protected String mileage;
    protected float monthRate;
    protected String receiveAreaCar;
    protected String receiveBankCardCar;
    protected String receiveBranchCar;
    protected String receiveCellCar;
    protected String receiveCorporation;
    protected String receiveCountryCode;
    protected String receiveIDCar;
    protected String receiveNameCar;
    protected String receiveOpen;
    protected String receiveOpenCar;
    protected String receiveOrgArea;
    protected String receiveOrgBankCard;
    protected String receiveOrgBranch;
    protected String receiveOrgCell;
    protected String receiveOrgID;
    protected String receiveOrgName;
    protected String receivebankCard;
    protected String refuseMsg;
    protected String repayBankCard;
    protected String repayOpen;
    protected String signtime;
    protected long userId;
    protected String vehBrand;
    protected String vehTerritoral;
    protected String vehTotal;
    protected String vehValue;
    protected String venderPhoneNum;

    /**
     * 获取appayAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppayAmt() {
        return appayAmt;
    }

    /**
     * 设置appayAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppayAmt(BigDecimal value) {
        this.appayAmt = value;
    }

    /**
     * 获取appid属性的值。
     * 
     */
    public int getAppid() {
        return appid;
    }

    /**
     * 设置appid属性的值。
     * 
     */
    public void setAppid(int value) {
        this.appid = value;
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
     * 获取downPayMent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownPayMent() {
        return downPayMent;
    }

    /**
     * 设置downPayMent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownPayMent(String value) {
        this.downPayMent = value;
    }

    /**
     * 获取firRegdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirRegdate() {
        return firRegdate;
    }

    /**
     * 设置firRegdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirRegdate(String value) {
        this.firRegdate = value;
    }

    /**
     * 获取handleMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleMan() {
        return handleMan;
    }

    /**
     * 设置handleMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleMan(String value) {
        this.handleMan = value;
    }

    /**
     * 获取handlePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlePhone() {
        return handlePhone;
    }

    /**
     * 设置handlePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlePhone(String value) {
        this.handlePhone = value;
    }

    /**
     * 获取instruction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * 设置instruction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

    /**
     * 获取loanTerm属性的值。
     * 
     */
    public int getLoanTerm() {
        return loanTerm;
    }

    /**
     * 设置loanTerm属性的值。
     * 
     */
    public void setLoanTerm(int value) {
        this.loanTerm = value;
    }

    /**
     * 获取mileage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileage() {
        return mileage;
    }

    /**
     * 设置mileage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileage(String value) {
        this.mileage = value;
    }

    /**
     * 获取monthRate属性的值。
     * 
     */
    public float getMonthRate() {
        return monthRate;
    }

    /**
     * 设置monthRate属性的值。
     * 
     */
    public void setMonthRate(float value) {
        this.monthRate = value;
    }

    /**
     * 获取receiveAreaCar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveAreaCar() {
        return receiveAreaCar;
    }

    /**
     * 设置receiveAreaCar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveAreaCar(String value) {
        this.receiveAreaCar = value;
    }

    /**
     * 获取receiveBankCardCar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveBankCardCar() {
        return receiveBankCardCar;
    }

    /**
     * 设置receiveBankCardCar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveBankCardCar(String value) {
        this.receiveBankCardCar = value;
    }

    /**
     * 获取receiveBranchCar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveBranchCar() {
        return receiveBranchCar;
    }

    /**
     * 设置receiveBranchCar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveBranchCar(String value) {
        this.receiveBranchCar = value;
    }

    /**
     * 获取receiveCellCar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCellCar() {
        return receiveCellCar;
    }

    /**
     * 设置receiveCellCar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCellCar(String value) {
        this.receiveCellCar = value;
    }

    /**
     * 获取receiveCorporation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCorporation() {
        return receiveCorporation;
    }

    /**
     * 设置receiveCorporation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCorporation(String value) {
        this.receiveCorporation = value;
    }

    /**
     * 获取receiveCountryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCountryCode() {
        return receiveCountryCode;
    }

    /**
     * 设置receiveCountryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCountryCode(String value) {
        this.receiveCountryCode = value;
    }

    /**
     * 获取receiveIDCar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveIDCar() {
        return receiveIDCar;
    }

    /**
     * 设置receiveIDCar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveIDCar(String value) {
        this.receiveIDCar = value;
    }

    /**
     * 获取receiveNameCar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveNameCar() {
        return receiveNameCar;
    }

    /**
     * 设置receiveNameCar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveNameCar(String value) {
        this.receiveNameCar = value;
    }

    /**
     * 获取receiveOpen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOpen() {
        return receiveOpen;
    }

    /**
     * 设置receiveOpen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOpen(String value) {
        this.receiveOpen = value;
    }

    /**
     * 获取receiveOpenCar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOpenCar() {
        return receiveOpenCar;
    }

    /**
     * 设置receiveOpenCar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOpenCar(String value) {
        this.receiveOpenCar = value;
    }

    /**
     * 获取receiveOrgArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgArea() {
        return receiveOrgArea;
    }

    /**
     * 设置receiveOrgArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgArea(String value) {
        this.receiveOrgArea = value;
    }

    /**
     * 获取receiveOrgBankCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgBankCard() {
        return receiveOrgBankCard;
    }

    /**
     * 设置receiveOrgBankCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgBankCard(String value) {
        this.receiveOrgBankCard = value;
    }

    /**
     * 获取receiveOrgBranch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgBranch() {
        return receiveOrgBranch;
    }

    /**
     * 设置receiveOrgBranch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgBranch(String value) {
        this.receiveOrgBranch = value;
    }

    /**
     * 获取receiveOrgCell属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgCell() {
        return receiveOrgCell;
    }

    /**
     * 设置receiveOrgCell属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgCell(String value) {
        this.receiveOrgCell = value;
    }

    /**
     * 获取receiveOrgID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgID() {
        return receiveOrgID;
    }

    /**
     * 设置receiveOrgID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgID(String value) {
        this.receiveOrgID = value;
    }

    /**
     * 获取receiveOrgName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgName() {
        return receiveOrgName;
    }

    /**
     * 设置receiveOrgName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgName(String value) {
        this.receiveOrgName = value;
    }

    /**
     * 获取receivebankCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivebankCard() {
        return receivebankCard;
    }

    /**
     * 设置receivebankCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivebankCard(String value) {
        this.receivebankCard = value;
    }

    /**
     * 获取refuseMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefuseMsg() {
        return refuseMsg;
    }

    /**
     * 设置refuseMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefuseMsg(String value) {
        this.refuseMsg = value;
    }

    /**
     * 获取repayBankCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayBankCard() {
        return repayBankCard;
    }

    /**
     * 设置repayBankCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayBankCard(String value) {
        this.repayBankCard = value;
    }

    /**
     * 获取repayOpen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayOpen() {
        return repayOpen;
    }

    /**
     * 设置repayOpen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayOpen(String value) {
        this.repayOpen = value;
    }

    /**
     * 获取signtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigntime() {
        return signtime;
    }

    /**
     * 设置signtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigntime(String value) {
        this.signtime = value;
    }

    /**
     * 获取userId属性的值。
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * 获取vehBrand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehBrand() {
        return vehBrand;
    }

    /**
     * 设置vehBrand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehBrand(String value) {
        this.vehBrand = value;
    }

    /**
     * 获取vehTerritoral属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehTerritoral() {
        return vehTerritoral;
    }

    /**
     * 设置vehTerritoral属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehTerritoral(String value) {
        this.vehTerritoral = value;
    }

    /**
     * 获取vehTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehTotal() {
        return vehTotal;
    }

    /**
     * 设置vehTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehTotal(String value) {
        this.vehTotal = value;
    }

    /**
     * 获取vehValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehValue() {
        return vehValue;
    }

    /**
     * 设置vehValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehValue(String value) {
        this.vehValue = value;
    }

    /**
     * 获取venderPhoneNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenderPhoneNum() {
        return venderPhoneNum;
    }

    /**
     * 设置venderPhoneNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenderPhoneNum(String value) {
        this.venderPhoneNum = value;
    }

}
