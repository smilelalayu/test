/*
 * 创建日期 2006-6-2
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 * 
 */
package com.times.acs.core;

import java.io.Serializable;


public interface AccessControl extends Serializable {

    /**
     * @param resources 给定的资源（uri，classname,classname+methodname）
     * @return     是否有权限
     * @throws Exception
     */
    public boolean validate(String resources) throws Exception;

    /**
     * @param permission  权限代码
     * @return        是否有权限
     * @throws Exception
     */
    public boolean validatePermissions(String permission) throws Exception;

}
