
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>cashFloe complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="cashFloe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cashFloeFileByte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="cashFloeFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cashFloe", propOrder = {
    "cashFloeFileByte",
    "cashFloeFileName"
})
public class CashFloe {

    protected byte[] cashFloeFileByte;
    protected String cashFloeFileName;

    /**
     * ��ȡcashFloeFileByte���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCashFloeFileByte() {
        return cashFloeFileByte;
    }

    /**
     * ����cashFloeFileByte���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCashFloeFileByte(byte[] value) {
        this.cashFloeFileByte = value;
    }

    /**
     * ��ȡcashFloeFileName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashFloeFileName() {
        return cashFloeFileName;
    }

    /**
     * ����cashFloeFileName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashFloeFileName(String value) {
        this.cashFloeFileName = value;
    }

}
