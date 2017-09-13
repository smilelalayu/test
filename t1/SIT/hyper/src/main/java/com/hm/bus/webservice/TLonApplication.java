
package com.hm.bus.webservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplication complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tLonApplication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountMngAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acquisitionCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acquisitionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="advisoryAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="advisoryServiceAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="aloneSwiftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appCars" type="{http://biz.webservice.macrosky.com/}tLonApplicationCar" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appHouses" type="{http://biz.webservice.macrosky.com/}tLonApplicationHouse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="appKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="appayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicationBeauties" type="{http://biz.webservice.macrosky.com/}tLonApplicationBeauty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="applicationProcess" type="{http://biz.webservice.macrosky.com/}tLonApplicationProcess" minOccurs="0"/&gt;
 *         &lt;element name="applicationStudent" type="{http://biz.webservice.macrosky.com/}tLonApplicationStudent" minOccurs="0"/&gt;
 *         &lt;element name="applicationYimeijian" type="{http://biz.webservice.macrosky.com/}tLonApplicationYimeijian" minOccurs="0"/&gt;
 *         &lt;element name="approvalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="approveEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="averageIncomeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="averageListAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="beautyInstId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="beginCompanyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billFactor" type="{http://biz.webservice.macrosky.com/}tCorpBillFactoringInfo" minOccurs="0"/&gt;
 *         &lt;element name="borrowerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="businessDataMap"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
 *         &lt;element name="businessTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="carRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="career" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chargeRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkTeamId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comWebInfo" type="{http://biz.webservice.macrosky.com/}tComWebInfo" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyAddressDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyAddressProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="configVersionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="contractAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="contractCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cooperateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditReport91List" type="{http://biz.webservice.macrosky.com/}tLonCreditReport91" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditorRights" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decorateHouse" type="{http://biz.webservice.macrosky.com/}tLonApplicationDecorateHouse" minOccurs="0"/&gt;
 *         &lt;element name="deductedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depositAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="depositAmtRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="drawnAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="duty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="exceedAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="exceedBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exceedManagerAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="exceedRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="expectCarAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ext" type="{http://biz.webservice.macrosky.com/}tLonApplicationExt" minOccurs="0"/&gt;
 *         &lt;element name="extendFl1" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="extendFl2" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="extendFl3" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="extendFl4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="extendFl5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="extendTime1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendTime2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendTime3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendTime4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendTime5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileUpEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firmType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstRepayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstStageRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="fullDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupTeamId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantorCertId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantorComName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantorContacts" type="{http://biz.webservice.macrosky.com/}tLonContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="guarantorHouses" type="{http://biz.webservice.macrosky.com/}tLonApplicationHouse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="guarantorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handChargeRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="havaExceed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="haveCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="haveLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="havePlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseMortgageList" type="{http://biz.webservice.macrosky.com/}tLonHouseMortgage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="householdRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incomeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="industryRegist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="initStats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instCreateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instLoanCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instLoanCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interestRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="investigateWay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipcAppId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ipcId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isAssure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isCalTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isHasCommonBorrower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isLoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isOpenCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPayPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isRenew" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isRepayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isSanbiao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isSendMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isSignContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isSupportDeduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobNature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobProve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobProveUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="last3List" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lastUpDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="liveAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="livePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="livePostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="liviingTeyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanAmountOfMR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="loanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanPurposeOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localWorkExperience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lonAttachs" type="{http://biz.webservice.macrosky.com/}tLonAttach" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lonContacts" type="{http://biz.webservice.macrosky.com/}tLonContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lonCreditReportList" type="{http://biz.webservice.macrosky.com/}tLonCreditReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lonCredits" type="{http://biz.webservice.macrosky.com/}tLonCredit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lonNet" type="{http://biz.webservice.macrosky.com/}tLonNet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lonPawnLuxurys" type="{http://biz.webservice.macrosky.com/}tLonApplicationPawnLuxury" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lonPawnOthers" type="{http://biz.webservice.macrosky.com/}tLonApplicationPawnOther" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lonPawnPms" type="{http://biz.webservice.macrosky.com/}tLonApplicationPawnPm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lonPawnWatchs" type="{http://biz.webservice.macrosky.com/}tLonApplicationPawnWatch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lonPolicys" type="{http://biz.webservice.macrosky.com/}tLonPolicy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="managerTimeLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="marry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mendTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthBasicIncomeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="monthNetProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="monthOtherIncomeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="monthRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="monthRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="monthRepayLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="mortgagorAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mortgagorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldAppId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldAssetOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationVerifyBackFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="otherIncomeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="overDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overDueLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pasture" type="{http://biz.webservice.macrosky.com/}tLonApplicationPasture" minOccurs="0"/&gt;
 *         &lt;element name="pawnCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pawnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payEarlyRepay" type="{http://biz.webservice.macrosky.com/}tRepEarlyRepay" minOccurs="0"/&gt;
 *         &lt;element name="payMatchList" type="{http://biz.webservice.macrosky.com/}tPayMatch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="payOfferDetail" type="{http://biz.webservice.macrosky.com/}tPayOfferDetail" minOccurs="0"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="peopleLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personalAssetAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personalRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planRepayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processTempleteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productGoldAccount" type="{http://biz.webservice.macrosky.com/}productGoldAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="propertyRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="punishAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="punishRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="punishType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recentPrivateList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recentPublicList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reducePeriods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registAddressDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registAddressProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registedTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="remainSumPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="renewManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="renewManagerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="renewType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rentHouseAgent" type="{http://biz.webservice.macrosky.com/}tLonApplicationRentHouseAgent" minOccurs="0"/&gt;
 *         &lt;element name="rentHouseCompany" type="{http://biz.webservice.macrosky.com/}tLonApplicationRentHouseCompany" minOccurs="0"/&gt;
 *         &lt;element name="rentHouseOwner" type="{http://biz.webservice.macrosky.com/}tLonApplicationRentHouseOwner" minOccurs="0"/&gt;
 *         &lt;element name="rentHouseSchool" type="{http://biz.webservice.macrosky.com/}tLonApplicationRentHouseSchool" minOccurs="0"/&gt;
 *         &lt;element name="rentHouseTrade" type="{http://biz.webservice.macrosky.com/}tLonApplicationRentHouseTrade" minOccurs="0"/&gt;
 *         &lt;element name="repayAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayBankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayCardBindId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="repayExceedManagerAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayPunishAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repaySumAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repaySumPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayViolateAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repaymentInitiator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resideDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="riskAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="riskAmtRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="salaryAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="salaryDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="saleChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="school" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scoreTempleteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="secondStageRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sendTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="serviceFeeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stopSignDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="studentNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suggestRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sysApproveSuggestAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="timeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="toCityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transferChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="trusteeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upBackReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upBackReasonRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upIntustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uumCustNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uumUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="violateAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="weiboNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weixinNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="yearRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ynhouseLoanOverdue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ysxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ysxPzscId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ysxTransNote" type="{http://biz.webservice.macrosky.com/}ysxTransNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="yxzcLoanResult" type="{http://biz.webservice.macrosky.com/}tYxzcLoanResult" minOccurs="0"/&gt;
 *         &lt;element name="zpswiftBatchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zpswiftId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tChannelApproval" type="{http://biz.webservice.macrosky.com/}tChannelApproval" minOccurs="0"/&gt;
 *         &lt;element name="tLoanFeeInfo" type="{http://biz.webservice.macrosky.com/}tLoanFeeInfo" minOccurs="0"/&gt;
 *         &lt;element name="tLoanFeeInfolist" type="{http://biz.webservice.macrosky.com/}tLoanFeeInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tLoanTransInfo" type="{http://biz.webservice.macrosky.com/}tLoanTransInfo" minOccurs="0"/&gt;
 *         &lt;element name="tLonAccount" type="{http://biz.webservice.macrosky.com/}tLonAccount" minOccurs="0"/&gt;
 *         &lt;element name="tLonAccounts" type="{http://biz.webservice.macrosky.com/}tLonAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tLonApplicationCarTradeStock" type="{http://biz.webservice.macrosky.com/}tLonApplicationCarTradeStock" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tLonApplicationFodder" type="{http://biz.webservice.macrosky.com/}tLonApplicationFodder" minOccurs="0"/&gt;
 *         &lt;element name="tLonApplicationPersonalRentalHouse" type="{http://biz.webservice.macrosky.com/}tLonApplicationPersonalRentalHouse" minOccurs="0"/&gt;
 *         &lt;element name="tLonApplicationPurchase" type="{http://biz.webservice.macrosky.com/}tLonApplicationPurchase" minOccurs="0"/&gt;
 *         &lt;element name="tLonCreditReport" type="{http://biz.webservice.macrosky.com/}tLonCreditReport" minOccurs="0"/&gt;
 *         &lt;element name="tLonGuarantor" type="{http://biz.webservice.macrosky.com/}tLonGuarantor" minOccurs="0"/&gt;
 *         &lt;element name="tLonLightningloanInfo" type="{http://biz.webservice.macrosky.com/}tLonLightningloanInfo" minOccurs="0"/&gt;
 *         &lt;element name="tLonOldCar" type="{http://biz.webservice.macrosky.com/}tLonOldCar" minOccurs="0"/&gt;
 *         &lt;element name="tLonParking" type="{http://biz.webservice.macrosky.com/}tLonApplicationParking" minOccurs="0"/&gt;
 *         &lt;element name="tLonPawnerBalanceInfo" type="{http://biz.webservice.macrosky.com/}tLonPawnerBalanceInfo" minOccurs="0"/&gt;
 *         &lt;element name="tLonPolicyApplication" type="{http://biz.webservice.macrosky.com/}tLonPolicyApplication" minOccurs="0"/&gt;
 *         &lt;element name="tLonSocietyPolicy" type="{http://biz.webservice.macrosky.com/}tLonSocietyPolicy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplication", propOrder = {
    "accountMngAmt",
    "accountType",
    "acquisitionCompanyName",
    "acquisitionType",
    "adjustRatio",
    "advisoryAmt",
    "advisoryServiceAmt",
    "age",
    "aloneSwiftNo",
    "appCars",
    "appCode",
    "appHouses",
    "appId",
    "appKey",
    "appLoanType",
    "appStatus",
    "appayAmt",
    "appayDate",
    "applicationBeauties",
    "applicationProcess",
    "applicationStudent",
    "applicationYimeijian",
    "approvalStatus",
    "approveAmt",
    "approveEndTime",
    "approveLimit",
    "areaCode",
    "averageIncomeAmt",
    "averageListAmt",
    "beautyInstId",
    "beginCompanyDate",
    "billFactor",
    "borrowerType",
    "businessAmt",
    "businessDataMap",
    "businessTime",
    "carRemark",
    "career",
    "certId",
    "certType",
    "channel",
    "channelId",
    "chargeRule",
    "chargeType",
    "checkTeamId",
    "checkUrl",
    "comWebInfo",
    "company",
    "companyAddress",
    "companyAddressCity",
    "companyAddressDistrict",
    "companyAddressProvince",
    "companyPhone",
    "companyPostcode",
    "companyRemark",
    "companyType",
    "configVersionId",
    "contractAmt",
    "contractCode",
    "contractStatus",
    "contractTemplate",
    "contractUrl",
    "cooperateCode",
    "createTime",
    "creator",
    "creditReport91List",
    "creditorRights",
    "customerId",
    "customerLevel",
    "customerName",
    "customerProperty",
    "customerSex",
    "customerSource",
    "customerType",
    "decorateHouse",
    "deductedAmount",
    "degree",
    "depositAmt",
    "depositAmtRate",
    "discount",
    "drawnAmt",
    "duty",
    "endReason",
    "enterId",
    "exceedAmt",
    "exceedBeginDate",
    "exceedManagerAmt",
    "exceedRate",
    "expectCarAmount",
    "ext",
    "extendFl1",
    "extendFl2",
    "extendFl3",
    "extendFl4",
    "extendFl5",
    "extendTime1",
    "extendTime2",
    "extendTime3",
    "extendTime4",
    "extendTime5",
    "extendVc1",
    "extendVc10",
    "extendVc2",
    "extendVc3",
    "extendVc4",
    "extendVc5",
    "extendVc6",
    "extendVc7",
    "extendVc8",
    "extendVc9",
    "fileUpEndDate",
    "firmType",
    "firstRepayDate",
    "firstStageRepayAmt",
    "fullDate",
    "groupId",
    "groupName",
    "groupTeamId",
    "guarantorCertId",
    "guarantorComName",
    "guarantorContacts",
    "guarantorHouses",
    "guarantorName",
    "guarantyType",
    "handChargeRate",
    "havaExceed",
    "haveCredit",
    "haveLicense",
    "havePlan",
    "houseCar",
    "houseLocal",
    "houseMortgageList",
    "householdRegister",
    "incomeType",
    "industryRegist",
    "initStats",
    "instCode",
    "instCreateTime",
    "instLoanCard",
    "instLoanCardName",
    "instStyle",
    "insuranceCompanyName",
    "insuranceLimit",
    "insuranceType",
    "interestRule",
    "intustry",
    "investigateWay",
    "ipcAppId",
    "ipcId",
    "isAssure",
    "isCalTotalAmount",
    "isCard",
    "isHasCommonBorrower",
    "isLoan",
    "isMatch",
    "isOffer",
    "isOpenCard",
    "isPayPlan",
    "isProperty",
    "isRenew",
    "isRepayment",
    "isSanbiao",
    "isSendMessage",
    "isSignContact",
    "isSupportDeduction",
    "jobNature",
    "jobProve",
    "jobProveUrl",
    "jobs",
    "last3List",
    "lastRepayAmt",
    "lastUpDt",
    "liveAddress",
    "livePhone",
    "livePostcode",
    "liviingTeyp",
    "loanAmountOfMR",
    "loanCode",
    "loanDate",
    "loanPurpose",
    "loanPurposeOther",
    "loanTarget",
    "loanType",
    "localResidence",
    "localWorkExperience",
    "lonAttachs",
    "lonContacts",
    "lonCreditReportList",
    "lonCredits",
    "lonNet",
    "lonPawnLuxurys",
    "lonPawnOthers",
    "lonPawnPms",
    "lonPawnWatchs",
    "lonPolicys",
    "managerTimeLength",
    "marry",
    "mendTime",
    "mender",
    "monthBasicIncomeAmt",
    "monthNetProfit",
    "monthOtherIncomeAmt",
    "monthRate",
    "monthRepayAmt",
    "monthRepayLimit",
    "mortgagorAccount",
    "mortgagorName",
    "nation",
    "oldAppId",
    "oldAssetOwner",
    "operationVerifyBackFlag",
    "orgCode",
    "organizationCode",
    "originRatio",
    "otherIncomeAmt",
    "overDay",
    "overDueLevel",
    "pasture",
    "pawnCategory",
    "pawnType",
    "payEarlyRepay",
    "payMatchList",
    "payOfferDetail",
    "paymentType",
    "peopleLocal",
    "personalAssetAmt",
    "personalRemark",
    "phone",
    "planRepayDate",
    "postAddress",
    "prior",
    "processInstanceId",
    "processTempleteId",
    "productGoldAccount",
    "productId",
    "productName",
    "productTypeId",
    "propertyRemark",
    "propertyType",
    "punishAmt",
    "punishRate",
    "punishType",
    "qq",
    "receiveBankCard",
    "receiveBranch",
    "receiveCountry",
    "receiveCountryCode",
    "receiveName",
    "receiveOpen",
    "receiveProvince",
    "recentPrivateList",
    "recentPublicList",
    "recordUrl",
    "reducePeriods",
    "registAddress",
    "registAddressCity",
    "registAddressDistrict",
    "registAddressProvince",
    "registPostcode",
    "registedTime",
    "remainSumPrincipal",
    "remark",
    "renewManager",
    "renewManagerId",
    "renewType",
    "rentHouseAgent",
    "rentHouseCompany",
    "rentHouseOwner",
    "rentHouseSchool",
    "rentHouseTrade",
    "repayAccount",
    "repayAccountName",
    "repayBankCard",
    "repayBranch",
    "repayCardBindId",
    "repayDay",
    "repayExceedManagerAmt",
    "repayName",
    "repayOpen",
    "repayPunishAmt",
    "repayStatus",
    "repaySumAmt",
    "repaySumPrincipal",
    "repayViolateAmt",
    "repaymentInitiator",
    "requestDate",
    "resideDate",
    "reviewEndTime",
    "reviewUrl",
    "riskAmt",
    "riskAmtRate",
    "ruleId",
    "salaryAmt",
    "salaryDay",
    "saleChannel",
    "school",
    "scoreTempleteId",
    "secondStageRepayAmt",
    "sendTime",
    "serviceAmt",
    "serviceFeeAmt",
    "signDate",
    "stopSignDays",
    "studentNum",
    "suggestRemark",
    "sysApproveSuggestAmt",
    "timeLimit",
    "toCityDate",
    "transDate",
    "transTime",
    "transferChannel",
    "trusteeType",
    "upBackReason",
    "upBackReasonRemark",
    "upIntustry",
    "uumCustNo",
    "uumUserId",
    "violateAmt",
    "weiboNum",
    "weixinNum",
    "workTime",
    "yearRate",
    "ynhouseLoanOverdue",
    "ysxId",
    "ysxPzscId",
    "ysxTransNote",
    "yxzcLoanResult",
    "zpswiftBatchNo",
    "zpswiftId",
    "eMail",
    "tChannelApproval",
    "tLoanFeeInfo",
    "tLoanFeeInfolist",
    "tLoanTransInfo",
    "tLonAccount",
    "tLonAccounts",
    "tLonApplicationCarTradeStock",
    "tLonApplicationFodder",
    "tLonApplicationPersonalRentalHouse",
    "tLonApplicationPurchase",
    "tLonCreditReport",
    "tLonGuarantor",
    "tLonLightningloanInfo",
    "tLonOldCar",
    "tLonParking",
    "tLonPawnerBalanceInfo",
    "tLonPolicyApplication",
    "tLonSocietyPolicy"
})
@XmlSeeAlso({
    MatchOrder.class
})
public class TLonApplication {

    protected BigDecimal accountMngAmt;
    protected String accountType;
    protected String acquisitionCompanyName;
    protected String acquisitionType;
    protected Float adjustRatio;
    protected BigDecimal advisoryAmt;
    protected BigDecimal advisoryServiceAmt;
    protected Integer age;
    protected String aloneSwiftNo;
    @XmlElement(nillable = true)
    protected List<TLonApplicationCar> appCars;
    protected String appCode;
    @XmlElement(nillable = true)
    protected List<TLonApplicationHouse> appHouses;
    protected Integer appId;
    protected String appKey;
    protected String appLoanType;
    protected String appStatus;
    protected BigDecimal appayAmt;
    protected String appayDate;
    @XmlElement(nillable = true)
    protected List<TLonApplicationBeauty> applicationBeauties;
    protected TLonApplicationProcess applicationProcess;
    protected TLonApplicationStudent applicationStudent;
    protected TLonApplicationYimeijian applicationYimeijian;
    protected String approvalStatus;
    protected BigDecimal approveAmt;
    protected String approveEndTime;
    protected Integer approveLimit;
    protected String areaCode;
    protected BigDecimal averageIncomeAmt;
    protected BigDecimal averageListAmt;
    protected Integer beautyInstId;
    protected String beginCompanyDate;
    protected TCorpBillFactoringInfo billFactor;
    protected String borrowerType;
    protected BigDecimal businessAmt;
    @XmlElement(required = true)
    protected BusinessDataMap businessDataMap;
    protected Integer businessTime;
    protected String carRemark;
    protected String career;
    protected String certId;
    protected String certType;
    protected String channel;
    protected String channelId;
    protected String chargeRule;
    protected String chargeType;
    protected String checkTeamId;
    protected String checkUrl;
    protected TComWebInfo comWebInfo;
    protected String company;
    protected String companyAddress;
    protected String companyAddressCity;
    protected String companyAddressDistrict;
    protected String companyAddressProvince;
    protected String companyPhone;
    protected String companyPostcode;
    protected String companyRemark;
    protected String companyType;
    protected Long configVersionId;
    protected BigDecimal contractAmt;
    protected String contractCode;
    protected String contractStatus;
    protected String contractTemplate;
    protected String contractUrl;
    protected String cooperateCode;
    protected String createTime;
    protected String creator;
    @XmlElement(nillable = true)
    protected List<TLonCreditReport91> creditReport91List;
    protected BigDecimal creditorRights;
    protected String customerId;
    protected String customerLevel;
    protected String customerName;
    protected String customerProperty;
    protected String customerSex;
    protected String customerSource;
    protected String customerType;
    protected TLonApplicationDecorateHouse decorateHouse;
    protected BigDecimal deductedAmount;
    protected String degree;
    protected BigDecimal depositAmt;
    protected Float depositAmtRate;
    protected Float discount;
    protected BigDecimal drawnAmt;
    protected String duty;
    protected String endReason;
    protected Integer enterId;
    protected BigDecimal exceedAmt;
    protected String exceedBeginDate;
    protected BigDecimal exceedManagerAmt;
    protected Float exceedRate;
    protected BigDecimal expectCarAmount;
    protected TLonApplicationExt ext;
    protected Float extendFl1;
    protected Float extendFl2;
    protected Float extendFl3;
    protected BigDecimal extendFl4;
    protected BigDecimal extendFl5;
    protected String extendTime1;
    protected String extendTime2;
    protected String extendTime3;
    protected String extendTime4;
    protected String extendTime5;
    protected String extendVc1;
    protected String extendVc10;
    protected String extendVc2;
    protected String extendVc3;
    protected String extendVc4;
    protected String extendVc5;
    protected String extendVc6;
    protected String extendVc7;
    protected String extendVc8;
    protected String extendVc9;
    protected String fileUpEndDate;
    protected String firmType;
    protected String firstRepayDate;
    protected BigDecimal firstStageRepayAmt;
    protected String fullDate;
    protected Integer groupId;
    protected String groupName;
    protected String groupTeamId;
    protected String guarantorCertId;
    protected String guarantorComName;
    @XmlElement(nillable = true)
    protected List<TLonContact> guarantorContacts;
    @XmlElement(nillable = true)
    protected List<TLonApplicationHouse> guarantorHouses;
    protected String guarantorName;
    protected String guarantyType;
    protected Float handChargeRate;
    protected String havaExceed;
    protected String haveCredit;
    protected String haveLicense;
    protected String havePlan;
    protected String houseCar;
    protected String houseLocal;
    @XmlElement(nillable = true)
    protected List<TLonHouseMortgage> houseMortgageList;
    protected String householdRegister;
    protected String incomeType;
    protected String industryRegist;
    protected String initStats;
    protected String instCode;
    protected String instCreateTime;
    protected String instLoanCard;
    protected String instLoanCardName;
    protected String instStyle;
    protected String insuranceCompanyName;
    protected String insuranceLimit;
    protected String insuranceType;
    protected String interestRule;
    protected String intustry;
    protected String investigateWay;
    protected Integer ipcAppId;
    protected Integer ipcId;
    protected String isAssure;
    protected String isCalTotalAmount;
    protected String isCard;
    protected String isHasCommonBorrower;
    protected String isLoan;
    protected String isMatch;
    protected String isOffer;
    protected String isOpenCard;
    protected String isPayPlan;
    protected String isProperty;
    protected int isRenew;
    protected String isRepayment;
    protected String isSanbiao;
    protected String isSendMessage;
    protected String isSignContact;
    protected String isSupportDeduction;
    protected String jobNature;
    protected String jobProve;
    protected String jobProveUrl;
    protected String jobs;
    protected String last3List;
    protected BigDecimal lastRepayAmt;
    protected String lastUpDt;
    protected String liveAddress;
    protected String livePhone;
    protected String livePostcode;
    protected String liviingTeyp;
    protected BigDecimal loanAmountOfMR;
    protected String loanCode;
    protected String loanDate;
    protected String loanPurpose;
    protected String loanPurposeOther;
    protected String loanTarget;
    protected String loanType;
    protected String localResidence;
    protected String localWorkExperience;
    @XmlElement(nillable = true)
    protected List<TLonAttach> lonAttachs;
    @XmlElement(nillable = true)
    protected List<TLonContact> lonContacts;
    @XmlElement(nillable = true)
    protected List<TLonCreditReport> lonCreditReportList;
    @XmlElement(nillable = true)
    protected List<TLonCredit> lonCredits;
    @XmlElement(nillable = true)
    protected List<TLonNet> lonNet;
    @XmlElement(nillable = true)
    protected List<TLonApplicationPawnLuxury> lonPawnLuxurys;
    @XmlElement(nillable = true)
    protected List<TLonApplicationPawnOther> lonPawnOthers;
    @XmlElement(nillable = true)
    protected List<TLonApplicationPawnPm> lonPawnPms;
    @XmlElement(nillable = true)
    protected List<TLonApplicationPawnWatch> lonPawnWatchs;
    @XmlElement(nillable = true)
    protected List<TLonPolicy> lonPolicys;
    protected int managerTimeLength;
    protected String marry;
    protected String mendTime;
    protected String mender;
    protected BigDecimal monthBasicIncomeAmt;
    protected BigDecimal monthNetProfit;
    protected BigDecimal monthOtherIncomeAmt;
    protected Float monthRate;
    protected BigDecimal monthRepayAmt;
    protected BigDecimal monthRepayLimit;
    protected String mortgagorAccount;
    protected String mortgagorName;
    protected String nation;
    protected String oldAppId;
    protected String oldAssetOwner;
    protected String operationVerifyBackFlag;
    protected String orgCode;
    protected String organizationCode;
    protected Float originRatio;
    protected BigDecimal otherIncomeAmt;
    protected String overDay;
    protected String overDueLevel;
    protected TLonApplicationPasture pasture;
    protected String pawnCategory;
    protected String pawnType;
    protected TRepEarlyRepay payEarlyRepay;
    @XmlElement(nillable = true)
    protected List<TPayMatch> payMatchList;
    protected TPayOfferDetail payOfferDetail;
    protected String paymentType;
    protected String peopleLocal;
    protected String personalAssetAmt;
    protected String personalRemark;
    protected String phone;
    protected String planRepayDate;
    protected String postAddress;
    protected String prior;
    protected String processInstanceId;
    protected String processTempleteId;
    @XmlElement(nillable = true)
    protected List<ProductGoldAccount> productGoldAccount;
    protected String productId;
    protected String productName;
    protected Integer productTypeId;
    protected String propertyRemark;
    protected String propertyType;
    protected BigDecimal punishAmt;
    protected Float punishRate;
    protected String punishType;
    protected String qq;
    protected String receiveBankCard;
    protected String receiveBranch;
    protected String receiveCountry;
    protected String receiveCountryCode;
    protected String receiveName;
    protected String receiveOpen;
    protected String receiveProvince;
    protected String recentPrivateList;
    protected String recentPublicList;
    protected String recordUrl;
    protected String reducePeriods;
    protected String registAddress;
    protected String registAddressCity;
    protected String registAddressDistrict;
    protected String registAddressProvince;
    protected String registPostcode;
    protected Integer registedTime;
    protected BigDecimal remainSumPrincipal;
    protected String remark;
    protected String renewManager;
    protected String renewManagerId;
    protected String renewType;
    protected TLonApplicationRentHouseAgent rentHouseAgent;
    protected TLonApplicationRentHouseCompany rentHouseCompany;
    protected TLonApplicationRentHouseOwner rentHouseOwner;
    protected TLonApplicationRentHouseSchool rentHouseSchool;
    protected TLonApplicationRentHouseTrade rentHouseTrade;
    protected String repayAccount;
    protected String repayAccountName;
    protected String repayBankCard;
    protected String repayBranch;
    protected String repayCardBindId;
    protected Integer repayDay;
    protected BigDecimal repayExceedManagerAmt;
    protected String repayName;
    protected String repayOpen;
    protected BigDecimal repayPunishAmt;
    protected String repayStatus;
    protected BigDecimal repaySumAmt;
    protected BigDecimal repaySumPrincipal;
    protected BigDecimal repayViolateAmt;
    protected String repaymentInitiator;
    protected String requestDate;
    protected String resideDate;
    protected String reviewEndTime;
    protected String reviewUrl;
    protected BigDecimal riskAmt;
    protected Float riskAmtRate;
    protected Integer ruleId;
    protected BigDecimal salaryAmt;
    protected Integer salaryDay;
    protected String saleChannel;
    protected String school;
    protected Integer scoreTempleteId;
    protected BigDecimal secondStageRepayAmt;
    protected String sendTime;
    protected BigDecimal serviceAmt;
    protected BigDecimal serviceFeeAmt;
    protected String signDate;
    protected Integer stopSignDays;
    protected String studentNum;
    protected String suggestRemark;
    protected BigDecimal sysApproveSuggestAmt;
    protected Integer timeLimit;
    protected String toCityDate;
    protected String transDate;
    protected String transTime;
    protected Integer transferChannel;
    protected String trusteeType;
    protected String upBackReason;
    protected String upBackReasonRemark;
    protected String upIntustry;
    protected String uumCustNo;
    protected String uumUserId;
    protected BigDecimal violateAmt;
    protected String weiboNum;
    protected String weixinNum;
    protected Integer workTime;
    protected Float yearRate;
    protected String ynhouseLoanOverdue;
    protected String ysxId;
    protected Long ysxPzscId;
    @XmlElement(nillable = true)
    protected List<YsxTransNote> ysxTransNote;
    protected TYxzcLoanResult yxzcLoanResult;
    protected String zpswiftBatchNo;
    protected String zpswiftId;
    protected String eMail;
    protected TChannelApproval tChannelApproval;
    protected TLoanFeeInfo tLoanFeeInfo;
    @XmlElement(nillable = true)
    protected List<TLoanFeeInfo> tLoanFeeInfolist;
    protected TLoanTransInfo tLoanTransInfo;
    protected TLonAccount tLonAccount;
    @XmlElement(nillable = true)
    protected List<TLonAccount> tLonAccounts;
    @XmlElement(nillable = true)
    protected List<TLonApplicationCarTradeStock> tLonApplicationCarTradeStock;
    protected TLonApplicationFodder tLonApplicationFodder;
    protected TLonApplicationPersonalRentalHouse tLonApplicationPersonalRentalHouse;
    protected TLonApplicationPurchase tLonApplicationPurchase;
    protected TLonCreditReport tLonCreditReport;
    protected TLonGuarantor tLonGuarantor;
    protected TLonLightningloanInfo tLonLightningloanInfo;
    protected TLonOldCar tLonOldCar;
    protected TLonApplicationParking tLonParking;
    protected TLonPawnerBalanceInfo tLonPawnerBalanceInfo;
    protected TLonPolicyApplication tLonPolicyApplication;
    protected TLonSocietyPolicy tLonSocietyPolicy;

    /**
     * ��ȡaccountMngAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountMngAmt() {
        return accountMngAmt;
    }

    /**
     * ����accountMngAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountMngAmt(BigDecimal value) {
        this.accountMngAmt = value;
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
     * ��ȡacquisitionCompanyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquisitionCompanyName() {
        return acquisitionCompanyName;
    }

    /**
     * ����acquisitionCompanyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquisitionCompanyName(String value) {
        this.acquisitionCompanyName = value;
    }

    /**
     * ��ȡacquisitionType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquisitionType() {
        return acquisitionType;
    }

    /**
     * ����acquisitionType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquisitionType(String value) {
        this.acquisitionType = value;
    }

    /**
     * ��ȡadjustRatio���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAdjustRatio() {
        return adjustRatio;
    }

    /**
     * ����adjustRatio���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAdjustRatio(Float value) {
        this.adjustRatio = value;
    }

    /**
     * ��ȡadvisoryAmt���Ե�ֵ��
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
     * ����advisoryAmt���Ե�ֵ��
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
     * ��ȡadvisoryServiceAmt���Ե�ֵ��
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
     * ����advisoryServiceAmt���Ե�ֵ��
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
     * ��ȡage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * ����age���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * ��ȡaloneSwiftNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAloneSwiftNo() {
        return aloneSwiftNo;
    }

    /**
     * ����aloneSwiftNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAloneSwiftNo(String value) {
        this.aloneSwiftNo = value;
    }

    /**
     * Gets the value of the appCars property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appCars property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppCars().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonApplicationCar }
     * 
     * 
     */
    public List<TLonApplicationCar> getAppCars() {
        if (appCars == null) {
            appCars = new ArrayList<TLonApplicationCar>();
        }
        return this.appCars;
    }

    /**
     * ��ȡappCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * ����appCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppCode(String value) {
        this.appCode = value;
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
     * ��ȡappKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * ����appKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppKey(String value) {
        this.appKey = value;
    }

    /**
     * ��ȡappLoanType���Ե�ֵ��
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
     * ����appLoanType���Ե�ֵ��
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
     * ��ȡappStatus���Ե�ֵ��
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
     * ����appStatus���Ե�ֵ��
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
     * ��ȡappayDate���Ե�ֵ��
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
     * ����appayDate���Ե�ֵ��
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
     * Gets the value of the applicationBeauties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationBeauties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationBeauties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonApplicationBeauty }
     * 
     * 
     */
    public List<TLonApplicationBeauty> getApplicationBeauties() {
        if (applicationBeauties == null) {
            applicationBeauties = new ArrayList<TLonApplicationBeauty>();
        }
        return this.applicationBeauties;
    }

    /**
     * ��ȡapplicationProcess���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationProcess }
     *     
     */
    public TLonApplicationProcess getApplicationProcess() {
        return applicationProcess;
    }

    /**
     * ����applicationProcess���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationProcess }
     *     
     */
    public void setApplicationProcess(TLonApplicationProcess value) {
        this.applicationProcess = value;
    }

    /**
     * ��ȡapplicationStudent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationStudent }
     *     
     */
    public TLonApplicationStudent getApplicationStudent() {
        return applicationStudent;
    }

    /**
     * ����applicationStudent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationStudent }
     *     
     */
    public void setApplicationStudent(TLonApplicationStudent value) {
        this.applicationStudent = value;
    }

    /**
     * ��ȡapplicationYimeijian���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationYimeijian }
     *     
     */
    public TLonApplicationYimeijian getApplicationYimeijian() {
        return applicationYimeijian;
    }

    /**
     * ����applicationYimeijian���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationYimeijian }
     *     
     */
    public void setApplicationYimeijian(TLonApplicationYimeijian value) {
        this.applicationYimeijian = value;
    }

    /**
     * ��ȡapprovalStatus���Ե�ֵ��
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
     * ����approvalStatus���Ե�ֵ��
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
     * ��ȡapproveAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApproveAmt() {
        return approveAmt;
    }

    /**
     * ����approveAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApproveAmt(BigDecimal value) {
        this.approveAmt = value;
    }

    /**
     * ��ȡapproveEndTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveEndTime() {
        return approveEndTime;
    }

    /**
     * ����approveEndTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveEndTime(String value) {
        this.approveEndTime = value;
    }

    /**
     * ��ȡapproveLimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApproveLimit() {
        return approveLimit;
    }

    /**
     * ����approveLimit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApproveLimit(Integer value) {
        this.approveLimit = value;
    }

    /**
     * ��ȡareaCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * ����areaCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * ��ȡaverageIncomeAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageIncomeAmt() {
        return averageIncomeAmt;
    }

    /**
     * ����averageIncomeAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageIncomeAmt(BigDecimal value) {
        this.averageIncomeAmt = value;
    }

    /**
     * ��ȡaverageListAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageListAmt() {
        return averageListAmt;
    }

    /**
     * ����averageListAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageListAmt(BigDecimal value) {
        this.averageListAmt = value;
    }

    /**
     * ��ȡbeautyInstId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBeautyInstId() {
        return beautyInstId;
    }

    /**
     * ����beautyInstId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBeautyInstId(Integer value) {
        this.beautyInstId = value;
    }

    /**
     * ��ȡbeginCompanyDate���Ե�ֵ��
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
     * ����beginCompanyDate���Ե�ֵ��
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
     * ��ȡbillFactor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TCorpBillFactoringInfo }
     *     
     */
    public TCorpBillFactoringInfo getBillFactor() {
        return billFactor;
    }

    /**
     * ����billFactor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TCorpBillFactoringInfo }
     *     
     */
    public void setBillFactor(TCorpBillFactoringInfo value) {
        this.billFactor = value;
    }

    /**
     * ��ȡborrowerType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerType() {
        return borrowerType;
    }

    /**
     * ����borrowerType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerType(String value) {
        this.borrowerType = value;
    }

    /**
     * ��ȡbusinessAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBusinessAmt() {
        return businessAmt;
    }

    /**
     * ����businessAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBusinessAmt(BigDecimal value) {
        this.businessAmt = value;
    }

    /**
     * ��ȡbusinessDataMap���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BusinessDataMap }
     *     
     */
    public BusinessDataMap getBusinessDataMap() {
        return businessDataMap;
    }

    /**
     * ����businessDataMap���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDataMap }
     *     
     */
    public void setBusinessDataMap(BusinessDataMap value) {
        this.businessDataMap = value;
    }

    /**
     * ��ȡbusinessTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusinessTime() {
        return businessTime;
    }

    /**
     * ����businessTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusinessTime(Integer value) {
        this.businessTime = value;
    }

    /**
     * ��ȡcarRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarRemark() {
        return carRemark;
    }

    /**
     * ����carRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarRemark(String value) {
        this.carRemark = value;
    }

    /**
     * ��ȡcareer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareer() {
        return career;
    }

    /**
     * ����career���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareer(String value) {
        this.career = value;
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
     * ��ȡcertType���Ե�ֵ��
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
     * ����certType���Ե�ֵ��
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
     * ��ȡchannel���Ե�ֵ��
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
     * ����channel���Ե�ֵ��
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
     * ��ȡchannelId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * ����channelId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * ��ȡchargeRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeRule() {
        return chargeRule;
    }

    /**
     * ����chargeRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeRule(String value) {
        this.chargeRule = value;
    }

    /**
     * ��ȡchargeType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * ����chargeType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * ��ȡcheckTeamId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckTeamId() {
        return checkTeamId;
    }

    /**
     * ����checkTeamId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckTeamId(String value) {
        this.checkTeamId = value;
    }

    /**
     * ��ȡcheckUrl���Ե�ֵ��
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
     * ����checkUrl���Ե�ֵ��
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
     * ��ȡcomWebInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TComWebInfo }
     *     
     */
    public TComWebInfo getComWebInfo() {
        return comWebInfo;
    }

    /**
     * ����comWebInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TComWebInfo }
     *     
     */
    public void setComWebInfo(TComWebInfo value) {
        this.comWebInfo = value;
    }

    /**
     * ��ȡcompany���Ե�ֵ��
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
     * ����company���Ե�ֵ��
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
     * ��ȡcompanyAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * ����companyAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddress(String value) {
        this.companyAddress = value;
    }

    /**
     * ��ȡcompanyAddressCity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddressCity() {
        return companyAddressCity;
    }

    /**
     * ����companyAddressCity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddressCity(String value) {
        this.companyAddressCity = value;
    }

    /**
     * ��ȡcompanyAddressDistrict���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddressDistrict() {
        return companyAddressDistrict;
    }

    /**
     * ����companyAddressDistrict���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddressDistrict(String value) {
        this.companyAddressDistrict = value;
    }

    /**
     * ��ȡcompanyAddressProvince���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddressProvince() {
        return companyAddressProvince;
    }

    /**
     * ����companyAddressProvince���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddressProvince(String value) {
        this.companyAddressProvince = value;
    }

    /**
     * ��ȡcompanyPhone���Ե�ֵ��
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
     * ����companyPhone���Ե�ֵ��
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
     * ��ȡcompanyPostcode���Ե�ֵ��
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
     * ����companyPostcode���Ե�ֵ��
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
     * ��ȡcompanyRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRemark() {
        return companyRemark;
    }

    /**
     * ����companyRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRemark(String value) {
        this.companyRemark = value;
    }

    /**
     * ��ȡcompanyType���Ե�ֵ��
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
     * ����companyType���Ե�ֵ��
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
     * ��ȡconfigVersionId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfigVersionId() {
        return configVersionId;
    }

    /**
     * ����configVersionId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfigVersionId(Long value) {
        this.configVersionId = value;
    }

    /**
     * ��ȡcontractAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContractAmt() {
        return contractAmt;
    }

    /**
     * ����contractAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContractAmt(BigDecimal value) {
        this.contractAmt = value;
    }

    /**
     * ��ȡcontractCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * ����contractCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCode(String value) {
        this.contractCode = value;
    }

    /**
     * ��ȡcontractStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStatus() {
        return contractStatus;
    }

    /**
     * ����contractStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStatus(String value) {
        this.contractStatus = value;
    }

    /**
     * ��ȡcontractTemplate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTemplate() {
        return contractTemplate;
    }

    /**
     * ����contractTemplate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTemplate(String value) {
        this.contractTemplate = value;
    }

    /**
     * ��ȡcontractUrl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractUrl() {
        return contractUrl;
    }

    /**
     * ����contractUrl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractUrl(String value) {
        this.contractUrl = value;
    }

    /**
     * ��ȡcooperateCode���Ե�ֵ��
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
     * ����cooperateCode���Ե�ֵ��
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
     * ��ȡcreator���Ե�ֵ��
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
     * ����creator���Ե�ֵ��
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
     * Gets the value of the creditReport91List property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditReport91List property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditReport91List().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonCreditReport91 }
     * 
     * 
     */
    public List<TLonCreditReport91> getCreditReport91List() {
        if (creditReport91List == null) {
            creditReport91List = new ArrayList<TLonCreditReport91>();
        }
        return this.creditReport91List;
    }

    /**
     * ��ȡcreditorRights���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditorRights() {
        return creditorRights;
    }

    /**
     * ����creditorRights���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditorRights(BigDecimal value) {
        this.creditorRights = value;
    }

    /**
     * ��ȡcustomerId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * ����customerId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * ��ȡcustomerLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLevel() {
        return customerLevel;
    }

    /**
     * ����customerLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLevel(String value) {
        this.customerLevel = value;
    }

    /**
     * ��ȡcustomerName���Ե�ֵ��
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
     * ����customerName���Ե�ֵ��
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
     * ��ȡcustomerProperty���Ե�ֵ��
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
     * ����customerProperty���Ե�ֵ��
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
     * ��ȡcustomerSex���Ե�ֵ��
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
     * ����customerSex���Ե�ֵ��
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
     * ��ȡcustomerSource���Ե�ֵ��
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
     * ����customerSource���Ե�ֵ��
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
     * ��ȡcustomerType���Ե�ֵ��
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
     * ����customerType���Ե�ֵ��
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
     * ��ȡdecorateHouse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationDecorateHouse }
     *     
     */
    public TLonApplicationDecorateHouse getDecorateHouse() {
        return decorateHouse;
    }

    /**
     * ����decorateHouse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationDecorateHouse }
     *     
     */
    public void setDecorateHouse(TLonApplicationDecorateHouse value) {
        this.decorateHouse = value;
    }

    /**
     * ��ȡdeductedAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductedAmount() {
        return deductedAmount;
    }

    /**
     * ����deductedAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductedAmount(BigDecimal value) {
        this.deductedAmount = value;
    }

    /**
     * ��ȡdegree���Ե�ֵ��
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
     * ����degree���Ե�ֵ��
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
     * ��ȡdepositAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositAmt() {
        return depositAmt;
    }

    /**
     * ����depositAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositAmt(BigDecimal value) {
        this.depositAmt = value;
    }

    /**
     * ��ȡdepositAmtRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepositAmtRate() {
        return depositAmtRate;
    }

    /**
     * ����depositAmtRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepositAmtRate(Float value) {
        this.depositAmtRate = value;
    }

    /**
     * ��ȡdiscount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDiscount() {
        return discount;
    }

    /**
     * ����discount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDiscount(Float value) {
        this.discount = value;
    }

    /**
     * ��ȡdrawnAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDrawnAmt() {
        return drawnAmt;
    }

    /**
     * ����drawnAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDrawnAmt(BigDecimal value) {
        this.drawnAmt = value;
    }

    /**
     * ��ȡduty���Ե�ֵ��
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
     * ����duty���Ե�ֵ��
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
     * ��ȡendReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndReason() {
        return endReason;
    }

    /**
     * ����endReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndReason(String value) {
        this.endReason = value;
    }

    /**
     * ��ȡenterId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnterId() {
        return enterId;
    }

    /**
     * ����enterId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnterId(Integer value) {
        this.enterId = value;
    }

    /**
     * ��ȡexceedAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExceedAmt() {
        return exceedAmt;
    }

    /**
     * ����exceedAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExceedAmt(BigDecimal value) {
        this.exceedAmt = value;
    }

    /**
     * ��ȡexceedBeginDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceedBeginDate() {
        return exceedBeginDate;
    }

    /**
     * ����exceedBeginDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceedBeginDate(String value) {
        this.exceedBeginDate = value;
    }

    /**
     * ��ȡexceedManagerAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExceedManagerAmt() {
        return exceedManagerAmt;
    }

    /**
     * ����exceedManagerAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExceedManagerAmt(BigDecimal value) {
        this.exceedManagerAmt = value;
    }

    /**
     * ��ȡexceedRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExceedRate() {
        return exceedRate;
    }

    /**
     * ����exceedRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExceedRate(Float value) {
        this.exceedRate = value;
    }

    /**
     * ��ȡexpectCarAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpectCarAmount() {
        return expectCarAmount;
    }

    /**
     * ����expectCarAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpectCarAmount(BigDecimal value) {
        this.expectCarAmount = value;
    }

    /**
     * ��ȡext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationExt }
     *     
     */
    public TLonApplicationExt getExt() {
        return ext;
    }

    /**
     * ����ext���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationExt }
     *     
     */
    public void setExt(TLonApplicationExt value) {
        this.ext = value;
    }

    /**
     * ��ȡextendFl1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExtendFl1() {
        return extendFl1;
    }

    /**
     * ����extendFl1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExtendFl1(Float value) {
        this.extendFl1 = value;
    }

    /**
     * ��ȡextendFl2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExtendFl2() {
        return extendFl2;
    }

    /**
     * ����extendFl2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExtendFl2(Float value) {
        this.extendFl2 = value;
    }

    /**
     * ��ȡextendFl3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExtendFl3() {
        return extendFl3;
    }

    /**
     * ����extendFl3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExtendFl3(Float value) {
        this.extendFl3 = value;
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
     * ��ȡextendTime1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendTime1() {
        return extendTime1;
    }

    /**
     * ����extendTime1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendTime1(String value) {
        this.extendTime1 = value;
    }

    /**
     * ��ȡextendTime2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendTime2() {
        return extendTime2;
    }

    /**
     * ����extendTime2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendTime2(String value) {
        this.extendTime2 = value;
    }

    /**
     * ��ȡextendTime3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendTime3() {
        return extendTime3;
    }

    /**
     * ����extendTime3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendTime3(String value) {
        this.extendTime3 = value;
    }

    /**
     * ��ȡextendTime4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendTime4() {
        return extendTime4;
    }

    /**
     * ����extendTime4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendTime4(String value) {
        this.extendTime4 = value;
    }

    /**
     * ��ȡextendTime5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendTime5() {
        return extendTime5;
    }

    /**
     * ����extendTime5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendTime5(String value) {
        this.extendTime5 = value;
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
     * ��ȡextendVc10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendVc10() {
        return extendVc10;
    }

    /**
     * ����extendVc10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendVc10(String value) {
        this.extendVc10 = value;
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
     * ��ȡextendVc4���Ե�ֵ��
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
     * ����extendVc4���Ե�ֵ��
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
     * ��ȡextendVc5���Ե�ֵ��
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
     * ����extendVc5���Ե�ֵ��
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
     * ��ȡextendVc6���Ե�ֵ��
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
     * ����extendVc6���Ե�ֵ��
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
     * ��ȡextendVc7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendVc7() {
        return extendVc7;
    }

    /**
     * ����extendVc7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendVc7(String value) {
        this.extendVc7 = value;
    }

    /**
     * ��ȡextendVc8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendVc8() {
        return extendVc8;
    }

    /**
     * ����extendVc8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendVc8(String value) {
        this.extendVc8 = value;
    }

    /**
     * ��ȡextendVc9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendVc9() {
        return extendVc9;
    }

    /**
     * ����extendVc9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendVc9(String value) {
        this.extendVc9 = value;
    }

    /**
     * ��ȡfileUpEndDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileUpEndDate() {
        return fileUpEndDate;
    }

    /**
     * ����fileUpEndDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUpEndDate(String value) {
        this.fileUpEndDate = value;
    }

    /**
     * ��ȡfirmType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmType() {
        return firmType;
    }

    /**
     * ����firmType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmType(String value) {
        this.firmType = value;
    }

    /**
     * ��ȡfirstRepayDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstRepayDate() {
        return firstRepayDate;
    }

    /**
     * ����firstRepayDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstRepayDate(String value) {
        this.firstRepayDate = value;
    }

    /**
     * ��ȡfirstStageRepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstStageRepayAmt() {
        return firstStageRepayAmt;
    }

    /**
     * ����firstStageRepayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstStageRepayAmt(BigDecimal value) {
        this.firstStageRepayAmt = value;
    }

    /**
     * ��ȡfullDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullDate() {
        return fullDate;
    }

    /**
     * ����fullDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullDate(String value) {
        this.fullDate = value;
    }

    /**
     * ��ȡgroupId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * ����groupId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupId(Integer value) {
        this.groupId = value;
    }

    /**
     * ��ȡgroupName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * ����groupName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * ��ȡgroupTeamId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupTeamId() {
        return groupTeamId;
    }

    /**
     * ����groupTeamId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupTeamId(String value) {
        this.groupTeamId = value;
    }

    /**
     * ��ȡguarantorCertId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorCertId() {
        return guarantorCertId;
    }

    /**
     * ����guarantorCertId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorCertId(String value) {
        this.guarantorCertId = value;
    }

    /**
     * ��ȡguarantorComName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorComName() {
        return guarantorComName;
    }

    /**
     * ����guarantorComName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorComName(String value) {
        this.guarantorComName = value;
    }

    /**
     * Gets the value of the guarantorContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantorContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantorContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonContact }
     * 
     * 
     */
    public List<TLonContact> getGuarantorContacts() {
        if (guarantorContacts == null) {
            guarantorContacts = new ArrayList<TLonContact>();
        }
        return this.guarantorContacts;
    }

    /**
     * Gets the value of the guarantorHouses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantorHouses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantorHouses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonApplicationHouse }
     * 
     * 
     */
    public List<TLonApplicationHouse> getGuarantorHouses() {
        if (guarantorHouses == null) {
            guarantorHouses = new ArrayList<TLonApplicationHouse>();
        }
        return this.guarantorHouses;
    }

    /**
     * ��ȡguarantorName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorName() {
        return guarantorName;
    }

    /**
     * ����guarantorName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorName(String value) {
        this.guarantorName = value;
    }

    /**
     * ��ȡguarantyType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantyType() {
        return guarantyType;
    }

    /**
     * ����guarantyType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantyType(String value) {
        this.guarantyType = value;
    }

    /**
     * ��ȡhandChargeRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHandChargeRate() {
        return handChargeRate;
    }

    /**
     * ����handChargeRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHandChargeRate(Float value) {
        this.handChargeRate = value;
    }

    /**
     * ��ȡhavaExceed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHavaExceed() {
        return havaExceed;
    }

    /**
     * ����havaExceed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHavaExceed(String value) {
        this.havaExceed = value;
    }

    /**
     * ��ȡhaveCredit���Ե�ֵ��
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
     * ����haveCredit���Ե�ֵ��
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
     * ��ȡhaveLicense���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaveLicense() {
        return haveLicense;
    }

    /**
     * ����haveLicense���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaveLicense(String value) {
        this.haveLicense = value;
    }

    /**
     * ��ȡhavePlan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHavePlan() {
        return havePlan;
    }

    /**
     * ����havePlan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHavePlan(String value) {
        this.havePlan = value;
    }

    /**
     * ��ȡhouseCar���Ե�ֵ��
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
     * ����houseCar���Ե�ֵ��
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
     * ��ȡhouseLocal���Ե�ֵ��
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
     * ����houseLocal���Ե�ֵ��
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
     * Gets the value of the houseMortgageList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the houseMortgageList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseMortgageList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonHouseMortgage }
     * 
     * 
     */
    public List<TLonHouseMortgage> getHouseMortgageList() {
        if (houseMortgageList == null) {
            houseMortgageList = new ArrayList<TLonHouseMortgage>();
        }
        return this.houseMortgageList;
    }

    /**
     * ��ȡhouseholdRegister���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdRegister() {
        return householdRegister;
    }

    /**
     * ����householdRegister���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdRegister(String value) {
        this.householdRegister = value;
    }

    /**
     * ��ȡincomeType���Ե�ֵ��
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
     * ����incomeType���Ե�ֵ��
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
     * ��ȡindustryRegist���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryRegist() {
        return industryRegist;
    }

    /**
     * ����industryRegist���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryRegist(String value) {
        this.industryRegist = value;
    }

    /**
     * ��ȡinitStats���Ե�ֵ��
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
     * ����initStats���Ե�ֵ��
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
     * ��ȡinstCreateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstCreateTime() {
        return instCreateTime;
    }

    /**
     * ����instCreateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstCreateTime(String value) {
        this.instCreateTime = value;
    }

    /**
     * ��ȡinstLoanCard���Ե�ֵ��
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
     * ����instLoanCard���Ե�ֵ��
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
     * ��ȡinstLoanCardName���Ե�ֵ��
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
     * ����instLoanCardName���Ե�ֵ��
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
     * ��ȡinstStyle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstStyle() {
        return instStyle;
    }

    /**
     * ����instStyle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstStyle(String value) {
        this.instStyle = value;
    }

    /**
     * ��ȡinsuranceCompanyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    /**
     * ����insuranceCompanyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompanyName(String value) {
        this.insuranceCompanyName = value;
    }

    /**
     * ��ȡinsuranceLimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceLimit() {
        return insuranceLimit;
    }

    /**
     * ����insuranceLimit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceLimit(String value) {
        this.insuranceLimit = value;
    }

    /**
     * ��ȡinsuranceType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceType() {
        return insuranceType;
    }

    /**
     * ����insuranceType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceType(String value) {
        this.insuranceType = value;
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
     * ��ȡintustry���Ե�ֵ��
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
     * ����intustry���Ե�ֵ��
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
     * ��ȡinvestigateWay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestigateWay() {
        return investigateWay;
    }

    /**
     * ����investigateWay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestigateWay(String value) {
        this.investigateWay = value;
    }

    /**
     * ��ȡipcAppId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpcAppId() {
        return ipcAppId;
    }

    /**
     * ����ipcAppId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpcAppId(Integer value) {
        this.ipcAppId = value;
    }

    /**
     * ��ȡipcId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpcId() {
        return ipcId;
    }

    /**
     * ����ipcId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpcId(Integer value) {
        this.ipcId = value;
    }

    /**
     * ��ȡisAssure���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAssure() {
        return isAssure;
    }

    /**
     * ����isAssure���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAssure(String value) {
        this.isAssure = value;
    }

    /**
     * ��ȡisCalTotalAmount���Ե�ֵ��
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
     * ����isCalTotalAmount���Ե�ֵ��
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
     * ��ȡisCard���Ե�ֵ��
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
     * ����isCard���Ե�ֵ��
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
     * ��ȡisHasCommonBorrower���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHasCommonBorrower() {
        return isHasCommonBorrower;
    }

    /**
     * ����isHasCommonBorrower���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHasCommonBorrower(String value) {
        this.isHasCommonBorrower = value;
    }

    /**
     * ��ȡisLoan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLoan() {
        return isLoan;
    }

    /**
     * ����isLoan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLoan(String value) {
        this.isLoan = value;
    }

    /**
     * ��ȡisMatch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMatch() {
        return isMatch;
    }

    /**
     * ����isMatch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMatch(String value) {
        this.isMatch = value;
    }

    /**
     * ��ȡisOffer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOffer() {
        return isOffer;
    }

    /**
     * ����isOffer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOffer(String value) {
        this.isOffer = value;
    }

    /**
     * ��ȡisOpenCard���Ե�ֵ��
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
     * ����isOpenCard���Ե�ֵ��
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
     * ��ȡisPayPlan���Ե�ֵ��
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
     * ����isPayPlan���Ե�ֵ��
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
     * ��ȡisProperty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsProperty() {
        return isProperty;
    }

    /**
     * ����isProperty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsProperty(String value) {
        this.isProperty = value;
    }

    /**
     * ��ȡisRenew���Ե�ֵ��
     * 
     */
    public int getIsRenew() {
        return isRenew;
    }

    /**
     * ����isRenew���Ե�ֵ��
     * 
     */
    public void setIsRenew(int value) {
        this.isRenew = value;
    }

    /**
     * ��ȡisRepayment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRepayment() {
        return isRepayment;
    }

    /**
     * ����isRepayment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRepayment(String value) {
        this.isRepayment = value;
    }

    /**
     * ��ȡisSanbiao���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSanbiao() {
        return isSanbiao;
    }

    /**
     * ����isSanbiao���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSanbiao(String value) {
        this.isSanbiao = value;
    }

    /**
     * ��ȡisSendMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSendMessage() {
        return isSendMessage;
    }

    /**
     * ����isSendMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSendMessage(String value) {
        this.isSendMessage = value;
    }

    /**
     * ��ȡisSignContact���Ե�ֵ��
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
     * ����isSignContact���Ե�ֵ��
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
     * ��ȡisSupportDeduction���Ե�ֵ��
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
     * ����isSupportDeduction���Ե�ֵ��
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
     * ��ȡjobNature���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNature() {
        return jobNature;
    }

    /**
     * ����jobNature���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNature(String value) {
        this.jobNature = value;
    }

    /**
     * ��ȡjobProve���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobProve() {
        return jobProve;
    }

    /**
     * ����jobProve���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobProve(String value) {
        this.jobProve = value;
    }

    /**
     * ��ȡjobProveUrl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobProveUrl() {
        return jobProveUrl;
    }

    /**
     * ����jobProveUrl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobProveUrl(String value) {
        this.jobProveUrl = value;
    }

    /**
     * ��ȡjobs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobs() {
        return jobs;
    }

    /**
     * ����jobs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobs(String value) {
        this.jobs = value;
    }

    /**
     * ��ȡlast3List���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast3List() {
        return last3List;
    }

    /**
     * ����last3List���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast3List(String value) {
        this.last3List = value;
    }

    /**
     * ��ȡlastRepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastRepayAmt() {
        return lastRepayAmt;
    }

    /**
     * ����lastRepayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastRepayAmt(BigDecimal value) {
        this.lastRepayAmt = value;
    }

    /**
     * ��ȡlastUpDt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpDt() {
        return lastUpDt;
    }

    /**
     * ����lastUpDt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpDt(String value) {
        this.lastUpDt = value;
    }

    /**
     * ��ȡliveAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiveAddress() {
        return liveAddress;
    }

    /**
     * ����liveAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiveAddress(String value) {
        this.liveAddress = value;
    }

    /**
     * ��ȡlivePhone���Ե�ֵ��
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
     * ����livePhone���Ե�ֵ��
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
     * ��ȡlivePostcode���Ե�ֵ��
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
     * ����livePostcode���Ե�ֵ��
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
     * ��ȡliviingTeyp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiviingTeyp() {
        return liviingTeyp;
    }

    /**
     * ����liviingTeyp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiviingTeyp(String value) {
        this.liviingTeyp = value;
    }

    /**
     * ��ȡloanAmountOfMR���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmountOfMR() {
        return loanAmountOfMR;
    }

    /**
     * ����loanAmountOfMR���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmountOfMR(BigDecimal value) {
        this.loanAmountOfMR = value;
    }

    /**
     * ��ȡloanCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanCode() {
        return loanCode;
    }

    /**
     * ����loanCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanCode(String value) {
        this.loanCode = value;
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
     * ��ȡloanPurpose���Ե�ֵ��
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
     * ����loanPurpose���Ե�ֵ��
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
     * ��ȡloanPurposeOther���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurposeOther() {
        return loanPurposeOther;
    }

    /**
     * ����loanPurposeOther���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurposeOther(String value) {
        this.loanPurposeOther = value;
    }

    /**
     * ��ȡloanTarget���Ե�ֵ��
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
     * ����loanTarget���Ե�ֵ��
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
     * ��ȡloanType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * ����loanType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanType(String value) {
        this.loanType = value;
    }

    /**
     * ��ȡlocalResidence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalResidence() {
        return localResidence;
    }

    /**
     * ����localResidence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalResidence(String value) {
        this.localResidence = value;
    }

    /**
     * ��ȡlocalWorkExperience���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalWorkExperience() {
        return localWorkExperience;
    }

    /**
     * ����localWorkExperience���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalWorkExperience(String value) {
        this.localWorkExperience = value;
    }

    /**
     * Gets the value of the lonAttachs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lonAttachs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLonAttachs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonAttach }
     * 
     * 
     */
    public List<TLonAttach> getLonAttachs() {
        if (lonAttachs == null) {
            lonAttachs = new ArrayList<TLonAttach>();
        }
        return this.lonAttachs;
    }

    /**
     * Gets the value of the lonContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lonContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLonContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonContact }
     * 
     * 
     */
    public List<TLonContact> getLonContacts() {
        if (lonContacts == null) {
            lonContacts = new ArrayList<TLonContact>();
        }
        return this.lonContacts;
    }

    /**
     * Gets the value of the lonCreditReportList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lonCreditReportList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLonCreditReportList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonCreditReport }
     * 
     * 
     */
    public List<TLonCreditReport> getLonCreditReportList() {
        if (lonCreditReportList == null) {
            lonCreditReportList = new ArrayList<TLonCreditReport>();
        }
        return this.lonCreditReportList;
    }

    /**
     * Gets the value of the lonCredits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lonCredits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLonCredits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonCredit }
     * 
     * 
     */
    public List<TLonCredit> getLonCredits() {
        if (lonCredits == null) {
            lonCredits = new ArrayList<TLonCredit>();
        }
        return this.lonCredits;
    }

    /**
     * Gets the value of the lonNet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lonNet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLonNet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonNet }
     * 
     * 
     */
    public List<TLonNet> getLonNet() {
        if (lonNet == null) {
            lonNet = new ArrayList<TLonNet>();
        }
        return this.lonNet;
    }

    /**
     * Gets the value of the lonPawnLuxurys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lonPawnLuxurys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLonPawnLuxurys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonApplicationPawnLuxury }
     * 
     * 
     */
    public List<TLonApplicationPawnLuxury> getLonPawnLuxurys() {
        if (lonPawnLuxurys == null) {
            lonPawnLuxurys = new ArrayList<TLonApplicationPawnLuxury>();
        }
        return this.lonPawnLuxurys;
    }

    /**
     * Gets the value of the lonPawnOthers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lonPawnOthers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLonPawnOthers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonApplicationPawnOther }
     * 
     * 
     */
    public List<TLonApplicationPawnOther> getLonPawnOthers() {
        if (lonPawnOthers == null) {
            lonPawnOthers = new ArrayList<TLonApplicationPawnOther>();
        }
        return this.lonPawnOthers;
    }

    /**
     * Gets the value of the lonPawnPms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lonPawnPms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLonPawnPms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonApplicationPawnPm }
     * 
     * 
     */
    public List<TLonApplicationPawnPm> getLonPawnPms() {
        if (lonPawnPms == null) {
            lonPawnPms = new ArrayList<TLonApplicationPawnPm>();
        }
        return this.lonPawnPms;
    }

    /**
     * Gets the value of the lonPawnWatchs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lonPawnWatchs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLonPawnWatchs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonApplicationPawnWatch }
     * 
     * 
     */
    public List<TLonApplicationPawnWatch> getLonPawnWatchs() {
        if (lonPawnWatchs == null) {
            lonPawnWatchs = new ArrayList<TLonApplicationPawnWatch>();
        }
        return this.lonPawnWatchs;
    }

    /**
     * Gets the value of the lonPolicys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lonPolicys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLonPolicys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonPolicy }
     * 
     * 
     */
    public List<TLonPolicy> getLonPolicys() {
        if (lonPolicys == null) {
            lonPolicys = new ArrayList<TLonPolicy>();
        }
        return this.lonPolicys;
    }

    /**
     * ��ȡmanagerTimeLength���Ե�ֵ��
     * 
     */
    public int getManagerTimeLength() {
        return managerTimeLength;
    }

    /**
     * ����managerTimeLength���Ե�ֵ��
     * 
     */
    public void setManagerTimeLength(int value) {
        this.managerTimeLength = value;
    }

    /**
     * ��ȡmarry���Ե�ֵ��
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
     * ����marry���Ե�ֵ��
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
     * ��ȡmender���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMender() {
        return mender;
    }

    /**
     * ����mender���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMender(String value) {
        this.mender = value;
    }

    /**
     * ��ȡmonthBasicIncomeAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthBasicIncomeAmt() {
        return monthBasicIncomeAmt;
    }

    /**
     * ����monthBasicIncomeAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthBasicIncomeAmt(BigDecimal value) {
        this.monthBasicIncomeAmt = value;
    }

    /**
     * ��ȡmonthNetProfit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthNetProfit() {
        return monthNetProfit;
    }

    /**
     * ����monthNetProfit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthNetProfit(BigDecimal value) {
        this.monthNetProfit = value;
    }

    /**
     * ��ȡmonthOtherIncomeAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthOtherIncomeAmt() {
        return monthOtherIncomeAmt;
    }

    /**
     * ����monthOtherIncomeAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthOtherIncomeAmt(BigDecimal value) {
        this.monthOtherIncomeAmt = value;
    }

    /**
     * ��ȡmonthRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMonthRate() {
        return monthRate;
    }

    /**
     * ����monthRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMonthRate(Float value) {
        this.monthRate = value;
    }

    /**
     * ��ȡmonthRepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthRepayAmt() {
        return monthRepayAmt;
    }

    /**
     * ����monthRepayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthRepayAmt(BigDecimal value) {
        this.monthRepayAmt = value;
    }

    /**
     * ��ȡmonthRepayLimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthRepayLimit() {
        return monthRepayLimit;
    }

    /**
     * ����monthRepayLimit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthRepayLimit(BigDecimal value) {
        this.monthRepayLimit = value;
    }

    /**
     * ��ȡmortgagorAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgagorAccount() {
        return mortgagorAccount;
    }

    /**
     * ����mortgagorAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgagorAccount(String value) {
        this.mortgagorAccount = value;
    }

    /**
     * ��ȡmortgagorName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgagorName() {
        return mortgagorName;
    }

    /**
     * ����mortgagorName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgagorName(String value) {
        this.mortgagorName = value;
    }

    /**
     * ��ȡnation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNation() {
        return nation;
    }

    /**
     * ����nation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNation(String value) {
        this.nation = value;
    }

    /**
     * ��ȡoldAppId���Ե�ֵ��
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
     * ����oldAppId���Ե�ֵ��
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
     * ��ȡoldAssetOwner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldAssetOwner() {
        return oldAssetOwner;
    }

    /**
     * ����oldAssetOwner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldAssetOwner(String value) {
        this.oldAssetOwner = value;
    }

    /**
     * ��ȡoperationVerifyBackFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationVerifyBackFlag() {
        return operationVerifyBackFlag;
    }

    /**
     * ����operationVerifyBackFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationVerifyBackFlag(String value) {
        this.operationVerifyBackFlag = value;
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
     * ��ȡorganizationCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * ����organizationCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
    }

    /**
     * ��ȡoriginRatio���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOriginRatio() {
        return originRatio;
    }

    /**
     * ����originRatio���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOriginRatio(Float value) {
        this.originRatio = value;
    }

    /**
     * ��ȡotherIncomeAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherIncomeAmt() {
        return otherIncomeAmt;
    }

    /**
     * ����otherIncomeAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherIncomeAmt(BigDecimal value) {
        this.otherIncomeAmt = value;
    }

    /**
     * ��ȡoverDay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverDay() {
        return overDay;
    }

    /**
     * ����overDay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverDay(String value) {
        this.overDay = value;
    }

    /**
     * ��ȡoverDueLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverDueLevel() {
        return overDueLevel;
    }

    /**
     * ����overDueLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverDueLevel(String value) {
        this.overDueLevel = value;
    }

    /**
     * ��ȡpasture���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationPasture }
     *     
     */
    public TLonApplicationPasture getPasture() {
        return pasture;
    }

    /**
     * ����pasture���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationPasture }
     *     
     */
    public void setPasture(TLonApplicationPasture value) {
        this.pasture = value;
    }

    /**
     * ��ȡpawnCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPawnCategory() {
        return pawnCategory;
    }

    /**
     * ����pawnCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPawnCategory(String value) {
        this.pawnCategory = value;
    }

    /**
     * ��ȡpawnType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPawnType() {
        return pawnType;
    }

    /**
     * ����pawnType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPawnType(String value) {
        this.pawnType = value;
    }

    /**
     * ��ȡpayEarlyRepay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TRepEarlyRepay }
     *     
     */
    public TRepEarlyRepay getPayEarlyRepay() {
        return payEarlyRepay;
    }

    /**
     * ����payEarlyRepay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TRepEarlyRepay }
     *     
     */
    public void setPayEarlyRepay(TRepEarlyRepay value) {
        this.payEarlyRepay = value;
    }

    /**
     * Gets the value of the payMatchList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payMatchList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayMatchList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPayMatch }
     * 
     * 
     */
    public List<TPayMatch> getPayMatchList() {
        if (payMatchList == null) {
            payMatchList = new ArrayList<TPayMatch>();
        }
        return this.payMatchList;
    }

    /**
     * ��ȡpayOfferDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TPayOfferDetail }
     *     
     */
    public TPayOfferDetail getPayOfferDetail() {
        return payOfferDetail;
    }

    /**
     * ����payOfferDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TPayOfferDetail }
     *     
     */
    public void setPayOfferDetail(TPayOfferDetail value) {
        this.payOfferDetail = value;
    }

    /**
     * ��ȡpaymentType���Ե�ֵ��
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
     * ����paymentType���Ե�ֵ��
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
     * ��ȡpeopleLocal���Ե�ֵ��
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
     * ����peopleLocal���Ե�ֵ��
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
     * ��ȡpersonalAssetAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAssetAmt() {
        return personalAssetAmt;
    }

    /**
     * ����personalAssetAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAssetAmt(String value) {
        this.personalAssetAmt = value;
    }

    /**
     * ��ȡpersonalRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalRemark() {
        return personalRemark;
    }

    /**
     * ����personalRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalRemark(String value) {
        this.personalRemark = value;
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
     * ��ȡplanRepayDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanRepayDate() {
        return planRepayDate;
    }

    /**
     * ����planRepayDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanRepayDate(String value) {
        this.planRepayDate = value;
    }

    /**
     * ��ȡpostAddress���Ե�ֵ��
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
     * ����postAddress���Ե�ֵ��
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
     * ��ȡprior���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrior() {
        return prior;
    }

    /**
     * ����prior���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrior(String value) {
        this.prior = value;
    }

    /**
     * ��ȡprocessInstanceId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * ����processInstanceId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessInstanceId(String value) {
        this.processInstanceId = value;
    }

    /**
     * ��ȡprocessTempleteId���Ե�ֵ��
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
     * ����processTempleteId���Ե�ֵ��
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
     * Gets the value of the productGoldAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productGoldAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductGoldAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductGoldAccount }
     * 
     * 
     */
    public List<ProductGoldAccount> getProductGoldAccount() {
        if (productGoldAccount == null) {
            productGoldAccount = new ArrayList<ProductGoldAccount>();
        }
        return this.productGoldAccount;
    }

    /**
     * ��ȡproductId���Ե�ֵ��
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
     * ����productId���Ե�ֵ��
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
     * ��ȡproductName���Ե�ֵ��
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
     * ����productName���Ե�ֵ��
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
     * ��ȡproductTypeId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductTypeId() {
        return productTypeId;
    }

    /**
     * ����productTypeId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductTypeId(Integer value) {
        this.productTypeId = value;
    }

    /**
     * ��ȡpropertyRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyRemark() {
        return propertyRemark;
    }

    /**
     * ����propertyRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyRemark(String value) {
        this.propertyRemark = value;
    }

    /**
     * ��ȡpropertyType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * ����propertyType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
    }

    /**
     * ��ȡpunishAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPunishAmt() {
        return punishAmt;
    }

    /**
     * ����punishAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPunishAmt(BigDecimal value) {
        this.punishAmt = value;
    }

    /**
     * ��ȡpunishRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPunishRate() {
        return punishRate;
    }

    /**
     * ����punishRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPunishRate(Float value) {
        this.punishRate = value;
    }

    /**
     * ��ȡpunishType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunishType() {
        return punishType;
    }

    /**
     * ����punishType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunishType(String value) {
        this.punishType = value;
    }

    /**
     * ��ȡqq���Ե�ֵ��
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
     * ����qq���Ե�ֵ��
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
     * ��ȡreceiveBankCard���Ե�ֵ��
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
     * ����receiveBankCard���Ե�ֵ��
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
     * ��ȡreceiveBranch���Ե�ֵ��
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
     * ����receiveBranch���Ե�ֵ��
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
     * ��ȡreceiveCountry���Ե�ֵ��
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
     * ����receiveCountry���Ե�ֵ��
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
     * ��ȡreceiveName���Ե�ֵ��
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
     * ����receiveName���Ե�ֵ��
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
     * ��ȡreceiveProvince���Ե�ֵ��
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
     * ����receiveProvince���Ե�ֵ��
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
     * ��ȡrecentPrivateList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentPrivateList() {
        return recentPrivateList;
    }

    /**
     * ����recentPrivateList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentPrivateList(String value) {
        this.recentPrivateList = value;
    }

    /**
     * ��ȡrecentPublicList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentPublicList() {
        return recentPublicList;
    }

    /**
     * ����recentPublicList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentPublicList(String value) {
        this.recentPublicList = value;
    }

    /**
     * ��ȡrecordUrl���Ե�ֵ��
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
     * ����recordUrl���Ե�ֵ��
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
     * ��ȡreducePeriods���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReducePeriods() {
        return reducePeriods;
    }

    /**
     * ����reducePeriods���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReducePeriods(String value) {
        this.reducePeriods = value;
    }

    /**
     * ��ȡregistAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistAddress() {
        return registAddress;
    }

    /**
     * ����registAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistAddress(String value) {
        this.registAddress = value;
    }

    /**
     * ��ȡregistAddressCity���Ե�ֵ��
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
     * ����registAddressCity���Ե�ֵ��
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
     * ��ȡregistAddressDistrict���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistAddressDistrict() {
        return registAddressDistrict;
    }

    /**
     * ����registAddressDistrict���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistAddressDistrict(String value) {
        this.registAddressDistrict = value;
    }

    /**
     * ��ȡregistAddressProvince���Ե�ֵ��
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
     * ����registAddressProvince���Ե�ֵ��
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
     * ��ȡregistPostcode���Ե�ֵ��
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
     * ����registPostcode���Ե�ֵ��
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
     * ��ȡregistedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegistedTime() {
        return registedTime;
    }

    /**
     * ����registedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegistedTime(Integer value) {
        this.registedTime = value;
    }

    /**
     * ��ȡremainSumPrincipal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainSumPrincipal() {
        return remainSumPrincipal;
    }

    /**
     * ����remainSumPrincipal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainSumPrincipal(BigDecimal value) {
        this.remainSumPrincipal = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
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
     * ����remark���Ե�ֵ��
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
     * ��ȡrenewManager���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewManager() {
        return renewManager;
    }

    /**
     * ����renewManager���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewManager(String value) {
        this.renewManager = value;
    }

    /**
     * ��ȡrenewManagerId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewManagerId() {
        return renewManagerId;
    }

    /**
     * ����renewManagerId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewManagerId(String value) {
        this.renewManagerId = value;
    }

    /**
     * ��ȡrenewType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewType() {
        return renewType;
    }

    /**
     * ����renewType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewType(String value) {
        this.renewType = value;
    }

    /**
     * ��ȡrentHouseAgent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationRentHouseAgent }
     *     
     */
    public TLonApplicationRentHouseAgent getRentHouseAgent() {
        return rentHouseAgent;
    }

    /**
     * ����rentHouseAgent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationRentHouseAgent }
     *     
     */
    public void setRentHouseAgent(TLonApplicationRentHouseAgent value) {
        this.rentHouseAgent = value;
    }

    /**
     * ��ȡrentHouseCompany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationRentHouseCompany }
     *     
     */
    public TLonApplicationRentHouseCompany getRentHouseCompany() {
        return rentHouseCompany;
    }

    /**
     * ����rentHouseCompany���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationRentHouseCompany }
     *     
     */
    public void setRentHouseCompany(TLonApplicationRentHouseCompany value) {
        this.rentHouseCompany = value;
    }

    /**
     * ��ȡrentHouseOwner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationRentHouseOwner }
     *     
     */
    public TLonApplicationRentHouseOwner getRentHouseOwner() {
        return rentHouseOwner;
    }

    /**
     * ����rentHouseOwner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationRentHouseOwner }
     *     
     */
    public void setRentHouseOwner(TLonApplicationRentHouseOwner value) {
        this.rentHouseOwner = value;
    }

    /**
     * ��ȡrentHouseSchool���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationRentHouseSchool }
     *     
     */
    public TLonApplicationRentHouseSchool getRentHouseSchool() {
        return rentHouseSchool;
    }

    /**
     * ����rentHouseSchool���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationRentHouseSchool }
     *     
     */
    public void setRentHouseSchool(TLonApplicationRentHouseSchool value) {
        this.rentHouseSchool = value;
    }

    /**
     * ��ȡrentHouseTrade���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationRentHouseTrade }
     *     
     */
    public TLonApplicationRentHouseTrade getRentHouseTrade() {
        return rentHouseTrade;
    }

    /**
     * ����rentHouseTrade���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationRentHouseTrade }
     *     
     */
    public void setRentHouseTrade(TLonApplicationRentHouseTrade value) {
        this.rentHouseTrade = value;
    }

    /**
     * ��ȡrepayAccount���Ե�ֵ��
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
     * ����repayAccount���Ե�ֵ��
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
     * ��ȡrepayAccountName���Ե�ֵ��
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
     * ����repayAccountName���Ե�ֵ��
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
     * ��ȡrepayBranch���Ե�ֵ��
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
     * ����repayBranch���Ե�ֵ��
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
     * ��ȡrepayCardBindId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayCardBindId() {
        return repayCardBindId;
    }

    /**
     * ����repayCardBindId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayCardBindId(String value) {
        this.repayCardBindId = value;
    }

    /**
     * ��ȡrepayDay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepayDay() {
        return repayDay;
    }

    /**
     * ����repayDay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepayDay(Integer value) {
        this.repayDay = value;
    }

    /**
     * ��ȡrepayExceedManagerAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayExceedManagerAmt() {
        return repayExceedManagerAmt;
    }

    /**
     * ����repayExceedManagerAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayExceedManagerAmt(BigDecimal value) {
        this.repayExceedManagerAmt = value;
    }

    /**
     * ��ȡrepayName���Ե�ֵ��
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
     * ����repayName���Ե�ֵ��
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
     * ��ȡrepayPunishAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayPunishAmt() {
        return repayPunishAmt;
    }

    /**
     * ����repayPunishAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayPunishAmt(BigDecimal value) {
        this.repayPunishAmt = value;
    }

    /**
     * ��ȡrepayStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayStatus() {
        return repayStatus;
    }

    /**
     * ����repayStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayStatus(String value) {
        this.repayStatus = value;
    }

    /**
     * ��ȡrepaySumAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepaySumAmt() {
        return repaySumAmt;
    }

    /**
     * ����repaySumAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepaySumAmt(BigDecimal value) {
        this.repaySumAmt = value;
    }

    /**
     * ��ȡrepaySumPrincipal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepaySumPrincipal() {
        return repaySumPrincipal;
    }

    /**
     * ����repaySumPrincipal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepaySumPrincipal(BigDecimal value) {
        this.repaySumPrincipal = value;
    }

    /**
     * ��ȡrepayViolateAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayViolateAmt() {
        return repayViolateAmt;
    }

    /**
     * ����repayViolateAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayViolateAmt(BigDecimal value) {
        this.repayViolateAmt = value;
    }

    /**
     * ��ȡrepaymentInitiator���Ե�ֵ��
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
     * ����repaymentInitiator���Ե�ֵ��
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
     * ��ȡrequestDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDate() {
        return requestDate;
    }

    /**
     * ����requestDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDate(String value) {
        this.requestDate = value;
    }

    /**
     * ��ȡresideDate���Ե�ֵ��
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
     * ����resideDate���Ե�ֵ��
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
     * ��ȡreviewEndTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewEndTime() {
        return reviewEndTime;
    }

    /**
     * ����reviewEndTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewEndTime(String value) {
        this.reviewEndTime = value;
    }

    /**
     * ��ȡreviewUrl���Ե�ֵ��
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
     * ����reviewUrl���Ե�ֵ��
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
     * ��ȡriskAmt���Ե�ֵ��
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
     * ����riskAmt���Ե�ֵ��
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
     * ��ȡriskAmtRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRiskAmtRate() {
        return riskAmtRate;
    }

    /**
     * ����riskAmtRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRiskAmtRate(Float value) {
        this.riskAmtRate = value;
    }

    /**
     * ��ȡruleId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRuleId() {
        return ruleId;
    }

    /**
     * ����ruleId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRuleId(Integer value) {
        this.ruleId = value;
    }

    /**
     * ��ȡsalaryAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalaryAmt() {
        return salaryAmt;
    }

    /**
     * ����salaryAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalaryAmt(BigDecimal value) {
        this.salaryAmt = value;
    }

    /**
     * ��ȡsalaryDay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalaryDay() {
        return salaryDay;
    }

    /**
     * ����salaryDay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalaryDay(Integer value) {
        this.salaryDay = value;
    }

    /**
     * ��ȡsaleChannel���Ե�ֵ��
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
     * ����saleChannel���Ե�ֵ��
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
     * ��ȡschool���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool() {
        return school;
    }

    /**
     * ����school���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool(String value) {
        this.school = value;
    }

    /**
     * ��ȡscoreTempleteId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoreTempleteId() {
        return scoreTempleteId;
    }

    /**
     * ����scoreTempleteId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreTempleteId(Integer value) {
        this.scoreTempleteId = value;
    }

    /**
     * ��ȡsecondStageRepayAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondStageRepayAmt() {
        return secondStageRepayAmt;
    }

    /**
     * ����secondStageRepayAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondStageRepayAmt(BigDecimal value) {
        this.secondStageRepayAmt = value;
    }

    /**
     * ��ȡsendTime���Ե�ֵ��
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
     * ����sendTime���Ե�ֵ��
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
     * ��ȡserviceAmt���Ե�ֵ��
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
     * ����serviceAmt���Ե�ֵ��
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
     * ��ȡserviceFeeAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceFeeAmt() {
        return serviceFeeAmt;
    }

    /**
     * ����serviceFeeAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceFeeAmt(BigDecimal value) {
        this.serviceFeeAmt = value;
    }

    /**
     * ��ȡsignDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignDate() {
        return signDate;
    }

    /**
     * ����signDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignDate(String value) {
        this.signDate = value;
    }

    /**
     * ��ȡstopSignDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStopSignDays() {
        return stopSignDays;
    }

    /**
     * ����stopSignDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStopSignDays(Integer value) {
        this.stopSignDays = value;
    }

    /**
     * ��ȡstudentNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentNum() {
        return studentNum;
    }

    /**
     * ����studentNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentNum(String value) {
        this.studentNum = value;
    }

    /**
     * ��ȡsuggestRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestRemark() {
        return suggestRemark;
    }

    /**
     * ����suggestRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestRemark(String value) {
        this.suggestRemark = value;
    }

    /**
     * ��ȡsysApproveSuggestAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSysApproveSuggestAmt() {
        return sysApproveSuggestAmt;
    }

    /**
     * ����sysApproveSuggestAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSysApproveSuggestAmt(BigDecimal value) {
        this.sysApproveSuggestAmt = value;
    }

    /**
     * ��ȡtimeLimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeLimit() {
        return timeLimit;
    }

    /**
     * ����timeLimit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeLimit(Integer value) {
        this.timeLimit = value;
    }

    /**
     * ��ȡtoCityDate���Ե�ֵ��
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
     * ����toCityDate���Ե�ֵ��
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
     * ��ȡtransDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * ����transDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDate(String value) {
        this.transDate = value;
    }

    /**
     * ��ȡtransTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransTime() {
        return transTime;
    }

    /**
     * ����transTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransTime(String value) {
        this.transTime = value;
    }

    /**
     * ��ȡtransferChannel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransferChannel() {
        return transferChannel;
    }

    /**
     * ����transferChannel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransferChannel(Integer value) {
        this.transferChannel = value;
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
     * ��ȡupBackReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpBackReason() {
        return upBackReason;
    }

    /**
     * ����upBackReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpBackReason(String value) {
        this.upBackReason = value;
    }

    /**
     * ��ȡupBackReasonRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpBackReasonRemark() {
        return upBackReasonRemark;
    }

    /**
     * ����upBackReasonRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpBackReasonRemark(String value) {
        this.upBackReasonRemark = value;
    }

    /**
     * ��ȡupIntustry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpIntustry() {
        return upIntustry;
    }

    /**
     * ����upIntustry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpIntustry(String value) {
        this.upIntustry = value;
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
     * ��ȡviolateAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getViolateAmt() {
        return violateAmt;
    }

    /**
     * ����violateAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setViolateAmt(BigDecimal value) {
        this.violateAmt = value;
    }

    /**
     * ��ȡweiboNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeiboNum() {
        return weiboNum;
    }

    /**
     * ����weiboNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeiboNum(String value) {
        this.weiboNum = value;
    }

    /**
     * ��ȡweixinNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeixinNum() {
        return weixinNum;
    }

    /**
     * ����weixinNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeixinNum(String value) {
        this.weixinNum = value;
    }

    /**
     * ��ȡworkTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkTime() {
        return workTime;
    }

    /**
     * ����workTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkTime(Integer value) {
        this.workTime = value;
    }

    /**
     * ��ȡyearRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getYearRate() {
        return yearRate;
    }

    /**
     * ����yearRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setYearRate(Float value) {
        this.yearRate = value;
    }

    /**
     * ��ȡynhouseLoanOverdue���Ե�ֵ��
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
     * ����ynhouseLoanOverdue���Ե�ֵ��
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
     * ��ȡysxId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsxId() {
        return ysxId;
    }

    /**
     * ����ysxId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsxId(String value) {
        this.ysxId = value;
    }

    /**
     * ��ȡysxPzscId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getYsxPzscId() {
        return ysxPzscId;
    }

    /**
     * ����ysxPzscId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setYsxPzscId(Long value) {
        this.ysxPzscId = value;
    }

    /**
     * Gets the value of the ysxTransNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ysxTransNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYsxTransNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YsxTransNote }
     * 
     * 
     */
    public List<YsxTransNote> getYsxTransNote() {
        if (ysxTransNote == null) {
            ysxTransNote = new ArrayList<YsxTransNote>();
        }
        return this.ysxTransNote;
    }

    /**
     * ��ȡyxzcLoanResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TYxzcLoanResult }
     *     
     */
    public TYxzcLoanResult getYxzcLoanResult() {
        return yxzcLoanResult;
    }

    /**
     * ����yxzcLoanResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TYxzcLoanResult }
     *     
     */
    public void setYxzcLoanResult(TYxzcLoanResult value) {
        this.yxzcLoanResult = value;
    }

    /**
     * ��ȡzpswiftBatchNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZpswiftBatchNo() {
        return zpswiftBatchNo;
    }

    /**
     * ����zpswiftBatchNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZpswiftBatchNo(String value) {
        this.zpswiftBatchNo = value;
    }

    /**
     * ��ȡzpswiftId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZpswiftId() {
        return zpswiftId;
    }

    /**
     * ����zpswiftId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZpswiftId(String value) {
        this.zpswiftId = value;
    }

    /**
     * ��ȡeMail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * ����eMail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * ��ȡtChannelApproval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TChannelApproval }
     *     
     */
    public TChannelApproval getTChannelApproval() {
        return tChannelApproval;
    }

    /**
     * ����tChannelApproval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TChannelApproval }
     *     
     */
    public void setTChannelApproval(TChannelApproval value) {
        this.tChannelApproval = value;
    }

    /**
     * ��ȡtLoanFeeInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLoanFeeInfo }
     *     
     */
    public TLoanFeeInfo getTLoanFeeInfo() {
        return tLoanFeeInfo;
    }

    /**
     * ����tLoanFeeInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLoanFeeInfo }
     *     
     */
    public void setTLoanFeeInfo(TLoanFeeInfo value) {
        this.tLoanFeeInfo = value;
    }

    /**
     * Gets the value of the tLoanFeeInfolist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tLoanFeeInfolist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTLoanFeeInfolist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLoanFeeInfo }
     * 
     * 
     */
    public List<TLoanFeeInfo> getTLoanFeeInfolist() {
        if (tLoanFeeInfolist == null) {
            tLoanFeeInfolist = new ArrayList<TLoanFeeInfo>();
        }
        return this.tLoanFeeInfolist;
    }

    /**
     * ��ȡtLoanTransInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLoanTransInfo }
     *     
     */
    public TLoanTransInfo getTLoanTransInfo() {
        return tLoanTransInfo;
    }

    /**
     * ����tLoanTransInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLoanTransInfo }
     *     
     */
    public void setTLoanTransInfo(TLoanTransInfo value) {
        this.tLoanTransInfo = value;
    }

    /**
     * ��ȡtLonAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonAccount }
     *     
     */
    public TLonAccount getTLonAccount() {
        return tLonAccount;
    }

    /**
     * ����tLonAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonAccount }
     *     
     */
    public void setTLonAccount(TLonAccount value) {
        this.tLonAccount = value;
    }

    /**
     * Gets the value of the tLonAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tLonAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTLonAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonAccount }
     * 
     * 
     */
    public List<TLonAccount> getTLonAccounts() {
        if (tLonAccounts == null) {
            tLonAccounts = new ArrayList<TLonAccount>();
        }
        return this.tLonAccounts;
    }

    /**
     * Gets the value of the tLonApplicationCarTradeStock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tLonApplicationCarTradeStock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTLonApplicationCarTradeStock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLonApplicationCarTradeStock }
     * 
     * 
     */
    public List<TLonApplicationCarTradeStock> getTLonApplicationCarTradeStock() {
        if (tLonApplicationCarTradeStock == null) {
            tLonApplicationCarTradeStock = new ArrayList<TLonApplicationCarTradeStock>();
        }
        return this.tLonApplicationCarTradeStock;
    }

    /**
     * ��ȡtLonApplicationFodder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationFodder }
     *     
     */
    public TLonApplicationFodder getTLonApplicationFodder() {
        return tLonApplicationFodder;
    }

    /**
     * ����tLonApplicationFodder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationFodder }
     *     
     */
    public void setTLonApplicationFodder(TLonApplicationFodder value) {
        this.tLonApplicationFodder = value;
    }

    /**
     * ��ȡtLonApplicationPersonalRentalHouse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationPersonalRentalHouse }
     *     
     */
    public TLonApplicationPersonalRentalHouse getTLonApplicationPersonalRentalHouse() {
        return tLonApplicationPersonalRentalHouse;
    }

    /**
     * ����tLonApplicationPersonalRentalHouse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationPersonalRentalHouse }
     *     
     */
    public void setTLonApplicationPersonalRentalHouse(TLonApplicationPersonalRentalHouse value) {
        this.tLonApplicationPersonalRentalHouse = value;
    }

    /**
     * ��ȡtLonApplicationPurchase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationPurchase }
     *     
     */
    public TLonApplicationPurchase getTLonApplicationPurchase() {
        return tLonApplicationPurchase;
    }

    /**
     * ����tLonApplicationPurchase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationPurchase }
     *     
     */
    public void setTLonApplicationPurchase(TLonApplicationPurchase value) {
        this.tLonApplicationPurchase = value;
    }

    /**
     * ��ȡtLonCreditReport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonCreditReport }
     *     
     */
    public TLonCreditReport getTLonCreditReport() {
        return tLonCreditReport;
    }

    /**
     * ����tLonCreditReport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonCreditReport }
     *     
     */
    public void setTLonCreditReport(TLonCreditReport value) {
        this.tLonCreditReport = value;
    }

    /**
     * ��ȡtLonGuarantor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonGuarantor }
     *     
     */
    public TLonGuarantor getTLonGuarantor() {
        return tLonGuarantor;
    }

    /**
     * ����tLonGuarantor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonGuarantor }
     *     
     */
    public void setTLonGuarantor(TLonGuarantor value) {
        this.tLonGuarantor = value;
    }

    /**
     * ��ȡtLonLightningloanInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonLightningloanInfo }
     *     
     */
    public TLonLightningloanInfo getTLonLightningloanInfo() {
        return tLonLightningloanInfo;
    }

    /**
     * ����tLonLightningloanInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonLightningloanInfo }
     *     
     */
    public void setTLonLightningloanInfo(TLonLightningloanInfo value) {
        this.tLonLightningloanInfo = value;
    }

    /**
     * ��ȡtLonOldCar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonOldCar }
     *     
     */
    public TLonOldCar getTLonOldCar() {
        return tLonOldCar;
    }

    /**
     * ����tLonOldCar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonOldCar }
     *     
     */
    public void setTLonOldCar(TLonOldCar value) {
        this.tLonOldCar = value;
    }

    /**
     * ��ȡtLonParking���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonApplicationParking }
     *     
     */
    public TLonApplicationParking getTLonParking() {
        return tLonParking;
    }

    /**
     * ����tLonParking���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonApplicationParking }
     *     
     */
    public void setTLonParking(TLonApplicationParking value) {
        this.tLonParking = value;
    }

    /**
     * ��ȡtLonPawnerBalanceInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonPawnerBalanceInfo }
     *     
     */
    public TLonPawnerBalanceInfo getTLonPawnerBalanceInfo() {
        return tLonPawnerBalanceInfo;
    }

    /**
     * ����tLonPawnerBalanceInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonPawnerBalanceInfo }
     *     
     */
    public void setTLonPawnerBalanceInfo(TLonPawnerBalanceInfo value) {
        this.tLonPawnerBalanceInfo = value;
    }

    /**
     * ��ȡtLonPolicyApplication���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonPolicyApplication }
     *     
     */
    public TLonPolicyApplication getTLonPolicyApplication() {
        return tLonPolicyApplication;
    }

    /**
     * ����tLonPolicyApplication���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonPolicyApplication }
     *     
     */
    public void setTLonPolicyApplication(TLonPolicyApplication value) {
        this.tLonPolicyApplication = value;
    }

    /**
     * ��ȡtLonSocietyPolicy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TLonSocietyPolicy }
     *     
     */
    public TLonSocietyPolicy getTLonSocietyPolicy() {
        return tLonSocietyPolicy;
    }

    /**
     * ����tLonSocietyPolicy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TLonSocietyPolicy }
     *     
     */
    public void setTLonSocietyPolicy(TLonSocietyPolicy value) {
        this.tLonSocietyPolicy = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    public static class BusinessDataMap {

        protected List<Entry> entry;

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
         * {@link Entry }
         * 
         * 
         */
        public List<Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<Entry>();
            }
            return this.entry;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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

            protected Long key;
            protected Object value;

            /**
             * ��ȡkey���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getKey() {
                return key;
            }

            /**
             * ����key���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setKey(Long value) {
                this.key = value;
            }

            /**
             * ��ȡvalue���Ե�ֵ��
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
             * ����value���Ե�ֵ��
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

}
