
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getWechatContractAlgorithm complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getWechatContractAlgorithm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransHead" type="{http://biz.webservice.macrosky.com/}transHead" minOccurs="0"/&gt;
 *         &lt;element name="TransBody" type="{http://biz.webservice.macrosky.com/}contractCondition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWechatContractAlgorithm", propOrder = {
    "transHead",
    "transBody"
})
public class GetWechatContractAlgorithm {

    @XmlElement(name = "TransHead")
    protected TransHead transHead;
    @XmlElement(name = "TransBody")
    protected ContractCondition transBody;

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
     *     {@link ContractCondition }
     *     
     */
    public ContractCondition getTransBody() {
        return transBody;
    }

    /**
     * ����transBody���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContractCondition }
     *     
     */
    public void setTransBody(ContractCondition value) {
        this.transBody = value;
    }

}
