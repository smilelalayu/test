package com.hm.sys.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gep.core.util.OssOpsUtils;

/**
 * @ClassName: OssidController
 * @Description: OSSID操作Controller
 * @author qiuyuan
 * @date 2016年4月27日 上午11:41:04
 * @Copyright (c) 2016, 9fchaoneng.com All Rights Reserved.
 */

@Controller
@RequestMapping("/ossid")
public class OssidController
{


	/**
	 * @Method: getUrl
	 * @Description: 根据OSSID 获取 url
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "getUrl", method = RequestMethod.POST)
	@ResponseBody
	public String getUrl(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			String ossId = request.getParameter("ossid");
			ossId = new String(ossId.getBytes("ISO-8859-1"), "UTF-8");
			String url = OssOpsUtils.getSignUrl(ossId);
			return url;
		}
		catch (UnsupportedEncodingException e1)
		{
			e1.printStackTrace();
			return null;
		}
	}
}
