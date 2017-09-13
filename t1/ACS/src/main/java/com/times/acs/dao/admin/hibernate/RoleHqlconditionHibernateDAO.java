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
import com.times.acs.dao.admin.RoleHqlconditionDAO;
import com.times.acs.pojo.admin.RoleHqlcondition;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Repository
public class RoleHqlconditionHibernateDAO extends BaseHibernateDAO 
implements RoleHqlconditionDAO {

    /* （非 Javadoc）
     * @see com.times.acs.dao.admin.RoleHqlconditionDAO#insertRoleHqlcondition(com.times.acs.pojo.admin.RoleHqlcondition)
     */
    public RoleHqlcondition insertRoleHqlcondition(RoleHqlcondition roleHqlcondition) throws DAOException {
        
       
        try{
            

             return (RoleHqlcondition)saveEntity(roleHqlcondition); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }

       
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.roleHqlcondition.RoleHqlconditionDAO#updateRoleHqlcondition(com.times.wap.pojo.roleHqlcondition.RoleHqlcondition)
     */
    public RoleHqlcondition updateRoleHqlcondition(RoleHqlcondition roleHqlcondition) throws DAOException {
       
        try{
            

             return (RoleHqlcondition)updateEntity(roleHqlcondition); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.roleHqlcondition.RoleHqlconditionDAO#loadRoleHqlcondition(java.lang.Long)
     */
    public RoleHqlcondition loadRoleHqlcondition(Long roleHqlconditionId) throws DAOException {
       
        try{
            return(RoleHqlcondition)loadEntityById(RoleHqlcondition.class,roleHqlconditionId);
        }
        catch(Exception e)
        {
            throw(new DAOException (e));
        }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.roleHqlcondition.RoleHqlconditionDAO#deleteRoleHqlcondition(java.lang.Long)
     */
    public void deleteRoleHqlcondition(Long roleHqlconditionId) throws DAOException {
       
        try{
            

              removeEntity(loadRoleHqlcondition(roleHqlconditionId)); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }




}
