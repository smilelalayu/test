
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>saveLatentCustomerService complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="saveLatentCustomerService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransHead" type="{http://biz.webservice.macrosky.com/}transHead" minOccurs="0"/&gt;
 *         &lt;element name="TransBody" type="{http://biz.webservice.macrosky.com/}tLatentCustomer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveLatentCustomerService", propOrder = {
    "transHead",
    "transBody"
})
public class SaveLatentCustomerService {

    @XmlElement(name = "TransHead")
    protected TransHead transHead;
    @XmlElement(name = "TransBody")
    protected TLatentCustomer transBody;

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
     *     {@link TLatentCustomer }
     *     
     */
    public TLatentCustomer getTransBody() {
        return transBody;
    }

    /**
     * ����transBody���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLatentCustomer }
     *     
     */
    public void setTransBody(TLatentCustomer value) {
        this.transBody = value;
    }

}
