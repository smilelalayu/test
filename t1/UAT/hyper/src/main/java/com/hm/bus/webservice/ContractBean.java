
package com.hm.bus.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>contractBean complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="contractBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="advisoryServiceAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appDepositAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="associationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="borrowerCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="borrowerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bzjAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bzjAmountDx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coborrowerCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coborrowerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractList" type="{http://biz.webservice.macrosky.com/}tLonApplicationContract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contractNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hbrNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instGoldNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interestRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interestRuleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastMoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastMoneyDx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastMoneyXx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lendCardBankSubbranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthMoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthMoneyDx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthMoneyXx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payPlans" type="{http://biz.webservice.macrosky.com/}contractGenPayPlan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="riskAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suggestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sysCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thdSignNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalMoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalMoneyDx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalMoneyXx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="usedLoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yearRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eDu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eDuDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractBean", propOrder = {
    "account",
    "accountBank",
    "accountCard",
    "address",
    "advisoryServiceAmt",
    "appDepositAmt",
    "associationName",
    "borrowerCardId",
    "borrowerName",
    "bzjAmount",
    "bzjAmountDx",
    "cityId",
    "coborrowerCardId",
    "coborrowerName",
    "contactPhone",
    "contractList",
    "contractNum",
    "custNo",
    "email",
    "endDate",
    "expiryDate",
    "hbrNo",
    "instCode",
    "instGoldNo",
    "interestRule",
    "interestRuleName",
    "lastDate",
    "lastMoney",
    "lastMoneyDx",
    "lastMoneyXx",
    "lendCardBankSubbranch",
    "loanDate",
    "loanTerm",
    "mobilePhone",
    "monthMoney",
    "monthMoneyDx",
    "monthMoneyXx",
    "orgCode",
    "organization",
    "payDay",
    "payPlans",
    "phone",
    "productId",
    "riskAmt",
    "startDate",
    "suggestAmount",
    "sysCode",
    "thdId",
    "thdSignNo",
    "totalFee",
    "totalMoney",
    "totalMoneyDx",
    "totalMoneyXx",
    "type",
    "usedLoan",
    "userId",
    "userName",
    "yearRate",
    "zipCode",
    "eDu",
    "eDuDays"
})
public class ContractBean {

    protected String account;
    protected String accountBank;
    protected String accountCard;
    protected String address;
    protected String advisoryServiceAmt;
    protected String appDepositAmt;
    protected String associationName;
    protected String borrowerCardId;
    protected String borrowerName;
    protected String bzjAmount;
    protected String bzjAmountDx;
    protected String cityId;
    protected String coborrowerCardId;
    protected String coborrowerName;
    protected String contactPhone;
    @XmlElement(nillable = true)
    protected List<TLonApplicationContract> contractList;
    protected String contractNum;
    protected String custNo;
    protected String email;
    protected String endDate;
    protected String expiryDate;
    protected String hbrNo;
    protected String instCode;
    protected String instGoldNo;
    protected String interestRule;
    protected String interestRuleName;
    protected String lastDate;
    protected String lastMoney;
    protected String lastMoneyDx;
    protected String lastMoneyXx;
    protected String lendCardBankSubbranch;
    protected String loanDate;
    protected String loanTerm;
    protected String mobilePhone;
    protected String monthMoney;
    protected String monthMoneyDx;
    protected String monthMoneyXx;
    protected String orgCode;
    protected String organization;
    protected String payDay;
    @XmlElement(nillable = true)
    protected List<ContractGenPayPlan> payPlans;
    protected String phone;
    protected long productId;
    protected String riskAmt;
    protected String startDate;
    protected String suggestAmount;
    protected String sysCode;
    protected String thdId;
    protected String thdSignNo;
    protected Double totalFee;
    protected String totalMoney;
    protected String totalMoneyDx;
    protected String totalMoneyXx;
    protected int type;
    protected String usedLoan;
    protected String userId;
    protected String userName;
    protected String yearRate;
    protected String zipCode;
    protected String eDu;
    protected String eDuDays;

