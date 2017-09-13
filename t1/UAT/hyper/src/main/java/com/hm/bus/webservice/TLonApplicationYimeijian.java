
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationYimeijian complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationYimeijian"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="applyHospital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="merchantsArtifCertid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantsArtifname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantsPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantsReceiveBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantsReceiveCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantsReceiveOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="worksTatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationYimeijian", propOrder = {
    "age",
    "appId",
    "applyHospital",
    "bankPhone",
    "createTime",
    "creditBank",
    "creditNo",
    "id",
    "merchantsArtifCertid",
    "merchantsArtifname",
    "merchantsName",
    "merchantsPhone",
    "merchantsReceiveBankCard",
    "merchantsReceiveCountryCode",
    "merchantsReceiveOpen",
    "worksTatus"
})
public class TLonApplicationYimeijian {

    protected String age;
    protected Long appId;
    protected String applyHospital;
    protected String bankPhone;
    protected String createTime;
    protected String creditBank;
    protected String creditNo;
    protected Long id;
    protected String merchantsArtifCertid;
    protected String merchantsArtifname;
    protected String merchantsName;
    protected String merchantsPhone;
    protected String merchantsReceiveBankCard;
    protected String merchantsReceiveCountryCode;
    protected String merchantsReceiveOpen;
    protected String worksTatus;

    /**
     * 获取age属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置age属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge(String value) {
        this.age = value;
    }

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
     * 获取applyHospital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyHospital() {
        return applyHospital;
    }

    /**
     * 设置applyHospital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyHospital(String value) {
        this.applyHospital = value;
    }

    /**
     * 获取bankPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankPhone() {
        return bankPhone;
    }

    /**
     * 设置bankPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankPhone(String value) {
        this.bankPhone = value;
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
     * 获取creditBank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditBank() {
        return creditBank;
    }

    /**
     * 设置creditBank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditBank(String value) {
        this.creditBank = value;
    }

    /**
     * 获取creditNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditNo() {
        return creditNo;
    }

    /**
     * 设置creditNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditNo(String value) {
        this.creditNo = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * 获取merchantsArtifCertid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantsArtifCertid() {
        return merchantsArtifCertid;
    }

    /**
     * 设置merchantsArtifCertid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantsArtifCertid(String value) {
        this.merchantsArtifCertid = value;
    }

    /**
     * 获取merchantsArtifname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantsArtifname() {
        return merchantsArtifname;
    }

    /**
     * 设置merchantsArtifname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantsArtifname(String value) {
        this.merchantsArtifname = value;
    }

    /**
     * 获取merchantsName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantsName() {
        return merchantsName;
    }

    /**
     * 设置merchantsName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantsName(String value) {
        this.merchantsName = value;
    }

    /**
     * 获取merchantsPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantsPhone() {
        return merchantsPhone;
    }

    /**
     * 设置merchantsPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantsPhone(String value) {
        this.merchantsPhone = value;
    }

    /**
     * 获取merchantsReceiveBankCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantsReceiveBankCard() {
        return merchantsReceiveBankCard;
    }

    /**
     * 设置merchantsReceiveBankCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantsReceiveBankCard(String value) {
        this.merchantsReceiveBankCard = value;
    }

    /**
     * 获取merchantsReceiveCountryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantsReceiveCountryCode() {
        return merchantsReceiveCountryCode;
    }

    /**
     * 设置merchantsReceiveCountryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantsReceiveCountryCode(String value) {
        this.merchantsReceiveCountryCode = value;
    }

    /**
     * 获取merchantsReceiveOpen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantsReceiveOpen() {
        return merchantsReceiveOpen;
    }

    /**
     * 设置merchantsReceiveOpen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantsReceiveOpen(String value) {
        this.merchantsReceiveOpen = value;
    }

    /**
     * 获取worksTatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorksTatus() {
        return worksTatus;
    }

    /**
     * 设置worksTatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorksTatus(String value) {
        this.worksTatus = value;
    }

}
