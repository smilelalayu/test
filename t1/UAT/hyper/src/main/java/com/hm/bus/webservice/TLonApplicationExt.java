
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>tLonApplicationExt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationExt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="blackListType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="customerInstCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerInstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerManagerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerServiceRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerServiceTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directCheckInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directCheckPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="finalApproveId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="lastLoanOverdueTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lastLoanRepayPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="overdueDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productIsApprove" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="recordIdLatest" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusLatest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationExt", propOrder = {
    "appId",
    "blackListType",
    "channelCompanyName",
    "creditLine",
    "customerInstCode",
    "customerInstName",
    "customerManagerId",
    "customerManagerName",
    "customerServiceId",
    "customerServiceName",
    "customerServiceRemark",
    "customerServiceTime",
    "customerType",
    "directCheckInst",
    "directCheckPerson",
    "finalApproveId",
    "lastLoanOverdueTimes",
    "lastLoanRepayPeriod",
    "overdueDays",
    "processId",
    "productIsApprove",
    "recordId",
    "recordIdLatest",
    "status",
    "statusLatest",
    "taskId",
    "updateTime"
})
public class TLonApplicationExt {

    protected Long appId;
    protected String blackListType;
    protected String channelCompanyName;
    protected BigDecimal creditLine;
    protected String customerInstCode;
    protected String customerInstName;
    protected String customerManagerId;
    protected String customerManagerName;
    protected String customerServiceId;
    protected String customerServiceName;
    protected String customerServiceRemark;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customerServiceTime;
    protected String customerType;
    protected String directCheckInst;
    protected String directCheckPerson;
    protected Long finalApproveId;
    protected Integer lastLoanOverdueTimes;
    protected Integer lastLoanRepayPeriod;
    protected Integer overdueDays;
    protected String processId;
    protected String productIsApprove;
    protected Long recordId;
    protected Long recordIdLatest;
    protected String status;
    protected String statusLatest;
    protected String taskId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;

    /**
     * 获取appId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * 设置appId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAppId(Long value) {
        this.appId = value;
    }

    /**
     * 获取blackListType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackListType() {
        return blackListType;
    }

    /**
     * 设置blackListType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackListType(String value) {
        this.blackListType = value;
    }

    /**
     * 获取channelCompanyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCompanyName() {
        return channelCompanyName;
    }

    /**
     * 设置channelCompanyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCompanyName(String value) {
        this.channelCompanyName = value;
    }

    /**
     * 获取creditLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLine() {
        return creditLine;
    }

    /**
     * 设置creditLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLine(BigDecimal value) {
        this.creditLine = value;
    }

    /**
     * 获取customerInstCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerInstCode() {
        return customerInstCode;
    }

    /**
     * 设置customerInstCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerInstCode(String value) {
        this.customerInstCode = value;
    }

    /**
     * 获取customerInstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerInstName() {
        return customerInstName;
    }

    /**
     * 设置customerInstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerInstName(String value) {
        this.customerInstName = value;
    }

    /**
     * 获取customerManagerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerManagerId() {
        return customerManagerId;
    }

    /**
     * 设置customerManagerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerManagerId(String value) {
        this.customerManagerId = value;
    }

    /**
     * 获取customerManagerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerManagerName() {
        return customerManagerName;
    }

    /**
     * 设置customerManagerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerManagerName(String value) {
        this.customerManagerName = value;
    }

    /**
     * 获取customerServiceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceId() {
        return customerServiceId;
    }

    /**
     * 设置customerServiceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceId(String value) {
        this.customerServiceId = value;
    }

    /**
     * 获取customerServiceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceName() {
        return customerServiceName;
    }

    /**
     * 设置customerServiceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceName(String value) {
        this.customerServiceName = value;
    }

    /**
     * 获取customerServiceRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceRemark() {
        return customerServiceRemark;
    }

    /**
     * 设置customerServiceRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceRemark(String value) {
        this.customerServiceRemark = value;
    }

    /**
     * 获取customerServiceTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerServiceTime() {
        return customerServiceTime;
    }

    /**
     * 设置customerServiceTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerServiceTime(XMLGregorianCalendar value) {
        this.customerServiceTime = value;
    }

    /**
     * 获取customerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * 设置customerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * 获取directCheckInst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectCheckInst() {
        return directCheckInst;
    }

    /**
     * 设置directCheckInst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectCheckInst(String value) {
        this.directCheckInst = value;
    }

    /**
     * 获取directCheckPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectCheckPerson() {
        return directCheckPerson;
    }

    /**
     * 设置directCheckPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectCheckPerson(String value) {
        this.directCheckPerson = value;
    }

    /**
     * 获取finalApproveId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinalApproveId() {
        return finalApproveId;
    }

    /**
     * 设置finalApproveId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinalApproveId(Long value) {
        this.finalApproveId = value;
    }

    /**
     * 获取lastLoanOverdueTimes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastLoanOverdueTimes() {
        return lastLoanOverdueTimes;
    }

    /**
     * 设置lastLoanOverdueTimes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastLoanOverdueTimes(Integer value) {
        this.lastLoanOverdueTimes = value;
    }

    /**
     * 获取lastLoanRepayPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastLoanRepayPeriod() {
        return lastLoanRepayPeriod;
    }

    /**
     * 设置lastLoanRepayPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastLoanRepayPeriod(Integer value) {
        this.lastLoanRepayPeriod = value;
    }

    /**
     * 获取overdueDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDays() {
        return overdueDays;
    }

    /**
     * 设置overdueDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDays(Integer value) {
        this.overdueDays = value;
    }

    /**
     * 获取processId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * 设置processId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

    /**
     * 获取productIsApprove属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIsApprove() {
        return productIsApprove;
    }

    /**
     * 设置productIsApprove属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIsApprove(String value) {
        this.productIsApprove = value;
    }

    /**
     * 获取recordId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * 设置recordId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordId(Long value) {
        this.recordId = value;
    }

    /**
     * 获取recordIdLatest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordIdLatest() {
        return recordIdLatest;
    }

    /**
     * 设置recordIdLatest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordIdLatest(Long value) {
        this.recordIdLatest = value;
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
     * 获取statusLatest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusLatest() {
        return statusLatest;
    }

    /**
     * 设置statusLatest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusLatest(String value) {
        this.statusLatest = value;
    }

    /**
     * 获取taskId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 设置taskId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * 获取updateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置updateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

}
