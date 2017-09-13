package com.hm.bus.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gep.core.base.BaseController;
import com.gep.core.entity.Page;
import com.hm.bus.module.BusBatchInfo;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.module.BusSentLog;
import com.hm.bus.module.BusSysErrorLog;
import com.hm.bus.service.BusSentLogService;

/**
 * BUS日志控制类
 * 
 * @author leimeng E-mail: leimeng@9fchaoneng.com
 * @version 创建时间：2017年1月12日 下午2:58:46
 */
@Controller
@RequestMapping("/bus/log")
public class BusSendLogController extends BaseController {

	private static final Logger LOG = Logger
			.getLogger(BusSendLogController.class);

	@Autowired
	private BusSentLogService busSentLogService;

	// 跳到推送日志查询页面
	@RequestMapping(value = "list")
	public String list(ModelMap model) {
		return "bus/log/list";
	}
	
	// 推bus日志
	@RequestMapping(value = "querylist")
	public String querylist(BusSentLog busSentLog, ModelMap model) {
		LOG.info("[BusSendLogController] list method begin...");
		Page<BusSentLog> page = new Page<BusSentLog>();
		try {
			if (busSentLog != null) {
				page = getPage(busSentLog);
				busSentLogService.listAll(page);
			}
		} catch (Exception e) {
			LOG.error("[BusSendLogController] list method 加载List页面异常", e);
		}
		model.addAttribute("busSentLog", busSentLog);
		model.addAttribute("pageReq", page);

		LOG.info("[BusSendLogController] list method end...");
		return "/bus/log/list";
	}

}
