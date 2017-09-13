package com.hm.bus.service.impl;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.util.PropertyUtils;
import com.hm.bus.dao.BusSentLogMapper;
import com.hm.bus.dao.LnAppContractInfoMapper;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.module.BusSentLog;
import com.hm.bus.module.LnAppContractInfo;
import com.hm.bus.service.BusCallQuotaService;
import com.hm.bus.service.BusSysErrorLogService;
import com.hm.bus.util.StringUtil;
import com.sc.api.model.SCRequest;
import com.sc.api.model.SCResult;
import com.sc.api.model.SCResultHeader;
import com.sc.api.quota.model.LnAppQuotaInfo;
import com.sc.api.service.QuotaOperationService;

@Service
public class BusCallQuotaServiceImpl extends BaseServiceImpl<Object, Long> implements BusCallQuotaService {
	private static final Logger LOG = Logger.getLogger(BusCallQuotaServiceImpl.class);

	@Autowired
	private BusSentLogMapper busSentLogMapper;
	@Autowired
	private BusSysErrorLogService busSysErrorLogService;
	@Autowired
	private LnAppContractInfoMapper lnAppContractInfoMapper;
	@Autowired
	private QuotaOperationService quotaOperationService;

	/**
	 * 
	 * 触发sc圈存额度接口功能
	 * 
	 */
	@Override
	public Boolean callQuotaService(BusLnApp busLnApp) {
		LOG.info("[BusCallQuotaServiceImpl] callQuotaService method begin...");
		Boolean scquotaValue = false;//设置返回值
		BusSentLog sentLog = new BusSentLog();
		sentLog.setLnAppId(busLnApp.getId());
		sentLog.setBatchNo(busLnApp.getBatchNO());
		//首先判断此工单是否已经圈存额度
		String quotaOperationStatus = busLnApp.getQuotaOperationStatus();
		LOG.info("[BusCallQuotaServiceImpl] callQuotaService method 工单：" + busLnApp.getId() + "工单表里面的初始圈存额度状态是：" + quotaOperationStatus);
		if (!StringUtil.isNotNull(quotaOperationStatus) && "T".equals(quotaOperationStatus)) {
			scquotaValue = true;
		}else{
			// 创建工单额度信息对象
			LnAppQuotaInfo quota = new LnAppQuotaInfo();
			quota.setAppId(busLnApp.getId());// 设置工单号
			quota.setCardId(busLnApp.getCardId());// 设置身份证号
			quota.setLoanType(busLnApp.getLoanType());// 设置贷款类型
			LnAppContractInfo lnAppContractInfo = new LnAppContractInfo();
			lnAppContractInfo.setAppId(busLnApp.getId());
			BigDecimal contractAmt = new BigDecimal("0.00");
			List<LnAppContractInfo> lnAppContractInfoList = lnAppContractInfoMapper.list(lnAppContractInfo);
			if (lnAppContractInfoList != null && lnAppContractInfoList.size() > 0) {
				contractAmt = lnAppContractInfoList.get(0).getContractAmt(); // 合同金额
			}
			
			quota.setFrozenQuota(contractAmt);// 设置圈存额度（合同金额）
			
			try {
				LOG.info("[BusCallQuotaServiceImpl] callQuotaService method AppId：" + busLnApp.getId() + ",调用sc圈存额度查询接口参数：" + "身份证：" + quota.getCardId() + "贷款类型：" + quota.getLoanType() + "圈存额度："
						+ quota.getFrozenQuota());
				SCRequest screquest = new SCRequest();
				String channelCode4SC = PropertyUtils.getConfig("bus", "com.hm.bus.scquota.channelCode");
				screquest.getHeader().setChannelCode(channelCode4SC);// 设置渠道号
				screquest.getBody().put("quota", quota);// 设置参数
				SCResult scResult = quotaOperationService.freeze(screquest);
				SCResultHeader header = scResult.getHeader();
				String scResultCode = header.getCode();// 返回码
				String scResultCodeDesc = header.getCodeDesc();// 返回码描述
				String scResultMsg = header.getMsg();// 返回信息
				LOG.info("[BusCallQuotaServiceImpl] callQuotaService method AppId：" + busLnApp.getId() + ",调用sc圈存额度查询接口返回码：" + scResultCode + "=======》返回码信息：" + scResultMsg + "返回码描述：" + scResultCodeDesc);

				// 记1条调用sc圈存额度日志
				sentLog.setBusType("5");// 记录类型(1推bus,2放款确认,3生成还款计划,4调用额度系统查询,5调用sc圈存额度系统)
				sentLog.setUpdateTime(new Date());
				sentLog.setRecordType("1");// 1交易日志,2检查日志
				sentLog.setReturnCode(scResultCode);
				sentLog.setErrorMsg(scResultMsg);

				sentLog.setState("2");// 1.成功 2.失败
				if ("0000".equals(scResultCode)) {
					scquotaValue = true;// sc圈存额度系统调用成功
					sentLog.setState("1");// 1.成功 2.失败
				}
				busSentLogMapper.insert(sentLog);
			} catch (Exception e) {
				LOG.error("[BusCallQuotaServiceImpl] callQuotaService method Exception: ", e);
				busSysErrorLogService.saveError("查询SC额度系统接口失败", e);
				scquotaValue = false;
			}
		}
		
		
		
		
		
		
	
		LOG.info("[BusCallQuotaServiceImpl] callQuotaService method end...");
		return scquotaValue;
	}

	@Override
	public BaseMapper<Object, Long> getMapper() {
		return getMapper();
	}

}