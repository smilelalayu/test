/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.dao.admin.hibernate;

import org.springframework.stereotype.Repository;

import com.times.acs.dao.admin.RoleDAO;
import com.times.acs.pojo.admin.RolesPOJO;
import com.times.framework.dao.hibernate.BaseHibernateDAO;
import com.times.framework.exception.DAOException;

/**
 * @author Administrator
 * 
 *         TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת�� ���� �� ��ѡ�� �� Java �� ������ʽ ��
 *         ����ģ��
 */
@Repository
public class RoleHibernateDAO extends BaseHibernateDAO implements RoleDAO {

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.acs.dao.admin.RoleDAO#insertRole(com.times.acs.pojo.admin.RolesPOJO
	 * )
	 */
	public RolesPOJO insertRole(RolesPOJO role) throws DAOException {

		// TODO �Զ���ɷ������
		try {

			return (RolesPOJO) saveEntity(role);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.dao.role.RoleDAO#updateRole(com.times.wap.pojo.role.RolesPOJO
	 * )
	 */
	public RolesPOJO updateRole(RolesPOJO role) throws DAOException {
		// TODO �Զ���ɷ������
		try {

			return (RolesPOJO) updateEntity(role);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see com.times.wap.dao.role.RoleDAO#loadRole(java.lang.Long)
	 */
	public RolesPOJO loadRole(Long roleId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			return (RolesPOJO) loadEntityById(RolesPOJO.class, roleId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see com.times.wap.dao.role.RoleDAO#deleteRole(java.lang.Long)
	 */
	public void deleteRole(Long roleId) throws DAOException {
		// TODO �Զ���ɷ������
		try {

			removeEntity(loadRole(roleId));
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

}
