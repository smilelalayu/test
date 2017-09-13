
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.RolesPOJO;


/**
 * @author Administrator
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public interface RoleDAO extends BaseDAO{
    
	public RolesPOJO insertRole(RolesPOJO role) throws DAOException;
	public RolesPOJO updateRole(RolesPOJO role) throws DAOException;
	public RolesPOJO loadRole(Long roleId) throws DAOException;
	public void deleteRole(Long roleId) throws DAOException;  
}
