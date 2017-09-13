package com.hm.appinfo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gep.core.util.InputChecker;
import com.gep.core.util.OssOpsUtils;

/**
 * 
 *<p>
 * 工单贷前附件树节点
 *</p>
 * @author songning
 * @datetime 2016年5月10日 下午6:03:04
 *
 */
public class LnAttachNode {
	/**
	 * 附件id
	 */
	private Long attachId;
	/**
	 * 附件编码
	 */
	private String attachCode;
	/**
	 * 附件名称
	 */
	private String attachName;
	/**
	 * 附件适用职业
	 */
	private String careerType;
	/**
	 * 附件层级
	 */
	private Integer attachLevel;
	/**
	 * 附件父级id
	 */
	private Long parentId;
	/**
	 * 附件类型
	 */
	private String chooseType;
	/**
	 * 工单附件id
	 */
	private Long appAttachId;
	/**
	 * 工单id
	 */
	private Long appId;
	/**
	 * 工单附件修改日期时间
	 */
	private Date modifiedon;
	/**
	 * 工单附件ossid
	 */
	private String ossId;
	/**
	 * ossId地址
	 */
	private String ossIdUrl;
	/**
	 * 删除标识，因为同一类型的附件存在多个，故设置该属性
	 */
	private boolean isDelete = false;
	/**
	 * 附件叶子节点
	 */
	private List<LnAttachNode> leaf = new ArrayList<>();
	/**
	 * 
	 *批次号
	 */
	private Long batchNo;
	
	
	public Long getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(Long batchNo) {
		this.batchNo = batchNo;
	}
	public Long getAttachId() {
		return attachId;
	}
	public void setAttachId(Long attachId) {
		this.attachId = attachId;
	}
	public String getAttachCode() {
		return attachCode;
	}
	public void setAttachCode(String attachCode) {
		this.attachCode = attachCode;
	}
	public String getAttachName() {
		return attachName;
	}
	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}
	public String getCareerType() {
		return careerType;
	}
	public void setCareerType(String careerType) {
		this.careerType = careerType;
	}
	public Integer getAttachLevel() {
		return attachLevel;
	}
	public void setAttachLevel(Integer attachLevel) {
		this.attachLevel = attachLevel;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getChooseType() {
		return chooseType;
	}
	public void setChooseType(String chooseType) {
		this.chooseType = chooseType;
	}
	public Long getAppAttachId() {
		return appAttachId;
	}
	public void setAppAttachId(Long appAttachId) {
		this.appAttachId = appAttachId;
	}
	public Long getAppId() {
		return appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public Date getModifiedon() {
		return modifiedon;
	}
	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}
	public String getOssId() {
		return ossId;
	}
	public void setOssId(String ossId) {
		this.ossId = ossId;
		if (InputChecker.isEmpty(ossId)) {
			this.ossIdUrl = "";
		} else {
			this.ossIdUrl = OssOpsUtils.getSignUrl(ossId);
		}
	}
	public List<LnAttachNode> getLeaf() {
		return leaf;
	}
	public void setLeaf(List<LnAttachNode> leaf) {
		this.leaf = leaf;
	}
	
	public boolean isDelete() {
		return isDelete;
	}
	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	public String getOssIdUrl() {
    	 return ossIdUrl;
    }
}
