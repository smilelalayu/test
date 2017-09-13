/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.dao.admin.hibernate;

import org.springframework.stereotype.Repository;

import com.times.acs.dao.admin.UsergroupDAO;
import com.times.acs.pojo.admin.UserGroupPOJO;
import com.times.framework.dao.hibernate.BaseHibernateDAO;
import com.times.framework.exception.DAOException;

/**
 * @author Administrator
 * 
 * TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת�� ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
@Repository
public class UsergroupHibernateDAO extends BaseHibernateDAO implements
        UsergroupDAO {

    /*
     * ���� Javadoc��
     * 
     * @see com.times.acs.dao.admin.UsergroupDAO#insertUsergroup(com.times.acs.pojo.admin.UserGroupPOJO)
     */
    public UserGroupPOJO insertUsergroup(UserGroupPOJO usergroup)
            throws DAOException {

        // TODO �Զ���ɷ������
        try {

            return (UserGroupPOJO) saveEntity(usergroup);
        } catch (Exception e) {
            throw (new DAOException(e));
        }

    }

    /*
     * ���� Javadoc��
     * 
     * @see com.times.wap.dao.usergroup.UsergroupDAO#updateUsergroup(com.times.wap.pojo.usergroup.UserGroupPOJO)
     */
    public UserGroupPOJO updateUsergroup(UserGroupPOJO usergroup)
            throws DAOException {
        // TODO �Զ���ɷ������
        try {

            return (UserGroupPOJO) updateEntity(usergroup);
        } catch (Exception e) {
            throw (new DAOException(e));
        }
    }

    /*
     * ���� Javadoc��
     * 
     * @see com.times.wap.dao.usergroup.UsergroupDAO#loadUsergroup(java.lang.Long)
     */
    public UserGroupPOJO loadUsergroup(Long usergroupId) throws DAOException {
        // TODO �Զ���ɷ������
        try {
            return (UserGroupPOJO) loadEntityById(UserGroupPOJO.class,
                    usergroupId);
        } catch (Exception e) {
            throw (new DAOException(e));
        }
    }

    /*
     * ���� Javadoc��
     * 
     * @see com.times.wap.dao.usergroup.UsergroupDAO#deleteUsergroup(java.lang.Long)
     */
    public void deleteUsergroup(Long usergroupId) throws DAOException {
        // TODO �Զ���ɷ������
        try {

            removeEntity(loadUsergroup(usergroupId));
        } catch (Exception e) {
            throw (new DAOException(e));
        }
    }

    public void deleteUsergroup(UserGroupPOJO usergroup) throws DAOException {
        // TODO �Զ���ɷ������
        try {

            removeEntity(usergroup);
        } catch (Exception e) {
            throw (new DAOException(e));
        }
    }

}
