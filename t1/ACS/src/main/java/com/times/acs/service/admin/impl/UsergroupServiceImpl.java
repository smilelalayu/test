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

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.times.acs.dao.admin.UsergroupDAO;
import com.times.acs.pojo.admin.RolesPOJO;
import com.times.acs.pojo.admin.UserGroupPOJO;
import com.times.acs.pojo.admin.UsergroupRolePOJO;
import com.times.acs.service.admin.RoleService;
import com.times.acs.service.admin.UsergroupService;
import com.times.acs.service.admin.UsergrouproleService;
import com.times.acs.tools.BzLogUtil;
import com.times.framework.dao.QLWrapper;
import com.times.framework.dao.QueryDAO;
import com.times.framework.dao.QueryDAO2;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.ServiceLocator;

/**
 * @author Administrator
 * 
 *         TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת�� ���� �� ��ѡ�� �� Java �� ������ʽ ��
 *         ����ģ��
 */
@Service
public class UsergroupServiceImpl implements UsergroupService {

	/*
	 * ���� Javadoc��
	 * 
	 * @see com.times.wap.service.testing.UsergroupService#getAllUsergroup()
	 */
	@Autowired
	QueryDAO queryDAO;

	@Autowired
	UsergroupDAO usergroupDAO;

	public UserGroupPOJO getRoot() throws DAOException {

		// UserGroupPOJO root = getUsergroup(new Long(1));
		UserGroupPOJO root = null;
		try {
			String querySql = "select hql_usergroup from UserGroupPOJO hql_usergroup where hql_usergroup.parent is null";

			List list = new ArrayList();

			Iterator it = queryDAO.queryForIterator(querySql);

			while (it.hasNext()) {

				root = (UserGroupPOJO) it.next();
				break;
			}
			// return list.iterator();
		} catch (Exception e) {
			throw (new DAOException(e));
		}
		return root;

	}

	public String getPath(UserGroupPOJO currentGroup) throws DAOException {

		String path = "";
		UserGroupPOJO root = getRoot();
		if (currentGroup == null) {
			return path;
		}

		if (currentGroup.equals(root)) {
			path = root.getGroupName() + ">>";
			return path;

		} else {
			UserGroupPOJO temp = new UserGroupPOJO();
			try {
				BeanUtils.copyProperties(temp, currentGroup);
			} catch (Exception e) {
				e.printStackTrace();
				throw new DAOException();
			}
			int i = 0;
			while (!currentGroup.equals(root)) {
				path = currentGroup.getGroupName() + ">>" + path;
				currentGroup = currentGroup.getParent();
				i++;
				if (i > 10) {
					break;
				}

			}

			path = root.getGroupName() + ">>" + path;
		}
		return path;

	}

	public Iterator getAllUsergroup(Long groupId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			String querySql = "select hql_usergroup from UserGroupPOJO hql_usergroup where hql_usergroup.parent.groupId= "
					+ groupId + " order by hql_usergroup.groupId desc";
			String countSql = "select count(*) from UserGroupPOJO hql_usergroup where hql_usergroup.parent.groupId= "
					+ groupId + " order by hql_usergroup.groupId desc";

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
	 * com.times.wap.service.testing.UsergroupService#insertUsergroup(com.times
	 * .wap.pojo.testing.UserGroupPOJO)
	 */
	public UserGroupPOJO insertUsergroup(UserGroupPOJO usergroup)
			throws DAOException {
		// TODO �Զ���ɷ������
		try {
			String content = " 司局组织结构.." + " 组织名称：" + usergroup.getGroupName()
					+ ".机构代码：" + usergroup.getGroupCode();
			BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content,
					BzLogUtil.OPER_NEW);

			return usergroupDAO.insertUsergroup(usergroup);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.UsergroupService#updateUsergroup(com.times
	 * .wap.pojo.testing.UserGroupPOJO)
	 */

