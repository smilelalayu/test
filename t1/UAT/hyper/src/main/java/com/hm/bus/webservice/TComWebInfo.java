
package com.hm.bus.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tComWebInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tComWebInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="clrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="djjgmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="executiveSet" type="{http://biz.webservice.macrosky.com/}tComWebExecutive" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fddbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hzrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jyfw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mclxmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qwId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="qylxmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qymc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shareholderSet" type="{http://biz.webservice.macrosky.com/}tComWebShareHolder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="yyrq1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yyrq2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zczb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tComWebInfo", propOrder = {
    "appId",
    "clrq",
    "createTime",
    "djjgmc",
    "executiveSet",
    "fddbr",
    "hzrq",
    "jyfw",
    "mclxmc",
    "province",
    "qwId",
    "qylxmc",
    "qymc",
    "shareholderSet",
    "yyrq1",
    "yyrq2",
    "zch",
    "zczb",
    "zs"
})
public class TComWebInfo {

    protected Integer appId;
    protected String clrq;
    protected String createTime;
    protected String djjgmc;
    @XmlElement(nillable = true)
    protected List<TComWebExecutive> executiveSet;
    protected String fddbr;
    protected String hzrq;
    protected String jyfw;
    protected String mclxmc;
    protected String province;
    protected Long qwId;
    protected String qylxmc;
    protected String qymc;
    @XmlElement(nillable = true)
    protected List<TComWebShareHolder> shareholderSet;
    protected String yyrq1;
    protected String yyrq2;
    protected String zch;
    protected String zczb;
    protected String zs;

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
     * 获取clrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrq() {
        return clrq;
    }

    /**
     * 设置clrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrq(String value) {
        this.clrq = value;
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
     * 获取djjgmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDjjgmc() {
        return djjgmc;
    }

    /**
     * 设置djjgmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDjjgmc(String value) {
        this.djjgmc = value;
    }

    /**
     * Gets the value of the executiveSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executiveSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutiveSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TComWebExecutive }
     * 
     * 
     */
    public List<TComWebExecutive> getExecutiveSet() {
        if (executiveSet == null) {
            executiveSet = new ArrayList<TComWebExecutive>();
        }
        return this.executiveSet;
    }

    /**
     * 获取fddbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFddbr() {
        return fddbr;
    }

    /**
     * 设置fddbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFddbr(String value) {
        this.fddbr = value;
    }

    /**
     * 获取hzrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHzrq() {
        return hzrq;
    }

    /**
     * 设置hzrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHzrq(String value) {
        this.hzrq = value;
    }

    /**
     * 获取jyfw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJyfw() {
        return jyfw;
    }

    /**
     * 设置jyfw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJyfw(String value) {
        this.jyfw = value;
    }

    /**
     * 获取mclxmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMclxmc() {
        return mclxmc;
    }

    /**
     * 设置mclxmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMclxmc(String value) {
        this.mclxmc = value;
    }

    /**
     * 获取province属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置province属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * 获取qwId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQwId() {
        return qwId;
    }

    /**
     * 设置qwId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQwId(Long value) {
        this.qwId = value;
    }

    /**
     * 获取qylxmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQylxmc() {
        return qylxmc;
    }

    /**
     * 设置qylxmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQylxmc(String value) {
        this.qylxmc = value;
    }

    /**
     * 获取qymc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQymc() {
        return qymc;
    }

    /**
     * 设置qymc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQymc(String value) {
        this.qymc = value;
    }

    /**
     * Gets the value of the shareholderSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareholderSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareholderSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TComWebShareHolder }
     * 
     * 
     */
    public List<TComWebShareHolder> getShareholderSet() {
        if (shareholderSet == null) {
            shareholderSet = new ArrayList<TComWebShareHolder>();
        }
        return this.shareholderSet;
    }

    /**
     * 获取yyrq1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYyrq1() {
        return yyrq1;
    }

    /**
     * 设置yyrq1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYyrq1(String value) {
        this.yyrq1 = value;
    }

    /**
     * 获取yyrq2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYyrq2() {
        return yyrq2;
    }

    /**
     * 设置yyrq2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYyrq2(String value) {
        this.yyrq2 = value;
    }

    /**
     * 获取zch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZch() {
        return zch;
    }

    /**
     * 设置zch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZch(String value) {
        this.zch = value;
    }

    /**
     * 获取zczb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZczb() {
        return zczb;
    }

    /**
     * 设置zczb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZczb(String value) {
        this.zczb = value;
    }

    /**
     * 获取zs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZs() {
        return zs;
    }

    /**
     * 设置zs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZs(String value) {
        this.zs = value;
    }

}
