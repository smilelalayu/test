
package com.hm.bus.webservice.cnloan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;complexType name="tIndApplication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="bankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="contractAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="createdby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdon" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="identityCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="loanDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanStage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="loanUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="overdueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="overdueDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overdueDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="overdueDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="repTypeDec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="settleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="settleDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="settleStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="settleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tIndApplication", propOrder = {
    "appId",
    "bankCard",
    "bankCardName",
    "bankName",
    "channelId",
    "contractAmt",
    "createdby",
    "createdon",
    "identityCard",
    "identityId",
    "loanDate",
    "loanDateStr",
    "loanStage",
    "loanUser",
    "orderId",
    "overdueDate",
    "overdueDateStr",
    "overdueDay",
    "overdueDays",
    "phone",
    "productId",
    "productName",
    "remark",
    "repType",
    "repTypeDec",
    "settleDate",
    "settleDateStr",
    "settleStatus",
    "settleType",
    "version"
})
public class TIndApplication {

    protected Long appId;
    protected String bankCard;
    protected String bankCardName;
    protected String bankName;
    protected Integer channelId;
    protected Double contractAmt;
    protected String createdby;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdon;
    protected String identityCard;
    protected String identityId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loanDate;
    protected String loanDateStr;
    protected Integer loanStage;
    protected String loanUser;
    protected Integer orderId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overdueDate;
    protected String overdueDateStr;
    protected Integer overdueDay;
    protected Integer overdueDays;
    protected String phone;
    protected Integer productId;
    protected String productName;
    protected String remark;
    protected Integer repType;
    protected String repTypeDec;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settleDate;
    protected String settleDateStr;
    protected String settleStatus;
    protected String settleType;
    protected String version;

    /**
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAppId(Long value) {
        this.appId = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCard() {
        return bankCard;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCard(String value) {
        this.bankCard = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCardName() {
        return bankCardName;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCardName(String value) {
        this.bankCardName = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannelId(Integer value) {
        this.channelId = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContractAmt() {
        return contractAmt;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContractAmt(Double value) {
        this.contractAmt = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedby(String value) {
        this.createdby = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedon() {
        return createdon;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedon(XMLGregorianCalendar value) {
        this.createdon = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityCard() {
        return identityCard;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityCard(String value) {
        this.identityCard = value;
    }

    /**
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

    /**
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanDate() {
        return loanDate;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanDate(XMLGregorianCalendar value) {
        this.loanDate = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanDateStr() {
        return loanDateStr;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanDateStr(String value) {
        this.loanDateStr = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanStage() {
        return loanStage;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanStage(Integer value) {
        this.loanStage = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanUser() {
        return loanUser;
    }

   /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanUser(String value) {
        this.loanUser = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderId(Integer value) {
        this.orderId = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverdueDate() {
        return overdueDate;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverdueDate(XMLGregorianCalendar value) {
        this.overdueDate = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueDateStr() {
        return overdueDateStr;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueDateStr(String value) {
        this.overdueDateStr = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDay() {
        return overdueDay;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDay(Integer value) {
        this.overdueDay = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDays() {
        return overdueDays;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDays(Integer value) {
        this.overdueDays = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepType() {
        return repType;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepType(Integer value) {
        this.repType = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepTypeDec() {
        return repTypeDec;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepTypeDec(String value) {
        this.repTypeDec = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettleDate() {
        return settleDate;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettleDate(XMLGregorianCalendar value) {
        this.settleDate = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleDateStr() {
        return settleDateStr;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleDateStr(String value) {
        this.settleDateStr = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleStatus() {
        return settleStatus;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleStatus(String value) {
        this.settleStatus = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleType() {
        return settleType;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleType(String value) {
        this.settleType = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
