/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.service.admin;

import java.util.Iterator;
import java.util.List;

import com.times.acs.pojo.admin.PermissionsPOJO;
import com.times.acs.pojo.admin.RolesPOJO;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;

/**
 * @author Administrator
 *
 */
public interface RoleService extends IService {

	Iterator getAllRole(Long parentId) throws DAOException;

	RolesPOJO insertRole(RolesPOJO role) throws DAOException;

	RolesPOJO updateRole(RolesPOJO role) throws DAOException;

	RolesPOJO getRole(Long roleId) throws DAOException;
	
	RolesPOJO getRoleByCode(String code) throws DAOException;
	

	void deleteRole(Long roleId) throws DAOException;

	List getAllRole() throws DAOException;

	void deleteRolesPOJO(List<RolesPOJO> entitys) throws DAOException;

	List<RolesPOJO> updateSaveRolesPOJO(List<RolesPOJO> entitys)
			throws DAOException;

	List<RolesPOJO> getQueryRolesPOJO(HQLEntityString entityQueryString)
			throws DAOException;

	List<RolesPOJO> getQueryPagingRolesPOJO(HQLEntityString entityQueryString)
			throws DAOException;

	List<UserInfoPOJO> getUserByRoleID(Long roleID) throws DAOException;

	void updateRolesUserMapping(Long roleID, List<Long> userIDs,String ip,String userName);

	/**
	 * @param roleNames
	 *            以逗号分隔的角色名称
	 * @return
	 */
	List<RolesPOJO> getRolesByRoleName(String roleNames);

	List<PermissionsPOJO> getPermissionsByRoleID(Long roleID);
	/**
	 * 根据角色代码查角色
	 * @param roleCodes
	 * @return
	 */
	List<RolesPOJO> getRolesByRoleCodes(List<String> roleCodes);
	
	void updateRolesUserMappingLog(Long roleID, List<Long> userIDs,List<String> userNames,String ip,String userName);

}
