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

import com.times.acs.dao.admin.RoleHqlconditionDAO;
import com.times.acs.pojo.admin.RoleHqlcondition;
import com.times.acs.service.admin.RoleHqlconditionService;
import com.times.framework.dao.QLWrapper;
import com.times.framework.dao.QueryDAO2;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;

/**
 * @author Administrator
 * 
 *         TODO 要更改此生成的类型注释的模板，请转至 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Service
public class RoleHqlconditionServiceImpl implements RoleHqlconditionService {

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.RoleHqlconditionService#getAllRoleHqlcondition
	 * ()
	 */
	@Autowired
	QueryDAO2 queryDAO2;
	@Autowired
	RoleHqlconditionDAO roleHqlconditionDAO;

	public List<RoleHqlcondition> getAllRoleHqlcondition() throws DAOException {
		HQLEntityString entityQueryString = new HQLEntityString();
		entityQueryString.setEntityName(RoleHqlcondition.class.getName());
		entityQueryString.setDataRole(false);
		return getQueryRoleHqlcondition(entityQueryString);

	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.RoleHqlconditionService#insertRoleHqlcondition
	 * (com.times.wap.pojo.testing.RoleHqlcondition)
	 */
	public RoleHqlcondition insertRoleHqlcondition(
			RoleHqlcondition roleHqlcondition) throws DAOException {
		//
		try {
			return roleHqlconditionDAO.insertRoleHqlcondition(roleHqlcondition);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.RoleHqlconditionService#updateRoleHqlcondition
	 * (com.times.wap.pojo.testing.RoleHqlcondition)
	 */

	public RoleHqlcondition updateRoleHqlcondition(
			RoleHqlcondition roleHqlcondition) throws DAOException {
		//
		try {
			return roleHqlconditionDAO.updateRoleHqlcondition(roleHqlcondition);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.RoleHqlconditionService#getRoleHqlcondition
	 * (java.lang.Long)
	 */
	public RoleHqlcondition getRoleHqlcondition(Long optionId)
			throws DAOException {
		//
		try {
			return (RoleHqlcondition) roleHqlconditionDAO
					.loadRoleHqlcondition(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.RoleHqlconditionService#deleteRoleHqlcondition
	 * (java.lang.Long)
	 */
	public void deleteRoleHqlcondition(Long optionId) throws DAOException {
		//
		try {
			roleHqlconditionDAO.deleteRoleHqlcondition(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.UiEntityService#updateUiEntity(com.times
	 * .wap.pojo.testing.UiEntity)
	 */

	public List<RoleHqlcondition> updateSaveRoleHqlcondition(
			List<RoleHqlcondition> entitys) throws DAOException {
		// TODO Auto-generated method stub

		try {
			List<RoleHqlcondition> result = new ArrayList<RoleHqlcondition>();
			for (RoleHqlcondition entity : entitys) {
				result.add((RoleHqlcondition) roleHqlconditionDAO
						.saveOrUpdateEntity(entity));
			}

			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			// return false;
		}

	}

	@Override
	public void deleteRoleHqlcondition(List<RoleHqlcondition> entitys)
			throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (RoleHqlcondition entity : entitys) {

				roleHqlconditionDAO.removeEntity(entity);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}

	public List<RoleHqlcondition> getQueryPagingRoleHqlcondition(
			HQLEntityString entityQueryString) throws DAOException {
		List<RoleHqlcondition> result = new ArrayList<RoleHqlcondition>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<RoleHqlcondition> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	public List<RoleHqlcondition> getQueryRoleHqlcondition(
			HQLEntityString entityQueryString) throws DAOException {

		List<RoleHqlcondition> result = new ArrayList<RoleHqlcondition>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<RoleHqlcondition> it = queryDAO2.queryForIterator(qLWrapper);
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

	public RoleHqlconditionDAO getRoleHqlconditionDAO() {
		return roleHqlconditionDAO;
	}

	public void setRoleHqlconditionDAO(RoleHqlconditionDAO roleHqlconditionDAO) {
		this.roleHqlconditionDAO = roleHqlconditionDAO;
	}
}
