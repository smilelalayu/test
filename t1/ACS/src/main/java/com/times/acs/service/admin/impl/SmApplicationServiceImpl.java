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

import com.times.acs.dao.admin.SmApplicationDAO;
import com.times.acs.pojo.admin.RolesPOJO;
import com.times.acs.pojo.admin.SmApplication;
import com.times.acs.service.admin.RoleService;
import com.times.acs.service.admin.SmApplicationService;
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
public class SmApplicationServiceImpl implements SmApplicationService {

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.SmApplicationService#getAllSmApplication()
     */
	@Autowired
    QueryDAO2 queryDAO2;
	@Autowired
    SmApplicationDAO smApplicationDAO;
	
	
	@Autowired
	private RoleService roleService;

    public List<SmApplication> getAllSmApplication() throws DAOException{
		HQLEntityString entityQueryString = new HQLEntityString();
		entityQueryString.setEntityName(SmApplication.class.getName());

		return getQuerySmApplication(entityQueryString);
		
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.SmApplicationService#insertSmApplication(com.times.wap.pojo.testing.SmApplication)
     */
    public SmApplication insertSmApplication(SmApplication smApplication)
            throws DAOException {
        // 
        try{
            return  smApplicationDAO.insertSmApplication(smApplication);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
  
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.SmApplicationService#updateSmApplication(com.times.wap.pojo.testing.SmApplication)
     */
    
    

    

    public SmApplication updateSmApplication(SmApplication smApplication)
            throws DAOException {
        // 
        try{
            return  smApplicationDAO.updateSmApplication(smApplication);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.SmApplicationService#getSmApplication(java.lang.Long)
     */
    public SmApplication getSmApplication(Long optionId) throws DAOException {
        // 
        try{
            return (SmApplication)smApplicationDAO.loadSmApplication(optionId);
        }
        catch(Exception e)
        {
            throw(new DAOException(e));
        }
    }

    /*
     * （非 Javadoc）
     * 
     * @see com.times.wap.service.testing.SmApplicationService#deleteSmApplication(java.lang.Long)
     */
    public void deleteSmApplication(Long optionId) throws DAOException {
        // 
        try{
            smApplicationDAO.deleteSmApplication(optionId);
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

	public List<SmApplication> updateSaveSmApplication(List<SmApplication> entitys) throws DAOException {
		// TODO Auto-generated method stub
		
		try {
			List<SmApplication> result=new ArrayList<SmApplication>();
			for(SmApplication entity :entitys){
				result.add((SmApplication)smApplicationDAO.saveOrUpdateEntity(entity));
			}
			
			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			//return false;
		}
		
		
		
	}
	
	@Override
	public void deleteSmApplication(List<SmApplication> entitys) throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (SmApplication entity : entitys) {

				smApplicationDAO.removeEntity(entity);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}
	
	
	
	public List<SmApplication> getQueryPagingSmApplication(
			HQLEntityString entityQueryString) throws DAOException {
		List<SmApplication> result = new ArrayList<SmApplication>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<SmApplication> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	public List<SmApplication> getQuerySmApplication(HQLEntityString entityQueryString)
			throws DAOException {

		List<SmApplication> result = new ArrayList<SmApplication>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<SmApplication> it = queryDAO2.queryForIterator(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	@Override
	public String deleteSmApplicationAdnRoles(List<Integer> list) throws Exception {
		String result = null;
		try {
			for (Integer smid : list) {
				HQLEntityString entiy = new HQLEntityString();
				entiy.setEntityName(RolesPOJO.class.getName());
				entiy.equals("smApplication.id", smid);
				List<RolesPOJO> listpojo = roleService.getQueryRolesPOJO(entiy);
				if (listpojo != null && listpojo.size() > 0) {
					for (RolesPOJO rojo : listpojo) {
						rojo.setSmApplication(null);
						roleService.updateRole(rojo);
					}
				}
				deleteSmApplication((long) smid);
				result = "sueess";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "error";
		} finally {

		}
		return result;

	}
	

    public QueryDAO2 getQueryDAO2() {
        return queryDAO2;
    }
    public void setQueryDAO2(QueryDAO2 queryDAO2) {
        this.queryDAO2 = queryDAO2;
    }
    public SmApplicationDAO getSmApplicationDAO() {
        return smApplicationDAO;
    }
    public void setSmApplicationDAO(SmApplicationDAO smApplicationDAO) {
        this.smApplicationDAO = smApplicationDAO;
    }
}
