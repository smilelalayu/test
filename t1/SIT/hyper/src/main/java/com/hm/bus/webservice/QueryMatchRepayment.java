
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryMatchRepayment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryMatchRepayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transHead" type="{http://biz.webservice.macrosky.com/}transHead" minOccurs="0"/&gt;
 *         &lt;element name="transBody" type="{http://biz.webservice.macrosky.com/}tmatchAppId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryMatchRepayment", propOrder = {
    "transHead",
    "transBody"
})
public class QueryMatchRepayment {

    protected TransHead transHead;
    protected TmatchAppId transBody;

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
     *     {@link TmatchAppId }
     *     
     */
    public TmatchAppId getTransBody() {
        return transBody;
    }

    /**
     * 设置transBody属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TmatchAppId }
     *     
     */
    public void setTransBody(TmatchAppId value) {
        this.transBody = value;
    }

}
