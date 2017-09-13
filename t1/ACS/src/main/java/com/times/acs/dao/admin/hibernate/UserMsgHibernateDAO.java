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
import com.times.acs.dao.admin.UserMsgDAO;
import com.times.acs.pojo.admin.UserMsg;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Repository
public class UserMsgHibernateDAO extends BaseHibernateDAO 
implements UserMsgDAO {

    /* （非 Javadoc）
     * @see com.times.acs.dao.admin.UserMsgDAO#insertUserMsg(com.times.acs.pojo.admin.UserMsg)
     */
    public UserMsg insertUserMsg(UserMsg userMsg) throws DAOException {
        
       
        try{
            

             return (UserMsg)saveEntity(userMsg); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }

       
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userMsg.UserMsgDAO#updateUserMsg(com.times.wap.pojo.userMsg.UserMsg)
     */
    public UserMsg updateUserMsg(UserMsg userMsg) throws DAOException {
       
        try{
            

             return (UserMsg)updateEntity(userMsg); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userMsg.UserMsgDAO#loadUserMsg(java.lang.Long)
     */
    public UserMsg loadUserMsg(Long userMsgId) throws DAOException {
       
        try{
            return(UserMsg)loadEntityById(UserMsg.class,userMsgId);
        }
        catch(Exception e)
        {
            throw(new DAOException (e));
        }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.userMsg.UserMsgDAO#deleteUserMsg(java.lang.Long)
     */
    public void deleteUserMsg(Long userMsgId) throws DAOException {
       
        try{
            

              removeEntity(loadUserMsg(userMsgId)); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }




}
