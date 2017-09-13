package com.hm.bus.dao;

import com.hm.bus.module.BusLnAppCustInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BusLnAppCustInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BusLnAppCustInfo record);

    int insertSelective(BusLnAppCustInfo record);

    BusLnAppCustInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BusLnAppCustInfo record);

    int updateByPrimaryKey(BusLnAppCustInfo record);

    List<Map<String, Object>> selectAll(String batchNo);

    List<BusLnAppCustInfo> selectByAppId(String appId);
}