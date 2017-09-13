/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin;


import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;
import com.times.acs.pojo.admin.UserMapping;
import java.util.List;
import com.times.framework.dao.hibernate.dto.HQLEntityString;

/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface  UserMappingService extends IService {

    List<UserMapping> getAllUserMapping() throws DAOException;
	UserMapping insertUserMapping(UserMapping userMapping) throws DAOException;
	UserMapping updateUserMapping(UserMapping userMapping) throws DAOException;
	UserMapping getUserMapping(Long userMappingId) throws DAOException;
	void deleteUserMapping(Long userMappingId) throws DAOException;
	List<UserMapping> updateSaveUserMapping(List<UserMapping> entitys) throws DAOException;
	 
	List<UserMapping> getQueryPagingUserMapping(HQLEntityString entityQueryString) throws DAOException;
    List<UserMapping> getQueryUserMapping(HQLEntityString entityQueryString) throws DAOException;
    void deleteUserMapping(List<UserMapping> entitys) throws DAOException;
	
	/**
	 * 根据内网的用户String code 得到Long型ID 
	 * 如果有直接返回，没有就新建然后返回
	 * @return
	 */
	public UserMapping updateGetUserMappingByCode(String userCode);
	
	
}
