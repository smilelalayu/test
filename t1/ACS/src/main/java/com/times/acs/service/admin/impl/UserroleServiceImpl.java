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

import com.miit.acs.service.audit.AuditLogManager;
import com.times.acs.dao.admin.RoleDAO;
import com.times.acs.dao.admin.UserinfoDAO;
import com.times.acs.dao.admin.UserroleDAO;
import com.times.acs.pojo.admin.SmLog;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.pojo.admin.UserRolePOJO;
import com.times.acs.service.admin.RoleService;
import com.times.acs.service.admin.UserinfoService;
import com.times.acs.service.admin.UserroleService;
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
public class UserroleServiceImpl implements UserroleService {

	/*
	 * ���� Javadoc��
	 * 
	 * @see com.times.wap.service.testing.UserroleService#getAllUserrole()
	 */
	@Autowired
	QueryDAO queryDAO;
	@Autowired
	UserroleDAO userroleDAO;
	@Autowired
	UserinfoDAO userinfoDAO;
	@Autowired
	RoleDAO roleDAO;
	public Iterator getAllUserrole(Long groupId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			String querySql = "select hql_userrole from UserRolePOJO hql_userrole where hql_userrole.group.groupId= "
					+ groupId + " order by hql_userrole.userroleId asc";
			String countSql = "select count(*) from UserRolePOJO hql_userrole where hql_userrole.group.groupId= "
					+ groupId + " order by hql_userrole.userroleId asc";

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
	 * com.times.wap.service.testing.UserroleService#insertUserrole(com.times
	 * .wap.pojo.testing.UserRolePOJO)
	 */
	public UserRolePOJO insertUserrole(UserRolePOJO userrole)
			throws DAOException {
		// TODO �Զ���ɷ������
		try {
			return userroleDAO.insertUserrole(userrole);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.UserroleService#updateUserrole(com.times
	 * .wap.pojo.testing.UserRolePOJO)
	 */

	public UserRolePOJO updateUserrole(UserRolePOJO userrole)
			throws DAOException {
		// TODO �Զ���ɷ������
		try {
			return userroleDAO.updateUserrole(userrole);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.UserroleService#getUserrole(java.lang.Long)
	 */
	public UserRolePOJO getUserrole(Long optionId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			return (UserRolePOJO) userroleDAO.loadUserrole(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see
	 * com.times.wap.service.testing.UserroleService#deleteUserrole(java.lang
	 * .Long)
	 */
	public void deleteUserrole(Long optionId) throws DAOException {
		// TODO �Զ���ɷ������
		try {
			userroleDAO.deleteUserrole(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	public void deleteUserrole(UserRolePOJO userroleId) throws DAOException {
		try {
			userroleDAO.removeEntity(userroleId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	public void removeUserroleFromUserInfo(UserInfoPOJO user, List userroles)
			throws DAOException {

	}

	public Iterator getAllUserrole() throws DAOException {
		StringBuffer hql = new StringBuffer();
		hql.append("select hql_userrole from UserRolePOJO hql_userrole");
		hql.append(" order by hql_userrole.userroleId asc");

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

	public UserroleDAO getUserroleDAO() {
		return userroleDAO;
	}

	public void setUserroleDAO(UserroleDAO userroleDAO) {
		this.userroleDAO = userroleDAO;
	}
	@Autowired
	QueryDAO2 queryDAO2;

	public QueryDAO2 getQueryDAO2() {
		return queryDAO2;
	}

	public void setQueryDAO2(QueryDAO2 queryDAO2) {
		this.queryDAO2 = queryDAO2;
	}

	@Override
	public List<UserRolePOJO> getQueryUserRolePOJO(
			HQLEntityString entityQueryString) throws DAOException {
		// TODO Auto-generated method stub
		List<UserRolePOJO> result = new ArrayList<UserRolePOJO>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<UserRolePOJO> it = queryDAO2.queryForIterator(qLWrapper);
		while (it.hasNext()) {
			result.add(it.next());
		}

		return result;
	}
	
	
	@Override
	public List<UserRolePOJO> getQueryPagingUserRolePOJO(
			HQLEntityString entityQueryString) throws DAOException {
				List<UserRolePOJO> result = new ArrayList<UserRolePOJO>();
				QLWrapper qLWrapper = queryDAO2
						.getQLWrapperByHQLEntityString(entityQueryString);
				Iterator<UserRolePOJO> it = queryDAO2.queryForIterator(qLWrapper);
				while (it.hasNext()) {
					result.add(it.next());
				}

				return result;
	}
	
	
	@Override
	public List<UserRolePOJO> updateSaveUserRolePOJO(List<UserRolePOJO> entitys)
			throws DAOException {
		// TODO Auto-generated method stub

		try {
			List<UserRolePOJO> result = new ArrayList<UserRolePOJO>();
			for (UserRolePOJO entity : entitys) {

				result.add((UserRolePOJO) userroleDAO
						.saveOrUpdateEntity(entity));
			}
			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			// return false;
		}

	}

	@Override
	public List<UserRolePOJO> getAllUserRolePOJO() throws DAOException {
		HQLEntityString entityQueryString = new HQLEntityString();
		entityQueryString.setEntityName(UserRolePOJO.class.getName());
		return getQueryUserRolePOJO(entityQueryString);
	}

	@Override
	public UserRolePOJO insertUserRolePOJO(UserRolePOJO userRolePOJO)
			throws DAOException {
		 try{
	            return  userroleDAO.insertUserrole(userRolePOJO);
	        }
	        catch(Exception e)
	        {
	            throw (new DAOException(e));
	        }
	}

	@Override
	public UserRolePOJO updateUserRolePOJO(UserRolePOJO userRolePOJO)
			throws DAOException {
		try{
            return  userroleDAO.updateUserrole(userRolePOJO);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
	}

	@Override
	public UserRolePOJO getUserRolePOJO(Long userRolePOJOId)
			throws DAOException {
		try{
            return (UserRolePOJO)userroleDAO.loadUserrole(userRolePOJOId);
        }
        catch(Exception e)
        {
            throw(new DAOException(e));
        }
	}

	@Override
	public void deleteUserRolePOJO(Long userRolePOJOId) throws DAOException {
		try{
			userroleDAO.deleteUserrole(userRolePOJOId);
        }
        catch(Exception e)
        {
            throw(new DAOException(e));
        }   
		
	}

	@Override
	public List<UserRolePOJO> getUserRoleByUserId(Long uid) {
		// TODO Auto-generated method stub
		HQLEntityString entityString=new HQLEntityString(UserRolePOJO.class.getName());
		HQLCondition<Long> condition=new HQLCondition<Long>("user.userId",uid);
		entityString.addCond(condition);
		List<UserRolePOJO> list=getQueryPagingUserRolePOJO(entityString);
//		HibernatePOJO2DTOUtils.Convert(list);
		return list;
	}
    /**
     * 为用户添加角色
     * @author dongjz
     */
	@Override
	public void updateUserRoleUserInfoMapping(Long uid, List<Long> inids) {
		String logContent=" 用户：";
		
		
		UserInfoPOJO user=userinfoDAO.loadUserinfo(uid);
		logContent+=user.getLoginName();
		List<Long> containsID=new ArrayList<Long>();
		List<UserRolePOJO> removeList=new ArrayList<UserRolePOJO>();
		List<UserRolePOJO> urList=getUserRoleByUserId(uid);
		String roleOldLog=" 角色由旧值：";
		String roleNewLog=" 修改为新值：";
		for(UserRolePOJO ur:urList){
			Long roleId=ur.getRole().getRoleId();
			if(!inids.contains(roleId)){
				removeList.add(ur);
			}else{
				containsID.add(roleId);
				roleNewLog+=ur.getRole().getRoleName()+",";
			}
			roleOldLog+=ur.getRole().getRoleName()+",";
		}
		deleteMutiMapping(removeList);
		inids.removeAll(containsID);
		for(Long id:inids){
			UserRolePOJO ur=new UserRolePOJO();
			ur.setRole(roleDAO.loadRole(id));
			ur.setUser(user);
			roleNewLog+=ur.getRole().getRoleName()+",";
			insertUserrole(ur);
		}
		if(roleOldLog.endsWith(",")){
			roleOldLog=roleOldLog.substring(0,roleOldLog.length()-1);
		}
		
		if(roleNewLog.endsWith(",")){
			roleNewLog=roleNewLog.substring(0,roleNewLog.length()-1);
		}
		SmLogUtils.appendLog(logContent+roleOldLog+roleNewLog+"。");
		SmLogUtils.getCurrentLog().setType(AuditLogManager.getSmLogType());
	//	SmLogUtils.getCurrentLog().setOperType(SmLog.OPERTYPE_MODIFY);
		SmLogUtils.getCurrentLog().setLogTitle("用户管理-》修改角色;");
		SmLogUtils.getCurrentLog().setModuleName("用户管理");
		
	}
	
	public void deleteMutiMapping(List<UserRolePOJO> list){
		for(UserRolePOJO temp:list){
			deleteUserrole(temp);
		}
	}

}
