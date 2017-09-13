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
import com.times.acs.dao.admin.UserGroupMappingDAO;
import com.times.acs.pojo.admin.UserGroupMapping;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Repository
public class UserGroupMappingHibernateDAO extends BaseHibernateDAO 
implements UserGroupMappingDAO {

    /* （非 Javadoc）
     * @see com.times.acs.dao.admin.UserGroupMappingDAO#insertUserGroupMapping(com.times.acs.pojo.admin.UserGroupMapping)
     */
    public UserGroupMapping insertUserGroupMapping(UserGroupMapping userGroupMapping) throws DAOException {
        
       
        try{
            

             return (UserGroupMapping)saveEntity(userGroupMapping); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }

       
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userGroupMapping.UserGroupMappingDAO#updateUserGroupMapping(com.times.wap.pojo.userGroupMapping.UserGroupMapping)
     */
    public UserGroupMapping updateUserGroupMapping(UserGroupMapping userGroupMapping) throws DAOException {
       
        try{
            

             return (UserGroupMapping)updateEntity(userGroupMapping); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userGroupMapping.UserGroupMappingDAO#loadUserGroupMapping(java.lang.Long)
     */
    public UserGroupMapping loadUserGroupMapping(Long userGroupMappingId) throws DAOException {
       
        try{
            return(UserGroupMapping)loadEntityById(UserGroupMapping.class,userGroupMappingId);
        }
        catch(Exception e)
        {
            throw(new DAOException (e));
        }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userGroupMapping.UserGroupMappingDAO#deleteUserGroupMapping(java.lang.Long)
     */
    public void deleteUserGroupMapping(Long userGroupMappingId) throws DAOException {
       
        try{
            

              removeEntity(loadUserGroupMapping(userGroupMappingId)); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }




}
