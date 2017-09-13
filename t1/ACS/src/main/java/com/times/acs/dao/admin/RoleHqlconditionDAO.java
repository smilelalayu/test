
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.RoleHqlcondition;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface RoleHqlconditionDAO extends BaseDAO{
    
	public RoleHqlcondition insertRoleHqlcondition(RoleHqlcondition roleHqlcondition) throws DAOException;
	public RoleHqlcondition updateRoleHqlcondition(RoleHqlcondition roleHqlcondition) throws DAOException;
	public RoleHqlcondition loadRoleHqlcondition(Long roleHqlconditionId) throws DAOException;
	public void deleteRoleHqlcondition(Long roleHqlconditionId) throws DAOException;  
}
