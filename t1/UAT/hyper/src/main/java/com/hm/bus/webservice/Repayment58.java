
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>repayment58 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="repayment58"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="certId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repayment58", propOrder = {
    "appid",
    "certId",
    "userId"
})
public class Repayment58 {

    protected int appid;
    protected String certId;
    protected long userId;

    /**
     * ��ȡappid���Ե�ֵ��
     * 
     */
    public int getAppid() {
        return appid;
    }

    /**
     * ����appid���Ե�ֵ��
     * 
     */
    public void setAppid(int value) {
        this.appid = value;
    }

    /**
     * ��ȡcertId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * ����certId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertId(String value) {
        this.certId = value;
    }

    /**
     * ��ȡuserId���Ե�ֵ��
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * ����userId���Ե�ֵ��
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

}
