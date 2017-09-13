
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tLonApplicationProcess complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡappointRemark���Ե�ֵ��
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
     * ����appointRemark���Ե�ֵ��
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
     * ��ȡappointTime���Ե�ֵ��
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
     * ����appointTime���Ե�ֵ��
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
     * ��ȡapproveBackReason���Ե�ֵ��
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
     * ����approveBackReason���Ե�ֵ��
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
     * ��ȡapproveBackRemark���Ե�ֵ��
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
     * ����approveBackRemark���Ե�ֵ��
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
     * ��ȡapproveCustManager���Ե�ֵ��
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
     * ����approveCustManager���Ե�ֵ��
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
     * ��ȡapproveDistTime���Ե�ֵ��
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
     * ����approveDistTime���Ե�ֵ��
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
     * ��ȡapproveDstRate���Ե�ֵ��
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
     * ����approveDstRate���Ե�ֵ��
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
     * ��ȡapproveId���Ե�ֵ��
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
     * ����approveId���Ե�ֵ��
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
     * ��ȡapproveRefuseReason���Ե�ֵ��
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
     * ����approveRefuseReason���Ե�ֵ��
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
     * ��ȡapproveRemark���Ե�ֵ��
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
     * ����approveRemark���Ե�ֵ��
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
     * ��ȡapproveStartTime���Ե�ֵ��
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
     * ����approveStartTime���Ե�ֵ��
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
     * ��ȡapproveSuggest���Ե�ֵ��
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
     * ����approveSuggest���Ե�ֵ��
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
     * ��ȡapproveSuggestAmt���Ե�ֵ��
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
     * ����approveSuggestAmt���Ե�ֵ��
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
     * ��ȡapproveSuggestTimeLimit���Ե�ֵ��
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
     * ����approveSuggestTimeLimit���Ե�ֵ��
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
     * ��ȡauditDistTime���Ե�ֵ��
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
     * ����auditDistTime���Ե�ֵ��
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
     * ��ȡauditEndTime���Ե�ֵ��
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
     * ����auditEndTime���Ե�ֵ��
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
     * ��ȡauditId���Ե�ֵ��
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
     * ����auditId���Ե�ֵ��
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
     * ��ȡauditRemark���Ե�ֵ��
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
     * ����auditRemark���Ե�ֵ��
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
     * ��ȡauditStartTime���Ե�ֵ��
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
     * ����auditStartTime���Ե�ֵ��
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
     * ��ȡauditSuggest���Ե�ֵ��
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
     * ����auditSuggest���Ե�ֵ��
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
     * ��ȡcarSpecialRemark���Ե�ֵ��
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
     * ����carSpecialRemark���Ե�ֵ��
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
     * ��ȡcarSpecialSuggest���Ե�ֵ��
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
     * ����carSpecialSuggest���Ե�ֵ��
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
     * ��ȡcheckBackReason���Ե�ֵ��
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
     * ����checkBackReason���Ե�ֵ��
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
     * ��ȡcheckCustManager���Ե�ֵ��
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
     * ����checkCustManager���Ե�ֵ��
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
     * ��ȡcheckDistTime���Ե�ֵ��
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
     * ����checkDistTime���Ե�ֵ��
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
     * ��ȡcheckEndTime���Ե�ֵ��
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
     * ����checkEndTime���Ե�ֵ��
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
     * ��ȡcheckId���Ե�ֵ��
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
     * ����checkId���Ե�ֵ��
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
     * ��ȡcheckRefuseReason���Ե�ֵ��
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
     * ����checkRefuseReason���Ե�ֵ��
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
     * ��ȡcheckRemark���Ե�ֵ��
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
     * ����checkRemark���Ե�ֵ��
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
     * ��ȡcheckStartTime���Ե�ֵ��
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
     * ����checkStartTime���Ե�ֵ��
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
     * ��ȡcheckSuggest���Ե�ֵ��
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
     * ����checkSuggest���Ե�ֵ��
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
     * ��ȡcheckSuggestAmt���Ե�ֵ��
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
     * ����checkSuggestAmt���Ե�ֵ��
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
     * ��ȡcheckSuggestTimeLimit���Ե�ֵ��
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
     * ����checkSuggestTimeLimit���Ե�ֵ��
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
     * ��ȡcolligateBackReason���Ե�ֵ��
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
     * ����colligateBackReason���Ե�ֵ��
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
     * ��ȡcolligateCustManager���Ե�ֵ��
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
     * ����colligateCustManager���Ե�ֵ��
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
     * ��ȡcolligateDistTime���Ե�ֵ��
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
     * ����colligateDistTime���Ե�ֵ��
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
     * ��ȡcolligateDstRate���Ե�ֵ��
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
     * ����colligateDstRate���Ե�ֵ��
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
     * ��ȡcolligateEndTime���Ե�ֵ��
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
     * ����colligateEndTime���Ե�ֵ��
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
     * ��ȡcolligateId���Ե�ֵ��
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
     * ����colligateId���Ե�ֵ��
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
     * ��ȡcolligateRefuseReason���Ե�ֵ��
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
     * ����colligateRefuseReason���Ե�ֵ��
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
     * ��ȡcolligateRemark���Ե�ֵ��
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
     * ����colligateRemark���Ե�ֵ��
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
     * ��ȡcolligateStartTime���Ե�ֵ��
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
     * ����colligateStartTime���Ե�ֵ��
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
     * ��ȡcolligateSuggest���Ե�ֵ��
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
     * ����colligateSuggest���Ե�ֵ��
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
     * ��ȡcolligateSuggestAmt���Ե�ֵ��
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
     * ����colligateSuggestAmt���Ե�ֵ��
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
     * ��ȡcolligateSuggestTimeLimit���Ե�ֵ��
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
     * ����colligateSuggestTimeLimit���Ե�ֵ��
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
     * ��ȡcustomerInstCode���Ե�ֵ��
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
     * ����customerInstCode���Ե�ֵ��
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
     * ��ȡcustomerInstName���Ե�ֵ��
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
     * ����customerInstName���Ե�ֵ��
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
     * ��ȡcustomerManagerId���Ե�ֵ��
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
     * ����customerManagerId���Ե�ֵ��
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
     * ��ȡcustomerManagerName���Ե�ֵ��
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
     * ����customerManagerName���Ե�ֵ��
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
     * ��ȡcustomerServiceId���Ե�ֵ��
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
     * ����customerServiceId���Ե�ֵ��
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
     * ��ȡcustomerServiceName���Ե�ֵ��
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
     * ����customerServiceName���Ե�ֵ��
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
     * ��ȡcustomerServiceRemark���Ե�ֵ��
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
     * ����customerServiceRemark���Ե�ֵ��
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
     * ��ȡcustomerServiceTime���Ե�ֵ��
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
     * ����customerServiceTime���Ե�ֵ��
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
     * ��ȡdirectCheckInst���Ե�ֵ��
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
     * ����directCheckInst���Ե�ֵ��
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
     * ��ȡdirectCheckPerson���Ե�ֵ��
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
     * ����directCheckPerson���Ե�ֵ��
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
     * ��ȡextendCh���Ե�ֵ��
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
     * ����extendCh���Ե�ֵ��
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
     * ��ȡextendDecimal���Ե�ֵ��
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
     * ����extendDecimal���Ե�ֵ��
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
     * ��ȡextendDouble���Ե�ֵ��
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
     * ����extendDouble���Ե�ֵ��
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
     * ��ȡextendFloat���Ե�ֵ��
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
     * ����extendFloat���Ե�ֵ��
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
     * ��ȡextendInt���Ե�ֵ��
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
     * ����extendInt���Ե�ֵ��
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
     * ��ȡfaceCheckBackRemark���Ե�ֵ��
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
     * ����faceCheckBackRemark���Ե�ֵ��
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
     * ��ȡfaceCheckDistTime���Ե�ֵ��
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
     * ����faceCheckDistTime���Ե�ֵ��
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
     * ��ȡfaceCheckEndTime���Ե�ֵ��
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
     * ����faceCheckEndTime���Ե�ֵ��
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
     * ��ȡfaceCheckId���Ե�ֵ��
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
     * ����faceCheckId���Ե�ֵ��
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
     * ��ȡfaceCheckRefuseReason���Ե�ֵ��
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
     * ����faceCheckRefuseReason���Ե�ֵ��
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
     * ��ȡfaceCheckRemark���Ե�ֵ��
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
     * ����faceCheckRemark���Ե�ֵ��
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
     * ��ȡfaceCheckStartTime���Ե�ֵ��
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
     * ����faceCheckStartTime���Ե�ֵ��
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
     * ��ȡfaceCheckSuggest���Ե�ֵ��
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
     * ����faceCheckSuggest���Ե�ֵ��
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
     * ��ȡfaceRecognitionEndTime���Ե�ֵ��
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
     * ����faceRecognitionEndTime���Ե�ֵ��
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
     * ��ȡfaceRecognitionId���Ե�ֵ��
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
     * ����faceRecognitionId���Ե�ֵ��
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
     * ��ȡfaceRecognitionIsException���Ե�ֵ��
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
     * ����faceRecognitionIsException���Ե�ֵ��
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
     * ��ȡfaceRecognitionMessage���Ե�ֵ��
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
     * ����faceRecognitionMessage���Ե�ֵ��
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
     * ��ȡfaceRecognitionStartTime���Ե�ֵ��
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
     * ����faceRecognitionStartTime���Ե�ֵ��
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
     * ��ȡfaceRecognitionVerifyResult���Ե�ֵ��
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
     * ����faceRecognitionVerifyResult���Ե�ֵ��
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
     * ��ȡgpSsignalConfirm���Ե�ֵ��
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
     * ����gpSsignalConfirm���Ե�ֵ��
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
     * ��ȡguarantorFaceRecognitionIsException���Ե�ֵ��
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
     * ����guarantorFaceRecognitionIsException���Ե�ֵ��
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
     * ��ȡguarantorFaceRecognitionMessage���Ե�ֵ��
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
     * ����guarantorFaceRecognitionMessage���Ե�ֵ��
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
     * ��ȡguarantorFaceRecognitionVerifyResult���Ե�ֵ��
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
     * ����guarantorFaceRecognitionVerifyResult���Ե�ֵ��
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
     * ��ȡhasVideo���Ե�ֵ��
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
     * ����hasVideo���Ե�ֵ��
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
     * ��ȡproExtendCh���Ե�ֵ��
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
     * ����proExtendCh���Ե�ֵ��
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
     * ��ȡproExtendDecimal���Ե�ֵ��
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
     * ����proExtendDecimal���Ե�ֵ��
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
     * ��ȡproExtendDouble���Ե�ֵ��
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
     * ����proExtendDouble���Ե�ֵ��
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
     * ��ȡproExtendFloat���Ե�ֵ��
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
     * ����proExtendFloat���Ե�ֵ��
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
     * ��ȡproExtendInt���Ե�ֵ��
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
     * ����proExtendInt���Ե�ֵ��
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
     * ��ȡproExtendTime1���Ե�ֵ��
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
     * ����proExtendTime1���Ե�ֵ��
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
     * ��ȡproExtendTime2���Ե�ֵ��
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
     * ����proExtendTime2���Ե�ֵ��
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
     * ��ȡproExtendVc1���Ե�ֵ��
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
     * ����proExtendVc1���Ե�ֵ��
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
     * ��ȡproExtendVc2���Ե�ֵ��
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
     * ����proExtendVc2���Ե�ֵ��
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
     * ��ȡproExtendVc3���Ե�ֵ��
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
     * ����proExtendVc3���Ե�ֵ��
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
     * ��ȡproExtendVc4���Ե�ֵ��
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
     * ����proExtendVc4���Ե�ֵ��
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
     * ��ȡproExtendVc5���Ե�ֵ��
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
     * ����proExtendVc5���Ե�ֵ��
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
     * ��ȡprocessId���Ե�ֵ��
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
     * ����processId���Ե�ֵ��
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
     * ��ȡqualityDistTime���Ե�ֵ��
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
     * ����qualityDistTime���Ե�ֵ��
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
     * ��ȡqualityEndTime���Ե�ֵ��
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
     * ����qualityEndTime���Ե�ֵ��
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
     * ��ȡqualityId���Ե�ֵ��
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
     * ����qualityId���Ե�ֵ��
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
     * ��ȡqualityProblem���Ե�ֵ��
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
     * ����qualityProblem���Ե�ֵ��
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
     * ��ȡqualityRemark���Ե�ֵ��
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
     * ����qualityRemark���Ե�ֵ��
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
     * ��ȡqualityStartTime���Ե�ֵ��
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
     * ����qualityStartTime���Ե�ֵ��
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
     * ��ȡqualitySuggest���Ե�ֵ��
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
     * ����qualitySuggest���Ե�ֵ��
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
     * ��ȡreconsiderApplyId���Ե�ֵ��
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
     * ����reconsiderApplyId���Ե�ֵ��
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
     * ��ȡreconsiderApplyTime���Ե�ֵ��
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
     * ����reconsiderApplyTime���Ե�ֵ��
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
     * ��ȡreconsiderCustManager���Ե�ֵ��
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
     * ����reconsiderCustManager���Ե�ֵ��
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
     * ��ȡreconsiderEndTime���Ե�ֵ��
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
     * ����reconsiderEndTime���Ե�ֵ��
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
     * ��ȡreconsiderExpect���Ե�ֵ��
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
     * ����reconsiderExpect���Ե�ֵ��
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
     * ��ȡreconsiderId���Ե�ֵ��
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
     * ����reconsiderId���Ե�ֵ��
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
     * ��ȡreconsiderLaunchRemark���Ե�ֵ��
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
     * ����reconsiderLaunchRemark���Ե�ֵ��
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
     * ��ȡreconsiderLaunchTime���Ե�ֵ��
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
     * ����reconsiderLaunchTime���Ե�ֵ��
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
     * ��ȡreconsiderRefuseRemark���Ե�ֵ��
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
     * ����reconsiderRefuseRemark���Ե�ֵ��
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
     * ��ȡreconsiderRemark���Ե�ֵ��
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
     * ����reconsiderRemark���Ե�ֵ��
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
     * ��ȡreconsiderRole���Ե�ֵ��
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
     * ����reconsiderRole���Ե�ֵ��
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
     * ��ȡreconsiderStartTime���Ե�ֵ��
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
     * ����reconsiderStartTime���Ե�ֵ��
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
     * ��ȡreconsiderSuggest���Ե�ֵ��
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
     * ����reconsiderSuggest���Ե�ֵ��
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
     * ��ȡreconsiderSuggestAtm���Ե�ֵ��
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
     * ����reconsiderSuggestAtm���Ե�ֵ��
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
     * ��ȡreconsiderSuggestLimit���Ե�ֵ��
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
     * ����reconsiderSuggestLimit���Ե�ֵ��
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
     * ��ȡreviewBackId���Ե�ֵ��
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
     * ����reviewBackId���Ե�ֵ��
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
     * ��ȡreviewBackTime���Ե�ֵ��
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
     * ����reviewBackTime���Ե�ֵ��
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
     * ��ȡreviewId���Ե�ֵ��
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
     * ����reviewId���Ե�ֵ��
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
     * ��ȡreviewLendId���Ե�ֵ��
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
     * ����reviewLendId���Ե�ֵ��
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
     * ��ȡreviewLendTime���Ե�ֵ��
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
     * ����reviewLendTime���Ե�ֵ��
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
     * ��ȡreviewRemark���Ե�ֵ��
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
     * ����reviewRemark���Ե�ֵ��
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
     * ��ȡreviewStartTime���Ե�ֵ��
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
     * ����reviewStartTime���Ե�ֵ��
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
     * ��ȡreviewSuggest���Ե�ֵ��
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
     * ����reviewSuggest���Ե�ֵ��
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
     * ��ȡvideoAttach���Ե�ֵ��
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
     * ����videoAttach���Ե�ֵ��
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
     * ��ȡvisitFeedBack���Ե�ֵ��
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
     * ����visitFeedBack���Ե�ֵ��
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
     * ��ȡvisitFinalBackReason���Ե�ֵ��
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
     * ����visitFinalBackReason���Ե�ֵ��
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
     * ��ȡvisitFinalDistTime���Ե�ֵ��
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
     * ����visitFinalDistTime���Ե�ֵ��
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
     * ��ȡvisitFinalEndTime���Ե�ֵ��
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
     * ����visitFinalEndTime���Ե�ֵ��
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
     * ��ȡvisitFinalId���Ե�ֵ��
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
     * ����visitFinalId���Ե�ֵ��
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
     * ��ȡvisitFinalRefuseReason���Ե�ֵ��
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
     * ����visitFinalRefuseReason���Ե�ֵ��
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
     * ��ȡvisitFinalRemark���Ե�ֵ��
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
     * ����visitFinalRemark���Ե�ֵ��
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
     * ��ȡvisitFinalStartTime���Ե�ֵ��
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
     * ����visitFinalStartTime���Ե�ֵ��
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
     * ��ȡvisitFinalSuggest���Ե�ֵ��
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
     * ����visitFinalSuggest���Ե�ֵ��
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
     * ��ȡvisitKeywordId���Ե�ֵ��
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
     * ����visitKeywordId���Ե�ֵ��
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
     * ��ȡvisitReportValid���Ե�ֵ��
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
     * ����visitReportValid���Ե�ֵ��
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
     * ��ȡvisitStopId���Ե�ֵ��
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
     * ����visitStopId���Ե�ֵ��
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
     * ��ȡvisitStopReason���Ե�ֵ��
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
     * ����visitStopReason���Ե�ֵ��
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
     * ��ȡvisitStopTime���Ե�ֵ��
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
     * ����visitStopTime���Ե�ֵ��
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
