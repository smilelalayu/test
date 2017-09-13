/*
 * �������� 2006-6-5
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.core.usermanager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import com.times.acs.pojo.admin.PermissionsPOJO;
import com.times.acs.pojo.admin.RolesPOJO;
import com.times.acs.pojo.admin.UserGroupPOJO;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.pojo.admin.UserRolePOJO;
import com.times.acs.pojo.admin.UsergroupRolePOJO;
import com.times.acs.service.admin.PermissionService;
import com.times.acs.service.admin.RoleService;
import com.times.acs.service.admin.UserGroupRelationService;
import com.times.acs.service.admin.UserinfoService;
import com.times.framework.service.ServiceLocator;

/**
 * @author szhao
 * 
 *         �������е�¼���û�
 * 
 */
public class UserPool implements Serializable {

	private static final Logger log = Logger.getLogger(UserPool.class);

	// static {
	// try {
	// // init();
	// // println();
	// } catch (Exception e) {
	// e.printStackTrace();
	// log.info("user pool restore error!!!");
	// log.error(null, e);
	// }
	// }

	private static HashMap<String, UserInfoPOJO> mp = new HashMap<String, UserInfoPOJO>();

	/**
	 * @param user
	 *            �û�
	 * @param session
	 *            httpsession
	 * 
	 *            ����û�
	 */
	public static void putUser(UserInfoPOJO user, HttpSession session) {

		putUser(user, session, false);

	}

	public static UserInfoPOJO getUser(HttpSession session) {
		if (session == null) {
			return null;
		}
		return mp.get(session.getId());
	}

	public static void putUser(UserInfoPOJO user, HttpSession session,
			boolean isLoadPermission) {

		UserInfoPOJO temp = contains(user);
		if (temp == null) {
			if (isLoadPermission) {
				user.setPermissions(loadAllPermissions(user));
			}
			mp.put(session.getId(), user);
		} else {
			temp.setLoginAgain(true);
			mp.remove(getKey(temp));
			if (isLoadPermission) {
				user.setPermissions(loadAllPermissions(user));
			}
			mp.put(session.getId(), user);
		}

		if (mp.size() > 100 && mp.size() % 100 == 0) {
			log.error("��ǰϵͳ����Ϊ��" + mp.size());
		}

	}

	public static boolean isContain(HttpSession session) {
		if (session == null) {
			return false;
		}

		return mp.containsKey(session.getId());
	}

	/**
	 * @param session
	 * 
	 *            ��sessionʧЧʱ���ô˷���
	 * 
	 */
	public static void removeUser(HttpSession session) {

		mp.remove(session.getId());

	}

	/**
	 * @param userGroup
	 *            �û���
	 * 
	 *            �˷�����Ϊ�û�������ɫʱ �����������Ϊ���û�����û���Ȩ�ޡ�
	 */
	public static void updateUsers(UserGroupPOJO userGroup) {

		Iterator it = mp.values().iterator();

		UserinfoService userService = (UserinfoService) ServiceLocator
				.getService("userinfoServiceProxy");
		while (it.hasNext()) {
			UserInfoPOJO userInfo = (UserInfoPOJO) it.next();
			if (userService.isAncestor(userGroup, userInfo)) {
				userInfo.getPermissions().clear();

			}
		}

	}

	/**
	 * @param userInfo
	 * 
	 *            �˷�����Ϊ�û������ɫʱ��������û���Ȩ�ޡ�
	 */
	public static void updateUserPermissions(UserInfoPOJO userInfo) {

		UserInfoPOJO temp = contains(userInfo);
		if (temp != null) {
			temp.getPermissions().clear();

		}

	}

