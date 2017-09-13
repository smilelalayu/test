/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin;


import com.times.acs.pojo.admin.SmApplication;
import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;
import java.util.List;
import com.times.framework.dao.hibernate.dto.HQLEntityString;

/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface  SmApplicationService extends IService {

    List<SmApplication> getAllSmApplication() throws DAOException;
	SmApplication insertSmApplication(SmApplication smApplication) throws DAOException;
	SmApplication updateSmApplication(SmApplication smApplication) throws DAOException;
	SmApplication getSmApplication(Long smApplicationId) throws DAOException;
	void deleteSmApplication(Long smApplicationId) throws DAOException;
	List<SmApplication> updateSaveSmApplication(List<SmApplication> entitys) throws DAOException;
	 
	List<SmApplication> getQueryPagingSmApplication(HQLEntityString entityQueryString) throws DAOException;
    List<SmApplication> getQuerySmApplication(HQLEntityString entityQueryString) throws DAOException;
    void deleteSmApplication(List<SmApplication> entitys) throws DAOException;
	
   String deleteSmApplicationAdnRoles(List<Integer> list) throws Exception;
	
}
