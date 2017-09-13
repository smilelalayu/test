/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.dao.admin.hibernate;



import org.springframework.stereotype.Repository;

import com.times.framework.dao.hibernate.BaseHibernateDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.dao.admin.UserGroupRelationDAO;
import com.times.acs.pojo.admin.UserGroupRelation;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Repository
public class UserGroupRelationHibernateDAO extends BaseHibernateDAO 
implements UserGroupRelationDAO {

    /* （非 Javadoc）
     * @see com.times.acs.dao.admin.UserGroupRelationDAO#insertUserGroupRelation(com.times.acs.pojo.admin.UserGroupRelation)
     */
    public UserGroupRelation insertUserGroupRelation(UserGroupRelation userGroupRelation) throws DAOException {
        
       
        try{
            

             return (UserGroupRelation)saveEntity(userGroupRelation); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }

       
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userGroupRelation.UserGroupRelationDAO#updateUserGroupRelation(com.times.wap.pojo.userGroupRelation.UserGroupRelation)
     */
    public UserGroupRelation updateUserGroupRelation(UserGroupRelation userGroupRelation) throws DAOException {
       
        try{
            

             return (UserGroupRelation)updateEntity(userGroupRelation); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userGroupRelation.UserGroupRelationDAO#loadUserGroupRelation(java.lang.Long)
     */
    public UserGroupRelation loadUserGroupRelation(Long userGroupRelationId) throws DAOException {
       
        try{
            return(UserGroupRelation)loadEntityById(UserGroupRelation.class,userGroupRelationId);
        }
        catch(Exception e)
        {
            throw(new DAOException (e));
        }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userGroupRelation.UserGroupRelationDAO#deleteUserGroupRelation(java.lang.Long)
     */
    public void deleteUserGroupRelation(Long userGroupRelationId) throws DAOException {
       
        try{
            

              removeEntity(loadUserGroupRelation(userGroupRelationId)); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }




}
