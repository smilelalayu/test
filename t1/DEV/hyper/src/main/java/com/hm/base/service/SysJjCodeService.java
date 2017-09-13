package com.hm.base.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gep.core.base.BaseService;
import com.hm.base.model.JjCode;

public interface SysJjCodeService extends BaseService<JjCode, Long>
{


	public static Map<String, Map<String, String>> CODEMAP = new HashMap<>();
	
	/**
	 * 根据groupID查询基础数据
	 * @return
	 * @author 洪秋霞
	 * @date
	 */
	public List<JjCode> listByGroupId(Integer groupId);
	
	/**
	 * @Method: getJjCode
	 * @Description: 获取单个jjcode
	 * @author qiuyuan
	 * @param t
	 * @return
	 */
	JjCode getJjCode(JjCode t);

	
	/**
	 * 
	 * @Method: initJjCodeMap
	 * @Description: 初始化工单JJCODE
	 * @author qiuyuan
	 */
	public void initJjCodeMap();
	
	/**
	 * 根据code查询
	 * @param code
	 * @return
	 * @author 洪秋霞
	 * @date
	 */
	public Integer listByCode(String code);
}
