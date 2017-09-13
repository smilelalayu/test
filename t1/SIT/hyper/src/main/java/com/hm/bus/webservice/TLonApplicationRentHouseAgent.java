
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationRentHouseAgent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationRentHouseAgent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agentAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentBankAddressCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentBankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentComBeijingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentCurWorkPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="agentIdCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentIsLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentOrginWorkPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentWorkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationRentHouseAgent", propOrder = {
    "agentAccountNum",
    "agentAddress",
    "agentBankAddressCode",
    "agentBankBranch",
    "agentBankName",
    "agentComBeijingDate",
    "agentCurWorkPlace",
    "agentId",
    "agentIdCard",
    "agentIsLocal",
    "agentName",
    "agentOrginWorkPlace",
    "agentPhone",
    "agentProvince",
    "agentWorkDate",
    "appId",
    "createTime"
})
public class TLonApplicationRentHouseAgent {

    protected String agentAccountNum;
    protected String agentAddress;
    protected String agentBankAddressCode;
    protected String agentBankBranch;
    protected String agentBankName;
    protected String agentComBeijingDate;
    protected String agentCurWorkPlace;
    protected Integer agentId;
    protected String agentIdCard;
    protected String agentIsLocal;
    protected String agentName;
    protected String agentOrginWorkPlace;
    protected String agentPhone;
    protected String agentProvince;
    protected String agentWorkDate;
    protected Integer appId;
    protected String createTime;

    /**
     * 获取agentAccountNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentAccountNum() {
        return agentAccountNum;
    }

    /**
     * 设置agentAccountNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentAccountNum(String value) {
        this.agentAccountNum = value;
    }

    /**
     * 获取agentAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentAddress() {
        return agentAddress;
    }

    /**
     * 设置agentAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentAddress(String value) {
        this.agentAddress = value;
    }

    /**
     * 获取agentBankAddressCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentBankAddressCode() {
        return agentBankAddressCode;
    }

    /**
     * 设置agentBankAddressCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentBankAddressCode(String value) {
        this.agentBankAddressCode = value;
    }

    /**
     * 获取agentBankBranch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentBankBranch() {
        return agentBankBranch;
    }

    /**
     * 设置agentBankBranch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentBankBranch(String value) {
        this.agentBankBranch = value;
    }

    /**
     * 获取agentBankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentBankName() {
        return agentBankName;
    }

    /**
     * 设置agentBankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentBankName(String value) {
        this.agentBankName = value;
    }

    /**
     * 获取agentComBeijingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentComBeijingDate() {
        return agentComBeijingDate;
    }

    /**
     * 设置agentComBeijingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentComBeijingDate(String value) {
        this.agentComBeijingDate = value;
    }

    /**
     * 获取agentCurWorkPlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCurWorkPlace() {
        return agentCurWorkPlace;
    }

    /**
     * 设置agentCurWorkPlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCurWorkPlace(String value) {
        this.agentCurWorkPlace = value;
    }

    /**
     * 获取agentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgentId() {
        return agentId;
    }

    /**
     * 设置agentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgentId(Integer value) {
        this.agentId = value;
    }

    /**
     * 获取agentIdCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentIdCard() {
        return agentIdCard;
    }

    /**
     * 设置agentIdCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentIdCard(String value) {
        this.agentIdCard = value;
    }

    /**
     * 获取agentIsLocal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentIsLocal() {
        return agentIsLocal;
    }

    /**
     * 设置agentIsLocal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentIsLocal(String value) {
        this.agentIsLocal = value;
    }

    /**
     * 获取agentName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * 设置agentName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * 获取agentOrginWorkPlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentOrginWorkPlace() {
        return agentOrginWorkPlace;
    }

    /**
     * 设置agentOrginWorkPlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentOrginWorkPlace(String value) {
        this.agentOrginWorkPlace = value;
    }

    /**
     * 获取agentPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentPhone() {
        return agentPhone;
    }

    /**
     * 设置agentPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentPhone(String value) {
        this.agentPhone = value;
    }

    /**
     * 获取agentProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentProvince() {
        return agentProvince;
    }

    /**
     * 设置agentProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentProvince(String value) {
        this.agentProvince = value;
    }

    /**
     * 获取agentWorkDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentWorkDate() {
        return agentWorkDate;
    }

    /**
     * 设置agentWorkDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentWorkDate(String value) {
        this.agentWorkDate = value;
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

}
