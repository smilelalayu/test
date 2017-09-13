package com.miitgxt.common.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import com.miitgxt.common.util.GxtConsts;




@Component("logoutSuccessHandler")
public class LogoutSuccessfulHandlerImpl implements LogoutSuccessHandler {
    private static Logger logger = LoggerFactory
        .getLogger(LogoutSuccessfulHandlerImpl.class);

    @Override
    public void onLogoutSuccess(HttpServletRequest request,
            HttpServletResponse response, Authentication authentication)
            throws IOException {
        logger.debug("Logout succeeded");
        request.getSession().setAttribute(GxtConsts.LOGIN_FLAG, false);
//        request.getSession().getServletContext().removeAttribute(GxtConsts.LOGIN_FLAG);
        response.sendRedirect("./index.jsp");
    }
}
