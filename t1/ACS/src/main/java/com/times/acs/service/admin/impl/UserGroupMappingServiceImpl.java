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

import com.times.acs.dao.admin.UserGroupMappingDAO;
import com.times.acs.pojo.admin.UserGroupMapping;
import com.times.acs.service.admin.UserGroupMappingService;
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
public class UserGroupMappingServiceImpl implements UserGroupMappingService {

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserGroupMappingService#getAllUserGroupMapping()
     */
	@Autowired
    QueryDAO2 queryDAO2;
	@Autowired
    UserGroupMappingDAO userGroupMappingDAO;

    public List<UserGroupMapping> getAllUserGroupMapping() throws DAOException{
		HQLEntityString entityQueryString = new HQLEntityString();
		entityQueryString.setEntityName(UserGroupMapping.class.getName());

		return getQueryUserGroupMapping(entityQueryString);
		
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserGroupMappingService#insertUserGroupMapping(com.times.wap.pojo.testing.UserGroupMapping)
     */
    public UserGroupMapping insertUserGroupMapping(UserGroupMapping userGroupMapping)
            throws DAOException {
        // 
        try{
            return  userGroupMappingDAO.insertUserGroupMapping(userGroupMapping);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
  
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserGroupMappingService#updateUserGroupMapping(com.times.wap.pojo.testing.UserGroupMapping)
     */
    
    

    

    public UserGroupMapping updateUserGroupMapping(UserGroupMapping userGroupMapping)
            throws DAOException {
        // 
        try{
            return  userGroupMappingDAO.updateUserGroupMapping(userGroupMapping);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserGroupMappingService#getUserGroupMapping(java.lang.Long)
     */
    public UserGroupMapping getUserGroupMapping(Long optionId) throws DAOException {
        // 
        try{
            return (UserGroupMapping)userGroupMappingDAO.loadUserGroupMapping(optionId);
        }
        catch(Exception e)
        {
            throw(new DAOException(e));
        }
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.UserGroupMappingService#deleteUserGroupMapping(java.lang.Long)
     */
    public void deleteUserGroupMapping(Long optionId) throws DAOException {
        // 
        try{
            userGroupMappingDAO.deleteUserGroupMapping(optionId);
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

	public List<UserGroupMapping> updateSaveUserGroupMapping(List<UserGroupMapping> entitys) throws DAOException {
		// TODO Auto-generated method stub
		
		try {
			List<UserGroupMapping> result=new ArrayList<UserGroupMapping>();
			for(UserGroupMapping entity :entitys){
				result.add((UserGroupMapping)userGroupMappingDAO.saveOrUpdateEntity(entity));
			}
			
			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			//return false;
		}
		
		
		
	}
	
	@Override
	public void deleteUserGroupMapping(List<UserGroupMapping> entitys) throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (UserGroupMapping entity : entitys) {

				userGroupMappingDAO.removeEntity(entity);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}
	
	
	
	public List<UserGroupMapping> getQueryPagingUserGroupMapping(
			HQLEntityString entityQueryString) throws DAOException {
		List<UserGroupMapping> result = new ArrayList<UserGroupMapping>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserGroupMapping> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	public List<UserGroupMapping> getQueryUserGroupMapping(HQLEntityString entityQueryString)
			throws DAOException {

		List<UserGroupMapping> result = new ArrayList<UserGroupMapping>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserGroupMapping> it = queryDAO2.queryForIterator(qLWrapper);
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
    public UserGroupMappingDAO getUserGroupMappingDAO() {
        return userGroupMappingDAO;
    }
    public void setUserGroupMappingDAO(UserGroupMappingDAO userGroupMappingDAO) {
        this.userGroupMappingDAO = userGroupMappingDAO;
    }
    
    public static void main(String[] args) {

		UserGroupMappingService userGroupMappingService = (UserGroupMappingService) ServiceLocator
				.getService("userGroupMappingService");
				 userGroupMappingService.getAllUserGroupMapping();
	}

	@Override
	public UserGroupMapping updateGetUserGroupMappingByCode(String strGroupId) {
		
		List<UserGroupMapping> qresult = getUserGroupMappingByJgId(strGroupId);
		if(qresult==null || qresult.size()==0){
			//新建
			UserGroupMapping um = new UserGroupMapping();
			um.setJgId(strGroupId);
			UserGroupMapping rr = this.insertUserGroupMapping(um);
			
			return rr;
		}else{
			
			return qresult.get(0);
		}
		
		
	}

	private List<UserGroupMapping> getUserGroupMappingByJgId(String strGroupId) {
		HQLEntityString hql = new HQLEntityString(UserGroupMapping.class.getName());
		
		HQLCondition<String> c1 = new HQLCondition<String>("jgId", strGroupId);		
	
		hql.addCond(c1);
		
		hql.setOrderByField("id");
		hql.setOrderBySuffix("desc");
		
		List<UserGroupMapping> result = new ArrayList<UserGroupMapping>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(hql);
		List<UserGroupMapping> qresult = queryDAO2.queryOrderForList(qLWrapper);
		return qresult;
	}
	private UserGroupMapping getSUserGroupMappingByJgId(String strGroupId) {
		HQLEntityString hql = new HQLEntityString(UserGroupMapping.class.getName());
		
		HQLCondition<String> c1 = new HQLCondition<String>("jgId", strGroupId);		
	
		hql.addCond(c1);
		
		hql.setOrderByField("id");
		hql.setOrderBySuffix("desc");
		
		List<UserGroupMapping> result = new ArrayList<UserGroupMapping>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(hql);
		List<UserGroupMapping> qresult = queryDAO2.queryOrderForList(qLWrapper);
		if(qresult==null || qresult.size()==0){
			return null;
		}
		return qresult.get(0);
	}


	@Override
	public UserGroupMapping getSJGroupByDepartment(String jgId) {
		
		UserGroupMapping   ugm  =this.getByJgId(jgId);
		
		
		UserGroupMapping result=ugm;
		String mJgId = null;
		
		while(result!=null && !result.getSjjgId().equals(UserGroupMapping.JG_SJ)){
			mJgId = result.getSjjgId();
			//System.out.println("...........");
			result =this.getByJgId(mJgId);
			
			
		}
		return result;
	}

	@Override
	public UserGroupMapping getByJgId(String jgId) throws DAOException {
		
		return getSUserGroupMappingByJgId(jgId);
	}
}
