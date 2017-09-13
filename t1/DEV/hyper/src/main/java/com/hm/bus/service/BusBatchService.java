package com.hm.bus.service;

import java.util.List;

import com.gep.core.base.BaseService;
import com.gep.core.entity.Page;
import com.hm.bus.module.BusBatchInfo;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.util.Result;

/**
 * @author liujie
 * @date 2017/1/12
 * @time 15:55
 * @desc
 */
public interface BusBatchService extends BaseService<BusBatchInfo, Long> {
	
	public void reloadBaseInfo();

	public Result send(String batchNo);

	public BusBatchInfo selectByPrimaryKey(String batchNo);

	public void importBusBatch(String batchNo, String fileKey, String fileName, List<BusLnApp> lnAppList, String UserID, String userName,String reqAppayDate );

	public String getBatchNo();

	/**
	 * 条件查询
	 */
	Page<BusBatchInfo> list(Page<BusBatchInfo> page);

	List<String> selectAppIdsByBatchNO(String batchNO);

	/**
	 * 根据批次号查找数据放入redis
	 * 
	 * @param batchNo
	 */
	public void toRedisByBatchNo(String batchNo);

	/**
	 * 根据批次号更新发送时间和sentToBus字段
	 * 
	 * @param batchNO
	 */
	public void updateBeginDateAndSentToBusByBatchNO(String batchNO);

}
