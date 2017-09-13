
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationProcess complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tLonApplicationProcess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="appointRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appointTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveBackReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveBackRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveCustManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveDistTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveDstRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="approveEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveRefuseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveSuggest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveSuggestAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="approveSuggestTimeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="auditDistTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auditEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auditId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auditRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auditStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auditSuggest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carSpecialRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carSpecialSuggest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkBackReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkCustManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkDistTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkRefuseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkSuggest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkSuggestAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="checkSuggestTimeLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colligateBackReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colligateCustManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colligateDistTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colligateDstRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="colligateEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colligateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colligateRefuseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colligateRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colligateStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colligateSuggest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colligateSuggestAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="colligateSuggestTimeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="customerInstCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerInstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerManagerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerServiceRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerServiceTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directCheckInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directCheckPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendCh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendDecimal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="extendDouble" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="extendFloat" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="extendInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="extendTime1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendTime2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendVc5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceCheckBackRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceCheckDistTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceCheckEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceCheckId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceCheckRefuseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceCheckRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceCheckStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceCheckSuggest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceRecognitionEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceRecognitionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceRecognitionIsException" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceRecognitionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceRecognitionStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceRecognitionVerifyResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="GPSsignalConfirm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantorFaceRecognitionIsException" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantorFaceRecognitionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guarantorFaceRecognitionVerifyResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="hasVideo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="proExtendCh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proExtendDecimal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="proExtendDouble" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="proExtendFloat" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="proExtendInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="proExtendTime1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proExtendTime2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proExtendVc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proExtendVc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proExtendVc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proExtendVc4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proExtendVc5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="qualityDistTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qualityEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qualityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qualityProblem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qualityRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qualityStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qualitySuggest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderApplyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderApplyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderCustManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderExpect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderLaunchRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderLaunchTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderRefuseRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderSuggest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderSuggestAtm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconsiderSuggestLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="reviewBackId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewBackTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewLendId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewLendTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reviewSuggest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videoAttach" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitFeedBack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitFinalBackReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitFinalDistTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitFinalEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitFinalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitFinalRefuseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitFinalRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitFinalStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitFinalSuggest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitKeywordId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="visitReportValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitStopId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitStopReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitStopTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLonApplicationProcess", propOrder = {
    "appId",
    "appointRemark",
    "appointTime",
    "approveBackReason",
    "approveBackRemark",
    "approveCustManager",
    "approveDistTime",
    "approveDstRate",
    "approveEndTime",
    "approveId",
    "approveRefuseReason",
    "approveRemark",
    "approveStartTime",
    "approveSuggest",
    "approveSuggestAmt",
    "approveSuggestTimeLimit",
    "auditDistTime",
    "auditEndTime",
    "auditId",
    "auditRemark",
    "auditStartTime",
    "auditSuggest",
    "carSpecialRemark",
    "carSpecialSuggest",
    "checkBackReason",
    "checkCustManager",
    "checkDistTime",
    "checkEndTime",
    "checkId",
    "checkRefuseReason",
    "checkRemark",
    "checkStartTime",
    "checkSuggest",
    "checkSuggestAmt",
    "checkSuggestTimeLimit",
    "colligateBackReason",
    "colligateCustManager",
    "colligateDistTime",
    "colligateDstRate",
    "colligateEndTime",
    "colligateId",
    "colligateRefuseReason",
    "colligateRemark",
    "colligateStartTime",
    "colligateSuggest",
    "colligateSuggestAmt",
    "colligateSuggestTimeLimit",
    "customerInstCode",
    "customerInstName",
    "customerManagerId",
    "customerManagerName",
    "customerServiceId",
    "customerServiceName",
    "customerServiceRemark",
    "customerServiceTime",
    "directCheckInst",
    "directCheckPerson",
    "extendCh",
    "extendDecimal",
    "extendDouble",
    "extendFloat",
    "extendInt",
    "extendTime1",
    "extendTime2",
    "extendVc1",
    "extendVc2",
    "extendVc3",
    "extendVc4",
    "extendVc5",
    "faceCheckBackRemark",
    "faceCheckDistTime",
    "faceCheckEndTime",
    "faceCheckId",
    "faceCheckRefuseReason",
    "faceCheckRemark",
    "faceCheckStartTime",
    "faceCheckSuggest",
    "faceRecognitionEndTime",
    "faceRecognitionId",
    "faceRecognitionIsException",
    "faceRecognitionMessage",
    "faceRecognitionStartTime",
    "faceRecognitionVerifyResult",
    "gpSsignalConfirm",
    "guarantorFaceRecognitionIsException",
    "guarantorFaceRecognitionMessage",
    "guarantorFaceRecognitionVerifyResult",
    "hasVideo",
    "proExtendCh",
    "proExtendDecimal",
    "proExtendDouble",
    "proExtendFloat",
    "proExtendInt",
    "proExtendTime1",
    "proExtendTime2",
    "proExtendVc1",
    "proExtendVc2",
    "proExtendVc3",
    "proExtendVc4",
    "proExtendVc5",
    "processId",
    "qualityDistTime",
    "qualityEndTime",
    "qualityId",
    "qualityProblem",
    "qualityRemark",
    "qualityStartTime",
    "qualitySuggest",
    "reconsiderApplyId",
    "reconsiderApplyTime",
    "reconsiderCustManager",
    "reconsiderEndTime",
    "reconsiderExpect",
    "reconsiderId",
    "reconsiderLaunchRemark",
    "reconsiderLaunchTime",
    "reconsiderRefuseRemark",
    "reconsiderRemark",
    "reconsiderRole",
    "reconsiderStartTime",
    "reconsiderSuggest",
    "reconsiderSuggestAtm",
    "reconsiderSuggestLimit",
    "reviewBackId",
    "reviewBackTime",
    "reviewEndTime",
    "reviewId",
    "reviewLendId",
    "reviewLendTime",
    "reviewRemark",
    "reviewStartTime",
    "reviewSuggest",
    "videoAttach",
    "visitFeedBack",
    "visitFinalBackReason",
    "visitFinalDistTime",
    "visitFinalEndTime",
    "visitFinalId",
    "visitFinalRefuseReason",
    "visitFinalRemark",
    "visitFinalStartTime",
    "visitFinalSuggest",
    "visitKeywordId",
    "visitReportValid",
    "visitStopId",
    "visitStopReason",
    "visitStopTime"
})
public class TLonApplicationProcess {

