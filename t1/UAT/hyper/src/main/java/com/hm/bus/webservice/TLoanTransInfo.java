
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>tLoanTransInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLoanTransInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="batchSeq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="lastUpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastUpUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ltiSeq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="origLtiSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="procSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="revsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="revsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="transDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="transNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="transSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLoanTransInfo", propOrder = {
    "appId",
    "batchSeq",
    "lastUpDt",
    "lastUpUser",
    "ltiSeq",
    "origLtiSeq",
    "procSts",
    "productId",
    "remark",
    "revsInd",
    "revsStatus",
    "transAmt",
    "transDate",
    "transNum",
    "transSts",
    "transTime",
    "transType"
})
public class TLoanTransInfo {

    protected Long appId;
    protected Long batchSeq;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpDt;
    protected String lastUpUser;
    protected Long ltiSeq;
    protected String origLtiSeq;
    protected String procSts;
    protected String productId;
    protected String remark;
    protected String revsInd;
    protected String revsStatus;
    protected Double transAmt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transDate;
    protected Integer transNum;
    protected String transSts;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transTime;
    protected String transType;

    /**
     * 获取appId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * 设置appId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAppId(Long value) {
        this.appId = value;
    }

    /**
     * 获取batchSeq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBatchSeq() {
        return batchSeq;
    }

    /**
     * 设置batchSeq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBatchSeq(Long value) {
        this.batchSeq = value;
    }

    /**
     * 获取lastUpDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpDt() {
        return lastUpDt;
    }

    /**
     * 设置lastUpDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpDt(XMLGregorianCalendar value) {
        this.lastUpDt = value;
    }

    /**
     * 获取lastUpUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpUser() {
        return lastUpUser;
    }

    /**
     * 设置lastUpUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpUser(String value) {
        this.lastUpUser = value;
    }

    /**
     * 获取ltiSeq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLtiSeq() {
        return ltiSeq;
    }

    /**
     * 设置ltiSeq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLtiSeq(Long value) {
        this.ltiSeq = value;
    }

    /**
     * 获取origLtiSeq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigLtiSeq() {
        return origLtiSeq;
    }

    /**
     * 设置origLtiSeq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigLtiSeq(String value) {
        this.origLtiSeq = value;
    }

    /**
     * 获取procSts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcSts() {
        return procSts;
    }

    /**
     * 设置procSts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcSts(String value) {
        this.procSts = value;
    }

    /**
     * 获取productId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置productId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * 获取remark属性的值。
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
     * 设置remark属性的值。
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
     * 获取revsInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevsInd() {
        return revsInd;
    }

    /**
     * 设置revsInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevsInd(String value) {
        this.revsInd = value;
    }

    /**
     * 获取revsStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevsStatus() {
        return revsStatus;
    }

    /**
     * 设置revsStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevsStatus(String value) {
        this.revsStatus = value;
    }

    /**
     * 获取transAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransAmt() {
        return transAmt;
    }

    /**
     * 设置transAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransAmt(Double value) {
        this.transAmt = value;
    }

    /**
     * 获取transDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransDate() {
        return transDate;
    }

    /**
     * 设置transDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransDate(XMLGregorianCalendar value) {
        this.transDate = value;
    }

    /**
     * 获取transNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransNum() {
        return transNum;
    }

    /**
     * 设置transNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransNum(Integer value) {
        this.transNum = value;
    }

    /**
     * 获取transSts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransSts() {
        return transSts;
    }

    /**
     * 设置transSts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransSts(String value) {
        this.transSts = value;
    }

    /**
     * 获取transTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransTime() {
        return transTime;
    }

    /**
     * 设置transTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransTime(XMLGregorianCalendar value) {
        this.transTime = value;
    }

    /**
     * 获取transType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransType() {
        return transType;
    }

    /**
     * 设置transType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransType(String value) {
        this.transType = value;
    }

}
