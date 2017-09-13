package com.times.acs.core.hql;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.times.acs.core.usermanager.CurrentUser;
import com.times.acs.pojo.admin.RoleHqlcondition;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.service.admin.RoleHqlconditionService;
import com.times.framework.dao.QLWrapper;
import com.times.framework.dao.hibernate.HQLWrapperConvertImpl;
import com.times.framework.dao.hibernate.dto.HQLCondition;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.j2ee.util.PropertyManager;

@Repository(value = "qlWrapperConvert")
public class ACSQLWrapperConvert extends HQLWrapperConvertImpl {

	private static final Logger log = Logger
			.getLogger(ACSQLWrapperConvert.class);

	public static String VAR_PREFIX = "#{";
	public static String CURRENT_USER_VAR = "#{currentUser}";

	static List<RoleHqlcondition> conditions = new ArrayList<RoleHqlcondition>();

	@Autowired
	 RoleHqlconditionService roleHqlconditionService;

	public ACSQLWrapperConvert() {
		super();
	}

	@Override
	public QLWrapper getQLWrapperByHQLEntityString(HQLEntityString entityString)
			throws Exception {
		// TODO Auto-generated method stub

		try {
			// 当session 过期后，经过数据权限处理，抛出异常。
			addHQLConditionByDataPerm(entityString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(e.getMessage(), e);
			throw e;

		}

		try {
			String openDataPerm = PropertyManager.getString("open_dataperm");
			if (openDataPerm.equalsIgnoreCase("true")) {
				log.info(entityString.getHQLString());

				for (HQLCondition cond : entityString.getConditions()) {

					log.info(" param name:" + cond.getParamName()
							+ " param value:" + cond.getParamValue());

				}

			}
		} catch (Exception e) {

		}

		try {
			return super.getQLWrapperByHQLEntityString(entityString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(e.getMessage(), e);
			return null;
		}

	}

	public  boolean isContainDataRolePerm(String entityName) {
		if (conditions.size() <= 0) {
			loadAllRoleHqlcondition();
		}
		for (RoleHqlcondition condition : conditions) {
			if (condition.getEntityName().equals(entityName)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param entityString
	 */
	public  void addHQLConditionByDataPerm(HQLEntityString entityString)
			throws Exception {

		if (conditions.size() <= 0) {
			loadAllRoleHqlcondition();
		}

		// List<HQLCondition> conds = new ArrayList<HQLCondition>();

		String entityName = entityString.getEntityName();

		UserInfoPOJO userInfo = CurrentUser.currentUser();

		if (userInfo != null) {

			List<String> roleCodes = CurrentUser.currentUser().getRoleCodes();
			

			// 取得当前的
			List<RoleHqlcondition> currentRoleCond = new ArrayList<RoleHqlcondition>();

			for (RoleHqlcondition rolecon : conditions) {

				if (roleCodes.contains(rolecon.getRoleCode())
						&& entityName.equals(rolecon.getEntityName())) {
					currentRoleCond.add(rolecon);
				}
			}

			// 组织为链表,子孙结构
			List<RoleHqlcondition> linkConds = new ArrayList<RoleHqlcondition>();

			for (RoleHqlcondition con : currentRoleCond) {

				if (con.getParentid() == null || con.getParentid() == 0) {

					linkConds.add(con);

				} else {

					for (RoleHqlcondition parent : currentRoleCond) {

						if (con.getParentid().longValue() == parent.getId()) {

							parent.getChilds().add(con);

						}
					}

				}

			}

			for (RoleHqlcondition con : linkConds) {

				HQLCondition result = getHQLConditions(con);

				if (result != null) {

					entityString.addRoleDataPerm(con.getRoleName(), result);
				}

			}

		} else {
			String prod = "";
			try {
				prod = PropertyManager.getString("prod_mode");

			} catch (Exception e) {
				e.printStackTrace();

			}

			if (prod != null && prod.equalsIgnoreCase("true")) {
				if (isContainDataRolePerm(entityName)) {
					throw new Exception("请重新登录系统！");
				}
			}

		}

	}

	private static HQLCondition getHQLConditions(RoleHqlcondition roleHqlCon) {

		List<HQLCondition> result = new ArrayList<HQLCondition>();

		HQLCondition hqlCon = new HQLCondition();

		if (roleHqlCon == null) {
			return null;
		}

		hqlCon.setFieldName(roleHqlCon.getFieldName());
		hqlCon.setJoinWord(roleHqlCon.getJoinWord());
		hqlCon.setOperator(roleHqlCon.getOperator());

		hqlCon.setParamName(roleHqlCon.getParamName());
		if (roleHqlCon.getParamName() == null
				|| roleHqlCon.getParamName().trim().equals("")) {
			hqlCon.setParamName(roleHqlCon.getFieldName());

		}

		hqlCon.setParamValue(getParamValue(roleHqlCon));

		if (roleHqlCon.getChilds().size() > 0) {
			for (RoleHqlcondition child : roleHqlCon.getChilds()) {

				HQLCondition r = getHQLConditions(child);
				if (r != null) {
					hqlCon.getChildren().add(r);
				}

			}
		}

		return hqlCon;

	}

	private static Object getParamValue(RoleHqlcondition roleHqlCon) {
		Object result = null;

		if (roleHqlCon == null || roleHqlCon.getParamValue() == null) {
			return null;
		}

		return getParamValue(roleHqlCon.getFldType(),
				roleHqlCon.getParamValue());
	}

	public static Object getParamValue(String type, String value) {

		Object result = null;
		if (type == null) {
			type = "";
		}
		if (value.startsWith(VAR_PREFIX)) {
			if (value.startsWith(CURRENT_USER_VAR)) {
				String[] flds = value.split("\\.");

				String fldName = flds[1];
				try {
					UserInfoPOJO userInfo = CurrentUser.currentUser();
					Field fld = userInfo.getClass().getDeclaredField(fldName);
					fld.setAccessible(true);
					result = fld.get(userInfo);
				} catch (Exception e) {
					result = null;
				}

			}
		} else if (type.equals(String.class.getName())) {

			result = value;

		} else if (type.equals(Boolean.class.getName())) {
			result = Boolean.parseBoolean(value);
		} else if (type.equals(Long.class.getName())) {

			result = Long.parseLong(value);

		} else if (type.equals(Date.class.getName())) {
			// 需要知道日期仓储格式
			result = new Date();

		} else if (type.equals(Integer.class.getName())) {
			result = Integer.parseInt(value);
		} else if (type.equals(Double.class.getName())) {
			result = Double.parseDouble(value);
		} else if (type.equals(Float.class.getName())) {
			result = Float.parseFloat(value);
		} else if (type.equals(String[].class.getName())) {
			result = value.split(",");

		}

		return result;
	}

	// public static getDataPerm

	public  void loadAllRoleHqlcondition() {

		// RoleHqlconditionService service = (RoleHqlconditionService)
		// ServiceLocator
		// .getService("roleHqlconditionServiceProxy");

		conditions = roleHqlconditionService.getAllRoleHqlcondition();

	}

	public static void main(String[] args) {
		// ACSQLWrapperConvert.getParamValue(null, "#currentUser.enterID");

		System.out.println(String[].class.getName());
		System.out.println(Integer.class.getName());

	}
}
