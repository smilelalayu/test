/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin;


import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;
import com.times.acs.pojo.admin.UserMsg;
import java.util.List;
import com.times.framework.dao.hibernate.dto.HQLEntityString;

/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface  UserMsgService extends IService {

    List<UserMsg> getAllUserMsg() throws DAOException;
	UserMsg insertUserMsg(UserMsg userMsg) throws DAOException;
	UserMsg updateUserMsg(UserMsg userMsg) throws DAOException;
	UserMsg getUserMsg(Long userMsgId) throws DAOException;
	void deleteUserMsg(Long userMsgId) throws DAOException;
	List<UserMsg> updateSaveUserMsg(List<UserMsg> entitys) throws DAOException;
	 
	List<UserMsg> getQueryPagingUserMsg(HQLEntityString entityQueryString) throws DAOException;
    List<UserMsg> getQueryUserMsg(HQLEntityString entityQueryString) throws DAOException;
    void deleteUserMsg(List<UserMsg> entitys) throws DAOException;
	
	
	
}
