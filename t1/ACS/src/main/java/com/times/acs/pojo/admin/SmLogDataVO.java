package com.times.acs.pojo.admin;

import java.util.HashMap;
import java.util.Map;

/**
 * 解析xml字符串，并封装数据
 * @author: xudd
 * @date: 2013-11-21
 */
public class SmLogDataVO implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2992878104386865992L;

	private Long smLogId;//对应日志表id

	private Map<String,String> oldData = new HashMap<String,String>();
	
	private Map<String,String> newData = new HashMap<String,String>();

	public Map<String, String> getOldData() {
		return oldData;
	}

	public void setOldData(Map<String, String> oldData) {
		this.oldData = oldData;
	}

	public Map<String, String> getNewData() {
		return newData;
	}

	public void setNewData(Map<String, String> newData) {
		this.newData = newData;
	}

	public Long getSmLogId() {
		return smLogId;
	}

	public void setSmLogId(Long smLogId) {
		this.smLogId = smLogId;
	}
	
}
