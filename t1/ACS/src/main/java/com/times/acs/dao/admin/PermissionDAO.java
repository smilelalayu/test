package com.times.acs.dao.admin;

import com.times.framework.dao.BaseDAO;
import com.times.framework.exception.DAOException;
import com.times.acs.pojo.admin.PermissionsPOJO;

/**
 * @author Administrator
 * 
 * TODO 要更改此生成的类型注释的模板，请转至 窗口 － 首选项 － Java － 代码样式 － 代码模板
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
