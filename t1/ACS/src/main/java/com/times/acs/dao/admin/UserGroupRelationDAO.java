
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UserGroupRelation;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface UserGroupRelationDAO extends BaseDAO{
    
	public UserGroupRelation insertUserGroupRelation(UserGroupRelation userGroupRelation) throws DAOException;
	public UserGroupRelation updateUserGroupRelation(UserGroupRelation userGroupRelation) throws DAOException;
	public UserGroupRelation loadUserGroupRelation(Long userGroupRelationId) throws DAOException;
	public void deleteUserGroupRelation(Long userGroupRelationId) throws DAOException;  
}
