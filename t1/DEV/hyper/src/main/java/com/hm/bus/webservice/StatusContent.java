
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>statusContent complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡapplyAmt���Ե�ֵ��
     * 
     */
    public float getApplyAmt() {
        return applyAmt;
    }

    /**
     * ����applyAmt���Ե�ֵ��
     * 
     */
    public void setApplyAmt(float value) {
        this.applyAmt = value;
    }

    /**
     * ��ȡapplyDate���Ե�ֵ��
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
     * ����applyDate���Ե�ֵ��
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
     * ��ȡapproveEndTime���Ե�ֵ��
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
     * ����approveEndTime���Ե�ֵ��
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
     * ��ȡapproveRefuseReason���Ե�ֵ��
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
     * ����approveRefuseReason���Ե�ֵ��
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
     * ��ȡapproveRemark���Ե�ֵ��
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
     * ����approveRemark���Ե�ֵ��
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
     * ��ȡapproveSuggestAmt���Ե�ֵ��
     * 
     */
    public float getApproveSuggestAmt() {
        return approveSuggestAmt;
    }

    /**
     * ����approveSuggestAmt���Ե�ֵ��
     * 
     */
    public void setApproveSuggestAmt(float value) {
        this.approveSuggestAmt = value;
    }

    /**
     * ��ȡapproveSuggestTime���Ե�ֵ��
     * 
     */
    public int getApproveSuggestTime() {
        return approveSuggestTime;
    }

    /**
     * ����approveSuggestTime���Ե�ֵ��
     * 
     */
    public void setApproveSuggestTime(int value) {
        this.approveSuggestTime = value;
    }

    /**
     * ��ȡcheckEndTime���Ե�ֵ��
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
     * ����checkEndTime���Ե�ֵ��
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
     * ��ȡcheckRefuseReason���Ե�ֵ��
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
     * ����checkRefuseReason���Ե�ֵ��
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
     * ��ȡendReason���Ե�ֵ��
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
     * ����endReason���Ե�ֵ��
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
     * ��ȡloanDate���Ե�ֵ��
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
     * ����loanDate���Ե�ֵ��
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
     * ��ȡmonthRate���Ե�ֵ��
     * 
     */
    public float getMonthRate() {
        return monthRate;
    }

    /**
     * ����monthRate���Ե�ֵ��
     * 
     */
    public void setMonthRate(float value) {
        this.monthRate = value;
    }

    /**
     * ��ȡphone���Ե�ֵ��
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
     * ����phone���Ե�ֵ��
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
     * ��ȡproductId���Ե�ֵ��
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
     * ����productId���Ե�ֵ��
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
     * ��ȡproductName���Ե�ֵ��
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
     * ����productName���Ե�ֵ��
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

    /**
     * ��ȡstatus���Ե�ֵ��
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
     * ����status���Ե�ֵ��
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
     * ��ȡsuggestRemark���Ե�ֵ��
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
     * ����suggestRemark���Ե�ֵ��
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
     * ��ȡtimeLimit���Ե�ֵ��
     * 
     */
    public int getTimeLimit() {
        return timeLimit;
    }

    /**
     * ����timeLimit���Ե�ֵ��
     * 
     */
    public void setTimeLimit(int value) {
        this.timeLimit = value;
    }

}
