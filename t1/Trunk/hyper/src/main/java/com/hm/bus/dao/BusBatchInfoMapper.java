package com.hm.bus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gep.core.base.BaseMapper;
import com.hm.bus.module.BusBatchInfo;

@Repository
public interface BusBatchInfoMapper extends BaseMapper<BusBatchInfo, Long>{
    int deleteByPrimaryKey(String batchNo);

    int insert(BusBatchInfo record);

    int insertSelective(BusBatchInfo record);

    BusBatchInfo selectByPrimaryKey(String batchNo);

    int updateByPrimaryKeySelective(BusBatchInfo record);

    int updateByPrimaryKey(BusBatchInfo record);

	List<String> selectAppIdsByBatchNO(String batchNO);


//    int updateTotalSuccessByBatchNo(String batchNo);
//
//    int updateTotalFailByBatchNo(String batchNo);
    
	Map<String, Long> selectSentTotal(@Param("batchNO") String batchNO);

	void updateBeginDateAndSentToBusByBatchNO(String batchNO);

}    