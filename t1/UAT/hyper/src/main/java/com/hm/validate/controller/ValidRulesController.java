/**
 * Copyright 2017 ECCloud Corporation. All rights reserved.
 *
 * --------------------------------------------------------
 * 此技术信息为本公司机密信息，未经本公司书面同意禁止向第三方披露.
 * 版权所有：9fchaoneng
 * --------------------------------------------------------
 */

package com.hm.validate.controller;

import java.util.List;

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
import com.gep.core.util.StringUtil;
import com.hm.validate.model.ValidRules;
import com.hm.validate.service.ValidRulesService;

@Controller
@RequestMapping(value = "/valid/rule/")
public class ValidRulesController extends BaseController{
    
    private static final Logger LOG = Logger.getLogger(ValidRulesController.class);
    
    @Autowired
    private ValidRulesService validRulesService;
    
    @Resource
    @Qualifier("jedisConnectionFactory")
    private JedisConnectionFactory jedisConnectionFactory;
    
    /**
     * 
     * 描述：列表页面<br/>
     * @param model
     * @return
     */
    @RequestMapping(value = "list")
    public String list(ModelMap model) {
        return "validate/validrules_list";
    }
    //条件查询
    @RequestMapping(value = "querylist")
    public String queryList(ValidRules validRules, ModelMap model) {
        
        LOG.info("[ValidRulesController] queryList method begin...");
        Page<ValidRules> page = new Page<>();
        try {
            validRules.setRuleName(StringUtil.trim(validRules.getRuleName()));
            page = getPage(validRules);
            validRulesService.list(page);
        } catch (Exception e) {
            LOG.error("[ValidRulesController] queryList method 加载List页面异常", e);
        }
        model.addAttribute("lnapp", validRules);
        model.addAttribute("pageReq", page);
        
        LOG.info("[ValidRulesController] queryList method end...");
        return "validate/validrules_list";
    }
    /**
     * 
     * 描述：新增页面<br/>
     * @param model
     * @return
     */
    @RequestMapping(value = "add")
    public String add(ModelMap model) {
        return "validate/validrules_add";
    }
    /**
     * 
     * 描述：新增提交<br/>
     * @param userApp
     * @param model
     * @return
     */
    @RequestMapping(value = "addSubmit")
    public String addSubmit(ValidRules validRules,ModelMap model) {
        LOG.info("[ValidRulesController] addSubmit method");
        try{
            if(!InputChecker.isEmpty(validRules)){
               validRulesService.insert(validRules);
               RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), validRulesService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[ValidRulesController] addSubmit method 提交异常",e);
        }
        return "redirect:/valid/rule/querylist";
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
        LOG.info("[ValidRulesController] update method");
        try{
            ValidRules validRules = new ValidRules ();
            validRules.setId(Long.parseLong(id));
            List<ValidRules> lists = validRulesService.list(validRules);  
            if(!InputChecker.isEmpty(lists)){
                model.addAttribute("validRules", lists.get(0));
            }
        }catch (Exception e) {
            LOG.error("[ValidRulesController] update method 加载修改update页面数据异常", e);
        }
        return "validate/validrules_update";
    }
    /**
     * 
     * 描述：修改提交<br/>
     * @param userApp
     * @param model
     * @return
     */
    @RequestMapping(value = "updateSubmit")
    public String updateSubmit(ValidRules validRules,ModelMap model) {
        
        LOG.info("[ValidRulesController] addUpdate method");
        try{
            if(!InputChecker.isEmpty(validRules)){
               validRulesService.update(validRules);
               RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), validRulesService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[ValidRulesController] addUpdate method 提交异常",e);
        }
        return "redirect:/valid/rule/querylist";
    }
}
