/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.dao.admin.hibernate;



import org.springframework.stereotype.Repository;

import com.times.acs.dao.admin.SmNoticeDAO;
import com.times.acs.pojo.admin.SmNotice;
import com.times.framework.dao.hibernate.BaseHibernateDAO;
import com.times.framework.exception.DAOException;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Repository
public class SmNoticeHibernateDAO extends BaseHibernateDAO 
implements SmNoticeDAO {

    /* （非 Javadoc）
     * @see com.jj.system.dao.web.SmNoticeDAO#insertSmNotice(com.jj.system.pojo.web.SmNotice)
     */
    public SmNotice insertSmNotice(SmNotice smNotice) throws DAOException {
        
       
        try{
            

             return (SmNotice)saveEntity(smNotice); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }

       
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.smNotice.SmNoticeDAO#updateSmNotice(com.times.wap.pojo.smNotice.SmNotice)
     */
    public SmNotice updateSmNotice(SmNotice smNotice) throws DAOException {
       
        try{
            

             return (SmNotice)updateEntity(smNotice); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.smNotice.SmNoticeDAO#loadSmNotice(java.lang.Long)
     */
    public SmNotice loadSmNotice(Long smNoticeId) throws DAOException {
       
        try{
            return(SmNotice)loadEntityById(SmNotice.class,smNoticeId);
        }
        catch(Exception e)
        {
            throw(new DAOException (e));
        }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.smNotice.SmNoticeDAO#deleteSmNotice(java.lang.Long)
     */
    public void deleteSmNotice(Long smNoticeId) throws DAOException {
       
        try{
            

              removeEntity(loadSmNotice(smNoticeId)); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }




}
