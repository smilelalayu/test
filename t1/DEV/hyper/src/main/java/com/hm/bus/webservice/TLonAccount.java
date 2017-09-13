
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonAccount complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accBankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accBankCardBindId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accBankNameChina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accCertType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accCorpRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="accOwnEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accOwnIdCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accOwnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accOwnPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mendTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgAccId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="trusteeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uamAccId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uumCustNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uumUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonAccount", propOrder = {
    "accAccount",
    "accAccountName",
    "accBankBranch",
    "accBankCard",
    "accBankCardBindId",
    "accBankName",
    "accBankNameChina",
    "accCertType",
    "accCity",
    "accCorpRep",
    "accId",
    "accOwnEmail",
    "accOwnIdCard",
    "accOwnName",
    "accOwnPhone",
    "accProvince",
    "accType",
    "accountPro",
    "accountStatus",
    "accountType",
    "appId",
    "createTime",
    "mendTime",
    "orgAccId",
    "trusteeType",
    "uamAccId",
    "uumCustNo",
    "uumUserId",
    "valid"
})
public class TLonAccount {

    protected String accAccount;
    protected String accAccountName;
    protected String accBankBranch;
    protected String accBankCard;
    protected String accBankCardBindId;
    protected String accBankName;
    protected String accBankNameChina;
    protected String accCertType;
    protected String accCity;
    protected String accCorpRep;
    protected Long accId;
    protected String accOwnEmail;
    protected String accOwnIdCard;
    protected String accOwnName;
    protected String accOwnPhone;
    protected String accProvince;
    protected String accType;
    protected String accountPro;
    protected String accountStatus;
    protected String accountType;
    protected Integer appId;
    protected String createTime;
    protected String mendTime;
    protected Long orgAccId;
    protected String trusteeType;
    protected String uamAccId;
    protected String uumCustNo;
    protected String uumUserId;
    protected Integer valid;

    /**
     * 获取accAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccAccount() {
        return accAccount;
    }

    /**
     * 设置accAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccAccount(String value) {
        this.accAccount = value;
    }

    /**
     * 获取accAccountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccAccountName() {
        return accAccountName;
    }

    /**
     * 设置accAccountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccAccountName(String value) {
        this.accAccountName = value;
    }

    /**
     * 获取accBankBranch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccBankBranch() {
        return accBankBranch;
    }

    /**
     * 设置accBankBranch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccBankBranch(String value) {
        this.accBankBranch = value;
    }

    /**
     * 获取accBankCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccBankCard() {
        return accBankCard;
    }

    /**
     * 设置accBankCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccBankCard(String value) {
        this.accBankCard = value;
    }

    /**
     * 获取accBankCardBindId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccBankCardBindId() {
        return accBankCardBindId;
    }

    /**
     * 设置accBankCardBindId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccBankCardBindId(String value) {
        this.accBankCardBindId = value;
    }

    /**
     * 获取accBankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccBankName() {
        return accBankName;
    }

    /**
     * 设置accBankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccBankName(String value) {
        this.accBankName = value;
    }

    /**
     * 获取accBankNameChina属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccBankNameChina() {
        return accBankNameChina;
    }

    /**
     * 设置accBankNameChina属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccBankNameChina(String value) {
        this.accBankNameChina = value;
    }

    /**
     * 获取accCertType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccCertType() {
        return accCertType;
    }

    /**
     * 设置accCertType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccCertType(String value) {
        this.accCertType = value;
    }

    /**
     * 获取accCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccCity() {
        return accCity;
    }

    /**
     * 设置accCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccCity(String value) {
        this.accCity = value;
    }

    /**
     * 获取accCorpRep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccCorpRep() {
        return accCorpRep;
    }

    /**
     * 设置accCorpRep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccCorpRep(String value) {
        this.accCorpRep = value;
    }

    /**
     * 获取accId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccId() {
        return accId;
    }

    /**
     * 设置accId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccId(Long value) {
        this.accId = value;
    }

    /**
     * 获取accOwnEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccOwnEmail() {
        return accOwnEmail;
    }

    /**
     * 设置accOwnEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccOwnEmail(String value) {
        this.accOwnEmail = value;
    }

    /**
     * 获取accOwnIdCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccOwnIdCard() {
        return accOwnIdCard;
    }

    /**
     * 设置accOwnIdCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccOwnIdCard(String value) {
        this.accOwnIdCard = value;
    }

    /**
     * 获取accOwnName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccOwnName() {
        return accOwnName;
    }

    /**
     * 设置accOwnName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccOwnName(String value) {
        this.accOwnName = value;
    }

    /**
     * 获取accOwnPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccOwnPhone() {
        return accOwnPhone;
    }

    /**
     * 设置accOwnPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccOwnPhone(String value) {
        this.accOwnPhone = value;
    }

    /**
     * 获取accProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccProvince() {
        return accProvince;
    }

    /**
     * 设置accProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccProvince(String value) {
        this.accProvince = value;
    }

    /**
     * 获取accType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccType() {
        return accType;
    }

    /**
     * 设置accType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccType(String value) {
        this.accType = value;
    }

    /**
     * 获取accountPro属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPro() {
        return accountPro;
    }

    /**
     * 设置accountPro属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPro(String value) {
        this.accountPro = value;
    }

    /**
     * 获取accountStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * 设置accountStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * 获取accountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置accountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

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
     * 获取orgAccId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrgAccId() {
        return orgAccId;
    }

    /**
     * 设置orgAccId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrgAccId(Long value) {
        this.orgAccId = value;
    }

    /**
     * 获取trusteeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrusteeType() {
        return trusteeType;
    }

    /**
     * 设置trusteeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrusteeType(String value) {
        this.trusteeType = value;
    }

    /**
     * 获取uamAccId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUamAccId() {
        return uamAccId;
    }

    /**
     * 设置uamAccId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUamAccId(String value) {
        this.uamAccId = value;
    }

    /**
     * 获取uumCustNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUumCustNo() {
        return uumCustNo;
    }

    /**
     * 设置uumCustNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUumCustNo(String value) {
        this.uumCustNo = value;
    }

    /**
     * 获取uumUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUumUserId() {
        return uumUserId;
    }

    /**
     * 设置uumUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUumUserId(String value) {
        this.uumUserId = value;
    }

    /**
     * 获取valid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValid() {
        return valid;
    }

    /**
     * 设置valid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValid(Integer value) {
        this.valid = value;
    }

}
