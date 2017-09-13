
package com.hm.bus.webservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>contractGenOuput complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="contractGenOuput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountMngAmt" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="borrowerMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bufferEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="consultingFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="consultingServicesFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="deductedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="depositAmt" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="depositAmtRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="firstPay" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="firstPayDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="handChargeRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="income9f" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="instInterest" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="instInterestAccount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="instPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="institutionalMonthPay" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="livestockPay" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="loanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="loanRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="loanTerm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monthlyLoanRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="monthlyPay" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="packageRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="payDay" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="payPlans" type="{http://biz.webservice.macrosky.com/}contractGenPayPlan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="payType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rebateRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="riskAmtRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="riskFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="serviceFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="studentInterestMonthPay" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="studentMonthPay" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yearlyLoanRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tLoanFeeInfolist" type="{http://biz.webservice.macrosky.com/}tLoanFeeInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractGenOuput", propOrder = {
    "accountMngAmt",
    "borrowerMoney",
    "bufferEndDate",
    "consultingFee",
    "consultingServicesFee",
    "deductedAmount",
    "depositAmt",
    "depositAmtRate",
    "firstPay",
    "firstPayDate",
    "handChargeRate",
    "income9F",
    "instInterest",
    "instInterestAccount",
    "instPrice",
    "institutionalMonthPay",
    "livestockPay",
    "loanAmount",
    "loanDate",
    "loanRate",
    "loanTerm",
    "monthlyLoanRate",
    "monthlyPay",
    "packageRate",
    "payDay",
    "payPlans",
    "payType",
    "rebateRate",
    "riskAmtRate",
    "riskFee",
    "serviceFee",
    "studentInterestMonthPay",
    "studentMonthPay",
    "totalAmount",
    "totalFee",
    "yearlyLoanRate",
    "tLoanFeeInfolist"
})
public class ContractGenOuput {

    protected float accountMngAmt;
    protected double borrowerMoney;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bufferEndDate;
    protected double consultingFee;
    protected double consultingServicesFee;
    protected BigDecimal deductedAmount;
    protected float depositAmt;
    protected float depositAmtRate;
    protected Double firstPay;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstPayDate;
    protected float handChargeRate;
    @XmlElement(name = "income9f")
    protected double income9F;
    protected double instInterest;
    protected double instInterestAccount;
    protected double instPrice;
    protected double institutionalMonthPay;
    protected Double livestockPay;
    protected double loanAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loanDate;
    protected double loanRate;
    protected int loanTerm;
    protected double monthlyLoanRate;
    protected double monthlyPay;
    protected double packageRate;
    protected int payDay;
    @XmlElement(nillable = true)
    protected List<ContractGenPayPlan> payPlans;
    protected int payType;
    protected double rebateRate;
    protected float riskAmtRate;
    protected double riskFee;
    protected double serviceFee;
    protected double studentInterestMonthPay;
    protected double studentMonthPay;
    protected double totalAmount;
    protected double totalFee;
    protected double yearlyLoanRate;
    @XmlElement(nillable = true)
    protected List<TLoanFeeInfo> tLoanFeeInfolist;

    /**
     * 获取accountMngAmt属性的值。
     * 
     */
    public float getAccountMngAmt() {
        return accountMngAmt;
    }

    /**
     * 设置accountMngAmt属性的值。
     * 
     */
    public void setAccountMngAmt(float value) {
        this.accountMngAmt = value;
    }

    /**
     * 获取borrowerMoney属性的值。
     * 
     */
    public double getBorrowerMoney() {
        return borrowerMoney;
    }

    /**
     * 设置borrowerMoney属性的值。
     * 
     */
    public void setBorrowerMoney(double value) {
        this.borrowerMoney = value;
    }

    /**
     * 获取bufferEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBufferEndDate() {
        return bufferEndDate;
    }

    /**
     * 设置bufferEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBufferEndDate(XMLGregorianCalendar value) {
        this.bufferEndDate = value;
    }

    /**
     * 获取consultingFee属性的值。
     * 
     */
    public double getConsultingFee() {
        return consultingFee;
    }

    /**
     * 设置consultingFee属性的值。
     * 
     */
    public void setConsultingFee(double value) {
        this.consultingFee = value;
    }

    /**
     * 获取consultingServicesFee属性的值。
     * 
     */
    public double getConsultingServicesFee() {
        return consultingServicesFee;
    }

