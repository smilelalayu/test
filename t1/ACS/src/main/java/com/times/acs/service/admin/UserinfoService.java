/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.service.admin;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.times.acs.pojo.admin.UserGroupPOJO;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;

/**
 * @author Administrator
 * 
 *         TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת�� ���� �� ��ѡ�� �� Java �� ������ʽ ��
 *         ����ģ��
 */
public interface UserinfoService extends IService {

	Iterator getAllUserinfo(Long parentId) throws DAOException;

	UserInfoPOJO insertUserinfo(UserInfoPOJO userinfo) throws DAOException;

	UserInfoPOJO updateUserinfo(UserInfoPOJO userinfo) throws DAOException;

	UserInfoPOJO getUserinfo(Long userinfoId) throws DAOException;

	UserInfoPOJO getUserinfo(Long userinfoId, boolean containsUserRole)
			throws DAOException;

	UserInfoPOJO getUserinfo(String userName) throws DAOException;
	
	UserInfoPOJO getUserinfoByLoginName(String loginName) throws DAOException;
	
	UserInfoPOJO getUserinfoByToken(String token) throws DAOException;
	
	String getUserPasswordById(Long userinfoId) throws DAOException;

	void deleteUserinfo(Long userinfoId) throws DAOException;

	Iterator getAllUserinfo() throws DAOException;

	void deleteUserinfo(UserInfoPOJO userInfo) throws DAOException;

	boolean isAncestor(UserGroupPOJO userGroup, UserInfoPOJO userInfo)
			throws DAOException;

	public List<UserInfoPOJO> updateSaveUserInfoPOJO(List<UserInfoPOJO> entitys)
			throws DAOException;

	public void deleteUserInfoPOJO(List<UserInfoPOJO> entitys)
			throws DAOException;

	List<UserInfoPOJO> getQueryPagingUserInfoPOJO(
			HQLEntityString entityQueryString) throws DAOException;

	List<UserInfoPOJO> getQueryUserInfoPOJO(HQLEntityString entityQueryString)
			throws DAOException;
	
	List<UserInfoPOJO> getUserAndRoleLists(HQLEntityString entityQueryString);
	
	
	/**
	 * �����û���ɫ����ѯ�û�
	 * @param roleCode
	 * @return
	 */
	public List<UserInfoPOJO> getUserByRole(String roleCode);
	
	
	

	/**
	 * @param LoginName  �û����
	 * @param roleCode  ��ɫ����
	 * @return
	 * 
	 *   ȡ���û����ڵ���֯���ڸ���֯���²�ѯ��ɫ����ΪroleCode���û�
	 */
	public List<UserInfoPOJO> getUserByUserGroupAndRole(String loginName,String roleCode);
	
	
	
	
	/**
	 * <p>将用户信息返回到修改页面<br/>
	 * @title updateusers<br/>
	 * @date 2014-7-30 上午10:07:44<br/>
	 * @author dongjz<br/>
	 * @version v1.0.0
	 * </p>
	 * 
	 * @param id
	 * @return
	 * <pre>
	 * 无匹配数据：
	 * 成功：
	 * 失败：
	 * </pre>
	 */
	public UserInfoPOJO forwardUpdateusers(Long id);
	/**
	 * <p>保存用户组织机构及基本信息<br/>
	 * @title saveOrUpdate<br/>
	 * @date 2014-7-30 上午9:54:19<br/>
	 * @author dongjz<br/>
	 * @version v1.0.0
	 * </p>
	 * 
	 * @param userInfo
	 * @param groupIds
	 * @param groupName
	 * <pre>
	 * 无匹配数据：
	 * 成功：
	 * 失败：
	 * </pre>
	 */
	public void saveOrUpdate(UserInfoPOJO userInfo,Set<String> groupIds,Set<String> groupName);
	/**
	 * <p>删除用户，用户的多组织机构及用户的菜单<br/>
	 * @title deleteUserinfo<br/>
	 * @date 2014-7-30 下午5:46:09<br/>
	 * @author dongjz<br/>
	 * @version v1.0.0
	 * </p>
	 * 
	 * @param userinfoId
	 * @throws DAOException
	 * <pre>
	 * 无匹配数据：
	 * 成功：
	 * 失败：
	 * </pre>
	 */
	void deleteUserinfo_UserGroup(Long userinfoId) throws DAOException;
	
	
	/**
	 * 启用或停用用户
	 * @param userIds 
	 * @param flag   n y
	 * @return
	 * @throws DAOException
	 */
	boolean updateUserStart(List<Long> userIds,String flag,String status) throws DAOException;
	
	/**
	 * @Method: getUserNamesBypermission
	 * @Description:获取该权限所有的用户
	 * @param permission
	 * @return
	 */
	public List<UserInfoPOJO> getUserNamesBypermission(String permission);

}
