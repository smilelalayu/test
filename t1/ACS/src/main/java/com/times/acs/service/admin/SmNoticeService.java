/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin;


import java.util.List;

import com.times.acs.pojo.admin.SmNotice;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;

/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public interface  SmNoticeService extends IService {

    List<SmNotice> getAllSmNotice() throws DAOException;
	SmNotice insertSmNotice(SmNotice smNotice) throws DAOException;
	SmNotice updateSmNotice(SmNotice smNotice) throws DAOException;
	SmNotice getSmNotice(Long smNoticeId) throws DAOException;
	void deleteSmNotice(Long smNoticeId) throws DAOException;
	List<SmNotice> updateSaveSmNotice(List<SmNotice> entitys) throws DAOException;
	 
	List<SmNotice> getQueryPagingSmNotice(HQLEntityString entityQueryString) throws DAOException;
    List<SmNotice> getQuerySmNotice(HQLEntityString entityQueryString) throws DAOException;
    void deleteSmNotice(List<SmNotice> entitys) throws DAOException;
	
    List<SmNotice> updateReadStatus(List<SmNotice> entitys) throws DAOException;
	
    List<SmNotice>  getPortNotice(UserInfoPOJO user) throws DAOException;
}
