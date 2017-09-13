/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.times.acs.dao.admin.SmNoticeDAO;
import com.times.acs.pojo.admin.SmNotice;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.service.admin.SmNoticeService;
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
public class SmNoticeServiceImpl implements SmNoticeService {

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.SmNoticeService#getAllSmNotice()
     */
	@Autowired
    QueryDAO2 queryDAO2;
	@Autowired
    SmNoticeDAO smNoticeDAO;

    public List<SmNotice> getAllSmNotice() throws DAOException{
		HQLEntityString entityQueryString = new HQLEntityString();
		entityQueryString.setEntityName(SmNotice.class.getName());

		return getQuerySmNotice(entityQueryString);
		
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.SmNoticeService#insertSmNotice(com.times.wap.pojo.testing.SmNotice)
     */
    public SmNotice insertSmNotice(SmNotice smNotice)
            throws DAOException {
        // 
        try{
            return  smNoticeDAO.insertSmNotice(smNotice);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
  
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.SmNoticeService#updateSmNotice(com.times.wap.pojo.testing.SmNotice)
     */
    
    

    

    public SmNotice updateSmNotice(SmNotice smNotice)
            throws DAOException {
        // 
        try{
            return  smNoticeDAO.updateSmNotice(smNotice);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.SmNoticeService#getSmNotice(java.lang.Long)
     */
    public SmNotice getSmNotice(Long optionId) throws DAOException {
        // 
        try{
            return (SmNotice)smNoticeDAO.loadSmNotice(optionId);
        }
        catch(Exception e)
        {
            throw(new DAOException(e));
        }
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.SmNoticeService#deleteSmNotice(java.lang.Long)
     */
    public void deleteSmNotice(Long optionId) throws DAOException {
        // 
        try{
            smNoticeDAO.deleteSmNotice(optionId);
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

	public List<SmNotice> updateSaveSmNotice(List<SmNotice> entitys) throws DAOException {
		
		
		try {
			List<SmNotice> result=new ArrayList<SmNotice>();
			for(SmNotice entity :entitys){
				if(entity.getReadStatus()!=null &&entity.getReadStatus().toString().equals("1")){
					if(entity.getReadTime()==null){
						entity.setReadTime(new Date());
					}
					
				}
			
				result.add((SmNotice)smNoticeDAO.saveOrUpdateEntity(entity));
			}
			
			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			//return false;
		}
		
		
		
	}
	
	@Override
	public void deleteSmNotice(List<SmNotice> entitys) throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (SmNotice entity : entitys) {

				smNoticeDAO.removeEntity(entity);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}
	
	
	
	public List<SmNotice> getQueryPagingSmNotice(
			HQLEntityString entityQueryString) throws DAOException {
		String orderField = entityQueryString.getOrderByField();
		if(null==orderField || "".equals(orderField)){
			entityQueryString.setOrderByField("readStatus asc");
			entityQueryString.setOrderBySuffix(",id desc");
		}
		
		List<SmNotice> result = new ArrayList<SmNotice>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<SmNotice> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}
		return result;
	}

	public List<SmNotice> getQuerySmNotice(HQLEntityString entityQueryString)
			throws DAOException {

		List<SmNotice> result = new ArrayList<SmNotice>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<SmNotice> it = queryDAO2.queryForIterator(qLWrapper);
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
    public SmNoticeDAO getSmNoticeDAO() {
        return smNoticeDAO;
    }
    public void setSmNoticeDAO(SmNoticeDAO smNoticeDAO) {
        this.smNoticeDAO = smNoticeDAO;
    }
    
    public static void main(String[] args) {

		SmNoticeService smNoticeService = (SmNoticeService) ServiceLocator
				.getService("smNoticeService");
				 smNoticeService.getAllSmNotice();
	}

	@Override
	public List<SmNotice> updateReadStatus(List<SmNotice> entitys)
			throws DAOException {
		try {
			List<SmNotice> result=new ArrayList<SmNotice>();
			for(SmNotice entity :entitys){
				entity.setReadStatus(1);
				entity.setReadTime(new Date());
				result.add((SmNotice)smNoticeDAO.saveOrUpdateEntity(entity));
			}
			
			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			//return false;
		}
	}

	@Override
	public List<SmNotice> getPortNotice(UserInfoPOJO user) throws DAOException {
		HQLEntityString hql = new HQLEntityString(SmNotice.class.getName());
		HQLCondition<Long> c1 = new HQLCondition<Long>("receiveId", user.getUserId());
		hql.setOrderByField("id");
		hql.setOrderBySuffix("desc");
		hql.addCond(c1);
		
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(hql);
		List<SmNotice> result = queryDAO2.queryOrderForList(qLWrapper, 0, 6);
		
		return result;
		
	}
}
