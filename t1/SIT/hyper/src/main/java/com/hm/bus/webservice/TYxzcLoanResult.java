
package com.hm.bus.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tYxzcLoanResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tYxzcLoanResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="breakContractrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditscore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="overdueCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="overdueNinetyDaysCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="overdueOneeightyDaysCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="queryOrgs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="queryRecordDetail" type="{http://biz.webservice.macrosky.com/}tYxzcRecordDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="queryTimesDetail" type="{http://biz.webservice.macrosky.com/}tYxzcTimesDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="yxzcId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tYxzcLoanResult", propOrder = {
    "appId",
    "breakContractrate",
    "createTime",
    "creditscore",
    "overdueCount",
    "overdueNinetyDaysCount",
    "overdueOneeightyDaysCount",
    "queryOrgs",
    "queryRecordDetail",
    "queryTimesDetail",
    "yxzcId"
})
public class TYxzcLoanResult {

    protected Integer appId;
    protected String breakContractrate;
    protected String createTime;
    protected Integer creditscore;
    protected Integer overdueCount;
    protected Integer overdueNinetyDaysCount;
    protected Integer overdueOneeightyDaysCount;
    protected Integer queryOrgs;
    @XmlElement(nillable = true)
    protected List<TYxzcRecordDetail> queryRecordDetail;
    @XmlElement(nillable = true)
    protected List<TYxzcTimesDetail> queryTimesDetail;
    protected Long yxzcId;

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
     * ��ȡbreakContractrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakContractrate() {
        return breakContractrate;
    }

    /**
     * ����breakContractrate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakContractrate(String value) {
        this.breakContractrate = value;
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
     * ��ȡcreditscore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditscore() {
        return creditscore;
    }

    /**
     * ����creditscore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditscore(Integer value) {
        this.creditscore = value;
    }

    /**
     * ��ȡoverdueCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueCount() {
        return overdueCount;
    }

    /**
     * ����overdueCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueCount(Integer value) {
        this.overdueCount = value;
    }

    /**
     * ��ȡoverdueNinetyDaysCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueNinetyDaysCount() {
        return overdueNinetyDaysCount;
    }

    /**
     * ����overdueNinetyDaysCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueNinetyDaysCount(Integer value) {
        this.overdueNinetyDaysCount = value;
    }

    /**
     * ��ȡoverdueOneeightyDaysCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueOneeightyDaysCount() {
        return overdueOneeightyDaysCount;
    }

    /**
     * ����overdueOneeightyDaysCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueOneeightyDaysCount(Integer value) {
        this.overdueOneeightyDaysCount = value;
    }

    /**
     * ��ȡqueryOrgs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueryOrgs() {
        return queryOrgs;
    }

    /**
     * ����queryOrgs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueryOrgs(Integer value) {
        this.queryOrgs = value;
    }

    /**
     * Gets the value of the queryRecordDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryRecordDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryRecordDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TYxzcRecordDetail }
     * 
     * 
     */
    public List<TYxzcRecordDetail> getQueryRecordDetail() {
        if (queryRecordDetail == null) {
            queryRecordDetail = new ArrayList<TYxzcRecordDetail>();
        }
        return this.queryRecordDetail;
    }

    /**
     * Gets the value of the queryTimesDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryTimesDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryTimesDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TYxzcTimesDetail }
     * 
     * 
     */
    public List<TYxzcTimesDetail> getQueryTimesDetail() {
        if (queryTimesDetail == null) {
            queryTimesDetail = new ArrayList<TYxzcTimesDetail>();
        }
        return this.queryTimesDetail;
    }

    /**
     * ��ȡyxzcId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getYxzcId() {
        return yxzcId;
    }

    /**
     * ����yxzcId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setYxzcId(Long value) {
        this.yxzcId = value;
    }

}
