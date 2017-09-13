package com.hm.product.model;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * @ClassName: BsAttach
 * @Description: 基础附件类
 * @author qiuyuan
 * @date 2016年4月11日 下午2:23:06
 * @Copyright (c) 2016, 9fchaoneng.com All Rights Reserved.
 */
public class BsAttach {
    private Long id;

    private String code;

    private String type;

    private String accessoryName;

    private Integer accessoryLimit;

    private String description;

    private String remark;

    private String createdby;

    private Date createdon;

    private String modifiedby;

    private Date modifiedon;

    private Long parentId;

    private String careerType;

    private Integer level;

    private String chooseType;

    private String productType;
    
	private Set<BsAttach> leaf = new LinkedHashSet<BsAttach>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName == null ? null : accessoryName.trim();
    }

    public Integer getAccessoryLimit() {
        return accessoryLimit;
    }

    public void setAccessoryLimit(Integer accessoryLimit) {
        this.accessoryLimit = accessoryLimit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_attach.CAREER_TYPE
     *
     * @return the value of bs_attach.CAREER_TYPE
     *
     * @mbggenerated Mon Apr 11 14:11:00 GMT+08:00 2016
     */
    public String getCareerType() {
        return careerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_attach.CAREER_TYPE
     *
     * @param careerType the value for bs_attach.CAREER_TYPE
     *
     * @mbggenerated Mon Apr 11 14:11:00 GMT+08:00 2016
     */
    public void setCareerType(String careerType) {
        this.careerType = careerType == null ? null : careerType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_attach.LEVEL
     *
     * @return the value of bs_attach.LEVEL
     *
     * @mbggenerated Mon Apr 11 14:11:00 GMT+08:00 2016
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_attach.LEVEL
     *
     * @param level the value for bs_attach.LEVEL
     *
     * @mbggenerated Mon Apr 11 14:11:00 GMT+08:00 2016
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_attach.CHOOSE_TYPE
     *
     * @return the value of bs_attach.CHOOSE_TYPE
     *
     * @mbggenerated Mon Apr 11 14:11:00 GMT+08:00 2016
     */
    public String getChooseType() {
        return chooseType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_attach.CHOOSE_TYPE
     *
     * @param chooseType the value for bs_attach.CHOOSE_TYPE
     *
     * @mbggenerated Mon Apr 11 14:11:00 GMT+08:00 2016
     */
    public void setChooseType(String chooseType) {
        this.chooseType = chooseType == null ? null : chooseType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_attach.PRODUCT_TYPE
     *
     * @return the value of bs_attach.PRODUCT_TYPE
     *
     * @mbggenerated Mon Apr 11 14:11:00 GMT+08:00 2016
     */
    public String getProductType() {
        return productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_attach.PRODUCT_TYPE
     *
     * @param productType the value for bs_attach.PRODUCT_TYPE
     *
     * @mbggenerated Mon Apr 11 14:11:00 GMT+08:00 2016
     */
    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

	public Set<BsAttach> getLeaf()
	{
		return leaf;
	}

	public void setLeaf(Set<BsAttach> leaf)
	{
		this.leaf = leaf;
	}
    
}