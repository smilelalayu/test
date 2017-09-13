
package com.hm.bus.webservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLoanApp58 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tLoanApp58"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ageGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="averageListAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="baseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashFloeList" type="{http://biz.webservice.macrosky.com/}cashFloe" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="certId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certIdFileList" type="{http://biz.webservice.macrosky.com/}certIdFile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expectAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="expectCarAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="houseLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localWorkExperience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthBasicIncomeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "tLoanApp58", propOrder = {
    "ageGroup",
    "averageListAmt",
    "baseDate",
    "cashFloeList",
    "certId",
    "certIdFileList",
    "company",
    "companyPhone",
    "companyType",
    "creator",
    "customerName",
    "customerSex",
    "duty",
    "email",
    "expectAmount",
    "expectCarAmount",
    "houseLocal",
    "localResidence",
    "localWorkExperience",
    "marry",
    "monthBasicIncomeAmt",
    "phone",
    "receiveBankCard",
    "receiveBranch",
    "receiveCountryCode",
    "receiveOpen",
    "recordLoanContact",
    "tloanCreditCheck58"
})
public class TLoanApp58 {

    protected String ageGroup;
    protected BigDecimal averageListAmt;
    protected String baseDate;
    @XmlElement(nillable = true)
    protected List<CashFloe> cashFloeList;
    protected String certId;
    @XmlElement(nillable = true)
    protected List<CertIdFile> certIdFileList;
    protected String company;
    protected String companyPhone;
    protected String companyType;
    protected String creator;
    protected String customerName;
    protected String customerSex;
    protected String duty;
    protected String email;
    protected BigDecimal expectAmount;
    protected BigDecimal expectCarAmount;
    protected String houseLocal;
    protected String localResidence;
    protected String localWorkExperience;
    protected String marry;
    protected BigDecimal monthBasicIncomeAmt;
    protected String phone;
    protected String receiveBankCard;
    protected String receiveBranch;
    protected String receiveCountryCode;
    protected String receiveOpen;
    @XmlElement(nillable = true)
    protected List<RecordLoanContact> recordLoanContact;
    @XmlElement(nillable = true)
    protected List<TloanCreditCheck58> tloanCreditCheck58;

    /**
     * ��ȡageGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeGroup() {
        return ageGroup;
    }

    /**
     * ����ageGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeGroup(String value) {
        this.ageGroup = value;
    }

    /**
     * ��ȡaverageListAmt���Ե�ֵ��
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
     * ����averageListAmt���Ե�ֵ��
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
     * ��ȡbaseDate���Ե�ֵ��
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
     * ����baseDate���Ե�ֵ��
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
     * Gets the value of the cashFloeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashFloeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashFloeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashFloe }
     * 
     * 
     */
    public List<CashFloe> getCashFloeList() {
        if (cashFloeList == null) {
            cashFloeList = new ArrayList<CashFloe>();
        }
        return this.cashFloeList;
    }

    /**
     * ��ȡcertId���Ե�ֵ��
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
     * ����certId���Ե�ֵ��
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
     * Gets the value of the certIdFileList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certIdFileList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertIdFileList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertIdFile }
     * 
     * 
     */
    public List<CertIdFile> getCertIdFileList() {
        if (certIdFileList == null) {
            certIdFileList = new ArrayList<CertIdFile>();
        }
        return this.certIdFileList;
    }

    /**
     * ��ȡcompany���Ե�ֵ��
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
     * ����company���Ե�ֵ��
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
     * ��ȡcompanyPhone���Ե�ֵ��
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
     * ����companyPhone���Ե�ֵ��
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
     * ��ȡcompanyType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * ����companyType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyType(String value) {
        this.companyType = value;
    }

    /**
     * ��ȡcreator���Ե�ֵ��
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
     * ����creator���Ե�ֵ��
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
     * ��ȡcustomerName���Ե�ֵ��
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
     * ����customerName���Ե�ֵ��
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
     * ��ȡcustomerSex���Ե�ֵ��
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
     * ����customerSex���Ե�ֵ��
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
     * ��ȡduty���Ե�ֵ��
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
     * ����duty���Ե�ֵ��
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
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * ��ȡexpectAmount���Ե�ֵ��
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
     * ����expectAmount���Ե�ֵ��
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
     * ��ȡexpectCarAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpectCarAmount() {
        return expectCarAmount;
    }

    /**
     * ����expectCarAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpectCarAmount(BigDecimal value) {
        this.expectCarAmount = value;
    }

    /**
     * ��ȡhouseLocal���Ե�ֵ��
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
     * ����houseLocal���Ե�ֵ��
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
     * ��ȡlocalResidence���Ե�ֵ��
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
     * ����localResidence���Ե�ֵ��
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
     * ��ȡlocalWorkExperience���Ե�ֵ��
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
     * ����localWorkExperience���Ե�ֵ��
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
     * ��ȡmarry���Ե�ֵ��
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
     * ����marry���Ե�ֵ��
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
     * ��ȡmonthBasicIncomeAmt���Ե�ֵ��
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
     * ����monthBasicIncomeAmt���Ե�ֵ��
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
     * ��ȡphone���Ե�ֵ��
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
     * ����phone���Ե�ֵ��
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
     * ��ȡreceiveBankCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveBankCard() {
        return receiveBankCard;
    }

    /**
     * ����receiveBankCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveBankCard(String value) {
        this.receiveBankCard = value;
    }

    /**
     * ��ȡreceiveBranch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveBranch() {
        return receiveBranch;
    }

    /**
     * ����receiveBranch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveBranch(String value) {
        this.receiveBranch = value;
    }

    /**
     * ��ȡreceiveCountryCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCountryCode() {
        return receiveCountryCode;
    }

    /**
     * ����receiveCountryCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCountryCode(String value) {
        this.receiveCountryCode = value;
    }

    /**
     * ��ȡreceiveOpen���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOpen() {
        return receiveOpen;
    }

    /**
     * ����receiveOpen���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOpen(String value) {
        this.receiveOpen = value;
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
