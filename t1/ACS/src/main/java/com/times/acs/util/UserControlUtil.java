package com.times.acs.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.times.acs.core.usermanager.UserPool;
import com.times.acs.pojo.admin.PermissionsPOJO;
import com.times.acs.pojo.admin.RolesPOJO;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.pojo.admin.UserRolePOJO;
import com.times.acs.service.admin.PermissionService;
import com.times.acs.service.admin.RoleService;
import com.times.framework.service.ServiceLocator;

/**
 * 用于用户登录时用户角色，权限的获取
 * 
 * @author liwei
 * 
 */
public class UserControlUtil {
	

	// 通过用户ID得到所有权限
	public static Set<PermissionsPOJO> loadAllPermissionsByDB(UserInfoPOJO user) {
		
		List<String> roleCodes = user.getRoleCodes();
		if(roleCodes==null){
			roleCodes=new ArrayList<String>();
			user.setRoleCodes(roleCodes);
		}
		if(roleCodes.size()==0){
			for (UserRolePOJO urole : user.getRoles()) {
				String roleName = urole.getRole().getRoleName();
				if (!user.getRoleNames().contains(roleName)) {
					user.getRoleNames().add(roleName);
				}
				String roleCode =urole.getRole().getRoleCode();
				if(roleCode!=null && !"".equals(roleCode)){
					if(!user.getRoleCodes().contains(roleCode)){
						user.getRoleCodes().add(roleCode);
					}
				}
				

			}
	
		}
		Set<PermissionsPOJO> result=loadAllPermissionsByCode(roleCodes);
		return result;

	}
	public static Set<PermissionsPOJO> demoSuperAdmin(){
		PermissionService permservice = (PermissionService) ServiceLocator
				.getService("permissionsPOJOServiceProxy");
		List<PermissionsPOJO> list = permservice.getAllPermission();
		
		Set<PermissionsPOJO> result = new HashSet<PermissionsPOJO>();
		result.addAll(list);
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public static Set<PermissionsPOJO> loadAllPermissionsByCode(List<String> roleCodes) {
		Set<PermissionsPOJO> result = new HashSet<PermissionsPOJO>();
		if(roleCodes==null || roleCodes.size()==0){
			
			return result;
		}
		RoleService service = (RoleService) ServiceLocator
				.getService("rolesPOJOServiceProxy");
		
		List<RolesPOJO> roles = service.getRolesByRoleCodes(roleCodes);
		if(roles==null || roles.size()==0){
			return result;
		}
		List<String> userPerms = new ArrayList<String>();
		userPerms.addAll(UserPool.getPermissionsByRoles(roles));
		PermissionService permservice = (PermissionService) ServiceLocator
				.getService("permissionsPOJOServiceProxy");
		
		for (PermissionsPOJO perm : (List<PermissionsPOJO>) permservice
				.getAllPermission()) {

			if (userPerms.contains(perm.getCode().toString())) {
				result.add(perm);
			}

		}		
		
		return result;

	}
	
	
	
}
