
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonHouseMortgage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡappId���Ե�ֵ��
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
     * ����appId���Ե�ֵ��
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
     * ��ȡcreateTime���Ե�ֵ��
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
     * ����createTime���Ե�ֵ��
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
     * ��ȡhmAcceptPrice���Ե�ֵ��
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
     * ����hmAcceptPrice���Ե�ֵ��
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
     * ��ȡhmAge���Ե�ֵ��
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
     * ����hmAge���Ե�ֵ��
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
     * ��ȡhmAgentPrice���Ե�ֵ��
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
     * ����hmAgentPrice���Ե�ֵ��
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
     * ��ȡhmArea���Ե�ֵ��
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
     * ����hmArea���Ե�ֵ��
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
     * ��ȡhmBuilding���Ե�ֵ��
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
     * ����hmBuilding���Ե�ֵ��
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
     * ��ȡhmBuyPrice���Ե�ֵ��
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
     * ����hmBuyPrice���Ե�ֵ��
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
     * ��ȡhmBuyTime���Ե�ֵ��
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
     * ����hmBuyTime���Ե�ֵ��
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
     * ��ȡhmCity���Ե�ֵ��
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
     * ����hmCity���Ե�ֵ��
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
     * ��ȡhmCommunity���Ե�ֵ��
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
     * ����hmCommunity���Ե�ֵ��
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
     * ��ȡhmCounty���Ե�ֵ��
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
     * ����hmCounty���Ե�ֵ��
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
     * ��ȡhmEvaluatePrice���Ե�ֵ��
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
     * ����hmEvaluatePrice���Ե�ֵ��
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
     * ��ȡhmHaveMortgage���Ե�ֵ��
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
     * ����hmHaveMortgage���Ե�ֵ��
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
     * ��ȡhmId���Ե�ֵ��
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
     * ����hmId���Ե�ֵ��
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
     * ��ȡhmLandUseRight���Ե�ֵ��
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
     * ����hmLandUseRight���Ե�ֵ��
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
     * ��ȡhmModel���Ե�ֵ��
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
     * ����hmModel���Ե�ֵ��
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
     * ��ȡhmMonthRepay���Ե�ֵ��
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
     * ����hmMonthRepay���Ե�ֵ��
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
     * ��ȡhmNetPrice���Ե�ֵ��
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
     * ����hmNetPrice���Ե�ֵ��
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
     * ��ȡhmPropertyRight���Ե�ֵ��
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
     * ����hmPropertyRight���Ե�ֵ��
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
     * ��ȡhmProvince���Ե�ֵ��
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
     * ����hmProvince���Ե�ֵ��
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
     * ��ȡhmRemark���Ե�ֵ��
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
     * ����hmRemark���Ե�ֵ��
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
     * ��ȡhmRoom���Ե�ֵ��
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
     * ����hmRoom���Ե�ֵ��
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
     * ��ȡhmSharePerson���Ե�ֵ��
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
     * ����hmSharePerson���Ե�ֵ��
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
     * ��ȡhmStreet���Ե�ֵ��
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
     * ����hmStreet���Ե�ֵ��
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
     * ��ȡhmType���Ե�ֵ��
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
     * ����hmType���Ե�ֵ��
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
     * ��ȡhmUnit���Ե�ֵ��
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
     * ����hmUnit���Ե�ֵ��
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
     * ��ȡmendTime���Ե�ֵ��
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
     * ����mendTime���Ե�ֵ��
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
