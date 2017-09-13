
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>recordLoanRent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="recordLoanRent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agentAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentAddressCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentBankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentIDNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="landlordAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landlordAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landlordAddressCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landlordBankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landlordBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landlordEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landlordHomeAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landlordIDNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landlordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landlordPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landlordPhoneNum1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordLoanRent", propOrder = {
    "agentAccountName",
    "agentAccountNum",
    "agentAddressCode",
    "agentBankBranch",
    "agentBankName",
    "agentCompany",
    "agentEmail",
    "agentIDNum",
    "agentName",
    "agentPhoneNum",
    "appId",
    "contactId",
    "landlordAccountName",
    "landlordAccountNum",
    "landlordAddressCode",
    "landlordBankBranch",
    "landlordBankName",
    "landlordEmail",
    "landlordHomeAddress",
    "landlordIDNum",
    "landlordName",
    "landlordPhoneNum",
    "landlordPhoneNum1"
})
public class RecordLoanRent {

    protected String agentAccountName;
    protected String agentAccountNum;
    protected String agentAddressCode;
    protected String agentBankBranch;
    protected String agentBankName;
    protected String agentCompany;
    protected String agentEmail;
    protected String agentIDNum;
    protected String agentName;
    protected String agentPhoneNum;
    protected Integer appId;
    protected Integer contactId;
    protected String landlordAccountName;
    protected String landlordAccountNum;
    protected String landlordAddressCode;
    protected String landlordBankBranch;
    protected String landlordBankName;
    protected String landlordEmail;
    protected String landlordHomeAddress;
    protected String landlordIDNum;
    protected String landlordName;
    protected String landlordPhoneNum;
    protected String landlordPhoneNum1;

    /**
     * 获取agentAccountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentAccountName() {
        return agentAccountName;
    }

    /**
     * 设置agentAccountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentAccountName(String value) {
        this.agentAccountName = value;
    }

    /**
     * 获取agentAccountNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentAccountNum() {
        return agentAccountNum;
    }

    /**
     * 设置agentAccountNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentAccountNum(String value) {
        this.agentAccountNum = value;
    }

    /**
     * 获取agentAddressCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentAddressCode() {
        return agentAddressCode;
    }

    /**
     * 设置agentAddressCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentAddressCode(String value) {
        this.agentAddressCode = value;
    }

    /**
     * 获取agentBankBranch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentBankBranch() {
        return agentBankBranch;
    }

    /**
     * 设置agentBankBranch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentBankBranch(String value) {
        this.agentBankBranch = value;
    }

    /**
     * 获取agentBankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentBankName() {
        return agentBankName;
    }

    /**
     * 设置agentBankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentBankName(String value) {
        this.agentBankName = value;
    }

    /**
     * 获取agentCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCompany() {
        return agentCompany;
    }

    /**
     * 设置agentCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCompany(String value) {
        this.agentCompany = value;
    }

    /**
     * 获取agentEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentEmail() {
        return agentEmail;
    }

    /**
     * 设置agentEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentEmail(String value) {
        this.agentEmail = value;
    }

    /**
     * 获取agentIDNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentIDNum() {
        return agentIDNum;
    }

    /**
     * 设置agentIDNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentIDNum(String value) {
        this.agentIDNum = value;
    }

    /**
     * 获取agentName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * 设置agentName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * 获取agentPhoneNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentPhoneNum() {
        return agentPhoneNum;
    }

    /**
     * 设置agentPhoneNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentPhoneNum(String value) {
        this.agentPhoneNum = value;
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
     * 获取contactId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContactId() {
        return contactId;
    }

    /**
     * 设置contactId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContactId(Integer value) {
        this.contactId = value;
    }

    /**
     * 获取landlordAccountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordAccountName() {
        return landlordAccountName;
    }

    /**
     * 设置landlordAccountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordAccountName(String value) {
        this.landlordAccountName = value;
    }

    /**
     * 获取landlordAccountNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordAccountNum() {
        return landlordAccountNum;
    }

    /**
     * 设置landlordAccountNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordAccountNum(String value) {
        this.landlordAccountNum = value;
    }

    /**
     * 获取landlordAddressCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordAddressCode() {
        return landlordAddressCode;
    }

    /**
     * 设置landlordAddressCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordAddressCode(String value) {
        this.landlordAddressCode = value;
    }

    /**
     * 获取landlordBankBranch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordBankBranch() {
        return landlordBankBranch;
    }

    /**
     * 设置landlordBankBranch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordBankBranch(String value) {
        this.landlordBankBranch = value;
    }

    /**
     * 获取landlordBankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordBankName() {
        return landlordBankName;
    }

    /**
     * 设置landlordBankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordBankName(String value) {
        this.landlordBankName = value;
    }

    /**
     * 获取landlordEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordEmail() {
        return landlordEmail;
    }

    /**
     * 设置landlordEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordEmail(String value) {
        this.landlordEmail = value;
    }

    /**
     * 获取landlordHomeAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordHomeAddress() {
        return landlordHomeAddress;
    }

    /**
     * 设置landlordHomeAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordHomeAddress(String value) {
        this.landlordHomeAddress = value;
    }

    /**
     * 获取landlordIDNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordIDNum() {
        return landlordIDNum;
    }

    /**
     * 设置landlordIDNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordIDNum(String value) {
        this.landlordIDNum = value;
    }

    /**
     * 获取landlordName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordName() {
        return landlordName;
    }

    /**
     * 设置landlordName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordName(String value) {
        this.landlordName = value;
    }

    /**
     * 获取landlordPhoneNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordPhoneNum() {
        return landlordPhoneNum;
    }

    /**
     * 设置landlordPhoneNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordPhoneNum(String value) {
        this.landlordPhoneNum = value;
    }

    /**
     * 获取landlordPhoneNum1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordPhoneNum1() {
        return landlordPhoneNum1;
    }

    /**
     * 设置landlordPhoneNum1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordPhoneNum1(String value) {
        this.landlordPhoneNum1 = value;
    }

}
