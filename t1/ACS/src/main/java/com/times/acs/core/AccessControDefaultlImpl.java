/*
 * �������� 2006-6-2
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.core;

import java.util.Iterator;

import org.apache.log4j.Logger;

import com.times.acs.core.exception.NoExistUserException;
import com.times.acs.core.exception.StopUserException;
import com.times.acs.core.usermanager.CurrentUser;
import com.times.acs.core.usermanager.UserPool;
import com.times.acs.pojo.admin.UserGroupPOJO;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.pojo.admin.UsergroupRolePOJO;
import com.times.acs.service.admin.UsergroupService;
import com.times.acs.service.admin.UserinfoService;
import com.times.framework.service.ServiceLocator;

public class AccessControDefaultlImpl implements AccessControl {

	private static final Logger log = Logger
			.getLogger(AccessControDefaultlImpl.class);

	private ResourceToPermission rtp;

	public ResourceToPermission getRtp() {
		return rtp;
	}

	public void setRtp(ResourceToPermission rtp) {
		
		this.rtp = rtp;
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see com.times.acs.core.AccessControl#validate(java.lang.String)
	 */
	public boolean validate(String resources) throws Exception {

		boolean flag = false;
		if (resources == null || resources.equals("")) {
			return flag;

		}

		String permission = rtp.getPermission(resources);

		return validatePermissions(permission);

	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.acs.core.AccessControl#validatePermissions(java.lang.String)
	 */
	public boolean validatePermissions(String permission) throws Exception {
		boolean flag = false;
		if (permission == null || permission.equals("")) {
			return flag;

		}

		try {

			UserInfoPOJO user = CurrentUser.currentUser();
			
			if (user == null) {
				return flag;

			}

			log.info("validate permissions:" + permission);
			// System.out.println(permission);
			// System.out.println(user.getStrPermissions());
			log.info("current user permissions:" + user.getStrPermissions());

			// ��֤�û��Ƿ��ѱ�ֹͣ��
			if (user.getStop().equalsIgnoreCase("y")) {
				throw new StopUserException();
			}
			if (user.getPermissions().size() <= 0) {
				user.setPermissions(UserPool.loadAllPermissions(user));
			}
			if (user.getPermissions().contains(permission.trim())) {
				flag = true;
			}

		} catch (StopUserException e) {
			throw e;
		} catch (Exception e) {
			throw e;
			// log.warn(LogUtil.getExceptionStackTrace(e));

		}
		return flag;

	}

	/**
	 * @param userGroup
	 *            �û���
	 * @param permissionId
	 *            Ȩ��id
	 * @return �û��飨�������ȣ��Ƿ���Ȩ��
	 * @throws Exception
	 */
	private boolean validate(UserGroupPOJO userGroup, String permissionId)
			throws Exception {

		boolean flag = false;
		UsergroupService service = (UsergroupService) ServiceLocator
				.getService("usergroupServiceProxy");
		UserGroupPOJO root = service.getRoot();
		while (!userGroup.equals(root)) {

			Iterator it = userGroup.getRoles().iterator();
			while (it.hasNext()) {

				UsergroupRolePOJO userGroupRole = (UsergroupRolePOJO) it.next();
				if (userGroupRole.getRole().getPermissions()
						.indexOf(permissionId) != -1) {
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			} else {
				userGroup = userGroup.getParent();
			}

		}

		return flag;
	}

	/**
	 * @param permissionId
	 *            Ȩ��id
	 * @throws NoExistPermissionException
	 *             �������׳�NoExistPermissionException�쳣��
	 */
	/*
	 * private void validatePermission(String permissionId) throws
	 * NoExistPermissionException { // boolean flag = false; try {
	 * PermissionService service = (PermissionService) ServiceLocator
	 * .getService("permissionServiceProxy"); PermissionsPOJO permission =
	 * (PermissionsPOJO) service .getPermission(permissionId); } catch
	 * (Throwable e) { throw new NoExistPermissionException(); } }
	 */

	/**
	 * @param userId
	 *            �û�id
	 * @return ����û����ڷ��ش��û����������׳�NoExistUserException�쳣��
	 * @throws NoExistUserException
	 */
	private UserInfoPOJO validateUser(Long userId) throws NoExistUserException {
		// boolean flag = false;
		UserinfoService service = (UserinfoService) ServiceLocator
				.getService("userinfoServiceProxy");
		UserInfoPOJO user = null;
		try {
			user = service.getUserinfo(userId);
		} catch (Throwable e) {

			throw new NoExistUserException();
		}

		return user;

	}

	public static void main(String[] args) {

		AccessControDefaultlImpl accessControl = new AccessControDefaultlImpl();
		long start = 0;
		try {
			start = System.currentTimeMillis();
			// boolean flag = accessControl.validate(new Long("3"), "101");
			// System.out.println(flag);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(System.currentTimeMillis() - start);
		}

	}

}
