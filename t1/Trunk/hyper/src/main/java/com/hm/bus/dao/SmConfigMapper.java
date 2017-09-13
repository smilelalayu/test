package com.hm.bus.dao;

import java.util.List;
import java.util.Map;

import com.hm.bus.module.SmConfig;
import org.springframework.stereotype.Repository;

@Repository
public interface SmConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmConfig record);

    int insertSelective(SmConfig record);

    SmConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmConfig record);

    int updateByPrimaryKey(SmConfig record);
    
    List<Map<String,Object>> selectSmConfigMap();
}