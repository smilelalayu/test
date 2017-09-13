
package com.hm.bus.module;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.hm.bus.webservice.RecordLoanAttach;
import com.hm.bus.webservice.RecordLoanContact;
import com.hm.bus.webservice.RecordLoanHouse;
import com.hm.bus.webservice.RecordLoanRent;
import com.hm.bus.webservice.TLonApplicationCar;
import com.hm.bus.webservice.TLonApplicationHouse;


/**
 * <p>lonApp complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="lonApp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="advisoryAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appHouses" type="{http://biz.webservice.macrosky.com/}tLonApplicationHouse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appayAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveDstRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveSuggestAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beginCompanyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyAdressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyAdressDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyAdressRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyAdressprovince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cooperateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerManagerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deductedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directCheckInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directCheckPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendMap"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="extendVc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasBond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasFund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasOtherContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasStock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="haveCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incomeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="initStats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instLoanCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instLoanCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interestRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isCalTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isOpenCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPayPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isRepayMent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isSignContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isSupportDeduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="livePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="livePostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="liveaddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="liveaddressDistinct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="liveaddressProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="liveaddressRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldAppId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherIncomeAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="peopleLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processTempleteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordCarList" type="{http://biz.webservice.macrosky.com/}tLonApplicationCar" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordLoanAttach" type="{http://biz.webservice.macrosky.com/}recordLoanAttach" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordLoanContact" type="{http://biz.webservice.macrosky.com/}recordLoanContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordLoanHouse" type="{http://biz.webservice.macrosky.com/}recordLoanHouse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordRentList" type="{http://biz.webservice.macrosky.com/}recordLoanRent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registAddressDistinct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registAddressProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registAddressRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repaymentInitiator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resideDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="riskAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salaryAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salaryDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="saleChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceFeeAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yearRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ynhouseLoanOverdue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lonApp", propOrder = {
    "adjustRatio",
    "advisoryAmt",
    "appHouses",
    "appId",
    "appLoanType",
    "appStatus",
    "appayAmt",
    "appayDate",
    "approveDstRate",
    "approveSuggestAmt",
    "beginCompanyDate",
    "birthday",
    "businessAmt",
    "certId",
    "certType",
    "checkUrl",
    "company",
    "companyAdressCity",
    "companyAdressDist",
    "companyAdressRoad",
    "companyAdressprovince",
    "companyPhone",
    "companyPostcode",
    "companyType",
    "cooperateCode",
    "createTime",
    "creator",
    "customerManagerId",
    "customerManagerName",
    "customerName",
    "customerProperty",
    "customerSex",
    "customerSource",
    "customerType",
    "deductedAmount",
    "degree",
    "directCheckInst",
    "directCheckPerson",
    "duty",
    "email",
    "extendMap",
    "extendVc1",
    "extendVc2",
    "extendVc3",
    "extendVc4",
    "extendVc5",
    "extendVc6",
    "hasBond",
    "hasCar",
    "hasDeposit",
    "hasFund",
    "hasHouse",
    "hasInsurance",
    "hasOther",
    "hasOtherContent",
    "hasStock",
    "haveCredit",
    "houseCar",
    "houseLocal",
    "incomeType",
    "initStats",
    "instCode",
    "instLoanCard",
    "instLoanCardName",
    "interestRule",
    "intustry",
    "isCalTotalAmount",
    "isCard",
    "isOpenCard",
    "isPayPlan",
    "isRepayMent",
    "isSignContact",
    "isSupportDeduction",
    "livePhone",
    "livePostcode",
    "liveaddressCity",
    "liveaddressDistinct",
    "liveaddressProvince",
    "liveaddressRoad",
    "loanDate",
    "loanPurpose",
    "loanTarget",
    "loanTerm",
    "marry",
    "oldAppId",
    "orgCode",
    "originRatio",
    "otherIncomeAmt",
    "paymentType",
    "peopleLocal",
    "phone",
    "postAddress",
    "processTempleteId",
    "productId",
    "productName",
    "qq",
    "receiveBankCard",
    "receiveBranch",
    "receiveCountry",
    "receiveCountryCode",
    "receiveName",
    "receiveOpen",
    "receiveProvince",
    "recordCarList",
    "recordLoanAttach",
    "recordLoanContact",
    "recordLoanHouse",
    "recordRentList",
    "recordUrl",
    "registAddressCity",
    "registAddressDistinct",
    "registAddressProvince",
    "registAddressRoad",
    "registPostcode",
    "remark",
    "repayAccount",
    "repayAccountName",
    "repayBankCard",
    "repayBranch",
    "repayName",
    "repayOpen",
    "repaymentInitiator",
    "resideDate",
    "reviewUrl",
    "riskAmt",
    "salaryAmt",
    "salaryDay",
    "saleChannel",
    "serviceAmt",
    "serviceFeeAmt",
    "sign",
    "timeLimit",
    "toCityDate",
    "totalAmount",
    "yearRate",
    "ynhouseLoanOverdue"
})
public class LonBusLnApp {

    protected String adjustRatio;
    protected String advisoryAmt;
    @XmlElement(nillable = true)
    protected List<TLonApplicationHouse> appHouses;
    protected String appId;
    protected String appLoanType;
    protected String appStatus;
    protected String appayAmt;
    protected String appayDate;
    protected String approveDstRate;
    protected String approveSuggestAmt;
    protected String beginCompanyDate;
    protected String birthday;
    protected String businessAmt;
    protected String certId;
    protected String certType;
    protected String checkUrl;
    protected String company;
    protected String companyAdressCity;
    protected String companyAdressDist;
    protected String companyAdressRoad;
    protected String companyAdressprovince;
    protected String companyPhone;
    protected String companyPostcode;
    protected String companyType;
    protected String cooperateCode;
    protected String createTime;
    protected String creator;
    protected String customerManagerId;
    protected String customerManagerName;
    protected String customerName;
    protected String customerProperty;
    protected String customerSex;
    protected String customerSource;
    protected String customerType;
    protected String deductedAmount;
    protected String degree;
    protected String directCheckInst;
    protected String directCheckPerson;
    protected String duty;
    protected String email;
    @XmlElement(required = true)
    protected LonBusLnApp.ExtendMap extendMap;
    protected String extendVc1;
    protected String extendVc2;
    protected String extendVc3;
    protected String extendVc4;
    protected String extendVc5;
    protected String extendVc6;
    protected String hasBond;
    protected String hasCar;
    protected String hasDeposit;
    protected String hasFund;
    protected String hasHouse;
    protected String hasInsurance;
    protected String hasOther;
    protected String hasOtherContent;
    protected String hasStock;
    protected String haveCredit;
    protected String houseCar;
    protected String houseLocal;
    protected String incomeType;
    protected String initStats;
    protected String instCode;
    protected String instLoanCard;
    protected String instLoanCardName;
    protected String interestRule;
    protected String intustry;
    protected String isCalTotalAmount;
    protected String isCard;
    protected String isOpenCard;
    protected String isPayPlan;
    protected String isRepayMent;
    protected String isSignContact;
    protected String isSupportDeduction;
    protected String livePhone;
    protected String livePostcode;
    protected String liveaddressCity;
    protected String liveaddressDistinct;
    protected String liveaddressProvince;
    protected String liveaddressRoad;
    protected String loanDate;
    protected String loanPurpose;
    protected String loanTarget;
    protected String loanTerm;
    protected String marry;
    protected String oldAppId;
    protected String orgCode;
    protected String originRatio;
    protected String otherIncomeAmt;
    protected String paymentType;
    protected String peopleLocal;
    protected String phone;
    protected String postAddress;
    protected String processTempleteId;
    protected String productId;
    protected String productName;
    protected String qq;
    protected String receiveBankCard;
    protected String receiveBranch;
    protected String receiveCountry;
    protected String receiveCountryCode;
    protected String receiveName;
    protected String receiveOpen;
    protected String receiveProvince;
    @XmlElement(nillable = true)
    protected List<TLonApplicationCar> recordCarList;
    @XmlElement(nillable = true)
    protected List<RecordLoanAttach> recordLoanAttach;
    @XmlElement(nillable = true)
    protected List<RecordLoanContact> recordLoanContact;
    @XmlElement(nillable = true)
    protected List<RecordLoanHouse> recordLoanHouse;
    @XmlElement(nillable = true)
    protected List<RecordLoanRent> recordRentList;
    protected String recordUrl;
    protected String registAddressCity;
    protected String registAddressDistinct;
    protected String registAddressProvince;
    protected String registAddressRoad;
    protected String registPostcode;
    protected String remark;
    protected String repayAccount;
    protected String repayAccountName;
    protected String repayBankCard;
    protected String repayBranch;
    protected String repayName;
    protected String repayOpen;
    protected String repaymentInitiator;
    protected String resideDate;
    protected String reviewUrl;
    protected String riskAmt;
    protected String salaryAmt;
    protected String salaryDay;
    protected String saleChannel;
    protected String serviceAmt;
    protected String serviceFeeAmt;
    protected String sign;
    protected String timeLimit;
    protected String toCityDate;
    protected String totalAmount;
    protected String yearRate;
    protected String ynhouseLoanOverdue;

    /**
     * 获取adjustRatio属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdjustRatio() {
        return adjustRatio;
    }

    /**
     * 设置adjustRatio属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdjustRatio(String value) {
        this.adjustRatio = value;
    }

    /**
     * 获取advisoryAmt属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdvisoryAmt() {
        return advisoryAmt;
    }

    /**
     * 设置advisoryAmt属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdvisoryAmt(String value) {
        this.advisoryAmt = value;
    }

    /**
     * Gets the value of the appHouses property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appHouses property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppHouses().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonApplicationHouse }
     *
     *
     */
    public List<TLonApplicationHouse> getAppHouses() {
        if (appHouses == null) {
            appHouses = new ArrayList<TLonApplicationHouse>();
        }
        return this.appHouses;
    }

    /**
     * 获取appId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置appId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * 获取appLoanType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAppLoanType() {
        return appLoanType;
    }

    /**
     * 设置appLoanType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAppLoanType(String value) {
        this.appLoanType = value;
    }

    /**
     * 获取appStatus属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * 设置appStatus属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAppStatus(String value) {
        this.appStatus = value;
    }

    /**
     * 获取appayAmt属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAppayAmt() {
        return appayAmt;
    }

    /**
     * 设置appayAmt属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAppayAmt(String value) {
        this.appayAmt = value;
    }

    /**
     * 获取appayDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAppayDate() {
        return appayDate;
    }

    /**
     * 设置appayDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAppayDate(String value) {
        this.appayDate = value;
    }

    /**
     * 获取approveDstRate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApproveDstRate() {
        return approveDstRate;
    }

    /**
     * 设置approveDstRate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApproveDstRate(String value) {
        this.approveDstRate = value;
    }

    /**
     * 获取approveSuggestAmt属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApproveSuggestAmt() {
        return approveSuggestAmt;
    }

    /**
     * 设置approveSuggestAmt属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApproveSuggestAmt(String value) {
        this.approveSuggestAmt = value;
    }

    /**
     * 获取beginCompanyDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBeginCompanyDate() {
        return beginCompanyDate;
    }

    /**
     * 设置beginCompanyDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBeginCompanyDate(String value) {
        this.beginCompanyDate = value;
    }

    /**
     * 获取birthday属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * 获取businessAmt属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBusinessAmt() {
        return businessAmt;
    }

    /**
     * 设置businessAmt属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBusinessAmt(String value) {
        this.businessAmt = value;
    }

    /**
     * 获取certId属性的值。
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
     * 设置certId属性的值。
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
     * 获取certType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCertType() {
        return certType;
    }

    /**
     * 设置certType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCertType(String value) {
        this.certType = value;
    }

    /**
     * 获取checkUrl属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCheckUrl() {
        return checkUrl;
    }

    /**
     * 设置checkUrl属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCheckUrl(String value) {
        this.checkUrl = value;
    }

    /**
     * 获取company属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置company属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * 获取companyAdressCity属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompanyAdressCity() {
        return companyAdressCity;
    }

    /**
     * 设置companyAdressCity属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompanyAdressCity(String value) {
        this.companyAdressCity = value;
    }

    /**
     * 获取companyAdressDist属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompanyAdressDist() {
        return companyAdressDist;
    }

    /**
     * 设置companyAdressDist属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompanyAdressDist(String value) {
        this.companyAdressDist = value;
    }

    /**
     * 获取companyAdressRoad属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompanyAdressRoad() {
        return companyAdressRoad;
    }

    /**
     * 设置companyAdressRoad属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompanyAdressRoad(String value) {
        this.companyAdressRoad = value;
    }

    /**
     * 获取companyAdressprovince属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompanyAdressprovince() {
        return companyAdressprovince;
    }

    /**
     * 设置companyAdressprovince属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompanyAdressprovince(String value) {
        this.companyAdressprovince = value;
    }

    /**
     * 获取companyPhone属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * 设置companyPhone属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompanyPhone(String value) {
        this.companyPhone = value;
    }

    /**
     * 获取companyPostcode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompanyPostcode() {
        return companyPostcode;
    }

    /**
     * 设置companyPostcode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompanyPostcode(String value) {
        this.companyPostcode = value;
    }

    /**
     * 获取companyType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 设置companyType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompanyType(String value) {
        this.companyType = value;
    }

    /**
     * 获取cooperateCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCooperateCode() {
        return cooperateCode;
    }

    /**
     * 设置cooperateCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCooperateCode(String value) {
        this.cooperateCode = value;
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
     * 获取creator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置creator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * 获取customerManagerId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerManagerId() {
        return customerManagerId;
    }

    /**
     * 设置customerManagerId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerManagerId(String value) {
        this.customerManagerId = value;
    }

    /**
     * 获取customerManagerName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerManagerName() {
        return customerManagerName;
    }

    /**
     * 设置customerManagerName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerManagerName(String value) {
        this.customerManagerName = value;
    }

    /**
     * 获取customerName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置customerName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * 获取customerProperty属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerProperty() {
        return customerProperty;
    }

    /**
     * 设置customerProperty属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerProperty(String value) {
        this.customerProperty = value;
    }

    /**
     * 获取customerSex属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerSex() {
        return customerSex;
    }

    /**
     * 设置customerSex属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerSex(String value) {
        this.customerSex = value;
    }

    /**
     * 获取customerSource属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerSource() {
        return customerSource;
    }

    /**
     * 设置customerSource属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerSource(String value) {
        this.customerSource = value;
    }

    /**
     * 获取customerType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * 设置customerType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * 获取deductedAmount属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeductedAmount() {
        return deductedAmount;
    }

    /**
     * 设置deductedAmount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeductedAmount(String value) {
        this.deductedAmount = value;
    }

    /**
     * 获取degree属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 设置degree属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDegree(String value) {
        this.degree = value;
    }

    /**
     * 获取directCheckInst属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDirectCheckInst() {
        return directCheckInst;
    }

    /**
     * 设置directCheckInst属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDirectCheckInst(String value) {
        this.directCheckInst = value;
    }

    /**
     * 获取directCheckPerson属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDirectCheckPerson() {
        return directCheckPerson;
    }

    /**
     * 设置directCheckPerson属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDirectCheckPerson(String value) {
        this.directCheckPerson = value;
    }

    /**
     * 获取duty属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDuty() {
        return duty;
    }

    /**
     * 设置duty属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDuty(String value) {
        this.duty = value;
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
     * 获取extendMap属性的值。
     *
     * @return
     *     possible object is
     *     {@link LonBusLnApp.ExtendMap }
     *
     */
    public LonBusLnApp.ExtendMap getExtendMap() {
        return extendMap;
    }

    /**
     * 设置extendMap属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LonBusLnApp.ExtendMap }
     *
     */
    public void setExtendMap(LonBusLnApp.ExtendMap value) {
        this.extendMap = value;
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
     * 获取extendVc6属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExtendVc6() {
        return extendVc6;
    }

    /**
     * 设置extendVc6属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExtendVc6(String value) {
        this.extendVc6 = value;
    }

    /**
     * 获取hasBond属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHasBond() {
        return hasBond;
    }

    /**
     * 设置hasBond属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHasBond(String value) {
        this.hasBond = value;
    }

    /**
     * 获取hasCar属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHasCar() {
        return hasCar;
    }

    /**
     * 设置hasCar属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHasCar(String value) {
        this.hasCar = value;
    }

    /**
     * 获取hasDeposit属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHasDeposit() {
        return hasDeposit;
    }

    /**
     * 设置hasDeposit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHasDeposit(String value) {
        this.hasDeposit = value;
    }

    /**
     * 获取hasFund属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHasFund() {
        return hasFund;
    }

    /**
     * 设置hasFund属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHasFund(String value) {
        this.hasFund = value;
    }

    /**
     * 获取hasHouse属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHasHouse() {
        return hasHouse;
    }

    /**
     * 设置hasHouse属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHasHouse(String value) {
        this.hasHouse = value;
    }

    /**
     * 获取hasInsurance属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHasInsurance() {
        return hasInsurance;
    }

    /**
     * 设置hasInsurance属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHasInsurance(String value) {
        this.hasInsurance = value;
    }

    /**
     * 获取hasOther属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHasOther() {
        return hasOther;
    }

    /**
     * 设置hasOther属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHasOther(String value) {
        this.hasOther = value;
    }

    /**
     * 获取hasOtherContent属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHasOtherContent() {
        return hasOtherContent;
    }

    /**
     * 设置hasOtherContent属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHasOtherContent(String value) {
        this.hasOtherContent = value;
    }

    /**
     * 获取hasStock属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHasStock() {
        return hasStock;
    }

    /**
     * 设置hasStock属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHasStock(String value) {
        this.hasStock = value;
    }

    /**
     * 获取haveCredit属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHaveCredit() {
        return haveCredit;
    }

    /**
     * 设置haveCredit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHaveCredit(String value) {
        this.haveCredit = value;
    }

    /**
     * 获取houseCar属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHouseCar() {
        return houseCar;
    }

    /**
     * 设置houseCar属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHouseCar(String value) {
        this.houseCar = value;
    }

    /**
     * 获取houseLocal属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHouseLocal() {
        return houseLocal;
    }

    /**
     * 设置houseLocal属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHouseLocal(String value) {
        this.houseLocal = value;
    }

    /**
     * 获取incomeType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIncomeType() {
        return incomeType;
    }

    /**
     * 设置incomeType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIncomeType(String value) {
        this.incomeType = value;
    }

    /**
     * 获取initStats属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInitStats() {
        return initStats;
    }

    /**
     * 设置initStats属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInitStats(String value) {
        this.initStats = value;
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
     * 获取instLoanCard属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInstLoanCard() {
        return instLoanCard;
    }

    /**
     * 设置instLoanCard属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInstLoanCard(String value) {
        this.instLoanCard = value;
    }

    /**
     * 获取instLoanCardName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInstLoanCardName() {
        return instLoanCardName;
    }

    /**
     * 设置instLoanCardName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInstLoanCardName(String value) {
        this.instLoanCardName = value;
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
     * 获取intustry属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIntustry() {
        return intustry;
    }

    /**
     * 设置intustry属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIntustry(String value) {
        this.intustry = value;
    }

    /**
     * 获取isCalTotalAmount属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsCalTotalAmount() {
        return isCalTotalAmount;
    }

    /**
     * 设置isCalTotalAmount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsCalTotalAmount(String value) {
        this.isCalTotalAmount = value;
    }

    /**
     * 获取isCard属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsCard() {
        return isCard;
    }

    /**
     * 设置isCard属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsCard(String value) {
        this.isCard = value;
    }

    /**
     * 获取isOpenCard属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsOpenCard() {
        return isOpenCard;
    }

    /**
     * 设置isOpenCard属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsOpenCard(String value) {
        this.isOpenCard = value;
    }

    /**
     * 获取isPayPlan属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsPayPlan() {
        return isPayPlan;
    }

    /**
     * 设置isPayPlan属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsPayPlan(String value) {
        this.isPayPlan = value;
    }

    /**
     * 获取isRepayMent属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsRepayMent() {
        return isRepayMent;
    }

    /**
     * 设置isRepayMent属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsRepayMent(String value) {
        this.isRepayMent = value;
    }

    /**
     * 获取isSignContact属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsSignContact() {
        return isSignContact;
    }

    /**
     * 设置isSignContact属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsSignContact(String value) {
        this.isSignContact = value;
    }

    /**
     * 获取isSupportDeduction属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsSupportDeduction() {
        return isSupportDeduction;
    }

    /**
     * 设置isSupportDeduction属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsSupportDeduction(String value) {
        this.isSupportDeduction = value;
    }

    /**
     * 获取livePhone属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLivePhone() {
        return livePhone;
    }

    /**
     * 设置livePhone属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLivePhone(String value) {
        this.livePhone = value;
    }

    /**
     * 获取livePostcode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLivePostcode() {
        return livePostcode;
    }

    /**
     * 设置livePostcode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLivePostcode(String value) {
        this.livePostcode = value;
    }

    /**
     * 获取liveaddressCity属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLiveaddressCity() {
        return liveaddressCity;
    }

    /**
     * 设置liveaddressCity属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLiveaddressCity(String value) {
        this.liveaddressCity = value;
    }

    /**
     * 获取liveaddressDistinct属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLiveaddressDistinct() {
        return liveaddressDistinct;
    }

    /**
     * 设置liveaddressDistinct属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLiveaddressDistinct(String value) {
        this.liveaddressDistinct = value;
    }

    /**
     * 获取liveaddressProvince属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLiveaddressProvince() {
        return liveaddressProvince;
    }

    /**
     * 设置liveaddressProvince属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLiveaddressProvince(String value) {
        this.liveaddressProvince = value;
    }

    /**
     * 获取liveaddressRoad属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLiveaddressRoad() {
        return liveaddressRoad;
    }

    /**
     * 设置liveaddressRoad属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLiveaddressRoad(String value) {
        this.liveaddressRoad = value;
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
     * 获取loanPurpose属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * 设置loanPurpose属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLoanPurpose(String value) {
        this.loanPurpose = value;
    }

    /**
     * 获取loanTarget属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLoanTarget() {
        return loanTarget;
    }

    /**
     * 设置loanTarget属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLoanTarget(String value) {
        this.loanTarget = value;
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
     * 获取marry属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarry() {
        return marry;
    }

    /**
     * 设置marry属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarry(String value) {
        this.marry = value;
    }

    /**
     * 获取oldAppId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOldAppId() {
        return oldAppId;
    }

    /**
     * 设置oldAppId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOldAppId(String value) {
        this.oldAppId = value;
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
     * 获取originRatio属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginRatio() {
        return originRatio;
    }

    /**
     * 设置originRatio属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginRatio(String value) {
        this.originRatio = value;
    }

    /**
     * 获取otherIncomeAmt属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOtherIncomeAmt() {
        return otherIncomeAmt;
    }

    /**
     * 设置otherIncomeAmt属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOtherIncomeAmt(String value) {
        this.otherIncomeAmt = value;
    }

    /**
     * 获取paymentType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 设置paymentType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * 获取peopleLocal属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPeopleLocal() {
        return peopleLocal;
    }

    /**
     * 设置peopleLocal属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPeopleLocal(String value) {
        this.peopleLocal = value;
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
     * 获取postAddress属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostAddress() {
        return postAddress;
    }

    /**
     * 设置postAddress属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostAddress(String value) {
        this.postAddress = value;
    }

    /**
     * 获取processTempleteId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProcessTempleteId() {
        return processTempleteId;
    }

    /**
     * 设置processTempleteId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProcessTempleteId(String value) {
        this.processTempleteId = value;
    }

    /**
     * 获取productId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置productId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * 获取productName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置productName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * 获取qq属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置qq属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQq(String value) {
        this.qq = value;
    }

    /**
     * 获取receiveBankCard属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReceiveBankCard() {
        return receiveBankCard;
    }

    /**
     * 设置receiveBankCard属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReceiveBankCard(String value) {
        this.receiveBankCard = value;
    }

    /**
     * 获取receiveBranch属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReceiveBranch() {
        return receiveBranch;
    }

    /**
     * 设置receiveBranch属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReceiveBranch(String value) {
        this.receiveBranch = value;
    }

    /**
     * 获取receiveCountry属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReceiveCountry() {
        return receiveCountry;
    }

    /**
     * 设置receiveCountry属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReceiveCountry(String value) {
        this.receiveCountry = value;
    }

    /**
     * 获取receiveCountryCode属性的值。
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
     * 设置receiveCountryCode属性的值。
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
     * 获取receiveName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReceiveName() {
        return receiveName;
    }

    /**
     * 设置receiveName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReceiveName(String value) {
        this.receiveName = value;
    }

    /**
     * 获取receiveOpen属性的值。
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
     * 设置receiveOpen属性的值。
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
     * 获取receiveProvince属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReceiveProvince() {
        return receiveProvince;
    }

    /**
     * 设置receiveProvince属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReceiveProvince(String value) {
        this.receiveProvince = value;
    }

    /**
     * Gets the value of the recordCarList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordCarList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordCarList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonApplicationCar }
     *
     *
     */
    public List<TLonApplicationCar> getRecordCarList() {
        if (recordCarList == null) {
            recordCarList = new ArrayList<TLonApplicationCar>();
        }
        return this.recordCarList;
    }

    /**
     * Gets the value of the recordLoanAttach property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordLoanAttach property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordLoanAttach().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordLoanAttach }
     *
     *
     */
    public List<RecordLoanAttach> getRecordLoanAttach() {
        if (recordLoanAttach == null) {
            recordLoanAttach = new ArrayList<RecordLoanAttach>();
        }
        return this.recordLoanAttach;
    }

    /**
     * Gets the value of the recordLoanContact property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordLoanContact property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordLoanContact().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordLoanContact }
     *
     *
     */
    public List<RecordLoanContact> getRecordLoanContact() {
        if (recordLoanContact == null) {
            recordLoanContact = new ArrayList<RecordLoanContact>();
        }
        return this.recordLoanContact;
    }

    /**
     * Gets the value of the recordLoanHouse property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordLoanHouse property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordLoanHouse().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordLoanHouse }
     *
     *
     */
    public List<RecordLoanHouse> getRecordLoanHouse() {
        if (recordLoanHouse == null) {
            recordLoanHouse = new ArrayList<RecordLoanHouse>();
        }
        return this.recordLoanHouse;
    }

    /**
     * Gets the value of the recordRentList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordRentList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordRentList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordLoanRent }
     *
     *
     */
    public List<RecordLoanRent> getRecordRentList() {
        if (recordRentList == null) {
            recordRentList = new ArrayList<RecordLoanRent>();
        }
        return this.recordRentList;
    }

    /**
     * 获取recordUrl属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRecordUrl() {
        return recordUrl;
    }

    /**
     * 设置recordUrl属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRecordUrl(String value) {
        this.recordUrl = value;
    }

    /**
     * 获取registAddressCity属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegistAddressCity() {
        return registAddressCity;
    }

    /**
     * 设置registAddressCity属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegistAddressCity(String value) {
        this.registAddressCity = value;
    }

    /**
     * 获取registAddressDistinct属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegistAddressDistinct() {
        return registAddressDistinct;
    }

    /**
     * 设置registAddressDistinct属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegistAddressDistinct(String value) {
        this.registAddressDistinct = value;
    }

    /**
     * 获取registAddressProvince属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegistAddressProvince() {
        return registAddressProvince;
    }

    /**
     * 设置registAddressProvince属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegistAddressProvince(String value) {
        this.registAddressProvince = value;
    }

    /**
     * 获取registAddressRoad属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegistAddressRoad() {
        return registAddressRoad;
    }

    /**
     * 设置registAddressRoad属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegistAddressRoad(String value) {
        this.registAddressRoad = value;
    }

    /**
     * 获取registPostcode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegistPostcode() {
        return registPostcode;
    }

    /**
     * 设置registPostcode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegistPostcode(String value) {
        this.registPostcode = value;
    }

    /**
     * 获取remark属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取repayAccount属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRepayAccount() {
        return repayAccount;
    }

    /**
     * 设置repayAccount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRepayAccount(String value) {
        this.repayAccount = value;
    }

    /**
     * 获取repayAccountName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRepayAccountName() {
        return repayAccountName;
    }

    /**
     * 设置repayAccountName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRepayAccountName(String value) {
        this.repayAccountName = value;
    }

    /**
     * 获取repayBankCard属性的值。
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
     * 设置repayBankCard属性的值。
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
     * 获取repayBranch属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRepayBranch() {
        return repayBranch;
    }

    /**
     * 设置repayBranch属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRepayBranch(String value) {
        this.repayBranch = value;
    }

    /**
     * 获取repayName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRepayName() {
        return repayName;
    }

    /**
     * 设置repayName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRepayName(String value) {
        this.repayName = value;
    }

    /**
     * 获取repayOpen属性的值。
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
     * 设置repayOpen属性的值。
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
     * 获取repaymentInitiator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRepaymentInitiator() {
        return repaymentInitiator;
    }

    /**
     * 设置repaymentInitiator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRepaymentInitiator(String value) {
        this.repaymentInitiator = value;
    }

    /**
     * 获取resideDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResideDate() {
        return resideDate;
    }

    /**
     * 设置resideDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResideDate(String value) {
        this.resideDate = value;
    }

    /**
     * 获取reviewUrl属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReviewUrl() {
        return reviewUrl;
    }

    /**
     * 设置reviewUrl属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReviewUrl(String value) {
        this.reviewUrl = value;
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
     * 获取salaryAmt属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalaryAmt() {
        return salaryAmt;
    }

    /**
     * 设置salaryAmt属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalaryAmt(String value) {
        this.salaryAmt = value;
    }

    /**
     * 获取salaryDay属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalaryDay() {
        return salaryDay;
    }

    /**
     * 设置salaryDay属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalaryDay(String value) {
        this.salaryDay = value;
    }

    /**
     * 获取saleChannel属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaleChannel() {
        return saleChannel;
    }

    /**
     * 设置saleChannel属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaleChannel(String value) {
        this.saleChannel = value;
    }

    /**
     * 获取serviceAmt属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceAmt() {
        return serviceAmt;
    }

    /**
     * 设置serviceAmt属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceAmt(String value) {
        this.serviceAmt = value;
    }

    /**
     * 获取serviceFeeAmt属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceFeeAmt() {
        return serviceFeeAmt;
    }

    /**
     * 设置serviceFeeAmt属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceFeeAmt(String value) {
        this.serviceFeeAmt = value;
    }

    /**
     * 获取sign属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置sign属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSign(String value) {
        this.sign = value;
    }

    /**
     * 获取timeLimit属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTimeLimit() {
        return timeLimit;
    }

    /**
     * 设置timeLimit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTimeLimit(String value) {
        this.timeLimit = value;
    }

    /**
     * 获取toCityDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToCityDate() {
        return toCityDate;
    }

    /**
     * 设置toCityDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setToCityDate(String value) {
        this.toCityDate = value;
    }

    /**
     * 获取totalAmount属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
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
     * 获取ynhouseLoanOverdue属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getYnhouseLoanOverdue() {
        return ynhouseLoanOverdue;
    }

    /**
     * 设置ynhouseLoanOverdue属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setYnhouseLoanOverdue(String value) {
        this.ynhouseLoanOverdue = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class ExtendMap {

        protected List<LonBusLnApp.ExtendMap.Entry> entry;

        /**
         * Gets the value of the entry property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LonBusLnApp.ExtendMap.Entry }
         *
         *
         */
        public List<LonBusLnApp.ExtendMap.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<LonBusLnApp.ExtendMap.Entry>();
            }
            return this.entry;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected Object value;

            /**
             * 获取key属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * 设置key属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setValue(Object value) {
                this.value = value;
            }

        }

    }

    public void setRecordLoanContact(List<RecordLoanContact> recordLoanContact){
    	if (this.recordLoanContact == null) {
            this.recordLoanContact = new ArrayList<RecordLoanContact>();
        }
    	this.recordLoanContact.addAll(recordLoanContact);
    }
}
