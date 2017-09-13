
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationPersonalRentalHouse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationPersonalRentalHouse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendFl4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="extendFl5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="extendVc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseArea" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="houseEvaluation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="houseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="houseRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mortgageBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="residueEvaluation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="yearAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationPersonalRentalHouse", propOrder = {
    "appId",
    "createTime",
    "extendFl4",
    "extendFl5",
    "extendVc1",
    "extendVc2",
    "extendVc3",
    "houseAddress",
    "houseArea",
    "houseEvaluation",
    "houseId",
    "houseRemark",
    "houseType",
    "mortgageBank",
    "residueEvaluation",
    "yearAmt"
})
public class TLonApplicationPersonalRentalHouse {

    protected Integer appId;
    protected String createTime;
    protected BigDecimal extendFl4;
    protected BigDecimal extendFl5;
    protected String extendVc1;
    protected String extendVc2;
    protected String extendVc3;
    protected String houseAddress;
    protected Float houseArea;
    protected BigDecimal houseEvaluation;
    protected Long houseId;
    protected String houseRemark;
    protected String houseType;
    protected String mortgageBank;
    protected BigDecimal residueEvaluation;
    protected BigDecimal yearAmt;

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
     * ��ȡextendFl4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtendFl4() {
        return extendFl4;
    }

    /**
     * ����extendFl4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtendFl4(BigDecimal value) {
        this.extendFl4 = value;
    }

    /**
     * ��ȡextendFl5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtendFl5() {
        return extendFl5;
    }

    /**
     * ����extendFl5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtendFl5(BigDecimal value) {
        this.extendFl5 = value;
    }

    /**
     * ��ȡextendVc1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendVc1() {
        return extendVc1;
    }

    /**
     * ����extendVc1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendVc1(String value) {
        this.extendVc1 = value;
    }

    /**
     * ��ȡextendVc2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendVc2() {
        return extendVc2;
    }

    /**
     * ����extendVc2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendVc2(String value) {
        this.extendVc2 = value;
    }

    /**
     * ��ȡextendVc3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendVc3() {
        return extendVc3;
    }

    /**
     * ����extendVc3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendVc3(String value) {
        this.extendVc3 = value;
    }

    /**
     * ��ȡhouseAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAddress() {
        return houseAddress;
    }

    /**
     * ����houseAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAddress(String value) {
        this.houseAddress = value;
    }

    /**
     * ��ȡhouseArea���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHouseArea() {
        return houseArea;
    }

    /**
     * ����houseArea���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHouseArea(Float value) {
        this.houseArea = value;
    }

    /**
     * ��ȡhouseEvaluation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseEvaluation() {
        return houseEvaluation;
    }

    /**
     * ����houseEvaluation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseEvaluation(BigDecimal value) {
        this.houseEvaluation = value;
    }

    /**
     * ��ȡhouseId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHouseId() {
        return houseId;
    }

    /**
     * ����houseId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHouseId(Long value) {
        this.houseId = value;
    }

    /**
     * ��ȡhouseRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseRemark() {
        return houseRemark;
    }

    /**
     * ����houseRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseRemark(String value) {
        this.houseRemark = value;
    }

    /**
     * ��ȡhouseType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseType() {
        return houseType;
    }

    /**
     * ����houseType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseType(String value) {
        this.houseType = value;
    }

    /**
     * ��ȡmortgageBank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageBank() {
        return mortgageBank;
    }

    /**
     * ����mortgageBank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageBank(String value) {
        this.mortgageBank = value;
    }

    /**
     * ��ȡresidueEvaluation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResidueEvaluation() {
        return residueEvaluation;
    }

    /**
     * ����residueEvaluation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResidueEvaluation(BigDecimal value) {
        this.residueEvaluation = value;
    }

    /**
     * ��ȡyearAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYearAmt() {
        return yearAmt;
    }

    /**
     * ����yearAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYearAmt(BigDecimal value) {
        this.yearAmt = value;
    }

}
