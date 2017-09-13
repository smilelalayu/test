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
import com.times.acs.dao.admin.UserMappingDAO;
import com.times.acs.pojo.admin.UserMapping;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Repository
public class UserMappingHibernateDAO extends BaseHibernateDAO 
implements UserMappingDAO {

    /* （非 Javadoc）
     * @see com.times.acs.dao.admin.UserMappingDAO#insertUserMapping(com.times.acs.pojo.admin.UserMapping)
     */
    public UserMapping insertUserMapping(UserMapping userMapping) throws DAOException {
        
       
        try{
            

             return (UserMapping)saveEntity(userMapping); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }

       
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userMapping.UserMappingDAO#updateUserMapping(com.times.wap.pojo.userMapping.UserMapping)
     */
    public UserMapping updateUserMapping(UserMapping userMapping) throws DAOException {
       
        try{
            

             return (UserMapping)updateEntity(userMapping); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userMapping.UserMappingDAO#loadUserMapping(java.lang.Long)
     */
    public UserMapping loadUserMapping(Long userMappingId) throws DAOException {
       
        try{
            return(UserMapping)loadEntityById(UserMapping.class,userMappingId);
        }
        catch(Exception e)
        {
            throw(new DAOException (e));
        }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userMapping.UserMappingDAO#deleteUserMapping(java.lang.Long)
     */
    public void deleteUserMapping(Long userMappingId) throws DAOException {
       
        try{
            

              removeEntity(loadUserMapping(userMappingId)); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }




}
