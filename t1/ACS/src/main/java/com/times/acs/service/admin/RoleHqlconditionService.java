/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin;


import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;
import com.times.acs.pojo.admin.RoleHqlcondition;
import java.util.List;
import com.times.framework.dao.hibernate.dto.HQLEntityString;

/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface  RoleHqlconditionService extends IService {

    List<RoleHqlcondition> getAllRoleHqlcondition() throws DAOException;
	RoleHqlcondition insertRoleHqlcondition(RoleHqlcondition roleHqlcondition) throws DAOException;
	RoleHqlcondition updateRoleHqlcondition(RoleHqlcondition roleHqlcondition) throws DAOException;
	RoleHqlcondition getRoleHqlcondition(Long roleHqlconditionId) throws DAOException;
	void deleteRoleHqlcondition(Long roleHqlconditionId) throws DAOException;
	List<RoleHqlcondition> updateSaveRoleHqlcondition(List<RoleHqlcondition> entitys) throws DAOException;
	 
	List<RoleHqlcondition> getQueryPagingRoleHqlcondition(HQLEntityString entityQueryString) throws DAOException;
    List<RoleHqlcondition> getQueryRoleHqlcondition(HQLEntityString entityQueryString) throws DAOException;
    void deleteRoleHqlcondition(List<RoleHqlcondition> entitys) throws DAOException;
	
	
	
}
