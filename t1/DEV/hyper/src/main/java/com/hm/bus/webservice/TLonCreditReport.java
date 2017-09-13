
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonCreditReport complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tLonCreditReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="carLonAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="carLonSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="carMonthRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="carRemainAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="carRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cardMaxLimitAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="checkMonthIncomeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditBlank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardLimitAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditCardLowRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditCardNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="creditCardOverLimitAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditCardStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardSumLimitAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditCardTotolnum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="creditListSumAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditListSumAmtOther" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditLoanSumAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditLoanSumAmtOther" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditLoansNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="creditLoansNumOther" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="creditMaxage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="creditMonthRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditMonthRepayAmtOther" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditRemainAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditRemainAmtOther" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditReportId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="creditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debtRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="fiveCategorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseLonAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="houseMonthRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="houseNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="houseRemainAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="interDebtRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="last2Day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="last6Credit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="last6CreditAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="last6CreditNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="longestYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maxExceedTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mfsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthDebtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="monthDebtRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="riskGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ruleMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="selfQuery" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sixMonthOver" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sixMonthShouldPay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="suggestAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="suggestTimes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sumDebtRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="totalLoan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="year2Last2Num" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonCreditReport", propOrder = {
    "appId",
    "carLonAmt",
    "carLonSum",
    "carMonthRepayAmt",
    "carRemainAmt",
    "carRepayAmt",
    "cardMaxLimitAmt",
    "checkMonthIncomeAmt",
    "creditBlank",
    "creditCardLimitAmt",
    "creditCardLowRepayAmt",
    "creditCardNum",
    "creditCardOverLimitAmt",
    "creditCardStatus",
    "creditCardSumLimitAmt",
    "creditCardTotolnum",
    "creditListSumAmt",
    "creditListSumAmtOther",
    "creditLoanSumAmt",
    "creditLoanSumAmtOther",
    "creditLoansNum",
    "creditLoansNumOther",
    "creditMaxage",
    "creditMonthRepayAmt",
    "creditMonthRepayAmtOther",
    "creditRemainAmt",
    "creditRemainAmtOther",
    "creditRepayAmt",
    "creditReportId",
    "creditType",
    "creditVersion",
    "debtRate",
    "fiveCategorie",
    "houseLonAmt",
    "houseMonthRepayAmt",
    "houseNum",
    "houseRemainAmt",
    "interDebtRate",
    "last2Day",
    "last6Credit",
    "last6CreditAmt",
    "last6CreditNum",
    "longestYear",
    "maxExceedTime",
    "mfsResult",
    "monthDebtAmt",
    "monthDebtRate",
    "orgCode",
    "queryTime",
    "riskGrade",
    "ruleMessage",
    "score",
    "selfQuery",
    "sixMonthOver",
    "sixMonthShouldPay",
    "suggestAmt",
    "suggestTimes",
    "sumDebtRate",
    "totalLoan",
    "year2Last2Num"
})
public class TLonCreditReport {

    protected Integer appId;
    protected BigDecimal carLonAmt;
    protected Integer carLonSum;
    protected BigDecimal carMonthRepayAmt;
    protected BigDecimal carRemainAmt;
    protected BigDecimal carRepayAmt;
    protected BigDecimal cardMaxLimitAmt;
    protected BigDecimal checkMonthIncomeAmt;
    protected String creditBlank;
    protected BigDecimal creditCardLimitAmt;
    protected BigDecimal creditCardLowRepayAmt;
    protected Integer creditCardNum;
    protected BigDecimal creditCardOverLimitAmt;
    protected String creditCardStatus;
    protected BigDecimal creditCardSumLimitAmt;
    protected Integer creditCardTotolnum;
    protected BigDecimal creditListSumAmt;
    protected BigDecimal creditListSumAmtOther;
    protected BigDecimal creditLoanSumAmt;
    protected BigDecimal creditLoanSumAmtOther;
    protected Integer creditLoansNum;
    protected Integer creditLoansNumOther;
    protected Integer creditMaxage;
    protected BigDecimal creditMonthRepayAmt;
    protected BigDecimal creditMonthRepayAmtOther;
    protected BigDecimal creditRemainAmt;
    protected BigDecimal creditRemainAmtOther;
    protected BigDecimal creditRepayAmt;
    protected Integer creditReportId;
    protected String creditType;
    protected String creditVersion;
    protected Float debtRate;
    protected String fiveCategorie;
    protected BigDecimal houseLonAmt;
    protected BigDecimal houseMonthRepayAmt;
    protected Integer houseNum;
    protected BigDecimal houseRemainAmt;
    protected Float interDebtRate;
    protected String last2Day;
    protected Integer last6Credit;
    protected BigDecimal last6CreditAmt;
    protected Integer last6CreditNum;
    protected Integer longestYear;
    protected Integer maxExceedTime;
    protected String mfsResult;
    protected BigDecimal monthDebtAmt;
    protected Float monthDebtRate;
    protected String orgCode;
    protected String queryTime;
    protected String riskGrade;
    protected String ruleMessage;
    protected BigDecimal score;
    protected Integer selfQuery;
    protected BigDecimal sixMonthOver;
    protected BigDecimal sixMonthShouldPay;
    protected BigDecimal suggestAmt;
    protected BigDecimal suggestTimes;
    protected Float sumDebtRate;
    protected BigDecimal totalLoan;
    protected Integer year2Last2Num;

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
     * ��ȡcarLonAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarLonAmt() {
        return carLonAmt;
    }

