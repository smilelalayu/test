
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tPayMatch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcreateTime���Ե�ֵ��
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
     * ����createTime���Ե�ֵ��
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
     * ��ȡcreator���Ե�ֵ��
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
     * ����creator���Ե�ֵ��
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
     * ��ȡfinanceAccount���Ե�ֵ��
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
     * ����financeAccount���Ե�ֵ��
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
     * ��ȡfinanceBank���Ե�ֵ��
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
     * ����financeBank���Ե�ֵ��
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
     * ��ȡfinanceBankCard���Ե�ֵ��
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
     * ����financeBankCard���Ե�ֵ��
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
     * ��ȡfinanceId���Ե�ֵ��
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
     * ����financeId���Ե�ֵ��
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
     * ��ȡfinanceName���Ե�ֵ��
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
     * ����financeName���Ե�ֵ��
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
     * ��ȡfinancePercent���Ե�ֵ��
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
     * ����financePercent���Ե�ֵ��
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
     * ��ȡfinanceStartDate���Ե�ֵ��
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
     * ����financeStartDate���Ե�ֵ��
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
     * ��ȡfinanceTerm���Ե�ֵ��
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
     * ����financeTerm���Ե�ֵ��
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
     * ��ȡloanAccount���Ե�ֵ��
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
     * ����loanAccount���Ե�ֵ��
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
     * ��ȡloanBank���Ե�ֵ��
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
     * ����loanBank���Ե�ֵ��
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
     * ��ȡloanBankCard���Ե�ֵ��
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
     * ����loanBankCard���Ե�ֵ��
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
     * ��ȡmatchAmt���Ե�ֵ��
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
     * ����matchAmt���Ե�ֵ��
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
     * ��ȡmatchBatch���Ե�ֵ��
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
     * ����matchBatch���Ե�ֵ��
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
     * ��ȡmatchDate���Ե�ֵ��
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
     * ����matchDate���Ե�ֵ��
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
     * ��ȡmatchId���Ե�ֵ��
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
     * ����matchId���Ե�ֵ��
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
     * ��ȡmatchStatus���Ե�ֵ��
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
     * ����matchStatus���Ե�ֵ��
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
     * ��ȡmatchTime���Ե�ֵ��
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
     * ����matchTime���Ե�ֵ��
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
     * ��ȡmendTime���Ե�ֵ��
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
     * ����mendTime���Ե�ֵ��
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
     * ��ȡmender���Ե�ֵ��
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
     * ����mender���Ե�ֵ��
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
     * ��ȡremark���Ե�ֵ��
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
     * ����remark���Ե�ֵ��
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
