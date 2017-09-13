/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin;


import java.util.List;

import com.times.acs.pojo.admin.SmLog;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;

/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface  SmLogService extends IService {

    List<SmLog> getAllSmLog() throws DAOException;
	SmLog insertSmLog(SmLog smLog) throws DAOException;
	SmLog updateSmLog(SmLog smLog) throws DAOException;
	SmLog getSmLog(Long smLogId) throws DAOException;
	void deleteSmLog(Long smLogId) throws DAOException;
	List<SmLog> updateSaveSmLog(List<SmLog> entitys) throws DAOException;
	 
	List<SmLog> getQueryPagingSmLog(HQLEntityString entityQueryString) throws DAOException;
    List<SmLog> getQuerySmLog(HQLEntityString entityQueryString) throws DAOException;
    void deleteSmLog(List<SmLog> entitys) throws DAOException;
	
	
	
}
