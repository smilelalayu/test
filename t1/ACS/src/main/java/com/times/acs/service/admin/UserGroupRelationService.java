/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin;


import java.util.List;
import java.util.Set;

import com.times.acs.pojo.admin.UserGroupPOJO;
import com.times.acs.pojo.admin.UserGroupRelation;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;

/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface  UserGroupRelationService extends IService {

    List<UserGroupRelation> getAllUserGroupRelation() throws DAOException;
	UserGroupRelation insertUserGroupRelation(UserGroupRelation userGroupRelation) throws DAOException;
	UserGroupRelation updateUserGroupRelation(UserGroupRelation userGroupRelation) throws DAOException;
	UserGroupRelation getUserGroupRelation(Long userGroupRelationId) throws DAOException;
	void deleteUserGroupRelation(Long userGroupRelationId) throws DAOException;
	List<UserGroupRelation> updateSaveUserGroupRelation(List<UserGroupRelation> entitys) throws DAOException;
	 
	List<UserGroupRelation> getQueryPagingUserGroupRelation(HQLEntityString entityQueryString) throws DAOException;
    List<UserGroupRelation> getQueryUserGroupRelation(HQLEntityString entityQueryString) throws DAOException;
    void deleteUserGroupRelation(List<UserGroupRelation> entitys) throws DAOException;
	/**
	 * 根据用户id查询所有组织机构信息
	 * @param userId
	 * @return
	 */
    List<UserGroupPOJO> getAllGroupByUserId(Long userId);
    
    
	/**
	 * 根据用户登录名称查询所有组织机构信息
	 * @param userId
	 * @return
	 */
    List<UserGroupPOJO> getAllGroupByUserLoginName(String  userLoginName);
    
    
    /**
     * @param userId 用户ID
     * @return  根据用户取得该用户组织机构，并取得所属组织机构的权限
     */
    Set<String> getAllPermissionByUser(Long userId );
    /**
     * <p>根据用户id删除用户和组织机构之间的关联关系<br/>
     * @title deleUserGroupRelation<br/>
     * @date 2014-7-30 下午3:40:52<br/>
     * @author dongjz<br/>
     * @version v1.0.0
     * </p>
     * 
     * @param userId
     * <pre>
     * 无匹配数据：
     * 成功：
     * 失败：
     * </pre>
     */
    public void deleUserGroupRelationByUserId(Long userId);
}
