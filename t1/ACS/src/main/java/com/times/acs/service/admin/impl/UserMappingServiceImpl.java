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

import com.times.acs.dao.admin.UserMappingDAO;
import com.times.acs.pojo.admin.UserMapping;
import com.times.acs.service.admin.UserMappingService;
import com.times.framework.dao.QLWrapper;
import com.times.framework.dao.QueryDAO2;
import com.times.framework.dao.hibernate.dto.HQLCondition;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.ServiceLocator;


/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Service
public class UserMappingServiceImpl implements UserMappingService {

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserMappingService#getAllUserMapping()
     */
	@Autowired
    QueryDAO2 queryDAO2;
	@Autowired
    UserMappingDAO userMappingDAO;

    public List<UserMapping> getAllUserMapping() throws DAOException{
		HQLEntityString entityQueryString = new HQLEntityString();
		entityQueryString.setEntityName(UserMapping.class.getName());

		return getQueryUserMapping(entityQueryString);
		
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserMappingService#insertUserMapping(com.times.wap.pojo.testing.UserMapping)
     */
    public UserMapping insertUserMapping(UserMapping userMapping)
            throws DAOException {
        // 
        try{
            return  userMappingDAO.insertUserMapping(userMapping);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
  
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserMappingService#updateUserMapping(com.times.wap.pojo.testing.UserMapping)
     */
    
    

    

    public UserMapping updateUserMapping(UserMapping userMapping)
            throws DAOException {
        // 
        try{
            return  userMappingDAO.updateUserMapping(userMapping);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserMappingService#getUserMapping(java.lang.Long)
     */
    public UserMapping getUserMapping(Long optionId) throws DAOException {
        // 
        try{
            return (UserMapping)userMappingDAO.loadUserMapping(optionId);
        }
        catch(Exception e)
        {
            throw(new DAOException(e));
        }
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserMappingService#deleteUserMapping(java.lang.Long)
     */
    public void deleteUserMapping(Long optionId) throws DAOException {
        // 
        try{
            userMappingDAO.deleteUserMapping(optionId);
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

	public List<UserMapping> updateSaveUserMapping(List<UserMapping> entitys) throws DAOException {
		// TODO Auto-generated method stub
		
		try {
			List<UserMapping> result=new ArrayList<UserMapping>();
			for(UserMapping entity :entitys){
				result.add((UserMapping)userMappingDAO.saveOrUpdateEntity(entity));
			}
			
			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			//return false;
		}
		
		
		
	}
	
	@Override
	public void deleteUserMapping(List<UserMapping> entitys) throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (UserMapping entity : entitys) {

				userMappingDAO.removeEntity(entity);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}
	
	
	
	public List<UserMapping> getQueryPagingUserMapping(
			HQLEntityString entityQueryString) throws DAOException {
		List<UserMapping> result = new ArrayList<UserMapping>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserMapping> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	public List<UserMapping> getQueryUserMapping(HQLEntityString entityQueryString)
			throws DAOException {

		List<UserMapping> result = new ArrayList<UserMapping>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserMapping> it = queryDAO2.queryForIterator(qLWrapper);
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
    public UserMappingDAO getUserMappingDAO() {
        return userMappingDAO;
    }
    public void setUserMappingDAO(UserMappingDAO userMappingDAO) {
        this.userMappingDAO = userMappingDAO;
    }
    
    public static void main(String[] args) {

		UserMappingService userMappingService = (UserMappingService) ServiceLocator
				.getService("userMappingService");
				 userMappingService.getAllUserMapping();
	}

	@Override
	public UserMapping updateGetUserMappingByCode(String userCode) {
		
		HQLEntityString hql = new HQLEntityString(UserMapping.class.getName());
		
		HQLCondition<String> c1 = new HQLCondition<String>("userCode", userCode);		
	
		hql.addCond(c1);
		
		hql.setOrderByField("id");
		hql.setOrderBySuffix("desc");
		
		List<UserMapping> result = new ArrayList<UserMapping>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(hql);
		List<UserMapping> qresult = queryDAO2.queryOrderForList(qLWrapper);
		if(qresult==null || qresult.size()==0){
			//新建
			UserMapping um = new UserMapping();
			um.setUserCode(userCode);
			UserMapping rr = this.insertUserMapping(um);
			
			return rr;
		}else{
			
			return qresult.get(0);
		}
		
		
		
	}
}
