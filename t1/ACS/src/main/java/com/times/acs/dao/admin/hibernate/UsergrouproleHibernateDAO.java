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
import com.times.acs.dao.admin.UsergrouproleDAO;
import com.times.acs.pojo.admin.UsergroupRolePOJO;


/**
 * @author Administrator
 *
 * TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
@Repository
public class UsergrouproleHibernateDAO extends BaseHibernateDAO 
implements UsergrouproleDAO {

    /* ���� Javadoc��
     * @see com.times.acs.dao.admin.UsergrouproleDAO#insertUsergrouprole(com.times.acs.pojo.admin.UsergroupRolePOJO)
     */
    public UsergroupRolePOJO insertUsergrouprole(UsergroupRolePOJO usergrouprole) throws DAOException {
        
        // TODO �Զ���ɷ������
        try{
            

             return (UsergroupRolePOJO)saveEntity(usergrouprole); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }

       
    }

    /* ���� Javadoc��
     * @see com.times.wap.dao.usergrouprole.UsergrouproleDAO#updateUsergrouprole(com.times.wap.pojo.usergrouprole.UsergroupRolePOJO)
     */
    public UsergroupRolePOJO updateUsergrouprole(UsergroupRolePOJO usergrouprole) throws DAOException {
        // TODO �Զ���ɷ������
        try{
            

             return (UsergroupRolePOJO)updateEntity(usergrouprole); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }

    /* ���� Javadoc��
     * @see com.times.wap.dao.usergrouprole.UsergrouproleDAO#loadUsergrouprole(java.lang.Long)
     */
    public UsergroupRolePOJO loadUsergrouprole(Long usergrouproleId) throws DAOException {
        // TODO �Զ���ɷ������
        try{
            return(UsergroupRolePOJO)loadEntityById(UsergroupRolePOJO.class,usergrouproleId);
        }
        catch(Exception e)
        {
            throw(new DAOException (e));
        }
    }

    /* ���� Javadoc��
     * @see com.times.wap.dao.usergrouprole.UsergrouproleDAO#deleteUsergrouprole(java.lang.Long)
     */
    public void deleteUsergrouprole(Long usergrouproleId) throws DAOException {
        // TODO �Զ���ɷ������
        try{
            

              removeEntity(loadUsergrouprole(usergrouproleId)); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }




}
