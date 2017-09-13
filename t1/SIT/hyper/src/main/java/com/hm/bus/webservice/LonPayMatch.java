
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>lonPayMatch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="lonPayMatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lenderAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lenderAmt" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="lenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lenderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lenderPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="lenderStratDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lenderTerm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lonPayMatch", propOrder = {
    "lenderAccount",
    "lenderAmt",
    "lenderName",
    "lenderNo",
    "lenderPercent",
    "lenderStratDate",
    "lenderTerm"
})
public class LonPayMatch {

    protected String lenderAccount;
    protected float lenderAmt;
    protected String lenderName;
    protected String lenderNo;
    protected Float lenderPercent;
    protected String lenderStratDate;
    protected int lenderTerm;

    /**
     * ��ȡlenderAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderAccount() {
        return lenderAccount;
    }

    /**
     * ����lenderAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderAccount(String value) {
        this.lenderAccount = value;
    }

    /**
     * ��ȡlenderAmt���Ե�ֵ��
     * 
     */
    public float getLenderAmt() {
        return lenderAmt;
    }

    /**
     * ����lenderAmt���Ե�ֵ��
     * 
     */
    public void setLenderAmt(float value) {
        this.lenderAmt = value;
    }

    /**
     * ��ȡlenderName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderName() {
        return lenderName;
    }

    /**
     * ����lenderName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderName(String value) {
        this.lenderName = value;
    }

    /**
     * ��ȡlenderNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderNo() {
        return lenderNo;
    }

    /**
     * ����lenderNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderNo(String value) {
        this.lenderNo = value;
    }

    /**
     * ��ȡlenderPercent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLenderPercent() {
        return lenderPercent;
    }

    /**
     * ����lenderPercent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLenderPercent(Float value) {
        this.lenderPercent = value;
    }

    /**
     * ��ȡlenderStratDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderStratDate() {
        return lenderStratDate;
    }

    /**
     * ����lenderStratDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderStratDate(String value) {
        this.lenderStratDate = value;
    }

    /**
     * ��ȡlenderTerm���Ե�ֵ��
     * 
     */
    public int getLenderTerm() {
        return lenderTerm;
    }

    /**
     * ����lenderTerm���Ե�ֵ��
     * 
     */
    public void setLenderTerm(int value) {
        this.lenderTerm = value;
    }

}