    /**
     * 设置consultingServicesFee属性的值。
     * 
     */
    public void setConsultingServicesFee(double value) {
        this.consultingServicesFee = value;
    }

    /**
     * 获取deductedAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductedAmount() {
        return deductedAmount;
    }

    /**
     * 设置deductedAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductedAmount(BigDecimal value) {
        this.deductedAmount = value;
    }

    /**
     * 获取depositAmt属性的值。
     * 
     */
    public float getDepositAmt() {
        return depositAmt;
    }

    /**
     * 设置depositAmt属性的值。
     * 
     */
    public void setDepositAmt(float value) {
        this.depositAmt = value;
    }

    /**
     * 获取depositAmtRate属性的值。
     * 
     */
    public float getDepositAmtRate() {
        return depositAmtRate;
    }

    /**
     * 设置depositAmtRate属性的值。
     * 
     */
    public void setDepositAmtRate(float value) {
        this.depositAmtRate = value;
    }

    /**
     * 获取firstPay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFirstPay() {
        return firstPay;
    }

    /**
     * 设置firstPay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFirstPay(Double value) {
        this.firstPay = value;
    }

    /**
     * 获取firstPayDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPayDate() {
        return firstPayDate;
    }

    /**
     * 设置firstPayDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPayDate(XMLGregorianCalendar value) {
        this.firstPayDate = value;
    }

    /**
     * 获取handChargeRate属性的值。
     * 
     */
    public float getHandChargeRate() {
        return handChargeRate;
    }

    /**
     * 设置handChargeRate属性的值。
     * 
     */
    public void setHandChargeRate(float value) {
        this.handChargeRate = value;
    }

    /**
     * 获取income9F属性的值。
     * 
     */
    public double getIncome9F() {
        return income9F;
    }

    /**
     * 设置income9F属性的值。
     * 
     */
    public void setIncome9F(double value) {
        this.income9F = value;
    }

    /**
     * 获取instInterest属性的值。
     * 
     */
    public double getInstInterest() {
        return instInterest;
    }

    /**
     * 设置instInterest属性的值。
     * 
     */
    public void setInstInterest(double value) {
        this.instInterest = value;
    }

    /**
     * 获取instInterestAccount属性的值。
     * 
     */
    public double getInstInterestAccount() {
        return instInterestAccount;
    }

    /**
     * 设置instInterestAccount属性的值。
     * 
     */
    public void setInstInterestAccount(double value) {
        this.instInterestAccount = value;
    }

    /**
     * 获取instPrice属性的值。
     * 
     */
    public double getInstPrice() {
        return instPrice;
    }

    /**
     * 设置instPrice属性的值。
     * 
     */
    public void setInstPrice(double value) {
        this.instPrice = value;
    }

    /**
     * 获取institutionalMonthPay属性的值。
     * 
     */
    public double getInstitutionalMonthPay() {
        return institutionalMonthPay;
    }

    /**
     * 设置institutionalMonthPay属性的值。
     * 
     */
    public void setInstitutionalMonthPay(double value) {
        this.institutionalMonthPay = value;
    }

    /**
     * 获取livestockPay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLivestockPay() {
        return livestockPay;
    }

    /**
     * 设置livestockPay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLivestockPay(Double value) {
        this.livestockPay = value;
    }

    /**
     * 获取loanAmount属性的值。
     * 
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * 设置loanAmount属性的值。
     * 
     */
    public void setLoanAmount(double value) {
        this.loanAmount = value;
    }

    /**
     * 获取loanDate属性的值。
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
     * 设置loanDate属性的值。
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
     * 获取loanRate属性的值。
     * 
     */
    public double getLoanRate() {
        return loanRate;
    }

    /**
     * 设置loanRate属性的值。
     * 
     */
    public void setLoanRate(double value) {
        this.loanRate = value;
    }

    /**
     * 获取loanTerm属性的值。
     * 
     */
    public int getLoanTerm() {
        return loanTerm;
    }

    /**
     * 设置loanTerm属性的值。
     * 
     */
    public void setLoanTerm(int value) {
        this.loanTerm = value;
    }

    /**
     * 获取monthlyLoanRate属性的值。
     * 
     */
    public double getMonthlyLoanRate() {
        return monthlyLoanRate;
    }

    /**
     * 设置monthlyLoanRate属性的值。
     * 
     */
    public void setMonthlyLoanRate(double value) {
        this.monthlyLoanRate = value;
    }

