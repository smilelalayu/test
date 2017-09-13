package com.hm.bus.dao;

import java.util.List;
import java.util.Map;

import com.gep.core.base.BaseMapper;
import com.hm.bus.module.JjCode;

import org.springframework.stereotype.Repository;

@Repository
public interface JjCodeMapper extends BaseMapper<JjCode, Long> {

    List<Map<String, Object>> selectJjCodeName();

	String selectJjCodeNameByJjGroupId(String repaymentType);

	
} 