/*
 * �������� 2005-8-18
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.service.admin;

import java.util.Iterator;
import java.util.List;

import com.times.acs.pojo.admin.PermissionsPOJO;
import com.times.acs.pojo.admin.PermissionsPOJO;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;
import com.times.framework.service.IService;


/**
 * @author Administrator
 *
 * TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public interface  PermissionService extends IService {

    Iterator getAllPermission(Long parentId) throws DAOException;
	PermissionsPOJO insertPermission(PermissionsPOJO permission) throws DAOException;
	PermissionsPOJO updatePermission(PermissionsPOJO permission) throws DAOException;
	PermissionsPOJO getPermission(Long permissionId) throws DAOException;
    PermissionsPOJO getPermission(String permissionId) throws DAOException;
	void deletePermission(Long permissionId) throws DAOException;
	List getAllPermission() throws DAOException;
	
	
	
	List<PermissionsPOJO> updateSavePermissionsPOJO(List<PermissionsPOJO> entitys) throws DAOException;
	 
	List<PermissionsPOJO> getQueryPagingPermissionsPOJO(HQLEntityString entityQueryString) throws DAOException;
    List<PermissionsPOJO> getQueryPermissionsPOJO(HQLEntityString entityQueryString) throws DAOException;
    void deletePermissionsPOJO(List<PermissionsPOJO> entitys) throws DAOException;
    
    
}
