
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>pasInst complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="pasInst"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="instCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="instName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pasInst", propOrder = {
    "instCode",
    "instLevel",
    "instName",
    "upInst"
})
public class PasInst {

    protected String instCode;
    protected int instLevel;
    protected String instName;
    protected String upInst;

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
     * 获取instLevel属性的值。
     * 
     */
    public int getInstLevel() {
        return instLevel;
    }

    /**
     * 设置instLevel属性的值。
     * 
     */
    public void setInstLevel(int value) {
        this.instLevel = value;
    }

    /**
     * 获取instName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstName() {
        return instName;
    }

    /**
     * 设置instName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstName(String value) {
        this.instName = value;
    }

    /**
     * 获取upInst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpInst() {
        return upInst;
    }

    /**
     * 设置upInst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpInst(String value) {
        this.upInst = value;
    }

}
