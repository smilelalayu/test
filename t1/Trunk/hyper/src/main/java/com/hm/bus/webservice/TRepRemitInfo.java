
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>tRepRemitInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tRepRemitInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inCustname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inFyacct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isHand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchPersent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifieAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifieLoaner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outAppId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outCustname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outFyacct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pridom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="repayBatchId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="repayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retmsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="swiftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranamt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="transDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="transFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRepRemitInfo", propOrder = {
    "inCustname",
    "inFyacct",
    "inOrderId",
    "isAllowed",
    "isHand",
    "matchPersent",
    "modifieAccount",
    "modifieLoaner",
    "orgCode",
    "outAppId",
    "outCustname",
    "outFyacct",
    "pridom",
    "remitId",
    "repayBatchId",
    "repayType",
    "retcode",
    "retmsg",
    "signature",
    "sourceClient",
    "swiftNo",
    "tranType",
    "tranamt",
    "transDate",
    "transFlag",
    "updateTime"
})
public class TRepRemitInfo {

    protected String inCustname;
    protected String inFyacct;
    protected String inOrderId;
    protected String isAllowed;
    protected String isHand;
    protected String matchPersent;
    protected String modifieAccount;
    protected String modifieLoaner;
    protected String orgCode;
    protected String outAppId;
    protected String outCustname;
    protected String outFyacct;
    protected String pridom;
    protected Integer remitId;
    protected Integer repayBatchId;
    protected String repayType;
    protected String retcode;
    protected String retmsg;
    protected String signature;
    protected String sourceClient;
    protected String swiftNo;
    protected String tranType;
    protected BigDecimal tranamt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transDate;
    protected String transFlag;
    protected String updateTime;

    /**
     * 获取inCustname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustname() {
        return inCustname;
    }

    /**
     * 设置inCustname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustname(String value) {
        this.inCustname = value;
    }

    /**
     * 获取inFyacct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFyacct() {
        return inFyacct;
    }

    /**
     * 设置inFyacct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFyacct(String value) {
        this.inFyacct = value;
    }

    /**
     * 获取inOrderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOrderId() {
        return inOrderId;
    }

    /**
     * 设置inOrderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOrderId(String value) {
        this.inOrderId = value;
    }

    /**
     * 获取isAllowed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAllowed() {
        return isAllowed;
    }

    /**
     * 设置isAllowed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAllowed(String value) {
        this.isAllowed = value;
    }

    /**
     * 获取isHand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHand() {
        return isHand;
    }

    /**
     * 设置isHand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHand(String value) {
        this.isHand = value;
    }

    /**
     * 获取matchPersent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchPersent() {
        return matchPersent;
    }

    /**
     * 设置matchPersent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchPersent(String value) {
        this.matchPersent = value;
    }

    /**
     * 获取modifieAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifieAccount() {
        return modifieAccount;
    }

    /**
     * 设置modifieAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifieAccount(String value) {
        this.modifieAccount = value;
    }

    /**
     * 获取modifieLoaner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifieLoaner() {
        return modifieLoaner;
    }

    /**
     * 设置modifieLoaner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifieLoaner(String value) {
        this.modifieLoaner = value;
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
     * 获取outAppId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAppId() {
        return outAppId;
    }

    /**
     * 设置outAppId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAppId(String value) {
        this.outAppId = value;
    }

    /**
     * 获取outCustname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustname() {
        return outCustname;
    }

    /**
     * 设置outCustname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustname(String value) {
        this.outCustname = value;
    }

    /**
     * 获取outFyacct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFyacct() {
        return outFyacct;
    }

    /**
     * 设置outFyacct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFyacct(String value) {
        this.outFyacct = value;
    }

    /**
     * 获取pridom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPridom() {
        return pridom;
    }

    /**
     * 设置pridom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPridom(String value) {
        this.pridom = value;
    }

    /**
     * 获取remitId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemitId() {
        return remitId;
    }

    /**
     * 设置remitId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemitId(Integer value) {
        this.remitId = value;
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
     * 获取retcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetcode() {
        return retcode;
    }

    /**
     * 设置retcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetcode(String value) {
        this.retcode = value;
    }

    /**
     * 获取retmsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetmsg() {
        return retmsg;
    }

    /**
     * 设置retmsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetmsg(String value) {
        this.retmsg = value;
    }

    /**
     * 获取signature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置signature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * 获取sourceClient属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceClient() {
        return sourceClient;
    }

    /**
     * 设置sourceClient属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceClient(String value) {
        this.sourceClient = value;
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

    /**
     * 获取tranType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranType() {
        return tranType;
    }

    /**
     * 设置tranType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranType(String value) {
        this.tranType = value;
    }

    /**
     * 获取tranamt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTranamt() {
        return tranamt;
    }

    /**
     * 设置tranamt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTranamt(BigDecimal value) {
        this.tranamt = value;
    }

    /**
     * 获取transDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransDate() {
        return transDate;
    }

    /**
     * 设置transDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransDate(XMLGregorianCalendar value) {
        this.transDate = value;
    }

    /**
     * 获取transFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransFlag() {
        return transFlag;
    }

    /**
     * 设置transFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransFlag(String value) {
        this.transFlag = value;
    }

    /**
     * 获取updateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置updateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(String value) {
        this.updateTime = value;
    }

}
