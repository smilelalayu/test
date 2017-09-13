/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.dao.admin.hibernate;



import org.springframework.stereotype.Repository;

import com.times.acs.dao.admin.SmLogDAO;
import com.times.acs.pojo.admin.SmLog;
import com.times.framework.dao.hibernate.BaseHibernateDAO;
import com.times.framework.exception.DAOException;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Repository
public class SmLogHibernateDAO extends BaseHibernateDAO 
implements SmLogDAO {

    /* （非 Javadoc）
     * @see com.jj.system.dao.web.SmLogDAO#insertSmLog(com.jj.system.pojo.web.SmLog)
     */
    public SmLog insertSmLog(SmLog smLog) throws DAOException {
        
       
        try{
            

             return (SmLog)saveEntity(smLog); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }

       
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.smLog.SmLogDAO#updateSmLog(com.times.wap.pojo.smLog.SmLog)
     */
    public SmLog updateSmLog(SmLog smLog) throws DAOException {
       
        try{
            

             return (SmLog)updateEntity(smLog); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.smLog.SmLogDAO#loadSmLog(java.lang.Long)
     */
    public SmLog loadSmLog(Long smLogId) throws DAOException {
       
        try{
            return(SmLog)loadEntityById(SmLog.class,smLogId);
        }
        catch(Exception e)
        {
            throw(new DAOException (e));
        }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.smLog.SmLogDAO#deleteSmLog(java.lang.Long)
     */
    public void deleteSmLog(Long smLogId) throws DAOException {
       
        try{
            

              removeEntity(loadSmLog(smLogId)); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }




}