	/**
	 * @param userInfo
	 * 
	 *            ����session�е��û�
	 */
	public static void updateUsers(UserInfoPOJO userInfo) {

		UserInfoPOJO temp = contains(userInfo);
		println();
		if (temp != null) {
			String key = getKey(temp);
			UserInfoPOJO sessionUsers = (UserInfoPOJO) mp.get(key);
			try {
				BeanUtils.copyProperties(sessionUsers, userInfo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		println();
	}

	/**
	 * @param userID
	 *            �û�ID
	 * @return ��ȡ���е��û�Ӧ�ó�������Ȩ��
	 */
	@SuppressWarnings("unchecked")
	public static Set<PermissionsPOJO> loadAPPPermissionsByUserID(Long userID) {

		if (userID == null) {
			return null;
		}
		Set<PermissionsPOJO> allPerm = loadAllPermissions(userID);
		Set<PermissionsPOJO> result = new HashSet<PermissionsPOJO>();
		for (PermissionsPOJO perm : allPerm) {

			if (perm.getResources().startsWith(PermissionsPOJO.PERM_TYPE)) {
				result.add(perm);
			}

		}

		return result;

	}

	/**
	 * @param roleID
	 *            ��ɫID
	 * @return ��ɫ��Ӧ��Ȩ��
	 */
	@SuppressWarnings("unchecked")
	public static Set<PermissionsPOJO> loadAllPermissionsByRoleID(Long roleID) {
		Set<PermissionsPOJO> result = new HashSet<PermissionsPOJO>();
		RolesPOJO role = null;
		if (roleID != null) {
			RoleService service = (RoleService) ServiceLocator
					.getService("rolesPOJOServiceProxy");
			role = service.getRole(roleID);

			if (role == null) {

				return result;
			}
			PermissionService permservice = (PermissionService) ServiceLocator
					.getService("permissionsPOJOServiceProxy");

			List<String> userPerms = new ArrayList<String>();
			Set set = new HashSet();
			set.add(role);
			userPerms.addAll(getPermissionsByRoles(set));

			for (PermissionsPOJO perm : (List<PermissionsPOJO>) permservice
					.getAllPermission()) {

				if (userPerms.contains(perm.getCode().toString())) {
					result.add(perm);
				}

			}

		}
		return result;

	}

	@SuppressWarnings("unchecked")
	public static Set<PermissionsPOJO> loadAllPermissionsByCode(String code) {
		Set<PermissionsPOJO> result = new HashSet<PermissionsPOJO>();
		RolesPOJO role = null;
		if (code != null) {
			RoleService service = (RoleService) ServiceLocator
					.getService("rolesPOJOServiceProxy");
			role = service.getRoleByCode(code);

			if (role == null) {

				return result;
			}
			PermissionService permservice = (PermissionService) ServiceLocator
					.getService("permissionsPOJOServiceProxy");

			List<String> userPerms = new ArrayList<String>();
			Set set = new HashSet();
			set.add(role);
			userPerms.addAll(getPermissionsByRoles(set));

			for (PermissionsPOJO perm : (List<PermissionsPOJO>) permservice
					.getAllPermission()) {

				if (userPerms.contains(perm.getCode().toString())) {
					result.add(perm);
				}

			}

		}
		return result;

	}

	/**
	 * @param user
	 *            �û�
	 * @return �û�������Ȩ��
	 */
	@SuppressWarnings("unchecked")
	public static Set<PermissionsPOJO> loadAllPermissionsByDB(Long userID) {

		UserInfoPOJO user = null;
		if (userID != null) {
			UserinfoService userService = (UserinfoService) ServiceLocator
					.getService("userinfoServiceProxy");
			user = userService.getUserinfo(userID, true);

			if (user == null) {

				return null;
			}
			PermissionService permservice = (PermissionService) ServiceLocator
					.getService("permissionsPOJOServiceProxy");

			List<String> userPerms = getPermissionsByUserRoles(user.getRoles());

			for (PermissionsPOJO perm : (List<PermissionsPOJO>) permservice
					.getAllPermission()) {

				if (userPerms.contains(perm.getCode().toString())) {
					user.getPermissions().add(perm);
				}

			}

			// userGroup = userGroup.getParent();

			// }

		}
		// ����û��Ľ�ɫ
		UserInfoPOJO current = CurrentUser.currentUser();

		for (UserRolePOJO urole : user.getRoles()) {
			String roleName = urole.getRole().getRoleName();
			String roleCode = urole.getRole().getRoleCode();
			if (!current.getRoleNames().contains(roleName)) {
				current.getRoleNames().add(roleName);
			}

			if (!current.getRoleCodes().contains(roleCode)) {
				current.getRoleCodes().add(roleCode);
			}

		}
		if (user.getUserGroup() != null) {
			current.setOrgCode(user.getUserGroup().getGroupCode());
		}

		return user.getPermissions();

	}

	public static Set<PermissionsPOJO> loadAllPermissions(Long userID) {
		return loadAllPermissions(userID, false);
	}

	/**
	 * @param userID
	 *            �û�ID
	 * @return �û�������Ȩ��
	 */
	public static Set<PermissionsPOJO> loadAllPermissions(Long userID,
			boolean isAncestor) {
		Set<PermissionsPOJO> result=new HashSet<PermissionsPOJO>();
		List<String> userPerms = getPermissionsByUserID(userID, isAncestor);
		PermissionService permservice = (PermissionService) ServiceLocator
				.getService("permissionsPOJOServiceProxy");
		for (PermissionsPOJO perm : (List<PermissionsPOJO>) permservice
				.getAllPermission()) {

			if (userPerms.contains(perm.getCode().toString())) {
				result.add(perm);
			}

		}

		// userGroup = userGroup.getParent();

		// }
		return result;

	}

	/**
	 * @param user
	 *            �û�
	 * @return �û�������Ȩ��
	 */
	public static Set<PermissionsPOJO> loadAllPermissions(UserInfoPOJO user) {
		if (user != null) {
			return loadAllPermissions(user.getUserId());
		}

		return null;

	}

	/**
	 * ��յ�ǰ�����û���Ȩ��
	 */
	public static void removeAllPermissions() {
		Iterator it = mp.values().iterator();
		while (it.hasNext()) {
			UserInfoPOJO user = (UserInfoPOJO) it.next();
			user.getPermissions().clear();

		}

	}

	/**
	 * @param userInfo
	 *            �û�
	 * 
	 *            ���ĳ���û���Ȩ��
	 */
	public static void removeAllPermissions(UserInfoPOJO userInfo) {
		userInfo.getPermissions().clear();

	}

	private static String getKey(UserInfoPOJO user) {
		Iterator it = mp.keySet().iterator();
		String id = null;
		while (it.hasNext()) {
			Object o = it.next();
			UserInfoPOJO userInfo = (UserInfoPOJO) mp.get(o);
			if (userInfo.getUserId().equals(user.getUserId())) {
				id = o.toString();
				break;
			}

		}
		return id;

	}

	/**
	 * @param userInfo
	 *            �û�
	 * @return �û�
	 * 
	 *         �ж��û��Ƿ��ڴ��û�����
	 */
	private static UserInfoPOJO contains(UserInfoPOJO userInfo) {
		UserInfoPOJO user = null;
		if (mp.containsValue(userInfo)) {
			Iterator it = mp.values().iterator();

			while (it.hasNext()) {

				user = (UserInfoPOJO) it.next();
				if (user.getUserId().equals(userInfo.getUserId())) {

					break;
				}

			}

		}
		return user;
	}

	/**
	 * @param userID
	 *            �û�id
	 * @param isAncestor
	 *            �Ƿ�������ȵ�Ȩ�޼���
	 * @return Ȩ�޴�����б�
	 */
	public static List<String> getPermissionsByUserID(Long userID,
			boolean isAncestor) {
		List<String> result = new ArrayList<String>();

		if (userID != null) {
			UserinfoService userService = (UserinfoService) ServiceLocator
					.getService("userinfoServiceProxy");
			UserInfoPOJO user = userService.getUserinfo(userID, true);

		
			UserGroupRelationService groupRelation = (UserGroupRelationService) ServiceLocator
					.getService("userGroupRelationService");

			// List<String> userPerms = getPermissionsByGroupRoles(user
			// .getUserGroup().getRoles());

			if (isAncestor) {
				result.addAll(groupRelation.getAllPermissionByUser(userID));
			} else {
				result = getPermissionsByGroupRoles(user.getUserGroup()
						.getRoles());
			}

			result.addAll(getPermissionsByUserRoles(user.getRoles()));
		}
		return result;
	}

	/**
	 * @param roles
	 * @return
	 */
	public static Collection<String> getPermissionsByRoles(
			Collection<RolesPOJO> roles) {

		Set<String> perms = new HashSet<String>();
		Iterator<RolesPOJO> it = roles.iterator();
		while (it.hasNext()) {
			RolesPOJO role = (RolesPOJO) it.next();
			String strPerms = role.getPermissions();
			if (strPerms != null) {
				StringTokenizer st = new StringTokenizer(strPerms, ",");
				while (st.hasMoreTokens()) {
					perms.add(st.nextToken());

				}

			}
		}
		return perms;

	}

	/**
	 * @param roles
	 *            UserRolePOJO�ļ���
	 * @return Ȩ�޵ļ���
	 */
	public static ArrayList<String> getPermissionsByUserRoles(
			Set<UserRolePOJO> roles) {

		ArrayList<String> perms = new ArrayList<String>();
		Iterator it = roles.iterator();
		while (it.hasNext()) {
			UserRolePOJO userRole = (UserRolePOJO) it.next();
			String strPerms = userRole.getRole().getPermissions();
			if (strPerms != null) {
				StringTokenizer st = new StringTokenizer(strPerms, ",");
				while (st.hasMoreTokens()) {
					perms.add(st.nextToken());

				}

			}

		}

		return perms;

	}

	/**
	 * @param roles
	 *            UsergroupRolePOJO�ļ���
	 * @return Ȩ�޵ļ���
	 */
	public static List<String> getPermissionsByGroupRoles(Set roles) {

		ArrayList<String> perms = new ArrayList<String>();
		Iterator it = roles.iterator();
		while (it.hasNext()) {
			UsergroupRolePOJO groupRole = (UsergroupRolePOJO) it.next();
			String strPerms = groupRole.getRole().getPermissions();
			if (strPerms != null) {
				StringTokenizer st = new StringTokenizer(strPerms, ",");
				while (st.hasMoreTokens()) {
					String perm = st.nextToken();
					if (!perms.contains(perm)) {
						perms.add(perm);
					}

				}

			}

		}

		return perms;

	}

	public static void main(String[] args) {
		UserinfoService userService = (UserinfoService) ServiceLocator
				.getService("userinfoServiceProxy");
		UserInfoPOJO user = userService.getUserinfo(new Long(4), true);
		user.setPermissions(loadAllPermissions(user));
		System.out.println(user.getPermissions());

	}

	/**
	 * ������е��û���Ϣ
	 */
	private static void println() {
		Iterator it = mp.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next().toString();
			UserInfoPOJO user = (UserInfoPOJO) mp.get(key);
			log.info("sessionid=" + key);
			log.info("userName=" + user.getUserName());
			// System.out.println("sessionid=" + key);
			// System.out.println("userName=" + user.getUserName());

		}
	}

	public static void destroy() throws IOException {

		try {
			ObjectOutputStream ot = new ObjectOutputStream(
					new FileOutputStream("UserPool.out"));
			println();
			ot.writeObject(mp);
		} catch (FileNotFoundException e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
			log.error(null, e);
		} catch (IOException e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
			log.error(null, e);
		}

	}

	public static void init() throws Exception {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					"UserPool.out"));
			mp = (HashMap) in.readObject();
			removeAllPermissions();
		} catch (FileNotFoundException e) {
			// TODO �Զ����� catch ��
			// e.printStackTrace();
			throw e;
		} catch (IOException e) {
			// TODO �Զ����� catch ��
			// e.printStackTrace();
			throw e;
		} catch (ClassNotFoundException e) {
			// TODO �Զ����� catch ��
			// e.printStackTrace();
			throw e;
		}

	}

}
