
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
 * <p>contractGenOuput complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡaccountMngAmt���Ե�ֵ��
     * 
     */
    public float getAccountMngAmt() {
        return accountMngAmt;
    }

    /**
     * ����accountMngAmt���Ե�ֵ��
     * 
     */
    public void setAccountMngAmt(float value) {
        this.accountMngAmt = value;
    }

    /**
     * ��ȡborrowerMoney���Ե�ֵ��
     * 
     */
    public double getBorrowerMoney() {
        return borrowerMoney;
    }

    /**
     * ����borrowerMoney���Ե�ֵ��
     * 
     */
    public void setBorrowerMoney(double value) {
        this.borrowerMoney = value;
    }

    /**
     * ��ȡbufferEndDate���Ե�ֵ��
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
     * ����bufferEndDate���Ե�ֵ��
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
     * ��ȡconsultingFee���Ե�ֵ��
     * 
     */
    public double getConsultingFee() {
        return consultingFee;
    }

    /**
     * ����consultingFee���Ե�ֵ��
     * 
     */
    public void setConsultingFee(double value) {
        this.consultingFee = value;
    }

    /**
     * ��ȡconsultingServicesFee���Ե�ֵ��
     * 
     */
    public double getConsultingServicesFee() {
        return consultingServicesFee;
    }

    /**
     * ����consultingServicesFee���Ե�ֵ��
     * 
     */
    public void setConsultingServicesFee(double value) {
        this.consultingServicesFee = value;
    }

    /**
     * ��ȡdeductedAmount���Ե�ֵ��
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
     * ����deductedAmount���Ե�ֵ��
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
     * ��ȡdepositAmt���Ե�ֵ��
     * 
     */
    public float getDepositAmt() {
        return depositAmt;
    }

    /**
     * ����depositAmt���Ե�ֵ��
     * 
     */
    public void setDepositAmt(float value) {
        this.depositAmt = value;
    }

    /**
     * ��ȡdepositAmtRate���Ե�ֵ��
     * 
     */
    public float getDepositAmtRate() {
        return depositAmtRate;
    }

    /**
     * ����depositAmtRate���Ե�ֵ��
     * 
     */
    public void setDepositAmtRate(float value) {
        this.depositAmtRate = value;
    }

    /**
     * ��ȡfirstPay���Ե�ֵ��
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
     * ����firstPay���Ե�ֵ��
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
     * ��ȡfirstPayDate���Ե�ֵ��
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
     * ����firstPayDate���Ե�ֵ��
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
     * ��ȡhandChargeRate���Ե�ֵ��
     * 
     */
    public float getHandChargeRate() {
        return handChargeRate;
    }

    /**
     * ����handChargeRate���Ե�ֵ��
     * 
     */
    public void setHandChargeRate(float value) {
        this.handChargeRate = value;
    }

    /**
     * ��ȡincome9F���Ե�ֵ��
     * 
     */
    public double getIncome9F() {
        return income9F;
    }

    /**
     * ����income9F���Ե�ֵ��
     * 
     */
    public void setIncome9F(double value) {
        this.income9F = value;
    }

    /**
     * ��ȡinstInterest���Ե�ֵ��
     * 
     */
    public double getInstInterest() {
        return instInterest;
    }

    /**
     * ����instInterest���Ե�ֵ��
     * 
     */
    public void setInstInterest(double value) {
        this.instInterest = value;
    }

    /**
     * ��ȡinstInterestAccount���Ե�ֵ��
     * 
     */
    public double getInstInterestAccount() {
        return instInterestAccount;
    }

    /**
     * ����instInterestAccount���Ե�ֵ��
     * 
     */
    public void setInstInterestAccount(double value) {
        this.instInterestAccount = value;
    }

    /**
     * ��ȡinstPrice���Ե�ֵ��
     * 
     */
    public double getInstPrice() {
        return instPrice;
    }

    /**
     * ����instPrice���Ե�ֵ��
     * 
     */
    public void setInstPrice(double value) {
        this.instPrice = value;
    }

    /**
     * ��ȡinstitutionalMonthPay���Ե�ֵ��
     * 
     */
    public double getInstitutionalMonthPay() {
        return institutionalMonthPay;
    }

    /**
     * ����institutionalMonthPay���Ե�ֵ��
     * 
     */
    public void setInstitutionalMonthPay(double value) {
        this.institutionalMonthPay = value;
    }

    /**
     * ��ȡlivestockPay���Ե�ֵ��
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
     * ����livestockPay���Ե�ֵ��
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
     * ��ȡloanAmount���Ե�ֵ��
     * 
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * ����loanAmount���Ե�ֵ��
     * 
     */
    public void setLoanAmount(double value) {
        this.loanAmount = value;
    }

    /**
     * ��ȡloanDate���Ե�ֵ��
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
     * ����loanDate���Ե�ֵ��
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
     * ��ȡloanRate���Ե�ֵ��
     * 
     */
    public double getLoanRate() {
        return loanRate;
    }

    /**
     * ����loanRate���Ե�ֵ��
     * 
     */
    public void setLoanRate(double value) {
        this.loanRate = value;
    }

    /**
     * ��ȡloanTerm���Ե�ֵ��
     * 
     */
    public int getLoanTerm() {
        return loanTerm;
    }

    /**
     * ����loanTerm���Ե�ֵ��
     * 
     */
    public void setLoanTerm(int value) {
        this.loanTerm = value;
    }

    /**
     * ��ȡmonthlyLoanRate���Ե�ֵ��
     * 
     */
    public double getMonthlyLoanRate() {
        return monthlyLoanRate;
    }

    /**
     * ����monthlyLoanRate���Ե�ֵ��
     * 
     */
    public void setMonthlyLoanRate(double value) {
        this.monthlyLoanRate = value;
    }

    /**
     * ��ȡmonthlyPay���Ե�ֵ��
     * 
     */
    public double getMonthlyPay() {
        return monthlyPay;
    }

    /**
     * ����monthlyPay���Ե�ֵ��
     * 
     */
    public void setMonthlyPay(double value) {
        this.monthlyPay = value;
    }

    /**
     * ��ȡpackageRate���Ե�ֵ��
     * 
     */
    public double getPackageRate() {
        return packageRate;
    }

    /**
     * ����packageRate���Ե�ֵ��
     * 
     */
    public void setPackageRate(double value) {
        this.packageRate = value;
    }

    /**
     * ��ȡpayDay���Ե�ֵ��
     * 
     */
    public int getPayDay() {
        return payDay;
    }

    /**
     * ����payDay���Ե�ֵ��
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
     * ��ȡpayType���Ե�ֵ��
     * 
     */
    public int getPayType() {
        return payType;
    }

    /**
     * ����payType���Ե�ֵ��
     * 
     */
    public void setPayType(int value) {
        this.payType = value;
    }

    /**
     * ��ȡrebateRate���Ե�ֵ��
     * 
     */
    public double getRebateRate() {
        return rebateRate;
    }

    /**
     * ����rebateRate���Ե�ֵ��
     * 
     */
    public void setRebateRate(double value) {
        this.rebateRate = value;
    }

    /**
     * ��ȡriskAmtRate���Ե�ֵ��
     * 
     */
    public float getRiskAmtRate() {
        return riskAmtRate;
    }

    /**
     * ����riskAmtRate���Ե�ֵ��
     * 
     */
    public void setRiskAmtRate(float value) {
        this.riskAmtRate = value;
    }

    /**
     * ��ȡriskFee���Ե�ֵ��
     * 
     */
    public double getRiskFee() {
        return riskFee;
    }

    /**
     * ����riskFee���Ե�ֵ��
     * 
     */
    public void setRiskFee(double value) {
        this.riskFee = value;
    }

    /**
     * ��ȡserviceFee���Ե�ֵ��
     * 
     */
    public double getServiceFee() {
        return serviceFee;
    }

    /**
     * ����serviceFee���Ե�ֵ��
     * 
     */
    public void setServiceFee(double value) {
        this.serviceFee = value;
    }

    /**
     * ��ȡstudentInterestMonthPay���Ե�ֵ��
     * 
     */
    public double getStudentInterestMonthPay() {
        return studentInterestMonthPay;
    }

    /**
     * ����studentInterestMonthPay���Ե�ֵ��
     * 
     */
    public void setStudentInterestMonthPay(double value) {
        this.studentInterestMonthPay = value;
    }

    /**
     * ��ȡstudentMonthPay���Ե�ֵ��
     * 
     */
    public double getStudentMonthPay() {
        return studentMonthPay;
    }

    /**
     * ����studentMonthPay���Ե�ֵ��
     * 
     */
    public void setStudentMonthPay(double value) {
        this.studentMonthPay = value;
    }

    /**
     * ��ȡtotalAmount���Ե�ֵ��
     * 
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * ����totalAmount���Ե�ֵ��
     * 
     */
    public void setTotalAmount(double value) {
        this.totalAmount = value;
    }

    /**
     * ��ȡtotalFee���Ե�ֵ��
     * 
     */
    public double getTotalFee() {
        return totalFee;
    }

    /**
     * ����totalFee���Ե�ֵ��
     * 
     */
    public void setTotalFee(double value) {
        this.totalFee = value;
    }

    /**
     * ��ȡyearlyLoanRate���Ե�ֵ��
     * 
     */
    public double getYearlyLoanRate() {
        return yearlyLoanRate;
    }

    /**
     * ����yearlyLoanRate���Ե�ֵ��
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
