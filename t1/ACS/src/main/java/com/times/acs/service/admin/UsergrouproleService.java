/*
 * �������� 2005-8-18
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.service.admin;

import java.util.Iterator;
import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;
import com.times.acs.pojo.admin.UsergroupRolePOJO;


/**
 * @author Administrator
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public interface  UsergrouproleService extends IService {

    Iterator getAllUsergrouprole(Long parentId) throws DAOException;
	UsergroupRolePOJO insertUsergrouprole(UsergroupRolePOJO usergrouprole) throws DAOException;
	UsergroupRolePOJO updateUsergrouprole(UsergroupRolePOJO usergrouprole) throws DAOException;
	UsergroupRolePOJO getUsergrouprole(Long usergrouproleId) throws DAOException;
	void deleteUsergrouprole(Long usergrouproleId) throws DAOException;
	Iterator getAllUsergrouprole() throws DAOException;
}
