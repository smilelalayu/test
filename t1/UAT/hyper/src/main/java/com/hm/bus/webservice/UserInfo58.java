
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>userInfo58 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="userInfo58"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="age_group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="baseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardLines" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expectAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="expectCarAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="hasOverdue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthlyExpenses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="monthlyIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="residenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalLoan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="workExperience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInfo58", propOrder = {
    "ageGroup",
    "baseDate",
    "companyType",
    "creditCardLines",
    "creditNum",
    "customerSex",
    "expectAmount",
    "expectCarAmount",
    "hasOverdue",
    "houseProperty",
    "marry",
    "monthlyExpenses",
    "monthlyIncome",
    "residenceDate",
    "totalLoan",
    "workExperience",
    "workPost"
})
public class UserInfo58 {

    @XmlElement(name = "age_group")
    protected String ageGroup;
    protected String baseDate;
    protected String companyType;
    protected BigDecimal creditCardLines;
    protected String creditNum;
    protected String customerSex;
    protected BigDecimal expectAmount;
    protected BigDecimal expectCarAmount;
    protected String hasOverdue;
    protected String houseProperty;
    protected String marry;
    protected BigDecimal monthlyExpenses;
    protected BigDecimal monthlyIncome;
    protected String residenceDate;
    protected BigDecimal totalLoan;
    protected String workExperience;
    protected String workPost;

    /**
     * 获取ageGroup属性的值。
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
     * 设置ageGroup属性的值。
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
     * 获取companyType属性的值。
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
     * 设置companyType属性的值。
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
     * 获取creditCardLines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditCardLines() {
        return creditCardLines;
    }

    /**
     * 设置creditCardLines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditCardLines(BigDecimal value) {
        this.creditCardLines = value;
    }

    /**
     * 获取creditNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditNum() {
        return creditNum;
    }

    /**
     * 设置creditNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditNum(String value) {
        this.creditNum = value;
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
     * 获取expectCarAmount属性的值。
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
     * 设置expectCarAmount属性的值。
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
     * 获取hasOverdue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasOverdue() {
        return hasOverdue;
    }

    /**
     * 设置hasOverdue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasOverdue(String value) {
        this.hasOverdue = value;
    }

    /**
     * 获取houseProperty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseProperty() {
        return houseProperty;
    }

    /**
     * 设置houseProperty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseProperty(String value) {
        this.houseProperty = value;
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
     * 获取monthlyExpenses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlyExpenses() {
        return monthlyExpenses;
    }

    /**
     * 设置monthlyExpenses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlyExpenses(BigDecimal value) {
        this.monthlyExpenses = value;
    }

    /**
     * 获取monthlyIncome属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    /**
     * 设置monthlyIncome属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlyIncome(BigDecimal value) {
        this.monthlyIncome = value;
    }

    /**
     * 获取residenceDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceDate() {
        return residenceDate;
    }

    /**
     * 设置residenceDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceDate(String value) {
        this.residenceDate = value;
    }

    /**
     * 获取totalLoan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLoan() {
        return totalLoan;
    }

    /**
     * 设置totalLoan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLoan(BigDecimal value) {
        this.totalLoan = value;
    }

    /**
     * 获取workExperience属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkExperience() {
        return workExperience;
    }

    /**
     * 设置workExperience属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkExperience(String value) {
        this.workExperience = value;
    }

    /**
     * 获取workPost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPost() {
        return workPost;
    }

    /**
     * 设置workPost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPost(String value) {
        this.workPost = value;
    }

}
