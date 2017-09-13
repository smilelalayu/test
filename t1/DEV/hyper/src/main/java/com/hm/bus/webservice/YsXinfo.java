
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ysXinfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ysXinfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="businessAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="certId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="childSchisNative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comCarSituation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comIncomeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comRegistAdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyFoundTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="customerFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="haveCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="haveLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isIndigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kinCertId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kinPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="licenceNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="liveAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mateCertId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ownerHasBadhadit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repaymentBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repaymentBankNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repaymentMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salaryDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salaryWay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="socialSecurityCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="socialSecurityCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="subBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="validityTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ysxAdvicePosition" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ysxId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ysxRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ysXinfo", propOrder = {
    "appayAmt",
    "businessAmt",
    "certId",
    "childSchisNative",
    "comCarSituation",
    "comIncomeTime",
    "comRegistAdd",
    "companyAddress",
    "companyFoundTime",
    "companyName",
    "companyPhone",
    "companyType",
    "customerAge",
    "customerFrom",
    "customerName",
    "customerProperty",
    "customerSex",
    "customerType",
    "degree",
    "duty",
    "hasChild",
    "haveCredit",
    "haveLicense",
    "intustry",
    "isIndigen",
    "kinCertId",
    "kinName",
    "kinPhoneNumber",
    "licenceNum",
    "liveAddress",
    "loanPurpose",
    "marry",
    "mateCertId",
    "mateName",
    "otherRevenue",
    "ownerHasBadhadit",
    "phoneNumber",
    "postAddress",
    "registAddress",
    "registerNum",
    "remark",
    "repaymentBank",
    "repaymentBankNumber",
    "repaymentMan",
    "salaryDay",
    "salaryWay",
    "socialSecurityCity",
    "socialSecurityCost",
    "subBank",
    "timeLimit",
    "validityTime",
    "ysxAdvicePosition",
    "ysxId",
    "ysxRemark"
})
public class YsXinfo {

    protected BigDecimal appayAmt;
    protected BigDecimal businessAmt;
    protected String certId;
    protected String childSchisNative;
    protected String comCarSituation;
    protected String comIncomeTime;
    protected String comRegistAdd;
    protected String companyAddress;
    protected String companyFoundTime;
    protected String companyName;
    protected String companyPhone;
    protected String companyType;
    protected Integer customerAge;
    protected String customerFrom;
    protected String customerName;
    protected String customerProperty;
    protected String customerSex;
    protected String customerType;
    protected String degree;
    protected String duty;
    protected String hasChild;
    protected String haveCredit;
    protected String haveLicense;
    protected String intustry;
    protected String isIndigen;
    protected String kinCertId;
    protected String kinName;
    protected String kinPhoneNumber;
    protected String licenceNum;
    protected String liveAddress;
    protected String loanPurpose;
    protected String marry;
    protected String mateCertId;
    protected String mateName;
    protected BigDecimal otherRevenue;
    protected String ownerHasBadhadit;
    protected String phoneNumber;
    protected String postAddress;
    protected String registAddress;
    protected String registerNum;
    protected String remark;
    protected String repaymentBank;
    protected String repaymentBankNumber;
    protected String repaymentMan;
    protected String salaryDay;
    protected String salaryWay;
    protected String socialSecurityCity;
    protected BigDecimal socialSecurityCost;
    protected String subBank;
    protected Integer timeLimit;
    protected String validityTime;
    protected BigDecimal ysxAdvicePosition;
    protected Integer ysxId;
    protected String ysxRemark;

