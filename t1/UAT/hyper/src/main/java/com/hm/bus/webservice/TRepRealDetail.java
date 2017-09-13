
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tRepRealDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取appId属性的值。
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
     * 设置appId属性的值。
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
     * 获取fromAccount属性的值。
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
     * 设置fromAccount属性的值。
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
     * 获取fromBank属性的值。
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
     * 设置fromBank属性的值。
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
     * 获取fromCard属性的值。
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
     * 设置fromCard属性的值。
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
     * 获取fromCardName属性的值。
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
     * 设置fromCardName属性的值。
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
     * 获取lonApplication属性的值。
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
     * 设置lonApplication属性的值。
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
     * 获取orgCode属性的值。
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
     * 设置orgCode属性的值。
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
     * 获取realRepayId属性的值。
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
     * 设置realRepayId属性的值。
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
     * 获取refundSwiftNo属性的值。
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
     * 设置refundSwiftNo属性的值。
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
     * 获取refundTag属性的值。
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
     * 设置refundTag属性的值。
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
     * 获取repRepayment属性的值。
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
     * 设置repRepayment属性的值。
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
     * 获取repayAgentAmt属性的值。
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
     * 设置repayAgentAmt属性的值。
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
     * 获取repayAmt属性的值。
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
     * 设置repayAmt属性的值。
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
     * 获取repayDate属性的值。
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
     * 设置repayDate属性的值。
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
     * 获取repayInterest属性的值。
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
     * 设置repayInterest属性的值。
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
     * 获取repayOverdueFee属性的值。
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
     * 设置repayOverdueFee属性的值。
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
     * 获取repayPettyCashFee属性的值。
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
     * 设置repayPettyCashFee属性的值。
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
     * 获取repayPrincipal属性的值。
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
     * 设置repayPrincipal属性的值。
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
     * 获取repayPunish属性的值。
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
     * 设置repayPunish属性的值。
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
     * 获取repayRisk属性的值。
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
     * 设置repayRisk属性的值。
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
     * 获取repayServiceFee属性的值。
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
     * 设置repayServiceFee属性的值。
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
     * 获取repayViolate属性的值。
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
     * 设置repayViolate属性的值。
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
     * 获取repaymentId属性的值。
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
     * 设置repaymentId属性的值。
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
     * 获取swiftNo属性的值。
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
     * 设置swiftNo属性的值。
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
     * 获取toAccount属性的值。
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
     * 设置toAccount属性的值。
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
     * 获取toBank属性的值。
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
     * 设置toBank属性的值。
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
     * 获取toCard属性的值。
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
     * 设置toCard属性的值。
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
     * 获取toCardName属性的值。
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
     * 设置toCardName属性的值。
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
