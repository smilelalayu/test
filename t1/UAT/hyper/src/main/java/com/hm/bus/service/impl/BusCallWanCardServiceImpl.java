package com.hm.bus.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.doraemoney.core.utils.Base64;
import com.doraemoney.core.utils.SignUtil;
import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.util.HttpUtils;
import com.gep.util.PropertyUtils;
import com.hm.bus.dao.BusSentLogMapper;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.module.BusSentLog;
import com.hm.bus.service.BusCallWanCardService;
import com.hm.bus.service.BusSysErrorLogService;

@Service
public class BusCallWanCardServiceImpl extends BaseServiceImpl<Object, Long>
implements BusCallWanCardService{
	private static final Logger LOG = Logger
			.getLogger(BusCallWanCardServiceImpl.class);
	
	@Autowired
    private BusSentLogMapper busSentLogMapper;
	@Autowired
    private BusSysErrorLogService busSysErrorLogService;
	
    /**
     * 
     * 功能描述:调用万卡接口获取万卡额度系统模型编号
     * 
     */
	@Override
	public String callWanCardService(BusLnApp busLnApp) {
		LOG.info("[BusCallWanCardServiceImpl] callWanCardService method begin...");
		    BusSentLog sentLog = new BusSentLog(); 
		    sentLog.setLnAppId(busLnApp.getId());
	        sentLog.setBatchNo(busLnApp.getBatchNO());
		    String url = PropertyUtils.getConfig("bus","com.hm.bus.wancard.url");
		    String funCode = PropertyUtils.getConfig("bus","com.hm.bus.wancard.funcode");
		    String proId = PropertyUtils.getConfig("bus","com.hm.bus.wancard.proid");
		    String mobile = busLnApp.getMobile();
		    String certId = busLnApp.getCardId();
		   
		    String currentTime = System.currentTimeMillis()+"";//请求时间戳
		    
		    /**
             * 签名参数
             */
		    Map<String, String> signParam = new HashMap<String, String>();
            signParam.put("funCode", funCode);//功能码 PFC004
            signParam.put("mobile", Base64.encode(mobile.getBytes()));//手机号(加密传输)
            signParam.put("certId", Base64.encode(certId.getBytes()));//身份证号(加密传输)
            signParam.put("proId", proId);//cn4c86b26eb1b10a857db453125b1b10
            signParam.put("_t", currentTime);//请求时间戳
            
            /**
             * 接口入参
             */
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("funCode", funCode);
            params.put("mobile", Base64.encode(mobile.getBytes()));
            params.put("certId", Base64.encode(certId.getBytes()));
            params.put("proId", proId);
            params.put("_t", currentTime);
            params.put("sign", SignUtil.getSign(signParam, SignUtil.OPEN_SALT));
            signParam.put("sign", SignUtil.getSign(signParam, SignUtil.OPEN_SALT));
            
            
		    String jsonString = null;
		    String modelValue = null;
		    JSONObject  returnjson = null;
		    String status = null;
		    String message = null;
		    JSONObject data = null;
			try {
				LOG.info("[BusCallWanCardServiceImpl] callWanCardService method AppId："+busLnApp.getId()+",调用万卡额度查询接口参数："+signParam);
				jsonString = HttpUtils.URLPostResult(url, params, "UTF-8");
				LOG.info("[BusCallWanCardServiceImpl] callWanCardService method AppId："+busLnApp.getId()+",调用万卡额度查询接口返回："+jsonString);
				 
				returnjson = JSON.parseObject(jsonString);
				status = returnjson.get("status").toString();
				message = returnjson.get("message").toString();
				data = (JSONObject) returnjson.get("data");
				
				sentLog.setBusType("4");// 记录类型(1推bus,2放款确认,3生成还款计划,4调用额度系统查询)
			    sentLog.setUpdateTime(new Date());
			    sentLog.setRecordType("1");//1交易日志,2检查日志
			    sentLog.setReturnCode(status);
				sentLog.setErrorMsg(message);
				
				
				if(data != null  && StringUtils.isNotBlank(data.getString("modelValue"))){
					modelValue = (String)data.getString("modelValue");//万卡额度系统模型编号
					sentLog.setState("1");// 1.成功 2.失败
				}else{
					modelValue = "PU00001";//超能额度系统模型编号
			        sentLog.setState("2");// 1.成功 2.失败
				}
				busSentLogMapper.insert(sentLog);
			}  catch (Exception e) {
				LOG.error("[BusCallWanCardServiceUtils] callWanCardService method Exception: ", e);
				LOG.error("[BusCallWanCardServiceUtils] callWanCardService Exception:result="+jsonString);
				busSysErrorLogService.saveError("查询额度系统接口失败", e);
				modelValue = "PU00001";
			}
			LOG.info("[BusCallWanCardServiceImpl] callWanCardService method end...");
		    return modelValue;
	}
	

	
	
	@Override
	public BaseMapper<Object, Long> getMapper() {
		return getMapper();
	}
	

}