
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonHouseMortgage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonHouseMortgage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmAcceptPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="hmAge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="hmAgentPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="hmArea" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="hmBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmBuyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="hmBuyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmCommunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmEvaluatePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="hmHaveMortgage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="hmLandUseRight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmMonthRepay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="hmNetPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="hmPropertyRight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmRoom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmSharePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hmUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mendTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonHouseMortgage", propOrder = {
    "appId",
    "createTime",
    "hmAcceptPrice",
    "hmAge",
    "hmAgentPrice",
    "hmArea",
    "hmBuilding",
    "hmBuyPrice",
    "hmBuyTime",
    "hmCity",
    "hmCommunity",
    "hmCounty",
    "hmEvaluatePrice",
    "hmHaveMortgage",
    "hmId",
    "hmLandUseRight",
    "hmModel",
    "hmMonthRepay",
    "hmNetPrice",
    "hmPropertyRight",
    "hmProvince",
    "hmRemark",
    "hmRoom",
    "hmSharePerson",
    "hmStreet",
    "hmType",
    "hmUnit",
    "mendTime"
})
public class TLonHouseMortgage {

    protected Integer appId;
    protected String createTime;
    protected BigDecimal hmAcceptPrice;
    protected BigDecimal hmAge;
    protected BigDecimal hmAgentPrice;
    protected BigDecimal hmArea;
    protected String hmBuilding;
    protected BigDecimal hmBuyPrice;
    protected String hmBuyTime;
    protected String hmCity;
    protected String hmCommunity;
    protected String hmCounty;
    protected BigDecimal hmEvaluatePrice;
    protected String hmHaveMortgage;
    protected Long hmId;
    protected String hmLandUseRight;
    protected String hmModel;
    protected BigDecimal hmMonthRepay;
    protected BigDecimal hmNetPrice;
    protected String hmPropertyRight;
    protected String hmProvince;
    protected String hmRemark;
    protected String hmRoom;
    protected String hmSharePerson;
    protected String hmStreet;
    protected String hmType;
    protected String hmUnit;
    protected String mendTime;

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

    /**
     * 获取hmAcceptPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmAcceptPrice() {
        return hmAcceptPrice;
    }

    /**
     * 设置hmAcceptPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmAcceptPrice(BigDecimal value) {
        this.hmAcceptPrice = value;
    }

    /**
     * 获取hmAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmAge() {
        return hmAge;
    }

    /**
     * 设置hmAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmAge(BigDecimal value) {
        this.hmAge = value;
    }

    /**
     * 获取hmAgentPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmAgentPrice() {
        return hmAgentPrice;
    }

    /**
     * 设置hmAgentPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmAgentPrice(BigDecimal value) {
        this.hmAgentPrice = value;
    }

    /**
     * 获取hmArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmArea() {
        return hmArea;
    }

    /**
     * 设置hmArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmArea(BigDecimal value) {
        this.hmArea = value;
    }

    /**
     * 获取hmBuilding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmBuilding() {
        return hmBuilding;
    }

    /**
     * 设置hmBuilding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmBuilding(String value) {
        this.hmBuilding = value;
    }

    /**
     * 获取hmBuyPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmBuyPrice() {
        return hmBuyPrice;
    }

    /**
     * 设置hmBuyPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmBuyPrice(BigDecimal value) {
        this.hmBuyPrice = value;
    }

    /**
     * 获取hmBuyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmBuyTime() {
        return hmBuyTime;
    }

    /**
     * 设置hmBuyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmBuyTime(String value) {
        this.hmBuyTime = value;
    }

    /**
     * 获取hmCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmCity() {
        return hmCity;
    }

    /**
     * 设置hmCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmCity(String value) {
        this.hmCity = value;
    }

    /**
     * 获取hmCommunity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmCommunity() {
        return hmCommunity;
    }

    /**
     * 设置hmCommunity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmCommunity(String value) {
        this.hmCommunity = value;
    }

    /**
     * 获取hmCounty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmCounty() {
        return hmCounty;
    }

    /**
     * 设置hmCounty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmCounty(String value) {
        this.hmCounty = value;
    }

    /**
     * 获取hmEvaluatePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmEvaluatePrice() {
        return hmEvaluatePrice;
    }

    /**
     * 设置hmEvaluatePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmEvaluatePrice(BigDecimal value) {
        this.hmEvaluatePrice = value;
    }

    /**
     * 获取hmHaveMortgage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmHaveMortgage() {
        return hmHaveMortgage;
    }

    /**
     * 设置hmHaveMortgage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmHaveMortgage(String value) {
        this.hmHaveMortgage = value;
    }

    /**
     * 获取hmId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHmId() {
        return hmId;
    }

    /**
     * 设置hmId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHmId(Long value) {
        this.hmId = value;
    }

    /**
     * 获取hmLandUseRight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmLandUseRight() {
        return hmLandUseRight;
    }

    /**
     * 设置hmLandUseRight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmLandUseRight(String value) {
        this.hmLandUseRight = value;
    }

    /**
     * 获取hmModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmModel() {
        return hmModel;
    }

    /**
     * 设置hmModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmModel(String value) {
        this.hmModel = value;
    }

    /**
     * 获取hmMonthRepay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmMonthRepay() {
        return hmMonthRepay;
    }

    /**
     * 设置hmMonthRepay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmMonthRepay(BigDecimal value) {
        this.hmMonthRepay = value;
    }

    /**
     * 获取hmNetPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmNetPrice() {
        return hmNetPrice;
    }

    /**
     * 设置hmNetPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmNetPrice(BigDecimal value) {
        this.hmNetPrice = value;
    }

    /**
     * 获取hmPropertyRight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmPropertyRight() {
        return hmPropertyRight;
    }

    /**
     * 设置hmPropertyRight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmPropertyRight(String value) {
        this.hmPropertyRight = value;
    }

    /**
     * 获取hmProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmProvince() {
        return hmProvince;
    }

    /**
     * 设置hmProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmProvince(String value) {
        this.hmProvince = value;
    }

    /**
     * 获取hmRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmRemark() {
        return hmRemark;
    }

    /**
     * 设置hmRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmRemark(String value) {
        this.hmRemark = value;
    }

    /**
     * 获取hmRoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmRoom() {
        return hmRoom;
    }

    /**
     * 设置hmRoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmRoom(String value) {
        this.hmRoom = value;
    }

    /**
     * 获取hmSharePerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmSharePerson() {
        return hmSharePerson;
    }

    /**
     * 设置hmSharePerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmSharePerson(String value) {
        this.hmSharePerson = value;
    }

    /**
     * 获取hmStreet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmStreet() {
        return hmStreet;
    }

    /**
     * 设置hmStreet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmStreet(String value) {
        this.hmStreet = value;
    }

    /**
     * 获取hmType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmType() {
        return hmType;
    }

    /**
     * 设置hmType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmType(String value) {
        this.hmType = value;
    }

    /**
     * 获取hmUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmUnit() {
        return hmUnit;
    }

    /**
     * 设置hmUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmUnit(String value) {
        this.hmUnit = value;
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

}
