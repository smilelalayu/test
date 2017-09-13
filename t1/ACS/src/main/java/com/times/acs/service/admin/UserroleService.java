/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.service.admin;

import java.util.Iterator;
import java.util.List;

import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.pojo.admin.UserRolePOJO;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;

/**
 * @author Administrator
 * 
 * TODO 
 */
public interface UserroleService extends IService {

    Iterator getAllUserrole(Long parentId) throws DAOException;

    UserRolePOJO insertUserrole(UserRolePOJO userrole) throws DAOException;

    UserRolePOJO updateUserrole(UserRolePOJO userrole) throws DAOException;

    UserRolePOJO getUserrole(Long userroleId) throws DAOException;

    void deleteUserrole(Long userroleId) throws DAOException;

    Iterator getAllUserrole() throws DAOException;

    void deleteUserrole(UserRolePOJO userroleId) throws DAOException;

    void removeUserroleFromUserInfo(UserInfoPOJO user, List userroles)
            throws DAOException;
    List<UserRolePOJO> getQueryPagingUserRolePOJO(HQLEntityString entityQueryString) throws DAOException;
    List<UserRolePOJO> getQueryUserRolePOJO(HQLEntityString entityQueryString)
			throws DAOException;
    List<UserRolePOJO> updateSaveUserRolePOJO(List<UserRolePOJO> entitys)
			throws DAOException;
    
    List<UserRolePOJO> getAllUserRolePOJO() throws DAOException;
    UserRolePOJO insertUserRolePOJO(UserRolePOJO userRolePOJO) throws DAOException;
    UserRolePOJO updateUserRolePOJO(UserRolePOJO userRolePOJO) throws DAOException;
    UserRolePOJO getUserRolePOJO(Long userRolePOJOId) throws DAOException;
	void deleteUserRolePOJO(Long userRolePOJOId) throws DAOException;
	List<UserRolePOJO> getUserRoleByUserId(Long uid);
	void updateUserRoleUserInfoMapping(Long uid,List<Long> inids);
    
}
