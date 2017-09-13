package com.hm.onecard.model;

/**
 * 
 * @description :个人信息
 * @author hewei
 * @date 2017年2月13日 下午3:32:23
 */
public class Extend {

	/*
	 * 邮箱
	 */
	private String email;
	/*
	 * 行业
	 */
	private String industry;
	/*
	 * 单位名称
	 */
	private String company;
	/*
	 * 单位电话
	 */
	private String companyTel;
	/*
	 * 单位地址
	 */
	private String companyAdd;
	/*
	 * 亲戚关系
	 */
	private String relative;
	/*
	 * 亲戚姓名
	 */
	private String relativeName;
	/*
	 * 亲戚手机
	 */
	private String relativePhone;
	/*
	 * 月收入
	 */
	private String monthIncome;
	/*
	 * 岗位/职业
	 */
	private String profession;
	/*
	 * 职务
	 */
	private String duty;
	/*
	 * 学历
	 */
	private String education;
	/*
	 * 婚姻状况
	 */
	private String marriage;
	
	/*
	 * 居住地址
	 */
	private String address;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyTel() {
		return companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}

	public String getCompanyAdd() {
		return companyAdd;
	}

	public void setCompanyAdd(String companyAdd) {
		this.companyAdd = companyAdd;
	}

	public String getRelative() {
		return relative;
	}

	public void setRelative(String relative) {
		this.relative = relative;
	}

	public String getRelativeName() {
		return relativeName;
	}

	public void setRelativeName(String relativeName) {
		this.relativeName = relativeName;
	}

	public String getRelativePhone() {
		return relativePhone;
	}

	public void setRelativePhone(String relativePhone) {
		this.relativePhone = relativePhone;
	}

	public String getMonthIncome() {
		return monthIncome;
	}

	public void setMonthIncome(String monthIncome) {
		this.monthIncome = monthIncome;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "wkExtend [email=" + email + ", industry=" + industry + ", company=" + company + ", companyTel="
				+ companyTel + ", companyAdd=" + companyAdd + ", relative=" + relative + ", relativeName="
				+ relativeName + ", relativePhone=" + relativePhone + ", monthIncome=" + monthIncome + ", profession="
				+ profession + ", duty=" + duty + ", education=" + education + ", marriage=" + marriage + ", address="
				+ address + "]";
	}

}