	public UserGroupPOJO updateUsergroup(UserGroupPOJO usergroup)
			throws DAOException {
		// TODO �Զ���ɷ������
		try {
			String content = " 司局组织结构.." + " 组织名称：" + usergroup.getGroupName()
					+ ".机构代码：" + usergroup.getGroupCode();
			BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content,
					BzLogUtil.OPER_EDIT);
			return usergroupDAO.updateUsergroup(usergroup);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.UsergroupService#getUsergroup(java.lang
	 * .Long)
	 */
	public UserGroupPOJO getUsergroup(Long optionId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			return (UserGroupPOJO) usergroupDAO.loadUsergroup(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	public UserGroupPOJO getUsergroup(Long usergroupId, boolean containUsers)
			throws DAOException {
		try {

			if (containUsers) {
				long t = System.currentTimeMillis();
				UserGroupPOJO userGroup = (UserGroupPOJO) usergroupDAO
						.loadUsergroup(usergroupId);
				long t1 = System.currentTimeMillis();
				System.out.println("first:" + (t1 - t));
				t = System.currentTimeMillis();
				userGroup = (UserGroupPOJO) usergroupDAO
						.loadUsergroup(usergroupId);
				t1 = System.currentTimeMillis();
				System.out.println("second:" + (t1 - t));
				userGroup.getUsers().size();
				return userGroup;

			} else {
				return getUsergroup(usergroupId);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}

	public UserGroupPOJO getUsergroupAndChildUsers(Long usergroupId)
			throws DAOException {

		try {
			UserGroupPOJO group = (UserGroupPOJO) usergroupDAO
					.loadUsergroup(usergroupId);
			group.getUsers().size();
			Iterator it = group.getChilds().iterator();
			while (it.hasNext()) {
				UserGroupPOJO child = (UserGroupPOJO) it.next();
				child.getUsers().size();
			}

			return group;
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.UsergroupService#deleteUsergroup(java.lang
	 * .Long)
	 */
	public void deleteUsergroup(Long optionId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			UserGroupPOJO usergroup = this.getUsergroup(optionId);
			String content = " 司局组织结构.." + " 组织名称：" + usergroup.getGroupName()
					+ ".机构代码：" + usergroup.getGroupCode();
			BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content,
					BzLogUtil.OPER_DELETE);

			usergroupDAO.deleteUsergroup(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	public void deleteUsergroup(UserGroupPOJO usergroup) throws DAOException {
		try {
			String content = " 司局组织结构.." + " 组织名称：" + usergroup.getGroupName()
					+ ".机构代码：" + usergroup.getGroupCode();
			BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content,
					BzLogUtil.OPER_DELETE);
			usergroupDAO.deleteUsergroup(usergroup);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	public Iterator getAllUsergroup() throws DAOException {
		StringBuffer hql = new StringBuffer();
		hql.append("select hql_usergroup from UserGroupPOJO hql_usergroup");
		hql.append(" order by hql_usergroup.groupId asc");

		Iterator it = queryDAO.queryForIterator(hql.toString());
		List list = new ArrayList();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list.iterator();
	}

	public QueryDAO getQueryDAO() {
		return queryDAO;
	}

	public void setQueryDAO(QueryDAO queryDAO) {
		this.queryDAO = queryDAO;
	}

	public UsergroupDAO getUsergroupDAO() {
		return usergroupDAO;
	}

	public void setUsergroupDAO(UsergroupDAO usergroupDAO) {
		this.usergroupDAO = usergroupDAO;
	}

	public List<UserGroupPOJO> updateSaveUserGroupPOJO(
			List<UserGroupPOJO> entitys) throws DAOException {
		// TODO Auto-generated method stub

		try {
			List<UserGroupPOJO> result = new ArrayList<UserGroupPOJO>();
			for (UserGroupPOJO entity : entitys) {

				boolean pass = this.checkOrgNameValidate(entity.getGroupName());
				if (!pass) {
					entity.setGroupName(null);

					result.add(entity);
					continue;
				}
				boolean update = false;
				int operate = BzLogUtil.OPER_NEW;
				if (entity.getGroupId() != null) {
					update = true;
					operate = BzLogUtil.OPER_EDIT;
				}
				// 如果司局ID不为空，则新添加信息的司局ID为父机构的司局ID
				if (entity.getParent() != null
						&& entity.getParent().getSjID() != null) {
					entity.setSjID(entity.getParent().getSjID());
				}
				String content = " 司局组织结构.." + " 组织名称：" + entity.getGroupName()
						+ ".机构代码：" + entity.getGroupCode();
				BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content, operate);
				result.add((UserGroupPOJO) usergroupDAO
						.saveOrUpdateEntity(entity));
			}

			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			// return false;
		}

	}

	/**
	 * 检查组织结构是否重复
	 * 
	 * @param orgName
	 * @return
	 */
	public boolean checkOrgNameValidate(String orgName) {
		String hql = " from UserGroupPOJO where groupName='" + orgName + "'";
		List list = usergroupDAO.findEntity(hql);
		if (list == null || list.size() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void deleteUserGroupPOJO(List<UserGroupPOJO> entitys)
			throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (UserGroupPOJO entity : entitys) {
				String content = " 司局组织结构.." + " 组织名称：" + entity.getGroupName()
						+ ".机构代码：" + entity.getGroupCode();
				BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content,
						BzLogUtil.OPER_DELETE);
				usergroupDAO.removeEntity(entity);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}

	public static void main(String[] args) {
		UsergroupService service = (UsergroupService) ServiceLocator
				.getService("usergroupServiceProxy");
		// service.getUsergroup(new Long(2));
		// UserGroupPOJO group = service.getRoot();
		// System.out.println("111111111111111111111111");
		// for (UserGroupPOJO child : group.getChilds()) {
		// System.out.println(child.getGroupName());
		// }
		List<Long> roleIDs = new ArrayList<Long>();
		roleIDs.add(1L);
		roleIDs.add(2L);
		service.updateUserGroupPOJORoles(9L, roleIDs);

	}

	@Override
	public List<UserGroupPOJO> loadAllUsergroupByRoot() {
		// TODO Auto-generated method stub
		List<UserGroupPOJO> result = new ArrayList<UserGroupPOJO>();
		result.add(this.getRoot());
		result.addAll(loadChildrens(this.getRoot()));
		return result;
	}

	private List<UserGroupPOJO> loadChildrens(UserGroupPOJO root) {
		List<UserGroupPOJO> result = new ArrayList<UserGroupPOJO>();

		if (root.getChilds().size() > 0) {
			result.addAll(root.getChilds());
			for (UserGroupPOJO p : root.getChilds()) {
				result.addAll(loadChildrens(p));
			}
		}

		return result;
	}

	/**
	 * 根据组查询所有子类信息
	 * 
	 * @return
	 */
	public List<UserGroupPOJO> loadAllUsergroupByGroup(Long groupId) {
		List<UserGroupPOJO> result = new ArrayList<UserGroupPOJO>();
		UserGroupPOJO group = this.getUsergroup(groupId);
		result.add(group);
		result.addAll(loadChildrens(group));
		return result;
	}

	@Override
	public List<RolesPOJO> getRolesByUserGroupPOJO(Long ID) {
		// TODO Auto-generated method stub
		List<RolesPOJO> result = new ArrayList<RolesPOJO>();

		UserGroupPOJO group = this.getUsergroup(ID);
		if (group == null) {
			return result;
		}

		for (UsergroupRolePOJO role : group.getRoles()) {
			result.add(role.getRole());
		}

		return result;
	}

	@Override
	public UserGroupPOJO updateUserGroupPOJORoles(Long groupID,
			List<Long> roleIDs) {
		// TODO Auto-generated method stub

		UserGroupPOJO userGroup = getUsergroup(groupID);

		RoleService roleservice = (RoleService) ServiceLocator
				.getService("rolesPOJOServiceProxy");

		UsergrouproleService usergroupRoleservice = (UsergrouproleService) ServiceLocator
				.getService("usergroupRolePOJOServiceProxy");

		List<Long> containsID = new ArrayList<Long>();

		List<Long> removeId = new ArrayList<Long>();
		List<UsergroupRolePOJO> removeRole = new ArrayList<UsergroupRolePOJO>();

		for (UsergroupRolePOJO role : userGroup.getRoles()) {
			Long id = role.getRole().getRoleId();
			if (!roleIDs.contains(id)) {
				removeRole.add(role);
				removeId.add(role.getId());
				// role.getUserGroupRoles().
			} else {
				containsID.add(id);
			}
		}

		userGroup.getRoles().removeAll(removeRole);

		roleIDs.removeAll(containsID);

		for (Long roleID : removeId) {
			usergroupRoleservice.deleteUsergrouprole(roleID);
		}

		for (Long roleID : roleIDs) {
			UsergroupRolePOJO ur = new UsergroupRolePOJO();
			ur.setRole(roleservice.getRole(roleID));
			ur.setUserGroup(userGroup);
			userGroup.getRoles().add(
					usergroupRoleservice.insertUsergrouprole(ur));

		}
		//
		//
		// for (Long roleID : roleIDs) {
		// userGroup.getRoles().add(roleservice.getRole(roleID));
		// }

		return this.updateUsergroup(userGroup);
	}

	public List<UserGroupPOJO> getQueryPagingUserGroupPOJO(
			HQLEntityString entityQueryString) throws DAOException {
		List<UserGroupPOJO> result = new ArrayList<UserGroupPOJO>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserGroupPOJO> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	public List<UserGroupPOJO> getQueryUserGroupPOJO(
			HQLEntityString entityQueryString) throws DAOException {

		List<UserGroupPOJO> result = new ArrayList<UserGroupPOJO>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserGroupPOJO> it = queryDAO2.queryForIterator(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	@Override
	public String deleteUserGroupManager(String groupId) {
		String result = null;
		try {
			if (StringUtils.trimToNull(groupId) != null) {
				// 删除以他为父机构下面所有的子机构
				HQLEntityString entityQueryString = new HQLEntityString();
				entityQueryString.setEntityName(UserGroupPOJO.class.getName());
				entityQueryString.setCustomHql(" 1=1 and parent.id=" + groupId);
				List<UserGroupPOJO> lists = getQueryPagingUserGroupPOJO(entityQueryString);
				deleteUserGroupPOJO(lists);
				// 删除本身组织机构
				deleteUsergroup(Long.valueOf(groupId));
				result = "suucess";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "error";
		} finally {

		}
		return result;
	}

	@Autowired
	QueryDAO2 queryDAO2;

	public QueryDAO2 getQueryDAO2() {
		return queryDAO2;
	}

	public void setQueryDAO2(QueryDAO2 queryDAO2) {
		this.queryDAO2 = queryDAO2;
	}

}
