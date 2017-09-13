/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.service.admin;

import java.util.Iterator;
import java.util.List;

import com.times.acs.pojo.admin.RolesPOJO;
import com.times.acs.pojo.admin.UserGroupPOJO;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;

/**
 * @author Administrator
 * 
 *         TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת�� ���� �� ��ѡ�� �� Java �� ������ʽ ��
 *         ����ģ��
 */
public interface UsergroupService extends IService {

	Iterator getAllUsergroup(Long parentId) throws DAOException;

	UserGroupPOJO insertUsergroup(UserGroupPOJO usergroup) throws DAOException;

	UserGroupPOJO updateUsergroup(UserGroupPOJO usergroup) throws DAOException;

	UserGroupPOJO getUsergroup(Long usergroupId) throws DAOException;

	UserGroupPOJO getUsergroup(Long usergroupId, boolean containUsers)
			throws DAOException;

	UserGroupPOJO getUsergroupAndChildUsers(Long usergroupId)
			throws DAOException;

	void deleteUsergroup(Long usergroupId) throws DAOException;

	Iterator getAllUsergroup() throws DAOException;

	UserGroupPOJO getRoot() throws DAOException;

	String getPath(UserGroupPOJO currentGroup) throws DAOException;

	List<UserGroupPOJO> loadAllUsergroupByRoot();

	List<UserGroupPOJO> updateSaveUserGroupPOJO(List<UserGroupPOJO> entitys);

	public void deleteUserGroupPOJO(List<UserGroupPOJO> entitys)
			throws DAOException;

	public void deleteUsergroup(UserGroupPOJO usergroup) throws DAOException;

	List<RolesPOJO> getRolesByUserGroupPOJO(Long ID);

	UserGroupPOJO updateUserGroupPOJORoles(Long groupID, List<Long> roleIDs);

	List<UserGroupPOJO> getQueryPagingUserGroupPOJO(
			HQLEntityString entityQueryString) throws DAOException;

	List<UserGroupPOJO> getQueryUserGroupPOJO(HQLEntityString entityQueryString)
			throws DAOException;
	
	List<UserGroupPOJO> loadAllUsergroupByGroup(Long groupId);
	
	
	String deleteUserGroupManager(String groupId);

}
