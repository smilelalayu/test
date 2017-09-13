package com.hm.appinfo.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gep.core.entity.Page;
import com.gep.core.util.InputChecker;
import com.gep.core.util.ObjectUtils;
import com.gep.util.PropertyUtils;
import com.hm.appinfo.model.LnApp;
import com.hm.appinfo.service.SCService;
import com.hm.sys.constants.SysConstants;
import com.sc.api.app.vo.LnAppSubsidiary;
import com.sc.api.app.vo.LnAppVo;
import com.sc.api.model.SCPage;
import com.sc.api.model.SCRequest;
import com.sc.api.model.SCRequestBody;
import com.sc.api.model.SCRequestHeader;
import com.sc.api.model.SCResult;
import com.sc.api.service.LnAppOperationService;

@Service
public class SCServiceImpl implements SCService {
	
	protected static Logger log = LoggerFactory.getLogger(SCServiceImpl.class);

	@Autowired
	private LnAppOperationService lnAppOperationService;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<com.sc.api.app.model.LnApp> queryLnApp(LnApp lnApp) {
		try {
			log.info("Start lnAppService queryLnApp Request ");
			SCResult<List<LnAppSubsidiary>> result = lnAppOperationService.queryLnApp(buidRequest(lnApp));
			log.info("End lnAppService queryLnApp Response {}",JSONObject.toJSONString(result.getHeader()));
			if (SysConstants.SC_RESP_CODE_SUCCESS.equals(result.getHeader().getCode())) {
				List<com.sc.api.app.model.LnApp> lnAppList = new ArrayList<>();
				List<LnAppSubsidiary> appList = result.getBody().getData();
				for(LnAppSubsidiary app : appList){
					lnAppList.add(app.getBaseInfo());
				}
				return lnAppList;
			}
		} catch (Exception e) {
			log.error("Error lnAppService.queryLnAppInfo", e);
		}
		return new ArrayList<>();
	}
	
	@Override
	public LnAppSubsidiary queryLnAppSubsidiaryInfo(Long appId,int subType){
		SCRequest request = new SCRequest();
		SCRequestHeader header = new SCRequestHeader();
		header.setChannelCode(PropertyUtils.getConfig(SysConstants.SC_CHANNEL_CODE));
		request.setHeader(header);
		SCRequestBody body = new SCRequestBody();
		body.setAppId(appId);
		body.put("subType", subType);
		request.setBody(body);
		try {
			log.info(">>>>>>>>>start lnAppService.queryLnAppSubsidiaryInfo<<<<<<<<{}",JSONObject.toJSONString(request));
			SCResult result =  lnAppOperationService.queryLnAppSubsidiaryInfo(request);
			log.info(">>>>>>>>>end lnAppService.queryLnAppSubsidiaryInfo<<<<<<<<{}",JSONObject.toJSONString(result.getHeader()));
			if(SysConstants.SC_RESP_CODE_SUCCESS.equals(result.getHeader().getCode())){
				List<LnAppSubsidiary> appList = result.getBody().getLnAppSubsidiarys();
				if(!InputChecker.isEmpty(appList)){
					return ObjectUtils.convertObject(appList);
				}
			}
		} catch (Exception e) {
			log.error(">>>>>>>>>error lnAppService.queryLnAppSubsidiaryInfo<<<<<{}",e.getMessage(),e);
		}
		return null;
	}

	/**
	 * 通用组装查询条件
	 * @param lnAppQuery
	 * @return
	 */
	private SCRequest buidRequest(LnApp lnApp){
		SCRequest request = new SCRequest();
		SCRequestHeader header = new SCRequestHeader();
		header.setChannelCode(PropertyUtils.getConfig(SysConstants.SC_CHANNEL_CODE));
		SCRequestBody body = new SCRequestBody();
		LnAppVo vo = new LnAppVo();
		if(!InputChecker.isEmpty(lnApp) && !InputChecker.isNull(lnApp.getId())){
			log.info("LnAppServiceImpl buidRequest id {}",lnApp.getId());
			vo.setId(lnApp.getId());
		}
		if(StringUtils.isNotBlank(lnApp.getAppState())){
			vo.setAppState(lnApp.getAppState());
		}
		body.put(SysConstants.SC_APPVO_NAME, vo);
		request.setHeader(header);
		request.setBody(body);
		log.info("LnAppServiceImpl buidRequest End {}",JSONObject.toJSONString(request));
		return request;
	}
	
