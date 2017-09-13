/**
 * Copyright 2017 ECCloud Corporation. All rights reserved.
 *
 * --------------------------------------------------------
 * 此技术信息为本公司机密信息，未经本公司书面同意禁止向第三方披露.
 * 版权所有：9fchaoneng
 * --------------------------------------------------------
 */

package com.hm.validate.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;

import com.gep.core.base.BaseController;
import com.gep.core.entity.Page;
import com.gep.core.util.InputChecker;
import com.gep.util.PropertyUtils;
import com.hm.validate.model.ValidModules;
import com.hm.validate.service.ValidModulesService;

@Controller
@RequestMapping(value = "/valid/module/")
public class ValidModulesController extends BaseController{
    
    private static final Logger LOG = Logger.getLogger(ValidModulesController.class);
    
    @Resource
    @Qualifier("jedisConnectionFactory")
    private JedisConnectionFactory jedisConnectionFactory;
    
    @Autowired
    private ValidModulesService validModulesService;
    
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
        return "validate/validmodules_list";
    }
    //条件查询
    @RequestMapping(value = "querylist")
    public String queryList(ValidModules  validModules, ModelMap model) {
        
        LOG.info("[ValidModulesController] queryList method begin...");
        Page<ValidModules> page = new Page<>();
        try {
            page = getPage(validModules);
            validModulesService.list(page);
        } catch (Exception e) {
            LOG.error("[ValidModulesController] queryList method 加载List页面异常", e);
        }
        Map<String, String>  appMap =  PropertyUtils.getResourceMap("appName");
        model.addAttribute("appMap", appMap);
        model.addAttribute("validModules", validModules);
        model.addAttribute("pageReq", page);
        
        LOG.info("[ValidModulesController] queryList method end...");
        return "validate/validmodules_list";
    }
    /**
     * 
     * 描述：<br/>
     * @param validModules
     * @param model
     * @return
     */
    @RequestMapping(value = "checkValidModules")
    @ResponseBody
    public Map checkValidModules(ValidModules validModules, ModelMap model) {
        
        LOG.info("[ValidModulesController] checkValidModules method begin...");
        Map<String,Object> map = new HashMap<>();
        map.put("id", -1);
        List<ValidModules> list = validModulesService.list(validModules);
        if(!InputChecker.isEmpty(list)){
            map.put("id", list.get(0).getId());
            map.put("actionCode", list.get(0).getActionCode());
        }
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
        LOG.info("[ValidModulesController] add method begin...");
        try{
            Map<String, String>  appMap =  PropertyUtils.getResourceMap("appName");
            model.addAttribute("appMap", appMap);  
        }catch (Exception e) {
            LOG.error("[ValidModulesController] add method 异常", e);
        }
        return "validate/validmodules_add";
    }
    /**
     * 
     * 描述：新增提交<br/>
     * @param userApp
     * @param model
     * @return
     */
    @RequestMapping(value = "addSubmit")
    public String addSubmit(ValidModules  validModules,ModelMap model) {
        LOG.info("[ValidModulesController] addSubmit method");
        try{
            if(!InputChecker.isEmpty(validModules)){
               validModules.setVersion(1);
               validModules.setModelCode(validModules.getActionCode());
               validModulesService.insert(validModules);
               //RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), validModulesService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[ValidModulesController] addSubmit method 提交异常",e);
        }
        return "redirect:/valid/module/querylist";
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
        LOG.info("[ValidModulesController] update method");
        try{
            ValidModules  validModules =new ValidModules ();
            validModules.setId(Long.parseLong(id));
            List<ValidModules> lists = validModulesService.list(validModules);  
            if(!InputChecker.isEmpty(lists)){
                model.addAttribute("validModules", lists.get(0));
            }
        }catch (Exception e) {
            LOG.error("[ValidModulesController] update method 加载修改update页面数据异常", e);
        }
        return "validate/validmodules_update";
    }
    /**
     * 
     * 描述：修改提交<br/>
     * @param userApp
     * @param model
     * @return
     */
    @RequestMapping(value = "updateSubmit")
    public String updateSubmit(ValidModules  validModules,ModelMap model) {
        
        LOG.info("[ValidModulesController] addUpdate method");
        try{
            if(!InputChecker.isEmpty(validModules)){
               validModulesService.update(validModules);
               //RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), userAppService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[ValidModulesController] addUpdate method 提交异常",e);
        }
        return "redirect:/valid/module/querylist";
    }
}
