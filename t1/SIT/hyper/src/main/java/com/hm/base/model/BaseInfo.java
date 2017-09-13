package com.hm.base.model;

import java.io.Serializable;

/**
 * 基础数据
 * 
 * @author nihao
 *
 */
public class BaseInfo implements Serializable {

	private static final long serialVersionUID = -9217680885993673965L;

	private String id;

	private String name;

	private String parentId;
	
	private BaseInfo parentBase;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public BaseInfo getParentBase() {
		return parentBase;
	}

	public void setParentBase(BaseInfo parentBase) {
		this.parentBase = parentBase;
	}

	@Override
	public String toString() {
		return "BaseInfo [id=" + id + ", name=" + name + ", parentId="
				+ parentId + ", parentBase=" + parentBase + "]";
	}
	
	
}