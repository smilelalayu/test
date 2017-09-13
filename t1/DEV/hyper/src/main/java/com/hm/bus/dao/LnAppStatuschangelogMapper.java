package com.hm.bus.dao;

import org.springframework.stereotype.Repository;

import com.hm.bus.module.LnAppStatuschangelog;

@Repository
public interface LnAppStatuschangelogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LnAppStatuschangelog record);

    int insertSelective(LnAppStatuschangelog record);

    LnAppStatuschangelog selectByPrimaryKey(Long id);
    
    LnAppStatuschangelog selectByAppId(Long appId);

    int updateByPrimaryKeySelective(LnAppStatuschangelog record);

    int updateByPrimaryKey(LnAppStatuschangelog record);
}