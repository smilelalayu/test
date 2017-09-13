
package com.hm.bus.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>contractBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取account属性的值。
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
     * 设置account属性的值。
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
     * 获取accountBank属性的值。
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
     * 设置accountBank属性的值。
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
     * 获取accountCard属性的值。
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
     * 设置accountCard属性的值。
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
     * 获取address属性的值。
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
     * 设置address属性的值。
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
     * 获取advisoryServiceAmt属性的值。
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
     * 设置advisoryServiceAmt属性的值。
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
     * 获取appDepositAmt属性的值。
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
     * 设置appDepositAmt属性的值。
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
     * 获取associationName属性的值。
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
     * 设置associationName属性的值。
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
     * 获取borrowerCardId属性的值。
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
     * 设置borrowerCardId属性的值。
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
     * 获取borrowerName属性的值。
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
     * 设置borrowerName属性的值。
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
     * 获取bzjAmount属性的值。
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
     * 设置bzjAmount属性的值。
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
     * 获取bzjAmountDx属性的值。
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
     * 设置bzjAmountDx属性的值。
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
     * 获取cityId属性的值。
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
     * 设置cityId属性的值。
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
     * 获取coborrowerCardId属性的值。
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
     * 设置coborrowerCardId属性的值。
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
     * 获取coborrowerName属性的值。
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
     * 设置coborrowerName属性的值。
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
     * 获取contactPhone属性的值。
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
     * 设置contactPhone属性的值。
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
     * 获取contractNum属性的值。
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
     * 设置contractNum属性的值。
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
     * 获取custNo属性的值。
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
     * 设置custNo属性的值。
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
     * 获取email属性的值。
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
     * 设置email属性的值。
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
     * 获取endDate属性的值。
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
     * 设置endDate属性的值。
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
     * 获取expiryDate属性的值。
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
     * 设置expiryDate属性的值。
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
     * 获取hbrNo属性的值。
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
     * 设置hbrNo属性的值。
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
     * 获取instCode属性的值。
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
     * 设置instCode属性的值。
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
     * 获取instGoldNo属性的值。
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
     * 设置instGoldNo属性的值。
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
     * 获取interestRule属性的值。
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
     * 设置interestRule属性的值。
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
     * 获取interestRuleName属性的值。
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
     * 设置interestRuleName属性的值。
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
     * 获取lastDate属性的值。
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
     * 设置lastDate属性的值。
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
     * 获取lastMoney属性的值。
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
     * 设置lastMoney属性的值。
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
     * 获取lastMoneyDx属性的值。
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
     * 设置lastMoneyDx属性的值。
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
     * 获取lastMoneyXx属性的值。
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
     * 设置lastMoneyXx属性的值。
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
     * 获取lendCardBankSubbranch属性的值。
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
     * 设置lendCardBankSubbranch属性的值。
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
     * 获取loanDate属性的值。
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
     * 设置loanDate属性的值。
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
     * 获取loanTerm属性的值。
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
     * 设置loanTerm属性的值。
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
     * 获取mobilePhone属性的值。
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
     * 设置mobilePhone属性的值。
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
     * 获取monthMoney属性的值。
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
     * 设置monthMoney属性的值。
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
     * 获取monthMoneyDx属性的值。
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
     * 设置monthMoneyDx属性的值。
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
     * 获取monthMoneyXx属性的值。
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
     * 设置monthMoneyXx属性的值。
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
     * 获取orgCode属性的值。
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
     * 设置orgCode属性的值。
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
     * 获取organization属性的值。
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
     * 设置organization属性的值。
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
     * 获取payDay属性的值。
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
     * 设置payDay属性的值。
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
     * 获取phone属性的值。
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
     * 设置phone属性的值。
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
     * 获取productId属性的值。
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * 设置productId属性的值。
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * 获取riskAmt属性的值。
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
     * 设置riskAmt属性的值。
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
     * 获取startDate属性的值。
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
     * 设置startDate属性的值。
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
     * 获取suggestAmount属性的值。
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
     * 设置suggestAmount属性的值。
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
     * 获取sysCode属性的值。
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
     * 设置sysCode属性的值。
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
     * 获取thdId属性的值。
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
     * 设置thdId属性的值。
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
     * 获取thdSignNo属性的值。
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
     * 设置thdSignNo属性的值。
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
     * 获取totalFee属性的值。
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
     * 设置totalFee属性的值。
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
     * 获取totalMoney属性的值。
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
     * 设置totalMoney属性的值。
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
     * 获取totalMoneyDx属性的值。
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
     * 设置totalMoneyDx属性的值。
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
     * 获取totalMoneyXx属性的值。
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
     * 设置totalMoneyXx属性的值。
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
     * 获取type属性的值。
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * 获取usedLoan属性的值。
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
     * 设置usedLoan属性的值。
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
     * 获取userId属性的值。
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
     * 设置userId属性的值。
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
     * 获取userName属性的值。
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
     * 设置userName属性的值。
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
     * 获取yearRate属性的值。
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
     * 设置yearRate属性的值。
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
     * 获取zipCode属性的值。
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
     * 设置zipCode属性的值。
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
     * 获取eDu属性的值。
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
     * 设置eDu属性的值。
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
     * 获取eDuDays属性的值。
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
     * 设置eDuDays属性的值。
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
