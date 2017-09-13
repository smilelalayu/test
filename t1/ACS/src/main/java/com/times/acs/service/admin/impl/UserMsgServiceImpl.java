/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.times.acs.dao.admin.UserMsgDAO;
import com.times.acs.pojo.admin.UserMsg;
import com.times.acs.service.admin.UserMsgService;
import com.times.framework.dao.QLWrapper;
import com.times.framework.dao.QueryDAO2;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Service
public class UserMsgServiceImpl implements UserMsgService {

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserMsgService#getAllUserMsg()
     */
	@Autowired
    QueryDAO2 queryDAO2;
	@Autowired
    UserMsgDAO userMsgDAO;

    public List<UserMsg> getAllUserMsg() throws DAOException{
		HQLEntityString entityQueryString = new HQLEntityString();
		entityQueryString.setEntityName(UserMsg.class.getName());

		return getQueryUserMsg(entityQueryString);
		
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserMsgService#insertUserMsg(com.times.wap.pojo.testing.UserMsg)
     */
    public UserMsg insertUserMsg(UserMsg userMsg)
            throws DAOException {
        // 
        try{
            return  userMsgDAO.insertUserMsg(userMsg);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
  
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserMsgService#updateUserMsg(com.times.wap.pojo.testing.UserMsg)
     */
    
    

    

    public UserMsg updateUserMsg(UserMsg userMsg)
            throws DAOException {
        // 
        try{
            return  userMsgDAO.updateUserMsg(userMsg);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserMsgService#getUserMsg(java.lang.Long)
     */
    public UserMsg getUserMsg(Long optionId) throws DAOException {
        // 
        try{
            return (UserMsg)userMsgDAO.loadUserMsg(optionId);
        }
        catch(Exception e)
        {
            throw(new DAOException(e));
        }
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserMsgService#deleteUserMsg(java.lang.Long)
     */
    public void deleteUserMsg(Long optionId) throws DAOException {
        // 
        try{
            userMsgDAO.deleteUserMsg(optionId);
        }
        catch(Exception e)
        {
            throw(new DAOException(e));
        }     

    }
    
    
    	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.UiEntityService#updateUiEntity(com.times
	 * .wap.pojo.testing.UiEntity)
	 */

	public List<UserMsg> updateSaveUserMsg(List<UserMsg> entitys) throws DAOException {
		// TODO Auto-generated method stub
		
		try {
			List<UserMsg> result=new ArrayList<UserMsg>();
			for(UserMsg entity :entitys){
				result.add((UserMsg)userMsgDAO.saveOrUpdateEntity(entity));
			}
			
			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			//return false;
		}
		
		
		
	}
	
	@Override
	public void deleteUserMsg(List<UserMsg> entitys) throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (UserMsg entity : entitys) {

				userMsgDAO.removeEntity(entity);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}
	
	
	
	public List<UserMsg> getQueryPagingUserMsg(
			HQLEntityString entityQueryString) throws DAOException {
		List<UserMsg> result = new ArrayList<UserMsg>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserMsg> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	public List<UserMsg> getQueryUserMsg(HQLEntityString entityQueryString)
			throws DAOException {

		List<UserMsg> result = new ArrayList<UserMsg>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserMsg> it = queryDAO2.queryForIterator(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}
	
	

    public QueryDAO2 getQueryDAO2() {
        return queryDAO2;
    }
    public void setQueryDAO2(QueryDAO2 queryDAO2) {
        this.queryDAO2 = queryDAO2;
    }
    public UserMsgDAO getUserMsgDAO() {
        return userMsgDAO;
    }
    public void setUserMsgDAO(UserMsgDAO userMsgDAO) {
        this.userMsgDAO = userMsgDAO;
    }
}
