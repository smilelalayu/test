
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>transHead complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="transHead"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fromSort" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="retCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toSort" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="transExeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transExeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "transHead", propOrder = {
    "fromSort",
    "retCode",
    "retMsg",
    "sourceClient",
    "toSort",
    "transExeDate",
    "transExeTime",
    "transSerialNo",
    "transType"
})
public class TransHead {

    protected int fromSort;
    protected String retCode;
    protected String retMsg;
    protected String sourceClient;
    protected int toSort;
    protected String transExeDate;
    protected String transExeTime;
    protected String transSerialNo;
    protected String transType;

    /**
     * 获取fromSort属性的值。
     * 
     */
    public int getFromSort() {
        return fromSort;
    }

    /**
     * 设置fromSort属性的值。
     * 
     */
    public void setFromSort(int value) {
        this.fromSort = value;
    }

    /**
     * 获取retCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetCode() {
        return retCode;
    }

    /**
     * 设置retCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetCode(String value) {
        this.retCode = value;
    }

    /**
     * 获取retMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetMsg() {
        return retMsg;
    }

    /**
     * 设置retMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetMsg(String value) {
        this.retMsg = value;
    }

    /**
     * 获取sourceClient属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceClient() {
        return sourceClient;
    }

    /**
     * 设置sourceClient属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceClient(String value) {
        this.sourceClient = value;
    }

    /**
     * 获取toSort属性的值。
     * 
     */
    public int getToSort() {
        return toSort;
    }

    /**
     * 设置toSort属性的值。
     * 
     */
    public void setToSort(int value) {
        this.toSort = value;
    }

    /**
     * 获取transExeDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransExeDate() {
        return transExeDate;
    }

    /**
     * 设置transExeDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransExeDate(String value) {
        this.transExeDate = value;
    }

    /**
     * 获取transExeTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransExeTime() {
        return transExeTime;
    }

    /**
     * 设置transExeTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransExeTime(String value) {
        this.transExeTime = value;
    }

    /**
     * 获取transSerialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransSerialNo() {
        return transSerialNo;
    }

    /**
     * 设置transSerialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransSerialNo(String value) {
        this.transSerialNo = value;
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
