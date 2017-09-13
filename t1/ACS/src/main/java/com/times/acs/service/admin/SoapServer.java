package com.times.acs.service.admin;

import javax.xml.ws.Endpoint;

import com.times.acs.service.admin.impl.LoginServiceImpl;
import com.times.j2ee.util.PropertyManager;


public class SoapServer {
	private String url;
	
	public void start(){
		if(url == null || url.equals("")){
			url = PropertyManager.getString("loginService");
		}
		Endpoint.publish(url,new LoginServiceImpl());
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
