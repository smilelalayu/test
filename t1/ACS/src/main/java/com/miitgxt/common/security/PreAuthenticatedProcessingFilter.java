package com.miitgxt.common.security;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import com.miitgxt.auth.security.GxtUserDetailService;
import com.miitgxt.common.util.GxtConsts;


@Component("preAuthenticatedProcessingFilter")
public class PreAuthenticatedProcessingFilter extends GenericFilterBean {
    private static Logger log = LoggerFactory
        .getLogger(PreAuthenticatedProcessingFilter.class);
    @Autowired
    private AuthenticationEntryPoint authenticationEntryPoint;
    
    @Resource(name = "myUserDetailService")
    private GxtUserDetailService myUserDetailService;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
    	HttpServletRequest req = (HttpServletRequest) request;
    	HttpServletResponse res = (HttpServletResponse) response;
    	
    	Object flag = req.getSession().getAttribute(
    			GxtConsts.LOGIN_FLAG);
//    	System.out.println("----------2---------------------"+flag);
    	
    	String vCode = req.getParameter("vCode");
    	
    	Object vCodeSession = req.getSession().getAttribute(
    			"checkcode");
    	
    	if (vCode != null)
		{
        	if (vCodeSession == null || !vCode.toUpperCase().equals(vCodeSession.toString().toUpperCase()))
    		{
        		String path =req.getContextPath();
        		res.sendRedirect(path + "?error=4");
        		return;
//        		req.getRequestDispatcher("/" + path + "?error=4").forward(request, response);
    		}
		}
    	
    	if(flag==null || (!(Boolean) flag)){
			myUserDetailService.doRequest(req);
		}
    	
    	if (flag != null && !(Boolean) flag) {
    		
    		String xrequestedWith = req.getHeader("x-requested-with");
        	if (xrequestedWith != null && xrequestedWith.equals("XMLHttpRequest")) {
        		System.out.println("当前的请求未授权！");
        		

        		((HttpServletResponse) response).sendError(HttpServletResponse.SC_UNAUTHORIZED);
        	}else{
        		chain.doFilter(request, response);
        	}
    	}else {
    	
    		
    		
            chain.doFilter(request, response);

            
        }
    }
}
