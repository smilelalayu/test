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

import com.times.acs.dao.admin.UsergrouproleDAO;
import com.times.acs.pojo.admin.UsergroupRolePOJO;
import com.times.acs.service.admin.UsergrouproleService;
import com.times.framework.dao.QueryDAO;
import com.times.framework.exception.DAOException;



/**
 * @author Administrator
 *
 * TODO Ҫ��Ĵ���ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
@Service
public class UsergrouproleServiceImpl implements UsergrouproleService {

    /*
     * ���� Javadoc��
     * 
     * @see com.times.wap.service.testing.UsergrouproleService#getAllUsergrouprole()
     */
	@Autowired
    QueryDAO queryDAO;
	@Autowired
    UsergrouproleDAO usergrouproleDAO;

    public Iterator getAllUsergrouprole(Long groupId) throws DAOException {
        // TODO �Զ���ɷ������
        try
        {
            String querySql = "select hql_usergrouprole from UsergroupRolePOJO hql_usergrouprole where hql_usergrouprole.group.groupId= "+groupId+" order by hql_usergrouprole.usergrouproleId asc";
            String countSql = "select count(*) from UsergroupRolePOJO hql_usergrouprole where hql_usergrouprole.group.groupId= "+groupId+" order by hql_usergrouprole.usergrouproleId asc";
            
            List list =new ArrayList();
    		
    		Iterator it=queryDAO.queryOrder(querySql, countSql);
    		
    		while(it.hasNext()){
    			list.add(it.next());
    		}
    		return list.iterator();
         }
        catch(Exception e)
        {
            throw(new DAOException(e));
        }
    }

    /*
     * ���� Javadoc��
     * 
     * @see com.times.wap.service.testing.UsergrouproleService#insertUsergrouprole(com.times.wap.pojo.testing.UsergroupRolePOJO)
     */
    public UsergroupRolePOJO insertUsergrouprole(UsergroupRolePOJO usergrouprole)
            throws DAOException {
        // TODO �Զ���ɷ������
        try{
            return  usergrouproleDAO.insertUsergrouprole(usergrouprole);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
  
    }

    /*
     * ���� Javadoc��
     * 
     * @see com.times.wap.service.testing.UsergrouproleService#updateUsergrouprole(com.times.wap.pojo.testing.UsergroupRolePOJO)
     */
    
    

    

    public UsergroupRolePOJO updateUsergrouprole(UsergroupRolePOJO usergrouprole)
            throws DAOException {
        // TODO �Զ���ɷ������
        try{
            return  usergrouproleDAO.updateUsergrouprole(usergrouprole);
        }
        catch(Exception e)
        {
            throw (new DAOException(e));
        }
    }

    /*
     * ���� Javadoc��
     * 
     * @see com.times.wap.service.testing.UsergrouproleService#getUsergrouprole(java.lang.Long)
     */
    public UsergroupRolePOJO getUsergrouprole(Long optionId) throws DAOException {
        // TODO �Զ���ɷ������
        try{
            return (UsergroupRolePOJO)usergrouproleDAO.loadUsergrouprole(optionId);
        }
        catch(Exception e)
        {
            throw(new DAOException(e));
        }
    }

    /*
     * ���� Javadoc��
     * 
     * @see com.times.wap.service.testing.UsergrouproleService#deleteUsergrouprole(java.lang.Long)
     */
    public void deleteUsergrouprole(Long optionId) throws DAOException {
        // TODO �Զ���ɷ������
        try{
            usergrouproleDAO.deleteUsergrouprole(optionId);
        }
        catch(Exception e)
        {
            throw(new DAOException(e));
        }     

    }
    
    public Iterator getAllUsergrouprole() throws DAOException{
        StringBuffer hql = new StringBuffer();
        hql.append("select hql_usergrouprole from UsergroupRolePOJO hql_usergrouprole");
        hql.append(" order by hql_usergrouprole.usergrouproleId asc");
        
        Iterator it = queryDAO.queryForIterator(hql.toString());
        List list =new ArrayList();
		while(it.hasNext()){
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
    public UsergrouproleDAO getUsergrouproleDAO() {
        return usergrouproleDAO;
    }
    public void setUsergrouproleDAO(UsergrouproleDAO usergrouproleDAO) {
        this.usergrouproleDAO = usergrouproleDAO;
    }
}
