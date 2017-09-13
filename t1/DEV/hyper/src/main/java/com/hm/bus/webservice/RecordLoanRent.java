
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>recordLoanRent complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡagentAccountName���Ե�ֵ��
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
     * ����agentAccountName���Ե�ֵ��
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
     * ��ȡagentAccountNum���Ե�ֵ��
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
     * ����agentAccountNum���Ե�ֵ��
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
     * ��ȡagentAddressCode���Ե�ֵ��
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
     * ����agentAddressCode���Ե�ֵ��
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
     * ��ȡagentBankBranch���Ե�ֵ��
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
     * ����agentBankBranch���Ե�ֵ��
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
     * ��ȡagentBankName���Ե�ֵ��
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
     * ����agentBankName���Ե�ֵ��
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
     * ��ȡagentCompany���Ե�ֵ��
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
     * ����agentCompany���Ե�ֵ��
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
     * ��ȡagentEmail���Ե�ֵ��
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
     * ����agentEmail���Ե�ֵ��
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
     * ��ȡagentIDNum���Ե�ֵ��
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
     * ����agentIDNum���Ե�ֵ��
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
     * ��ȡagentName���Ե�ֵ��
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
     * ����agentName���Ե�ֵ��
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
     * ��ȡagentPhoneNum���Ե�ֵ��
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
     * ����agentPhoneNum���Ե�ֵ��
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
     * ��ȡcontactId���Ե�ֵ��
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
     * ����contactId���Ե�ֵ��
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
     * ��ȡlandlordAccountName���Ե�ֵ��
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
     * ����landlordAccountName���Ե�ֵ��
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
     * ��ȡlandlordAccountNum���Ե�ֵ��
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
     * ����landlordAccountNum���Ե�ֵ��
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
     * ��ȡlandlordAddressCode���Ե�ֵ��
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
     * ����landlordAddressCode���Ե�ֵ��
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
     * ��ȡlandlordBankBranch���Ե�ֵ��
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
     * ����landlordBankBranch���Ե�ֵ��
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
     * ��ȡlandlordBankName���Ե�ֵ��
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
     * ����landlordBankName���Ե�ֵ��
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
     * ��ȡlandlordEmail���Ե�ֵ��
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
     * ����landlordEmail���Ե�ֵ��
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
     * ��ȡlandlordHomeAddress���Ե�ֵ��
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
     * ����landlordHomeAddress���Ե�ֵ��
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
     * ��ȡlandlordIDNum���Ե�ֵ��
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
     * ����landlordIDNum���Ե�ֵ��
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
     * ��ȡlandlordName���Ե�ֵ��
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
     * ����landlordName���Ե�ֵ��
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
     * ��ȡlandlordPhoneNum���Ե�ֵ��
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
     * ����landlordPhoneNum���Ե�ֵ��
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
     * ��ȡlandlordPhoneNum1���Ե�ֵ��
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
     * ����landlordPhoneNum1���Ե�ֵ��
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
