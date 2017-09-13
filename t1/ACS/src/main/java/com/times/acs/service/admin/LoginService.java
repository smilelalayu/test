package com.times.acs.service.admin;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.soap.MTOM;

import com.times.acs.pojo.admin.User;

@WebService(name = "login")
@SOAPBinding(style = Style.RPC)
@MTOM
public interface LoginService {
	User login(String applicationCode, String userName, String password);

	boolean rePassword(String userName, String oldPassword, String newPassword);
}
