
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tCorpBillFactoringInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tCorpBillFactoringInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cooperateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debtor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="drawBillDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="drawerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intDayNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="intStartDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lonApplication" type="{http://biz.webservice.macrosky.com/}tLonApplication" minOccurs="0"/&gt;
 *         &lt;element name="orderSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayBankNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayInt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="startAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transMileage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="transPthoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transStartDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transTotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="waybillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tRepRepayment" type="{http://biz.webservice.macrosky.com/}tRepRepayment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCorpBillFactoringInfo", propOrder = {
    "appId",
    "batchNo",
    "billNo",
    "contractAmt",
    "cooperateName",
    "corpName",
    "createTime",
    "custName",
    "debtor",
    "drawBillDt",
    "drawerName",
    "driverName",
    "endAddr",
    "intDayNum",
    "intStartDt",
    "invoiceSts",
    "lonApplication",
    "orderSts",
    "overDay",
    "receiveAcctNo",
    "receiveName",
    "repayBankName",
    "repayBankNo",
    "repayDt",
    "repayInt",
    "startAddr",
    "transEndDt",
    "transMileage",
    "transPthoneNo",
    "transStartDt",
    "transTotalAmt",
    "unitPrice",
    "updateTime",
    "updateUser",
    "waybillNo",
    "tRepRepayment"
})
public class TCorpBillFactoringInfo {

    protected Integer appId;
    protected String batchNo;
    protected String billNo;
    protected String contractAmt;
    protected String cooperateName;
    protected String corpName;
    protected String createTime;
    protected String custName;
    protected String debtor;
    protected String drawBillDt;
    protected String drawerName;
    protected String driverName;
    protected String endAddr;
    protected Integer intDayNum;
    protected String intStartDt;
    protected String invoiceSts;
    protected TLonApplication lonApplication;
    protected String orderSts;
    protected String overDay;
    protected String receiveAcctNo;
    protected String receiveName;
    protected String repayBankName;
    protected String repayBankNo;
    protected String repayDt;
    protected BigDecimal repayInt;
    protected String startAddr;
    protected String transEndDt;
    protected BigDecimal transMileage;
    protected String transPthoneNo;
    protected String transStartDt;
    protected BigDecimal transTotalAmt;
    protected BigDecimal unitPrice;
    protected String updateTime;
    protected String updateUser;
    protected String waybillNo;
    protected TRepRepayment tRepRepayment;

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
     * 获取batchNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 设置batchNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNo(String value) {
        this.batchNo = value;
    }

