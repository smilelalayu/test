package com.hm.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.util.ObjectUtils;
import com.hm.base.dao.JjCodeHmMapper;
import com.hm.base.model.JjCode;
import com.hm.base.service.SysJjCodeService;
import com.hm.sys.constants.SysConstants;

@Service
public class SysJjCodeServiceImpl extends BaseServiceImpl<JjCode, Long> implements SysJjCodeService
{
	@Autowired
	private JjCodeHmMapper JjCodeHmMapper;


	@Override
	public BaseMapper<JjCode, Long> getMapper()
	{
		initJjCodeMap();
		return JjCodeHmMapper;
	}

	/**
	 * 根据groupID查询基础数据
	 * @return
	 * @author 洪秋霞
	 * @date
	 */
	public List<JjCode> listByGroupId(Integer groupId)
	{
		return JjCodeHmMapper.listByGroupId(groupId);
	}

	@Override
	public JjCode getJjCode(JjCode t)
	{
		try
		{
			return ObjectUtils.convertObject(super.list(t));
		}
		catch (Exception e)
		{
			return new JjCode();
		}
	}

	/**
	 * @Method: initJjCodeMap
	 * @Description: 初始化常用JJCODE列表
	 * @author qiuyuan
	 */
	public void initJjCodeMap()
	{
		if (CODEMAP.keySet().isEmpty())
		{
			initCode(SysConstants.JJ_CODE_EDUCATIONLEVEL);//教育程度
			initCode(SysConstants.JJ_CODE_MARITALSTATUS);//婚姻状态
			initCode(SysConstants.JJ_CODE_ADDREREGIST);//注册地址
			initCode(SysConstants.JJ_CODE_HOUSINGSITUATION);//住房情况
			initCode(SysConstants.JJ_CODE_INDUSTRYCATEGORY);//行业类别
			initCode(SysConstants.JJ_CODE_UNITPROPERTY);//单位性质
			initCode(SysConstants.JJ_CODE_BUYINSURANCE);//社保 情况
			initCode(SysConstants.JJ_CODE_POSITIONLEVEL);//职位信息
			initCode(SysConstants.JJ_CODE_OCCUPATION);//职业信息
			initCode(SysConstants.JJ_CODE_POSTADDRESS);//邮寄地址
			
			
			
		}

	}

	private void initCode(String groupCode)
	{
		JjCode t = new JjCode();
		t.setGroupCode(groupCode);
		List<JjCode> list = JjCodeHmMapper.list(t);

		Map<String, String> map = new HashMap<>();
		for (JjCode code : list)
		{
			map.put(code.getCode(), code.getName());
		}

		CODEMAP.put(groupCode, map);
	}

	/**
	 * 根据code查询
	 * @param code
	 * @return
	 * @author 洪秋霞
	 * @date
	 */
	@Override
	public Integer listByCode(String code) {
		return JjCodeHmMapper.listByCode(code);
	}

}
