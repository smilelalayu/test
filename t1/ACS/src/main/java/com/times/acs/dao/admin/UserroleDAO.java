
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UserRolePOJO;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface UserroleDAO extends BaseDAO{
    
	public UserRolePOJO insertUserrole(UserRolePOJO userrole) throws DAOException;
	public UserRolePOJO updateUserrole(UserRolePOJO userrole) throws DAOException;
	public UserRolePOJO loadUserrole(Long userroleId) throws DAOException;
	public void deleteUserrole(Long userroleId) throws DAOException;  
}
