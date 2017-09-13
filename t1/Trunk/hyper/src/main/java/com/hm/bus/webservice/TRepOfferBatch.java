
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tRepOfferBatch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tRepOfferBatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="batchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bizNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="failAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="failNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isSummarizeOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextOfferFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextOfferStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="offerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repRemitInfo" type="{http://biz.webservice.macrosky.com/}tRepRemitInfo" minOccurs="0"/&gt;
 *         &lt;element name="repayBatchId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="repayBeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strikFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strikStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="succAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="succNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sumAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="swiftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRepOfferBatch", propOrder = {
    "agentStatus",
    "batchType",
    "bizNum",
    "failAmt",
    "failNum",
    "fileName",
    "isSummarizeOffer",
    "nextOfferFile",
    "nextOfferStatus",
    "num",
    "offerStatus",
    "orgCode",
    "repRemitInfo",
    "repayBatchId",
    "repayBeginTime",
    "repayEndTime",
    "repayFile",
    "strikFileName",
    "strikStatus",
    "succAmt",
    "succNum",
    "sumAmt",
    "swiftNo"
})
public class TRepOfferBatch {

    protected String agentStatus;
    protected String batchType;
    protected Integer bizNum;
    protected BigDecimal failAmt;
    protected Integer failNum;
    protected String fileName;
    protected String isSummarizeOffer;
    protected String nextOfferFile;
    protected String nextOfferStatus;
    protected Integer num;
    protected String offerStatus;
    protected String orgCode;
    protected TRepRemitInfo repRemitInfo;
    protected Integer repayBatchId;
    protected String repayBeginTime;
    protected String repayEndTime;
    protected String repayFile;
    protected String strikFileName;
    protected String strikStatus;
    protected BigDecimal succAmt;
    protected Integer succNum;
    protected BigDecimal sumAmt;
    protected String swiftNo;

    /**
     * 获取agentStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    /**
     * 设置agentStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentStatus(String value) {
        this.agentStatus = value;
    }

    /**
     * 获取batchType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchType() {
        return batchType;
    }

    /**
     * 设置batchType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchType(String value) {
        this.batchType = value;
    }

    /**
     * 获取bizNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBizNum() {
        return bizNum;
    }

    /**
     * 设置bizNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBizNum(Integer value) {
        this.bizNum = value;
    }

    /**
     * 获取failAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFailAmt() {
        return failAmt;
    }

    /**
     * 设置failAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFailAmt(BigDecimal value) {
        this.failAmt = value;
    }

    /**
     * 获取failNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailNum() {
        return failNum;
    }

    /**
     * 设置failNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailNum(Integer value) {
        this.failNum = value;
    }

    /**
     * 获取fileName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置fileName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * 获取isSummarizeOffer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSummarizeOffer() {
        return isSummarizeOffer;
    }

    /**
     * 设置isSummarizeOffer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSummarizeOffer(String value) {
        this.isSummarizeOffer = value;
    }

    /**
     * 获取nextOfferFile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextOfferFile() {
        return nextOfferFile;
    }

    /**
     * 设置nextOfferFile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextOfferFile(String value) {
        this.nextOfferFile = value;
    }

    /**
     * 获取nextOfferStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextOfferStatus() {
        return nextOfferStatus;
    }

    /**
     * 设置nextOfferStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextOfferStatus(String value) {
        this.nextOfferStatus = value;
    }

    /**
     * 获取num属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置num属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNum(Integer value) {
        this.num = value;
    }

    /**
     * 获取offerStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferStatus() {
        return offerStatus;
    }

    /**
     * 设置offerStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferStatus(String value) {
        this.offerStatus = value;
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
     * 获取repRemitInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TRepRemitInfo }
     *     
     */
    public TRepRemitInfo getRepRemitInfo() {
        return repRemitInfo;
    }

    /**
     * 设置repRemitInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TRepRemitInfo }
     *     
     */
    public void setRepRemitInfo(TRepRemitInfo value) {
        this.repRemitInfo = value;
    }

    /**
     * 获取repayBatchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepayBatchId() {
        return repayBatchId;
    }

    /**
     * 设置repayBatchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepayBatchId(Integer value) {
        this.repayBatchId = value;
    }

    /**
     * 获取repayBeginTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayBeginTime() {
        return repayBeginTime;
    }

    /**
     * 设置repayBeginTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayBeginTime(String value) {
        this.repayBeginTime = value;
    }

    /**
     * 获取repayEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayEndTime() {
        return repayEndTime;
    }

    /**
     * 设置repayEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayEndTime(String value) {
        this.repayEndTime = value;
    }

    /**
     * 获取repayFile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayFile() {
        return repayFile;
    }

    /**
     * 设置repayFile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayFile(String value) {
        this.repayFile = value;
    }

    /**
     * 获取strikFileName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrikFileName() {
        return strikFileName;
    }

    /**
     * 设置strikFileName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrikFileName(String value) {
        this.strikFileName = value;
    }

    /**
     * 获取strikStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrikStatus() {
        return strikStatus;
    }

    /**
     * 设置strikStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrikStatus(String value) {
        this.strikStatus = value;
    }

    /**
     * 获取succAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuccAmt() {
        return succAmt;
    }

    /**
     * 设置succAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuccAmt(BigDecimal value) {
        this.succAmt = value;
    }

    /**
     * 获取succNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccNum() {
        return succNum;
    }

    /**
     * 设置succNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccNum(Integer value) {
        this.succNum = value;
    }

    /**
     * 获取sumAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumAmt() {
        return sumAmt;
    }

    /**
     * 设置sumAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumAmt(BigDecimal value) {
        this.sumAmt = value;
    }

    /**
     * 获取swiftNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftNo() {
        return swiftNo;
    }

    /**
     * 设置swiftNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiftNo(String value) {
        this.swiftNo = value;
    }

}
