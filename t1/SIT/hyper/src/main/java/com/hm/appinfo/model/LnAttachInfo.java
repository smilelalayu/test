package com.hm.appinfo.model;

import java.util.Date;

import com.gep.core.util.InputChecker;
import com.gep.core.util.OssOpsUtils;

/**
 * @ClassName: LnAttachInfo
 * @Description: 贷款附件表
 * @author qiuyuan
 * @date 2016年4月11日 下午2:25:03
 * @Copyright (c) 2016, 9fchaoneng.com All Rights Reserved.
 */
public class LnAttachInfo {
	private Long id;

	private Long appId;

	private String attachType;

	private String attachName;

	private String attachUrl;

	private String fileType;

	private Integer fileSize;

	private String fileSerial;

	private String remark;

	private String createdby;

	private Date createdon;

	private String modifiedby;

	private Date modifiedon;

	private Integer version;

	private String ossId;

	private String ossIdUrl;

	private String careerType;

	private Integer level;

	private String chooseType;

	private String productType;

	private String source;
	
    private String examineSeqNo;

    private Long examineBatchNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getAttachType() {
		return attachType;
	}

	public void setAttachType(String attachType) {
		this.attachType = attachType == null ? null : attachType.trim();
	}

	public String getAttachName() {
		return attachName;
	}

	public void setAttachName(String attachName) {
		this.attachName = attachName == null ? null : attachName.trim();
	}

	public String getAttachUrl() {
		return attachUrl;
	}

	public void setAttachUrl(String attachUrl) {
		this.attachUrl = attachUrl == null ? null : attachUrl.trim();
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType == null ? null : fileType.trim();
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileSerial() {
		return fileSerial;
	}

	public void setFileSerial(String fileSerial) {
		this.fileSerial = fileSerial == null ? null : fileSerial.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby == null ? null : createdby.trim();
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby == null ? null : modifiedby.trim();
	}

	public Date getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getOssId() {
		return ossId;
	}

	public void setOssId(String ossId) {
		this.ossId = ossId == null ? null : ossId.trim();
		if (InputChecker.isEmpty(ossId)) {
			this.ossIdUrl = "";
		} else {
			this.ossIdUrl = OssOpsUtils.getSignUrl(ossId);
		}

	}

	public String getCareerType() {
		return careerType;
	}

	public void setCareerType(String careerType) {
		this.careerType = careerType == null ? null : careerType.trim();
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getChooseType() {
		return chooseType;
	}

	public void setChooseType(String chooseType) {
		this.chooseType = chooseType == null ? null : chooseType.trim();
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType == null ? null : productType.trim();
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source == null ? null : source.trim();
	}

	public String getOssIdUrl() {
		return ossIdUrl;
	}

	public String getExamineSeqNo() {
		return examineSeqNo;
	}

	public void setExamineSeqNo(String examineSeqNo) {
		this.examineSeqNo = examineSeqNo;
	}

	public Long getExamineBatchNo() {
		return examineBatchNo;
	}

	public void setExamineBatchNo(Long examineBatchNo) {
		this.examineBatchNo = examineBatchNo;
	}
}