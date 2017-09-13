
package com.hm.bus.webservice.cnloan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <pre>
 * &lt;complexType name="transModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transBody" type="{http://webservice.cicada.jfbank.com/}transBody" minOccurs="0"/&gt;
 *         &lt;element name="transHead" type="{http://webservice.cicada.jfbank.com/}transHead" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transModel", propOrder = {
    "transBody",
    "transHead"
})
public class TransModel {

    protected TransBody transBody;
    protected TransHead transHead;

    /**
     * 
     * @return
     *     possible object is
     *     {@link TransBody }
     *     
     */
    public TransBody getTransBody() {
        return transBody;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link TransBody }
     *     
     */
    public void setTransBody(TransBody value) {
        this.transBody = value;
    }

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

}
