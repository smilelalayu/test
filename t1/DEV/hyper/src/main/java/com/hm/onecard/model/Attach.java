package com.hm.onecard.model;

/**
 * 
 * @description :附件信息
 * @author ：hewei
 * @date 2017年2月13日 下午2:57:16
 */
public class Attach {

	/*
	 * 身份证正面照id
	 */
	private String  frontPhone;
	
	/*
	 * 身份证正面照id
	 */
	private String  otherPhone;
	
	/*
	 * 手持照id
	 */
	private String  handPhone;

	
	public String getFrontPhone() {
		return frontPhone;
	}

	public void setFrontPhone(String frontPhone) {
		this.frontPhone = frontPhone;
	}

	public String getOtherPhone() {
		return otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

	public String getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(String handPhone) {
		this.handPhone = handPhone;
	}
	
	
}
