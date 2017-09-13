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
import com.times.acs.dao.admin.UserroleDAO;
import com.times.acs.pojo.admin.UserRolePOJO;


/**
 * @author Administrator
 *
 * TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
@Repository
public class UserroleHibernateDAO extends BaseHibernateDAO 
implements UserroleDAO {

    /* ���� Javadoc��
     * @see com.times.acs.dao.admin.UserroleDAO#insertUserrole(com.times.acs.pojo.admin.UserRolePOJO)
     */
    public UserRolePOJO insertUserrole(UserRolePOJO userrole) throws DAOException {
        
        // TODO �Զ���ɷ������
        try{
            

             return (UserRolePOJO)saveEntity(userrole); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }

       
    }

    /* ���� Javadoc��
     * @see com.times.wap.dao.userrole.UserroleDAO#updateUserrole(com.times.wap.pojo.userrole.UserRolePOJO)
     */
    public UserRolePOJO updateUserrole(UserRolePOJO userrole) throws DAOException {
        // TODO �Զ���ɷ������
        try{
            

             return (UserRolePOJO)updateEntity(userrole); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }

    /* ���� Javadoc��
     * @see com.times.wap.dao.userrole.UserroleDAO#loadUserrole(java.lang.Long)
     */
    public UserRolePOJO loadUserrole(Long userroleId) throws DAOException {
        // TODO �Զ���ɷ������
        try{
            return(UserRolePOJO)loadEntityById(UserRolePOJO.class,userroleId);
        }
        catch(Exception e)
        {
            throw(new DAOException (e));
        }
    }

    /* ���� Javadoc��
     * @see com.times.wap.dao.userrole.UserroleDAO#deleteUserrole(java.lang.Long)
     */
    public void deleteUserrole(Long userroleId) throws DAOException {
        // TODO �Զ���ɷ������
        try{
            

              removeEntity(loadUserrole(userroleId)); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }




}
