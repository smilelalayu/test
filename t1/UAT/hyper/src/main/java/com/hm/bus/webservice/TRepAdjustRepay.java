
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tRepAdjustRepay complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tRepAdjustRepay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="adjustRepayId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="adjustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="appTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkSuggest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="haveOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lonApplication" type="{http://biz.webservice.macrosky.com/}tLonApplication" minOccurs="0"/&gt;
 *         &lt;element name="mendTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextRepayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="planRepayTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repaymentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tempCardBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tempCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tmepCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRepAdjustRepay", propOrder = {
    "adjustAmt",
    "adjustRepayId",
    "adjustStatus",
    "appId",
    "appTime",
    "approveDate",
    "branchId",
    "checkId",
    "checkSuggest",
    "contractCode",
    "createTime",
    "creator",
    "customerId",
    "customerName",
    "handId",
    "haveOffer",
    "lonApplication",
    "mendTime",
    "mender",
    "nextRepayDate",
    "orgCode",
    "planRepayAmt",
    "planRepayTime",
    "remark",
    "repayType",
    "repaymentId",
    "tempCardBank",
    "tempCardName",
    "tmepCard"
})
public class TRepAdjustRepay {

    protected BigDecimal adjustAmt;
    protected Integer adjustRepayId;
    protected String adjustStatus;
    protected Integer appId;
    protected String appTime;
    protected String approveDate;
    protected String branchId;
    protected String checkId;
    protected String checkSuggest;
    protected String contractCode;
    protected String createTime;
    protected String creator;
    protected String customerId;
    protected String customerName;
    protected String handId;
    protected String haveOffer;
    protected TLonApplication lonApplication;
    protected String mendTime;
    protected String mender;
    protected String nextRepayDate;
    protected String orgCode;
    protected BigDecimal planRepayAmt;
    protected String planRepayTime;
    protected String remark;
    protected String repayType;
    protected Integer repaymentId;
    protected String tempCardBank;
    protected String tempCardName;
    protected String tmepCard;

    /**
     * 获取adjustAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustAmt() {
        return adjustAmt;
    }

    /**
     * 设置adjustAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustAmt(BigDecimal value) {
        this.adjustAmt = value;
    }

    /**
     * 获取adjustRepayId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdjustRepayId() {
        return adjustRepayId;
    }

    /**
     * 设置adjustRepayId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdjustRepayId(Integer value) {
        this.adjustRepayId = value;
    }

    /**
     * 获取adjustStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustStatus() {
        return adjustStatus;
    }

    /**
     * 设置adjustStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustStatus(String value) {
        this.adjustStatus = value;
    }

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
     * 获取appTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppTime() {
        return appTime;
    }

    /**
     * 设置appTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppTime(String value) {
        this.appTime = value;
    }

    /**
     * 获取approveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveDate() {
        return approveDate;
    }

    /**
     * 设置approveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveDate(String value) {
        this.approveDate = value;
    }

    /**
     * 获取branchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * 设置branchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * 获取checkId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckId() {
        return checkId;
    }

    /**
     * 设置checkId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckId(String value) {
        this.checkId = value;
    }

    /**
     * 获取checkSuggest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckSuggest() {
        return checkSuggest;
    }

    /**
     * 设置checkSuggest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckSuggest(String value) {
        this.checkSuggest = value;
    }

    /**
     * 获取contractCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置contractCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCode(String value) {
        this.contractCode = value;
    }

    /**
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * 获取creator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置creator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * 获取customerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置customerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
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
     * 获取handId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandId() {
        return handId;
    }

    /**
     * 设置handId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandId(String value) {
        this.handId = value;
    }

    /**
     * 获取haveOffer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaveOffer() {
        return haveOffer;
    }

    /**
     * 设置haveOffer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaveOffer(String value) {
        this.haveOffer = value;
    }

    /**
     * 获取lonApplication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TLonApplication }
     *     
     */
    public TLonApplication getLonApplication() {
        return lonApplication;
    }

    /**
     * 设置lonApplication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplication }
     *     
     */
    public void setLonApplication(TLonApplication value) {
        this.lonApplication = value;
    }

    /**
     * 获取mendTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMendTime() {
        return mendTime;
    }

    /**
     * 设置mendTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMendTime(String value) {
        this.mendTime = value;
    }

    /**
     * 获取mender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMender() {
        return mender;
    }

    /**
     * 设置mender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMender(String value) {
        this.mender = value;
    }

    /**
     * 获取nextRepayDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextRepayDate() {
        return nextRepayDate;
    }

    /**
     * 设置nextRepayDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextRepayDate(String value) {
        this.nextRepayDate = value;
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
     * 获取planRepayAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlanRepayAmt() {
        return planRepayAmt;
    }

    /**
     * 设置planRepayAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlanRepayAmt(BigDecimal value) {
        this.planRepayAmt = value;
    }

    /**
     * 获取planRepayTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanRepayTime() {
        return planRepayTime;
    }

    /**
     * 设置planRepayTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanRepayTime(String value) {
        this.planRepayTime = value;
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
     * 获取repayType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayType() {
        return repayType;
    }

    /**
     * 设置repayType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayType(String value) {
        this.repayType = value;
    }

    /**
     * 获取repaymentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepaymentId() {
        return repaymentId;
    }

    /**
     * 设置repaymentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepaymentId(Integer value) {
        this.repaymentId = value;
    }

    /**
     * 获取tempCardBank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempCardBank() {
        return tempCardBank;
    }

    /**
     * 设置tempCardBank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempCardBank(String value) {
        this.tempCardBank = value;
    }

    /**
     * 获取tempCardName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempCardName() {
        return tempCardName;
    }

    /**
     * 设置tempCardName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempCardName(String value) {
        this.tempCardName = value;
    }

    /**
     * 获取tmepCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmepCard() {
        return tmepCard;
    }

    /**
     * 设置tmepCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmepCard(String value) {
        this.tmepCard = value;
    }

}
