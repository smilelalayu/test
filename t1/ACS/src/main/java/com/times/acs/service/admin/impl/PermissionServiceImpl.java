/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.service.admin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.times.acs.dao.admin.PermissionDAO;
import com.times.acs.pojo.admin.PermissionsPOJO;
import com.times.acs.service.admin.PermissionService;
import com.times.framework.dao.QLWrapper;
import com.times.framework.dao.QueryDAO;
import com.times.framework.dao.QueryDAO2;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;

/**
 * @author Administrator
 * 
 *         TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת�� ���� �� ��ѡ�� �� Java �� ������ʽ ��
 *         ����ģ��
 */
@Service
public class PermissionServiceImpl implements PermissionService {

	/*
	 * ���� Javadoc��
	 * 
	 * @see com.times.wap.service.testing.PermissionService#getAllPermission()
	 */
	@Autowired
	QueryDAO queryDAO;
	@Autowired
	PermissionDAO permissionDAO;

	public Iterator getAllPermission(Long groupId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			String querySql = "select hql_permission from PermissionsPOJO hql_permission where hql_permission.group.groupId= "
					+ groupId + " order by hql_permission.permissionId asc";
			String countSql = "select count(*) from PermissionsPOJO hql_permission where hql_permission.group.groupId= "
					+ groupId + " order by hql_permission.permissionId asc";

			List list = new ArrayList();

			Iterator it = queryDAO.queryOrder(querySql, countSql);

			while (it.hasNext()) {
				list.add(it.next());
			}
			return list.iterator();
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.PermissionService#insertPermission(com.
	 * times.wap.pojo.testing.PermissionsPOJO)
	 */
	public PermissionsPOJO insertPermission(PermissionsPOJO permission)
			throws DAOException {
		// TODO �Զ���ɷ������
		try {
			return permissionDAO.insertPermission(permission);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.PermissionService#updatePermission(com.
	 * times.wap.pojo.testing.PermissionsPOJO)
	 */

	public PermissionsPOJO updatePermission(PermissionsPOJO permission)
			throws DAOException {
		// TODO �Զ���ɷ������
		try {
			return permissionDAO.updatePermission(permission);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.PermissionService#getPermission(java.lang
	 * .Long)
	 */
	public PermissionsPOJO getPermission(Long optionId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			return (PermissionsPOJO) permissionDAO.loadPermission(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	public PermissionsPOJO getPermission(String permissionId)
			throws DAOException {
		try {
			return (PermissionsPOJO) permissionDAO.loadPermission(permissionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.PermissionService#deletePermission(java
	 * .lang.Long)
	 */
	public void deletePermission(Long optionId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			permissionDAO.deletePermission(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	public List getAllPermission() throws DAOException {
		StringBuffer hql = new StringBuffer();
		hql.append("select hql_permission from PermissionsPOJO hql_permission");
		hql.append(" order by hql_permission.code asc");

		Iterator it = queryDAO.queryForIterator(hql.toString());
		List list = new ArrayList();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

	public QueryDAO getQueryDAO() {
		return queryDAO;
	}

	public void setQueryDAO(QueryDAO queryDAO) {
		this.queryDAO = queryDAO;
	}

	public PermissionDAO getPermissionDAO() {
		return permissionDAO;
	}

	public void setPermissionDAO(PermissionDAO permissionDAO) {
		this.permissionDAO = permissionDAO;
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.UiEntityService#updateUiEntity(com.times
	 * .wap.pojo.testing.UiEntity)
	 */

	public List<PermissionsPOJO> updateSavePermissionsPOJO(
			List<PermissionsPOJO> entitys) throws DAOException {
		// TODO Auto-generated method stub

		try {
			List<PermissionsPOJO> result = new ArrayList<PermissionsPOJO>();
			for (Object entity : entitys) {
				result.add((PermissionsPOJO) permissionDAO
						.saveOrUpdateEntity(entity));
			}

			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			// return false;
		}

	}

	@Override
	public void deletePermissionsPOJO(List<PermissionsPOJO> entitys)
			throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (PermissionsPOJO entity : entitys) {

				permissionDAO.removeEntity(entity);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}

	public List<PermissionsPOJO> getQueryPagingPermissionsPOJO(
			HQLEntityString entityQueryString) throws DAOException {
		List<PermissionsPOJO> result = new ArrayList<PermissionsPOJO>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<PermissionsPOJO> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	public List<PermissionsPOJO> getQueryPermissionsPOJO(
			HQLEntityString entityQueryString) throws DAOException {

		List<PermissionsPOJO> result = new ArrayList<PermissionsPOJO>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<PermissionsPOJO> it = queryDAO2.queryForIterator(qLWrapper);
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
	@Autowired
	QueryDAO2 queryDAO2;
}
