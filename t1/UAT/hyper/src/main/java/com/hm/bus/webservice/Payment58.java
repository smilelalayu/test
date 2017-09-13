
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>payment58 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="payment58"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="certId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="downPayMent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firRegdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handleMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanTerm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mileage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="receiveAreaCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBankCardCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBranchCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCellCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCorporation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveIDCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveNameCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOpenCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgCell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receivebankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refuseMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="vehBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehTerritoral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="venderPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment58", propOrder = {
    "appayAmt",
    "appid",
    "certId",
    "downPayMent",
    "firRegdate",
    "handleMan",
    "handlePhone",
    "instruction",
    "loanTerm",
    "mileage",
    "monthRate",
    "receiveAreaCar",
    "receiveBankCardCar",
    "receiveBranchCar",
    "receiveCellCar",
    "receiveCorporation",
    "receiveCountryCode",
    "receiveIDCar",
    "receiveNameCar",
    "receiveOpen",
    "receiveOpenCar",
    "receiveOrgArea",
    "receiveOrgBankCard",
    "receiveOrgBranch",
    "receiveOrgCell",
    "receiveOrgID",
    "receiveOrgName",
    "receivebankCard",
    "refuseMsg",
    "repayBankCard",
    "repayOpen",
    "signtime",
    "userId",
    "vehBrand",
    "vehTerritoral",
    "vehTotal",
    "vehValue",
    "venderPhoneNum"
})
public class Payment58 {

    protected BigDecimal appayAmt;
    protected int appid;
    protected String certId;
    protected String downPayMent;
    protected String firRegdate;
    protected String handleMan;
    protected String handlePhone;
    protected String instruction;
    protected int loanTerm;
    protected String mileage;
    protected float monthRate;
    protected String receiveAreaCar;
    protected String receiveBankCardCar;
    protected String receiveBranchCar;
    protected String receiveCellCar;
    protected String receiveCorporation;
    protected String receiveCountryCode;
    protected String receiveIDCar;
    protected String receiveNameCar;
    protected String receiveOpen;
    protected String receiveOpenCar;
    protected String receiveOrgArea;
    protected String receiveOrgBankCard;
    protected String receiveOrgBranch;
    protected String receiveOrgCell;
    protected String receiveOrgID;
    protected String receiveOrgName;
    protected String receivebankCard;
    protected String refuseMsg;
    protected String repayBankCard;
    protected String repayOpen;
    protected String signtime;
    protected long userId;
    protected String vehBrand;
    protected String vehTerritoral;
    protected String vehTotal;
    protected String vehValue;
    protected String venderPhoneNum;

    /**
     * ��ȡappayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppayAmt() {
        return appayAmt;
    }

    /**
     * ����appayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppayAmt(BigDecimal value) {
        this.appayAmt = value;
    }

    /**
     * ��ȡappid���Ե�ֵ��
     * 
     */
    public int getAppid() {
        return appid;
    }

    /**
     * ����appid���Ե�ֵ��
     * 
     */
    public void setAppid(int value) {
        this.appid = value;
    }

    /**
     * ��ȡcertId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * ����certId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertId(String value) {
        this.certId = value;
    }

    /**
     * ��ȡdownPayMent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownPayMent() {
        return downPayMent;
    }

    /**
     * ����downPayMent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownPayMent(String value) {
        this.downPayMent = value;
    }

    /**
     * ��ȡfirRegdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirRegdate() {
        return firRegdate;
    }

    /**
     * ����firRegdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirRegdate(String value) {
        this.firRegdate = value;
    }

    /**
     * ��ȡhandleMan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleMan() {
        return handleMan;
    }

    /**
     * ����handleMan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleMan(String value) {
        this.handleMan = value;
    }

    /**
     * ��ȡhandlePhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlePhone() {
        return handlePhone;
    }

    /**
     * ����handlePhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlePhone(String value) {
        this.handlePhone = value;
    }

    /**
     * ��ȡinstruction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * ����instruction���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

    /**
     * ��ȡloanTerm���Ե�ֵ��
     * 
     */
    public int getLoanTerm() {
        return loanTerm;
    }

    /**
     * ����loanTerm���Ե�ֵ��
     * 
     */
    public void setLoanTerm(int value) {
        this.loanTerm = value;
    }

    /**
     * ��ȡmileage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileage() {
        return mileage;
    }

    /**
     * ����mileage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileage(String value) {
        this.mileage = value;
    }

    /**
     * ��ȡmonthRate���Ե�ֵ��
     * 
     */
    public float getMonthRate() {
        return monthRate;
    }

    /**
     * ����monthRate���Ե�ֵ��
     * 
     */
    public void setMonthRate(float value) {
        this.monthRate = value;
    }