    /**
     * 获取monthlyPay属性的值。
     * 
     */
    public double getMonthlyPay() {
        return monthlyPay;
    }

    /**
     * 设置monthlyPay属性的值。
     * 
     */
    public void setMonthlyPay(double value) {
        this.monthlyPay = value;
    }

    /**
     * 获取packageRate属性的值。
     * 
     */
    public double getPackageRate() {
        return packageRate;
    }

    /**
     * 设置packageRate属性的值。
     * 
     */
    public void setPackageRate(double value) {
        this.packageRate = value;
    }

    /**
     * 获取payDay属性的值。
     * 
     */
    public int getPayDay() {
        return payDay;
    }

    /**
     * 设置payDay属性的值。
     * 
     */
    public void setPayDay(int value) {
        this.payDay = value;
    }

    /**
     * Gets the value of the payPlans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payPlans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayPlans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractGenPayPlan }
     * 
     * 
     */
    public List<ContractGenPayPlan> getPayPlans() {
        if (payPlans == null) {
            payPlans = new ArrayList<ContractGenPayPlan>();
        }
        return this.payPlans;
    }

    /**
     * 获取payType属性的值。
     * 
     */
    public int getPayType() {
        return payType;
    }

    /**
     * 设置payType属性的值。
     * 
     */
    public void setPayType(int value) {
        this.payType = value;
    }

    /**
     * 获取rebateRate属性的值。
     * 
     */
    public double getRebateRate() {
        return rebateRate;
    }

    /**
     * 设置rebateRate属性的值。
     * 
     */
    public void setRebateRate(double value) {
        this.rebateRate = value;
    }

    /**
     * 获取riskAmtRate属性的值。
     * 
     */
    public float getRiskAmtRate() {
        return riskAmtRate;
    }

    /**
     * 设置riskAmtRate属性的值。
     * 
     */
    public void setRiskAmtRate(float value) {
        this.riskAmtRate = value;
    }

    /**
     * 获取riskFee属性的值。
     * 
     */
    public double getRiskFee() {
        return riskFee;
    }

    /**
     * 设置riskFee属性的值。
     * 
     */
    public void setRiskFee(double value) {
        this.riskFee = value;
    }

    /**
     * 获取serviceFee属性的值。
     * 
     */
    public double getServiceFee() {
        return serviceFee;
    }

    /**
     * 设置serviceFee属性的值。
     * 
     */
    public void setServiceFee(double value) {
        this.serviceFee = value;
    }

    /**
     * 获取studentInterestMonthPay属性的值。
     * 
     */
    public double getStudentInterestMonthPay() {
        return studentInterestMonthPay;
    }

    /**
     * 设置studentInterestMonthPay属性的值。
     * 
     */
    public void setStudentInterestMonthPay(double value) {
        this.studentInterestMonthPay = value;
    }

    /**
     * 获取studentMonthPay属性的值。
     * 
     */
    public double getStudentMonthPay() {
        return studentMonthPay;
    }

    /**
     * 设置studentMonthPay属性的值。
     * 
     */
    public void setStudentMonthPay(double value) {
        this.studentMonthPay = value;
    }

    /**
     * 获取totalAmount属性的值。
     * 
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     * 
     */
    public void setTotalAmount(double value) {
        this.totalAmount = value;
    }

    /**
     * 获取totalFee属性的值。
     * 
     */
    public double getTotalFee() {
        return totalFee;
    }

    /**
     * 设置totalFee属性的值。
     * 
     */
    public void setTotalFee(double value) {
        this.totalFee = value;
    }

    /**
     * 获取yearlyLoanRate属性的值。
     * 
     */
    public double getYearlyLoanRate() {
        return yearlyLoanRate;
    }

    /**
     * 设置yearlyLoanRate属性的值。
     * 
     */
    public void setYearlyLoanRate(double value) {
        this.yearlyLoanRate = value;
    }

    /**
     * Gets the value of the tLoanFeeInfolist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tLoanFeeInfolist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTLoanFeeInfolist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLoanFeeInfo }
     * 
     * 
     */
    public List<TLoanFeeInfo> getTLoanFeeInfolist() {
        if (tLoanFeeInfolist == null) {
            tLoanFeeInfolist = new ArrayList<TLoanFeeInfo>();
        }
        return this.tLoanFeeInfolist;
    }

}
