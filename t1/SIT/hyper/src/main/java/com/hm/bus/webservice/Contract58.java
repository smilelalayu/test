
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>contract58 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="contract58"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="downPayMent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firRegdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCardNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanTerm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mileage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBankCardCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBranchCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveNameCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOpenCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sigTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="vehBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehTerritoral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract58", propOrder = {
    "appId",
    "appayAmt",
    "downPayMent",
    "firRegdate",
    "idCardNum",
    "loanTerm",
    "mileage",
    "receiveBankCard",
    "receiveBankCardCar",
    "receiveBranchCar",
    "receiveCountryCode",
    "receiveNameCar",
    "receiveOpen",
    "receiveOpenCar",
    "sigTime",
    "userId",
    "vehBrand",
    "vehTerritoral",
    "vehTotal",
    "vehValue"
})
public class Contract58 {

    protected String appId;
    protected BigDecimal appayAmt;
    protected String downPayMent;
    protected String firRegdate;
    protected String idCardNum;
    protected int loanTerm;
    protected String mileage;
    protected String receiveBankCard;
    protected String receiveBankCardCar;
    protected String receiveBranchCar;
    protected String receiveCountryCode;
    protected String receiveNameCar;
    protected String receiveOpen;
    protected String receiveOpenCar;
    protected String sigTime;
    protected long userId;
    protected String vehBrand;
    protected String vehTerritoral;
    protected String vehTotal;
    protected String vehValue;

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
     * 获取idCardNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNum() {
        return idCardNum;
    }

    /**
     * 设置idCardNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNum(String value) {
        this.idCardNum = value;
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
     * 获取receiveBankCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveBankCard() {
        return receiveBankCard;
    }

    /**
     * 设置receiveBankCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveBankCard(String value) {
        this.receiveBankCard = value;
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
     * 获取sigTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigTime() {
        return sigTime;
    }

    /**
     * 设置sigTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigTime(String value) {
        this.sigTime = value;
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

}
