
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationCar complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡagenNum���Ե�ֵ��
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
     * ����agenNum���Ե�ֵ��
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
     * ��ȡbankFinancialAssets���Ե�ֵ��
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
     * ����bankFinancialAssets���Ե�ֵ��
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
     * ��ȡcanFreezeTime���Ե�ֵ��
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
     * ����canFreezeTime���Ե�ֵ��
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
     * ��ȡcarArea���Ե�ֵ��
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
     * ����carArea���Ե�ֵ��
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
     * ��ȡcarBuyDate���Ե�ֵ��
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
     * ����carBuyDate���Ե�ֵ��
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
     * ��ȡcarDate���Ե�ֵ��
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
     * ����carDate���Ե�ֵ��
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
     * ��ȡcarDeptBalance���Ե�ֵ��
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
     * ����carDeptBalance���Ե�ֵ��
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
     * ��ȡcarId���Ե�ֵ��
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
     * ����carId���Ե�ֵ��
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
     * ��ȡcarMile���Ե�ֵ��
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
     * ����carMile���Ե�ֵ��
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
     * ��ȡcarNakedPrice���Ե�ֵ��
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
     * ����carNakedPrice���Ե�ֵ��
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
     * ��ȡcarName���Ե�ֵ��
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
     * ����carName���Ե�ֵ��
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
     * ��ȡcarNum���Ե�ֵ��
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
     * ����carNum���Ե�ֵ��
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
     * ��ȡcarPrice���Ե�ֵ��
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
     * ����carPrice���Ե�ֵ��
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
     * ��ȡcarStyle���Ե�ֵ��
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
     * ����carStyle���Ե�ֵ��
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
     * ��ȡcarYear���Ե�ֵ��
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
     * ����carYear���Ե�ֵ��
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
     * ��ȡcertificate���Ե�ֵ��
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
     * ����certificate���Ե�ֵ��
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
     * ��ȡcommercialPledge���Ե�ֵ��
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
     * ����commercialPledge���Ե�ֵ��
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
     * ��ȡdrivcard���Ե�ֵ��
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
     * ����drivcard���Ե�ֵ��
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
     * ��ȡdrivingPledge���Ե�ֵ��
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
     * ����drivingPledge���Ե�ֵ��
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
     * ��ȡexpirationTime���Ե�ֵ��
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
     * ����expirationTime���Ե�ֵ��
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
     * ��ȡframeNum���Ե�ֵ��
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
     * ����frameNum���Ե�ֵ��
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
     * ��ȡhandoverDate���Ե�ֵ��
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
     * ����handoverDate���Ե�ֵ��
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
     * ��ȡidCardPledge���Ե�ֵ��
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
     * ����idCardPledge���Ե�ֵ��
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
     * ��ȡimportPledge���Ե�ֵ��
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
     * ����importPledge���Ե�ֵ��
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
     * ��ȡinsurancePledge���Ե�ֵ��
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
     * ����insurancePledge���Ե�ֵ��
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
     * ��ȡisHasCar���Ե�ֵ��
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
     * ����isHasCar���Ե�ֵ��
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
     * ��ȡkeyPledge���Ե�ֵ��
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
     * ����keyPledge���Ե�ֵ��
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
     * ��ȡoneYearLPADITF���Ե�ֵ��
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
     * ����oneYearLPADITF���Ե�ֵ��
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
     * ��ȡoriginalPledge���Ե�ֵ��
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
     * ����originalPledge���Ե�ֵ��
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
     * ��ȡotherPledge���Ե�ֵ��
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
     * ����otherPledge���Ե�ֵ��
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
     * ��ȡpaymentPledge���Ե�ֵ��
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
     * ����paymentPledge���Ե�ֵ��
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
     * ��ȡprice���Ե�ֵ��
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
     * ����price���Ե�ֵ��
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
     * ��ȡproductArea���Ե�ֵ��
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
     * ����productArea���Ե�ֵ��
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
     * ��ȡpurchasePledge���Ե�ֵ��
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
     * ����purchasePledge���Ե�ֵ��
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
     * ��ȡregCertPledge���Ե�ֵ��
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
     * ����regCertPledge���Ե�ֵ��
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
     * ��ȡregisterNumber���Ե�ֵ��
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
     * ����registerNumber���Ե�ֵ��
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
     * ��ȡsafeEndTime���Ե�ֵ��
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
     * ����safeEndTime���Ե�ֵ��
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
     * ��ȡsafeStartTime���Ե�ֵ��
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
     * ����safeStartTime���Ե�ֵ��
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
     * ��ȡvaluation���Ե�ֵ��
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
     * ����valuation���Ե�ֵ��
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
