package com.hm.sys.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;

import com.gep.core.util.StringUtil;
import com.gep.util.PropertyUtils;
import com.hm.base.model.JjCode;
import com.hm.base.service.SysJjCodeService;
import com.hm.sys.constants.SysConstants;

/**
 * JjCodeUtil 工具类
 * @ClassName: JjCodeUtil
 * @Description: TODO
 * @author GPLin
 * @date 2016-5-5 下午6:40:40
 * @Copyright (c) 2016, 9fchaoneng.com All Rights Reserved.
 */
public class JjCodeUtil
{
	/**
	 * 通过GroupCode获取JjCode列表
	 * @Method: getJjCodes
	 * @Description: TODO
	 * @param groupCode
	 * @return
	 */
	public static List<JjCode> getJjCodes(String groupCode)
	{
		ApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();
		if (ctx == null)
		{
			return null;
		}
		JjCode jjCode = new JjCode();
		jjCode.setGroupCode(groupCode);
		SysJjCodeService sysJjCodeService = (SysJjCodeService) ctx.getBean(SysJjCodeService.class);
		List<JjCode> jjCodes = sysJjCodeService.list(jjCode);
		return jjCodes;
	}

	/**
	 * 获取工单状态
	 * @Method: getAppStatusJJCode
	 * @Description: TODO 去除01-未提交，05-退回，两个状态
	 * @return
	 */
	public static List<JjCode> getAppStatusJJCode()
	{
		List<JjCode> jjCodes = getJjCodes(SysConstants.JjGroupCode.APPSTATUSVIEW_NEW);
		JjCode jjCode = null;
		Iterator<JjCode> it = jjCodes.iterator();
		while (it.hasNext())
		{
			jjCode = it.next();
			if ("01".equals(jjCode.getCode()) || "05".equals(jjCode.getCode()))
			{
				it.remove();
			}
		}
		return jjCodes;
	}

	/**
	 * 获取工单状态
	 * @Method: getAppStatusApplyJJCode
	 * @Description: TODO 只取01-未提交，05-退回，两个状态
	 * @return
	 */
	public static List<JjCode> getAppStatusApplyJJCode()
	{
		List<JjCode> jjCodes = getJjCodes(SysConstants.JjGroupCode.APPSTATUSVIEW_NEW);
		JjCode jjCode = null;
		Iterator<JjCode> it = jjCodes.iterator();
		while (it.hasNext())
		{
			jjCode = it.next();
			if (!("01".equals(jjCode.getCode()) || "05".equals(jjCode.getCode())))
			{
				it.remove();
			}
		}
		return jjCodes;
	}
	
	/**<b>获取下拉框信息</b><br/>
	 * 
	 * @param groupCode			分组编码 jj_codegroup表中的code字段值
	 * @param includeExpression	包含表达式  如：a;b;c 返回结果 只能在 a、b、c之中
	 * @param excludeExpression	排除表达式 如：a;b;c 返回结果 不能包含 a、b、c
	 * @return
	 * @author 			zhoukailiang
	 * @createDate 		2016年6月24日 下午12:23:52
	 * @version 1.0		
	 * @description		includeExpression与excludeExpression只能有一个有效 优先includeExpression有效
	 * 
	 */
	public static List<JjCode> getJJcode(String groupCode,String includeExpression,String excludeExpression){
		List<JjCode> jjCodes = getJjCodes(groupCode);
		
		
		if(StringUtil.isNotEmpty(includeExpression)){
			List<String> includes = Arrays.asList(includeExpression.split(";"));
			List<JjCode> resultJjCodes = new ArrayList<JjCode>();
			for (Iterator<JjCode> it = jjCodes.iterator();it.hasNext();)
			{
				JjCode jjcode = it.next();
				if(includes.contains(jjcode.getCode()))
				{
					resultJjCodes.add(jjcode);
				}
			}
			jjCodes.clear();
			jjCodes = null;
			return resultJjCodes;
		}
		if(StringUtil.isNotEmpty(excludeExpression)){
			List<String> excludes = Arrays.asList(excludeExpression.split(";"));
			
			for (Iterator<JjCode> it = jjCodes.iterator();it.hasNext();)
			{
				if(excludes.contains(it.next().getCode()))
				{
					it.remove();
				}
			}
		}
		return jjCodes;
	}
	
	
	
	/**<b>获取下拉框信息</b><br/>
	 *  通过JJcode_filter属性文件来配置取数据
	 * @param groupCode			分组编码 jj_codegroup表中的code字段值
	 * @return
	 * @author 			zhoukailiang
	 * @createDate 		2016年6月24日 下午12:23:52
	 * @version 1.0		
	 * 
	 */
	public static List<JjCode> getJJcodeFilter(String groupCode){
		String item_includeExpression = PropertyUtils.getConfig("jjcode_filter", groupCode+"_item_include"); 
		String item_excludeExpression = PropertyUtils.getConfig("jjcode_filter", groupCode+"_item_exclude");
		
		return getJJcode(groupCode,item_includeExpression,item_excludeExpression);
	}
}
