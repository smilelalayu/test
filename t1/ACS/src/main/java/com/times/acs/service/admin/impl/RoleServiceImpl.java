/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.service.admin.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miit.acs.service.audit.AuditLogManager;
import com.times.acs.core.usermanager.CurrentUser;
import com.times.acs.dao.admin.RoleDAO;
import com.times.acs.pojo.admin.PermissionsPOJO;
import com.times.acs.pojo.admin.RolesPOJO;
import com.times.acs.pojo.admin.SmLog;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.pojo.admin.UserRolePOJO;
import com.times.acs.service.admin.PermissionService;
import com.times.acs.service.admin.RoleService;
import com.times.acs.service.admin.UserinfoService;
import com.times.acs.service.admin.UserroleService;
import com.times.acs.tools.AppUtils;
import com.times.acs.tools.BzLogUtil;
import com.times.acs.tools.SmLogUtils;
import com.times.framework.dao.QLWrapper;
import com.times.framework.dao.QueryDAO;
import com.times.framework.dao.QueryDAO2;
import com.times.framework.dao.hibernate.dto.HQLCondition;
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
public class RoleServiceImpl implements RoleService {

	/*
	 * ���� Javadoc��
	 * 
	 * @see com.times.wap.service.testing.RoleService#getAllRole()
	 */
    @Autowired
	QueryDAO2 queryDAO2;
    
    @Autowired
	QueryDAO queryDAO;

    @Autowired
	RoleDAO roleDAO;

