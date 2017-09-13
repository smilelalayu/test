package com.hm.bus.service;

import java.util.List;

import com.gep.core.base.BaseService;
import com.gep.core.entity.Page;
import com.hm.bus.module.BusBatchInfo;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.module.BusSentLog;
import com.hm.bus.util.Result;

/**
 * @author liujie
 * @date 2017/1/12
 * @time 15:55
 * @desc
 */
public interface BusSentLogService extends BaseService<BusSentLog, Long> {


	/**
     * 条件查询
     */

	Page<BusSentLog> listAll(Page<BusSentLog> page);

}
