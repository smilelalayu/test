
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationParking complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationParking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mendTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parkBuyPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parkBuyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parkId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="parkOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parkOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parkOwnerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationParking", propOrder = {
    "appId",
    "createTime",
    "creator",
    "mendTime",
    "parkBuyPrice",
    "parkBuyTime",
    "parkId",
    "parkOwnerId",
    "parkOwnerName",
    "parkOwnerPhone",
    "parkType"
})
public class TLonApplicationParking {

    protected Integer appId;
    protected String createTime;
    protected String creator;
    protected String mendTime;
    protected String parkBuyPrice;
    protected String parkBuyTime;
    protected Long parkId;
    protected String parkOwnerId;
    protected String parkOwnerName;
    protected String parkOwnerPhone;
    protected String parkType;

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
     * ��ȡcreator���Ե�ֵ��
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
     * ����creator���Ե�ֵ��
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

    /**
     * ��ȡparkBuyPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkBuyPrice() {
        return parkBuyPrice;
    }

    /**
     * ����parkBuyPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkBuyPrice(String value) {
        this.parkBuyPrice = value;
    }

    /**
     * ��ȡparkBuyTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkBuyTime() {
        return parkBuyTime;
    }

    /**
     * ����parkBuyTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkBuyTime(String value) {
        this.parkBuyTime = value;
    }

    /**
     * ��ȡparkId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParkId() {
        return parkId;
    }

    /**
     * ����parkId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParkId(Long value) {
        this.parkId = value;
    }

    /**
     * ��ȡparkOwnerId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkOwnerId() {
        return parkOwnerId;
    }

    /**
     * ����parkOwnerId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkOwnerId(String value) {
        this.parkOwnerId = value;
    }

    /**
     * ��ȡparkOwnerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkOwnerName() {
        return parkOwnerName;
    }

    /**
     * ����parkOwnerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkOwnerName(String value) {
        this.parkOwnerName = value;
    }

    /**
     * ��ȡparkOwnerPhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkOwnerPhone() {
        return parkOwnerPhone;
    }

    /**
     * ����parkOwnerPhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkOwnerPhone(String value) {
        this.parkOwnerPhone = value;
    }

    /**
     * ��ȡparkType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkType() {
        return parkType;
    }

    /**
     * ����parkType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkType(String value) {
        this.parkType = value;
    }

}
