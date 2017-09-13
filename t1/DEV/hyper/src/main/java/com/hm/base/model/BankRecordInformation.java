package com.hm.base.model;

import java.io.Serializable;

/**
 * 开户银行
 * @ClassName: BankRecordInformation
 * @author dengwenjun
 * @date 2016年4月27日 下午2:57:33
 */
public class BankRecordInformation implements Serializable
{

	/** 
	 * @Fields serialVersionUID :  -7440389299756197433L
	 */ 
	private static final long serialVersionUID = -7440389299756197433L;

	private Long id;

	private String code;

	private String name;

	private String isenable;

	private String remark;

	private String sign;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code == null ? null : code.trim();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name == null ? null : name.trim();
	}

	public String getIsenable()
	{
		return isenable;
	}

	public void setIsenable(String isenable)
	{
		this.isenable = isenable == null ? null : isenable.trim();
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark == null ? null : remark.trim();
	}

	public String getSign()
	{
		return sign;
	}

	public void setSign(String sign)
	{
		this.sign = sign == null ? null : sign.trim();
	}
}