
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationCar complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationCar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agenNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bankFinancialAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="canFreezeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carBuyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carDeptBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="carId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="carMile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="carNakedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="carName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="carStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commercialPledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="drivcard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="drivingPledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expirationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frameNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handoverDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCardPledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importPledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insurancePledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isHasCar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="keyPledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oneYearLPADITF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="originalPledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherPledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentPledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="productArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchasePledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regCertPledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="safeEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="safeStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valuation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationCar", propOrder = {
    "agenNum",
    "appId",
    "bankFinancialAssets",
    "canFreezeTime",
    "carArea",
    "carBuyDate",
    "carDate",
    "carDeptBalance",
    "carId",
    "carMile",
    "carNakedPrice",
    "carName",
    "carNum",
    "carPrice",
    "carStyle",
    "carYear",
    "certificate",
    "commercialPledge",
    "drivcard",
    "drivingPledge",
    "expirationTime",
    "frameNum",
    "handoverDate",
    "idCardPledge",
    "importPledge",
    "insurancePledge",
    "isHasCar",
    "keyPledge",
    "oneYearLPADITF",
    "originalPledge",
    "otherPledge",
    "paymentPledge",
    "price",
    "productArea",
    "purchasePledge",
    "regCertPledge",
    "registerNumber",
    "safeEndTime",
    "safeStartTime",
    "valuation"
})
public class TLonApplicationCar {

    protected String agenNum;
    protected Integer appId;
    protected BigDecimal bankFinancialAssets;
    protected String canFreezeTime;
    protected String carArea;
    protected String carBuyDate;
    protected String carDate;
    protected BigDecimal carDeptBalance;
    protected Integer carId;
    protected Integer carMile;
    protected BigDecimal carNakedPrice;
    protected String carName;
    protected String carNum;
    protected BigDecimal carPrice;
    protected String carStyle;
    protected Integer carYear;
    protected String certificate;
    protected String commercialPledge;
    protected String drivcard;
    protected String drivingPledge;
    protected String expirationTime;
    protected String frameNum;
    protected String handoverDate;
    protected String idCardPledge;
    protected String importPledge;
    protected String insurancePledge;
    protected Integer isHasCar;
    protected String keyPledge;
    protected BigDecimal oneYearLPADITF;
    protected String originalPledge;
    protected String otherPledge;
    protected String paymentPledge;
    protected BigDecimal price;
    protected String productArea;
    protected String purchasePledge;
    protected String regCertPledge;
    protected String registerNumber;
    protected String safeEndTime;
    protected String safeStartTime;
    protected BigDecimal valuation;

