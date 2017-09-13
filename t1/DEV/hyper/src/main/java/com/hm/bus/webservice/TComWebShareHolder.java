
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tComWebShareHolder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tComWebShareHolder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contributiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contributiveFund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gdlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qwId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="rjczfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sjcze" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjczfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjczrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zzzjhm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zzzjlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tComWebShareHolder", propOrder = {
    "contributiveDate",
    "contributiveFund",
    "createTime",
    "gdlx",
    "name",
    "qwId",
    "rjczfs",
    "shId",
    "sjcze",
    "sjczfs",
    "sjczrq",
    "zzzjhm",
    "zzzjlx"
})
public class TComWebShareHolder {

    protected String contributiveDate;
    protected String contributiveFund;
    protected String createTime;
    protected String gdlx;
    protected String name;
    protected Long qwId;
    protected String rjczfs;
    protected Long shId;
    protected String sjcze;
    protected String sjczfs;
    protected String sjczrq;
    protected String zzzjhm;
    protected String zzzjlx;

    /**
     * 获取contributiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributiveDate() {
        return contributiveDate;
    }

    /**
     * 设置contributiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributiveDate(String value) {
        this.contributiveDate = value;
    }

    /**
     * 获取contributiveFund属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributiveFund() {
        return contributiveFund;
    }

    /**
     * 设置contributiveFund属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributiveFund(String value) {
        this.contributiveFund = value;
    }

    /**
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * 获取gdlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGdlx() {
        return gdlx;
    }

    /**
     * 设置gdlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGdlx(String value) {
        this.gdlx = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取qwId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQwId() {
        return qwId;
    }

    /**
     * 设置qwId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQwId(Long value) {
        this.qwId = value;
    }

    /**
     * 获取rjczfs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjczfs() {
        return rjczfs;
    }

    /**
     * 设置rjczfs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjczfs(String value) {
        this.rjczfs = value;
    }

    /**
     * 获取shId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShId() {
        return shId;
    }

    /**
     * 设置shId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShId(Long value) {
        this.shId = value;
    }

    /**
     * 获取sjcze属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjcze() {
        return sjcze;
    }

    /**
     * 设置sjcze属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjcze(String value) {
        this.sjcze = value;
    }

    /**
     * 获取sjczfs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjczfs() {
        return sjczfs;
    }

    /**
     * 设置sjczfs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjczfs(String value) {
        this.sjczfs = value;
    }

    /**
     * 获取sjczrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjczrq() {
        return sjczrq;
    }

    /**
     * 设置sjczrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjczrq(String value) {
        this.sjczrq = value;
    }

    /**
     * 获取zzzjhm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzzjhm() {
        return zzzjhm;
    }

    /**
     * 设置zzzjhm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzzjhm(String value) {
        this.zzzjhm = value;
    }

    /**
     * 获取zzzjlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzzjlx() {
        return zzzjlx;
    }

    /**
     * 设置zzzjlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzzjlx(String value) {
        this.zzzjlx = value;
    }

}
