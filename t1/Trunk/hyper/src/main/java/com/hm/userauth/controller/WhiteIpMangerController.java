/**
 * Copyright 2017 ECCloud Corporation. All rights reserved.
 *
 * --------------------------------------------------------
 * 此技术信息为本公司机密信息，未经本公司书面同意禁止向第三方披露.
 * 版权所有：9fchaoneng
 * --------------------------------------------------------
 */

package com.hm.userauth.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gep.core.base.BaseController;
import com.gep.core.entity.Page;
import com.gep.core.util.InputChecker;
import com.gep.core.util.RedisUtils;
import com.gep.util.PropertyUtils;
import com.hm.userauth.model.UserApp;
import com.hm.userauth.model.UserChannel;
import com.hm.userauth.model.WhiteIp;
import com.hm.userauth.service.WhiteIpMangerService;

@Controller
@RequestMapping(value = "/userauth/white")
public class WhiteIpMangerController extends BaseController{
    
    private static final Logger LOG = Logger.getLogger(WhiteIpMangerController.class);
    
    @Autowired
    private WhiteIpMangerService whiteIpMangerService;
    
    @Resource
    @Qualifier("jedisConnectionFactory")
    private JedisConnectionFactory jedisConnectionFactory;
    
    @RequestMapping(value = "list")
    public String list(ModelMap model) {
    	Map<String, String>  appMap =  PropertyUtils.getResourceMap("appName");
        model.addAttribute("appMap", appMap);
        return "userauth/whiteip_list";
    }
    // 条件查询
    @RequestMapping(value = "querylist")
    public String queryList(WhiteIp whiteIp, ModelMap model) {
        
        LOG.info("[WhiteIpController] queryList method begin...");
        Page<WhiteIp> page = new Page<>();
        try {
            page = getPage(whiteIp);
            whiteIpMangerService.list(page);
        } catch (Exception e) {
            LOG.error("[WhiteIpController] queryList method 加载List页面异常", e);
        }
        Map<String, String>  appMap =  PropertyUtils.getResourceMap("appName");
        model.addAttribute("appMap", appMap);
        model.addAttribute("whiteIp", whiteIp);
        model.addAttribute("pageReq", page);
        
        LOG.info("[WhiteIpController] queryList method end...");
        return "userauth/whiteip_list";
    }
    
    /**
     * 
     * 功能描述：<br/>
     * 创建日期:2017年3月22日<br/>
     * @param model
     * @return
     */
    @RequestMapping(value = "add")
    public String add(ModelMap model) {
        Map<String, String>  appMap =  PropertyUtils.getResourceMap("appName");
        model.addAttribute("appMap", appMap);    
        return "userauth/whiteip_add";
    }
    /**
     * 添加提交
     * 功能描述：<br/>
     * 创建日期:2017年3月22日<br/>
     * @param userApp
     * @param model
     * @return
     */
    @RequestMapping(value = "addSubmit")
    public String addSubmit(WhiteIp whiteIp,ModelMap model) {
        LOG.info("[WhiteIpController] addSubmit method");
        try{
            if(!InputChecker.isEmpty(whiteIp)){
            	whiteIpMangerService.insert(whiteIp);
               RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), whiteIpMangerService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[WhiteIpController] addSubmit method 提交异常",e);
        }
        return "redirect:/userauth/white/querylist";
    }
    /**
     * 
     * 功能描述：<br/>
     * 创建日期:2017年3月22日<br/>
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "update")
    public String update(String id,ModelMap model) {
        LOG.info("[WhiteIpController] update method");
        try{
            WhiteIp whiteIp = new WhiteIp ();
            whiteIp.setId(Long.parseLong(id));
            List<WhiteIp> lists = whiteIpMangerService.list(whiteIp);  
            if(!InputChecker.isEmpty(lists)){
                model.addAttribute("whiteIp", lists.get(0)); 
            }
            Map<String, String>  appMap =  PropertyUtils.getResourceMap("appName");
            model.addAttribute("appMap", appMap);  
        }catch (Exception e) {
            LOG.error("[WhiteIpController] update method 加载修改update页面数据异常", e);
        }
        return "userauth/whiteip_update";
    }
    /**
     * 
     * 功能描述：<br/>
     * 创建日期:2017年3月22日<br/>
     * @param userApp
     * @param model
     * @return
     */
    @RequestMapping(value = "updateSubmit")
    public String updateSubmit(WhiteIp whiteIp,ModelMap model) {
        
        LOG.info("[WhiteIpController] addUpdate method");
        try{
            if(!InputChecker.isEmpty(whiteIp)){
            	whiteIpMangerService.update(whiteIp);
                RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), whiteIpMangerService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[WhiteIpController] addUpdate method 提交异常",e);
        }
        return "redirect:/userauth/white/querylist";
    }
    
}
