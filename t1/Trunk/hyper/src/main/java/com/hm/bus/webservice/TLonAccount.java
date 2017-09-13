
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonAccount complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡaccAccount���Ե�ֵ��
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
     * ����accAccount���Ե�ֵ��
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
     * ��ȡaccAccountName���Ե�ֵ��
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
     * ����accAccountName���Ե�ֵ��
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
     * ��ȡaccBankBranch���Ե�ֵ��
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
     * ����accBankBranch���Ե�ֵ��
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
     * ��ȡaccBankCard���Ե�ֵ��
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
     * ����accBankCard���Ե�ֵ��
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
     * ��ȡaccBankCardBindId���Ե�ֵ��
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
     * ����accBankCardBindId���Ե�ֵ��
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
     * ��ȡaccBankName���Ե�ֵ��
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
     * ����accBankName���Ե�ֵ��
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
     * ��ȡaccBankNameChina���Ե�ֵ��
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
     * ����accBankNameChina���Ե�ֵ��
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
     * ��ȡaccCertType���Ե�ֵ��
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
     * ����accCertType���Ե�ֵ��
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
     * ��ȡaccCity���Ե�ֵ��
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
     * ����accCity���Ե�ֵ��
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
     * ��ȡaccCorpRep���Ե�ֵ��
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
     * ����accCorpRep���Ե�ֵ��
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
     * ��ȡaccId���Ե�ֵ��
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
     * ����accId���Ե�ֵ��
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
     * ��ȡaccOwnEmail���Ե�ֵ��
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
     * ����accOwnEmail���Ե�ֵ��
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
     * ��ȡaccOwnIdCard���Ե�ֵ��
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
     * ����accOwnIdCard���Ե�ֵ��
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
     * ��ȡaccOwnName���Ե�ֵ��
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
     * ����accOwnName���Ե�ֵ��
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
     * ��ȡaccOwnPhone���Ե�ֵ��
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
     * ����accOwnPhone���Ե�ֵ��
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
     * ��ȡaccProvince���Ե�ֵ��
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
     * ����accProvince���Ե�ֵ��
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
     * ��ȡaccType���Ե�ֵ��
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
     * ����accType���Ե�ֵ��
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
     * ��ȡaccountPro���Ե�ֵ��
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
     * ����accountPro���Ե�ֵ��
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
     * ��ȡaccountStatus���Ե�ֵ��
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
     * ����accountStatus���Ե�ֵ��
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
     * ��ȡaccountType���Ե�ֵ��
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
     * ����accountType���Ե�ֵ��
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
     * ��ȡmendTime���Ե�ֵ��
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
     * ����mendTime���Ե�ֵ��
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
     * ��ȡorgAccId���Ե�ֵ��
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
     * ����orgAccId���Ե�ֵ��
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
     * ��ȡtrusteeType���Ե�ֵ��
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
     * ����trusteeType���Ե�ֵ��
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
     * ��ȡuamAccId���Ե�ֵ��
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
     * ����uamAccId���Ե�ֵ��
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
     * ��ȡuumCustNo���Ե�ֵ��
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
     * ����uumCustNo���Ե�ֵ��
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
     * ��ȡuumUserId���Ե�ֵ��
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
     * ����uumUserId���Ե�ֵ��
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
     * ��ȡvalid���Ե�ֵ��
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
     * ����valid���Ե�ֵ��
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
