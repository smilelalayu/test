package com.hm.bus.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gep.core.base.BaseMapper;
import com.gep.core.entity.Page;
import com.hm.bus.module.BusSentLog;

@Repository
public interface BusSentLogMapper extends BaseMapper<BusSentLog, Long>{
    int deleteByPrimaryKey(Integer id);

    int insert(BusSentLog record);

    int insertSelective(BusSentLog record);

    BusSentLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusSentLog record);

    int updateByPrimaryKey(BusSentLog record);

    Page<BusSentLog> selectSelective(BusSentLog busSentLog);

    int insertList(List<BusSentLog> list);
    
} 