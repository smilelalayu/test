
package com.times.acs.dao.admin;

import com.times.acs.pojo.admin.SmNotice;
import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface SmNoticeDAO extends BaseDAO{
    
	public SmNotice insertSmNotice(SmNotice smNotice) throws DAOException;
	public SmNotice updateSmNotice(SmNotice smNotice) throws DAOException;
	public SmNotice loadSmNotice(Long smNoticeId) throws DAOException;
	public void deleteSmNotice(Long smNoticeId) throws DAOException;  
}
