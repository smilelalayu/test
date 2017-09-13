/**
 * @author Administrator
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.service.admin.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.times.acs.core.usermanager.CurrentUser;
import com.times.acs.dao.admin.SmLogDAO;
import com.times.acs.pojo.admin.SmLog;
import com.times.acs.pojo.admin.SmLogDataVO;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.service.admin.SmLogService;
import com.times.framework.dao.QLWrapper;
import com.times.framework.dao.QueryDAO2;
import com.times.framework.dao.hibernate.dto.HQLEntityString;
import com.times.framework.exception.DAOException;

/**
 * @author Administrator
 * 
 *         TODO 要更改此生成的类型注释的模板，请转至 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Service
public class SmLogServiceImpl implements SmLogService {

	/*
	 * （非 Javadoc）
	 * 
	 * @see com.times.wap.service.testing.SmLogService#getAllSmLog()
	 */
	@Autowired
	QueryDAO2 queryDAO2;
	@Autowired
	SmLogDAO smLogDAO;

	public List<SmLog> getAllSmLog() throws DAOException {
		HQLEntityString entityQueryString = new HQLEntityString();
		entityQueryString.setEntityName(SmLog.class.getName());
		entityQueryString.suffixHQL(" order by id desc ");
		return getQuerySmLog(entityQueryString);

	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.SmLogService#insertSmLog(com.times.wap.
	 * pojo.testing.SmLog)
	 */
	public SmLog insertSmLog(SmLog smLog) throws DAOException {
		//
		try {
			//写日志所属司局ID
			UserInfoPOJO currentUser = CurrentUser.currentUser();
			if(currentUser!=null){
				smLog.setOrgId(currentUser.getUserGroup().getSjID());
			}
			return smLogDAO.insertSmLog(smLog);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.SmLogService#updateSmLog(com.times.wap.
	 * pojo.testing.SmLog)
	 */

	public SmLog updateSmLog(SmLog smLog) throws DAOException {
		//
		try {
			return smLogDAO.updateSmLog(smLog);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see com.times.wap.service.testing.SmLogService#getSmLog(java.lang.Long)
	 */
	public SmLog getSmLog(Long optionId) throws DAOException {
		//
		try {
			return (SmLog) smLogDAO.loadSmLog(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.SmLogService#deleteSmLog(java.lang.Long)
	 */
	public void deleteSmLog(Long optionId) throws DAOException {
		//
		try {
			smLogDAO.deleteSmLog(optionId);
		} catch (Exception e) {
			throw (new DAOException(e));
		}

	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.times.wap.service.testing.UiEntityService#updateUiEntity(com.times
	 * .wap.pojo.testing.UiEntity)
	 */

	public List<SmLog> updateSaveSmLog(List<SmLog> entitys) throws DAOException {
		// TODO Auto-generated method stub

		try {
			List<SmLog> result = new ArrayList<SmLog>();
			for (SmLog entity : entitys) {
				result.add((SmLog) smLogDAO.saveOrUpdateEntity(entity));
			}

			return result;
		} catch (Exception e) {
			throw (new DAOException(e));
			// return false;
		}

	}

	@Override
	public void deleteSmLog(List<SmLog> entitys) throws DAOException {
		// TODO Auto-generated method stub

		if (entitys == null || entitys.size() <= 0) {
			return;
		}
		try {
			for (SmLog entity : entitys) {

				smLogDAO.removeEntity(entity);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

	}

	public List<SmLog> getQueryPagingSmLog(HQLEntityString entityQueryString)
			throws DAOException {
		String orderField = entityQueryString.getOrderByField();
		
		if(orderField==null || "".equals(orderField)){
			entityQueryString.setOrderByField("id");
			entityQueryString.setOrderBySuffix("desc");
		}
		List<SmLog> result = new ArrayList<SmLog>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<SmLog> it = queryDAO2.queryOrder(qLWrapper);
		while (it.hasNext()) {
			SmLog smLog = it.next();
			if(smLog.getOperType()!=null){
				smLog.setLogContentView(smLog.getLogContent());
				if((smLog.getOperType() == smLog.OPERTYPE_ADD) ||(smLog.getOperType() == smLog.OPERTYPE_MODIFY)){
					parseXml(smLog);
				}
			}
			result.add(smLog);
		}

		return result;
	}

	public List<SmLog> getQuerySmLog(HQLEntityString entityQueryString)
			throws DAOException {

		List<SmLog> result = new ArrayList<SmLog>();
		QLWrapper qLWrapper = queryDAO2
				.getQLWrapperByHQLEntityString(entityQueryString);
		Iterator<SmLog> it = queryDAO2.queryForIterator(qLWrapper);
		while (it.hasNext()) {
			SmLog smLog = it.next();
			if(smLog.getOperType()!=null){
				smLog.setLogContentView(smLog.getLogContent());
				if((smLog.getOperType() == smLog.OPERTYPE_ADD) ||(smLog.getOperType() == smLog.OPERTYPE_MODIFY)){
					parseXml(smLog);
				}
			}
			result.add(smLog);
		}

		return result;
	}
	
	private static void parseXml(SmLog smLog) {
		try {
			String logContent = smLog.getLogContent();
			Document document = DocumentHelper.parseText(logContent);  
			Element root = document.getRootElement();  
			List<Element> elements = root.elements();  
			Map<String,String> oldMap = new HashMap<String,String>();
			Map<String,String> newMap = new HashMap<String,String>();
			SmLogDataVO vo = new SmLogDataVO();
			StringBuffer sb = new StringBuffer();
			for (Iterator<Element> it = elements.iterator(); it.hasNext();) {  
				Element subElement = it.next();  
				if (subElement.getName().equalsIgnoreCase("old")) {//修改前
					List<Element> elements11 = subElement.elements();  
					sb.append("修改前（");
					for(Iterator<Element> it11 = elements11.iterator(); it11.hasNext();){
						Element element1 = it11.next();  
						oldMap.put(element1.getName(), element1.getText());
						sb.append(element1.getName()).append("：").append(element1.getText()).append("，");
					}
					sb.append("）");
				}else{////修改后
					if(smLog.getOperType() == SmLog.OPERTYPE_MODIFY){
						sb.append("修改后（");
					}
					List<Element> elements11 = subElement.elements();  
					for(Iterator<Element> it11 = elements11.iterator(); it11.hasNext();){
						Element element1 = it11.next();  
						newMap.put(element1.getName(), element1.getText());
						sb.append(element1.getName()).append("：").append(element1.getText()).append("，");
					}
					if(smLog.getOperType()== SmLog.OPERTYPE_MODIFY){
						sb.append("）");
					}
				}
			}
			smLog.setLogContentView(sb.toString());
			vo.setOldData(oldMap);
			vo.setNewData(newMap);
			vo.setSmLogId(smLog.getId());
			smLog.setDataVO(vo);
		} catch (DocumentException e) {
			e.printStackTrace();
		}  
	}

	public QueryDAO2 getQueryDAO2() {
		return queryDAO2;
	}

	public void setQueryDAO2(QueryDAO2 queryDAO2) {
		this.queryDAO2 = queryDAO2;
	}

	public SmLogDAO getSmLogDAO() {
		return smLogDAO;
	}

	public void setSmLogDAO(SmLogDAO smLogDAO) {
		this.smLogDAO = smLogDAO;
	}
}
