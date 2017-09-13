
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationCarTradeStock complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationCarTradeStock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="carNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dayInventory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="delStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="employeesNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxInventory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthlyInventory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthlySalesAverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthlySalesVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="netProfit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officePremises" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personalCreditInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registeredCapital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registeredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalLoanAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yearSales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationCarTradeStock", propOrder = {
    "appId",
    "carNumber",
    "companyContact",
    "dayInventory",
    "delStatus",
    "employeesNum",
    "id",
    "legalName",
    "maxInventory",
    "monthlyInventory",
    "monthlySalesAverage",
    "monthlySalesVolume",
    "netProfit",
    "officePremises",
    "personalCreditInfo",
    "registeredCapital",
    "registeredDate",
    "totalLoanAmount",
    "yearSales"
})
public class TLonApplicationCarTradeStock {

    protected Integer appId;
    protected String carNumber;
    protected String companyContact;
    protected String dayInventory;
    protected Integer delStatus;
    protected String employeesNum;
    protected Integer id;
    protected String legalName;
    protected String maxInventory;
    protected String monthlyInventory;
    protected String monthlySalesAverage;
    protected String monthlySalesVolume;
    protected String netProfit;
    protected String officePremises;
    protected String personalCreditInfo;
    protected String registeredCapital;
    protected String registeredDate;
    protected String totalLoanAmount;
    protected String yearSales;

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
     * 获取carNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * 设置carNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarNumber(String value) {
        this.carNumber = value;
    }

    /**
     * 获取companyContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyContact() {
        return companyContact;
    }

    /**
     * 设置companyContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyContact(String value) {
        this.companyContact = value;
    }

    /**
     * 获取dayInventory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayInventory() {
        return dayInventory;
    }

    /**
     * 设置dayInventory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayInventory(String value) {
        this.dayInventory = value;
    }

    /**
     * 获取delStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelStatus() {
        return delStatus;
    }

    /**
     * 设置delStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelStatus(Integer value) {
        this.delStatus = value;
    }

    /**
     * 获取employeesNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeesNum() {
        return employeesNum;
    }

    /**
     * 设置employeesNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeesNum(String value) {
        this.employeesNum = value;
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
     * 获取legalName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * 设置legalName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * 获取maxInventory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxInventory() {
        return maxInventory;
    }

    /**
     * 设置maxInventory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxInventory(String value) {
        this.maxInventory = value;
    }

    /**
     * 获取monthlyInventory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyInventory() {
        return monthlyInventory;
    }

    /**
     * 设置monthlyInventory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyInventory(String value) {
        this.monthlyInventory = value;
    }

    /**
     * 获取monthlySalesAverage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlySalesAverage() {
        return monthlySalesAverage;
    }

    /**
     * 设置monthlySalesAverage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlySalesAverage(String value) {
        this.monthlySalesAverage = value;
    }

    /**
     * 获取monthlySalesVolume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlySalesVolume() {
        return monthlySalesVolume;
    }

    /**
     * 设置monthlySalesVolume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlySalesVolume(String value) {
        this.monthlySalesVolume = value;
    }

    /**
     * 获取netProfit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetProfit() {
        return netProfit;
    }

    /**
     * 设置netProfit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetProfit(String value) {
        this.netProfit = value;
    }

    /**
     * 获取officePremises属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePremises() {
        return officePremises;
    }

    /**
     * 设置officePremises属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePremises(String value) {
        this.officePremises = value;
    }

    /**
     * 获取personalCreditInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalCreditInfo() {
        return personalCreditInfo;
    }

    /**
     * 设置personalCreditInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalCreditInfo(String value) {
        this.personalCreditInfo = value;
    }

    /**
     * 获取registeredCapital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredCapital() {
        return registeredCapital;
    }

    /**
     * 设置registeredCapital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredCapital(String value) {
        this.registeredCapital = value;
    }

    /**
     * 获取registeredDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredDate() {
        return registeredDate;
    }

    /**
     * 设置registeredDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredDate(String value) {
        this.registeredDate = value;
    }

    /**
     * 获取totalLoanAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalLoanAmount() {
        return totalLoanAmount;
    }

    /**
     * 设置totalLoanAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalLoanAmount(String value) {
        this.totalLoanAmount = value;
    }

    /**
     * 获取yearSales属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearSales() {
        return yearSales;
    }

    /**
     * 设置yearSales属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearSales(String value) {
        this.yearSales = value;
    }

}
