
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UsergroupRolePOJO;


/**
 * @author Administrator
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public interface UsergrouproleDAO extends BaseDAO{
    
	public UsergroupRolePOJO insertUsergrouprole(UsergroupRolePOJO usergrouprole) throws DAOException;
	public UsergroupRolePOJO updateUsergrouprole(UsergroupRolePOJO usergrouprole) throws DAOException;
	public UsergroupRolePOJO loadUsergrouprole(Long usergrouproleId) throws DAOException;
	public void deleteUsergrouprole(Long usergrouproleId) throws DAOException;  
}