    /**
     * 获取billNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 设置billNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNo(String value) {
        this.billNo = value;
    }

    /**
     * 获取contractAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractAmt() {
        return contractAmt;
    }

    /**
     * 设置contractAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractAmt(String value) {
        this.contractAmt = value;
    }

    /**
     * 获取cooperateName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCooperateName() {
        return cooperateName;
    }

    /**
     * 设置cooperateName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCooperateName(String value) {
        this.cooperateName = value;
    }

    /**
     * 获取corpName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpName() {
        return corpName;
    }

    /**
     * 设置corpName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpName(String value) {
        this.corpName = value;
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
     * 获取custName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置custName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * 获取debtor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtor() {
        return debtor;
    }

    /**
     * 设置debtor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtor(String value) {
        this.debtor = value;
    }

    /**
     * 获取drawBillDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawBillDt() {
        return drawBillDt;
    }

    /**
     * 设置drawBillDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawBillDt(String value) {
        this.drawBillDt = value;
    }

    /**
     * 获取drawerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawerName() {
        return drawerName;
    }

    /**
     * 设置drawerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawerName(String value) {
        this.drawerName = value;
    }

    /**
     * 获取driverName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * 设置driverName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverName(String value) {
        this.driverName = value;
    }

    /**
     * 获取endAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAddr() {
        return endAddr;
    }

    /**
     * 设置endAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAddr(String value) {
        this.endAddr = value;
    }

    /**
     * 获取intDayNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntDayNum() {
        return intDayNum;
    }

    /**
     * 设置intDayNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntDayNum(Integer value) {
        this.intDayNum = value;
    }

    /**
     * 获取intStartDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntStartDt() {
        return intStartDt;
    }

    /**
     * 设置intStartDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntStartDt(String value) {
        this.intStartDt = value;
    }

    /**
     * 获取invoiceSts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSts() {
        return invoiceSts;
    }

    /**
     * 设置invoiceSts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSts(String value) {
        this.invoiceSts = value;
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
     * 获取orderSts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSts() {
        return orderSts;
    }

    /**
     * 设置orderSts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSts(String value) {
        this.orderSts = value;
    }

    /**
     * 获取overDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverDay() {
        return overDay;
    }

    /**
     * 设置overDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverDay(String value) {
        this.overDay = value;
    }

    /**
     * 获取receiveAcctNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveAcctNo() {
        return receiveAcctNo;
    }

    /**
     * 设置receiveAcctNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveAcctNo(String value) {
        this.receiveAcctNo = value;
    }

    /**
     * 获取receiveName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveName() {
        return receiveName;
    }

    /**
     * 设置receiveName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveName(String value) {
        this.receiveName = value;
    }

    /**
     * 获取repayBankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayBankName() {
        return repayBankName;
    }

    /**
     * 设置repayBankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayBankName(String value) {
        this.repayBankName = value;
    }

    /**
     * 获取repayBankNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayBankNo() {
        return repayBankNo;
    }

    /**
     * 设置repayBankNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayBankNo(String value) {
        this.repayBankNo = value;
    }

    /**
     * 获取repayDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayDt() {
        return repayDt;
    }

    /**
     * 设置repayDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayDt(String value) {
        this.repayDt = value;
    }

    /**
     * 获取repayInt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayInt() {
        return repayInt;
    }

    /**
     * 设置repayInt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayInt(BigDecimal value) {
        this.repayInt = value;
    }

    /**
     * 获取startAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAddr() {
        return startAddr;
    }

    /**
     * 设置startAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAddr(String value) {
        this.startAddr = value;
    }

    /**
     * 获取transEndDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransEndDt() {
        return transEndDt;
    }

    /**
     * 设置transEndDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransEndDt(String value) {
        this.transEndDt = value;
    }

    /**
     * 获取transMileage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransMileage() {
        return transMileage;
    }

    /**
     * 设置transMileage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransMileage(BigDecimal value) {
        this.transMileage = value;
    }

    /**
     * 获取transPthoneNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransPthoneNo() {
        return transPthoneNo;
    }

    /**
     * 设置transPthoneNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransPthoneNo(String value) {
        this.transPthoneNo = value;
    }

    /**
     * 获取transStartDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransStartDt() {
        return transStartDt;
    }

    /**
     * 设置transStartDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransStartDt(String value) {
        this.transStartDt = value;
    }

    /**
     * 获取transTotalAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransTotalAmt() {
        return transTotalAmt;
    }

    /**
     * 设置transTotalAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransTotalAmt(BigDecimal value) {
        this.transTotalAmt = value;
    }

    /**
     * 获取unitPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * 设置unitPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
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

    /**
     * 获取updateUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置updateUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUser(String value) {
        this.updateUser = value;
    }

    /**
     * 获取waybillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaybillNo() {
        return waybillNo;
    }

    /**
     * 设置waybillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaybillNo(String value) {
        this.waybillNo = value;
    }

    /**
     * 获取tRepRepayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TRepRepayment }
     *     
     */
    public TRepRepayment getTRepRepayment() {
        return tRepRepayment;
    }

    /**
     * 设置tRepRepayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TRepRepayment }
     *     
     */
    public void setTRepRepayment(TRepRepayment value) {
        this.tRepRepayment = value;
    }

}
