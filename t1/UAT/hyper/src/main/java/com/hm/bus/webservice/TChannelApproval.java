
package com.hm.bus.webservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tChannelApproval complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tChannelApproval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://biz.webservice.macrosky.com/}tChannelApprovalBaseModel"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abandonTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="abandoner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="advisoryAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="advisoryServiceAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="application" type="{http://biz.webservice.macrosky.com/}tLonApplication" minOccurs="0"/&gt;
 *         &lt;element name="approvalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approvalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attachList" type="{http://biz.webservice.macrosky.com/}tLonAttach" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chAdvisoryAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="chAdvisoryServiceAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="chApproveAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="chContractAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="chRiskAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="chServiceAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="chYearRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="riskAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sendTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tChannelApproval", propOrder = {
    "abandonTime",
    "abandoner",
    "advisoryAmt",
    "advisoryServiceAmt",
    "application",
    "approvalStatus",
    "approvalTime",
    "approver",
    "attachList",
    "chAdvisoryAmt",
    "chAdvisoryServiceAmt",
    "chApproveAmt",
    "chContractAmt",
    "chRiskAmt",
    "chServiceAmt",
    "chYearRate",
    "channel",
    "channelName",
    "channelType",
    "createTime",
    "extendVc1",
    "extendVc2",
    "extendVc3",
    "extendVc4",
    "extendVc5",
    "id",
    "riskAmt",
    "sendTime",
    "serviceAmt",
    "type",
    "uniqueId"
})
public class TChannelApproval
    extends TChannelApprovalBaseModel
{

    protected String abandonTime;
    protected String abandoner;
    protected BigDecimal advisoryAmt;
    protected BigDecimal advisoryServiceAmt;
    protected TLonApplication application;
    protected String approvalStatus;
    protected String approvalTime;
    protected String approver;
    @XmlElement(nillable = true)
    protected List<TLonAttach> attachList;
    protected BigDecimal chAdvisoryAmt;
    protected BigDecimal chAdvisoryServiceAmt;
    protected BigDecimal chApproveAmt;
    protected BigDecimal chContractAmt;
    protected BigDecimal chRiskAmt;
    protected BigDecimal chServiceAmt;
    protected Double chYearRate;
    protected String channel;
    protected String channelName;
    protected String channelType;
    protected String createTime;
    protected String extendVc1;
    protected String extendVc2;
    protected String extendVc3;
    protected String extendVc4;
    protected String extendVc5;
    protected Integer id;
    protected BigDecimal riskAmt;
    protected String sendTime;
    protected BigDecimal serviceAmt;
    protected String type;
    protected String uniqueId;

    /**
     * 获取abandonTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbandonTime() {
        return abandonTime;
    }

    /**
     * 设置abandonTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbandonTime(String value) {
        this.abandonTime = value;
    }

    /**
     * 获取abandoner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbandoner() {
        return abandoner;
    }

    /**
     * 设置abandoner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbandoner(String value) {
        this.abandoner = value;
    }

    /**
     * 获取advisoryAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvisoryAmt() {
        return advisoryAmt;
    }

    /**
     * 设置advisoryAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvisoryAmt(BigDecimal value) {
        this.advisoryAmt = value;
    }

    /**
     * 获取advisoryServiceAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvisoryServiceAmt() {
        return advisoryServiceAmt;
    }

    /**
     * 设置advisoryServiceAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvisoryServiceAmt(BigDecimal value) {
        this.advisoryServiceAmt = value;
    }

    /**
     * 获取application属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TLonApplication }
     *     
     */
    public TLonApplication getApplication() {
        return application;
    }

    /**
     * 设置application属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplication }
     *     
     */
    public void setApplication(TLonApplication value) {
        this.application = value;
    }

    /**
     * 获取approvalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * 设置approvalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStatus(String value) {
        this.approvalStatus = value;
    }

    /**
     * 获取approvalTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalTime() {
        return approvalTime;
    }

    /**
     * 设置approvalTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalTime(String value) {
        this.approvalTime = value;
    }

    /**
     * 获取approver属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprover() {
        return approver;
    }

    /**
     * 设置approver属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprover(String value) {
        this.approver = value;
    }

    /**
     * Gets the value of the attachList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonAttach }
     * 
     * 
     */
    public List<TLonAttach> getAttachList() {
        if (attachList == null) {
            attachList = new ArrayList<TLonAttach>();
        }
        return this.attachList;
    }

    /**
     * 获取chAdvisoryAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChAdvisoryAmt() {
        return chAdvisoryAmt;
    }

    /**
     * 设置chAdvisoryAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChAdvisoryAmt(BigDecimal value) {
        this.chAdvisoryAmt = value;
    }

    /**
     * 获取chAdvisoryServiceAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChAdvisoryServiceAmt() {
        return chAdvisoryServiceAmt;
    }

    /**
     * 设置chAdvisoryServiceAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChAdvisoryServiceAmt(BigDecimal value) {
        this.chAdvisoryServiceAmt = value;
    }

    /**
     * 获取chApproveAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChApproveAmt() {
        return chApproveAmt;
    }

    /**
     * 设置chApproveAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChApproveAmt(BigDecimal value) {
        this.chApproveAmt = value;
    }

    /**
     * 获取chContractAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChContractAmt() {
        return chContractAmt;
    }

    /**
     * 设置chContractAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChContractAmt(BigDecimal value) {
        this.chContractAmt = value;
    }

    /**
     * 获取chRiskAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChRiskAmt() {
        return chRiskAmt;
    }

    /**
     * 设置chRiskAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChRiskAmt(BigDecimal value) {
        this.chRiskAmt = value;
    }

    /**
     * 获取chServiceAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChServiceAmt() {
        return chServiceAmt;
    }

    /**
     * 设置chServiceAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChServiceAmt(BigDecimal value) {
        this.chServiceAmt = value;
    }

    /**
     * 获取chYearRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChYearRate() {
        return chYearRate;
    }

    /**
     * 设置chYearRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChYearRate(Double value) {
        this.chYearRate = value;
    }

    /**
     * 获取channel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置channel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * 获取channelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * 设置channelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * 获取channelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * 设置channelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
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
     * 获取extendVc1属性的值。
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
     * 设置extendVc1属性的值。
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
     * 获取extendVc2属性的值。
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
     * 设置extendVc2属性的值。
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
     * 获取extendVc3属性的值。
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
     * 设置extendVc3属性的值。
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
     * 获取extendVc4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendVc4() {
        return extendVc4;
    }

    /**
     * 设置extendVc4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendVc4(String value) {
        this.extendVc4 = value;
    }

    /**
     * 获取extendVc5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendVc5() {
        return extendVc5;
    }

    /**
     * 设置extendVc5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendVc5(String value) {
        this.extendVc5 = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * 获取riskAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRiskAmt() {
        return riskAmt;
    }

    /**
     * 设置riskAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRiskAmt(BigDecimal value) {
        this.riskAmt = value;
    }

    /**
     * 获取sendTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendTime() {
        return sendTime;
    }

    /**
     * 设置sendTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendTime(String value) {
        this.sendTime = value;
    }

    /**
     * 获取serviceAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceAmt() {
        return serviceAmt;
    }

    /**
     * 设置serviceAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceAmt(BigDecimal value) {
        this.serviceAmt = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取uniqueId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * 设置uniqueId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

}
