
package com.times.acs.dao.admin;

import com.times.acs.pojo.admin.SmLog;
import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface SmLogDAO extends BaseDAO{
    
	public SmLog insertSmLog(SmLog smLog) throws DAOException;
	public SmLog updateSmLog(SmLog smLog) throws DAOException;
	public SmLog loadSmLog(Long smLogId) throws DAOException;
	public void deleteSmLog(Long smLogId) throws DAOException;  
}