    /**
     * ����carLonAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarLonAmt(BigDecimal value) {
        this.carLonAmt = value;
    }

    /**
     * ��ȡcarLonSum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarLonSum() {
        return carLonSum;
    }

    /**
     * ����carLonSum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarLonSum(Integer value) {
        this.carLonSum = value;
    }

    /**
     * ��ȡcarMonthRepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarMonthRepayAmt() {
        return carMonthRepayAmt;
    }

    /**
     * ����carMonthRepayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarMonthRepayAmt(BigDecimal value) {
        this.carMonthRepayAmt = value;
    }

    /**
     * ��ȡcarRemainAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarRemainAmt() {
        return carRemainAmt;
    }

    /**
     * ����carRemainAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarRemainAmt(BigDecimal value) {
        this.carRemainAmt = value;
    }

    /**
     * ��ȡcarRepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarRepayAmt() {
        return carRepayAmt;
    }

    /**
     * ����carRepayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarRepayAmt(BigDecimal value) {
        this.carRepayAmt = value;
    }

    /**
     * ��ȡcardMaxLimitAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCardMaxLimitAmt() {
        return cardMaxLimitAmt;
    }

    /**
     * ����cardMaxLimitAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCardMaxLimitAmt(BigDecimal value) {
        this.cardMaxLimitAmt = value;
    }

    /**
     * ��ȡcheckMonthIncomeAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckMonthIncomeAmt() {
        return checkMonthIncomeAmt;
    }

    /**
     * ����checkMonthIncomeAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheckMonthIncomeAmt(BigDecimal value) {
        this.checkMonthIncomeAmt = value;
    }

    /**
     * ��ȡcreditBlank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditBlank() {
        return creditBlank;
    }

    /**
     * ����creditBlank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditBlank(String value) {
        this.creditBlank = value;
    }

    /**
     * ��ȡcreditCardLimitAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditCardLimitAmt() {
        return creditCardLimitAmt;
    }

    /**
     * ����creditCardLimitAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditCardLimitAmt(BigDecimal value) {
        this.creditCardLimitAmt = value;
    }

    /**
     * ��ȡcreditCardLowRepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditCardLowRepayAmt() {
        return creditCardLowRepayAmt;
    }

    /**
     * ����creditCardLowRepayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditCardLowRepayAmt(BigDecimal value) {
        this.creditCardLowRepayAmt = value;
    }

    /**
     * ��ȡcreditCardNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditCardNum() {
        return creditCardNum;
    }

    /**
     * ����creditCardNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditCardNum(Integer value) {
        this.creditCardNum = value;
    }

    /**
     * ��ȡcreditCardOverLimitAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditCardOverLimitAmt() {
        return creditCardOverLimitAmt;
    }

    /**
     * ����creditCardOverLimitAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditCardOverLimitAmt(BigDecimal value) {
        this.creditCardOverLimitAmt = value;
    }

    /**
     * ��ȡcreditCardStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardStatus() {
        return creditCardStatus;
    }

    /**
     * ����creditCardStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardStatus(String value) {
        this.creditCardStatus = value;
    }

    /**
     * ��ȡcreditCardSumLimitAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditCardSumLimitAmt() {
        return creditCardSumLimitAmt;
    }

    /**
     * ����creditCardSumLimitAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditCardSumLimitAmt(BigDecimal value) {
        this.creditCardSumLimitAmt = value;
    }

    /**
     * ��ȡcreditCardTotolnum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditCardTotolnum() {
        return creditCardTotolnum;
    }

    /**
     * ����creditCardTotolnum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditCardTotolnum(Integer value) {
        this.creditCardTotolnum = value;
    }

    /**
     * ��ȡcreditListSumAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditListSumAmt() {
        return creditListSumAmt;
    }

    /**
     * ����creditListSumAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditListSumAmt(BigDecimal value) {
        this.creditListSumAmt = value;
    }

    /**
     * ��ȡcreditListSumAmtOther���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditListSumAmtOther() {
        return creditListSumAmtOther;
    }

    /**
     * ����creditListSumAmtOther���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditListSumAmtOther(BigDecimal value) {
        this.creditListSumAmtOther = value;
    }

    /**
     * ��ȡcreditLoanSumAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLoanSumAmt() {
        return creditLoanSumAmt;
    }

    /**
     * ����creditLoanSumAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLoanSumAmt(BigDecimal value) {
        this.creditLoanSumAmt = value;
    }

    /**
     * ��ȡcreditLoanSumAmtOther���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLoanSumAmtOther() {
        return creditLoanSumAmtOther;
    }

    /**
     * ����creditLoanSumAmtOther���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLoanSumAmtOther(BigDecimal value) {
        this.creditLoanSumAmtOther = value;
    }

    /**
     * ��ȡcreditLoansNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditLoansNum() {
        return creditLoansNum;
    }

    /**
     * ����creditLoansNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditLoansNum(Integer value) {
        this.creditLoansNum = value;
    }

    /**
     * ��ȡcreditLoansNumOther���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditLoansNumOther() {
        return creditLoansNumOther;
    }

    /**
     * ����creditLoansNumOther���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditLoansNumOther(Integer value) {
        this.creditLoansNumOther = value;
    }

    /**
     * ��ȡcreditMaxage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditMaxage() {
        return creditMaxage;
    }

    /**
     * ����creditMaxage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditMaxage(Integer value) {
        this.creditMaxage = value;
    }

    /**
     * ��ȡcreditMonthRepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditMonthRepayAmt() {
        return creditMonthRepayAmt;
    }

    /**
     * ����creditMonthRepayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditMonthRepayAmt(BigDecimal value) {
        this.creditMonthRepayAmt = value;
    }

    /**
     * ��ȡcreditMonthRepayAmtOther���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditMonthRepayAmtOther() {
        return creditMonthRepayAmtOther;
    }

    /**
     * ����creditMonthRepayAmtOther���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditMonthRepayAmtOther(BigDecimal value) {
        this.creditMonthRepayAmtOther = value;
    }

    /**
     * ��ȡcreditRemainAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditRemainAmt() {
        return creditRemainAmt;
    }

    /**
     * ����creditRemainAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditRemainAmt(BigDecimal value) {
        this.creditRemainAmt = value;
    }

    /**
     * ��ȡcreditRemainAmtOther���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditRemainAmtOther() {
        return creditRemainAmtOther;
    }

    /**
     * ����creditRemainAmtOther���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditRemainAmtOther(BigDecimal value) {
        this.creditRemainAmtOther = value;
    }

    /**
     * ��ȡcreditRepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditRepayAmt() {
        return creditRepayAmt;
    }

    /**
     * ����creditRepayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditRepayAmt(BigDecimal value) {
        this.creditRepayAmt = value;
    }

    /**
     * ��ȡcreditReportId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditReportId() {
        return creditReportId;
    }

    /**
     * ����creditReportId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditReportId(Integer value) {
        this.creditReportId = value;
    }

    /**
     * ��ȡcreditType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditType() {
        return creditType;
    }

    /**
     * ����creditType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditType(String value) {
        this.creditType = value;
    }

    /**
     * ��ȡcreditVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditVersion() {
        return creditVersion;
    }

    /**
     * ����creditVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditVersion(String value) {
        this.creditVersion = value;
    }

    /**
     * ��ȡdebtRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDebtRate() {
        return debtRate;
    }

    /**
     * ����debtRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDebtRate(Float value) {
        this.debtRate = value;
    }

    /**
     * ��ȡfiveCategorie���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiveCategorie() {
        return fiveCategorie;
    }

    /**
     * ����fiveCategorie���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiveCategorie(String value) {
        this.fiveCategorie = value;
    }

    /**
     * ��ȡhouseLonAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseLonAmt() {
        return houseLonAmt;
    }

    /**
     * ����houseLonAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseLonAmt(BigDecimal value) {
        this.houseLonAmt = value;
    }

    /**
     * ��ȡhouseMonthRepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseMonthRepayAmt() {
        return houseMonthRepayAmt;
    }

    /**
     * ����houseMonthRepayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseMonthRepayAmt(BigDecimal value) {
        this.houseMonthRepayAmt = value;
    }

    /**
     * ��ȡhouseNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHouseNum() {
        return houseNum;
    }

    /**
     * ����houseNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHouseNum(Integer value) {
        this.houseNum = value;
    }

    /**
     * ��ȡhouseRemainAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseRemainAmt() {
        return houseRemainAmt;
    }

    /**
     * ����houseRemainAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseRemainAmt(BigDecimal value) {
        this.houseRemainAmt = value;
    }

    /**
     * ��ȡinterDebtRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInterDebtRate() {
        return interDebtRate;
    }

    /**
     * ����interDebtRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInterDebtRate(Float value) {
        this.interDebtRate = value;
    }

    /**
     * ��ȡlast2Day���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast2Day() {
        return last2Day;
    }

    /**
     * ����last2Day���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast2Day(String value) {
        this.last2Day = value;
    }

    /**
     * ��ȡlast6Credit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLast6Credit() {
        return last6Credit;
    }

    /**
     * ����last6Credit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLast6Credit(Integer value) {
        this.last6Credit = value;
    }

    /**
     * ��ȡlast6CreditAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLast6CreditAmt() {
        return last6CreditAmt;
    }

    /**
     * ����last6CreditAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLast6CreditAmt(BigDecimal value) {
        this.last6CreditAmt = value;
    }

    /**
     * ��ȡlast6CreditNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLast6CreditNum() {
        return last6CreditNum;
    }

    /**
     * ����last6CreditNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLast6CreditNum(Integer value) {
        this.last6CreditNum = value;
    }

    /**
     * ��ȡlongestYear���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLongestYear() {
        return longestYear;
    }

    /**
     * ����longestYear���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLongestYear(Integer value) {
        this.longestYear = value;
    }

    /**
     * ��ȡmaxExceedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxExceedTime() {
        return maxExceedTime;
    }

    /**
     * ����maxExceedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxExceedTime(Integer value) {
        this.maxExceedTime = value;
    }

    /**
     * ��ȡmfsResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfsResult() {
        return mfsResult;
    }

    /**
     * ����mfsResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfsResult(String value) {
        this.mfsResult = value;
    }

    /**
     * ��ȡmonthDebtAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthDebtAmt() {
        return monthDebtAmt;
    }

    /**
     * ����monthDebtAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthDebtAmt(BigDecimal value) {
        this.monthDebtAmt = value;
    }

    /**
     * ��ȡmonthDebtRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMonthDebtRate() {
        return monthDebtRate;
    }

    /**
     * ����monthDebtRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMonthDebtRate(Float value) {
        this.monthDebtRate = value;
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
     * ��ȡqueryTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryTime() {
        return queryTime;
    }

    /**
     * ����queryTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryTime(String value) {
        this.queryTime = value;
    }

    /**
     * ��ȡriskGrade���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskGrade() {
        return riskGrade;
    }

    /**
     * ����riskGrade���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskGrade(String value) {
        this.riskGrade = value;
    }

    /**
     * ��ȡruleMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleMessage() {
        return ruleMessage;
    }

    /**
     * ����ruleMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleMessage(String value) {
        this.ruleMessage = value;
    }

    /**
     * ��ȡscore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * ����score���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScore(BigDecimal value) {
        this.score = value;
    }

    /**
     * ��ȡselfQuery���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelfQuery() {
        return selfQuery;
    }

    /**
     * ����selfQuery���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelfQuery(Integer value) {
        this.selfQuery = value;
    }

    /**
     * ��ȡsixMonthOver���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSixMonthOver() {
        return sixMonthOver;
    }

    /**
     * ����sixMonthOver���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSixMonthOver(BigDecimal value) {
        this.sixMonthOver = value;
    }

    /**
     * ��ȡsixMonthShouldPay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSixMonthShouldPay() {
        return sixMonthShouldPay;
    }

    /**
     * ����sixMonthShouldPay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSixMonthShouldPay(BigDecimal value) {
        this.sixMonthShouldPay = value;
    }

    /**
     * ��ȡsuggestAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuggestAmt() {
        return suggestAmt;
    }

    /**
     * ����suggestAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuggestAmt(BigDecimal value) {
        this.suggestAmt = value;
    }

    /**
     * ��ȡsuggestTimes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuggestTimes() {
        return suggestTimes;
    }

    /**
     * ����suggestTimes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuggestTimes(BigDecimal value) {
        this.suggestTimes = value;
    }

    /**
     * ��ȡsumDebtRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSumDebtRate() {
        return sumDebtRate;
    }

    /**
     * ����sumDebtRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSumDebtRate(Float value) {
        this.sumDebtRate = value;
    }

    /**
     * ��ȡtotalLoan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLoan() {
        return totalLoan;
    }

    /**
     * ����totalLoan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLoan(BigDecimal value) {
        this.totalLoan = value;
    }

    /**
     * ��ȡyear2Last2Num���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear2Last2Num() {
        return year2Last2Num;
    }

    /**
     * ����year2Last2Num���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear2Last2Num(Integer value) {
        this.year2Last2Num = value;
    }

}
