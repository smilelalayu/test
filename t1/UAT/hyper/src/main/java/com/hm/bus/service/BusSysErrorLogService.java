package com.hm.bus.service;

import com.gep.core.base.BaseService;
import com.gep.core.entity.Page;
import com.hm.bus.module.BusSysErrorLog;

/**
 * 用于向bus_sys_error_log存储系统异常记录
 *  @author leimeng  E-mail: leimeng@9fchaoneng.com
 *  @version 创建时间：2017年1月23日  上午10:52:36
 */
public interface BusSysErrorLogService extends BaseService<BusSysErrorLog, Long>{

	void saveError(Object message);

	void saveError(Object message, Throwable t);
	/**
     * 条件查询
     */
	Page<BusSysErrorLog> listAll(Page<BusSysErrorLog> page);
}
