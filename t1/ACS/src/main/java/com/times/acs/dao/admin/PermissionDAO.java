package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.PermissionsPOJO;

/**
 * @author Administrator
 * 
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת�� ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public interface PermissionDAO extends BaseDAO {

    public PermissionsPOJO insertPermission(PermissionsPOJO permission)
            throws DAOException;

    public PermissionsPOJO updatePermission(PermissionsPOJO permission)
            throws DAOException;

    public PermissionsPOJO loadPermission(Long permissionId)
            throws DAOException;

    public PermissionsPOJO loadPermission(String permissionId)
            throws DAOException;

    public void deletePermission(Long permissionId) throws DAOException;
}
