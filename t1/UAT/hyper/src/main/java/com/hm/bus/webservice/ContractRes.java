
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>contractRes complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="contractRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractGenOuput" type="{http://biz.webservice.macrosky.com/}contractGenOuput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractRes", propOrder = {
    "contractGenOuput"
})
public class ContractRes {

    protected ContractGenOuput contractGenOuput;

    /**
     * ��ȡcontractGenOuput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContractGenOuput }
     *     
     */
    public ContractGenOuput getContractGenOuput() {
        return contractGenOuput;
    }

    /**
     * ����contractGenOuput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContractGenOuput }
     *     
     */
    public void setContractGenOuput(ContractGenOuput value) {
        this.contractGenOuput = value;
    }

}
