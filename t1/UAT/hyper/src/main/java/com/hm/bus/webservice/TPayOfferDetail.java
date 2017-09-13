
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tPayOfferDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tPayOfferDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountMngAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="advisoryAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="advisoryServiceAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="appCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bizCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bizMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depositAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oriSwiftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerGold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="payBatchId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="payDetailId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="payTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayDetailAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="riskAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="serviceAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="signNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="swiftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPayOfferDetail", propOrder = {
    "accountAreaCode",
    "accountBank",
    "accountMngAmt",
    "advisoryAmt",
    "advisoryServiceAmt",
    "appCode",
    "appId",
    "bizCode",
    "bizMessage",
    "customerId",
    "customerName",
    "depositAmt",
    "orgCode",
    "oriSwiftNo",
    "partnerGold",
    "partnerInt",
    "payAmt",
    "payBatchId",
    "payDetailId",
    "payTime",
    "payType",
    "productId",
    "receiveBankCard",
    "receiveOpen",
    "repayAccount",
    "repayDetailAmt",
    "repayName",
    "riskAmt",
    "serviceAmt",
    "signNo",
    "sourceClient",
    "status",
    "swiftNo"
})
public class TPayOfferDetail {

    protected String accountAreaCode;
    protected String accountBank;
    protected BigDecimal accountMngAmt;
    protected BigDecimal advisoryAmt;
    protected BigDecimal advisoryServiceAmt;
    protected String appCode;
    protected Integer appId;
    protected String bizCode;
    protected String bizMessage;
    protected String customerId;
    protected String customerName;
    protected BigDecimal depositAmt;
    protected String orgCode;
    protected String oriSwiftNo;
    protected String partnerGold;
    protected String partnerInt;
    protected BigDecimal payAmt;
    protected Integer payBatchId;
    protected Integer payDetailId;
    protected String payTime;
    protected String payType;
    protected String productId;
    protected String receiveBankCard;
    protected String receiveOpen;
    protected String repayAccount;
    protected BigDecimal repayDetailAmt;
    protected String repayName;
    protected BigDecimal riskAmt;
    protected BigDecimal serviceAmt;
    protected String signNo;
    protected String sourceClient;
    protected String status;
    protected String swiftNo;

    /**
     * ��ȡaccountAreaCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAreaCode() {
        return accountAreaCode;
    }

    /**
     * ����accountAreaCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAreaCode(String value) {
        this.accountAreaCode = value;
    }

    /**
     * ��ȡaccountBank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBank() {
        return accountBank;
    }

    /**
     * ����accountBank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBank(String value) {
        this.accountBank = value;
    }

    /**
     * ��ȡaccountMngAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountMngAmt() {
        return accountMngAmt;
    }

    /**
     * ����accountMngAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountMngAmt(BigDecimal value) {
        this.accountMngAmt = value;
    }

    /**
     * ��ȡadvisoryAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvisoryAmt() {
        return advisoryAmt;
    }

    /**
     * ����advisoryAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvisoryAmt(BigDecimal value) {
        this.advisoryAmt = value;
    }

    /**
     * ��ȡadvisoryServiceAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvisoryServiceAmt() {
        return advisoryServiceAmt;
    }

    /**
     * ����advisoryServiceAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvisoryServiceAmt(BigDecimal value) {
        this.advisoryServiceAmt = value;
    }

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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * ����appId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppId(Integer value) {
        this.appId = value;
    }

    /**
     * ��ȡbizCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * ����bizCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizCode(String value) {
        this.bizCode = value;
    }

    /**
     * ��ȡbizMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizMessage() {
        return bizMessage;
    }

    /**
     * ����bizMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizMessage(String value) {
        this.bizMessage = value;
    }

    /**
     * ��ȡcustomerId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * ����customerId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * ��ȡcustomerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * ����customerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * ��ȡdepositAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositAmt() {
        return depositAmt;
    }

    /**
     * ����depositAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositAmt(BigDecimal value) {
        this.depositAmt = value;
    }

    /**
     * ��ȡorgCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * ����orgCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

    /**
     * ��ȡoriSwiftNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriSwiftNo() {
        return oriSwiftNo;
    }

    /**
     * ����oriSwiftNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriSwiftNo(String value) {
        this.oriSwiftNo = value;
    }

    /**
     * ��ȡpartnerGold���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerGold() {
        return partnerGold;
    }

    /**
     * ����partnerGold���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerGold(String value) {
        this.partnerGold = value;
    }

    /**
     * ��ȡpartnerInt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerInt() {
        return partnerInt;
    }

    /**
     * ����partnerInt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerInt(String value) {
        this.partnerInt = value;
    }

    /**
     * ��ȡpayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayAmt() {
        return payAmt;
    }

    /**
     * ����payAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayAmt(BigDecimal value) {
        this.payAmt = value;
    }

    /**
     * ��ȡpayBatchId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayBatchId() {
        return payBatchId;
    }

    /**
     * ����payBatchId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayBatchId(Integer value) {
        this.payBatchId = value;
    }

    /**
     * ��ȡpayDetailId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayDetailId() {
        return payDetailId;
    }

    /**
     * ����payDetailId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayDetailId(Integer value) {
        this.payDetailId = value;
    }

    /**
     * ��ȡpayTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTime() {
        return payTime;
    }

    /**
     * ����payTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTime(String value) {
        this.payTime = value;
    }

    /**
     * ��ȡpayType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayType() {
        return payType;
    }

    /**
     * ����payType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayType(String value) {
        this.payType = value;
    }

    /**
     * ��ȡproductId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * ����productId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * ��ȡreceiveBankCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveBankCard() {
        return receiveBankCard;
    }

    /**
     * ����receiveBankCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveBankCard(String value) {
        this.receiveBankCard = value;
    }

    /**
     * ��ȡreceiveOpen���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOpen() {
        return receiveOpen;
    }

    /**
     * ����receiveOpen���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOpen(String value) {
        this.receiveOpen = value;
    }

    /**
     * ��ȡrepayAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayAccount() {
        return repayAccount;
    }

    /**
     * ����repayAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayAccount(String value) {
        this.repayAccount = value;
    }

    /**
     * ��ȡrepayDetailAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayDetailAmt() {
        return repayDetailAmt;
    }

    /**
     * ����repayDetailAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayDetailAmt(BigDecimal value) {
        this.repayDetailAmt = value;
    }

    /**
     * ��ȡrepayName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayName() {
        return repayName;
    }

    /**
     * ����repayName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayName(String value) {
        this.repayName = value;
    }

    /**
     * ��ȡriskAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRiskAmt() {
        return riskAmt;
    }

    /**
     * ����riskAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRiskAmt(BigDecimal value) {
        this.riskAmt = value;
    }

    /**
     * ��ȡserviceAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceAmt() {
        return serviceAmt;
    }

    /**
     * ����serviceAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceAmt(BigDecimal value) {
        this.serviceAmt = value;
    }

    /**
     * ��ȡsignNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignNo() {
        return signNo;
    }

    /**
     * ����signNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignNo(String value) {
        this.signNo = value;
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
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * ��ȡswiftNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftNo() {
        return swiftNo;
    }

    /**
     * ����swiftNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiftNo(String value) {
        this.swiftNo = value;
    }

}
