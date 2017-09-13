
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationStudent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationStudent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mendTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stuChsiAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stuChsiPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stuDorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stuEduMajor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stuEduSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stuEnrollmentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stuSchoolAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stuSchoolLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stuSchoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationStudent", propOrder = {
    "appId",
    "createTime",
    "creator",
    "mendTime",
    "mender",
    "stuChsiAccount",
    "stuChsiPwd",
    "stuDorm",
    "stuEduMajor",
    "stuEduSystem",
    "stuEnrollmentTime",
    "stuSchoolAddress",
    "stuSchoolLevel",
    "stuSchoolName",
    "studentId"
})
public class TLonApplicationStudent {

    protected Integer appId;
    protected String createTime;
    protected String creator;
    protected String mendTime;
    protected String mender;
    protected String stuChsiAccount;
    protected String stuChsiPwd;
    protected String stuDorm;
    protected String stuEduMajor;
    protected String stuEduSystem;
    protected String stuEnrollmentTime;
    protected String stuSchoolAddress;
    protected String stuSchoolLevel;
    protected String stuSchoolName;
    protected Integer studentId;

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
     * 获取creator属性的值。
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
     * 设置creator属性的值。
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

    /**
     * 获取mender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMender() {
        return mender;
    }

    /**
     * 设置mender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMender(String value) {
        this.mender = value;
    }

    /**
     * 获取stuChsiAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuChsiAccount() {
        return stuChsiAccount;
    }

    /**
     * 设置stuChsiAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuChsiAccount(String value) {
        this.stuChsiAccount = value;
    }

    /**
     * 获取stuChsiPwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuChsiPwd() {
        return stuChsiPwd;
    }

    /**
     * 设置stuChsiPwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuChsiPwd(String value) {
        this.stuChsiPwd = value;
    }

    /**
     * 获取stuDorm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuDorm() {
        return stuDorm;
    }

    /**
     * 设置stuDorm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuDorm(String value) {
        this.stuDorm = value;
    }

    /**
     * 获取stuEduMajor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuEduMajor() {
        return stuEduMajor;
    }

    /**
     * 设置stuEduMajor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuEduMajor(String value) {
        this.stuEduMajor = value;
    }

    /**
     * 获取stuEduSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuEduSystem() {
        return stuEduSystem;
    }

    /**
     * 设置stuEduSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuEduSystem(String value) {
        this.stuEduSystem = value;
    }

    /**
     * 获取stuEnrollmentTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuEnrollmentTime() {
        return stuEnrollmentTime;
    }

    /**
     * 设置stuEnrollmentTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuEnrollmentTime(String value) {
        this.stuEnrollmentTime = value;
    }

    /**
     * 获取stuSchoolAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuSchoolAddress() {
        return stuSchoolAddress;
    }

    /**
     * 设置stuSchoolAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuSchoolAddress(String value) {
        this.stuSchoolAddress = value;
    }

    /**
     * 获取stuSchoolLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuSchoolLevel() {
        return stuSchoolLevel;
    }

    /**
     * 设置stuSchoolLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuSchoolLevel(String value) {
        this.stuSchoolLevel = value;
    }

    /**
     * 获取stuSchoolName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuSchoolName() {
        return stuSchoolName;
    }

    /**
     * 设置stuSchoolName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuSchoolName(String value) {
        this.stuSchoolName = value;
    }

    /**
     * 获取studentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * 设置studentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStudentId(Integer value) {
        this.studentId = value;
    }

}
