
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>doVehicleRecive complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="doVehicleRecive"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransHead" type="{http://biz.webservice.macrosky.com/}transHead" minOccurs="0"/&gt;
 *         &lt;element name="TransBody" type="{http://biz.webservice.macrosky.com/}carInfo58" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doVehicleRecive", propOrder = {
    "transHead",
    "transBody"
})
public class DoVehicleRecive {

    @XmlElement(name = "TransHead")
    protected TransHead transHead;
    @XmlElement(name = "TransBody")
    protected CarInfo58 transBody;

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
     *     {@link CarInfo58 }
     *     
     */
    public CarInfo58 getTransBody() {
        return transBody;
    }

    /**
     * 设置transBody属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarInfo58 }
     *     
     */
    public void setTransBody(CarInfo58 value) {
        this.transBody = value;
    }

}
