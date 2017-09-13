
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>contractGenPayPlan complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfield1���Ե�ֵ��
     * 
     */
    public double getField1() {
        return field1;
    }

    /**
     * ����field1���Ե�ֵ��
     * 
     */
    public void setField1(double value) {
        this.field1 = value;
    }

    /**
     * ��ȡfineInterest���Ե�ֵ��
     * 
     */
    public double getFineInterest() {
        return fineInterest;
    }

    /**
     * ����fineInterest���Ե�ֵ��
     * 
     */
    public void setFineInterest(double value) {
        this.fineInterest = value;
    }

    /**
     * ��ȡinterest���Ե�ֵ��
     * 
     */
    public double getInterest() {
        return interest;
    }

    /**
     * ����interest���Ե�ֵ��
     * 
     */
    public void setInterest(double value) {
        this.interest = value;
    }

    /**
     * ��ȡisPayOff���Ե�ֵ��
     * 
     */
    public int getIsPayOff() {
        return isPayOff;
    }

    /**
     * ����isPayOff���Ե�ֵ��
     * 
     */
    public void setIsPayOff(int value) {
        this.isPayOff = value;
    }

    /**
     * ��ȡleftAmount���Ե�ֵ��
     * 
     */
    public double getLeftAmount() {
        return leftAmount;
    }

    /**
     * ����leftAmount���Ե�ֵ��
     * 
     */
    public void setLeftAmount(double value) {
        this.leftAmount = value;
    }

    /**
     * ��ȡloanTermNum���Ե�ֵ��
     * 
     */
    public int getLoanTermNum() {
        return loanTermNum;
    }

    /**
     * ����loanTermNum���Ե�ֵ��
     * 
     */
    public void setLoanTermNum(int value) {
        this.loanTermNum = value;
    }

    /**
     * ��ȡofferDay���Ե�ֵ��
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
     * ����offerDay���Ե�ֵ��
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
     * ��ȡpayAmount���Ե�ֵ��
     * 
     */
    public double getPayAmount() {
        return payAmount;
    }

    /**
     * ����payAmount���Ե�ֵ��
     * 
     */
    public void setPayAmount(double value) {
        this.payAmount = value;
    }

    /**
     * ��ȡpayAmountDiscount���Ե�ֵ��
     * 
     */
    public double getPayAmountDiscount() {
        return payAmountDiscount;
    }

    /**
     * ����payAmountDiscount���Ե�ֵ��
     * 
     */
    public void setPayAmountDiscount(double value) {
        this.payAmountDiscount = value;
    }

    /**
     * ��ȡpayDate���Ե�ֵ��
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
     * ����payDate���Ե�ֵ��
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
     * ��ȡprePayAmount���Ե�ֵ��
     * 
     */
    public double getPrePayAmount() {
        return prePayAmount;
    }

    /**
     * ����prePayAmount���Ե�ֵ��
     * 
     */
    public void setPrePayAmount(double value) {
        this.prePayAmount = value;
    }

    /**
     * ��ȡprePayPenaltyFee���Ե�ֵ��
     * 
     */
    public double getPrePayPenaltyFee() {
        return prePayPenaltyFee;
    }

    /**
     * ����prePayPenaltyFee���Ե�ֵ��
     * 
     */
    public void setPrePayPenaltyFee(double value) {
        this.prePayPenaltyFee = value;
    }

    /**
     * ��ȡprePayWithReturnFee���Ե�ֵ��
     * 
     */
    public double getPrePayWithReturnFee() {
        return prePayWithReturnFee;
    }

    /**
     * ����prePayWithReturnFee���Ե�ֵ��
     * 
     */
    public void setPrePayWithReturnFee(double value) {
        this.prePayWithReturnFee = value;
    }

    /**
     * ��ȡreturnPrincipal���Ե�ֵ��
     * 
     */
    public double getReturnPrincipal() {
        return returnPrincipal;
    }

    /**
     * ����returnPrincipal���Ե�ֵ��
     * 
     */
    public void setReturnPrincipal(double value) {
        this.returnPrincipal = value;
    }

    /**
     * ��ȡyqDay���Ե�ֵ��
     * 
     */
    public int getYqDay() {
        return yqDay;
    }

    /**
     * ����yqDay���Ե�ֵ��
     * 
     */
    public void setYqDay(int value) {
        this.yqDay = value;
    }

}
