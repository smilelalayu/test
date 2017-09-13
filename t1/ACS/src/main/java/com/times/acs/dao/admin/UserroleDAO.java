
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UserRolePOJO;


/**
 * @author Administrator
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public interface UserroleDAO extends BaseDAO{
    
	public UserRolePOJO insertUserrole(UserRolePOJO userrole) throws DAOException;
	public UserRolePOJO updateUserrole(UserRolePOJO userrole) throws DAOException;
	public UserRolePOJO loadUserrole(Long userroleId) throws DAOException;
	public void deleteUserrole(Long userroleId) throws DAOException;  
}
