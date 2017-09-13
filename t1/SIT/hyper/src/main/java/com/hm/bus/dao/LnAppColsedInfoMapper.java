package com.hm.bus.dao;

import org.springframework.stereotype.Repository;

import com.hm.bus.module.LnAppColsedInfo;

@Repository
public interface LnAppColsedInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LnAppColsedInfo record);

    int insertSelective(LnAppColsedInfo record);

    LnAppColsedInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LnAppColsedInfo record);

    int updateByPrimaryKey(LnAppColsedInfo record);
}