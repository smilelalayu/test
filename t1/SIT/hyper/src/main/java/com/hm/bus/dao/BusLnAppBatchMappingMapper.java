package com.hm.bus.dao;

import com.hm.bus.module.BusLnAppBatchMapping;
import com.hm.bus.module.BusLnAppBatchMappingKey;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusLnAppBatchMappingMapper {
    int deleteByPrimaryKey(BusLnAppBatchMappingKey key);

    int insert(BusLnAppBatchMapping record);

    int insertSelective(BusLnAppBatchMapping record);

    BusLnAppBatchMapping selectByPrimaryKey(BusLnAppBatchMappingKey key);

    int updateByPrimaryKeySelective(BusLnAppBatchMapping record);

    int updateByPrimaryKey(BusLnAppBatchMapping record);

    List<String> selectByBatchNo(String batchNo);
    
    int insertList(List<BusLnAppBatchMapping> busLnAppBatchMappingList);

    List<BusLnAppBatchMapping> selectByLnAppId(String lnAppId);
}