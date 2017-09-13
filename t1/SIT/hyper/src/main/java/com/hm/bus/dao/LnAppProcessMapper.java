package com.hm.bus.dao;


import com.gep.core.base.BaseMapper;
import com.hm.bus.module.LnAppProcess;
import org.springframework.stereotype.Repository;

@Repository
public interface LnAppProcessMapper extends BaseMapper<LnAppProcess, Long> {
	
	
	/**<b>updateByAppId</b><br/>
	 * 通过工单ID更新 工单处理流程信息
	 * @param lnAppProcess
	 * @throws Exception
	 * @author 			zhoukailiang
	 * @createDate 		2016年7月13日 下午3:49:03
	 * @version 1.0		
	 * @description		
	 *
	 */
	void updateByAppId(LnAppProcess lnAppProcess) throws Exception;
	
	/**<b>selectByAppId</b><br/>
	 * 通过工单ID查询 工单处理流程信息
	 * @param appId
	 * @return
	 * @author 			zhoukailiang
	 * @createDate 		2016年7月11日 下午5:56:47
	 * @version 1.0		
	 * @description		
	 *
	 */
	LnAppProcess selectByAppId(Long appId);
	
	
	LnAppProcess selectContractExamineStatusByLnAppId(Long lnAppId);
	
}