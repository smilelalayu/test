package com.hm.userauth.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.util.InputChecker;
import com.gep.util.PropertyUtils;
import com.hm.model.RPCResult;
import com.hm.model.TokenRpcParam;
import com.hm.service.UserAppRpcService;
import com.hm.userauth.model.UserApp;
import com.hm.userauth.model.UserChannel;
import com.hm.userauth.service.UserAppMangerService;
import com.hm.userauth.service.UserChannelMangerService;

/**
 * token值维护
 * @author Administrator
 *
 */
@Service("userAppRpcService")
public class UserAppRpcServiceImpl implements UserAppRpcService{
	
	private static final Logger LOG = Logger.getLogger(UserAppRpcServiceImpl.class);
	
	@Autowired
	private UserAppMangerService userAppMangerService;
	
	@Autowired
	private UserChannelMangerService userChannelMangerService;
    
	@Override
	public RPCResult userAuthToken(TokenRpcParam tokenRpcParam) {
	   
		RPCResult rpcResult= new RPCResult();
		if(!InputChecker.isEmpty(tokenRpcParam) && !InputChecker.isEmpty(tokenRpcParam.getUserId())){
			try{
				UserApp userApp = new UserApp();	
				Map<String,String> appCodeMap =  PropertyUtils.getResourceMap("appName");
				String appName = appCodeMap.get(tokenRpcParam.getAppCode());
				if(InputChecker.isEmpty(appName)){
					rpcResult.setCode("200101");//参数错误
					rpcResult.setCodeDesc("参数错误[appCode系统代码错误][appCode="+tokenRpcParam.getAppCode()+"]");
					rpcResult.setStatus(true);
				}else{
					String token = UUID.randomUUID().toString().replace("-", "") ; 
					if("normal".equals(tokenRpcParam.getUserStatus())){//用户登录校验成功
						userApp.setUserId(tokenRpcParam.getUserId().intValue());//用户id
						userApp.setAppCode(tokenRpcParam.getAppCode());//系统代码
						List<UserApp> userApps = userAppMangerService.getUserAppList(userApp);
						if(!InputChecker.isEmpty(userApps)){
							UserApp app = userApps.get(0);	
							if(!InputChecker.isEmpty(tokenRpcParam.getTokenType()) && "perpetual".contains(tokenRpcParam.getTokenType())){
								 rpcResult.setData(app.getToken());//旧token
							}else{
								 app.setToken(token);
								 userAppMangerService.update(app);
								 rpcResult.setData(token);//token
							}
						}else{
							userApp.setUserId(tokenRpcParam.getUserId().intValue());//用户id
							userApp.setAppName(appName);//系统名称
							userApp.setAppCode(tokenRpcParam.getAppCode());//系统代码
							userApp.setToken(token);
							userApp.setUserStatus(tokenRpcParam.getUserStatus());//用户状态
							String channelId = PropertyUtils.getString("userauth.channel.id");
							if(!InputChecker.isEmpty(channelId)){
								userApp.setChannelId(Long.parseLong(channelId));//默认是公司本部渠道
							}
							userAppMangerService.insert(userApp);	
							rpcResult.setData(token);
						}
					} 
					rpcResult.setCode("200");
					rpcResult.setMsg("操作成功");
					rpcResult.setStatus(true);
				}	
			}catch (Exception e) {
				LOG.error("", e);
				rpcResult.setCode("500");//系统异常
				rpcResult.setCodeDesc("系统异常");
				rpcResult.setStatus(false);
			} 	 
		}
		return rpcResult;
	}
	@Override
	public RPCResult updateUserAuthToken(List<TokenRpcParam> tokenRpcParams) {
		
		RPCResult rpcResult= new RPCResult();
		String paramsMsg = "";
		if(!InputChecker.isEmpty(tokenRpcParams)){
			
			for(TokenRpcParam tokenRpcParam:tokenRpcParams){
				
			   if( !InputChecker.isEmpty(tokenRpcParam.getUserId())
					  &&!InputChecker.isEmpty(tokenRpcParam.getLoginName())
					  &&!InputChecker.isEmpty(tokenRpcParam.getAppCode())
					  && ("normal".equals(tokenRpcParam.getUserStatus()) || "abnormal".equals(tokenRpcParam.getUserStatus()) )){
				try{
					    UserApp userApp = new UserApp();
						Map<String,String> appCodeMap =  PropertyUtils.getResourceMap("appName");
						String appName = appCodeMap.get(tokenRpcParam.getAppCode());
						if(InputChecker.isEmpty(appName)){
							rpcResult.setCode("200101");//参数错误
							rpcResult.setCodeDesc("系统代码错误【appCode="+tokenRpcParam.getAppCode()+"】");
							LOG.info(" 系统代码错误【appCode="+tokenRpcParam.getAppCode()+"】");
							rpcResult.setStatus(true);
						}else{	
								String token = UUID.randomUUID().toString().replace("-", "") ; 
								userApp.setUserId(tokenRpcParam.getUserId().intValue());//用户id
								userApp.setAppCode(tokenRpcParam.getAppCode());//系统代码
								List<UserApp> userApps = userAppMangerService.getUserAppList(userApp);
								if(!InputChecker.isEmpty(userApps)){
									UserApp app = userApps.get(0);
									app.setToken(token);
									app.setUserStatus(tokenRpcParam.getUserStatus());//用户状态
									userAppMangerService.update(app);
								}
						 }
					}catch (Exception e) {
						LOG.error("", e);
						rpcResult.setCode("500");//系统异常
						rpcResult.setCodeDesc("系统异常");
						rpcResult.setStatus(false);
					} 
				  }else{
					  paramsMsg  = paramsMsg +tokenRpcParam.toString();
				  }
		      }	
			if(!InputChecker.isEmpty(paramsMsg) ){
				rpcResult.setCode("200101");//参数错误
				rpcResult.setCodeDesc(" 参数错误【"+paramsMsg+"】 ");
				LOG.info(" 200101  参数错误【"+paramsMsg+"】 ");
				rpcResult.setStatus(true);
			}else{
				rpcResult.setCode("200");
				rpcResult.setMsg("操作成功");
				rpcResult.setStatus(true);
			}
		}
		return rpcResult;
	}
    /**
     * 获取token值(新)
     * @param tokenRpcParams
     * @return
     */
	@Override
	public RPCResult authUserGetToken(TokenRpcParam tokenRpcParam) {
		
		RPCResult rpcResult= new RPCResult();
		if(!InputChecker.isEmpty(tokenRpcParam) 
				&& !InputChecker.isEmpty(tokenRpcParam.getUserId())
				&& !InputChecker.isEmpty(tokenRpcParam.getLoginName())
				&& !InputChecker.isEmpty(tokenRpcParam.getUserStatus())
				&& !InputChecker.isEmpty(tokenRpcParam.getAppCode())
				&& !InputChecker.isEmpty(tokenRpcParam.getChannelCode())){
			try{
				UserApp userApp = new UserApp();	
				Map<String,String> appCodeMap =  PropertyUtils.getResourceMap("appName");
				String appName = appCodeMap.get(tokenRpcParam.getAppCode());
				if(InputChecker.isEmpty(appName)){
					rpcResult.setCode("200101");//参数错误
					rpcResult.setCodeDesc("系统代码错误【appCode="+tokenRpcParam.getAppCode()+"】");
					LOG.info("200101系统代码错误【appCode="+tokenRpcParam.getAppCode()+"】");
					rpcResult.setStatus(true);
				}else{
					String token = UUID.randomUUID().toString().replace("-", "") ; 
					if("normal".equals(tokenRpcParam.getUserStatus())){//用户登录校验成功
						userApp.setUserId(tokenRpcParam.getUserId().intValue());//用户id
						userApp.setAppCode(tokenRpcParam.getAppCode());//系统代码
						List<UserApp> userApps = userAppMangerService.getUserAppList(userApp);
						if(!InputChecker.isEmpty(userApps)){
							UserApp app = userApps.get(0);	
							if("perpetual".equals(tokenRpcParam.getTokenType())){//永久
								 rpcResult.setData(app.getToken());//旧token
							}else if("valid24T".equals(tokenRpcParam.getTokenType())){//当天
								 Date tokenCreateTime = app.getTokenCreateTime();
								 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
								 String tokenDateStr = formatter.format(tokenCreateTime);
								 String currentDateStr =formatter.format(new Date());
								 if(currentDateStr.equals(tokenDateStr)){
									 rpcResult.setData(app.getToken());//当天有效token
								 }else{
									 app.setToken(token);
									 app.setTokenCreateTime(new Date());
									 userAppMangerService.update(app);
									 rpcResult.setData(token);//token
								 }
							}else{
								 app.setToken(token);
								 app.setTokenCreateTime(new Date());
								 userAppMangerService.update(app);
								 rpcResult.setData(token);//token 
							}
						}else{
							userApp.setUserId(tokenRpcParam.getUserId().intValue());//用户id
							userApp.setAppName(appName);//系统名称
							userApp.setAppCode(tokenRpcParam.getAppCode());//系统代码
							userApp.setToken(token);
							userApp.setUserStatus(tokenRpcParam.getUserStatus());//用户状态
							
							UserChannel userChannel = new UserChannel();
							userChannel.setChannelCode(tokenRpcParam.getChannelCode());
							List<UserChannel> channels = userChannelMangerService.list(userChannel);
							if(!InputChecker.isEmpty(channels)){
								userApp.setChannelId(channels.get(0).getId());
								userApp.setTokenCreateTime(new Date());
								userAppMangerService.insert(userApp);	
								rpcResult.setData(token);
							}else{
								rpcResult.setCode("200102");//参数错误
								rpcResult.setCodeDesc("渠道不存在 channelCode【"+tokenRpcParam.getChannelCode()+"】");
								LOG.error("200102 渠道不存在 channelCode【"+tokenRpcParam.getChannelCode()+"】");
							}
						}
					} 
					rpcResult.setCode("200");
					rpcResult.setMsg("操作成功");
					rpcResult.setStatus(true);
				}	
			}catch (Exception e) {
				LOG.error("", e);
				rpcResult.setCode("500");//系统异常
				rpcResult.setCodeDesc("系统异常");
				rpcResult.setStatus(false);
			} 	 
		}else{
			rpcResult.setCode("200101");//参数错误
			rpcResult.setCodeDesc("参数值【"+tokenRpcParam.toString()+"】");
			LOG.error("200101 参数值【"+tokenRpcParam.toString()+"】");
			rpcResult.setStatus(true);
		}
		return rpcResult;
	} 
}