    /**
     * ��ȡaccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * ����account���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * ��ȡaccountBank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBank() {
        return accountBank;
    }

    /**
     * ����accountBank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBank(String value) {
        this.accountBank = value;
    }

    /**
     * ��ȡaccountCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCard() {
        return accountCard;
    }

    /**
     * ����accountCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCard(String value) {
        this.accountCard = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * ��ȡadvisoryServiceAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisoryServiceAmt() {
        return advisoryServiceAmt;
    }

    /**
     * ����advisoryServiceAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisoryServiceAmt(String value) {
        this.advisoryServiceAmt = value;
    }

    /**
     * ��ȡappDepositAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppDepositAmt() {
        return appDepositAmt;
    }

    /**
     * ����appDepositAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppDepositAmt(String value) {
        this.appDepositAmt = value;
    }

    /**
     * ��ȡassociationName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationName() {
        return associationName;
    }

    /**
     * ����associationName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationName(String value) {
        this.associationName = value;
    }

    /**
     * ��ȡborrowerCardId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerCardId() {
        return borrowerCardId;
    }

    /**
     * ����borrowerCardId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerCardId(String value) {
        this.borrowerCardId = value;
    }

    /**
     * ��ȡborrowerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerName() {
        return borrowerName;
    }

    /**
     * ����borrowerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerName(String value) {
        this.borrowerName = value;
    }

    /**
     * ��ȡbzjAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBzjAmount() {
        return bzjAmount;
    }

    /**
     * ����bzjAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBzjAmount(String value) {
        this.bzjAmount = value;
    }

    /**
     * ��ȡbzjAmountDx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBzjAmountDx() {
        return bzjAmountDx;
    }

    /**
     * ����bzjAmountDx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBzjAmountDx(String value) {
        this.bzjAmountDx = value;
    }

    /**
     * ��ȡcityId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * ����cityId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityId(String value) {
        this.cityId = value;
    }

    /**
     * ��ȡcoborrowerCardId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoborrowerCardId() {
        return coborrowerCardId;
    }

    /**
     * ����coborrowerCardId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoborrowerCardId(String value) {
        this.coborrowerCardId = value;
    }

    /**
     * ��ȡcoborrowerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoborrowerName() {
        return coborrowerName;
    }

    /**
     * ����coborrowerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoborrowerName(String value) {
        this.coborrowerName = value;
    }

    /**
     * ��ȡcontactPhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * ����contactPhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the contractList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonApplicationContract }
     * 
     * 
     */
    public List<TLonApplicationContract> getContractList() {
        if (contractList == null) {
            contractList = new ArrayList<TLonApplicationContract>();
        }
        return this.contractList;
    }

    /**
     * ��ȡcontractNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * ����contractNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNum(String value) {
        this.contractNum = value;
    }

    /**
     * ��ȡcustNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNo() {
        return custNo;
    }

    /**
     * ����custNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNo(String value) {
        this.custNo = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * ��ȡexpiryDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * ����expiryDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * ��ȡhbrNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHbrNo() {
        return hbrNo;
    }

    /**
     * ����hbrNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHbrNo(String value) {
        this.hbrNo = value;
    }

    /**
     * ��ȡinstCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstCode() {
        return instCode;
    }

    /**
     * ����instCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstCode(String value) {
        this.instCode = value;
    }

    /**
     * ��ȡinstGoldNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstGoldNo() {
        return instGoldNo;
    }

    /**
     * ����instGoldNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstGoldNo(String value) {
        this.instGoldNo = value;
    }

    /**
     * ��ȡinterestRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRule() {
        return interestRule;
    }

    /**
     * ����interestRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRule(String value) {
        this.interestRule = value;
    }

    /**
     * ��ȡinterestRuleName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRuleName() {
        return interestRuleName;
    }

    /**
     * ����interestRuleName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRuleName(String value) {
        this.interestRuleName = value;
    }

    /**
     * ��ȡlastDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDate() {
        return lastDate;
    }

    /**
     * ����lastDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDate(String value) {
        this.lastDate = value;
    }

    /**
     * ��ȡlastMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMoney() {
        return lastMoney;
    }

    /**
     * ����lastMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMoney(String value) {
        this.lastMoney = value;
    }

    /**
     * ��ȡlastMoneyDx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMoneyDx() {
        return lastMoneyDx;
    }

    /**
     * ����lastMoneyDx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMoneyDx(String value) {
        this.lastMoneyDx = value;
    }

    /**
     * ��ȡlastMoneyXx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMoneyXx() {
        return lastMoneyXx;
    }

    /**
     * ����lastMoneyXx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMoneyXx(String value) {
        this.lastMoneyXx = value;
    }

    /**
     * ��ȡlendCardBankSubbranch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLendCardBankSubbranch() {
        return lendCardBankSubbranch;
    }

    /**
     * ����lendCardBankSubbranch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLendCardBankSubbranch(String value) {
        this.lendCardBankSubbranch = value;
    }

    /**
     * ��ȡloanDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanDate() {
        return loanDate;
    }

    /**
     * ����loanDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanDate(String value) {
        this.loanDate = value;
    }

    /**
     * ��ȡloanTerm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanTerm() {
        return loanTerm;
    }

    /**
     * ����loanTerm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanTerm(String value) {
        this.loanTerm = value;
    }

    /**
     * ��ȡmobilePhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * ����mobilePhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * ��ȡmonthMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthMoney() {
        return monthMoney;
    }

    /**
     * ����monthMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthMoney(String value) {
        this.monthMoney = value;
    }

    /**
     * ��ȡmonthMoneyDx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthMoneyDx() {
        return monthMoneyDx;
    }

    /**
     * ����monthMoneyDx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthMoneyDx(String value) {
        this.monthMoneyDx = value;
    }

    /**
     * ��ȡmonthMoneyXx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthMoneyXx() {
        return monthMoneyXx;
    }

    /**
     * ����monthMoneyXx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthMoneyXx(String value) {
        this.monthMoneyXx = value;
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
     * ��ȡorganization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * ����organization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * ��ȡpayDay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayDay() {
        return payDay;
    }

    /**
     * ����payDay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayDay(String value) {
        this.payDay = value;
    }

    /**
     * Gets the value of the payPlans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payPlans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayPlans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractGenPayPlan }
     * 
     * 
     */
    public List<ContractGenPayPlan> getPayPlans() {
        if (payPlans == null) {
            payPlans = new ArrayList<ContractGenPayPlan>();
        }
        return this.payPlans;
    }

