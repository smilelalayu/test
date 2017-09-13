
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>realRepaySync complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="realRepaySync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inFyacct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifieLoaner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outAppId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outCustname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outFyacct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayRelAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "realRepaySync", propOrder = {
    "appId",
    "id",
    "inFyacct",
    "inOrderId",
    "modifieLoaner",
    "offerDate",
    "outAppId",
    "outCustname",
    "outFyacct",
    "repayInterest",
    "repayPrincipal",
    "repayRelAmt",
    "repayType",
    "tranamt",
    "updateTime"
})
public class RealRepaySync {

    protected String appId;
    protected String id;
    protected String inFyacct;
    protected String inOrderId;
    protected String modifieLoaner;
    protected String offerDate;
    protected String outAppId;
    protected String outCustname;
    protected String outFyacct;
    protected String repayInterest;
    protected String repayPrincipal;
    protected String repayRelAmt;
    protected String repayType;
    protected String tranamt;
    protected String updateTime;

    /**
     * 获取appId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置appId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * 获取offerDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDate() {
        return offerDate;
    }

    /**
     * 设置offerDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDate(String value) {
        this.offerDate = value;
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
     * 获取repayInterest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayInterest() {
        return repayInterest;
    }

    /**
     * 设置repayInterest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayInterest(String value) {
        this.repayInterest = value;
    }

    /**
     * 获取repayPrincipal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayPrincipal() {
        return repayPrincipal;
    }

    /**
     * 设置repayPrincipal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayPrincipal(String value) {
        this.repayPrincipal = value;
    }

    /**
     * 获取repayRelAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayRelAmt() {
        return repayRelAmt;
    }

    /**
     * 设置repayRelAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayRelAmt(String value) {
        this.repayRelAmt = value;
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
     * 获取tranamt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranamt() {
        return tranamt;
    }

    /**
     * 设置tranamt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranamt(String value) {
        this.tranamt = value;
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
