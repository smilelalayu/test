
package com.times.acs.dao.admin;

import com.times.acs.pojo.admin.SmApplication;
import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface SmApplicationDAO extends BaseDAO{
    
	public SmApplication insertSmApplication(SmApplication smApplication) throws DAOException;
	public SmApplication updateSmApplication(SmApplication smApplication) throws DAOException;
	public SmApplication loadSmApplication(Long smApplicationId) throws DAOException;
	public void deleteSmApplication(Long smApplicationId) throws DAOException;  
}
