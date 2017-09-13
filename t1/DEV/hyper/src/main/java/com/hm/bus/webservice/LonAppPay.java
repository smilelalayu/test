
package com.hm.bus.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>lonAppPay complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="lonAppPay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contractAmt" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="listLonPayMatch" type="{http://biz.webservice.macrosky.com/}lonPayMatch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lonAppPay", propOrder = {
    "appCode",
    "appId",
    "contractAmt",
    "listLonPayMatch"
})
public class LonAppPay {

    protected String appCode;
    protected int appId;
    protected float contractAmt;
    @XmlElement(nillable = true)
    protected List<LonPayMatch> listLonPayMatch;

    /**
     * ��ȡappCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * ����appCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppCode(String value) {
        this.appCode = value;
    }

    /**
     * ��ȡappId���Ե�ֵ��
     * 
     */
    public int getAppId() {
        return appId;
    }

    /**
     * ����appId���Ե�ֵ��
     * 
     */
    public void setAppId(int value) {
        this.appId = value;
    }

    /**
     * ��ȡcontractAmt���Ե�ֵ��
     * 
     */
    public float getContractAmt() {
        return contractAmt;
    }

    /**
     * ����contractAmt���Ե�ֵ��
     * 
     */
    public void setContractAmt(float value) {
        this.contractAmt = value;
    }

    /**
     * Gets the value of the listLonPayMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listLonPayMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListLonPayMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LonPayMatch }
     * 
     * 
     */
    public List<LonPayMatch> getListLonPayMatch() {
        if (listLonPayMatch == null) {
            listLonPayMatch = new ArrayList<LonPayMatch>();
        }
        return this.listLonPayMatch;
    }

}
