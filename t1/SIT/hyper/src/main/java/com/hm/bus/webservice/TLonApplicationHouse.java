
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationHouse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationHouse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="buyAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="buyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="havaHouseLoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseAddressDistinct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseAddressProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseAddressRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseArea" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="houseDebtBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="houseEvaluation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="houseId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="houseMortgageMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseOwnerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="houseOwnerOfLoanRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="housePostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseTitleDeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isHasHouse" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isHasHouseOwner" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rentAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="titleDeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationHouse", propOrder = {
    "appId",
    "buyAmt",
    "buyDate",
    "guarantorType",
    "havaHouseLoan",
    "houseAddress",
    "houseAddressCity",
    "houseAddressDistinct",
    "houseAddressProvince",
    "houseAddressRoad",
    "houseAge",
    "houseArea",
    "houseDebtBalance",
    "houseEvaluation",
    "houseId",
    "houseMortgageMode",
    "houseOwner",
    "houseOwnerCount",
    "houseOwnerOfLoanRate",
    "housePostcode",
    "houseRemark",
    "houseTitleDeed",
    "houseType",
    "isHasHouse",
    "isHasHouseOwner",
    "rentAmt",
    "titleDeed"
})
public class TLonApplicationHouse {

    protected Integer appId;
    protected BigDecimal buyAmt;
    protected String buyDate;
    protected String guarantorType;
    protected String havaHouseLoan;
    protected String houseAddress;
    protected String houseAddressCity;
    protected String houseAddressDistinct;
    protected String houseAddressProvince;
    protected String houseAddressRoad;
    protected String houseAge;
    protected Float houseArea;
    protected BigDecimal houseDebtBalance;
    protected BigDecimal houseEvaluation;
    protected Integer houseId;
    protected String houseMortgageMode;
    protected String houseOwner;
    protected Integer houseOwnerCount;
    protected Float houseOwnerOfLoanRate;
    protected String housePostcode;
    protected String houseRemark;
    protected String houseTitleDeed;
    protected String houseType;
    protected Integer isHasHouse;
    protected Integer isHasHouseOwner;
    protected BigDecimal rentAmt;
    protected String titleDeed;

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
     * 获取buyAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuyAmt() {
        return buyAmt;
    }

    /**
     * 设置buyAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuyAmt(BigDecimal value) {
        this.buyAmt = value;
    }

    /**
     * 获取buyDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyDate() {
        return buyDate;
    }

    /**
     * 设置buyDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyDate(String value) {
        this.buyDate = value;
    }

    /**
     * 获取guarantorType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorType() {
        return guarantorType;
    }

    /**
     * 设置guarantorType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorType(String value) {
        this.guarantorType = value;
    }

    /**
     * 获取havaHouseLoan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHavaHouseLoan() {
        return havaHouseLoan;
    }

    /**
     * 设置havaHouseLoan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHavaHouseLoan(String value) {
        this.havaHouseLoan = value;
    }

    /**
     * 获取houseAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAddress() {
        return houseAddress;
    }

    /**
     * 设置houseAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAddress(String value) {
        this.houseAddress = value;
    }

    /**
     * 获取houseAddressCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAddressCity() {
        return houseAddressCity;
    }

    /**
     * 设置houseAddressCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAddressCity(String value) {
        this.houseAddressCity = value;
    }

    /**
     * 获取houseAddressDistinct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAddressDistinct() {
        return houseAddressDistinct;
    }

    /**
     * 设置houseAddressDistinct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAddressDistinct(String value) {
        this.houseAddressDistinct = value;
    }

    /**
     * 获取houseAddressProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAddressProvince() {
        return houseAddressProvince;
    }

    /**
     * 设置houseAddressProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAddressProvince(String value) {
        this.houseAddressProvince = value;
    }

    /**
     * 获取houseAddressRoad属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAddressRoad() {
        return houseAddressRoad;
    }

    /**
     * 设置houseAddressRoad属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAddressRoad(String value) {
        this.houseAddressRoad = value;
    }

    /**
     * 获取houseAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAge() {
        return houseAge;
    }

    /**
     * 设置houseAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAge(String value) {
        this.houseAge = value;
    }

    /**
     * 获取houseArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHouseArea() {
        return houseArea;
    }

    /**
     * 设置houseArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHouseArea(Float value) {
        this.houseArea = value;
    }

    /**
     * 获取houseDebtBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseDebtBalance() {
        return houseDebtBalance;
    }

    /**
     * 设置houseDebtBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseDebtBalance(BigDecimal value) {
        this.houseDebtBalance = value;
    }

    /**
     * 获取houseEvaluation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseEvaluation() {
        return houseEvaluation;
    }

    /**
     * 设置houseEvaluation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseEvaluation(BigDecimal value) {
        this.houseEvaluation = value;
    }

    /**
     * 获取houseId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHouseId() {
        return houseId;
    }

    /**
     * 设置houseId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHouseId(Integer value) {
        this.houseId = value;
    }

    /**
     * 获取houseMortgageMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseMortgageMode() {
        return houseMortgageMode;
    }

    /**
     * 设置houseMortgageMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseMortgageMode(String value) {
        this.houseMortgageMode = value;
    }

    /**
     * 获取houseOwner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseOwner() {
        return houseOwner;
    }

    /**
     * 设置houseOwner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseOwner(String value) {
        this.houseOwner = value;
    }

    /**
     * 获取houseOwnerCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHouseOwnerCount() {
        return houseOwnerCount;
    }

    /**
     * 设置houseOwnerCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHouseOwnerCount(Integer value) {
        this.houseOwnerCount = value;
    }

    /**
     * 获取houseOwnerOfLoanRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHouseOwnerOfLoanRate() {
        return houseOwnerOfLoanRate;
    }

    /**
     * 设置houseOwnerOfLoanRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHouseOwnerOfLoanRate(Float value) {
        this.houseOwnerOfLoanRate = value;
    }

    /**
     * 获取housePostcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousePostcode() {
        return housePostcode;
    }

    /**
     * 设置housePostcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousePostcode(String value) {
        this.housePostcode = value;
    }

    /**
     * 获取houseRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseRemark() {
        return houseRemark;
    }

    /**
     * 设置houseRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseRemark(String value) {
        this.houseRemark = value;
    }

    /**
     * 获取houseTitleDeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseTitleDeed() {
        return houseTitleDeed;
    }

    /**
     * 设置houseTitleDeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseTitleDeed(String value) {
        this.houseTitleDeed = value;
    }

    /**
     * 获取houseType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseType() {
        return houseType;
    }

    /**
     * 设置houseType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseType(String value) {
        this.houseType = value;
    }

    /**
     * 获取isHasHouse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsHasHouse() {
        return isHasHouse;
    }

    /**
     * 设置isHasHouse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsHasHouse(Integer value) {
        this.isHasHouse = value;
    }

    /**
     * 获取isHasHouseOwner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsHasHouseOwner() {
        return isHasHouseOwner;
    }

    /**
     * 设置isHasHouseOwner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsHasHouseOwner(Integer value) {
        this.isHasHouseOwner = value;
    }

    /**
     * 获取rentAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRentAmt() {
        return rentAmt;
    }

    /**
     * 设置rentAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRentAmt(BigDecimal value) {
        this.rentAmt = value;
    }

    /**
     * 获取titleDeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDeed() {
        return titleDeed;
    }

    /**
     * 设置titleDeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDeed(String value) {
        this.titleDeed = value;
    }

}
