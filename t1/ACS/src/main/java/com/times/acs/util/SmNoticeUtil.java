package com.times.acs.util;

import com.times.acs.pojo.admin.SmNotice;
import com.times.acs.service.admin.SmNoticeService;
import com.times.framework.service.ServiceLocator;

public class SmNoticeUtil {
	
	
	
	/**
	 * 发送系统消息
	 * @param receiveId 接收人id
	 * @param receiveName 接收人名称
	 * @param moduleId 模块 jjcode
	 * @param ntTitle  标题
	 * @param ntContent 内容
	 * @param receiveOrgId 接收人组织机构
	 * @param receiveDeptId 接收人部门
	 * @param receiveDeptName 接收人部门名称
	 * @param linkPage 链接跳转UI
	 * @return
	 */
	public static SmNotice  sendNotice(Long receiveId, String receiveName, Integer moduleId,
			String ntTitle, String ntContent, Long receiveOrgId,
			Long receiveDeptId, String receiveDeptName, String linkPage){
		
		SmNotice sn = new SmNotice(receiveId, receiveName, moduleId, ntTitle, ntContent, receiveOrgId, receiveDeptId, receiveDeptName, linkPage);
		
		SmNoticeService smNoticeService = (SmNoticeService) ServiceLocator
				.getService("smNoticeService");
		sn = smNoticeService.insertSmNotice(sn);
		return sn;
		
		
	}
}
