
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>contractCondition complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡinterestRule���Ե�ֵ��
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
     * ����interestRule���Ե�ֵ��
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
     * ��ȡloanAmount���Ե�ֵ��
     * 
     */
    public float getLoanAmount() {
        return loanAmount;
    }

    /**
     * ����loanAmount���Ե�ֵ��
     * 
     */
    public void setLoanAmount(float value) {
        this.loanAmount = value;
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
     * ��ȡproductId���Ե�ֵ��
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * ����productId���Ե�ֵ��
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * ��ȡrate���Ե�ֵ��
     * 
     */
    public double getRate() {
        return rate;
    }

    /**
     * ����rate���Ե�ֵ��
     * 
     */
    public void setRate(double value) {
        this.rate = value;
    }

    /**
     * ��ȡreturnRateAdjustFactor���Ե�ֵ��
     * 
     */
    public int getReturnRateAdjustFactor() {
        return returnRateAdjustFactor;
    }

    /**
     * ����returnRateAdjustFactor���Ե�ֵ��
     * 
     */
    public void setReturnRateAdjustFactor(int value) {
        this.returnRateAdjustFactor = value;
    }

    /**
     * ��ȡreturnRateBeginFactor���Ե�ֵ��
     * 
     */
    public int getReturnRateBeginFactor() {
        return returnRateBeginFactor;
    }

    /**
     * ����returnRateBeginFactor���Ե�ֵ��
     * 
     */
    public void setReturnRateBeginFactor(int value) {
        this.returnRateBeginFactor = value;
    }

    /**
     * ��ȡterm���Ե�ֵ��
     * 
     */
    public int getTerm() {
        return term;
    }

    /**
     * ����term���Ե�ֵ��
     * 
     */
    public void setTerm(int value) {
        this.term = value;
    }

}
