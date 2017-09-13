package com.miitgxt.common.security;

import javax.servlet.http.HttpSessionEvent;

import org.springframework.security.web.session.HttpSessionEventPublisher;

import com.miitgxt.common.util.GxtConsts;



public class GxtHttpSessionEventPublisher extends HttpSessionEventPublisher {


	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("同步注销session");
		event.getSession().setAttribute(GxtConsts.LOGIN_FLAG, false);
		super.sessionDestroyed(event);
	}
}
