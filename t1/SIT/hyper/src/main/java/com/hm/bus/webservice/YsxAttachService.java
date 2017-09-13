
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ysxAttachService complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ysxAttachService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://biz.webservice.macrosky.com/}transHead" minOccurs="0"/&gt;
 *         &lt;element name="arg1" type="{http://biz.webservice.macrosky.com/}webYsxAttach" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ysxAttachService", propOrder = {
    "arg0",
    "arg1"
})
public class YsxAttachService {

    protected TransHead arg0;
    protected WebYsxAttach arg1;

    /**
     * 获取arg0属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransHead }
     *     
     */
    public TransHead getArg0() {
        return arg0;
    }

    /**
     * 设置arg0属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransHead }
     *     
     */
    public void setArg0(TransHead value) {
        this.arg0 = value;
    }

    /**
     * 获取arg1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WebYsxAttach }
     *     
     */
    public WebYsxAttach getArg1() {
        return arg1;
    }

    /**
     * 设置arg1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WebYsxAttach }
     *     
     */
    public void setArg1(WebYsxAttach value) {
        this.arg1 = value;
    }

}
