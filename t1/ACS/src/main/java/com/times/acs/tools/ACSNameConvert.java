package com.times.acs.tools;

import com.times.framework.util.INameConvert;

public class ACSNameConvert implements INameConvert {

	@Override
	public String convert(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param name
	 *            生成代码的unit 名称
	 * @return entityName
	 */
	public static String convertAcsEntityName(String name) {
		if (name.toLowerCase().equals("userinfo")) {
			return "UserInfoPOJO";
		} else if (name.toLowerCase().equals("usergrouprole")) {
			return "UsergroupRolePOJO";
		} else if (name.toLowerCase().equals("permission")) {
			return "PermissionsPOJO";
		} else if (name.toLowerCase().equals("role")) {
			return "RolesPOJO";
		} else if (name.toLowerCase().equals("usergroup")) {
			return "UserGroupPOJO";
		} else if (name.toLowerCase().equals("userrole")) {
			return "UserRolePOJO";
		}

		return name;
	}

}
