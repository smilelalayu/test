
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UserMsg;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface UserMsgDAO extends BaseDAO{
    
	public UserMsg insertUserMsg(UserMsg userMsg) throws DAOException;
	public UserMsg updateUserMsg(UserMsg userMsg) throws DAOException;
	public UserMsg loadUserMsg(Long userMsgId) throws DAOException;
	public void deleteUserMsg(Long userMsgId) throws DAOException;  
}
