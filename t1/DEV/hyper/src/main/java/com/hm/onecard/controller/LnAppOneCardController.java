package com.hm.onecard.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gep.core.base.BaseController;
import com.gep.core.util.InputChecker;
import com.gep.core.util.RedisUtils;
import com.gep.sys.util.UserUtils;
import com.hm.onecard.service.LnAppOneCardService;
import com.hm.sys.constants.SysConstants;

@Controller
@RequestMapping(value = "/oneCardHm")
public class LnAppOneCardController extends BaseController {
	
	private static final Logger log = Logger.getLogger(LnAppOneCardController.class);
	
	@Autowired
	private LnAppOneCardService lnAppOneCardService;
	
	@Resource
	private ThreadPoolTaskExecutor threadPoolTaskExecutor;
	
	@RequestMapping(value = "reSendOneCard")
	public String reSendOneCard(ModelMap model)
	{
		try
		{
			//获取是否有在发送万卡的标识，避免重复发送
			String flag = RedisUtils.getObject(SysConstants.RE_SEND_WK_REDIS);
			final String userLoginName = UserUtils.getLoginName();
			log.info("LnAppOneCardController reSendOneCard REDIS-RE_SEND_WK_FLAG:"+flag);
			if(SysConstants.RE_SEND_WK_Y.equals(flag)){
				model.addAttribute("messageShow", "还有工单在发送万卡，请稍后操作 ");
				model.addAttribute("redirectURL", "appinfo/appHM/initList");
				return RETURN_SUCCESS;
			}else{
				threadPoolTaskExecutor.execute(new Runnable() {
					@Override
					public void run() {
						try {
							log.info("LnAppOneCardController reSendOneCard Start >>>>>>>>>>>>>>>");
							RedisUtils.putObject(SysConstants.RE_SEND_WK_REDIS, SysConstants.RE_SEND_WK_Y);
							String result = lnAppOneCardService.reSendOneCardBatch();
							RedisUtils.removeObject(SysConstants.RE_SEND_WK_REDIS);
							RedisUtils.putObject(SysConstants.RE_SEND_WK_RESULT+userLoginName, "发送万卡结果: "+result);
							log.info("LnAppOneCardController reSendOneCard End >>>>>>>>>>>>>>>");
						} catch (Exception e) {
							log.error("LnAppController", e);
							if(!InputChecker.isEmpty(RedisUtils.getObject(SysConstants.RE_SEND_WK_REDIS))){
								RedisUtils.removeObject(SysConstants.RE_SEND_WK_REDIS);
							}
							
						}
					}
				});
				model.addAttribute("messageShow", "批量发送万卡已经启用，请稍后进行查询");
				model.addAttribute("redirectURL", "appinfo/appHM/initList");
				return RETURN_SUCCESS;
			}
		}
		catch (Exception e)
		{
			log.error("LnAppController", e);
			return RETURN_FAIL;
		}
	}
	
}
