package com.hm.userauth.model;

public class UserChannel implements java.io.Serializable {

        
    private static final long serialVersionUID = 2637214416681867827L;
    private Long id;
	private String name;
	private Integer status;
    private String channelCode;
	 
	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}