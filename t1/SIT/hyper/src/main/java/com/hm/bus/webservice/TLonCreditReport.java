
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonCreditReport complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取carLonAmt属性的值。
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
     * 设置carLonAmt属性的值。
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
     * 获取carLonSum属性的值。
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
     * 设置carLonSum属性的值。
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
     * 获取carMonthRepayAmt属性的值。
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
     * 设置carMonthRepayAmt属性的值。
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
     * 获取carRemainAmt属性的值。
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
     * 设置carRemainAmt属性的值。
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
     * 获取carRepayAmt属性的值。
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
     * 设置carRepayAmt属性的值。
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
     * 获取cardMaxLimitAmt属性的值。
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
     * 设置cardMaxLimitAmt属性的值。
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
     * 获取checkMonthIncomeAmt属性的值。
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
     * 设置checkMonthIncomeAmt属性的值。
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
     * 获取creditBlank属性的值。
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
     * 设置creditBlank属性的值。
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
     * 获取creditCardLimitAmt属性的值。
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
     * 设置creditCardLimitAmt属性的值。
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
     * 获取creditCardLowRepayAmt属性的值。
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
     * 设置creditCardLowRepayAmt属性的值。
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
     * 获取creditCardNum属性的值。
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
     * 设置creditCardNum属性的值。
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
     * 获取creditCardOverLimitAmt属性的值。
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
     * 设置creditCardOverLimitAmt属性的值。
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
     * 获取creditCardStatus属性的值。
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
     * 设置creditCardStatus属性的值。
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
     * 获取creditCardSumLimitAmt属性的值。
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
     * 设置creditCardSumLimitAmt属性的值。
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
     * 获取creditCardTotolnum属性的值。
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
     * 设置creditCardTotolnum属性的值。
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
     * 获取creditListSumAmt属性的值。
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
     * 设置creditListSumAmt属性的值。
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
     * 获取creditListSumAmtOther属性的值。
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
     * 设置creditListSumAmtOther属性的值。
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
     * 获取creditLoanSumAmt属性的值。
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
     * 设置creditLoanSumAmt属性的值。
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
     * 获取creditLoanSumAmtOther属性的值。
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
     * 设置creditLoanSumAmtOther属性的值。
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
     * 获取creditLoansNum属性的值。
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
     * 设置creditLoansNum属性的值。
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
     * 获取creditLoansNumOther属性的值。
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
     * 设置creditLoansNumOther属性的值。
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
     * 获取creditMaxage属性的值。
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
     * 设置creditMaxage属性的值。
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
     * 获取creditMonthRepayAmt属性的值。
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
     * 设置creditMonthRepayAmt属性的值。
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
     * 获取creditMonthRepayAmtOther属性的值。
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
     * 设置creditMonthRepayAmtOther属性的值。
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
     * 获取creditRemainAmt属性的值。
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
     * 设置creditRemainAmt属性的值。
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
     * 获取creditRemainAmtOther属性的值。
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
     * 设置creditRemainAmtOther属性的值。
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
     * 获取creditRepayAmt属性的值。
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
     * 设置creditRepayAmt属性的值。
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
     * 获取creditReportId属性的值。
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
     * 设置creditReportId属性的值。
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
     * 获取creditType属性的值。
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
     * 设置creditType属性的值。
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
     * 获取creditVersion属性的值。
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
     * 设置creditVersion属性的值。
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
     * 获取debtRate属性的值。
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
     * 设置debtRate属性的值。
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
     * 获取fiveCategorie属性的值。
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
     * 设置fiveCategorie属性的值。
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
     * 获取houseLonAmt属性的值。
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
     * 设置houseLonAmt属性的值。
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
     * 获取houseMonthRepayAmt属性的值。
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
     * 设置houseMonthRepayAmt属性的值。
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
     * 获取houseNum属性的值。
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
     * 设置houseNum属性的值。
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
     * 获取houseRemainAmt属性的值。
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
     * 设置houseRemainAmt属性的值。
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
     * 获取interDebtRate属性的值。
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
     * 设置interDebtRate属性的值。
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
     * 获取last2Day属性的值。
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
     * 设置last2Day属性的值。
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
     * 获取last6Credit属性的值。
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
     * 设置last6Credit属性的值。
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
     * 获取last6CreditAmt属性的值。
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
     * 设置last6CreditAmt属性的值。
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
     * 获取last6CreditNum属性的值。
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
     * 设置last6CreditNum属性的值。
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
     * 获取longestYear属性的值。
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
     * 设置longestYear属性的值。
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
     * 获取maxExceedTime属性的值。
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
     * 设置maxExceedTime属性的值。
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
     * 获取mfsResult属性的值。
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
     * 设置mfsResult属性的值。
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
     * 获取monthDebtAmt属性的值。
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
     * 设置monthDebtAmt属性的值。
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
     * 获取monthDebtRate属性的值。
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
     * 设置monthDebtRate属性的值。
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
     * 获取queryTime属性的值。
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
     * 设置queryTime属性的值。
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
     * 获取riskGrade属性的值。
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
     * 设置riskGrade属性的值。
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
     * 获取ruleMessage属性的值。
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
     * 设置ruleMessage属性的值。
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
     * 获取score属性的值。
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
     * 设置score属性的值。
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
     * 获取selfQuery属性的值。
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
     * 设置selfQuery属性的值。
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
     * 获取sixMonthOver属性的值。
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
     * 设置sixMonthOver属性的值。
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
     * 获取sixMonthShouldPay属性的值。
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
     * 设置sixMonthShouldPay属性的值。
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
     * 获取suggestAmt属性的值。
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
     * 设置suggestAmt属性的值。
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
     * 获取suggestTimes属性的值。
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
     * 设置suggestTimes属性的值。
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
     * 获取sumDebtRate属性的值。
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
     * 设置sumDebtRate属性的值。
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
     * 获取totalLoan属性的值。
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
     * 设置totalLoan属性的值。
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
     * 获取year2Last2Num属性的值。
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
     * 设置year2Last2Num属性的值。
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
