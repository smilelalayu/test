
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>wxpcCustomerRes complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="wxpcCustomerRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wechatCustomer" type="{http://biz.webservice.macrosky.com/}wechatCustomer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wxpcCustomerRes", propOrder = {
    "wechatCustomer"
})
public class WxpcCustomerRes {

    protected WechatCustomer wechatCustomer;

    /**
     * ��ȡwechatCustomer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WechatCustomer }
     *     
     */
    public WechatCustomer getWechatCustomer() {
        return wechatCustomer;
    }

    /**
     * ����wechatCustomer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WechatCustomer }
     *     
     */
    public void setWechatCustomer(WechatCustomer value) {
        this.wechatCustomer = value;
    }

}
