
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryMatchOrder complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="queryMatchOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transHead" type="{http://biz.webservice.macrosky.com/}transHead" minOccurs="0"/&gt;
 *         &lt;element name="transBody" type="{http://biz.webservice.macrosky.com/}basicOrder" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryMatchOrder", propOrder = {
    "transHead",
    "transBody"
})
public class QueryMatchOrder {

    protected TransHead transHead;
    protected BasicOrder transBody;

    /**
     * ��ȡtransHead���Ե�ֵ��
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
     * ����transHead���Ե�ֵ��
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
     * ��ȡtransBody���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicOrder }
     *     
     */
    public BasicOrder getTransBody() {
        return transBody;
    }

    /**
     * ����transBody���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicOrder }
     *     
     */
    public void setTransBody(BasicOrder value) {
        this.transBody = value;
    }

}
