/*
 * 创建日期 2005-8-18
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin;

import java.util.Iterator;
import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;
import com.times.acs.pojo.admin.UsergroupRolePOJO;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface  UsergrouproleService extends IService {

    Iterator getAllUsergrouprole(Long parentId) throws DAOException;
	UsergroupRolePOJO insertUsergrouprole(UsergroupRolePOJO usergrouprole) throws DAOException;
	UsergroupRolePOJO updateUsergrouprole(UsergroupRolePOJO usergrouprole) throws DAOException;
	UsergroupRolePOJO getUsergrouprole(Long usergrouproleId) throws DAOException;
	void deleteUsergrouprole(Long usergrouproleId) throws DAOException;
	Iterator getAllUsergrouprole() throws DAOException;
}
