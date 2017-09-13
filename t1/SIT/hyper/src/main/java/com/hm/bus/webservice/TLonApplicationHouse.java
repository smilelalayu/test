
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationHouse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbuyAmt���Ե�ֵ��
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
     * ����buyAmt���Ե�ֵ��
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
     * ��ȡbuyDate���Ե�ֵ��
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
     * ����buyDate���Ե�ֵ��
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
     * ��ȡguarantorType���Ե�ֵ��
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
     * ����guarantorType���Ե�ֵ��
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
     * ��ȡhavaHouseLoan���Ե�ֵ��
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
     * ����havaHouseLoan���Ե�ֵ��
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
     * ��ȡhouseAddress���Ե�ֵ��
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
     * ����houseAddress���Ե�ֵ��
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
     * ��ȡhouseAddressCity���Ե�ֵ��
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
     * ����houseAddressCity���Ե�ֵ��
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
     * ��ȡhouseAddressDistinct���Ե�ֵ��
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
     * ����houseAddressDistinct���Ե�ֵ��
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
     * ��ȡhouseAddressProvince���Ե�ֵ��
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
     * ����houseAddressProvince���Ե�ֵ��
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
     * ��ȡhouseAddressRoad���Ե�ֵ��
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
     * ����houseAddressRoad���Ե�ֵ��
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
     * ��ȡhouseAge���Ե�ֵ��
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
     * ����houseAge���Ե�ֵ��
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
     * ��ȡhouseArea���Ե�ֵ��
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
     * ����houseArea���Ե�ֵ��
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
     * ��ȡhouseDebtBalance���Ե�ֵ��
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
     * ����houseDebtBalance���Ե�ֵ��
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
     * ��ȡhouseEvaluation���Ե�ֵ��
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
     * ����houseEvaluation���Ե�ֵ��
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
     * ��ȡhouseId���Ե�ֵ��
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
     * ����houseId���Ե�ֵ��
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
     * ��ȡhouseMortgageMode���Ե�ֵ��
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
     * ����houseMortgageMode���Ե�ֵ��
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
     * ��ȡhouseOwner���Ե�ֵ��
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
     * ����houseOwner���Ե�ֵ��
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
     * ��ȡhouseOwnerCount���Ե�ֵ��
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
     * ����houseOwnerCount���Ե�ֵ��
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
     * ��ȡhouseOwnerOfLoanRate���Ե�ֵ��
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
     * ����houseOwnerOfLoanRate���Ե�ֵ��
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
     * ��ȡhousePostcode���Ե�ֵ��
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
     * ����housePostcode���Ե�ֵ��
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
     * ��ȡhouseRemark���Ե�ֵ��
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
     * ����houseRemark���Ե�ֵ��
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
     * ��ȡhouseTitleDeed���Ե�ֵ��
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
     * ����houseTitleDeed���Ե�ֵ��
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
     * ��ȡhouseType���Ե�ֵ��
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
     * ����houseType���Ե�ֵ��
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
     * ��ȡisHasHouse���Ե�ֵ��
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
     * ����isHasHouse���Ե�ֵ��
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
     * ��ȡisHasHouseOwner���Ե�ֵ��
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
     * ����isHasHouseOwner���Ե�ֵ��
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
     * ��ȡrentAmt���Ե�ֵ��
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
     * ����rentAmt���Ե�ֵ��
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
     * ��ȡtitleDeed���Ե�ֵ��
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
     * ����titleDeed���Ե�ֵ��
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
