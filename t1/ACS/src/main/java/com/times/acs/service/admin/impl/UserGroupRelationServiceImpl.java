/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.times.acs.core.usermanager.UserPool;
import com.times.acs.dao.admin.UserGroupRelationDAO;
import com.times.acs.pojo.admin.UserGroupPOJO;
import com.times.acs.pojo.admin.UserGroupRelation;
import com.times.acs.service.admin.UserGroupRelationService;
import com.times.framework.dao.QLWrapper;
import com.times.framework.dao.QueryDAO2;
import com.times.framework.dao.hibernate.dto.HQLCondition;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.ServiceLocator;

/**
 * @author Administrator
 * 
 *         TODO 要更改此生成的类型注释的模板，请转至 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Service
public class UserGroupRelationServiceImpl implements UserGroupRelationService {

	/*
	 * （非 Javadoc）
	 * 
	 * @see com.times.wap.service.testing.UserGroupRelationService#
	 * getAllUserGroupRelation()
	 */
	@Autowired
	QueryDAO2 queryDAO2;
	@Autowired
	UserGroupRelationDAO userGroupRelationDAO;
	final Logger log = Logger.getLogger(UserGroupRelationServiceImpl.class);
	
	
	public List<UserGroupRelation> getAllUserGroupRelation()
			throws DAOException {
		HQLEntityString entityQueryString = new HQLEntityString();
		entityQueryString.setEntityName(UserGroupRelation.class.getName());

		return getQueryUserGroupRelation(entityQueryString);

	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see com.times.wap.service.testing.UserGroupRelationService#
	 * insertUserGroupRelation(com.times.wap.pojo.testing.UserGroupRelation)
	 */
	public UserGroupRelation insertUserGroupRelation(
			UserGroupRelation userGroupRelation) throws DAOException {
		//
		try {
			return userGroupRelationDAO
					.insertUserGroupRelation(userGroupRelation);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see com.times.wap.service.testing.UserGroupRelationService#
	 * updateUserGroupRelation(com.times.wap.pojo.testing.UserGroupRelation)
	 */

	public UserGroupRelation updateUserGroupRelation(
			UserGroupRelation userGroupRelation) throws DAOException {
		//
		try {
			return userGroupRelationDAO
					.updateUserGroupRelation(userGroupRelation);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.UserGroupRelationService#getUserGroupRelation
	 * (java.lang.Long)
	 */
	public UserGroupRelation getUserGroupRelation(Long optionId)
			throws DAOException {
		//
		try {
			return (UserGroupRelation) userGroupRelationDAO
					.loadUserGroupRelation(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see com.times.wap.service.testing.UserGroupRelationService#
	 * deleteUserGroupRelation(java.lang.Long)
	 */
	public void deleteUserGroupRelation(Long optionId) throws DAOException {
		//
		try {
			userGroupRelationDAO.deleteUserGroupRelation(optionId);
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

	public List<UserGroupRelation> updateSaveUserGroupRelation(
			List<UserGroupRelation> entitys) throws DAOException {
		// TODO Auto-generated method stub

		try {
			List<UserGroupRelation> result = new ArrayList<UserGroupRelation>();
			for (UserGroupRelation entity : entitys) {
				result.add((UserGroupRelation) userGroupRelationDAO
						.saveOrUpdateEntity(entity));
			}

			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			// return false;
		}

	}

	@Override
	public void deleteUserGroupRelation(List<UserGroupRelation> entitys)
			throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (UserGroupRelation entity : entitys) {

				userGroupRelationDAO.removeEntity(entity);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}

	public List<UserGroupRelation> getQueryPagingUserGroupRelation(
			HQLEntityString entityQueryString) throws DAOException {
		List<UserGroupRelation> result = new ArrayList<UserGroupRelation>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserGroupRelation> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	public List<UserGroupRelation> getQueryUserGroupRelation(
			HQLEntityString entityQueryString) throws DAOException {

		List<UserGroupRelation> result = new ArrayList<UserGroupRelation>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserGroupRelation> it = queryDAO2.queryForIterator(qLWrapper);
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

	public UserGroupRelationDAO getUserGroupRelationDAO() {
		return userGroupRelationDAO;
	}

	public void setUserGroupRelationDAO(
			UserGroupRelationDAO userGroupRelationDAO) {
		this.userGroupRelationDAO = userGroupRelationDAO;
	}

	public static void main(String[] args) {

		UserGroupRelationService userGroupRelationService = (UserGroupRelationService) ServiceLocator
				.getService("userGroupRelationService");
		userGroupRelationService.getAllUserGroupRelation();
	}

	@Override
	public List<UserGroupPOJO> getAllGroupByUserId(Long userId) {
		HQLEntityString entityString = new HQLEntityString(
				UserGroupRelation.class.getName());
		HQLCondition<Long> condition = new HQLCondition<Long>("user.userId",
				userId);
		entityString.addCond(condition);
		List<UserGroupRelation> list = getQueryUserGroupRelation(entityString);

		List<UserGroupPOJO> results = new ArrayList<UserGroupPOJO>();
		for (UserGroupRelation relation : list) {
			results.add(relation.getGroup());
		}

		return results;
	}

	@Override
	public List<UserGroupPOJO> getAllGroupByUserLoginName(String loginName) {
		HQLEntityString entityString = new HQLEntityString(
				UserGroupRelation.class.getName());
		HQLCondition condition = new HQLCondition("user.loginName", loginName);
		entityString.addCond(condition);
		List<UserGroupRelation> list = getQueryUserGroupRelation(entityString);

		List<UserGroupPOJO> results = new ArrayList<UserGroupPOJO>();
		for (UserGroupRelation relation : list) {
			results.add(relation.getGroup());
		}
		return results;
	}

	@Override
	public Set<String> getAllPermissionByUser(Long userId) {
		// TODO Auto-generated method stub
		Set<String> result = new HashSet<String>();
		List<UserGroupPOJO> userGroups = getAllGroupByUserId(userId);
		List<UserGroupPOJO> allUserGroups = new ArrayList<UserGroupPOJO>();
		for (UserGroupPOJO group : userGroups) {
			UserGroupPOJO parent = group;
			while (parent != null) {
				if (!allUserGroups.contains(parent)) {
					allUserGroups.add(parent);
				}
				parent = parent.getParent();
			}
		}

		for (UserGroupPOJO group : allUserGroups) {
			result.addAll(UserPool.getPermissionsByGroupRoles(group.getRoles()));
		}

		return result;
	}
	
	 /**
     * <p>删除用户的多组织机构<br/>
     * @title deleUserGroupRelation<br/>
     * @date 2014-7-30 上午9:52:15<br/>
     * @author dongjz<br/>
     * @version v1.0.0
     * </p>
     * 
     * @param userId
     * <pre>
     * 无匹配数据：
     * 成功：
     * 失败：
     * </pre>
     */
	@Override
	public void deleUserGroupRelationByUserId(Long userId) {
		try {
			HQLEntityString entityQueryString = HQLEntityString.entityName(
					UserGroupRelation.class.getName()).equals("user.userId", userId);
			List<UserGroupRelation> userGroupRelationList = getQueryUserGroupRelation(entityQueryString);
			if (!userGroupRelationList.isEmpty()) {
				deleteUserGroupRelation(userGroupRelationList);
			}
		} catch (Exception e) {
			log.info(e.getMessage(), e);
		}
	}
}
