
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UserGroupPOJO;


/**
 * @author Administrator
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public interface UsergroupDAO extends BaseDAO{
    
	public UserGroupPOJO insertUsergroup(UserGroupPOJO usergroup) throws DAOException;
	public UserGroupPOJO updateUsergroup(UserGroupPOJO usergroup) throws DAOException;
	public UserGroupPOJO loadUsergroup(Long usergroupId) throws DAOException;
	public void deleteUsergroup(Long usergroupId) throws DAOException;  
    public void deleteUsergroup(UserGroupPOJO usergroup) throws DAOException;
}
