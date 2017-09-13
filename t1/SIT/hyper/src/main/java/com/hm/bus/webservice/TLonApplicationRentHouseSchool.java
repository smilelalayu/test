
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationRentHouseSchool complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡenrollmentDate���Ե�ֵ��
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
     * ����enrollmentDate���Ե�ֵ��
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
     * ��ȡhighestEducation���Ե�ֵ��
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
     * ����highestEducation���Ե�ֵ��
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
     * ��ȡisGraduated���Ե�ֵ��
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
     * ����isGraduated���Ե�ֵ��
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
     * ��ȡroomAddress���Ե�ֵ��
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
     * ����roomAddress���Ե�ֵ��
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
     * ��ȡschoolAddress���Ե�ֵ��
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
     * ����schoolAddress���Ե�ֵ��
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
     * ��ȡschoolId���Ե�ֵ��
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
     * ����schoolId���Ե�ֵ��
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
     * ��ȡschoolName���Ե�ֵ��
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
     * ����schoolName���Ե�ֵ��
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
