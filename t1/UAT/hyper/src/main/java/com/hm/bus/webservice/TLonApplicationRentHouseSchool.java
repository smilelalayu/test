
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationRentHouseSchool complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationRentHouseSchool"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="highestEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isGraduated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roomAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schoolAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationRentHouseSchool", propOrder = {
    "appId",
    "createTime",
    "enrollmentDate",
    "highestEducation",
    "isGraduated",
    "roomAddress",
    "schoolAddress",
    "schoolId",
    "schoolName"
})
public class TLonApplicationRentHouseSchool {

    protected Integer appId;
    protected String createTime;
    protected String enrollmentDate;
    protected String highestEducation;
    protected String isGraduated;
    protected String roomAddress;
    protected String schoolAddress;
    protected Integer schoolId;
    protected String schoolName;

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
     * 获取enrollmentDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
     * 设置enrollmentDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentDate(String value) {
        this.enrollmentDate = value;
    }

    /**
     * 获取highestEducation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighestEducation() {
        return highestEducation;
    }

    /**
     * 设置highestEducation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighestEducation(String value) {
        this.highestEducation = value;
    }

    /**
     * 获取isGraduated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsGraduated() {
        return isGraduated;
    }

    /**
     * 设置isGraduated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsGraduated(String value) {
        this.isGraduated = value;
    }

    /**
     * 获取roomAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomAddress() {
        return roomAddress;
    }

    /**
     * 设置roomAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomAddress(String value) {
        this.roomAddress = value;
    }

    /**
     * 获取schoolAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolAddress() {
        return schoolAddress;
    }

    /**
     * 设置schoolAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolAddress(String value) {
        this.schoolAddress = value;
    }

    /**
     * 获取schoolId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * 设置schoolId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSchoolId(Integer value) {
        this.schoolId = value;
    }

    /**
     * 获取schoolName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * 设置schoolName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

}
