package com.hm.service.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import com.gep.core.entity.Result;
import com.gep.core.util.BeanUtils;
import com.gep.core.util.DateUtils;
import com.gep.core.util.InputChecker;
import com.gep.core.util.RedisUtils;
import com.gep.util.PropertyUtils;
import com.hm.appinfo.model.LnApp;
import com.hm.appinfo.service.LnAppService;
import com.hm.fk.service.FKService;
import com.hm.model.RPCResult;
import com.hm.model.RpcException;
import com.hm.service.OperationTaskService;
import com.hm.sys.constants.SysConstants;

@Service("operationTaskService")
public class OperationTaskServiceImpl implements OperationTaskService {

	@Autowired
	private FKService fKService;
	
	@Autowired
	private LnAppService lnAppService;
	
	@Resource
	private ThreadPoolTaskExecutor threadPoolTaskExecutor;
	
	protected final Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public RPCResult reSendFKAuto() throws RpcException {
		log.info("OperationTaskServiceImpl reSendFKAuto Start ...");
		String flag = RedisUtils.getObject(SysConstants.RE_SEND_FK_REDIS);
		log.info("OperationTaskServiceImpl reSendFKAuto Redis flag={}",flag);
		RPCResult rs = new RPCResult();
		if(!SysConstants.RE_SEND_FK_REDIS_FLAG_Y.equals(flag)){
			threadPoolTaskExecutor.execute(new Runnable() {
				@Override
				public void run() {
					try {
						RedisUtils.putObject(SysConstants.RE_SEND_FK_REDIS, SysConstants.RE_SEND_FK_REDIS_FLAG_Y);
						// 通过SC接口,查出所有11的工单
						LnApp lnAppQuery = new LnApp();
						lnAppQuery.setAppState(SysConstants.LN_APP_STATE_11);
						List<com.sc.api.app.model.LnApp> lnAppSCList = lnAppService.queryLnAppSC(lnAppQuery);
						List<LnApp> lnAppList = new ArrayList<LnApp>();
						for (com.sc.api.app.model.LnApp lnAppSC : lnAppSCList) {
							LnApp lnApp = new LnApp();
							BeanUtils.copyFields(lnAppSC, lnApp);
							lnAppList.add(lnApp);
						}

						log.info("OperationTaskServiceImpl reSendFKAuto lnAppListSize={}", lnAppList.size());
						
						InetAddress address = null;
						String clientIp = null;
						String loginName = null;
						if (!InputChecker.isEmpty(lnAppList)) {
							try {
								address = InetAddress.getLocalHost();
								clientIp = address.getHostAddress();
								loginName = PropertyUtils.getConfig("auto.resendFk.loginName");
							} catch (UnknownHostException e) {
								clientIp = PropertyUtils.getConfig("auto.resendFk.clientIp");
							}
							
							Map<Long,Long> app2BuildTime = analyzeBuildTime(lnAppList);
							
							log.info("OperationTaskServiceImpl reSendFKAuto analyzeBuildTime = {}", app2BuildTime != null ? JSON.toJSONString(app2BuildTime) : null);

							if(app2BuildTime != null && !app2BuildTime.isEmpty()){
								for (LnApp lnApp : lnAppList) {
									Long appId = lnApp.getId();
																	
									Long time = app2BuildTime.get(appId);
									
									try{
										log.info("OperationTaskServiceImpl reSendFKAuto appId={},time={},clientIp={},loginName={}",appId, time, clientIp, loginName);
										if (null != time && !InputChecker.isNull(appId)
												&& Long.parseLong(PropertyUtils.getConfig("auto.resendFk.time")) <= time) {
											Result rs = fKService.reSendFK(clientIp, appId, loginName, lnApp);
											log.info("OperationTaskServiceImpl reSendFKAuto returnMessage = {},returnFlag = {}",rs.getMessage(),rs.isSuccess());
										}
										log.info("OperationTaskServiceImpl reSendFKAuto End appId={}", appId);
									}catch(Exception ex){
										log.error("OperationTaskServiceImpl reSendFKAuto do reSendFK function happen exception, appId = {},    exception = {}",appId,  ex);
									}
								}
							}
						}
						
						log.info("OperationTaskServiceImpl reSendFKAuto complete!");
						RedisUtils.removeObject(SysConstants.RE_SEND_FK_REDIS);
					} catch (Exception e) {
						log.error("OperationTaskServiceImpl reSendFKAuto Exception ...", e);
						if (!InputChecker.isEmpty(RedisUtils.getObject(SysConstants.RE_SEND_FK_REDIS))) {
							RedisUtils.removeObject(SysConstants.RE_SEND_FK_REDIS);
						}
					}
				}

				private Map<Long,Long> analyzeBuildTime(List<LnApp> lnAppList)
						throws Exception {
					Map<Long, Long> app2BuildTime = new HashMap<>();
					for (LnApp lnApp : lnAppList) {
						Long appId = lnApp.getId();
						Long time = null;
						if(!InputChecker.isEmpty(lnApp.getWoBuildTime())){
							time = DateUtils.pastMinutes(lnApp.getWoBuildTime());
							app2BuildTime.put(appId, time);
						}else{
							throw new Exception("OperationTaskServiceImpl reSendFKAuto wo build time is empty, appid="+appId);
						}
					}
					return app2BuildTime;
				}
			});
		}
		rs.setStatus(true);
		rs.setMsg("调用自动重发风控成功!");
		return rs;
		
	}

}
