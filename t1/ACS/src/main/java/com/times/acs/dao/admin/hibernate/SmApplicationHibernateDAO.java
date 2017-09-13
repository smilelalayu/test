/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.dao.admin.hibernate;



import org.springframework.stereotype.Repository;

import com.times.acs.dao.admin.SmApplicationDAO;
import com.times.acs.pojo.admin.SmApplication;
import com.times.framework.dao.hibernate.BaseHibernateDAO;
import com.times.framework.exception.DAOException;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Repository
public class SmApplicationHibernateDAO extends BaseHibernateDAO 
implements SmApplicationDAO {

    /* （非 Javadoc）
     * @see com.jj.system.dao.web.SmApplicationDAO#insertSmApplication(com.times.acs.pojo.admin.SmApplication)
     */
    public SmApplication insertSmApplication(SmApplication smApplication) throws DAOException {
        
       
        try{
            

             return (SmApplication)saveEntity(smApplication); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }

       
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.smApplication.SmApplicationDAO#updateSmApplication(com.times.wap.pojo.smApplication.SmApplication)
     */
    public SmApplication updateSmApplication(SmApplication smApplication) throws DAOException {
       
        try{
            

             return (SmApplication)updateEntity(smApplication); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.smApplication.SmApplicationDAO#loadSmApplication(java.lang.Long)
     */
    public SmApplication loadSmApplication(Long smApplicationId) throws DAOException {
       
        try{
            return(SmApplication)loadEntityById(SmApplication.class,smApplicationId);
        }
        catch(Exception e)
        {
            throw(new DAOException (e));
        }
    }

    /* （非 Javadoc）
     * @see com.times.wap.dao.smApplication.SmApplicationDAO#deleteSmApplication(java.lang.Long)
     */
    public void deleteSmApplication(Long smApplicationId) throws DAOException {
       
        try{
            

              removeEntity(loadSmApplication(smApplicationId)); 
         }
         catch(Exception e)
         {
             throw (new DAOException(e));
         }
    }




}
