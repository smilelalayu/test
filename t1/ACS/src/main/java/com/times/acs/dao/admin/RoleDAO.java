
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.RolesPOJO;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface RoleDAO extends BaseDAO{
    
	public RolesPOJO insertRole(RolesPOJO role) throws DAOException;
	public RolesPOJO updateRole(RolesPOJO role) throws DAOException;
	public RolesPOJO loadRole(Long roleId) throws DAOException;
	public void deleteRole(Long roleId) throws DAOException;  
}
