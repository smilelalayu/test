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
import com.gep.core.util.RedisUtils;
import com.hm.validate.model.FormRulesJson;
import com.hm.validate.model.ValidForms;
import com.hm.validate.model.ValidRules;
import com.hm.validate.service.ValidFormsService;
import com.hm.validate.service.ValidRulesService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/valid/param/")
public class ValidFormsController extends BaseController{
    
    private static final Logger LOG = Logger.getLogger(ValidFormsController.class);
    
    @Resource
    @Qualifier("jedisConnectionFactory")
    private JedisConnectionFactory jedisConnectionFactory;
    
    @Autowired
    private ValidFormsService validFormsService;
    
    @Autowired
    private ValidRulesService validRulesService;
    //条件查询
    @RequestMapping(value = "querylist")
    public String queryList(ValidForms validForms, ModelMap model) {
        
        LOG.info("[UserAppController] queryList method begin...");
        Page<ValidForms> page = new Page<>();
        try {
            page = getPage(validForms);
            validFormsService.list(page);
        } catch (Exception e) {
            LOG.error("[UserAppController] queryList method 加载List页面异常", e);
        }
        List<ValidForms> list =   page.getResult();
      
        if(!InputChecker.isEmpty(list)){
            for(ValidForms forms:list){
               FormRulesJson formRulesJson = null ;
               try{
                   formRulesJson=(FormRulesJson) JSONObject.toBean(JSONObject.fromObject(forms.getRules()), FormRulesJson.class);
               }catch(Exception e){
                   LOG.error("[UserAppController] queryList method rules值json 格式错误...");
                   formRulesJson = new FormRulesJson ();
                   formRulesJson.setRequiredmsg("jsonIsError");//表示json错误
               }
               forms.setFormRulesJson(formRulesJson);
            }
        }
        model.addAttribute("validForms", validForms);
        model.addAttribute("pageReq", page);

        LOG.info("[UserAppController] queryList method end...");
        return "validate/validforms_list";
    }
    /**
     * 
     * 描述：新增页面<br/>
     * @param model
     * @return
     */
    @RequestMapping(value = "add")
    public String add(ValidForms validForms,ModelMap model) {
        LOG.info("[UserAppController] add method begin...");
        model.addAttribute("validForms", validForms);
        model.addAttribute("validRulesList",  validRulesService.list(new ValidRules()));
        return "validate/validforms_add";
    }
    /**
     * 
     * 描述：新增提交<br/>
     * @param userApp
     * @param model
     * @return
     */
    @RequestMapping(value = "addSubmit")
    public String addSubmit(ValidForms validForms,ModelMap model) {
        LOG.info("[UserAppController] addSubmit method");
        try{
            if(!InputChecker.isEmpty(validForms)){
               validForms.setRules(JSONObject.fromObject(validForms.getFormRulesJson()).toString());
               validFormsService.insert(validForms);
               RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), validFormsService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[UserAppController] addSubmit method 提交异常",e);
        }
        return "redirect:/valid/param/querylist?actionCode="+validForms.getActionCode()+"&context="+validForms.getContext()+"&postUrl="+validForms.getPostUrl()+"&version="+validForms.getVersion();
    }
   
    /**
     * 
     * 描述：修改页面<br/>
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "update")
    public String update(ValidForms validFormsParam,ModelMap model) {
        LOG.info("[UserAppController] update method");
        try{
            ValidForms forms = new ValidForms ();
            forms.setId(validFormsParam.getId());
            List<ValidForms> lists = validFormsService.list(forms);  
            if(!InputChecker.isEmpty(lists)){
                ValidForms validForms = lists.get(0);
                FormRulesJson  formRulesJson=(FormRulesJson) JSONObject.toBean(JSONObject.fromObject(validForms.getRules()), FormRulesJson.class);
                validForms.setFormRulesJson(formRulesJson);
                model.addAttribute("validForms", validForms);   
                model.addAttribute("validRulesList",  validRulesService.list(new ValidRules()));
                model.addAttribute("validFormsParam", validFormsParam);   
            }
        }catch (Exception e) {
            LOG.error("[UserAppController] update method 加载修改update页面数据异常", e);
        }
        return "validate/validforms_update";
    }
    /**
     * 
     * 描述：修改提交<br/>
     * @param userApp
     * @param model
     * @return
     */
    @RequestMapping(value = "updateSubmit")
    public String updateSubmit(ValidForms validForms,ModelMap model) {
        
        LOG.info("[UserAppController] addUpdate method");
        try{
            if(!InputChecker.isEmpty(validForms)){
               validForms.setRules(JSONObject.fromObject(validForms.getFormRulesJson()).toString());
               validFormsService.update(validForms);
               RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), validFormsService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[UserAppController] addUpdate method 提交异常",e);
        }
        return "redirect:/valid/param/querylist?actionCode="+validForms.getActionCode()+"&context="+validForms.getContext()+"&postUrl="+validForms.getPostUrl()+"&version="+validForms.getVersion();
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
    public Map checkValidForms(ValidForms validForms, ModelMap model) {
        
        LOG.info("[UserAppController] checkValidForms method begin...");
        Map<String,Object> map = new HashMap<>();
        map.put("id", -1);
        List<ValidForms> list = validFormsService.list(validForms);
        if(!InputChecker.isEmpty(list)){
            map.put("id", list.get(0).getId());
            map.put("type", list.get(0).getType());
        }
        return map; 
    }
}
