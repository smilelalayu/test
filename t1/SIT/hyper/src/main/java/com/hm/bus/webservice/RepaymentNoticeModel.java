package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *
 * <pre>
 * &lt;complexType name="repaymentNoticeModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="waresName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repaymentNoticeModel", propOrder = {
    "appId",
    "identityId",
        "waresName"
})
public class RepaymentNoticeModel {

    protected String appId;
    protected String identityId;
    protected String waresName;

    /**
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAppId() {
        return appId;
    }

    /**
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentityId(String value) {
        this.identityId = value;
    }

    public String getWaresName() {
        return waresName;
    }

    public void setWaresName(String waresName) {
        this.waresName = waresName;
    }
}
