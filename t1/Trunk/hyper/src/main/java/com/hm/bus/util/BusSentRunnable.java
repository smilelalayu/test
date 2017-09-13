package com.hm.bus.util;

import java.util.Map;

import com.eip.service.biz.bjbus.model.LoanConfirmReqDto;
import com.hm.bus.module.BusLnApp;

public class BusSentRunnable implements Runnable {

	Long appId = null;
	String LNAPP_QUERY_URL = "";
	Map<String, Object> paramMap = null;
	String RSQPRIVATEKEY = "";
	BusLnApp lnApp = null;
	String oldstatus = "";
	LoanConfirmReqDto  loanConfirmReq;

	public BusSentRunnable(Long appId, String LNAPP_QUERY_URL, Map<String, Object> paramMap, String RSQPRIVATEKEY, BusLnApp lnApp, String oldstatus, LoanConfirmReqDto  loanConfirmReq) {
		super();
		this.appId = appId;
		this.LNAPP_QUERY_URL = LNAPP_QUERY_URL;
		this.paramMap = paramMap;
		this.RSQPRIVATEKEY = RSQPRIVATEKEY;
		this.lnApp = lnApp;
		this.oldstatus = oldstatus;
		this.loanConfirmReq = loanConfirmReq;
	}

	@Override
	public void run() {

	}

	public String getLNAPP_QUERY_URL() {
		return LNAPP_QUERY_URL;
	}

	public void setLNAPP_QUERY_URL(String lNAPP_QUERY_URL) {
		LNAPP_QUERY_URL = lNAPP_QUERY_URL;
	}

	public Map<String, Object> getParamMap() {
		return paramMap;
	}

	public void setParamMap(Map<String, Object> paramMap) {
		this.paramMap = paramMap;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getRSQPRIVATEKEY() {
		return RSQPRIVATEKEY;
	}

	public void setRSQPRIVATEKEY(String rSQPRIVATEKEY) {
		RSQPRIVATEKEY = rSQPRIVATEKEY;
	}

	public BusLnApp getLnApp() {
		return lnApp;
	}

	public void setLnApp(BusLnApp lnApp) {
		this.lnApp = lnApp;
	}

	public String getOldstatus() {
		return oldstatus;
	}

	public void setOldstatus(String oldstatus) {
		this.oldstatus = oldstatus;
	}

	public LoanConfirmReqDto getLoanConfirmReq() {
		return loanConfirmReq;
	}
	
	
	
}
