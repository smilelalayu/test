
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>statusContent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="statusContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applyAmt" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="applyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveRefuseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveSuggestAmt" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="approveSuggestTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="checkEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkRefuseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suggestRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusContent", propOrder = {
    "applyAmt",
    "applyDate",
    "approveEndTime",
    "approveRefuseReason",
    "approveRemark",
    "approveSuggestAmt",
    "approveSuggestTime",
    "checkEndTime",
    "checkRefuseReason",
    "customerName",
    "endReason",
    "loanDate",
    "monthRate",
    "phone",
    "productId",
    "productName",
    "remark",
    "status",
    "suggestRemark",
    "timeLimit"
})
public class StatusContent {

    protected float applyAmt;
    protected String applyDate;
    protected String approveEndTime;
    protected String approveRefuseReason;
    protected String approveRemark;
    protected float approveSuggestAmt;
    protected int approveSuggestTime;
    protected String checkEndTime;
    protected String checkRefuseReason;
    protected String customerName;
    protected String endReason;
    protected String loanDate;
    protected float monthRate;
    protected String phone;
    protected String productId;
    protected String productName;
    protected String remark;
    protected String status;
    protected String suggestRemark;
    protected int timeLimit;

    /**
     * 获取applyAmt属性的值。
     * 
     */
    public float getApplyAmt() {
        return applyAmt;
    }

    /**
     * 设置applyAmt属性的值。
     * 
     */
    public void setApplyAmt(float value) {
        this.applyAmt = value;
    }

    /**
     * 获取applyDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * 设置applyDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyDate(String value) {
        this.applyDate = value;
    }

    /**
     * 获取approveEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveEndTime() {
        return approveEndTime;
    }

    /**
     * 设置approveEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveEndTime(String value) {
        this.approveEndTime = value;
    }

    /**
     * 获取approveRefuseReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveRefuseReason() {
        return approveRefuseReason;
    }

    /**
     * 设置approveRefuseReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveRefuseReason(String value) {
        this.approveRefuseReason = value;
    }

    /**
     * 获取approveRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveRemark() {
        return approveRemark;
    }

    /**
     * 设置approveRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveRemark(String value) {
        this.approveRemark = value;
    }

    /**
     * 获取approveSuggestAmt属性的值。
     * 
     */
    public float getApproveSuggestAmt() {
        return approveSuggestAmt;
    }

    /**
     * 设置approveSuggestAmt属性的值。
     * 
     */
    public void setApproveSuggestAmt(float value) {
        this.approveSuggestAmt = value;
    }

    /**
     * 获取approveSuggestTime属性的值。
     * 
     */
    public int getApproveSuggestTime() {
        return approveSuggestTime;
    }

    /**
     * 设置approveSuggestTime属性的值。
     * 
     */
    public void setApproveSuggestTime(int value) {
        this.approveSuggestTime = value;
    }

    /**
     * 获取checkEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckEndTime() {
        return checkEndTime;
    }

    /**
     * 设置checkEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckEndTime(String value) {
        this.checkEndTime = value;
    }

    /**
     * 获取checkRefuseReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckRefuseReason() {
        return checkRefuseReason;
    }

    /**
     * 设置checkRefuseReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckRefuseReason(String value) {
        this.checkRefuseReason = value;
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
     * 获取endReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndReason() {
        return endReason;
    }

    /**
     * 设置endReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndReason(String value) {
        this.endReason = value;
    }

    /**
     * 获取loanDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanDate() {
        return loanDate;
    }

    /**
     * 设置loanDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanDate(String value) {
        this.loanDate = value;
    }

    /**
     * 获取monthRate属性的值。
     * 
     */
    public float getMonthRate() {
        return monthRate;
    }

    /**
     * 设置monthRate属性的值。
     * 
     */
    public void setMonthRate(float value) {
        this.monthRate = value;
    }

    /**
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取productId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置productId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * 获取productName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置productName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
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

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取suggestRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestRemark() {
        return suggestRemark;
    }

    /**
     * 设置suggestRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestRemark(String value) {
        this.suggestRemark = value;
    }

    /**
     * 获取timeLimit属性的值。
     * 
     */
    public int getTimeLimit() {
        return timeLimit;
    }

    /**
     * 设置timeLimit属性的值。
     * 
     */
    public void setTimeLimit(int value) {
        this.timeLimit = value;
    }

}
