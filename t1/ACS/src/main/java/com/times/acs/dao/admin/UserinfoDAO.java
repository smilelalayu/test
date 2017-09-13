
package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.UserInfoPOJO;


/**
 * @author Administrator
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public interface UserinfoDAO extends BaseDAO{
    
	public UserInfoPOJO insertUserinfo(UserInfoPOJO userinfo) throws DAOException;
	public UserInfoPOJO updateUserinfo(UserInfoPOJO userinfo) throws DAOException;
	public UserInfoPOJO loadUserinfo(Long userinfoId) throws DAOException;
	public void deleteUserinfo(Long userinfoId) throws DAOException;  
}
