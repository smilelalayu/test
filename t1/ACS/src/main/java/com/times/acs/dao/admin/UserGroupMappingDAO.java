
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UserGroupMapping;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface UserGroupMappingDAO extends BaseDAO{
    
	public UserGroupMapping insertUserGroupMapping(UserGroupMapping userGroupMapping) throws DAOException;
	public UserGroupMapping updateUserGroupMapping(UserGroupMapping userGroupMapping) throws DAOException;
	public UserGroupMapping loadUserGroupMapping(Long userGroupMappingId) throws DAOException;
	public void deleteUserGroupMapping(Long userGroupMappingId) throws DAOException;  
}
