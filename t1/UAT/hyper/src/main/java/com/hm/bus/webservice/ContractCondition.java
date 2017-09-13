
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>contractCondition complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="contractCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interestRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="payType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="returnRateAdjustFactor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="returnRateBeginFactor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractCondition", propOrder = {
    "interestRule",
    "loanAmount",
    "payType",
    "productId",
    "rate",
    "returnRateAdjustFactor",
    "returnRateBeginFactor",
    "term"
})
public class ContractCondition {

    protected String interestRule;
    protected float loanAmount;
    protected int payType;
    protected long productId;
    protected double rate;
    protected int returnRateAdjustFactor;
    protected int returnRateBeginFactor;
    protected int term;

    /**
     * 获取interestRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRule() {
        return interestRule;
    }

    /**
     * 设置interestRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRule(String value) {
        this.interestRule = value;
    }

    /**
     * 获取loanAmount属性的值。
     * 
     */
    public float getLoanAmount() {
        return loanAmount;
    }

    /**
     * 设置loanAmount属性的值。
     * 
     */
    public void setLoanAmount(float value) {
        this.loanAmount = value;
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
     * 获取productId属性的值。
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * 设置productId属性的值。
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * 获取rate属性的值。
     * 
     */
    public double getRate() {
        return rate;
    }

    /**
     * 设置rate属性的值。
     * 
     */
    public void setRate(double value) {
        this.rate = value;
    }

    /**
     * 获取returnRateAdjustFactor属性的值。
     * 
     */
    public int getReturnRateAdjustFactor() {
        return returnRateAdjustFactor;
    }

    /**
     * 设置returnRateAdjustFactor属性的值。
     * 
     */
    public void setReturnRateAdjustFactor(int value) {
        this.returnRateAdjustFactor = value;
    }

    /**
     * 获取returnRateBeginFactor属性的值。
     * 
     */
    public int getReturnRateBeginFactor() {
        return returnRateBeginFactor;
    }

    /**
     * 设置returnRateBeginFactor属性的值。
     * 
     */
    public void setReturnRateBeginFactor(int value) {
        this.returnRateBeginFactor = value;
    }

    /**
     * 获取term属性的值。
     * 
     */
    public int getTerm() {
        return term;
    }

    /**
     * 设置term属性的值。
     * 
     */
    public void setTerm(int value) {
        this.term = value;
    }

}
