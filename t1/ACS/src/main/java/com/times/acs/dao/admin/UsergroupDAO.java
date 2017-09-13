
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UserGroupPOJO;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface UsergroupDAO extends BaseDAO{
    
	public UserGroupPOJO insertUsergroup(UserGroupPOJO usergroup) throws DAOException;
	public UserGroupPOJO updateUsergroup(UserGroupPOJO usergroup) throws DAOException;
	public UserGroupPOJO loadUsergroup(Long usergroupId) throws DAOException;
	public void deleteUsergroup(Long usergroupId) throws DAOException;  
    public void deleteUsergroup(UserGroupPOJO usergroup) throws DAOException;
}
