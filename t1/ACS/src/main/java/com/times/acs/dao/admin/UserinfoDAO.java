
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UserInfoPOJO;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface UserinfoDAO extends BaseDAO{
    
	public UserInfoPOJO insertUserinfo(UserInfoPOJO userinfo) throws DAOException;
	public UserInfoPOJO updateUserinfo(UserInfoPOJO userinfo) throws DAOException;
	public UserInfoPOJO loadUserinfo(Long userinfoId) throws DAOException;
	public void deleteUserinfo(Long userinfoId) throws DAOException;  
}