    protected Integer appId;
    protected String appointRemark;
    protected String appointTime;
    protected String approveBackReason;
    protected String approveBackRemark;
    protected String approveCustManager;
    protected String approveDistTime;
    protected Float approveDstRate;
    protected String approveEndTime;
    protected String approveId;
    protected String approveRefuseReason;
    protected String approveRemark;
    protected String approveStartTime;
    protected String approveSuggest;
    protected BigDecimal approveSuggestAmt;
    protected Integer approveSuggestTimeLimit;
    protected String auditDistTime;
    protected String auditEndTime;
    protected String auditId;
    protected String auditRemark;
    protected String auditStartTime;
    protected String auditSuggest;
    protected String carSpecialRemark;
    protected String carSpecialSuggest;
    protected String checkBackReason;
    protected String checkCustManager;
    protected String checkDistTime;
    protected String checkEndTime;
    protected String checkId;
    protected String checkRefuseReason;
    protected String checkRemark;
    protected String checkStartTime;
    protected String checkSuggest;
    protected BigDecimal checkSuggestAmt;
    protected String checkSuggestTimeLimit;
    protected String colligateBackReason;
    protected String colligateCustManager;
    protected String colligateDistTime;
    protected Float colligateDstRate;
    protected String colligateEndTime;
    protected String colligateId;
    protected String colligateRefuseReason;
    protected String colligateRemark;
    protected String colligateStartTime;
    protected String colligateSuggest;
    protected BigDecimal colligateSuggestAmt;
    protected Integer colligateSuggestTimeLimit;
    protected String customerInstCode;
    protected String customerInstName;
    protected String customerManagerId;
    protected String customerManagerName;
    protected String customerServiceId;
    protected String customerServiceName;
    protected String customerServiceRemark;
    protected String customerServiceTime;
    protected String directCheckInst;
    protected String directCheckPerson;
    protected String extendCh;
    protected BigDecimal extendDecimal;
    protected Double extendDouble;
    protected Float extendFloat;
    protected Integer extendInt;
    protected String extendTime1;
    protected String extendTime2;
    protected String extendVc1;
    protected String extendVc2;
    protected String extendVc3;
    protected String extendVc4;
    protected String extendVc5;
    protected String faceCheckBackRemark;
    protected String faceCheckDistTime;
    protected String faceCheckEndTime;
    protected String faceCheckId;
    protected String faceCheckRefuseReason;
    protected String faceCheckRemark;
    protected String faceCheckStartTime;
    protected String faceCheckSuggest;
    protected String faceRecognitionEndTime;
    protected String faceRecognitionId;
    protected String faceRecognitionIsException;
    protected String faceRecognitionMessage;
    protected String faceRecognitionStartTime;
    protected Double faceRecognitionVerifyResult;
    @XmlElement(name = "GPSsignalConfirm")
    protected String gpSsignalConfirm;
    protected String guarantorFaceRecognitionIsException;
    protected String guarantorFaceRecognitionMessage;
    protected Double guarantorFaceRecognitionVerifyResult;
    protected Integer hasVideo;
    protected String proExtendCh;
    protected BigDecimal proExtendDecimal;
    protected Double proExtendDouble;
    protected Float proExtendFloat;
    protected Integer proExtendInt;
    protected String proExtendTime1;
    protected String proExtendTime2;
    protected String proExtendVc1;
    protected String proExtendVc2;
    protected String proExtendVc3;
    protected String proExtendVc4;
    protected String proExtendVc5;
    protected Integer processId;
    protected String qualityDistTime;
    protected String qualityEndTime;
    protected String qualityId;
    protected String qualityProblem;
    protected String qualityRemark;
    protected String qualityStartTime;
    protected String qualitySuggest;
    protected String reconsiderApplyId;
    protected String reconsiderApplyTime;
    protected String reconsiderCustManager;
    protected String reconsiderEndTime;
    protected String reconsiderExpect;
    protected String reconsiderId;
    protected String reconsiderLaunchRemark;
    protected String reconsiderLaunchTime;
    protected String reconsiderRefuseRemark;
    protected String reconsiderRemark;
    protected String reconsiderRole;
    protected String reconsiderStartTime;
    protected String reconsiderSuggest;
    protected String reconsiderSuggestAtm;
    protected Integer reconsiderSuggestLimit;
    protected String reviewBackId;
    protected String reviewBackTime;
    protected String reviewEndTime;
    protected String reviewId;
    protected String reviewLendId;
    protected String reviewLendTime;
    protected String reviewRemark;
    protected String reviewStartTime;
    protected String reviewSuggest;
    protected String videoAttach;
    protected String visitFeedBack;
    protected String visitFinalBackReason;
    protected String visitFinalDistTime;
    protected String visitFinalEndTime;
    protected String visitFinalId;
    protected String visitFinalRefuseReason;
    protected String visitFinalRemark;
    protected String visitFinalStartTime;
    protected String visitFinalSuggest;
    protected Integer visitKeywordId;
    protected String visitReportValid;
    protected String visitStopId;
    protected String visitStopReason;
    protected String visitStopTime;

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
     * 获取appointRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointRemark() {
        return appointRemark;
    }

