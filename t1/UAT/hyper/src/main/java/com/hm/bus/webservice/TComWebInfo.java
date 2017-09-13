
package com.hm.bus.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tComWebInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡclrq���Ե�ֵ��
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
     * ����clrq���Ե�ֵ��
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
     * ��ȡdjjgmc���Ե�ֵ��
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
     * ����djjgmc���Ե�ֵ��
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
     * ��ȡfddbr���Ե�ֵ��
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
     * ����fddbr���Ե�ֵ��
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
     * ��ȡhzrq���Ե�ֵ��
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
     * ����hzrq���Ե�ֵ��
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
     * ��ȡjyfw���Ե�ֵ��
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
     * ����jyfw���Ե�ֵ��
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
     * ��ȡmclxmc���Ե�ֵ��
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
     * ����mclxmc���Ե�ֵ��
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
     * ��ȡprovince���Ե�ֵ��
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
     * ����province���Ե�ֵ��
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
     * ��ȡqwId���Ե�ֵ��
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
     * ����qwId���Ե�ֵ��
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
     * ��ȡqylxmc���Ե�ֵ��
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
     * ����qylxmc���Ե�ֵ��
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
     * ��ȡqymc���Ե�ֵ��
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
     * ����qymc���Ե�ֵ��
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
     * ��ȡyyrq1���Ե�ֵ��
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
     * ����yyrq1���Ե�ֵ��
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
     * ��ȡyyrq2���Ե�ֵ��
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
     * ����yyrq2���Ե�ֵ��
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
     * ��ȡzch���Ե�ֵ��
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
     * ����zch���Ե�ֵ��
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
     * ��ȡzczb���Ե�ֵ��
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
     * ����zczb���Ե�ֵ��
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
     * ��ȡzs���Ե�ֵ��
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
     * ����zs���Ե�ֵ��
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
