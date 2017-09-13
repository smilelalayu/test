
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonOldCar complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonOldCar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="assessmentValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateIsMortgage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distributorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="distributorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="engineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="newCarPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="oldCarId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="plateNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyIsMortgage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registrationYera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonOldCar", propOrder = {
    "appId",
    "assessmentValue",
    "brand",
    "carLine",
    "carModel",
    "certificateIsMortgage",
    "certificateNumber",
    "distributorId",
    "distributorName",
    "engineNumber",
    "insuranceEndDate",
    "insuranceStartDate",
    "mileage",
    "newCarPrice",
    "oldCarId",
    "plateNumbers",
    "policyIsMortgage",
    "registrationYera"
})
public class TLonOldCar {

    protected Integer appId;
    protected BigDecimal assessmentValue;
    protected String brand;
    protected String carLine;
    protected String carModel;
    protected String certificateIsMortgage;
    protected String certificateNumber;
    protected Integer distributorId;
    protected String distributorName;
    protected String engineNumber;
    protected String insuranceEndDate;
    protected String insuranceStartDate;
    protected Double mileage;
    protected BigDecimal newCarPrice;
    protected Integer oldCarId;
    protected String plateNumbers;
    protected String policyIsMortgage;
    protected String registrationYera;

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
     * 获取assessmentValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssessmentValue() {
        return assessmentValue;
    }

    /**
     * 设置assessmentValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssessmentValue(BigDecimal value) {
        this.assessmentValue = value;
    }

    /**
     * 获取brand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置brand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * 获取carLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarLine() {
        return carLine;
    }

    /**
     * 设置carLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarLine(String value) {
        this.carLine = value;
    }

    /**
     * 获取carModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * 设置carModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarModel(String value) {
        this.carModel = value;
    }

    /**
     * 获取certificateIsMortgage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateIsMortgage() {
        return certificateIsMortgage;
    }

    /**
     * 设置certificateIsMortgage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateIsMortgage(String value) {
        this.certificateIsMortgage = value;
    }

    /**
     * 获取certificateNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * 设置certificateNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * 获取distributorId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistributorId() {
        return distributorId;
    }

    /**
     * 设置distributorId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistributorId(Integer value) {
        this.distributorId = value;
    }

    /**
     * 获取distributorName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributorName() {
        return distributorName;
    }

    /**
     * 设置distributorName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributorName(String value) {
        this.distributorName = value;
    }

    /**
     * 获取engineNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /**
     * 设置engineNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNumber(String value) {
        this.engineNumber = value;
    }

    /**
     * 获取insuranceEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceEndDate() {
        return insuranceEndDate;
    }

    /**
     * 设置insuranceEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceEndDate(String value) {
        this.insuranceEndDate = value;
    }

    /**
     * 获取insuranceStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceStartDate() {
        return insuranceStartDate;
    }

    /**
     * 设置insuranceStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceStartDate(String value) {
        this.insuranceStartDate = value;
    }

    /**
     * 获取mileage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMileage() {
        return mileage;
    }

    /**
     * 设置mileage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMileage(Double value) {
        this.mileage = value;
    }

    /**
     * 获取newCarPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewCarPrice() {
        return newCarPrice;
    }

    /**
     * 设置newCarPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewCarPrice(BigDecimal value) {
        this.newCarPrice = value;
    }

    /**
     * 获取oldCarId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldCarId() {
        return oldCarId;
    }

    /**
     * 设置oldCarId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldCarId(Integer value) {
        this.oldCarId = value;
    }

    /**
     * 获取plateNumbers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateNumbers() {
        return plateNumbers;
    }

    /**
     * 设置plateNumbers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateNumbers(String value) {
        this.plateNumbers = value;
    }

    /**
     * 获取policyIsMortgage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyIsMortgage() {
        return policyIsMortgage;
    }

    /**
     * 设置policyIsMortgage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyIsMortgage(String value) {
        this.policyIsMortgage = value;
    }

    /**
     * 获取registrationYera属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationYera() {
        return registrationYera;
    }

    /**
     * 设置registrationYera属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationYera(String value) {
        this.registrationYera = value;
    }

}
