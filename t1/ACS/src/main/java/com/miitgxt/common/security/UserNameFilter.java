package com.miitgxt.common.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.miitgxt.common.util.GxtConsts;
/**
 * 内网对接专用
 * @author liwei
 *
 */
public class UserNameFilter extends UsernamePasswordAuthenticationFilter{

     public UserNameFilter(){
    	 super();
     }
	 public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
		 
		 
		 	String username ="";
	        String password ="";

	        

	        username = (String)request.getSession().getAttribute(GxtConsts.SESSION_USER_NAME);

	        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);

	        // Allow subclasses to set the "details" property
	        setDetails(request, authRequest);

	        return this.getAuthenticationManager().authenticate(authRequest);
	 }
}
