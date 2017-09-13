
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tRepRealDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tRepRealDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fromAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lonApplication" type="{http://biz.webservice.macrosky.com/}tLonApplication" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="realRepayId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="refundSwiftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refundTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repRepayment" type="{http://biz.webservice.macrosky.com/}tRepRepayment" minOccurs="0"/&gt;
 *         &lt;element name="repayAgentAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayOverdueFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayPettyCashFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayPunish" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayRisk" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayServiceFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayViolate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repaymentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="swiftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRepRealDetail", propOrder = {
    "appId",
    "fromAccount",
    "fromBank",
    "fromCard",
    "fromCardName",
    "lonApplication",
    "orgCode",
    "realRepayId",
    "refundSwiftNo",
    "refundTag",
    "repRepayment",
    "repayAgentAmt",
    "repayAmt",
    "repayDate",
    "repayInterest",
    "repayOverdueFee",
    "repayPettyCashFee",
    "repayPrincipal",
    "repayPunish",
    "repayRisk",
    "repayServiceFee",
    "repayViolate",
    "repaymentId",
    "swiftNo",
    "toAccount",
    "toBank",
    "toCard",
    "toCardName"
})
public class TRepRealDetail {

    protected Integer appId;
    protected String fromAccount;
    protected String fromBank;
    protected String fromCard;
    protected String fromCardName;
    protected TLonApplication lonApplication;
    protected String orgCode;
    protected Integer realRepayId;
    protected String refundSwiftNo;
    protected String refundTag;
    protected TRepRepayment repRepayment;
    protected BigDecimal repayAgentAmt;
    protected BigDecimal repayAmt;
    protected String repayDate;
    protected BigDecimal repayInterest;
    protected BigDecimal repayOverdueFee;
    protected BigDecimal repayPettyCashFee;
    protected BigDecimal repayPrincipal;
    protected BigDecimal repayPunish;
    protected BigDecimal repayRisk;
    protected BigDecimal repayServiceFee;
    protected BigDecimal repayViolate;
    protected Integer repaymentId;
    protected String swiftNo;
    protected String toAccount;
    protected String toBank;
    protected String toCard;
    protected String toCardName;

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
     * ��ȡfromAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAccount() {
        return fromAccount;
    }

    /**
     * ����fromAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAccount(String value) {
        this.fromAccount = value;
    }

    /**
     * ��ȡfromBank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBank() {
        return fromBank;
    }

    /**
     * ����fromBank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBank(String value) {
        this.fromBank = value;
    }

    /**
     * ��ȡfromCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCard() {
        return fromCard;
    }

    /**
     * ����fromCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCard(String value) {
        this.fromCard = value;
    }

    /**
     * ��ȡfromCardName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCardName() {
        return fromCardName;
    }

    /**
     * ����fromCardName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCardName(String value) {
        this.fromCardName = value;
    }

    /**
     * ��ȡlonApplication���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplication }
     *     
     */
    public TLonApplication getLonApplication() {
        return lonApplication;
    }

    /**
     * ����lonApplication���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplication }
     *     
     */
    public void setLonApplication(TLonApplication value) {
        this.lonApplication = value;
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
     * ��ȡrealRepayId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRealRepayId() {
        return realRepayId;
    }

    /**
     * ����realRepayId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRealRepayId(Integer value) {
        this.realRepayId = value;
    }

    /**
     * ��ȡrefundSwiftNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundSwiftNo() {
        return refundSwiftNo;
    }

    /**
     * ����refundSwiftNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundSwiftNo(String value) {
        this.refundSwiftNo = value;
    }

    /**
     * ��ȡrefundTag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundTag() {
        return refundTag;
    }

    /**
     * ����refundTag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundTag(String value) {
        this.refundTag = value;
    }

    /**
     * ��ȡrepRepayment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TRepRepayment }
     *     
     */
    public TRepRepayment getRepRepayment() {
        return repRepayment;
    }

    /**
     * ����repRepayment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TRepRepayment }
     *     
     */
    public void setRepRepayment(TRepRepayment value) {
        this.repRepayment = value;
    }

    /**
     * ��ȡrepayAgentAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayAgentAmt() {
        return repayAgentAmt;
    }

    /**
     * ����repayAgentAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayAgentAmt(BigDecimal value) {
        this.repayAgentAmt = value;
    }

    /**
     * ��ȡrepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayAmt() {
        return repayAmt;
    }

    /**
     * ����repayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayAmt(BigDecimal value) {
        this.repayAmt = value;
    }

    /**
     * ��ȡrepayDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayDate() {
        return repayDate;
    }

    /**
     * ����repayDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayDate(String value) {
        this.repayDate = value;
    }

    /**
     * ��ȡrepayInterest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayInterest() {
        return repayInterest;
    }

    /**
     * ����repayInterest���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayInterest(BigDecimal value) {
        this.repayInterest = value;
    }

    /**
     * ��ȡrepayOverdueFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayOverdueFee() {
        return repayOverdueFee;
    }

    /**
     * ����repayOverdueFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayOverdueFee(BigDecimal value) {
        this.repayOverdueFee = value;
    }

    /**
     * ��ȡrepayPettyCashFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayPettyCashFee() {
        return repayPettyCashFee;
    }

    /**
     * ����repayPettyCashFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayPettyCashFee(BigDecimal value) {
        this.repayPettyCashFee = value;
    }

    /**
     * ��ȡrepayPrincipal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayPrincipal() {
        return repayPrincipal;
    }

    /**
     * ����repayPrincipal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayPrincipal(BigDecimal value) {
        this.repayPrincipal = value;
    }

    /**
     * ��ȡrepayPunish���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayPunish() {
        return repayPunish;
    }

    /**
     * ����repayPunish���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayPunish(BigDecimal value) {
        this.repayPunish = value;
    }

    /**
     * ��ȡrepayRisk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayRisk() {
        return repayRisk;
    }

    /**
     * ����repayRisk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayRisk(BigDecimal value) {
        this.repayRisk = value;
    }

    /**
     * ��ȡrepayServiceFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayServiceFee() {
        return repayServiceFee;
    }

    /**
     * ����repayServiceFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayServiceFee(BigDecimal value) {
        this.repayServiceFee = value;
    }

    /**
     * ��ȡrepayViolate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayViolate() {
        return repayViolate;
    }

    /**
     * ����repayViolate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayViolate(BigDecimal value) {
        this.repayViolate = value;
    }

    /**
     * ��ȡrepaymentId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepaymentId() {
        return repaymentId;
    }

    /**
     * ����repaymentId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepaymentId(Integer value) {
        this.repaymentId = value;
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

    /**
     * ��ȡtoAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAccount() {
        return toAccount;
    }

    /**
     * ����toAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAccount(String value) {
        this.toAccount = value;
    }

    /**
     * ��ȡtoBank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBank() {
        return toBank;
    }

    /**
     * ����toBank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBank(String value) {
        this.toBank = value;
    }

    /**
     * ��ȡtoCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCard() {
        return toCard;
    }

    /**
     * ����toCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCard(String value) {
        this.toCard = value;
    }

    /**
     * ��ȡtoCardName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCardName() {
        return toCardName;
    }

    /**
     * ����toCardName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCardName(String value) {
        this.toCardName = value;
    }

}