    /**
     * ��ȡreceiveAreaCar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveAreaCar() {
        return receiveAreaCar;
    }

    /**
     * ����receiveAreaCar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveAreaCar(String value) {
        this.receiveAreaCar = value;
    }

    /**
     * ��ȡreceiveBankCardCar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveBankCardCar() {
        return receiveBankCardCar;
    }

    /**
     * ����receiveBankCardCar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveBankCardCar(String value) {
        this.receiveBankCardCar = value;
    }

    /**
     * ��ȡreceiveBranchCar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveBranchCar() {
        return receiveBranchCar;
    }

    /**
     * ����receiveBranchCar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveBranchCar(String value) {
        this.receiveBranchCar = value;
    }

    /**
     * ��ȡreceiveCellCar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCellCar() {
        return receiveCellCar;
    }

    /**
     * ����receiveCellCar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCellCar(String value) {
        this.receiveCellCar = value;
    }

    /**
     * ��ȡreceiveCorporation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCorporation() {
        return receiveCorporation;
    }

    /**
     * ����receiveCorporation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCorporation(String value) {
        this.receiveCorporation = value;
    }

    /**
     * ��ȡreceiveCountryCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCountryCode() {
        return receiveCountryCode;
    }

    /**
     * ����receiveCountryCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCountryCode(String value) {
        this.receiveCountryCode = value;
    }

    /**
     * ��ȡreceiveIDCar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveIDCar() {
        return receiveIDCar;
    }

    /**
     * ����receiveIDCar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveIDCar(String value) {
        this.receiveIDCar = value;
    }

    /**
     * ��ȡreceiveNameCar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveNameCar() {
        return receiveNameCar;
    }

    /**
     * ����receiveNameCar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveNameCar(String value) {
        this.receiveNameCar = value;
    }

    /**
     * ��ȡreceiveOpen���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOpen() {
        return receiveOpen;
    }

    /**
     * ����receiveOpen���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOpen(String value) {
        this.receiveOpen = value;
    }

    /**
     * ��ȡreceiveOpenCar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOpenCar() {
        return receiveOpenCar;
    }

    /**
     * ����receiveOpenCar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOpenCar(String value) {
        this.receiveOpenCar = value;
    }

    /**
     * ��ȡreceiveOrgArea���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgArea() {
        return receiveOrgArea;
    }

    /**
     * ����receiveOrgArea���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgArea(String value) {
        this.receiveOrgArea = value;
    }

    /**
     * ��ȡreceiveOrgBankCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgBankCard() {
        return receiveOrgBankCard;
    }

    /**
     * ����receiveOrgBankCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgBankCard(String value) {
        this.receiveOrgBankCard = value;
    }

    /**
     * ��ȡreceiveOrgBranch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgBranch() {
        return receiveOrgBranch;
    }

    /**
     * ����receiveOrgBranch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgBranch(String value) {
        this.receiveOrgBranch = value;
    }

    /**
     * ��ȡreceiveOrgCell���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgCell() {
        return receiveOrgCell;
    }

    /**
     * ����receiveOrgCell���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgCell(String value) {
        this.receiveOrgCell = value;
    }

    /**
     * ��ȡreceiveOrgID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgID() {
        return receiveOrgID;
    }

    /**
     * ����receiveOrgID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgID(String value) {
        this.receiveOrgID = value;
    }

    /**
     * ��ȡreceiveOrgName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveOrgName() {
        return receiveOrgName;
    }

    /**
     * ����receiveOrgName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveOrgName(String value) {
        this.receiveOrgName = value;
    }

    /**
     * ��ȡreceivebankCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivebankCard() {
        return receivebankCard;
    }

    /**
     * ����receivebankCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivebankCard(String value) {
        this.receivebankCard = value;
    }

    /**
     * ��ȡrefuseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefuseMsg() {
        return refuseMsg;
    }

    /**
     * ����refuseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefuseMsg(String value) {
        this.refuseMsg = value;
    }

    /**
     * ��ȡrepayBankCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayBankCard() {
        return repayBankCard;
    }

    /**
     * ����repayBankCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayBankCard(String value) {
        this.repayBankCard = value;
    }

    /**
     * ��ȡrepayOpen���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayOpen() {
        return repayOpen;
    }

    /**
     * ����repayOpen���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayOpen(String value) {
        this.repayOpen = value;
    }

    /**
     * ��ȡsigntime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigntime() {
        return signtime;
    }

    /**
     * ����signtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigntime(String value) {
        this.signtime = value;
    }

    /**
     * ��ȡuserId���Ե�ֵ��
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * ����userId���Ե�ֵ��
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * ��ȡvehBrand���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehBrand() {
        return vehBrand;
    }

    /**
     * ����vehBrand���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehBrand(String value) {
        this.vehBrand = value;
    }

    /**
     * ��ȡvehTerritoral���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehTerritoral() {
        return vehTerritoral;
    }

    /**
     * ����vehTerritoral���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehTerritoral(String value) {
        this.vehTerritoral = value;
    }

    /**
     * ��ȡvehTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehTotal() {
        return vehTotal;
    }

    /**
     * ����vehTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehTotal(String value) {
        this.vehTotal = value;
    }

    /**
     * ��ȡvehValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehValue() {
        return vehValue;
    }

    /**
     * ����vehValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehValue(String value) {
        this.vehValue = value;
    }

    /**
     * ��ȡvenderPhoneNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenderPhoneNum() {
        return venderPhoneNum;
    }

    /**
     * ����venderPhoneNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenderPhoneNum(String value) {
        this.venderPhoneNum = value;
    }

}
