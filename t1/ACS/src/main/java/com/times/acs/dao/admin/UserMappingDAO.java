
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UserMapping;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface UserMappingDAO extends BaseDAO{
    
	public UserMapping insertUserMapping(UserMapping userMapping) throws DAOException;
	public UserMapping updateUserMapping(UserMapping userMapping) throws DAOException;
	public UserMapping loadUserMapping(Long userMappingId) throws DAOException;
	public void deleteUserMapping(Long userMappingId) throws DAOException;  
}
