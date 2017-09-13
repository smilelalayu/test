
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>lonPayMatch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="lonPayMatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lenderAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lenderAmt" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="lenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lenderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lenderPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="lenderStratDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lenderTerm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lonPayMatch", propOrder = {
    "lenderAccount",
    "lenderAmt",
    "lenderName",
    "lenderNo",
    "lenderPercent",
    "lenderStratDate",
    "lenderTerm"
})
public class LonPayMatch {

    protected String lenderAccount;
    protected float lenderAmt;
    protected String lenderName;
    protected String lenderNo;
    protected Float lenderPercent;
    protected String lenderStratDate;
    protected int lenderTerm;

    /**
     * 获取lenderAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderAccount() {
        return lenderAccount;
    }

    /**
     * 设置lenderAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderAccount(String value) {
        this.lenderAccount = value;
    }

    /**
     * 获取lenderAmt属性的值。
     * 
     */
    public float getLenderAmt() {
        return lenderAmt;
    }

    /**
     * 设置lenderAmt属性的值。
     * 
     */
    public void setLenderAmt(float value) {
        this.lenderAmt = value;
    }

    /**
     * 获取lenderName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderName() {
        return lenderName;
    }

    /**
     * 设置lenderName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderName(String value) {
        this.lenderName = value;
    }

    /**
     * 获取lenderNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderNo() {
        return lenderNo;
    }

    /**
     * 设置lenderNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderNo(String value) {
        this.lenderNo = value;
    }

    /**
     * 获取lenderPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLenderPercent() {
        return lenderPercent;
    }

    /**
     * 设置lenderPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLenderPercent(Float value) {
        this.lenderPercent = value;
    }

    /**
     * 获取lenderStratDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderStratDate() {
        return lenderStratDate;
    }

    /**
     * 设置lenderStratDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderStratDate(String value) {
        this.lenderStratDate = value;
    }

    /**
     * 获取lenderTerm属性的值。
     * 
     */
    public int getLenderTerm() {
        return lenderTerm;
    }

    /**
     * 设置lenderTerm属性的值。
     * 
     */
    public void setLenderTerm(int value) {
        this.lenderTerm = value;
    }

}
