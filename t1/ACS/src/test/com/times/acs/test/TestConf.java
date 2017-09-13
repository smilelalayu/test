/*
 * 锟斤拷锟斤拷锟斤拷锟斤拷 2006-5-18
 *
 * TODO 要锟斤拷拇锟斤拷锟缴碉拷锟侥硷拷锟斤拷模锟藉，锟斤拷转锟斤拷
 * 锟斤拷锟斤拷 锟斤拷 锟斤拷选锟斤拷 锟斤拷 Java 锟斤拷 锟斤拷锟斤拷锟斤拷式 锟斤拷 锟斤拷锟斤拷模锟斤拷
 * 
 */
package com.times.acs.test;

import java.util.Iterator;

import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.service.admin.UserinfoService;
import com.times.framework.service.ServiceLocator;

public class TestConf {

	public static void main(String[] args) {

		UserinfoService ugservice = (UserinfoService) ServiceLocator
				.getService("userinfoPOJOServiceProxy");
		Iterator<UserInfoPOJO> user = ugservice.getAllUserinfo();
		while (user.hasNext()) {
			System.out.println(user.next().getUserName());
		}
		// FacesUtils.getServletContext();

	}

}
