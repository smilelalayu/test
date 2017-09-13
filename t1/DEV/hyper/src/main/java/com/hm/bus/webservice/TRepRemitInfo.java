
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>tRepRemitInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tRepRemitInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inCustname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inFyacct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isHand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchPersent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifieAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifieLoaner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outAppId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outCustname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outFyacct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pridom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="repayBatchId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="repayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retmsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="swiftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranamt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="transDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="transFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRepRemitInfo", propOrder = {
    "inCustname",
    "inFyacct",
    "inOrderId",
    "isAllowed",
    "isHand",
    "matchPersent",
    "modifieAccount",
    "modifieLoaner",
    "orgCode",
    "outAppId",
    "outCustname",
    "outFyacct",
    "pridom",
    "remitId",
    "repayBatchId",
    "repayType",
    "retcode",
    "retmsg",
    "signature",
    "sourceClient",
    "swiftNo",
    "tranType",
    "tranamt",
    "transDate",
    "transFlag",
    "updateTime"
})
public class TRepRemitInfo {

    protected String inCustname;
    protected String inFyacct;
    protected String inOrderId;
    protected String isAllowed;
    protected String isHand;
    protected String matchPersent;
    protected String modifieAccount;
    protected String modifieLoaner;
    protected String orgCode;
    protected String outAppId;
    protected String outCustname;
    protected String outFyacct;
    protected String pridom;
    protected Integer remitId;
    protected Integer repayBatchId;
    protected String repayType;
    protected String retcode;
    protected String retmsg;
    protected String signature;
    protected String sourceClient;
    protected String swiftNo;
    protected String tranType;
    protected BigDecimal tranamt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transDate;
    protected String transFlag;
    protected String updateTime;

    /**
     * ��ȡinCustname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustname() {
        return inCustname;
    }

    /**
     * ����inCustname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustname(String value) {
        this.inCustname = value;
    }

    /**
     * ��ȡinFyacct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFyacct() {
        return inFyacct;
    }

    /**
     * ����inFyacct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFyacct(String value) {
        this.inFyacct = value;
    }

    /**
     * ��ȡinOrderId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOrderId() {
        return inOrderId;
    }

    /**
     * ����inOrderId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOrderId(String value) {
        this.inOrderId = value;
    }

    /**
     * ��ȡisAllowed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAllowed() {
        return isAllowed;
    }

    /**
     * ����isAllowed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAllowed(String value) {
        this.isAllowed = value;
    }

    /**
     * ��ȡisHand���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHand() {
        return isHand;
    }

    /**
     * ����isHand���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHand(String value) {
        this.isHand = value;
    }

    /**
     * ��ȡmatchPersent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchPersent() {
        return matchPersent;
    }

    /**
     * ����matchPersent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchPersent(String value) {
        this.matchPersent = value;
    }

    /**
     * ��ȡmodifieAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifieAccount() {
        return modifieAccount;
    }

    /**
     * ����modifieAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifieAccount(String value) {
        this.modifieAccount = value;
    }

    /**
     * ��ȡmodifieLoaner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifieLoaner() {
        return modifieLoaner;
    }

    /**
     * ����modifieLoaner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifieLoaner(String value) {
        this.modifieLoaner = value;
    }

    /**
     * ��ȡorgCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * ����orgCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

    /**
     * ��ȡoutAppId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAppId() {
        return outAppId;
    }

    /**
     * ����outAppId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAppId(String value) {
        this.outAppId = value;
    }

    /**
     * ��ȡoutCustname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustname() {
        return outCustname;
    }

    /**
     * ����outCustname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustname(String value) {
        this.outCustname = value;
    }

    /**
     * ��ȡoutFyacct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFyacct() {
        return outFyacct;
    }

    /**
     * ����outFyacct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFyacct(String value) {
        this.outFyacct = value;
    }

    /**
     * ��ȡpridom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPridom() {
        return pridom;
    }

    /**
     * ����pridom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPridom(String value) {
        this.pridom = value;
    }

    /**
     * ��ȡremitId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemitId() {
        return remitId;
    }

    /**
     * ����remitId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemitId(Integer value) {
        this.remitId = value;
    }

    /**
     * ��ȡrepayBatchId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepayBatchId() {
        return repayBatchId;
    }

    /**
     * ����repayBatchId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepayBatchId(Integer value) {
        this.repayBatchId = value;
    }

    /**
     * ��ȡrepayType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayType() {
        return repayType;
    }

    /**
     * ����repayType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayType(String value) {
        this.repayType = value;
    }

    /**
     * ��ȡretcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetcode() {
        return retcode;
    }

    /**
     * ����retcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetcode(String value) {
        this.retcode = value;
    }

    /**
     * ��ȡretmsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetmsg() {
        return retmsg;
    }

    /**
     * ����retmsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetmsg(String value) {
        this.retmsg = value;
    }

    /**
     * ��ȡsignature���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * ����signature���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * ��ȡsourceClient���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceClient() {
        return sourceClient;
    }

    /**
     * ����sourceClient���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceClient(String value) {
        this.sourceClient = value;
    }

    /**
     * ��ȡswiftNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftNo() {
        return swiftNo;
    }

    /**
     * ����swiftNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiftNo(String value) {
        this.swiftNo = value;
    }

    /**
     * ��ȡtranType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranType() {
        return tranType;
    }

    /**
     * ����tranType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranType(String value) {
        this.tranType = value;
    }

    /**
     * ��ȡtranamt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTranamt() {
        return tranamt;
    }

    /**
     * ����tranamt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTranamt(BigDecimal value) {
        this.tranamt = value;
    }

    /**
     * ��ȡtransDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransDate() {
        return transDate;
    }

    /**
     * ����transDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransDate(XMLGregorianCalendar value) {
        this.transDate = value;
    }

    /**
     * ��ȡtransFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransFlag() {
        return transFlag;
    }

    /**
     * ����transFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransFlag(String value) {
        this.transFlag = value;
    }

    /**
     * ��ȡupdateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * ����updateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(String value) {
        this.updateTime = value;
    }

}
