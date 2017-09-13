
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>transHead complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="transHead"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fromSort" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="retCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toSort" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="transExeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transExeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transHead", propOrder = {
    "fromSort",
    "retCode",
    "retMsg",
    "sourceClient",
    "toSort",
    "transExeDate",
    "transExeTime",
    "transSerialNo",
    "transType"
})
public class TransHead {

    protected int fromSort;
    protected String retCode;
    protected String retMsg;
    protected String sourceClient;
    protected int toSort;
    protected String transExeDate;
    protected String transExeTime;
    protected String transSerialNo;
    protected String transType;

    /**
     * ��ȡfromSort���Ե�ֵ��
     * 
     */
    public int getFromSort() {
        return fromSort;
    }

    /**
     * ����fromSort���Ե�ֵ��
     * 
     */
    public void setFromSort(int value) {
        this.fromSort = value;
    }

    /**
     * ��ȡretCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetCode() {
        return retCode;
    }

    /**
     * ����retCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetCode(String value) {
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
     * ��ȡsourceClient���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceClient() {
        return sourceClient;
    }

    /**
     * ����sourceClient���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceClient(String value) {
        this.sourceClient = value;
    }

    /**
     * ��ȡtoSort���Ե�ֵ��
     * 
     */
    public int getToSort() {
        return toSort;
    }

    /**
     * ����toSort���Ե�ֵ��
     * 
     */
    public void setToSort(int value) {
        this.toSort = value;
    }

    /**
     * ��ȡtransExeDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransExeDate() {
        return transExeDate;
    }

    /**
     * ����transExeDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransExeDate(String value) {
        this.transExeDate = value;
    }

    /**
     * ��ȡtransExeTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransExeTime() {
        return transExeTime;
    }

    /**
     * ����transExeTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransExeTime(String value) {
        this.transExeTime = value;
    }

    /**
     * ��ȡtransSerialNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransSerialNo() {
        return transSerialNo;
    }

    /**
     * ����transSerialNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransSerialNo(String value) {
        this.transSerialNo = value;
    }

    /**
     * ��ȡtransType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransType() {
        return transType;
    }

    /**
     * ����transType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransType(String value) {
        this.transType = value;
    }

}
