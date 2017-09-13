/**
 * Copyright 2017 ECCloud Corporation. All rights reserved.
 *
 * --------------------------------------------------------
 * 此技术信息为本公司机密信息，未经本公司书面同意禁止向第三方披露.
 * 版权所有：9fchaoneng
 * --------------------------------------------------------
 */

package com.hm.userauth.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gep.core.base.BaseController;
import com.gep.core.entity.Page;
import com.gep.core.util.InputChecker;
import com.gep.core.util.RedisUtils;
import com.gep.sys.model.UserInfo;
import com.gep.sys.service.UserService;
import com.gep.util.PropertyUtils;
import com.hm.model.RPCResult;
import com.hm.model.TokenRpcParam;
import com.hm.service.UserAppRpcService;
import com.hm.userauth.model.UserApp;
import com.hm.userauth.model.UserChannel;
import com.hm.userauth.service.UserAppMangerService;
import com.hm.userauth.service.UserChannelMangerService;

@Controller
@RequestMapping(value = "/userauth/")
public class UserAppMangerController extends BaseController{
    
    private static final Logger LOG = Logger.getLogger(UserAppMangerController.class);
    
    @Autowired 
    private UserAppMangerService userAppService;
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserChannelMangerService userChannelService;
    
    @Resource
    @Qualifier("jedisConnectionFactory")
    private JedisConnectionFactory jedisConnectionFactory;
    /**
     * 查询用户信息
     * 功能描述：<br/>
     * 创建日期:2017年3月22日<br/>
     * @param loginName
     * @return
     */
    @RequestMapping(value = "queryUserInfo")
    @ResponseBody
    public Map<String,Object>  queryUserInfo(String loginName) {
        
        UserInfo user = new UserInfo();
        user.setLoginName(loginName);
        List<UserInfo> userList =  userService.list(user);
        Map<String,Object> map = new HashMap<>();
        map.put("userId", -1);
        if(!InputChecker.isEmpty(userList)){
            map.put("userId", userList.get(0).getUserId());
        }
        return map; 
    }
    /**
     * 
     * 描述：列表页面<br/>
     * @param model
     * @return
     */
    @RequestMapping(value = "list")
    public String list(ModelMap model) {
    	 Map<String, String>  appMap =  PropertyUtils.getResourceMap("appName");
         model.addAttribute("appMap", appMap);
        return "userauth/userapp_list";
    }
    //条件查询
    @RequestMapping(value = "querylist")
    public String queryList(UserApp userApp, ModelMap model) {
        
        LOG.info("[UserAppController] queryList method begin...");
        Page<UserApp> page = new Page<>();
        try {
            userApp.setToken(userApp.getTokenStr());
            page = getPage(userApp);
            userAppService.list(page);
        } catch (Exception e) {
            LOG.error("[UserAppController] queryList method 加载List页面异常", e);
        }
        Map<String, String>  appMap =  PropertyUtils.getResourceMap("appName");
        model.addAttribute("appMap", appMap);
        model.addAttribute("lnapp", userApp);
        model.addAttribute("pageReq", page);
        
        LOG.info("[UserAppController] queryList method end...");
        return "userauth/userapp_list";
    }
    @RequestMapping(value = "generateToken")
    @ResponseBody
    public Map<String,Object> generateToken(){
    	Map<String,Object> map = new HashMap<>();
    	map.put("token", UUID.randomUUID().toString().replace("-", ""));
        return map; 
    }
    /**
     * 
     * 描述：新增页面<br/>
     * @param model
     * @return
     */
    @RequestMapping(value = "add")
    public String add(ModelMap model) {
        LOG.info("[UserAppController] add method begin...");
        try{
            Map<String, String>  appMap =  PropertyUtils.getResourceMap("appName");
            model.addAttribute("appMap", appMap);    
            UserChannel  userChannle = new UserChannel();
            userChannle.setStatus(0);
            model.addAttribute("userChannelMap", userChannelService.list(userChannle));  
            model.addAttribute("token", UUID.randomUUID().toString().replace("-", ""));
            
        }catch (Exception e) {
            LOG.error("[UserAppController] add method 异常", e);
        }
        return "userauth/userapp_add";
    }
    /**
     * 
     * 描述：新增提交<br/>
     * @param userApp
     * @param model
     * @return
     */
    @RequestMapping(value = "addSubmit")
    public String addSubmit(UserApp userApp,ModelMap model) {
        LOG.info("[UserAppController] addSubmit method");
        try{
            if(!InputChecker.isEmpty(userApp)){
               String silpStr [] =   userApp.getAppCodeAndName().split(":");
               userApp.setAppCode(silpStr[0]);
               userApp.setAppName(silpStr[1]);
               // normal 正常  abnormal 不正常(冻结，暂停，锁定)
               userApp.setUserStatus("normal");//默认值
               userAppService.insert(userApp);
               userApp.setTokenCreateTime(new Date());
               RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), userAppService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[UserAppController] addSubmit method 提交异常",e);
        }
        return "redirect:/userauth/querylist";
    }
   
