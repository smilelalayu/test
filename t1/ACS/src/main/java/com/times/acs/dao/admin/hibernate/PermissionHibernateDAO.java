/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.dao.admin.hibernate;

import org.springframework.stereotype.Repository;

import com.times.framework.dao.hibernate.BaseHibernateDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.dao.admin.PermissionDAO;
import com.times.acs.pojo.admin.PermissionsPOJO;

/**
 * @author Administrator
 * 
 * TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת�� ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
@Repository
public class PermissionHibernateDAO extends BaseHibernateDAO implements
        PermissionDAO {

    /*
     * ���� Javadoc��
     * 
     * @see com.times.acs.dao.admin.PermissionDAO#insertPermission(com.times.acs.pojo.admin.PermissionsPOJO)
     */
    public PermissionsPOJO insertPermission(PermissionsPOJO permission)
            throws DAOException {

        // TODO �Զ���ɷ������
        try {

            return (PermissionsPOJO) saveEntity(permission);
        } catch (Exception e) {
            throw (new DAOException(e));
        }

    }

    /*
     * ���� Javadoc��
     * 
     * @see com.times.wap.dao.permission.PermissionDAO#updatePermission(com.times.wap.pojo.permission.PermissionsPOJO)
     */
    public PermissionsPOJO updatePermission(PermissionsPOJO permission)
            throws DAOException {
        // TODO �Զ���ɷ������
        try {

            return (PermissionsPOJO) updateEntity(permission);
        } catch (Exception e) {
            throw (new DAOException(e));
        }
    }

    /*
     * ���� Javadoc��
     * 
     * @see com.times.wap.dao.permission.PermissionDAO#loadPermission(java.lang.Long)
     */
    public PermissionsPOJO loadPermission(Long permissionId)
            throws DAOException {
        // TODO �Զ���ɷ������
        try {
            return (PermissionsPOJO) loadEntityById(PermissionsPOJO.class,
                    permissionId);
        } catch (Exception e) {
            throw (new DAOException(e));
        }
    }

    public PermissionsPOJO loadPermission(String permissionId)
            throws DAOException {
        try {
            return (PermissionsPOJO) loadEntityById(PermissionsPOJO.class,
                    permissionId);
        } catch (Exception e) {
            throw (new DAOException(e));
        }
    }

    /*
     * ���� Javadoc��
     * 
     * @see com.times.wap.dao.permission.PermissionDAO#deletePermission(java.lang.Long)
     */
    public void deletePermission(Long permissionId) throws DAOException {
        // TODO �Զ���ɷ������
        try {

            removeEntity(loadPermission(permissionId));
        } catch (Exception e) {
            throw (new DAOException(e));
        }
    }

}
