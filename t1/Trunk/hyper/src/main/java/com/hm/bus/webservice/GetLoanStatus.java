
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getLoanStatus complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getLoanStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransHead" type="{http://biz.webservice.macrosky.com/}transHead" minOccurs="0"/&gt;
 *         &lt;element name="TransBody" type="{http://biz.webservice.macrosky.com/}statusCondition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLoanStatus", propOrder = {
    "transHead",
    "transBody"
})
public class GetLoanStatus {

    @XmlElement(name = "TransHead")
    protected TransHead transHead;
    @XmlElement(name = "TransBody")
    protected StatusCondition transBody;

    /**
     * 获取transHead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransHead }
     *     
     */
    public TransHead getTransHead() {
        return transHead;
    }

    /**
     * 设置transHead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransHead }
     *     
     */
    public void setTransHead(TransHead value) {
        this.transHead = value;
    }

    /**
     * 获取transBody属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatusCondition }
     *     
     */
    public StatusCondition getTransBody() {
        return transBody;
    }

    /**
     * 设置transBody属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCondition }
     *     
     */
    public void setTransBody(StatusCondition value) {
        this.transBody = value;
    }

}
