package com.hm.bus.dao;

import com.hm.bus.module.BusLnContractInfo;
import com.hm.bus.module.LnContractInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BusLnContractInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BusLnContractInfo record);

    int insertSelective(BusLnContractInfo record);

    BusLnContractInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BusLnContractInfo record);

    int updateByPrimaryKey(BusLnContractInfo record);

    List<BusLnContractInfo> selectByAppId(Long appId);

    List<Map<String, Object>>selectByAppIds(List<String> appIds);
}