    /**
     * 
     * 描述：修改页面<br/>
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "update")
    public String update(String id,ModelMap model) {
        LOG.info("[UserAppController] update method");
        try{
            UserApp userApp = new UserApp ();
            userApp.setId(Long.parseLong(id));
            List<UserApp> lists = userAppService.list(userApp);  
            if(!InputChecker.isEmpty(lists)){
                model.addAttribute("userApp", lists.get(0));
                Map<String, String>  appMap =  PropertyUtils.getResourceMap("appName");
                model.addAttribute("appMap", appMap);       
                model.addAttribute("userChannelMap", userChannelService.list(new UserChannel())); 
                
            }
        }catch (Exception e) {
            LOG.error("[UserAppController] update method 加载修改update页面数据异常", e);
        }
        return "userauth/userapp_update";
    }
    /**
     * 
     * 描述：修改提交<br/>
     * @param userApp
     * @param model
     * @return
     */
    @RequestMapping(value = "updateSubmit")
    public String updateSubmit(UserApp userApp,ModelMap model) {
        
        LOG.info("[UserAppController] addUpdate method");
        try{
            if(!InputChecker.isEmpty(userApp)){
               String silpStr [] =   userApp.getAppCodeAndName().split(":");
               userApp.setAppCode(silpStr[0]);
               userApp.setAppName(silpStr[1]);
               userApp.setToken(userApp.getTokenStr());
               userAppService.update(userApp);
               RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), userAppService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[UserAppController] addUpdate method 提交异常",e);
        }
        return "redirect:/userauth/querylist";
    }
   /* *//**
     * 测试获取token
     * @param userApp
     * @param model
     * @return
     */
    @Autowired
    private UserAppRpcService userAppRpcService;
    
    @RequestMapping(value = "gettoken")
    @ResponseBody
    public RPCResult gettoken(UserApp userApp,ModelMap model) {
    	
    	TokenRpcParam tokenRpcParam = new TokenRpcParam ();
    	
    	tokenRpcParam.setUserId(11113L);
    	tokenRpcParam.setAppCode("EIP");
    	tokenRpcParam.setLoginName("test");
    	tokenRpcParam.setUserStatus("normal");
    	
    	tokenRpcParam.setTokenType("valid24T");
    	tokenRpcParam.setChannelCode("eip");
    	//System.out.println(); 
    	
    	return userAppRpcService.authUserGetToken(tokenRpcParam);
      
    }
    
    @RequestMapping(value = "updatetoken")
    @ResponseBody
    public RPCResult updatetoken(UserApp userApp,ModelMap model) {
    	
    	List<TokenRpcParam> list = new ArrayList<TokenRpcParam>();
    	TokenRpcParam tokenRpcParam = new TokenRpcParam ();
    	
    	tokenRpcParam.setUserId(11112L);
    	tokenRpcParam.setAppCode("EIP");
    	tokenRpcParam.setLoginName("test");
    	tokenRpcParam.setUserStatus("normal");
    	
    	list.add(tokenRpcParam);
    	
    	TokenRpcParam tokenRpcParam1 = new TokenRpcParam ();
    	tokenRpcParam1.setUserId(11111L);
    	tokenRpcParam1.setAppCode("EIP");
    	tokenRpcParam1.setLoginName("test");
    	tokenRpcParam1.setUserStatus("abnormal");
    	
    	list.add(tokenRpcParam1);
    
    	return userAppRpcService.updateUserAuthToken(list);
      
    }
}
