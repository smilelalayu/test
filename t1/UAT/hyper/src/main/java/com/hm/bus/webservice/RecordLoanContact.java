
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>recordLoanContact complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="recordLoanContact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactCertId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactIsKnow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactQq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactResidePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordLoanContact", propOrder = {
    "contactCertId",
    "contactEMail",
    "contactIsKnow",
    "contactName",
    "contactPhone",
    "contactQq",
    "contactRelation",
    "contactRemark",
    "contactResidePhone",
    "contactSex",
    "contactType",
    "guarantorType"
})
public class RecordLoanContact {

    protected String contactCertId;
    protected String contactEMail;
    protected String contactIsKnow;
    protected String contactName;
    protected String contactPhone;
    protected String contactQq;
    protected String contactRelation;
    protected String contactRemark;
    protected String contactResidePhone;
    protected String contactSex;
    protected String contactType;
    protected String guarantorType;

    /**
     * 获取contactCertId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactCertId() {
        return contactCertId;
    }

    /**
     * 设置contactCertId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactCertId(String value) {
        this.contactCertId = value;
    }

    /**
     * 获取contactEMail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEMail() {
        return contactEMail;
    }

    /**
     * 设置contactEMail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEMail(String value) {
        this.contactEMail = value;
    }

    /**
     * 获取contactIsKnow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactIsKnow() {
        return contactIsKnow;
    }

    /**
     * 设置contactIsKnow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactIsKnow(String value) {
        this.contactIsKnow = value;
    }

    /**
     * 获取contactName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置contactName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * 获取contactPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置contactPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * 获取contactQq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactQq() {
        return contactQq;
    }

    /**
     * 设置contactQq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactQq(String value) {
        this.contactQq = value;
    }

    /**
     * 获取contactRelation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRelation() {
        return contactRelation;
    }

    /**
     * 设置contactRelation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRelation(String value) {
        this.contactRelation = value;
    }

    /**
     * 获取contactRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRemark() {
        return contactRemark;
    }

    /**
     * 设置contactRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRemark(String value) {
        this.contactRemark = value;
    }

    /**
     * 获取contactResidePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactResidePhone() {
        return contactResidePhone;
    }

    /**
     * 设置contactResidePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactResidePhone(String value) {
        this.contactResidePhone = value;
    }

    /**
     * 获取contactSex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSex() {
        return contactSex;
    }

    /**
     * 设置contactSex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSex(String value) {
        this.contactSex = value;
    }

    /**
     * 获取contactType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * 设置contactType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * 获取guarantorType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorType() {
        return guarantorType;
    }

    /**
     * 设置guarantorType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorType(String value) {
        this.guarantorType = value;
    }

}