    /**
     * 设置appointRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointRemark(String value) {
        this.appointRemark = value;
    }

    /**
     * 获取appointTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointTime() {
        return appointTime;
    }

    /**
     * 设置appointTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointTime(String value) {
        this.appointTime = value;
    }

    /**
     * 获取approveBackReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveBackReason() {
        return approveBackReason;
    }

    /**
     * 设置approveBackReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveBackReason(String value) {
        this.approveBackReason = value;
    }

    /**
     * 获取approveBackRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveBackRemark() {
        return approveBackRemark;
    }

    /**
     * 设置approveBackRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveBackRemark(String value) {
        this.approveBackRemark = value;
    }

    /**
     * 获取approveCustManager属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveCustManager() {
        return approveCustManager;
    }

    /**
     * 设置approveCustManager属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveCustManager(String value) {
        this.approveCustManager = value;
    }

    /**
     * 获取approveDistTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveDistTime() {
        return approveDistTime;
    }

    /**
     * 设置approveDistTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveDistTime(String value) {
        this.approveDistTime = value;
    }

    /**
     * 获取approveDstRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getApproveDstRate() {
        return approveDstRate;
    }

    /**
     * 设置approveDstRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setApproveDstRate(Float value) {
        this.approveDstRate = value;
    }

    /**
     * 获取approveEndTime属性的值。
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
     * 设置approveEndTime属性的值。
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
     * 获取approveId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveId() {
        return approveId;
    }

    /**
     * 设置approveId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveId(String value) {
        this.approveId = value;
    }

    /**
     * 获取approveRefuseReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveRefuseReason() {
        return approveRefuseReason;
    }

    /**
     * 设置approveRefuseReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveRefuseReason(String value) {
        this.approveRefuseReason = value;
    }

    /**
     * 获取approveRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveRemark() {
        return approveRemark;
    }

    /**
     * 设置approveRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveRemark(String value) {
        this.approveRemark = value;
    }

    /**
     * 获取approveStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveStartTime() {
        return approveStartTime;
    }

    /**
     * 设置approveStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveStartTime(String value) {
        this.approveStartTime = value;
    }

    /**
     * 获取approveSuggest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveSuggest() {
        return approveSuggest;
    }

    /**
     * 设置approveSuggest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveSuggest(String value) {
        this.approveSuggest = value;
    }

    /**
     * 获取approveSuggestAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApproveSuggestAmt() {
        return approveSuggestAmt;
    }

    /**
     * 设置approveSuggestAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApproveSuggestAmt(BigDecimal value) {
        this.approveSuggestAmt = value;
    }

    /**
     * 获取approveSuggestTimeLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApproveSuggestTimeLimit() {
        return approveSuggestTimeLimit;
    }

    /**
     * 设置approveSuggestTimeLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApproveSuggestTimeLimit(Integer value) {
        this.approveSuggestTimeLimit = value;
    }

    /**
     * 获取auditDistTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditDistTime() {
        return auditDistTime;
    }

    /**
     * 设置auditDistTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditDistTime(String value) {
        this.auditDistTime = value;
    }

    /**
     * 获取auditEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditEndTime() {
        return auditEndTime;
    }

    /**
     * 设置auditEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditEndTime(String value) {
        this.auditEndTime = value;
    }

    /**
     * 获取auditId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditId() {
        return auditId;
    }

    /**
     * 设置auditId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditId(String value) {
        this.auditId = value;
    }

    /**
     * 获取auditRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditRemark() {
        return auditRemark;
    }

    /**
     * 设置auditRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditRemark(String value) {
        this.auditRemark = value;
    }

    /**
     * 获取auditStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditStartTime() {
        return auditStartTime;
    }

    /**
     * 设置auditStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditStartTime(String value) {
        this.auditStartTime = value;
    }

    /**
     * 获取auditSuggest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditSuggest() {
        return auditSuggest;
    }

    /**
     * 设置auditSuggest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditSuggest(String value) {
        this.auditSuggest = value;
    }

    /**
     * 获取carSpecialRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarSpecialRemark() {
        return carSpecialRemark;
    }

    /**
     * 设置carSpecialRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarSpecialRemark(String value) {
        this.carSpecialRemark = value;
    }

    /**
     * 获取carSpecialSuggest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarSpecialSuggest() {
        return carSpecialSuggest;
    }

    /**
     * 设置carSpecialSuggest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarSpecialSuggest(String value) {
        this.carSpecialSuggest = value;
    }

    /**
     * 获取checkBackReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckBackReason() {
        return checkBackReason;
    }

    /**
     * 设置checkBackReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckBackReason(String value) {
        this.checkBackReason = value;
    }

    /**
     * 获取checkCustManager属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckCustManager() {
        return checkCustManager;
    }

    /**
     * 设置checkCustManager属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckCustManager(String value) {
        this.checkCustManager = value;
    }

    /**
     * 获取checkDistTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckDistTime() {
        return checkDistTime;
    }

    /**
     * 设置checkDistTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckDistTime(String value) {
        this.checkDistTime = value;
    }

    /**
     * 获取checkEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckEndTime() {
        return checkEndTime;
    }

    /**
     * 设置checkEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckEndTime(String value) {
        this.checkEndTime = value;
    }

    /**
     * 获取checkId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckId() {
        return checkId;
    }

    /**
     * 设置checkId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckId(String value) {
        this.checkId = value;
    }

    /**
     * 获取checkRefuseReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckRefuseReason() {
        return checkRefuseReason;
    }

    /**
     * 设置checkRefuseReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckRefuseReason(String value) {
        this.checkRefuseReason = value;
    }

    /**
     * 获取checkRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckRemark() {
        return checkRemark;
    }

    /**
     * 设置checkRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckRemark(String value) {
        this.checkRemark = value;
    }

    /**
     * 获取checkStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStartTime() {
        return checkStartTime;
    }

    /**
     * 设置checkStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStartTime(String value) {
        this.checkStartTime = value;
    }

    /**
     * 获取checkSuggest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckSuggest() {
        return checkSuggest;
    }

    /**
     * 设置checkSuggest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckSuggest(String value) {
        this.checkSuggest = value;
    }

    /**
     * 获取checkSuggestAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckSuggestAmt() {
        return checkSuggestAmt;
    }

    /**
     * 设置checkSuggestAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheckSuggestAmt(BigDecimal value) {
        this.checkSuggestAmt = value;
    }

    /**
     * 获取checkSuggestTimeLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckSuggestTimeLimit() {
        return checkSuggestTimeLimit;
    }

    /**
     * 设置checkSuggestTimeLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckSuggestTimeLimit(String value) {
        this.checkSuggestTimeLimit = value;
    }

    /**
     * 获取colligateBackReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColligateBackReason() {
        return colligateBackReason;
    }

    /**
     * 设置colligateBackReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColligateBackReason(String value) {
        this.colligateBackReason = value;
    }

    /**
     * 获取colligateCustManager属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColligateCustManager() {
        return colligateCustManager;
    }

    /**
     * 设置colligateCustManager属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColligateCustManager(String value) {
        this.colligateCustManager = value;
    }

    /**
     * 获取colligateDistTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColligateDistTime() {
        return colligateDistTime;
    }

    /**
     * 设置colligateDistTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColligateDistTime(String value) {
        this.colligateDistTime = value;
    }

    /**
     * 获取colligateDstRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getColligateDstRate() {
        return colligateDstRate;
    }

    /**
     * 设置colligateDstRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setColligateDstRate(Float value) {
        this.colligateDstRate = value;
    }

    /**
     * 获取colligateEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColligateEndTime() {
        return colligateEndTime;
    }

    /**
     * 设置colligateEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColligateEndTime(String value) {
        this.colligateEndTime = value;
    }

    /**
     * 获取colligateId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColligateId() {
        return colligateId;
    }

    /**
     * 设置colligateId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColligateId(String value) {
        this.colligateId = value;
    }

    /**
     * 获取colligateRefuseReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColligateRefuseReason() {
        return colligateRefuseReason;
    }

    /**
     * 设置colligateRefuseReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColligateRefuseReason(String value) {
        this.colligateRefuseReason = value;
    }

    /**
     * 获取colligateRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColligateRemark() {
        return colligateRemark;
    }

    /**
     * 设置colligateRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColligateRemark(String value) {
        this.colligateRemark = value;
    }

    /**
     * 获取colligateStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColligateStartTime() {
        return colligateStartTime;
    }

    /**
     * 设置colligateStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColligateStartTime(String value) {
        this.colligateStartTime = value;
    }

    /**
     * 获取colligateSuggest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColligateSuggest() {
        return colligateSuggest;
    }

    /**
     * 设置colligateSuggest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColligateSuggest(String value) {
        this.colligateSuggest = value;
    }

    /**
     * 获取colligateSuggestAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getColligateSuggestAmt() {
        return colligateSuggestAmt;
    }

    /**
     * 设置colligateSuggestAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setColligateSuggestAmt(BigDecimal value) {
        this.colligateSuggestAmt = value;
    }

    /**
     * 获取colligateSuggestTimeLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColligateSuggestTimeLimit() {
        return colligateSuggestTimeLimit;
    }

    /**
     * 设置colligateSuggestTimeLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColligateSuggestTimeLimit(Integer value) {
        this.colligateSuggestTimeLimit = value;
    }

    /**
     * 获取customerInstCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerInstCode() {
        return customerInstCode;
    }

    /**
     * 设置customerInstCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerInstCode(String value) {
        this.customerInstCode = value;
    }

    /**
     * 获取customerInstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerInstName() {
        return customerInstName;
    }

    /**
     * 设置customerInstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerInstName(String value) {
        this.customerInstName = value;
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
     * 获取customerServiceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceId() {
        return customerServiceId;
    }

    /**
     * 设置customerServiceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceId(String value) {
        this.customerServiceId = value;
    }

    /**
     * 获取customerServiceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceName() {
        return customerServiceName;
    }

    /**
     * 设置customerServiceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceName(String value) {
        this.customerServiceName = value;
    }

    /**
     * 获取customerServiceRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceRemark() {
        return customerServiceRemark;
    }

    /**
     * 设置customerServiceRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceRemark(String value) {
        this.customerServiceRemark = value;
    }

    /**
     * 获取customerServiceTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceTime() {
        return customerServiceTime;
    }

    /**
     * 设置customerServiceTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceTime(String value) {
        this.customerServiceTime = value;
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
     * 获取extendCh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendCh() {
        return extendCh;
    }

    /**
     * 设置extendCh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendCh(String value) {
        this.extendCh = value;
    }

    /**
     * 获取extendDecimal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtendDecimal() {
        return extendDecimal;
    }

    /**
     * 设置extendDecimal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtendDecimal(BigDecimal value) {
        this.extendDecimal = value;
    }

    /**
     * 获取extendDouble属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExtendDouble() {
        return extendDouble;
    }

    /**
     * 设置extendDouble属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExtendDouble(Double value) {
        this.extendDouble = value;
    }

    /**
     * 获取extendFloat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExtendFloat() {
        return extendFloat;
    }

    /**
     * 设置extendFloat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExtendFloat(Float value) {
        this.extendFloat = value;
    }

    /**
     * 获取extendInt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtendInt() {
        return extendInt;
    }

    /**
     * 设置extendInt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtendInt(Integer value) {
        this.extendInt = value;
    }

    /**
     * 获取extendTime1属性的值。
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
     * 设置extendTime1属性的值。
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
     * 获取extendTime2属性的值。
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
     * 设置extendTime2属性的值。
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
     * 获取faceCheckBackRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceCheckBackRemark() {
        return faceCheckBackRemark;
    }

    /**
     * 设置faceCheckBackRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceCheckBackRemark(String value) {
        this.faceCheckBackRemark = value;
    }

    /**
     * 获取faceCheckDistTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceCheckDistTime() {
        return faceCheckDistTime;
    }

    /**
     * 设置faceCheckDistTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceCheckDistTime(String value) {
        this.faceCheckDistTime = value;
    }

    /**
     * 获取faceCheckEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceCheckEndTime() {
        return faceCheckEndTime;
    }

    /**
     * 设置faceCheckEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceCheckEndTime(String value) {
        this.faceCheckEndTime = value;
    }

    /**
     * 获取faceCheckId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceCheckId() {
        return faceCheckId;
    }

    /**
     * 设置faceCheckId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceCheckId(String value) {
        this.faceCheckId = value;
    }

    /**
     * 获取faceCheckRefuseReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceCheckRefuseReason() {
        return faceCheckRefuseReason;
    }

    /**
     * 设置faceCheckRefuseReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceCheckRefuseReason(String value) {
        this.faceCheckRefuseReason = value;
    }

    /**
     * 获取faceCheckRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceCheckRemark() {
        return faceCheckRemark;
    }

    /**
     * 设置faceCheckRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceCheckRemark(String value) {
        this.faceCheckRemark = value;
    }

    /**
     * 获取faceCheckStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceCheckStartTime() {
        return faceCheckStartTime;
    }

    /**
     * 设置faceCheckStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceCheckStartTime(String value) {
        this.faceCheckStartTime = value;
    }

    /**
     * 获取faceCheckSuggest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceCheckSuggest() {
        return faceCheckSuggest;
    }

    /**
     * 设置faceCheckSuggest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceCheckSuggest(String value) {
        this.faceCheckSuggest = value;
    }

    /**
     * 获取faceRecognitionEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceRecognitionEndTime() {
        return faceRecognitionEndTime;
    }

    /**
     * 设置faceRecognitionEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceRecognitionEndTime(String value) {
        this.faceRecognitionEndTime = value;
    }

    /**
     * 获取faceRecognitionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceRecognitionId() {
        return faceRecognitionId;
    }

    /**
     * 设置faceRecognitionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceRecognitionId(String value) {
        this.faceRecognitionId = value;
    }

    /**
     * 获取faceRecognitionIsException属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceRecognitionIsException() {
        return faceRecognitionIsException;
    }

    /**
     * 设置faceRecognitionIsException属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceRecognitionIsException(String value) {
        this.faceRecognitionIsException = value;
    }

    /**
     * 获取faceRecognitionMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceRecognitionMessage() {
        return faceRecognitionMessage;
    }

    /**
     * 设置faceRecognitionMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceRecognitionMessage(String value) {
        this.faceRecognitionMessage = value;
    }

    /**
     * 获取faceRecognitionStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceRecognitionStartTime() {
        return faceRecognitionStartTime;
    }

    /**
     * 设置faceRecognitionStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceRecognitionStartTime(String value) {
        this.faceRecognitionStartTime = value;
    }

    /**
     * 获取faceRecognitionVerifyResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFaceRecognitionVerifyResult() {
        return faceRecognitionVerifyResult;
    }

    /**
     * 设置faceRecognitionVerifyResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFaceRecognitionVerifyResult(Double value) {
        this.faceRecognitionVerifyResult = value;
    }

    /**
     * 获取gpSsignalConfirm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPSsignalConfirm() {
        return gpSsignalConfirm;
    }

    /**
     * 设置gpSsignalConfirm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPSsignalConfirm(String value) {
        this.gpSsignalConfirm = value;
    }

    /**
     * 获取guarantorFaceRecognitionIsException属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorFaceRecognitionIsException() {
        return guarantorFaceRecognitionIsException;
    }

    /**
     * 设置guarantorFaceRecognitionIsException属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorFaceRecognitionIsException(String value) {
        this.guarantorFaceRecognitionIsException = value;
    }

    /**
     * 获取guarantorFaceRecognitionMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorFaceRecognitionMessage() {
        return guarantorFaceRecognitionMessage;
    }

    /**
     * 设置guarantorFaceRecognitionMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorFaceRecognitionMessage(String value) {
        this.guarantorFaceRecognitionMessage = value;
    }

    /**
     * 获取guarantorFaceRecognitionVerifyResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGuarantorFaceRecognitionVerifyResult() {
        return guarantorFaceRecognitionVerifyResult;
    }

    /**
     * 设置guarantorFaceRecognitionVerifyResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGuarantorFaceRecognitionVerifyResult(Double value) {
        this.guarantorFaceRecognitionVerifyResult = value;
    }

    /**
     * 获取hasVideo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHasVideo() {
        return hasVideo;
    }

    /**
     * 设置hasVideo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHasVideo(Integer value) {
        this.hasVideo = value;
    }

    /**
     * 获取proExtendCh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProExtendCh() {
        return proExtendCh;
    }

    /**
     * 设置proExtendCh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProExtendCh(String value) {
        this.proExtendCh = value;
    }

    /**
     * 获取proExtendDecimal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProExtendDecimal() {
        return proExtendDecimal;
    }

    /**
     * 设置proExtendDecimal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProExtendDecimal(BigDecimal value) {
        this.proExtendDecimal = value;
    }

    /**
     * 获取proExtendDouble属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProExtendDouble() {
        return proExtendDouble;
    }

    /**
     * 设置proExtendDouble属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProExtendDouble(Double value) {
        this.proExtendDouble = value;
    }

    /**
     * 获取proExtendFloat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProExtendFloat() {
        return proExtendFloat;
    }

    /**
     * 设置proExtendFloat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProExtendFloat(Float value) {
        this.proExtendFloat = value;
    }

    /**
     * 获取proExtendInt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProExtendInt() {
        return proExtendInt;
    }

    /**
     * 设置proExtendInt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProExtendInt(Integer value) {
        this.proExtendInt = value;
    }

    /**
     * 获取proExtendTime1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProExtendTime1() {
        return proExtendTime1;
    }

    /**
     * 设置proExtendTime1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProExtendTime1(String value) {
        this.proExtendTime1 = value;
    }

    /**
     * 获取proExtendTime2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProExtendTime2() {
        return proExtendTime2;
    }

    /**
     * 设置proExtendTime2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProExtendTime2(String value) {
        this.proExtendTime2 = value;
    }

    /**
     * 获取proExtendVc1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProExtendVc1() {
        return proExtendVc1;
    }

    /**
     * 设置proExtendVc1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProExtendVc1(String value) {
        this.proExtendVc1 = value;
    }

    /**
     * 获取proExtendVc2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProExtendVc2() {
        return proExtendVc2;
    }

    /**
     * 设置proExtendVc2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProExtendVc2(String value) {
        this.proExtendVc2 = value;
    }

    /**
     * 获取proExtendVc3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProExtendVc3() {
        return proExtendVc3;
    }

    /**
     * 设置proExtendVc3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProExtendVc3(String value) {
        this.proExtendVc3 = value;
    }

    /**
     * 获取proExtendVc4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProExtendVc4() {
        return proExtendVc4;
    }

    /**
     * 设置proExtendVc4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProExtendVc4(String value) {
        this.proExtendVc4 = value;
    }

    /**
     * 获取proExtendVc5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProExtendVc5() {
        return proExtendVc5;
    }

    /**
     * 设置proExtendVc5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProExtendVc5(String value) {
        this.proExtendVc5 = value;
    }

    /**
     * 获取processId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessId() {
        return processId;
    }

    /**
     * 设置processId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessId(Integer value) {
        this.processId = value;
    }

    /**
     * 获取qualityDistTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityDistTime() {
        return qualityDistTime;
    }

    /**
     * 设置qualityDistTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityDistTime(String value) {
        this.qualityDistTime = value;
    }

    /**
     * 获取qualityEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityEndTime() {
        return qualityEndTime;
    }

    /**
     * 设置qualityEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityEndTime(String value) {
        this.qualityEndTime = value;
    }

    /**
     * 获取qualityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityId() {
        return qualityId;
    }

    /**
     * 设置qualityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityId(String value) {
        this.qualityId = value;
    }

    /**
     * 获取qualityProblem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityProblem() {
        return qualityProblem;
    }

    /**
     * 设置qualityProblem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityProblem(String value) {
        this.qualityProblem = value;
    }

    /**
     * 获取qualityRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityRemark() {
        return qualityRemark;
    }

    /**
     * 设置qualityRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityRemark(String value) {
        this.qualityRemark = value;
    }

    /**
     * 获取qualityStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityStartTime() {
        return qualityStartTime;
    }

    /**
     * 设置qualityStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityStartTime(String value) {
        this.qualityStartTime = value;
    }

    /**
     * 获取qualitySuggest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualitySuggest() {
        return qualitySuggest;
    }

    /**
     * 设置qualitySuggest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualitySuggest(String value) {
        this.qualitySuggest = value;
    }

    /**
     * 获取reconsiderApplyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderApplyId() {
        return reconsiderApplyId;
    }

    /**
     * 设置reconsiderApplyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderApplyId(String value) {
        this.reconsiderApplyId = value;
    }

    /**
     * 获取reconsiderApplyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderApplyTime() {
        return reconsiderApplyTime;
    }

    /**
     * 设置reconsiderApplyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderApplyTime(String value) {
        this.reconsiderApplyTime = value;
    }

    /**
     * 获取reconsiderCustManager属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderCustManager() {
        return reconsiderCustManager;
    }

    /**
     * 设置reconsiderCustManager属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderCustManager(String value) {
        this.reconsiderCustManager = value;
    }

    /**
     * 获取reconsiderEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderEndTime() {
        return reconsiderEndTime;
    }

    /**
     * 设置reconsiderEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderEndTime(String value) {
        this.reconsiderEndTime = value;
    }

    /**
     * 获取reconsiderExpect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderExpect() {
        return reconsiderExpect;
    }

    /**
     * 设置reconsiderExpect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderExpect(String value) {
        this.reconsiderExpect = value;
    }

    /**
     * 获取reconsiderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderId() {
        return reconsiderId;
    }

    /**
     * 设置reconsiderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderId(String value) {
        this.reconsiderId = value;
    }

    /**
     * 获取reconsiderLaunchRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderLaunchRemark() {
        return reconsiderLaunchRemark;
    }

    /**
     * 设置reconsiderLaunchRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderLaunchRemark(String value) {
        this.reconsiderLaunchRemark = value;
    }

    /**
     * 获取reconsiderLaunchTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderLaunchTime() {
        return reconsiderLaunchTime;
    }

    /**
     * 设置reconsiderLaunchTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderLaunchTime(String value) {
        this.reconsiderLaunchTime = value;
    }

    /**
     * 获取reconsiderRefuseRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderRefuseRemark() {
        return reconsiderRefuseRemark;
    }

    /**
     * 设置reconsiderRefuseRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderRefuseRemark(String value) {
        this.reconsiderRefuseRemark = value;
    }

    /**
     * 获取reconsiderRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderRemark() {
        return reconsiderRemark;
    }

    /**
     * 设置reconsiderRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderRemark(String value) {
        this.reconsiderRemark = value;
    }

    /**
     * 获取reconsiderRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderRole() {
        return reconsiderRole;
    }

    /**
     * 设置reconsiderRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderRole(String value) {
        this.reconsiderRole = value;
    }

    /**
     * 获取reconsiderStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderStartTime() {
        return reconsiderStartTime;
    }

    /**
     * 设置reconsiderStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderStartTime(String value) {
        this.reconsiderStartTime = value;
    }

    /**
     * 获取reconsiderSuggest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderSuggest() {
        return reconsiderSuggest;
    }

    /**
     * 设置reconsiderSuggest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderSuggest(String value) {
        this.reconsiderSuggest = value;
    }

    /**
     * 获取reconsiderSuggestAtm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconsiderSuggestAtm() {
        return reconsiderSuggestAtm;
    }

    /**
     * 设置reconsiderSuggestAtm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconsiderSuggestAtm(String value) {
        this.reconsiderSuggestAtm = value;
    }

    /**
     * 获取reconsiderSuggestLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReconsiderSuggestLimit() {
        return reconsiderSuggestLimit;
    }

    /**
     * 设置reconsiderSuggestLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReconsiderSuggestLimit(Integer value) {
        this.reconsiderSuggestLimit = value;
    }

    /**
     * 获取reviewBackId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewBackId() {
        return reviewBackId;
    }

    /**
     * 设置reviewBackId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewBackId(String value) {
        this.reviewBackId = value;
    }

    /**
     * 获取reviewBackTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewBackTime() {
        return reviewBackTime;
    }

    /**
     * 设置reviewBackTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewBackTime(String value) {
        this.reviewBackTime = value;
    }

    /**
     * 获取reviewEndTime属性的值。
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
     * 设置reviewEndTime属性的值。
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
     * 获取reviewId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewId() {
        return reviewId;
    }

    /**
     * 设置reviewId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewId(String value) {
        this.reviewId = value;
    }

    /**
     * 获取reviewLendId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewLendId() {
        return reviewLendId;
    }

    /**
     * 设置reviewLendId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewLendId(String value) {
        this.reviewLendId = value;
    }

    /**
     * 获取reviewLendTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewLendTime() {
        return reviewLendTime;
    }

    /**
     * 设置reviewLendTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewLendTime(String value) {
        this.reviewLendTime = value;
    }

    /**
     * 获取reviewRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewRemark() {
        return reviewRemark;
    }

    /**
     * 设置reviewRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewRemark(String value) {
        this.reviewRemark = value;
    }

    /**
     * 获取reviewStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewStartTime() {
        return reviewStartTime;
    }

    /**
     * 设置reviewStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewStartTime(String value) {
        this.reviewStartTime = value;
    }

    /**
     * 获取reviewSuggest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewSuggest() {
        return reviewSuggest;
    }

    /**
     * 设置reviewSuggest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewSuggest(String value) {
        this.reviewSuggest = value;
    }

    /**
     * 获取videoAttach属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoAttach() {
        return videoAttach;
    }

    /**
     * 设置videoAttach属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoAttach(String value) {
        this.videoAttach = value;
    }

    /**
     * 获取visitFeedBack属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitFeedBack() {
        return visitFeedBack;
    }

    /**
     * 设置visitFeedBack属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitFeedBack(String value) {
        this.visitFeedBack = value;
    }

    /**
     * 获取visitFinalBackReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitFinalBackReason() {
        return visitFinalBackReason;
    }

    /**
     * 设置visitFinalBackReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitFinalBackReason(String value) {
        this.visitFinalBackReason = value;
    }

    /**
     * 获取visitFinalDistTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitFinalDistTime() {
        return visitFinalDistTime;
    }

    /**
     * 设置visitFinalDistTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitFinalDistTime(String value) {
        this.visitFinalDistTime = value;
    }

    /**
     * 获取visitFinalEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitFinalEndTime() {
        return visitFinalEndTime;
    }

    /**
     * 设置visitFinalEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitFinalEndTime(String value) {
        this.visitFinalEndTime = value;
    }

    /**
     * 获取visitFinalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitFinalId() {
        return visitFinalId;
    }

    /**
     * 设置visitFinalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitFinalId(String value) {
        this.visitFinalId = value;
    }

    /**
     * 获取visitFinalRefuseReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitFinalRefuseReason() {
        return visitFinalRefuseReason;
    }

    /**
     * 设置visitFinalRefuseReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitFinalRefuseReason(String value) {
        this.visitFinalRefuseReason = value;
    }

    /**
     * 获取visitFinalRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitFinalRemark() {
        return visitFinalRemark;
    }

    /**
     * 设置visitFinalRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitFinalRemark(String value) {
        this.visitFinalRemark = value;
    }

    /**
     * 获取visitFinalStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitFinalStartTime() {
        return visitFinalStartTime;
    }

    /**
     * 设置visitFinalStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitFinalStartTime(String value) {
        this.visitFinalStartTime = value;
    }

    /**
     * 获取visitFinalSuggest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitFinalSuggest() {
        return visitFinalSuggest;
    }

    /**
     * 设置visitFinalSuggest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitFinalSuggest(String value) {
        this.visitFinalSuggest = value;
    }

    /**
     * 获取visitKeywordId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisitKeywordId() {
        return visitKeywordId;
    }

    /**
     * 设置visitKeywordId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisitKeywordId(Integer value) {
        this.visitKeywordId = value;
    }

    /**
     * 获取visitReportValid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitReportValid() {
        return visitReportValid;
    }

    /**
     * 设置visitReportValid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitReportValid(String value) {
        this.visitReportValid = value;
    }

    /**
     * 获取visitStopId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitStopId() {
        return visitStopId;
    }

    /**
     * 设置visitStopId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitStopId(String value) {
        this.visitStopId = value;
    }

    /**
     * 获取visitStopReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitStopReason() {
        return visitStopReason;
    }

    /**
     * 设置visitStopReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitStopReason(String value) {
        this.visitStopReason = value;
    }

    /**
     * 获取visitStopTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitStopTime() {
        return visitStopTime;
    }

    /**
     * 设置visitStopTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitStopTime(String value) {
        this.visitStopTime = value;
    }

}
