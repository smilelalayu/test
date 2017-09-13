/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.service.admin.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.miitgxt.common.util.SystemUtils;
import com.times.acs.core.usermanager.CurrentUser;
import com.times.acs.dao.admin.UserinfoDAO;
import com.times.acs.pojo.admin.PermissionsPOJO;
import com.times.acs.pojo.admin.RolesPOJO;
import com.times.acs.pojo.admin.UserGroupPOJO;
import com.times.acs.pojo.admin.UserGroupRelation;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.pojo.admin.UserRolePOJO;
import com.times.acs.service.admin.RoleService;
import com.times.acs.service.admin.UserGroupRelationService;
import com.times.acs.service.admin.UsergroupService;
import com.times.acs.service.admin.UserinfoService;
import com.times.acs.service.admin.UserroleService;
import com.times.acs.tools.BzLogUtil;
import com.times.acs.util.MoudleUtil;
import com.times.acs.util.SmNoticeUtil;
import com.times.acs.util.UmModelUtil;
import com.times.framework.dao.QLWrapper;
import com.times.framework.dao.QueryDAO;
import com.times.framework.dao.QueryDAO2;
import com.times.framework.dao.hibernate.dto.HQLCondition;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.ServiceLocator;
import com.times.j2se.util.MD5Utils;

/**
 * @author Administrator
 * 
 *         TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת�� ���� �� ��ѡ�� �� Java �� ������ʽ ��
 *         ����ģ��
 */

@Service
public class UserinfoServiceImpl implements UserinfoService {

	/*
	 * ���� Javadoc��
	 * 
	 * @see com.times.wap.service.testing.UserinfoService#getAllUserinfo()
	 */
	@Autowired
	QueryDAO queryDAO;

	@Autowired
	protected UserinfoDAO userinfoDAO;

	@Autowired
	protected RoleService roleService;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private UserGroupRelationService userGroupRelationService;

	final Logger log = Logger.getLogger(UserinfoServiceImpl.class);

