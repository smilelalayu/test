/**
 * Copyright 2017 ECCloud Corporation. All rights reserved.
 *
 * --------------------------------------------------------
 * 此技术信息为本公司机密信息，未经本公司书面同意禁止向第三方披露.
 * 版权所有：9fchaoneng
 * --------------------------------------------------------
 */

package com.hm.userauth.controller;

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
import com.hm.userauth.model.UserChannel;
import com.hm.userauth.service.UserChannelMangerService;

@Controller
@RequestMapping(value = "/userauth/channel/")
public class UserChannelMangerController extends BaseController{
     
    private static final Logger LOG = Logger.getLogger(UserChannelMangerController.class);
    
    @Autowired
    private UserChannelMangerService userChannelService;
    
    @Resource
    @Qualifier("jedisConnectionFactory")
    private JedisConnectionFactory jedisConnectionFactory;
    
    @RequestMapping(value = "list")
    public String list(ModelMap model) {
        return "userauth/userchannel_list";
    }
    // 条件查询
    @RequestMapping(value = "querylist")
    public String queryList(UserChannel userChannel, ModelMap model) {
        
        LOG.info("[UserChannelController] queryList method begin...");
        Page<UserChannel> page = new Page<>();
        try {
            page = getPage(userChannel);
            userChannelService.list(page);
        } catch (Exception e) {
            LOG.error("[UserChannelController] queryList method 加载List页面异常", e);
        }
        model.addAttribute("userChannel", userChannel);
        model.addAttribute("pageReq", page);
        
        LOG.info("[UserChannelController] queryList method end...");
        return "userauth/userchannel_list";
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
        return "userauth/userchannel_add";
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
    public String addSubmit(UserChannel userChannel,ModelMap model) {
        LOG.info("[UserChannelController] addSubmit method");
        try{
            if(!InputChecker.isEmpty(userChannel)){
            	UserChannel userChannelTemp = new UserChannel();
            	userChannelTemp.setChannelCode(userChannel.getChannelCode());
            	List<UserChannel> channels= userChannelService.list(userChannelTemp);
                if(InputChecker.isEmpty(channels)){
                	 userChannel.setChannelCode(userChannel.getChannelCode().trim());
                	 userChannelService.insert(userChannel);
                }
                RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), userChannelService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[UserChannelController] addSubmit method 提交异常",e);
        }
        return "redirect:/userauth/channel/querylist";
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
        LOG.info("[UserChannelController] update method");
        try{
            UserChannel userChannel = new UserChannel ();
            userChannel.setId(Long.parseLong(id));
            List<UserChannel> lists = userChannelService.list(userChannel);  
            if(!InputChecker.isEmpty(lists)){
                model.addAttribute("userChannel", lists.get(0)); 
            }
        }catch (Exception e) {
            LOG.error("[UserChannelController] update method 加载修改update页面数据异常", e);
        }
        return "userauth/userchannel_update";
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
    public String updateSubmit(UserChannel userChannel,ModelMap model) {
        
        LOG.info("[UserChannelController] addUpdate method");
        try{
            if(!InputChecker.isEmpty(userChannel)){
               userChannelService.update(userChannel);
               RedisUtils.removeObjectFromDB( jedisConnectionFactory.getDatabase(), userChannelService.getMybtaisMapperName());
            } 
        }catch (Exception e) {
            LOG.error("[UserChannelController] addUpdate method 提交异常",e);
        }
        return "redirect:/userauth/channel/querylist";
    }
    
}