    /**
     * ��ȡappayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppayAmt() {
        return appayAmt;
    }

    /**
     * ����appayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppayAmt(BigDecimal value) {
        this.appayAmt = value;
    }

    /**
     * ��ȡbusinessAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBusinessAmt() {
        return businessAmt;
    }

    /**
     * ����businessAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBusinessAmt(BigDecimal value) {
        this.businessAmt = value;
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
     * ��ȡchildSchisNative���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildSchisNative() {
        return childSchisNative;
    }

    /**
     * ����childSchisNative���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildSchisNative(String value) {
        this.childSchisNative = value;
    }

    /**
     * ��ȡcomCarSituation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComCarSituation() {
        return comCarSituation;
    }

    /**
     * ����comCarSituation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComCarSituation(String value) {
        this.comCarSituation = value;
    }

    /**
     * ��ȡcomIncomeTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComIncomeTime() {
        return comIncomeTime;
    }

    /**
     * ����comIncomeTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComIncomeTime(String value) {
        this.comIncomeTime = value;
    }

    /**
     * ��ȡcomRegistAdd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComRegistAdd() {
        return comRegistAdd;
    }

    /**
     * ����comRegistAdd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComRegistAdd(String value) {
        this.comRegistAdd = value;
    }

    /**
     * ��ȡcompanyAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * ����companyAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddress(String value) {
        this.companyAddress = value;
    }

    /**
     * ��ȡcompanyFoundTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyFoundTime() {
        return companyFoundTime;
    }

    /**
     * ����companyFoundTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyFoundTime(String value) {
        this.companyFoundTime = value;
    }

    /**
     * ��ȡcompanyName���Ե�ֵ��
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
     * ����companyName���Ե�ֵ��
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
     * ��ȡcustomerAge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerAge() {
        return customerAge;
    }

    /**
     * ����customerAge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerAge(Integer value) {
        this.customerAge = value;
    }

    /**
     * ��ȡcustomerFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFrom() {
        return customerFrom;
    }

    /**
     * ����customerFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFrom(String value) {
        this.customerFrom = value;
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
     * ��ȡcustomerProperty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProperty() {
        return customerProperty;
    }

    /**
     * ����customerProperty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProperty(String value) {
        this.customerProperty = value;
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
     * ��ȡcustomerType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * ����customerType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * ��ȡdegree���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegree() {
        return degree;
    }

    /**
     * ����degree���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegree(String value) {
        this.degree = value;
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
     * ��ȡhasChild���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasChild() {
        return hasChild;
    }

    /**
     * ����hasChild���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasChild(String value) {
        this.hasChild = value;
    }

    /**
     * ��ȡhaveCredit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaveCredit() {
        return haveCredit;
    }

    /**
     * ����haveCredit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaveCredit(String value) {
        this.haveCredit = value;
    }

    /**
     * ��ȡhaveLicense���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaveLicense() {
        return haveLicense;
    }

    /**
     * ����haveLicense���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaveLicense(String value) {
        this.haveLicense = value;
    }

    /**
     * ��ȡintustry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntustry() {
        return intustry;
    }

    /**
     * ����intustry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntustry(String value) {
        this.intustry = value;
    }

    /**
     * ��ȡisIndigen���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIndigen() {
        return isIndigen;
    }

    /**
     * ����isIndigen���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIndigen(String value) {
        this.isIndigen = value;
    }

    /**
     * ��ȡkinCertId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKinCertId() {
        return kinCertId;
    }

    /**
     * ����kinCertId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKinCertId(String value) {
        this.kinCertId = value;
    }

    /**
     * ��ȡkinName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKinName() {
        return kinName;
    }

    /**
     * ����kinName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKinName(String value) {
        this.kinName = value;
    }

    /**
     * ��ȡkinPhoneNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKinPhoneNumber() {
        return kinPhoneNumber;
    }

    /**
     * ����kinPhoneNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKinPhoneNumber(String value) {
        this.kinPhoneNumber = value;
    }

    /**
     * ��ȡlicenceNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenceNum() {
        return licenceNum;
    }

    /**
     * ����licenceNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenceNum(String value) {
        this.licenceNum = value;
    }

    /**
     * ��ȡliveAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiveAddress() {
        return liveAddress;
    }

    /**
     * ����liveAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiveAddress(String value) {
        this.liveAddress = value;
    }

    /**
     * ��ȡloanPurpose���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * ����loanPurpose���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurpose(String value) {
        this.loanPurpose = value;
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
     * ��ȡmateCertId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMateCertId() {
        return mateCertId;
    }

    /**
     * ����mateCertId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMateCertId(String value) {
        this.mateCertId = value;
    }

    /**
     * ��ȡmateName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMateName() {
        return mateName;
    }

    /**
     * ����mateName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMateName(String value) {
        this.mateName = value;
    }

    /**
     * ��ȡotherRevenue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherRevenue() {
        return otherRevenue;
    }

    /**
     * ����otherRevenue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherRevenue(BigDecimal value) {
        this.otherRevenue = value;
    }

    /**
     * ��ȡownerHasBadhadit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerHasBadhadit() {
        return ownerHasBadhadit;
    }

    /**
     * ����ownerHasBadhadit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerHasBadhadit(String value) {
        this.ownerHasBadhadit = value;
    }

    /**
     * ��ȡphoneNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * ����phoneNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * ��ȡpostAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress() {
        return postAddress;
    }

    /**
     * ����postAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress(String value) {
        this.postAddress = value;
    }

    /**
     * ��ȡregistAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistAddress() {
        return registAddress;
    }

    /**
     * ����registAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistAddress(String value) {
        this.registAddress = value;
    }

    /**
     * ��ȡregisterNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterNum() {
        return registerNum;
    }

    /**
     * ����registerNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterNum(String value) {
        this.registerNum = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * ��ȡrepaymentBank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentBank() {
        return repaymentBank;
    }

    /**
     * ����repaymentBank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentBank(String value) {
        this.repaymentBank = value;
    }

    /**
     * ��ȡrepaymentBankNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentBankNumber() {
        return repaymentBankNumber;
    }

    /**
     * ����repaymentBankNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentBankNumber(String value) {
        this.repaymentBankNumber = value;
    }

    /**
     * ��ȡrepaymentMan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentMan() {
        return repaymentMan;
    }

    /**
     * ����repaymentMan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentMan(String value) {
        this.repaymentMan = value;
    }

    /**
     * ��ȡsalaryDay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryDay() {
        return salaryDay;
    }

    /**
     * ����salaryDay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryDay(String value) {
        this.salaryDay = value;
    }

    /**
     * ��ȡsalaryWay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryWay() {
        return salaryWay;
    }

    /**
     * ����salaryWay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryWay(String value) {
        this.salaryWay = value;
    }

    /**
     * ��ȡsocialSecurityCity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityCity() {
        return socialSecurityCity;
    }

    /**
     * ����socialSecurityCity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityCity(String value) {
        this.socialSecurityCity = value;
    }

    /**
     * ��ȡsocialSecurityCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSocialSecurityCost() {
        return socialSecurityCost;
    }

    /**
     * ����socialSecurityCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSocialSecurityCost(BigDecimal value) {
        this.socialSecurityCost = value;
    }

    /**
     * ��ȡsubBank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBank() {
        return subBank;
    }

    /**
     * ����subBank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBank(String value) {
        this.subBank = value;
    }

    /**
     * ��ȡtimeLimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeLimit() {
        return timeLimit;
    }

    /**
     * ����timeLimit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeLimit(Integer value) {
        this.timeLimit = value;
    }

    /**
     * ��ȡvalidityTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityTime() {
        return validityTime;
    }

    /**
     * ����validityTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityTime(String value) {
        this.validityTime = value;
    }

    /**
     * ��ȡysxAdvicePosition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYsxAdvicePosition() {
        return ysxAdvicePosition;
    }

    /**
     * ����ysxAdvicePosition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYsxAdvicePosition(BigDecimal value) {
        this.ysxAdvicePosition = value;
    }

    /**
     * ��ȡysxId���Ե�ֵ��
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
     * ����ysxId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYsxId(Integer value) {
        this.ysxId = value;
    }

    /**
     * ��ȡysxRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsxRemark() {
        return ysxRemark;
    }

    /**
     * ����ysxRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsxRemark(String value) {
        this.ysxRemark = value;
    }

}
