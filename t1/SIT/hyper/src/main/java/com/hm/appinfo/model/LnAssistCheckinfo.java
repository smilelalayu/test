package com.hm.appinfo.model;

import java.util.Date;

/**
 * @ClassName: LnAssistCheckinfo
 * @Description: 协审信息表
 * @author qiuyuan
 * @date 2016年4月11日 下午2:24:19
 * @Copyright (c) 2016, 9fchaoneng.com All Rights Reserved.
 */
public class LnAssistCheckinfo {
    private Long id;

    /**
     * 工单ID
     */
    private Long appId;

    /**
     * 借记卡核实
     */
    private String checkDebitCard;

    /**
     * 申请资料原件核实
     */
    private String checkApplyInfo;

    /**
     * 注意事项确认
     */
    private String mattersNeed;

    /**
     * 客户手机号核实
     */
    private String checkMobile;

    /**
     * 单位电话核实
     */
    private String checkTel;

    /**
     * 联系人电话核实
     */
    private String checkLinkmanTel;

    /**
     * 社保信息核实
     */
    private String checkSocial;

    /**
     * 客户单位核实
     */
    private String checkCompany;

    /**
     * 陪同人数
     */
    private Integer accompany;

    /**
     * 陪同人员是否有申请
     */
    private String accApply;

    /**
     * 陪同人员姓名
     */
    private String accName;

    /**
     * 陪同人员手机号
     */
    private String accMobile;

    /**
     * 客户现用手机品牌
     */
    private String mobileBrand;

    /**
     * 客户现用手机状态
     */
    private String mobileState;

    /**
     * 门店家庭地址距离
     */
    private Double stortFamKm;

    /**
     * 门店与单位距离
     */
    private Double stortComKm;

    /**
     * 家庭地址与单位距离
     */
    private Double famComKm;

    /**
     * 创建人
     */
    private String createdby;

    /**
     * 创建时间
     */
    private Date createdon;

    /**
     * 修改人
     */
    private String modifiedby;

    /**
     * 修改时间
     */
    private Date modifiedon;

    /**
     * 乐观锁
     */
    private Integer version;
    
    /** 陪同人微信号 */
    private String assistWeixin;
    
    /** 陪同人QQ号 */
    private String assistQq;

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

    public String getCheckDebitCard() {
        return checkDebitCard;
    }

    public void setCheckDebitCard(String checkDebitCard) {
        this.checkDebitCard = checkDebitCard == null ? null : checkDebitCard.trim();
    }

    public String getCheckApplyInfo() {
        return checkApplyInfo;
    }

    public void setCheckApplyInfo(String checkApplyInfo) {
        this.checkApplyInfo = checkApplyInfo == null ? null : checkApplyInfo.trim();
    }

    public String getMattersNeed() {
        return mattersNeed;
    }

    public void setMattersNeed(String mattersNeed) {
        this.mattersNeed = mattersNeed == null ? null : mattersNeed.trim();
    }

    public String getCheckMobile() {
        return checkMobile;
    }

    public void setCheckMobile(String checkMobile) {
        this.checkMobile = checkMobile == null ? null : checkMobile.trim();
    }

    public String getCheckTel() {
        return checkTel;
    }

    public void setCheckTel(String checkTel) {
        this.checkTel = checkTel == null ? null : checkTel.trim();
    }

    public String getCheckLinkmanTel() {
        return checkLinkmanTel;
    }

    public void setCheckLinkmanTel(String checkLinkmanTel) {
        this.checkLinkmanTel = checkLinkmanTel == null ? null : checkLinkmanTel.trim();
    }

    public String getCheckSocial() {
        return checkSocial;
    }

    public void setCheckSocial(String checkSocial) {
        this.checkSocial = checkSocial == null ? null : checkSocial.trim();
    }

    public String getCheckCompany() {
        return checkCompany;
    }

    public void setCheckCompany(String checkCompany) {
        this.checkCompany = checkCompany == null ? null : checkCompany.trim();
    }

    public Integer getAccompany() {
        return accompany;
    }

    public void setAccompany(Integer accompany) {
        this.accompany = accompany;
    }

    public String getAccApply() {
        return accApply;
    }

    public void setAccApply(String accApply) {
        this.accApply = accApply == null ? null : accApply.trim();
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName == null ? null : accName.trim();
    }

    public String getAccMobile() {
        return accMobile;
    }

    public void setAccMobile(String accMobile) {
        this.accMobile = accMobile == null ? null : accMobile.trim();
    }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public void setMobileBrand(String mobileBrand) {
        this.mobileBrand = mobileBrand == null ? null : mobileBrand.trim();
    }

    public String getMobileState() {
        return mobileState;
    }

    public void setMobileState(String mobileState) {
        this.mobileState = mobileState == null ? null : mobileState.trim();
    }

    public Double getStortFamKm() {
        return stortFamKm;
    }

    public void setStortFamKm(Double stortFamKm) {
        this.stortFamKm = stortFamKm;
    }

    public Double getStortComKm() {
        return stortComKm;
    }

    public void setStortComKm(Double stortComKm) {
        this.stortComKm = stortComKm;
    }

    public Double getFamComKm() {
        return famComKm;
    }

    public void setFamComKm(Double famComKm) {
        this.famComKm = famComKm;
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

	public String getAssistWeixin() {
		return assistWeixin;
	}

	public void setAssistWeixin(String assistWeixin) {
		this.assistWeixin = assistWeixin;
	}

	public String getAssistQq() {
		return assistQq;
	}

	public void setAssistQq(String assistQq) {
		this.assistQq = assistQq;
	}
    
}