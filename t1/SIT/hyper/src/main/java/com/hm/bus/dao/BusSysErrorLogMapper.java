package com.hm.bus.dao;

import org.springframework.stereotype.Repository;

import com.gep.core.base.BaseMapper;
import com.hm.bus.module.BusSentLog;
import com.hm.bus.module.BusSysErrorLog;

@Repository
public interface BusSysErrorLogMapper extends BaseMapper<BusSysErrorLog, Long> {
    int deleteByPrimaryKey(Integer id);

    int insert(BusSysErrorLog record);

    int insertSelective(BusSysErrorLog record);

    BusSysErrorLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusSysErrorLog record);

    int updateByPrimaryKey(BusSysErrorLog record);
}