/*
 * �������� 2006-6-14
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.times.acs.pojo.admin.PermissionsPOJO;
import com.times.acs.service.admin.PermissionService;
import com.times.framework.service.ServiceLocator;

public class ResourceToPermissionImpl implements ResourceToPermission {

	public String getPermission(String resource) {
		String code = null;
		try {
			PermissionService service = (PermissionService) ServiceLocator
					.getService("permissionServiceProxy");
			Iterator it = service.getAllPermission().iterator();
			while (it.hasNext()) {
				PermissionsPOJO pers = (PermissionsPOJO) it.next();
				if (pers.getResources() != null
						&& resource.indexOf(pers.getResources()) != -1) {
					code = pers.getCode().toString();
					break;
				}

			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return code;

	}

	private void validatePermission() {

		boolean flag = false;

	}

	@Override
	public List<PermissionsPOJO> getPermisssions(List<String> resource) {
		// TODO Auto-generated method stub
		List<PermissionsPOJO> result = new ArrayList<PermissionsPOJO>();
		try {
			PermissionService service = (PermissionService) ServiceLocator
					.getService("permissionServiceProxy");
			Iterator it = service.getAllPermission().iterator();
			while (it.hasNext()) {
				PermissionsPOJO pers = (PermissionsPOJO) it.next();
				if (resource.contains(pers.getResources())) {
					if (!result.contains(pers)) {
						result.add(pers);
					}
				}

			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
}
