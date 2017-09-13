
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>contractGenPayPlan complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="contractGenPayPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="field1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="fineInterest" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="interest" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="isPayOff" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="leftAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="loanTermNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="offerDay" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="payAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="payAmountDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="prePayAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="prePayPenaltyFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="prePayWithReturnFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="returnPrincipal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yqDay" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractGenPayPlan", propOrder = {
    "field1",
    "fineInterest",
    "interest",
    "isPayOff",
    "leftAmount",
    "loanTermNum",
    "offerDay",
    "payAmount",
    "payAmountDiscount",
    "payDate",
    "prePayAmount",
    "prePayPenaltyFee",
    "prePayWithReturnFee",
    "returnPrincipal",
    "yqDay"
})
public class ContractGenPayPlan {

    protected double field1;
    protected double fineInterest;
    protected double interest;
    protected int isPayOff;
    protected double leftAmount;
    protected int loanTermNum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offerDay;
    protected double payAmount;
    protected double payAmountDiscount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    protected double prePayAmount;
    protected double prePayPenaltyFee;
    protected double prePayWithReturnFee;
    protected double returnPrincipal;
    protected int yqDay;

    /**
     * 获取field1属性的值。
     * 
     */
    public double getField1() {
        return field1;
    }

    /**
     * 设置field1属性的值。
     * 
     */
    public void setField1(double value) {
        this.field1 = value;
    }

    /**
     * 获取fineInterest属性的值。
     * 
     */
    public double getFineInterest() {
        return fineInterest;
    }

    /**
     * 设置fineInterest属性的值。
     * 
     */
    public void setFineInterest(double value) {
        this.fineInterest = value;
    }

    /**
     * 获取interest属性的值。
     * 
     */
    public double getInterest() {
        return interest;
    }

    /**
     * 设置interest属性的值。
     * 
     */
    public void setInterest(double value) {
        this.interest = value;
    }

    /**
     * 获取isPayOff属性的值。
     * 
     */
    public int getIsPayOff() {
        return isPayOff;
    }

    /**
     * 设置isPayOff属性的值。
     * 
     */
    public void setIsPayOff(int value) {
        this.isPayOff = value;
    }

    /**
     * 获取leftAmount属性的值。
     * 
     */
    public double getLeftAmount() {
        return leftAmount;
    }

    /**
     * 设置leftAmount属性的值。
     * 
     */
    public void setLeftAmount(double value) {
        this.leftAmount = value;
    }

    /**
     * 获取loanTermNum属性的值。
     * 
     */
    public int getLoanTermNum() {
        return loanTermNum;
    }

    /**
     * 设置loanTermNum属性的值。
     * 
     */
    public void setLoanTermNum(int value) {
        this.loanTermNum = value;
    }

    /**
     * 获取offerDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferDay() {
        return offerDay;
    }

    /**
     * 设置offerDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferDay(XMLGregorianCalendar value) {
        this.offerDay = value;
    }

    /**
     * 获取payAmount属性的值。
     * 
     */
    public double getPayAmount() {
        return payAmount;
    }

    /**
     * 设置payAmount属性的值。
     * 
     */
    public void setPayAmount(double value) {
        this.payAmount = value;
    }

    /**
     * 获取payAmountDiscount属性的值。
     * 
     */
    public double getPayAmountDiscount() {
        return payAmountDiscount;
    }

    /**
     * 设置payAmountDiscount属性的值。
     * 
     */
    public void setPayAmountDiscount(double value) {
        this.payAmountDiscount = value;
    }

    /**
     * 获取payDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDate() {
        return payDate;
    }

    /**
     * 设置payDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDate(XMLGregorianCalendar value) {
        this.payDate = value;
    }

    /**
     * 获取prePayAmount属性的值。
     * 
     */
    public double getPrePayAmount() {
        return prePayAmount;
    }

    /**
     * 设置prePayAmount属性的值。
     * 
     */
    public void setPrePayAmount(double value) {
        this.prePayAmount = value;
    }

    /**
     * 获取prePayPenaltyFee属性的值。
     * 
     */
    public double getPrePayPenaltyFee() {
        return prePayPenaltyFee;
    }

    /**
     * 设置prePayPenaltyFee属性的值。
     * 
     */
    public void setPrePayPenaltyFee(double value) {
        this.prePayPenaltyFee = value;
    }

    /**
     * 获取prePayWithReturnFee属性的值。
     * 
     */
    public double getPrePayWithReturnFee() {
        return prePayWithReturnFee;
    }

    /**
     * 设置prePayWithReturnFee属性的值。
     * 
     */
    public void setPrePayWithReturnFee(double value) {
        this.prePayWithReturnFee = value;
    }

    /**
     * 获取returnPrincipal属性的值。
     * 
     */
    public double getReturnPrincipal() {
        return returnPrincipal;
    }

    /**
     * 设置returnPrincipal属性的值。
     * 
     */
    public void setReturnPrincipal(double value) {
        this.returnPrincipal = value;
    }

    /**
     * 获取yqDay属性的值。
     * 
     */
    public int getYqDay() {
        return yqDay;
    }

    /**
     * 设置yqDay属性的值。
     * 
     */
    public void setYqDay(int value) {
        this.yqDay = value;
    }

}