	/**
	 *调用sc接口查询工单列表 
	 */
	public Page<LnApp> queryLnAppList(Page page){
		//调用sc接口
		try{
			log.info("Start lnAppService queryLnAppList Request ");
			SCResult result = lnAppOperationService.queryLnApp(buidRequestList(page));
			log.info("End lnAppService queryLnAppList Response {}",JSONObject.toJSONString(result.getHeader()));
			if (SysConstants.SC_RESP_CODE_SUCCESS.equals(result.getHeader().getCode())) {
				List<LnApp> lnAppList = new ArrayList<>();
				List<LnAppSubsidiary> appList = null;
				
				if(result.getBody() != null){
					appList = result.getBody().getLnAppSubsidiarys();
				}else{
					log.info("End lnAppService queryLnAppList entity is null,  Full Response {}",JSONObject.toJSONString(result));
				}
				
				if(appList != null){
					for(LnAppSubsidiary app : appList){
						LnApp templnapp = new LnApp();
						org.apache.commons.beanutils.PropertyUtils.copyProperties(templnapp, app.getBaseInfo());
						lnAppList.add(templnapp);
					}
				}
				org.apache.commons.beanutils.PropertyUtils.copyProperties(page,result.getHeader().getPage());
				page.setResult(lnAppList);
				return page;
			}
		}catch(Exception e){
			log.error(">>>>>>>>>error lnAppService.queryLnAppList<<<<<{}",e.getMessage(),e);
		}
		return page;
	}
	
	/**
	 * 工单列表通用组装参数
	 * @param lnApp
	 * @return
	 */
	private SCRequest buidRequestList(Page page) throws Exception{
		SCPage scpage = new SCPage();
		scpage.setPageNo(page.getPageNo());
		scpage.setPageSize(page.getPageSize());
		LnApp lnApp = (LnApp) page.getT();
		SCRequest request = new SCRequest();
		SCRequestHeader header = new SCRequestHeader();
		header.setChannelCode(PropertyUtils.getConfig(SysConstants.SC_CHANNEL_CODE));
		header.setPage(scpage);
		SCRequestBody body = new SCRequestBody();
		LnAppVo vo = new LnAppVo();
		if(!InputChecker.isEmpty(lnApp) && !InputChecker.isNull(lnApp.getId())){
			log.info("LnAppServiceImpl buidRequestList id {}",lnApp.getId());
			vo.setId(lnApp.getId());
		}
		if(StringUtils.isNotBlank(lnApp.getAppState())){
			vo.setAppState(lnApp.getAppState());
		}
		if(StringUtils.isNotBlank(lnApp.getCustomerName())){
			vo.setCustomerName(lnApp.getCustomerName());
		}
		if(StringUtils.isNotBlank(lnApp.getCardId())){
			vo.setCardId(lnApp.getCardId());
		}
		if(StringUtils.isNotBlank(lnApp.getIsSendWk())){
			vo.setIsSendWk(lnApp.getIsSendWk());
		}
		if(StringUtils.isNotBlank(lnApp.getLoanType())){
			vo.setLoanType(lnApp.getLoanType());
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(StringUtils.isNotBlank(lnApp.getStartTime())){
			vo.setWoBuildStartTime(sdf.parse(lnApp.getStartTime()+" 00:00:00"));
		}
		if(StringUtils.isNotBlank(lnApp.getEndTime())){
			vo.setWoBuildEndTime(sdf.parse(lnApp.getEndTime()+" 23:59:59"));
		}
		body.put(SysConstants.SC_APPVO_NAME, vo);
		request.setHeader(header);
		request.setBody(body);
		log.info("LnAppServiceImpl buidRequest End {}",JSONObject.toJSONString(request));
		return request;
	}
		
}