    /**
     * ��ȡphone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����phone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * ��ȡproductId���Ե�ֵ��
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * ����productId���Ե�ֵ��
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * ��ȡriskAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAmt() {
        return riskAmt;
    }

    /**
     * ����riskAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAmt(String value) {
        this.riskAmt = value;
    }

    /**
     * ��ȡstartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * ����startDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * ��ȡsuggestAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestAmount() {
        return suggestAmount;
    }

    /**
     * ����suggestAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestAmount(String value) {
        this.suggestAmount = value;
    }

    /**
     * ��ȡsysCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * ����sysCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysCode(String value) {
        this.sysCode = value;
    }

    /**
     * ��ȡthdId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThdId() {
        return thdId;
    }

    /**
     * ����thdId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThdId(String value) {
        this.thdId = value;
    }

    /**
     * ��ȡthdSignNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThdSignNo() {
        return thdSignNo;
    }

    /**
     * ����thdSignNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThdSignNo(String value) {
        this.thdSignNo = value;
    }

    /**
     * ��ȡtotalFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFee() {
        return totalFee;
    }

    /**
     * ����totalFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFee(Double value) {
        this.totalFee = value;
    }

    /**
     * ��ȡtotalMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMoney() {
        return totalMoney;
    }

    /**
     * ����totalMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMoney(String value) {
        this.totalMoney = value;
    }

    /**
     * ��ȡtotalMoneyDx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMoneyDx() {
        return totalMoneyDx;
    }

    /**
     * ����totalMoneyDx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMoneyDx(String value) {
        this.totalMoneyDx = value;
    }

    /**
     * ��ȡtotalMoneyXx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMoneyXx() {
        return totalMoneyXx;
    }

    /**
     * ����totalMoneyXx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMoneyXx(String value) {
        this.totalMoneyXx = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * ��ȡusedLoan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedLoan() {
        return usedLoan;
    }

    /**
     * ����usedLoan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedLoan(String value) {
        this.usedLoan = value;
    }

    /**
     * ��ȡuserId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ����userId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * ��ȡuserName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * ����userName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * ��ȡyearRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearRate() {
        return yearRate;
    }

    /**
     * ����yearRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearRate(String value) {
        this.yearRate = value;
    }

    /**
     * ��ȡzipCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * ����zipCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * ��ȡeDu���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDu() {
        return eDu;
    }

    /**
     * ����eDu���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDu(String value) {
        this.eDu = value;
    }

    /**
     * ��ȡeDuDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDuDays() {
        return eDuDays;
    }

    /**
     * ����eDuDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDuDays(String value) {
        this.eDuDays = value;
    }

}
