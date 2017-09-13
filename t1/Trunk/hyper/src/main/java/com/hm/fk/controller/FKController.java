package com.hm.fk.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gep.core.base.BaseController;
import com.gep.core.entity.Result;
import com.gep.core.util.BeanUtils;
import com.gep.core.util.CollectionUtils;
import com.gep.core.util.InputChecker;
import com.gep.core.util.NetWorkUtils;
import com.gep.core.util.ObjectUtils;
import com.hm.appinfo.model.LnApp;
import com.hm.appinfo.service.LnAppService;
import com.hm.fk.service.FKService;
import com.hm.sys.constants.SysConstants;

/**
 * 迁移重发异常工单数据到风控系统
 * @author zhoukailiang
 * @createDate 2016年11月16日 下午4:38:47
 * @version 1.0
 * @description
 *
 */
@Controller
@RequestMapping("/fkHm")
public class FKController extends BaseController<LnApp> {
	
	@Autowired
	private FKService fKService;
	
	@Autowired
	private LnAppService lnAppService;

	
	@RequestMapping("reSendFk")
	public String reSendFK(HttpServletRequest request, ModelMap model, Long appId) {
		try{
			String loginName = getUserInfo().getLoginName();
			String clientIp = NetWorkUtils.getIpAddr(request);
			log.info("FKController reSendFk start appId={},loginName={},clientIp={}",appId,loginName,clientIp);
			if(InputChecker.isEmpty(appId)){
				return returnFail(model, "工单编号不能为空", "appinfo/appHM/list");
			}
			//根据工单ID调用 SC 工单表信息
			LnApp lnAppQuery = new LnApp();
			lnAppQuery.setId(appId);
			lnAppQuery.setAppState(SysConstants.LN_APP_STATE_11);
			List<com.sc.api.app.model.LnApp> lnAppList = lnAppService.queryLnAppSC(lnAppQuery);
			LnApp lnApp = new LnApp();
			if(CollectionUtils.isNotEmpty(lnAppList)){
				com.sc.api.app.model.LnApp lnAppSC = ObjectUtils.convertObject(lnAppList);
				BeanUtils.copyFields(lnAppSC, lnApp);
			}
			Result rs  = fKService.reSendFK(clientIp, appId ,loginName ,lnApp);
			if(rs.isSuccess()){
				return returnSuccess(model, rs.getMessage(), "appinfo/appHM/list");
			}
			return returnFail(model, rs.getMessage(), "appinfo/appHM/list");
			
		}catch(Exception e){
			log.error("FKController reSendFk Exception appId = {}", appId);
			log.error("FKController reSendFk Exception: ", e);
			return RETURN_FAIL;
		}finally {
			log.info("FKController reSendFk 结束进入重发异常工单到风控系统");
		}
	}
}