	public Iterator getAllRole(Long groupId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			String querySql = "select hql_role from RolesPOJO hql_role where hql_role.group.groupId= "
					+ groupId + " order by hql_role.roleId asc";
			String countSql = "select count(*) from RolesPOJO hql_role where hql_role.group.groupId= "
					+ groupId + " order by hql_role.roleId asc";

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
	 * com.times.wap.service.testing.RoleService#insertRole(com.times.wap.pojo
	 * .testing.RolesPOJO)
	 */
	public RolesPOJO insertRole(RolesPOJO role) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			// String content = " 角色.."+
			// " 角色名称："+role.getRoleName()+".code："+role.getReserver1() ;
			// BzLogUtil.saveLog(BzLogUtil.MOUDLE_ROLE,content,BzLogUtil.OPER_NEW);
			return roleDAO.insertRole(role);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.RoleService#updateRole(com.times.wap.pojo
	 * .testing.RolesPOJO)
	 */

	public RolesPOJO updateRole(RolesPOJO role) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			// String content = " 角色.."+
			// " 角色名称："+role.getRoleName()+".code："+role.getReserver1()+" pemissions:"+role.getPermissions()
			// ;
			// BzLogUtil.saveLog(BzLogUtil.MOUDLE_ROLE,content,BzLogUtil.OPER_EDIT);
			return roleDAO.updateRole(role);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see com.times.wap.service.testing.RoleService#getRole(java.lang.Long)
	 */
	public RolesPOJO getRole(Long optionId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			return (RolesPOJO) roleDAO.loadRole(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see com.times.wap.service.testing.RoleService#deleteRole(java.lang.Long)
	 */
	public void deleteRole(Long optionId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			RolesPOJO role = this.getRole(optionId);

			// String content = " 角色.."+
			// " 角色名称："+role.getRoleName()+".code："+role.getReserver1() ;
			// BzLogUtil.saveLog(BzLogUtil.MOUDLE_ROLE,content,BzLogUtil.OPER_DELETE);

			roleDAO.deleteRole(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	public List<RolesPOJO> updateSaveRolesPOJO(List<RolesPOJO> entitys)
			throws DAOException {
		// TODO Auto-generated method stub

		try {
			List<RolesPOJO> result = new ArrayList<RolesPOJO>();
			for (RolesPOJO entity : entitys) {
				if (entity.getCreateTime() == null) {
					entity.setCreateTime(new Date());

				}
				boolean update = false;
				int operate = BzLogUtil.OPER_NEW;
				if (entity.getRoleId() != null) {
					update = true;
					operate = BzLogUtil.OPER_EDIT;
				}
				// String content = " 角色.."+
				// " 角色名称："+entity.getRoleName()+".code："+entity.getReserver1()
				// ;
				// BzLogUtil.saveLog(BzLogUtil.MOUDLE_ROLE,content,operate);
				entity.setModifyTime(new Date());
				result.add((RolesPOJO) roleDAO.saveOrUpdateEntity(entity));
			}

			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			// return false;
		}

	}

	@Override
	public void deleteRolesPOJO(List<RolesPOJO> entitys) throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (RolesPOJO entity : entitys) {
				// String content = " 角色.."+
				// " 角色名称："+entity.getRoleName()+".code："+entity.getReserver1()
				// ;
				// BzLogUtil.saveLog(BzLogUtil.MOUDLE_ROLE,content,BzLogUtil.OPER_DELETE);
				roleDAO.removeEntity(entity);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}

	public List getAllRole() throws DAOException {
		HQLEntityString hes = new HQLEntityString(RolesPOJO.class.getName());
		hes.suffixHQL(" order by roleId asc");

		return this.getQueryRolesPOJO(hes);
	}

	public List<RolesPOJO> getQueryPagingRolesPOJO(
			HQLEntityString entityQueryString) throws DAOException {
		List<RolesPOJO> result = new ArrayList<RolesPOJO>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<RolesPOJO> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}

	// getQueryRolesPOJO
	public List<RolesPOJO> getQueryRolesPOJO(HQLEntityString entityQueryString)
			throws DAOException {

		List<RolesPOJO> result = new ArrayList<RolesPOJO>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<RolesPOJO> it = queryDAO2.queryForIterator(qLWrapper);
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

	public QueryDAO getQueryDAO() {
		return queryDAO;
	}

	public void setQueryDAO(QueryDAO queryDAO) {
		this.queryDAO = queryDAO;
	}

	public RoleDAO getRoleDAO() {
		return roleDAO;
	}

	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	@Override
	public List<UserInfoPOJO> getUserByRoleID(Long roleID) throws DAOException {
		// TODO Auto-generated method stub
		List<UserInfoPOJO> result = new ArrayList<UserInfoPOJO>();

		RolesPOJO role = this.getRole(roleID);
		if (role == null) {
			return result;
		}
		Set<UserRolePOJO> set = role.getUserRoles();

		if (AppUtils.getAppCode() != null
				&& !AppUtils.getAppCode().trim().equals("")) {
			String appCode = AppUtils.getAppCode();
			for (UserRolePOJO userRole : set) {
				if (userRole.getUser().getAppCode().equals(appCode)) {
					result.add(userRole.getUser());
				}

			}
		} else {
			for (UserRolePOJO userRole : set) {
				result.add(userRole.getUser());

			}
		}

		return result;
	}

	@Override
	public void updateRolesUserMapping(Long roleID, List<Long> userIDs,String ip,String userName) {
		StringBuilder newIds = new StringBuilder();
		for(Long id : userIDs){
			newIds.append(id.toString()).append(",");
		}
		// TODO Auto-generated method stub
		RolesPOJO rolePOJO = getRole(roleID);
		UserinfoService userService = (UserinfoService) ServiceLocator
				.getService("userinfoPOJOServiceProxy");

		UserroleService userRoleservice = (UserroleService) ServiceLocator
				.getService("userRolePOJOServiceProxy");

		List<Long> containsID = new ArrayList<Long>();

		List<Long> removeId = new ArrayList<Long>();
		List<UserRolePOJO> removeUserRole = new ArrayList<UserRolePOJO>();
		StringBuilder oldIds = new StringBuilder();
		for (UserRolePOJO userRole : rolePOJO.getUserRoles()) {
			Long id = userRole.getUser().getUserId();
			oldIds.append(id.toString()).append(",");
			if (!userIDs.contains(id)) {
				removeUserRole.add(userRole);
				removeId.add(userRole.getId());
				// role.getUserGroupRoles().
			} else {
				containsID.add(id);
			}
		}

		rolePOJO.getUserRoles().removeAll(removeUserRole);

		userIDs.removeAll(containsID);

		for (Long userRoleID : removeId) {
			userRoleservice.deleteUserrole(userRoleID);
		}

		for (Long userID : userIDs) {
			UserRolePOJO ur = new UserRolePOJO();
			ur.setRole(rolePOJO);
			ur.setUser(userService.getUserinfo(userID));

			userRoleservice.insertUserrole(ur);

		}
		
		SmLogUtils.newCurrentLog();
		SmLogUtils.getCurrentLog().setLoginIp(ip);
		SmLogUtils.getCurrentLog().setLoginName(userName);
		SmLogUtils.getCurrentLog().setType(AuditLogManager.getSmLogType());
		SmLogUtils.setModuleName(SmLogUtils.MODULE_SYSTEM);
		SmLogUtils.appendLog("角色管理-添加用户,由旧值("+oldIds+")到新值("+newIds+")");
		SmLogUtils.saveLogToDB();
	}

	@Override
	public List<RolesPOJO> getRolesByRoleName(String roleNames) {
		// TODO Auto-generated method stub
		if (roleNames == null) {
			return null;
		}
		List<RolesPOJO> roles = new ArrayList<RolesPOJO>();
		String[] roleStrs = roleNames.split(",");

		HQLEntityString entityQueryString = new HQLEntityString(
				RolesPOJO.class.getName());

		HQLCondition cond = new HQLCondition("roleName", roleStrs, "in");

		entityQueryString.getConditions().add(cond);

		return this.getQueryRolesPOJO(entityQueryString);

		// return roles;
	}

	public static void main(String[] args) {
		RoleService service = (RoleService) ServiceLocator
				.getService("rolesPOJOServiceProxy");
		List<String> list = new ArrayList<String>();
		list.add("dbadmin");

		List<RolesPOJO> role = service.getRolesByRoleCodes(list);

		System.out.println(role.size());
	}

	@Override
	public List<PermissionsPOJO> getPermissionsByRoleID(Long roleID) {
		// TODO Auto-generated method stub
		List<PermissionsPOJO> result = new ArrayList<PermissionsPOJO>();
		RolesPOJO role = this.getRole(roleID);

		String perms = role.getPermissions();
		if (perms == null) {
			return result;
		}
		String[] permArr = perms.split(",");
		List<String> permsList = new ArrayList<String>();
		for (String permStr : permArr) {
			permsList.add(permStr);
		}
		// permArr.

		PermissionService service = (PermissionService) ServiceLocator
				.getService("permissionsPOJOServiceProxy");
		List<PermissionsPOJO> permPOJOs = service.getAllPermission();
		for (PermissionsPOJO perm : permPOJOs) {
			if (permsList.contains(perm.getCode().toString())) {
				result.add(perm);
			}
		}

		return result;
	}

	@Override
	public RolesPOJO getRoleByCode(String code) throws DAOException {
		HQLEntityString entityQueryString = new HQLEntityString(
				RolesPOJO.class.getName());

		HQLCondition cond = new HQLCondition("reserver1", code);

		HQLCondition cond1 = new HQLCondition("roleCode", "=", "or", code);
		cond.getChildren().add(cond1);

		entityQueryString.getConditions().add(cond);
		List<RolesPOJO> list = this.getQueryRolesPOJO(entityQueryString);

		if (list != null && list.size() != 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<RolesPOJO> getRolesByRoleCodes(List<String> roleCodes) {
		if (roleCodes == null || roleCodes.size() == 0) {
			return null;
		}
		List<RolesPOJO> roles = new ArrayList<RolesPOJO>();
		String[] roleStrs = roleCodes.toArray(new String[] {});

		HQLEntityString entityQueryString = new HQLEntityString(
				RolesPOJO.class.getName());

		HQLCondition cond = new HQLCondition("reserver1", roleStrs, "in");
		HQLCondition cond2 = new HQLCondition("roleCode", "in", "or", roleStrs);
		cond.getChildren().add(cond2);
		entityQueryString.getConditions().add(cond);
		// entityQueryString.getConditions().add(cond2);

		return this.getQueryRolesPOJO(entityQueryString);

	}
	
	@Override
	public void updateRolesUserMappingLog(Long roleID, List<Long> userIDs,List<String> userNames,String ip,String userName) {
		Map<String,String> map = new HashMap<String,String>();
		StringBuilder newNames = new StringBuilder();
		for(String name : userNames){
			newNames.append(name.toString()).append(",");
		}
		// TODO Auto-generated method stub
		RolesPOJO rolePOJO = getRole(roleID);
		UserinfoService userService = (UserinfoService) ServiceLocator
				.getService("userinfoPOJOServiceProxy");

		UserroleService userRoleservice = (UserroleService) ServiceLocator
				.getService("userRolePOJOServiceProxy");

		List<Long> containsID = new ArrayList<Long>();

		List<Long> removeId = new ArrayList<Long>();
		List<UserRolePOJO> removeUserRole = new ArrayList<UserRolePOJO>();
		StringBuilder oldNames = new StringBuilder();
		for (UserRolePOJO userRole : rolePOJO.getUserRoles()) {
			Long id = userRole.getUser().getUserId();
			Long sjid = userRole.getUser().getUserGroup().getSjID();
			UserInfoPOJO currentUser = CurrentUser.currentUser();
			if(currentUser!=null && currentUser.getUserGroup().getSjID().equals(sjid)){
				oldNames.append(userRole.getUser().getUserName()).append(",");
			}
			if (!userIDs.contains(id)&&(currentUser!=null && currentUser.getUserGroup().getSjID().equals(sjid))) {
				removeUserRole.add(userRole);
				removeId.add(userRole.getId());
				// role.getUserGroupRoles().
			} else {
				containsID.add(id);
			}
		}

		rolePOJO.getUserRoles().removeAll(removeUserRole);

		userIDs.removeAll(containsID);

		for (Long userRoleID : removeId) {
			userRoleservice.deleteUserrole(userRoleID);
		}

		for (Long userID : userIDs) {
			UserRolePOJO ur = new UserRolePOJO();
			ur.setRole(rolePOJO);
			ur.setUser(userService.getUserinfo(userID));

			userRoleservice.insertUserrole(ur);

		}
		map.put("角色名称", rolePOJO.getRoleName());
		String logContent = generateXmlContentForOut(map, "用户", oldNames.toString(), newNames.toString());
		SmLogUtils.newCurrentLog();
		SmLogUtils.getCurrentLog().setLoginIp(ip);
		SmLogUtils.getCurrentLog().setLoginName(userName);
		SmLogUtils.getCurrentLog().setLogContent(logContent);
		SmLogUtils.getCurrentLog().setOperType(SmLog.OPERTYPE_MODIFY);
		SmLogUtils.getCurrentLog().setLogTitle("角色用户" + " -- 修改");
		SmLogUtils.getCurrentLog().setType(AuditLogManager.getSmLogType());
		SmLogUtils.getCurrentLog().setResult(SmLog.LOG_AUDIT_RESULT_SUCCESS);
		SmLogUtils.getCurrentLog().setModuleName("角色");
		SmLogUtils.saveLogToDB();
	}
	
	/**
	 * 生成新建、修改xml内容  (不走aop调用)
	 * 如果是新建.返回内容：<log><new><标题>**</标题><主送>***</主送></new></log>
	 * 如果是修改.返回内容：<log><old><标题>**</标题><主送>***</主送></old><new><标题>**</标题><主送>***</主送></new></log>
	 * entity:配置信息  arg0：old arg1：new 
	 * @return
	 */
	public String generateXmlContentForOut(Map<String,String> map,String showName,String oldValue,String newValue){
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("log");
		//old节点
		Element oldElement = root.addElement("old");//old节点
		Set<String> key = map.keySet();
	    for(Iterator it = key.iterator(); it.hasNext();) {
	         String s = (String) it.next();
	         Element ele1 = oldElement.addElement(s);
			 ele1.setText(map.get(s)!=null?map.get(s):"");
	    }
	    Element ele11 = oldElement.addElement(showName);
	    ele11.setText(oldValue);
	    //new节点
	    Element newElement = root.addElement("new");
	    for(Iterator it = key.iterator(); it.hasNext();) {
	         String s = (String) it.next();
	         Element ele2 = newElement.addElement(s);
			 ele2.setText(map.get(s)!=null?map.get(s):"");
	    }
	    Element ele22 = newElement.addElement(showName);
	    ele22.setText(newValue);		
		return document.asXML();
	}

}
