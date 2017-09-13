
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UsergroupRolePOJO;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface UsergrouproleDAO extends BaseDAO{
    
	public UsergroupRolePOJO insertUsergrouprole(UsergroupRolePOJO usergrouprole) throws DAOException;
	public UsergroupRolePOJO updateUsergrouprole(UsergroupRolePOJO usergrouprole) throws DAOException;
	public UsergroupRolePOJO loadUsergrouprole(Long usergrouproleId) throws DAOException;
	public void deleteUsergrouprole(Long usergrouproleId) throws DAOException;  
}
