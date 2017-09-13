
package com.hm.bus.webservice.cnloan;

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
    "appId", "identityId", "waresName", "repType", "frmcod", "creditLoanType","appayDate"
})
public class RepaymentNoticeModel {

    protected String appId;
    protected String identityId;
    protected String waresName;
    protected String repType;  //代扣：1  主动还款：3
    protected String frmcod;
    protected String creditLoanType;  //现金贷：1 POS贷(AGR农机贷)：2
    protected String appayDate;
    
    

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

	public String getRepType()
	{
		return repType;
	}

	public void setRepType(String repType)
	{
		this.repType = repType;
	}

	public String getFrmcod()
	{
		return frmcod;
	}

	public void setFrmcod(String frmcod)
	{
		this.frmcod = frmcod;
	}

	public String getCreditLoanType()
	{
		return creditLoanType;
	}

	public void setCreditLoanType(String creditLoanType)
	{
		this.creditLoanType = creditLoanType;
	}

	public String getAppayDate() {
		return appayDate;
	}

	public void setAppayDate(String appayDate) {
		this.appayDate = appayDate;
	}
    
}
