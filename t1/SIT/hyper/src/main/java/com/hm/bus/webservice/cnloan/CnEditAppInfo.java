package com.hm.bus.webservice.cnloan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;complexType name="cnEditAppInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransHead" type="{http://webservice.cicada.jfbank.com/}transHead" minOccurs="0"/&gt;
 *         &lt;element name="TransBody" type="{http://webservice.cicada.jfbank.com/}tIndApplication" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cnEditAppInfo", propOrder = {
    "transHead",
    "transBody"
})
public class CnEditAppInfo {

    @XmlElement(name = "TransHead")
    protected TransHead transHead;
    @XmlElement(name = "TransBody")
    protected TIndApplication transBody;

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
     * @param value
     *     allowed object is
     *     {@link TransHead }
     *     
     */
    public void setTransHead(TransHead value) {
        this.transHead = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link TIndApplication }
     *     
     */
    public TIndApplication getTransBody() {
        return transBody;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link TIndApplication }
     *     
     */
    public void setTransBody(TIndApplication value) {
        this.transBody = value;
    }

}