	@Transactional
	public Iterator getAllUserinfo(Long groupId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			String querySql = "select hql_userinfo from com.times.acs.pojo.admin.UserInfoPOJO hql_userinfo where hql_userinfo.group.groupId= "
					+ groupId + " order by hql_userinfo.userId asc";
			String countSql = "select count(*) from com.times.acs.pojo.admin.UserInfoPOJO hql_userinfo where hql_userinfo.group.groupId= "
					+ groupId + " order by hql_userinfo.userId asc";

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

	public boolean isAncestor(UserGroupPOJO userGroup, UserInfoPOJO userInfo)
			throws DAOException {
		boolean flag = false;
		if (userInfo.getUserGroup().equals(userGroup)) {
			return true;

		}
		UsergroupService service = (UsergroupService) ServiceLocator
				.getService("usergroupServiceProxy");
		UserGroupPOJO root = service.getRoot();

		UserGroupPOJO temp = userInfo.getUserGroup();
		while (!temp.equals(root)) {
			if (temp.equals(userGroup)) {
				flag = true;
				break;
			}
			temp = temp.getParent();

		}

		return flag;
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.UserinfoService#insertUserinfo(com.times
	 * .wap.pojo.testing.UserInfoPOJO)
	 */
	public UserInfoPOJO insertUserinfo(UserInfoPOJO userinfo)
			throws DAOException {
		// TODO �Զ���ɷ������
		try {
			String content = " 司局用户.." + " 用户名称：" + userinfo.getUserName()
					+ ".登录名：" + userinfo.getLoginName() + "..机构："
					+ userinfo.getUserGroup().getGroupName();
			BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content,
					BzLogUtil.OPER_NEW);
			userinfo.setPassword(MD5Utils.getJavaSecurityMD5("abc@123456"));// 添加默认密码
			return userinfoDAO.insertUserinfo(userinfo);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.UserinfoService#updateUserinfo(com.times
	 * .wap.pojo.testing.UserInfoPOJO)
	 */

	public UserInfoPOJO updateUserinfo(UserInfoPOJO userinfo)
			throws DAOException {
		// TODO �Զ���ɷ������
		try {
			return userinfoDAO.updateUserinfo(userinfo);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.UserinfoService#getUserinfo(java.lang.Long)
	 */
	public UserInfoPOJO getUserinfo(Long optionId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			return (UserInfoPOJO) userinfoDAO.loadUserinfo(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	public UserInfoPOJO getUserinfo(String userName) throws DAOException {
		UserInfoPOJO user = null;
		try {
			StringBuffer hql = new StringBuffer();
			hql.append("select hql_userinfo from com.times.acs.pojo.admin.UserInfoPOJO hql_userinfo where hql_userinfo.userName='"
					+ userName + "' and  hql_userinfo.stop='n'");

			Iterator it = queryDAO.queryForIterator(hql.toString());

			while (it.hasNext()) {
				user = (UserInfoPOJO) it.next();

			}
			try {
				if (user != null) {
					Hibernate.initialize(user.getRoles());
					Hibernate.initialize(user.getUserGroup());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return user;
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	public UserInfoPOJO getUserinfoByLoginName(String loginName)
			throws DAOException {
		UserInfoPOJO user = null;
		try {
			StringBuffer hql = new StringBuffer();
			hql.append("select hql_userinfo from com.times.acs.pojo.admin.UserInfoPOJO hql_userinfo where hql_userinfo.loginName='"
					+ loginName + "' and  hql_userinfo.stop='n'");

			Iterator it = queryDAO.queryForIterator(hql.toString());

			while (it.hasNext()) {
				user = (UserInfoPOJO) it.next();

			}
			try {
				if (user != null) {
					Hibernate.initialize(user.getRoles());
					Hibernate.initialize(user.getUserGroup());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return user;
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}
	
	public UserInfoPOJO getUserinfoByToken(String token)
			throws DAOException {
		UserInfoPOJO user = null;
		try {
			StringBuffer hql = new StringBuffer();
			hql.append("select hql_userinfo from com.times.acs.pojo.admin.UserInfoPOJO hql_userinfo where hql_userinfo.token='"
					+ token + "' and  hql_userinfo.stop='n'");

			Iterator it = queryDAO.queryForIterator(hql.toString());

			while (it.hasNext()) {
				user = (UserInfoPOJO) it.next();

			}
			try {
				if (user != null) {
					Hibernate.initialize(user.getRoles());
					Hibernate.initialize(user.getUserGroup());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return user;
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	public UserInfoPOJO getUserinfo(Long userinfoId, boolean containsUserRole)
			throws DAOException {
		try {
			if (containsUserRole) {
				UserInfoPOJO userInfo = userinfoDAO.loadUserinfo(userinfoId);
				userInfo.getRoles().iterator();

				return userInfo;

			} else {
				return getUserinfo(userinfoId);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.UserinfoService#deleteUserinfo(java.lang
	 * .Long)
	 */
	public void deleteUserinfo(Long optionId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			UserInfoPOJO user = this.getUserinfo(optionId);
			String content = " 删除司局用户.." + " 用户ID：" + optionId + "。名称："
					+ user.getUserName() + ".登录名：" + user.getLoginName()
					+ "..机构：" + user.getUserGroup().getGroupName();
			BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content,
					BzLogUtil.OPER_DELETE);
			userinfoDAO.deleteUserinfo(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	public void deleteUserinfo(UserInfoPOJO user) throws DAOException {
		// TODO �Զ���ɷ������
		try {

			String content = " 删除司局用户.." + " 用户ID：" + user.getUserId() + "。名称："
					+ user.getUserName() + ".登录名：" + user.getLoginName()
					+ "..机构：" + user.getUserGroup().getGroupName();
			BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content,
					BzLogUtil.OPER_DELETE);
			userinfoDAO.removeEntity(user);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	public Iterator getAllUserinfo() throws DAOException {

		HQLEntityString hes = new HQLEntityString(UserInfoPOJO.class.getName());

		hes.suffixHQL(" order by userId asc ");

		return getQueryUserInfoPOJO(hes).iterator();
	}

	public QueryDAO getQueryDAO() {
		return queryDAO;
	}

	public void setQueryDAO(QueryDAO queryDAO) {
		this.queryDAO = queryDAO;
	}

	public UserinfoDAO getUserinfoDAO() {
		return userinfoDAO;
	}

	public void setUserinfoDAO(UserinfoDAO userinfoDAO) {
		this.userinfoDAO = userinfoDAO;
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	@Override
	public List<UserInfoPOJO> updateSaveUserInfoPOJO(List<UserInfoPOJO> entitys)
			throws DAOException {
		// TODO Auto-generated method stub
		boolean update = false;
		try {
			List<UserInfoPOJO> result = new ArrayList<UserInfoPOJO>();
			for (UserInfoPOJO entity : entitys) {

				// if(entity.getModifyTime()==null){
				entity.setModifyTime(new Date());
				// }
				if (entity.getCreateTime() == null) {
					entity.setCreateTime(new Date());

				}
				System.out.println("'"+entity.getPassword()+"'"); 
				if(entity.getPassword()==null || "".equals(entity.getPassword())){
					//设置默认密码
					entity.setPassword(MD5Utils.getJavaSecurityMD5("abc@123456"));
				}else{
					Long userId=entity.getUserId();
					String oldpassword=this.getUserPasswordById(userId);
					
					if (entity.getPassword().equals(oldpassword)) {
						//entity.setPassword(entity.getPassword());
					}else{
						entity.setPassword(MD5Utils.getJavaSecurityMD5(entity.getPassword()));
					}								
				}	
				//设置UserStatus状态
				if(entity.getUserStatus()==null||"".equals(entity.getUserStatus())){
					entity.setUserStatus("job");
				}
				
				int operate = BzLogUtil.OPER_NEW;
				if (entity.getUserId() != null) {
					update = true;
					operate = BzLogUtil.OPER_EDIT;
				}

				String content = " 司局用户.." + " 用户名称：" + entity.getUserName()
						+ ".登录名：" + entity.getLoginName() + "..机构："
						+ entity.getUserGroup().getGroupName();
				BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content, operate);
				System.out.println(entity.toString());
				
				UserInfoPOJO user = (UserInfoPOJO) userinfoDAO
						.saveOrUpdateEntity(entity);
				result.add(user);
				insertUserRole(user);// 内网，添加用户角色
			}
			if (!update) {
				updateSendSysMessage(result);
			}
			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			// return false;
		}

	}

	/**
	 * 通知安全保密员启用用户，分管局通知
	 * 
	 * @param result
	 */
	public void updateSendSysMessage(List<UserInfoPOJO> result) {
		// 如果不行，这里改用usercategory查询
	
		List<UserInfoPOJO> secUsers = getUserByRole(RolesPOJO.SYSTEM_SECURITY_OFFICER);
		int moduleId = MoudleUtil.Module_User;
		String linkPage = "com.jj.acs.ui.client.NewUserManage";
		String sysMode = UmModelUtil.getSysUserManagerMode();

		for (int i = 0; i < result.size(); i++) {
			UserInfoPOJO ta = result.get(i);
			if (!ta.getUserCategory().equals(UserInfoPOJO.USER_TYPE_BIZ)) {
				continue;
			}
			List<UserInfoPOJO> tmpUsers = secUsers;
			Long tasjID = ta.getUserGroup().getSjID();
			if (sysMode.equals("1")) {
				tmpUsers = this.getSplitUsers(secUsers, tasjID);
			}

			for (UserInfoPOJO secUser : tmpUsers) {
				Long receiveId = secUser.getUserId();
				String receiveName = secUser.getUserName();
				String ntTitle = "新用户需要启用：" + ta.getUserName();
				String ntContent = "新用户需要启用：" + ta.getUserName() + " 部门："
						+ ta.getUserGroup().getGroupName();
				Long receiveOrgId = secUser.getUserGroup().getSjID();
				SmNoticeUtil.sendNotice(receiveId, receiveName, moduleId,
						ntTitle, ntContent, receiveOrgId, null, null, linkPage);
			}

		}
	}

	// 获取某管局、司局的安全保密员
	private List<UserInfoPOJO> getSplitUsers(List<UserInfoPOJO> all, Long sjId) {
		List<UserInfoPOJO> result = new ArrayList<UserInfoPOJO>();
		for (UserInfoPOJO userInfoPOJO : all) {

			Long uusjId = userInfoPOJO.getUserGroup().getSjID();
			if (uusjId != null && sjId != null
					&& sjId.intValue() == uusjId.intValue()) {
				result.add(userInfoPOJO);
			}
		}

		return result;

	}

	/**
	 * 获取某角色用户，如查安全保密员
	 * 
	 * @param roleCode
	 * @return
	 */
	public List<UserInfoPOJO> getUserByRole(String roleCode) {
		HQLEntityString entityString = new HQLEntityString(
				UserRolePOJO.class.getName());
		HQLCondition<String> condition = new HQLCondition<String>(
				"role.roleCode", roleCode);
		HQLCondition<String> condition2 = new HQLCondition<String>("user.stop",
				"n");
		entityString.addCond(condition);
		entityString.addCond(condition2);

		UserroleService userroleService = (UserroleService) ServiceLocator
				.getService("userroleService");
		List<UserRolePOJO> userRoles = userroleService
				.getQueryUserRolePOJO(entityString);
		List<UserInfoPOJO> list = new ArrayList<UserInfoPOJO>();
		for (UserRolePOJO userRolePOJO : userRoles) {
			UserInfoPOJO user = userRolePOJO.getUser();
			// UserInfoPOJO.USER_TYPE_BIZ
			list.add(user);
		}

		return list;
	}

	public void deleteUserInfoPOJO(List<UserInfoPOJO> entitys)
			throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (UserInfoPOJO entity : entitys) {
				String content = " 删除企业用户.." + " 用户ID：" + entity.getUserId()
						+ "。名称：" + entity.getUserName() + ".登录名："
						+ entity.getLoginName() + "..机构："
						+ entity.getUserGroup().getGroupName();
				BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content,
						BzLogUtil.OPER_DELETE);
				// 安全保密员，不能删除业务用户
				UserInfoPOJO currentUser = CurrentUser.currentUser();
				if (currentUser.getUserCategory() != null
						&& currentUser.getUserCategory().equals(
								UserInfoPOJO.USER_TYPE_SECURITY)) {
					if (!entity.getUserCategory().equals(
							UserInfoPOJO.USER_TYPE_SECURITY)) {
						continue;// 要删除的用户不是安全保密员，没有权利删除
					} else {
						userinfoDAO.removeEntity(entity);
					}
				} else {
					userinfoDAO.removeEntity(entity);
				}
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}

	public List<UserInfoPOJO> getQueryPagingUserInfoPOJO(
			HQLEntityString entityQueryString) throws DAOException {
		List<UserInfoPOJO> result = new ArrayList<UserInfoPOJO>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserInfoPOJO> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	public List<UserInfoPOJO> getQueryUserInfoPOJO(
			HQLEntityString entityQueryString) throws DAOException {

		List<UserInfoPOJO> result = new ArrayList<UserInfoPOJO>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserInfoPOJO> it = queryDAO2.queryForIterator(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
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

	public static void main(String[] args) {

		UserinfoService service = (UserinfoService) ServiceLocator
				.getService("userinfoServiceProxy");
		HQLEntityString entityQueryString = new HQLEntityString();
		entityQueryString.setEntityName(UserInfoPOJO.class.getName());
		List<UserInfoPOJO> users = service
				.getUserAndRoleLists(entityQueryString);
		System.out.println("userinfo=" + users.get(0).getUserName());

	}

	/**
	 * 内网:将当前用户角色分配给非业务人员
	 * 
	 * @param user
	 */
	private void insertUserRole(UserInfoPOJO user) {
		if (user.getUserCategory() != null
				&& !(UserInfoPOJO.USER_TYPE_BIZ).equals(user.getUserCategory())) {
			user.setStop("n");
			UserInfoPOJO currentUser = CurrentUser.currentUser();
			Set<UserRolePOJO> roles = currentUser.getRoles();
			List<UserRolePOJO> lists = new ArrayList<UserRolePOJO>();
			lists.addAll(roles);// 当前用户所有角色
			List<UserRolePOJO> newUserRoleList = new ArrayList<UserRolePOJO>();
			for (UserRolePOJO role : lists) {
				UserRolePOJO newRole = role;
				newRole.setUser(user);
				newRole.setId(null);
				newUserRoleList.add(newRole);
			}
			UserroleService userRoleservice = (UserroleService) ServiceLocator
					.getService("userRolePOJOServiceProxy");
			userRoleservice.updateSaveUserRolePOJO(newUserRoleList);
		}
	}

	public List<UserInfoPOJO> getUserAndRoleLists(
			HQLEntityString entityQueryString) {
		List<UserInfoPOJO> result = new ArrayList<UserInfoPOJO>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserInfoPOJO> it = queryDAO2.queryForIterator(qLWrapper);
		while (it.hasNext()) {
			UserInfoPOJO user = (UserInfoPOJO) it.next();
			if (user != null) {
				Hibernate.initialize(user.getRoles());
				Set<PermissionsPOJO> permissions = new HashSet<PermissionsPOJO>();
				for (UserRolePOJO ur : user.getRoles()) {
					permissions.addAll(roleService.getPermissionsByRoleID(ur
							.getRole().getRoleId()));
				}
				user.setPermissions(permissions);
			}

			result.add(user);
		}

		return result;
	}

	@Override
	public List<UserInfoPOJO> getUserByUserGroupAndRole(String loginName,
			String roleCode) {
		// TODO Auto-generated method stub
		List<UserInfoPOJO> result = new ArrayList<UserInfoPOJO>();
		// 查找父节点
		UserGroupRelationService groupR = (UserGroupRelationService) ServiceLocator
				.getService("userGroupRelationService");
		List<UserGroupPOJO> groups = groupR
				.getAllGroupByUserLoginName(loginName);
		List<Long> groupIDs = new ArrayList<Long>();

		for (UserGroupPOJO group : groups) {
			groupIDs.add(group.getGroupId());
		}
		// 查找角色为

		List<UserInfoPOJO> users = getUserByRole(roleCode);
		List<Long> userIDs = new ArrayList<Long>();
		for (UserInfoPOJO user : users) {
			userIDs.add(user.getUserId());
		}

		UserGroupRelationService userGroupRelationService = (UserGroupRelationService) ServiceLocator
				.getService("userGroupRelationService");

		HQLEntityString hes = HQLEntityString
				.entityName(UserGroupRelation.class.getName());
		hes.in("group.groupId", groupIDs).in("user.userId", userIDs);

		List<UserGroupRelation> relations = userGroupRelationService
				.getQueryUserGroupRelation(hes);

		for (UserGroupRelation relation : relations) {
			result.add(relation.getUser());
		}

		return result;
	}

	/**
	 * 修改用户信息，根据用户ID查询出用户的组织机构
	 */
	@Override
	public UserInfoPOJO forwardUpdateusers(Long id) {
		UserInfoPOJO users = getUserinfo(id);
		String sql = new String(
				"select b.GROUP_NAME as groupName,b.GROUP_ID as groupId from user_group b where b.GROUP_ID in (select a.GROUP_ID from user_group_relation a where a.USER_ID = ? UNION select c.GROUP_ID from user_info c where c.USER_ID = ?);");
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, id, id);
		StringBuffer groupNames = new StringBuffer();
		StringBuffer groupIds = new StringBuffer();
		for (Map<String, Object> map : list) {
			groupNames.append(map.get("groupName"));
			groupNames.append(",");
			groupIds.append(map.get("groupId"));
			groupIds.append(",");
		}
		groupNames.deleteCharAt(groupNames.length() - 1);
		groupIds.deleteCharAt(groupIds.length() - 1);
		UserGroupPOJO userGroup = new UserGroupPOJO();
		userGroup.setGroupName(groupNames.toString());
		userGroup.setGroupIds(groupIds.toString());
		users.setUserGroup(userGroup);
		return users;
	}

	/**
	 * 保存用户组织机构及基本信息
	 */
	@Override
	public void saveOrUpdate(UserInfoPOJO userInfo, Set<String> groupIds,
			Set<String> groupName) {
		UserInfoPOJO user = saveOrUpdateUserInfoPOJO(userInfo, groupIds,
				groupName);
		UserInfoPOJO userInfoPOJO = new UserInfoPOJO();
		if (!userInfo.equals(userInfoPOJO)) {
			userGroupRelationService.deleUserGroupRelationByUserId(userInfo
					.getUserId());
		}
		saveUserGroupRelation(user, groupIds);
	}

	/**
	 * <p>
	 * 保存组织机构前先用户信息，返回保存完成的对象<br/>
	 * 
	 * @title saveOrUpdateUserInfoPOJO<br/>
	 * @date 2014-7-30 上午9:51:04<br/>
	 * @author dongjz<br/>
	 * @version v1.0.0
	 *          </p>
	 * 
	 * @param userInfo
	 * @param groupIds
	 * @param groupName
	 * @return <pre>
	 * 无匹配数据：
	 * 成功：
	 * 失败：
	 * </pre>
	 */
	public UserInfoPOJO saveOrUpdateUserInfoPOJO(UserInfoPOJO userInfo,
			Set<String> groupIds, Set<String> groupName) {
		List<UserInfoPOJO> entitys = new ArrayList<UserInfoPOJO>();
		if (SystemUtils.isMiitInnerSystem()) {
			userInfo.setStop("y");
		} else {
			userInfo.setStop("n");
		}
		userInfo.setStopStatus("");
		userInfo.setUserCategory(UserInfoPOJO.USER_TYPE_BIZ);
		UserGroupPOJO userGroup = new UserGroupPOJO();
		
		userGroup.setGroupId(Long.valueOf((String) groupIds.toArray()[0]));
//		if(groupName.size()>0){
//			userGroup.setGroupName((String) groupName.toArray()[0]);
//		}
		
		
		userInfo.setUserGroup(userGroup);
		entitys.add(userInfo);
		UserinfoService info = (UserinfoService) ServiceLocator
				.getService("userinfoService");
		List<UserInfoPOJO> result = info.updateSaveUserInfoPOJO(entitys);

		return result.get(0);
	}

	/**
	 * <p>
	 * 插入用户的多组织机构<br/>
	 * 
	 * @title saveUserGroupRelation<br/>
	 * @date 2014-7-30 上午9:52:30<br/>
	 * @author dongjz<br/>
	 * @version v1.0.0
	 *          </p>
	 * 
	 * @param userInfo
	 * @param groupIds
	 * @param groupName
	 *            <pre>
	 * 无匹配数据：
	 * 成功：
	 * 失败：
	 * </pre>
	 */
	public void saveUserGroupRelation(UserInfoPOJO userInfo,
			Set<String> groupIds) {
		for (String groStr : groupIds) {
			Long groupId = Long.valueOf(groStr);
			UserGroupRelation userGroupRelation = new UserGroupRelation();
			UserGroupPOJO userGroupPojo = new UserGroupPOJO();
			UserInfoPOJO userPOJO = new UserInfoPOJO();
			userGroupPojo
					.setGroupId(Long.valueOf(groupId));
			userPOJO.setUserId(userInfo.getUserId());
			userGroupRelation.setGroup(userGroupPojo);
			userGroupRelation.setUser(userPOJO);
			userGroupRelationService.insertUserGroupRelation(userGroupRelation);
		}
		
	}

	@Override
	public void deleteUserinfo_UserGroup(Long userinfoId) throws DAOException {
		deleteUserinfo(userinfoId);
		// smUsermenuitemService.deleSmUsermenuitemByUserId(userinfoId);
		userGroupRelationService.deleUserGroupRelationByUserId(userinfoId);
	}

	@Override
	public boolean updateUserStart(List<Long> userIds,String flag,String status) throws DAOException {
		
		for (Long userId : userIds) {
			UserInfoPOJO userInfo = this.getUserinfo(userId);
			userInfo.setStop(flag);
			if("y".equals(flag)){//IS_STOP y标识停用
				userInfo.setUserStatus("quit");
			}else{
				userInfo.setUserStatus("job");
			}
			userInfo.setStopStatus(status);//停用：选择用户停用状态
			
			String content = " 司局用户.." + " 用户名称：" + userInfo.getUserName()+"..状态："+flag
					+ ".登录名：" + userInfo.getLoginName() + "..机构："+ userInfo.getUserGroup().getGroupName();
			BzLogUtil.saveLog(BzLogUtil.MOUDLE_USER, content,  BzLogUtil.OPER_EDIT);
			userInfo.setModifyTime(new Date());
			UserInfoPOJO user = (UserInfoPOJO) userinfoDAO
					.saveOrUpdateEntity(userInfo);
		}
		
		
		return true;
	}

	@Override
	public String getUserPasswordById(Long userinfoId) throws DAOException {
		 List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		 String pass=null;
		String id=String.valueOf(userinfoId);
		String sql="SELECT PASSWORD FROM USER_INFO WHERE USER_ID= '"+id+"'";
		log.info(sql);
		list=jdbcTemplate.queryForList(sql);
		if(list.size()>0){
		  pass=(String) list.get(0).get("PASSWORD");
		}
		return pass;
	}
  
	@Override
	public List<UserInfoPOJO> getUserNamesBypermission(String permission) {
		List<UserInfoPOJO> list = new ArrayList<>();
		String sql="SELECT DISTINCT u.USER_ID, u.USER_NAME userName FROM user_info u LEFT JOIN user_role ur ON u.USER_ID = ur.USER_ID LEFT JOIN roles r ON r.ROLE_ID = ur.ROLE_ID LEFT JOIN permissions p ON instr(r.permissions, p.`CODE`) > 0 WHERE p.COMMENTS = '"+permission+"'";
		log.info(sql);
		List<Map<String, Object>> tempList=jdbcTemplate.queryForList(sql);
		for (Map<String, Object> map :  tempList)
		{
			UserInfoPOJO user = new UserInfoPOJO();
			user.setUserName(map.get("userName").toString());
			user.setUserId(Long.valueOf(map.get("USER_ID").toString()));
			list.add(user);
		}
		return list;
	}

}
