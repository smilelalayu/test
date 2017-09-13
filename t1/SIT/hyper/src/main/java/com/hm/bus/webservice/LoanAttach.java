
package com.hm.bus.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>loanAttach complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="loanAttach"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="attachCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tLonAttach" type="{http://biz.webservice.macrosky.com/}recordLoanAttach" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loanAttach", propOrder = {
    "appId",
    "attachCondition",
    "tLonAttach"
})
public class LoanAttach {

    protected int appId;
    protected String attachCondition;
    @XmlElement(nillable = true)
    protected List<RecordLoanAttach> tLonAttach;

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
     * ��ȡattachCondition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachCondition() {
        return attachCondition;
    }

    /**
     * ����attachCondition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachCondition(String value) {
        this.attachCondition = value;
    }

    /**
     * Gets the value of the tLonAttach property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tLonAttach property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTLonAttach().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordLoanAttach }
     * 
     * 
     */
    public List<RecordLoanAttach> getTLonAttach() {
        if (tLonAttach == null) {
            tLonAttach = new ArrayList<RecordLoanAttach>();
        }
        return this.tLonAttach;
    }

}
