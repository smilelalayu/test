
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>statusRes complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="statusRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statusContent" type="{http://biz.webservice.macrosky.com/}statusContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusRes", propOrder = {
    "statusContent"
})
public class StatusRes {

    protected StatusContent statusContent;

    /**
     * ��ȡstatusContent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StatusContent }
     *     
     */
    public StatusContent getStatusContent() {
        return statusContent;
    }

    /**
     * ����statusContent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StatusContent }
     *     
     */
    public void setStatusContent(StatusContent value) {
        this.statusContent = value;
    }

}
