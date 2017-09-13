
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationPurchase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationPurchase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="buildingId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="buildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="downPayment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="fdAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fdAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fdBankAddressCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fdBankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fdBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fdCertid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fdPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fdProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseArea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="houseId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="houseLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="peopleLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="perSquareMeterPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="purchaseId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyPlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ysxId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationPurchase", propOrder = {
    "appId",
    "buildingId",
    "buildingName",
    "buyAmt",
    "companyName",
    "downPayment",
    "fdAccountName",
    "fdAccountNum",
    "fdBankAddressCode",
    "fdBankBranch",
    "fdBankName",
    "fdCertid",
    "fdName",
    "fdPhone",
    "fdProvince",
    "houseAddress",
    "houseArea",
    "houseId",
    "houseLocal",
    "peopleLocal",
    "perSquareMeterPrice",
    "purchaseId",
    "thirdPartyPlatform",
    "ysxId"
})
public class TLonApplicationPurchase {

    protected Integer appId;
    protected Integer buildingId;
    protected String buildingName;
    protected BigDecimal buyAmt;
    protected String companyName;
    protected BigDecimal downPayment;
    protected String fdAccountName;
    protected String fdAccountNum;
    protected String fdBankAddressCode;
    protected String fdBankBranch;
    protected String fdBankName;
    protected String fdCertid;
    protected String fdName;
    protected String fdPhone;
    protected String fdProvince;
    protected String houseAddress;
    protected Integer houseArea;
    protected Integer houseId;
    protected String houseLocal;
    protected String peopleLocal;
    protected BigDecimal perSquareMeterPrice;
    protected Integer purchaseId;
    protected String thirdPartyPlatform;
    protected Integer ysxId;

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
     * 获取buildingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuildingId() {
        return buildingId;
    }

    /**
     * 设置buildingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuildingId(Integer value) {
        this.buildingId = value;
    }

    /**
     * 获取buildingName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * 设置buildingName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingName(String value) {
        this.buildingName = value;
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
     * 获取companyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置companyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * 获取downPayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDownPayment() {
        return downPayment;
    }

    /**
     * 设置downPayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDownPayment(BigDecimal value) {
        this.downPayment = value;
    }

    /**
     * 获取fdAccountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdAccountName() {
        return fdAccountName;
    }

    /**
     * 设置fdAccountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdAccountName(String value) {
        this.fdAccountName = value;
    }

    /**
     * 获取fdAccountNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdAccountNum() {
        return fdAccountNum;
    }

    /**
     * 设置fdAccountNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdAccountNum(String value) {
        this.fdAccountNum = value;
    }

    /**
     * 获取fdBankAddressCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdBankAddressCode() {
        return fdBankAddressCode;
    }

    /**
     * 设置fdBankAddressCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdBankAddressCode(String value) {
        this.fdBankAddressCode = value;
    }

    /**
     * 获取fdBankBranch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdBankBranch() {
        return fdBankBranch;
    }

    /**
     * 设置fdBankBranch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdBankBranch(String value) {
        this.fdBankBranch = value;
    }

    /**
     * 获取fdBankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdBankName() {
        return fdBankName;
    }

    /**
     * 设置fdBankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdBankName(String value) {
        this.fdBankName = value;
    }

    /**
     * 获取fdCertid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdCertid() {
        return fdCertid;
    }

    /**
     * 设置fdCertid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdCertid(String value) {
        this.fdCertid = value;
    }

    /**
     * 获取fdName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdName() {
        return fdName;
    }

    /**
     * 设置fdName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdName(String value) {
        this.fdName = value;
    }

    /**
     * 获取fdPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdPhone() {
        return fdPhone;
    }

    /**
     * 设置fdPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdPhone(String value) {
        this.fdPhone = value;
    }

    /**
     * 获取fdProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdProvince() {
        return fdProvince;
    }

    /**
     * 设置fdProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdProvince(String value) {
        this.fdProvince = value;
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
     * 获取houseArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHouseArea() {
        return houseArea;
    }

    /**
     * 设置houseArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHouseArea(Integer value) {
        this.houseArea = value;
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
     * 获取houseLocal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseLocal() {
        return houseLocal;
    }

    /**
     * 设置houseLocal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseLocal(String value) {
        this.houseLocal = value;
    }

    /**
     * 获取peopleLocal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeopleLocal() {
        return peopleLocal;
    }

    /**
     * 设置peopleLocal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeopleLocal(String value) {
        this.peopleLocal = value;
    }

    /**
     * 获取perSquareMeterPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerSquareMeterPrice() {
        return perSquareMeterPrice;
    }

    /**
     * 设置perSquareMeterPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerSquareMeterPrice(BigDecimal value) {
        this.perSquareMeterPrice = value;
    }

    /**
     * 获取purchaseId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurchaseId() {
        return purchaseId;
    }

    /**
     * 设置purchaseId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurchaseId(Integer value) {
        this.purchaseId = value;
    }

    /**
     * 获取thirdPartyPlatform属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyPlatform() {
        return thirdPartyPlatform;
    }

    /**
     * 设置thirdPartyPlatform属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyPlatform(String value) {
        this.thirdPartyPlatform = value;
    }

    /**
     * 获取ysxId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYsxId() {
        return ysxId;
    }

    /**
     * 设置ysxId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYsxId(Integer value) {
        this.ysxId = value;
    }

}
