
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationCarTradeStock complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcarNumber���Ե�ֵ��
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
     * ����carNumber���Ե�ֵ��
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
     * ��ȡcompanyContact���Ե�ֵ��
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
     * ����companyContact���Ե�ֵ��
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
     * ��ȡdayInventory���Ե�ֵ��
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
     * ����dayInventory���Ե�ֵ��
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
     * ��ȡdelStatus���Ե�ֵ��
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
     * ����delStatus���Ե�ֵ��
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
     * ��ȡemployeesNum���Ե�ֵ��
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
     * ����employeesNum���Ե�ֵ��
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
     * ��ȡlegalName���Ե�ֵ��
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
     * ����legalName���Ե�ֵ��
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
     * ��ȡmaxInventory���Ե�ֵ��
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
     * ����maxInventory���Ե�ֵ��
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
     * ��ȡmonthlyInventory���Ե�ֵ��
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
     * ����monthlyInventory���Ե�ֵ��
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
     * ��ȡmonthlySalesAverage���Ե�ֵ��
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
     * ����monthlySalesAverage���Ե�ֵ��
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
     * ��ȡmonthlySalesVolume���Ե�ֵ��
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
     * ����monthlySalesVolume���Ե�ֵ��
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
     * ��ȡnetProfit���Ե�ֵ��
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
     * ����netProfit���Ե�ֵ��
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
     * ��ȡofficePremises���Ե�ֵ��
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
     * ����officePremises���Ե�ֵ��
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
     * ��ȡpersonalCreditInfo���Ե�ֵ��
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
     * ����personalCreditInfo���Ե�ֵ��
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
     * ��ȡregisteredCapital���Ե�ֵ��
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
     * ����registeredCapital���Ե�ֵ��
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
     * ��ȡregisteredDate���Ե�ֵ��
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
     * ����registeredDate���Ե�ֵ��
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
     * ��ȡtotalLoanAmount���Ե�ֵ��
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
     * ����totalLoanAmount���Ե�ֵ��
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
     * ��ȡyearSales���Ե�ֵ��
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
     * ����yearSales���Ե�ֵ��
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
