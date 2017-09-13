
package com.hm.bus.webservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLoanAppInstallments complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLoanAppInstallments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageListAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="baseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expectAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="houseLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localWorkExperience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthBasicIncomeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordLoanContact" type="{http://biz.webservice.macrosky.com/}recordLoanContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tloanCreditCheck58" type="{http://biz.webservice.macrosky.com/}tloanCreditCheck58" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLoanAppInstallments", propOrder = {
    "averageListAmt",
    "baseDate",
    "certId",
    "company",
    "companyPhone",
    "creator",
    "customerName",
    "customerSex",
    "duty",
    "expectAmount",
    "houseLocal",
    "instCode",
    "localResidence",
    "localWorkExperience",
    "marry",
    "monthBasicIncomeAmt",
    "phone",
    "recordLoanContact",
    "tloanCreditCheck58"
})
public class TLoanAppInstallments {

    protected BigDecimal averageListAmt;
    protected String baseDate;
    protected String certId;
    protected String company;
    protected String companyPhone;
    protected String creator;
    protected String customerName;
    protected String customerSex;
    protected String duty;
    protected BigDecimal expectAmount;
    protected String houseLocal;
    protected String instCode;
    protected String localResidence;
    protected String localWorkExperience;
    protected String marry;
    protected BigDecimal monthBasicIncomeAmt;
    protected String phone;
    @XmlElement(nillable = true)
    protected List<RecordLoanContact> recordLoanContact;
    @XmlElement(nillable = true)
    protected List<TloanCreditCheck58> tloanCreditCheck58;

    /**
     * 获取averageListAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageListAmt() {
        return averageListAmt;
    }

    /**
     * 设置averageListAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageListAmt(BigDecimal value) {
        this.averageListAmt = value;
    }

    /**
     * 获取baseDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDate() {
        return baseDate;
    }

    /**
     * 设置baseDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDate(String value) {
        this.baseDate = value;
    }

    /**
     * 获取certId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * 设置certId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertId(String value) {
        this.certId = value;
    }

    /**
     * 获取company属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置company属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * 获取companyPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * 设置companyPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPhone(String value) {
        this.companyPhone = value;
    }

    /**
     * 获取creator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置creator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * 获取customerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置customerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * 获取customerSex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSex() {
        return customerSex;
    }

    /**
     * 设置customerSex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSex(String value) {
        this.customerSex = value;
    }

    /**
     * 获取duty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuty() {
        return duty;
    }

    /**
     * 设置duty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuty(String value) {
        this.duty = value;
    }

    /**
     * 获取expectAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpectAmount() {
        return expectAmount;
    }

    /**
     * 设置expectAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpectAmount(BigDecimal value) {
        this.expectAmount = value;
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
     * 获取instCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstCode() {
        return instCode;
    }

    /**
     * 设置instCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstCode(String value) {
        this.instCode = value;
    }

    /**
     * 获取localResidence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalResidence() {
        return localResidence;
    }

    /**
     * 设置localResidence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalResidence(String value) {
        this.localResidence = value;
    }

    /**
     * 获取localWorkExperience属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalWorkExperience() {
        return localWorkExperience;
    }

    /**
     * 设置localWorkExperience属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalWorkExperience(String value) {
        this.localWorkExperience = value;
    }

    /**
     * 获取marry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarry() {
        return marry;
    }

    /**
     * 设置marry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarry(String value) {
        this.marry = value;
    }

    /**
     * 获取monthBasicIncomeAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthBasicIncomeAmt() {
        return monthBasicIncomeAmt;
    }

    /**
     * 设置monthBasicIncomeAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthBasicIncomeAmt(BigDecimal value) {
        this.monthBasicIncomeAmt = value;
    }

    /**
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the recordLoanContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordLoanContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordLoanContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordLoanContact }
     * 
     * 
     */
    public List<RecordLoanContact> getRecordLoanContact() {
        if (recordLoanContact == null) {
            recordLoanContact = new ArrayList<RecordLoanContact>();
        }
        return this.recordLoanContact;
    }

    /**
     * Gets the value of the tloanCreditCheck58 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tloanCreditCheck58 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTloanCreditCheck58().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TloanCreditCheck58 }
     * 
     * 
     */
    public List<TloanCreditCheck58> getTloanCreditCheck58() {
        if (tloanCreditCheck58 == null) {
            tloanCreditCheck58 = new ArrayList<TloanCreditCheck58>();
        }
        return this.tloanCreditCheck58;
    }

}
