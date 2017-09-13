package com.hm.base.dao;

import java.util.List;

import com.gep.core.base.BaseMapper;
import com.hm.base.model.JjCode;

public interface JjCodeHmMapper extends BaseMapper<JjCode, Long> {
	
	/**
	 * 根据groupID查询基础数据
	 * @return
	 * @author 洪秋霞
	 * @date
	 */
	public List<JjCode> listByGroupId(Integer groupId);
	
	/**
	 * 根据code查询
	 * @param code
	 * @return
	 * @author 洪秋霞
	 * @date
	 */
	public Integer listByCode(String code);
}