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
import com.hm.bus.module.BusSysErrorLog;
import com.hm.bus.service.BusSentLogService;
import com.hm.bus.service.BusSysErrorLogService;
import com.hm.bus.util.DateUtil;

/**
 * 系统日志控制类
 * 
 * @author zhangyankun
 *
 */
@Controller
@RequestMapping("/bus/syslog")
public class BusSysErrorLogController extends BaseController {

	private static final Logger LOG = Logger.getLogger(BusSysErrorLogController.class);

	@Autowired
	private BusSysErrorLogService busSysErrorLogService;

	// 跳到系统日志查询页面
	@RequestMapping(value = "list")
	public String list(ModelMap model) {
		return "bus/syslog/list";
	}

	// 系统日志
	@RequestMapping(value = "querylist")
	public String querylist(BusSysErrorLog busSysErrorLog, ModelMap model) {
		LOG.info("[BusSysErrorLogController] querylist method begin...");
		Page<BusSysErrorLog> page = new Page<BusSysErrorLog>();
		try {
			if (busSysErrorLog != null) {
				// 开始及结束时间格式化
				if (busSysErrorLog.getBeginDate() != null) {
					busSysErrorLog.setBeginDate(DateUtil.getBeginDate(busSysErrorLog.getBeginDate()));
				}
				if (busSysErrorLog.getEndDate() != null) {
					busSysErrorLog.setEndDate(DateUtil.getEndDate(busSysErrorLog.getEndDate()));
				}
				page = getPage(busSysErrorLog);
				busSysErrorLogService.listAll(page);
			}
		} catch (Exception e) {
			LOG.error("[BusSysErrorLogController] querylist method 加载list页面异常", e);
		}
		model.addAttribute("busSysErrorLog", busSysErrorLog);
		model.addAttribute("pageReq", page);

		LOG.info("[BusSysErrorLogController] syslog method end...");
		return "/bus/syslog/list";
	}

}