    /**
     * 获取agenNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenNum() {
        return agenNum;
    }

    /**
     * 设置agenNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenNum(String value) {
        this.agenNum = value;
    }

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
     * 获取bankFinancialAssets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBankFinancialAssets() {
        return bankFinancialAssets;
    }

    /**
     * 设置bankFinancialAssets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBankFinancialAssets(BigDecimal value) {
        this.bankFinancialAssets = value;
    }

    /**
     * 获取canFreezeTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanFreezeTime() {
        return canFreezeTime;
    }

    /**
     * 设置canFreezeTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanFreezeTime(String value) {
        this.canFreezeTime = value;
    }

    /**
     * 获取carArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarArea() {
        return carArea;
    }

    /**
     * 设置carArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarArea(String value) {
        this.carArea = value;
    }

    /**
     * 获取carBuyDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarBuyDate() {
        return carBuyDate;
    }

    /**
     * 设置carBuyDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarBuyDate(String value) {
        this.carBuyDate = value;
    }

    /**
     * 获取carDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarDate() {
        return carDate;
    }

    /**
     * 设置carDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarDate(String value) {
        this.carDate = value;
    }

    /**
     * 获取carDeptBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarDeptBalance() {
        return carDeptBalance;
    }

    /**
     * 设置carDeptBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarDeptBalance(BigDecimal value) {
        this.carDeptBalance = value;
    }

    /**
     * 获取carId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置carId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarId(Integer value) {
        this.carId = value;
    }

    /**
     * 获取carMile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarMile() {
        return carMile;
    }

    /**
     * 设置carMile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarMile(Integer value) {
        this.carMile = value;
    }

    /**
     * 获取carNakedPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarNakedPrice() {
        return carNakedPrice;
    }

    /**
     * 设置carNakedPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarNakedPrice(BigDecimal value) {
        this.carNakedPrice = value;
    }

    /**
     * 获取carName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarName() {
        return carName;
    }

    /**
     * 设置carName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarName(String value) {
        this.carName = value;
    }

    /**
     * 获取carNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarNum() {
        return carNum;
    }

    /**
     * 设置carNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarNum(String value) {
        this.carNum = value;
    }

    /**
     * 获取carPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarPrice() {
        return carPrice;
    }

    /**
     * 设置carPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarPrice(BigDecimal value) {
        this.carPrice = value;
    }

    /**
     * 获取carStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarStyle() {
        return carStyle;
    }

    /**
     * 设置carStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarStyle(String value) {
        this.carStyle = value;
    }

    /**
     * 获取carYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarYear() {
        return carYear;
    }

    /**
     * 设置carYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarYear(Integer value) {
        this.carYear = value;
    }

    /**
     * 获取certificate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * 设置certificate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificate(String value) {
        this.certificate = value;
    }

    /**
     * 获取commercialPledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialPledge() {
        return commercialPledge;
    }

    /**
     * 设置commercialPledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialPledge(String value) {
        this.commercialPledge = value;
    }

    /**
     * 获取drivcard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivcard() {
        return drivcard;
    }

    /**
     * 设置drivcard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivcard(String value) {
        this.drivcard = value;
    }

    /**
     * 获取drivingPledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingPledge() {
        return drivingPledge;
    }

    /**
     * 设置drivingPledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingPledge(String value) {
        this.drivingPledge = value;
    }

    /**
     * 获取expirationTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    /**
     * 设置expirationTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationTime(String value) {
        this.expirationTime = value;
    }

    /**
     * 获取frameNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameNum() {
        return frameNum;
    }

    /**
     * 设置frameNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameNum(String value) {
        this.frameNum = value;
    }

    /**
     * 获取handoverDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandoverDate() {
        return handoverDate;
    }

    /**
     * 设置handoverDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandoverDate(String value) {
        this.handoverDate = value;
    }

    /**
     * 获取idCardPledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardPledge() {
        return idCardPledge;
    }

    /**
     * 设置idCardPledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardPledge(String value) {
        this.idCardPledge = value;
    }

    /**
     * 获取importPledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportPledge() {
        return importPledge;
    }

    /**
     * 设置importPledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportPledge(String value) {
        this.importPledge = value;
    }

    /**
     * 获取insurancePledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurancePledge() {
        return insurancePledge;
    }

    /**
     * 设置insurancePledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurancePledge(String value) {
        this.insurancePledge = value;
    }

    /**
     * 获取isHasCar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsHasCar() {
        return isHasCar;
    }

    /**
     * 设置isHasCar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsHasCar(Integer value) {
        this.isHasCar = value;
    }

    /**
     * 获取keyPledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyPledge() {
        return keyPledge;
    }

    /**
     * 设置keyPledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyPledge(String value) {
        this.keyPledge = value;
    }

    /**
     * 获取oneYearLPADITF属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOneYearLPADITF() {
        return oneYearLPADITF;
    }

    /**
     * 设置oneYearLPADITF属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOneYearLPADITF(BigDecimal value) {
        this.oneYearLPADITF = value;
    }

    /**
     * 获取originalPledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPledge() {
        return originalPledge;
    }

    /**
     * 设置originalPledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPledge(String value) {
        this.originalPledge = value;
    }

    /**
     * 获取otherPledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPledge() {
        return otherPledge;
    }

    /**
     * 设置otherPledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPledge(String value) {
        this.otherPledge = value;
    }

    /**
     * 获取paymentPledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPledge() {
        return paymentPledge;
    }

    /**
     * 设置paymentPledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPledge(String value) {
        this.paymentPledge = value;
    }

    /**
     * 获取price属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * 获取productArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductArea() {
        return productArea;
    }

    /**
     * 设置productArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductArea(String value) {
        this.productArea = value;
    }

    /**
     * 获取purchasePledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasePledge() {
        return purchasePledge;
    }

    /**
     * 设置purchasePledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasePledge(String value) {
        this.purchasePledge = value;
    }

    /**
     * 获取regCertPledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegCertPledge() {
        return regCertPledge;
    }

    /**
     * 设置regCertPledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegCertPledge(String value) {
        this.regCertPledge = value;
    }

    /**
     * 获取registerNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterNumber() {
        return registerNumber;
    }

    /**
     * 设置registerNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterNumber(String value) {
        this.registerNumber = value;
    }

    /**
     * 获取safeEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafeEndTime() {
        return safeEndTime;
    }

    /**
     * 设置safeEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafeEndTime(String value) {
        this.safeEndTime = value;
    }

    /**
     * 获取safeStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafeStartTime() {
        return safeStartTime;
    }

    /**
     * 设置safeStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafeStartTime(String value) {
        this.safeStartTime = value;
    }

    /**
     * 获取valuation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValuation() {
        return valuation;
    }

    /**
     * 设置valuation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValuation(BigDecimal value) {
        this.valuation = value;
    }

}
