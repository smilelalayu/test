package com.hm.bus.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gep.core.base.BaseController;
import com.gep.core.entity.Page;
import com.gep.core.util.RedisUtils;
import com.gep.core.util.StringUtil;
import com.gep.util.PropertyUtils;
import com.hm.bus.constants.BusReturn;
import com.hm.bus.module.BusBatchInfo;
import com.hm.bus.service.BusBatchService;
import com.hm.bus.service.BusSentLogService;
import com.hm.bus.util.DateUtil;
import com.hm.bus.util.ResultInfo;

/**
 * BUS批次控制类
 * 
 * @author leimeng E-mail: leimeng@9fchaoneng.com
 * @version 创建时间：2017年1月12日 下午2:58:46
 */
@Controller
@RequestMapping("/bus/batch")
public class BusBatchController extends BaseController {

	private static final Logger LOG = Logger
			.getLogger(BusBatchController.class);
	@Autowired
	private BusBatchService busBatchInfoService;
	@Autowired
	private BusSentLogService busSentLogService;

	// 跳到批次查询页面
	@RequestMapping(value = "list")
	public String list(ModelMap model) {
		LOG.info("[BusBatchController] list method begin...");
		// add by leimeng 20170309 增加反保理转保理开关控制
		String butSwitch = PropertyUtils.getConfig("bus", "com.hm.bus.posdbl2bl.switch");
		String dbl2blSwitch = RedisUtils.getObject("BUS_POS_DBL2BL_SWITCH");
		LOG.info("[BusBatchController] list method butSwitch "+butSwitch+", dbl2blSwitch "+dbl2blSwitch);
		model.addAttribute("butSwitch", butSwitch);
		model.addAttribute("dbl2blSwitch", dbl2blSwitch);

		LOG.info("[BusBatchController] list method end...");
		return "/bus/batch/list"; 
	}
	
	
	

	@RequestMapping(value = "querylist")
	public String querylist(BusBatchInfo batch, ModelMap model) {
		LOG.info("[BusBatchController] list method begin...");
		Page<BusBatchInfo> page = new Page<BusBatchInfo>();
		try {
			if (batch != null) {
				//开始及结束时间格式化
				if (batch.getBeginDate() != null) {
					batch.setBeginDate(DateUtil.getBeginDate(batch.getBeginDate()));
				}
				if (batch.getEndDate() != null) {
					batch.setEndDate(DateUtil.getEndDate(batch.getEndDate() ));
				}
				page = getPage(batch);
				busBatchInfoService.list(page);
			} else {
				batch.setBeginDate(new Date());
			}

		} catch (Exception e) {
			LOG.error("[BusBatchController] list method 加载List页面异常", e);
		}
		// add by leimeng 20170309 增加反保理转保理开关控制
		String butSwitch = PropertyUtils.getConfig("bus", "com.hm.bus.posdbl2bl.switch");
		String dbl2blSwitch = RedisUtils.getObject("BUS_POS_DBL2BL_SWITCH");
		model.addAttribute("butSwitch", butSwitch);
		model.addAttribute("dbl2blSwitch", dbl2blSwitch);
		LOG.info("[BusBatchController] querylist method butSwitch "+butSwitch+", dbl2blSwitch "+dbl2blSwitch);
		model.addAttribute("batch", batch);
		model.addAttribute("pageReq", page);
		model.addAttribute("redisSize",  RedisUtils.getLength(BusReturn.BUS_REDIS_LIST));

		LOG.info("[BusBatchController] list method end...");
		return "/bus/batch/list";
	}

	@RequestMapping(value = "send")
	@ResponseBody
	public ResultInfo send(HttpServletRequest request,
			HttpServletResponse response) {
		LOG.info("[BusBatchController] send method begin...");
		ResultInfo rs = new ResultInfo();

		// TODO ====================执行发送操作==========================

		rs.setStatus(true);
		rs.setMessage("发送成功");

		LOG.info("[BusBatchController] send method end...");

		return rs;
	}
	
	@RequestMapping(value = "controlSwitch")
	@ResponseBody
	public ResultInfo controlSwitch(HttpServletRequest request, HttpServletResponse response) {
		LOG.info("[BusBatchController] controlSwitch method begin...");
		ResultInfo rs = new ResultInfo();
		try {
			
			// add by leimeng 20170309 增加反保理转保理开关控制
			String butSwitch = PropertyUtils.getConfig("bus", "com.hm.bus.posdbl2bl.switch");
			LOG.info("[BusBatchController] controlSwitch method butSwitch:"+butSwitch);
			if ("Y".equals(butSwitch)) {
				
				String dbl2blSwitch = RedisUtils.getObject("BUS_POS_DBL2BL_SWITCH");
				LOG.info("[BusBatchController] controlSwitch method dbl2blSwitch"+dbl2blSwitch);
				String isSwitch = request.getParameter("isSwitch");
				
				if(StringUtil.equals(isSwitch, dbl2blSwitch) && isSwitch!=null){
					if("Y".equals(isSwitch)){
						rs.setStatus(false);
						rs.setMessage("已经开启,不能重复开启!");
					}
					if("N".equals(isSwitch)){
						rs.setStatus(false);
						rs.setMessage("已经关闭,不能重复开启!");
					}
				}
				
				if(!StringUtil.equals(isSwitch, dbl2blSwitch) && isSwitch!=null){
					if("Y".equals(isSwitch)){
						RedisUtils.putObject("BUS_POS_DBL2BL_SWITCH","Y");
						rs.setStatus(true);
						rs.setMessage("开启成功!");
					}
					if("N".equals(isSwitch)){
						RedisUtils.putObject("BUS_POS_DBL2BL_SWITCH","N");
						rs.setStatus(true);
						rs.setMessage("关闭成功!");
					}
				}
				
			} else {
				rs.setStatus(false);
				rs.setMessage("反保理转保理开关控制已禁用!");
			}
		} catch (Exception e) {
			rs.setStatus(false);
			rs.setMessage("反保理转保理开关控制失败!");
			LOG.info("[BusBatchController] controlSwitch method 启动确认放款状态任务失败", e);
		}

		LOG.info("[BusBatchController] controlSwitch method end");
		return rs;
	}
}
