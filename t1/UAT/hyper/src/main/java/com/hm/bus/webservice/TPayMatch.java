
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tPayMatch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tPayMatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="financeAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="financeBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="financeBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="financeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="financeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="financePercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="financeStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="financeTerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="loanAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="matchBatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="matchStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mendTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPayMatch", propOrder = {
    "appId",
    "createTime",
    "creator",
    "customerId",
    "customerName",
    "financeAccount",
    "financeBank",
    "financeBankCard",
    "financeId",
    "financeName",
    "financePercent",
    "financeStartDate",
    "financeTerm",
    "loanAccount",
    "loanBank",
    "loanBankCard",
    "matchAmt",
    "matchBatch",
    "matchDate",
    "matchId",
    "matchStatus",
    "matchTime",
    "mendTime",
    "mender",
    "orgCode",
    "remark"
})
public class TPayMatch {

    protected Integer appId;
    protected String createTime;
    protected String creator;
    protected String customerId;
    protected String customerName;
    protected String financeAccount;
    protected String financeBank;
    protected String financeBankCard;
    protected String financeId;
    protected String financeName;
    protected Float financePercent;
    protected String financeStartDate;
    protected Integer financeTerm;
    protected String loanAccount;
    protected String loanBank;
    protected String loanBankCard;
    protected BigDecimal matchAmt;
    protected String matchBatch;
    protected String matchDate;
    protected Integer matchId;
    protected String matchStatus;
    protected String matchTime;
    protected String mendTime;
    protected String mender;
    protected String orgCode;
    protected String remark;

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
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * 获取creator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置creator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * 获取customerId属性的值。
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
     * 设置customerId属性的值。
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
     * 获取customerName属性的值。
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
     * 设置customerName属性的值。
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
     * 获取financeAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceAccount() {
        return financeAccount;
    }

    /**
     * 设置financeAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceAccount(String value) {
        this.financeAccount = value;
    }

    /**
     * 获取financeBank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceBank() {
        return financeBank;
    }

    /**
     * 设置financeBank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceBank(String value) {
        this.financeBank = value;
    }

    /**
     * 获取financeBankCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceBankCard() {
        return financeBankCard;
    }

    /**
     * 设置financeBankCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceBankCard(String value) {
        this.financeBankCard = value;
    }

    /**
     * 获取financeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceId() {
        return financeId;
    }

    /**
     * 设置financeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceId(String value) {
        this.financeId = value;
    }

    /**
     * 获取financeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceName() {
        return financeName;
    }

    /**
     * 设置financeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceName(String value) {
        this.financeName = value;
    }

    /**
     * 获取financePercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFinancePercent() {
        return financePercent;
    }

    /**
     * 设置financePercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFinancePercent(Float value) {
        this.financePercent = value;
    }

    /**
     * 获取financeStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceStartDate() {
        return financeStartDate;
    }

    /**
     * 设置financeStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceStartDate(String value) {
        this.financeStartDate = value;
    }

    /**
     * 获取financeTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinanceTerm() {
        return financeTerm;
    }

    /**
     * 设置financeTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinanceTerm(Integer value) {
        this.financeTerm = value;
    }

    /**
     * 获取loanAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAccount() {
        return loanAccount;
    }

    /**
     * 设置loanAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAccount(String value) {
        this.loanAccount = value;
    }

    /**
     * 获取loanBank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanBank() {
        return loanBank;
    }

    /**
     * 设置loanBank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanBank(String value) {
        this.loanBank = value;
    }

    /**
     * 获取loanBankCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanBankCard() {
        return loanBankCard;
    }

    /**
     * 设置loanBankCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanBankCard(String value) {
        this.loanBankCard = value;
    }

    /**
     * 获取matchAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchAmt() {
        return matchAmt;
    }

    /**
     * 设置matchAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchAmt(BigDecimal value) {
        this.matchAmt = value;
    }

    /**
     * 获取matchBatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBatch() {
        return matchBatch;
    }

    /**
     * 设置matchBatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBatch(String value) {
        this.matchBatch = value;
    }

    /**
     * 获取matchDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchDate() {
        return matchDate;
    }

    /**
     * 设置matchDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchDate(String value) {
        this.matchDate = value;
    }

    /**
     * 获取matchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatchId() {
        return matchId;
    }

    /**
     * 设置matchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatchId(Integer value) {
        this.matchId = value;
    }

    /**
     * 获取matchStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchStatus() {
        return matchStatus;
    }

    /**
     * 设置matchStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchStatus(String value) {
        this.matchStatus = value;
    }

    /**
     * 获取matchTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchTime() {
        return matchTime;
    }

    /**
     * 设置matchTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchTime(String value) {
        this.matchTime = value;
    }

    /**
     * 获取mendTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMendTime() {
        return mendTime;
    }

    /**
     * 设置mendTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMendTime(String value) {
        this.mendTime = value;
    }

    /**
     * 获取mender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMender() {
        return mender;
    }

    /**
     * 设置mender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMender(String value) {
        this.mender = value;
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
     * 获取remark属性的值。
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
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
