
package com.hm.bus.webservice.cnloan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;complexType name="generateRepaymentNoticesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://webservice.cicada.jfbank.com/}transModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateRepaymentNoticesResponse", propOrder = {
    "_return"
})
public class GenerateRepaymentNoticesResponse {

    @XmlElement(name = "return")
    protected TransModel _return;

    /**
     * 
     * @return
     *     possible object is
     *     {@link TransModel }
     *     
     */
    public TransModel getReturn() {
        return _return;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link TransModel }
     *     
     */
    public void setReturn(TransModel value) {
        this._return = value;
    }

}
