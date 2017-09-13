/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin;


import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;
import com.times.acs.pojo.admin.UserGroupMapping;
import com.times.acs.pojo.admin.UserMapping;

import java.util.List;
import com.times.framework.dao.hibernate.dto.HQLEntityString;

/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface  UserGroupMappingService extends IService {

    List<UserGroupMapping> getAllUserGroupMapping() throws DAOException;
	UserGroupMapping insertUserGroupMapping(UserGroupMapping userGroupMapping) throws DAOException;
	UserGroupMapping updateUserGroupMapping(UserGroupMapping userGroupMapping) throws DAOException;
	UserGroupMapping getUserGroupMapping(Long userGroupMappingId) throws DAOException;
	void deleteUserGroupMapping(Long userGroupMappingId) throws DAOException;
	List<UserGroupMapping> updateSaveUserGroupMapping(List<UserGroupMapping> entitys) throws DAOException;
	 
	List<UserGroupMapping> getQueryPagingUserGroupMapping(HQLEntityString entityQueryString) throws DAOException;
    List<UserGroupMapping> getQueryUserGroupMapping(HQLEntityString entityQueryString) throws DAOException;
    void deleteUserGroupMapping(List<UserGroupMapping> entitys) throws DAOException;
	
	
    /**
	 * 根据内网的机构 String ID 得到Long 型ID 
	 * 如果有直接返回，没有就新建然后返回
	 * @return
	 */
	public UserGroupMapping updateGetUserGroupMappingByCode(String strGroupId);
	
	/**
	 * 获取某处室所在的司局
	 * @param deptId
	 * @return
	 */
	public UserGroupMapping getSJGroupByDepartment(String deptId);
	
	
	/**
	 * 根据机构ID查询对象
	 * @param jgId
	 * @return
	 * @throws DAOException
	 */
	public UserGroupMapping getByJgId(String jgId) throws DAOException;
}
