
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getMatchRelation complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getMatchRelation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransHead" type="{http://biz.webservice.macrosky.com/}transHead" minOccurs="0"/&gt;
 *         &lt;element name="TransBody" type="{http://biz.webservice.macrosky.com/}lonAppPayXML" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMatchRelation", propOrder = {
    "transHead",
    "transBody"
})
public class GetMatchRelation {

    @XmlElement(name = "TransHead")
    protected TransHead transHead;
    @XmlElement(name = "TransBody")
    protected LonAppPayXML transBody;

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
     *     {@link LonAppPayXML }
     *     
     */
    public LonAppPayXML getTransBody() {
        return transBody;
    }

    /**
     * ����transBody���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LonAppPayXML }
     *     
     */
    public void setTransBody(LonAppPayXML value) {
        this.transBody = value;
    }

}
