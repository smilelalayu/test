/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.dao.admin.hibernate;



import org.springframework.stereotype.Repository;

import com.times.acs.dao.admin.UserinfoDAO;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.framework.dao.hibernate.BaseHibernateDAO;
import com.times.framework.exception.DAOException;


/**
 * @author Administrator
 *
 * TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
@Repository
public class UserinfoHibernateDAO extends BaseHibernateDAO 
implements UserinfoDAO {

    /* ���� Javadoc��
     * @see com.times.acs.dao.admin.UserinfoDAO#insertUserinfo(com.times.acs.pojo.admin.UserInfoPOJO)
     */
    public UserInfoPOJO insertUserinfo(UserInfoPOJO userinfo) throws DAOException {
        
        // TODO �Զ���ɷ������
        try{
            

             return (UserInfoPOJO)saveEntity(userinfo); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }

       
    }

    /* ���� Javadoc��
     * @see com.times.wap.dao.userinfo.UserinfoDAO#updateUserinfo(com.times.wap.pojo.userinfo.UserInfoPOJO)
     */
    public UserInfoPOJO updateUserinfo(UserInfoPOJO userinfo) throws DAOException {
        // TODO �Զ���ɷ������
        try{
            

             return (UserInfoPOJO)updateEntity(userinfo); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }

    /* ���� Javadoc��
     * @see com.times.wap.dao.userinfo.UserinfoDAO#loadUserinfo(java.lang.Long)
     */
    public UserInfoPOJO loadUserinfo(Long userinfoId) throws DAOException {
        // TODO �Զ���ɷ������
        try{
            return(UserInfoPOJO)loadEntityById(UserInfoPOJO.class,userinfoId);
        }
        catch(Exception e)
        {
            throw(new DAOException (e));
        }
    }

    /* ���� Javadoc��
     * @see com.times.wap.dao.userinfo.UserinfoDAO#deleteUserinfo(java.lang.Long)
     */
    public void deleteUserinfo(Long userinfoId) throws DAOException {
        // TODO �Զ���ɷ������
        try{
            

              removeEntity(loadUserinfo(userinfoId)); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }




}
