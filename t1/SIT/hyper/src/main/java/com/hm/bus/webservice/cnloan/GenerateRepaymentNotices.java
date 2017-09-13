
package com.hm.bus.webservice.cnloan;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;complexType name="generateRepaymentNotices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransHead" type="{http://webservice.cicada.jfbank.com/}transHead" minOccurs="0"/&gt;
 *         &lt;element name="TransBody" type="{http://webservice.cicada.jfbank.com/}repaymentNoticeModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateRepaymentNotices", propOrder = {
    "transHead",
    "transBody"
})
public class GenerateRepaymentNotices {

    @XmlElement(name = "TransHead")
    protected TransHead transHead;
    @XmlElement(name = "TransBody")
    protected List<RepaymentNoticeModel> transBody;

    /**
     * 
     * @return
     *     possible object is
     *     {@link TransHead }
     *     
     */
    public TransHead getTransHead() {
        return transHead;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link TransHead }
     *     
     */
    public void setTransHead(TransHead value) {
        this.transHead = value;
    }

    /**
     * Gets the value of the transBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentNoticeModel }
     * 
     * 
     */
    public List<RepaymentNoticeModel> getTransBody() {
        if (transBody == null) {
            transBody = new ArrayList<RepaymentNoticeModel>();
        }
        return this.transBody;
    }

}
