
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>backRepayment58 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="backRepayment58"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="certId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="retMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "backRepayment58", propOrder = {
    "appid",
    "certId",
    "queryDate",
    "rePayment",
    "retCode",
    "retMsg",
    "userId"
})
public class BackRepayment58 {

    protected int appid;
    protected String certId;
    protected String queryDate;
    protected String rePayment;
    protected Integer retCode;
    protected String retMsg;
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
     * ��ȡqueryDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryDate() {
        return queryDate;
    }

    /**
     * ����queryDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryDate(String value) {
        this.queryDate = value;
    }

    /**
     * ��ȡrePayment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRePayment() {
        return rePayment;
    }

    /**
     * ����rePayment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRePayment(String value) {
        this.rePayment = value;
    }

    /**
     * ��ȡretCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetCode() {
        return retCode;
    }

    /**
     * ����retCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetCode(Integer value) {
        this.retCode = value;
    }

    /**
     * ��ȡretMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetMsg() {
        return retMsg;
    }

    /**
     * ����retMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetMsg(String value) {
        this.retMsg = value;
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
