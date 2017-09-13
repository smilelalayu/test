/*
 * 创建日期 2006-6-6
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 * 
 */
package com.times.acs.core.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import com.times.acs.core.usermanager.CurrentUser;
import com.times.acs.core.usermanager.UserPool;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.tools.SystemParam;

public class CheckUserSessionFilter extends HttpServlet implements Filter {
    
    private static final Logger log=Logger.getLogger(CheckUserSessionFilter.class);
    public void init(FilterConfig filterConfig) {
    	
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain filterChain) {
        try {
            HttpServletRequest hreq = (HttpServletRequest) request;
            String currentURL = hreq.getRequestURI();
            log.debug("request url:"+currentURL);
            //System.out.println(currentURL);
            // 检查用户是否正在登录
            if (getTargetURL(currentURL, hreq).equals(
                    getTargetURL(SystemParam.getMessage("LOGIN_PAG"), hreq))
                    || getTargetURL(currentURL, hreq).equals(
                            getTargetURL(
                                    SystemParam.getMessage("LOGIN_ACTION"),
                                    hreq))
                    || getTargetURL(currentURL, hreq).equals("")
                    || getTargetURL(currentURL, hreq)
                            .equals(
                                    SystemParam
                                            .getMessage("INVALID_MESSAGE_SHOW_PAGE"))) {
                validateSession(hreq);
                filterChain.doFilter(request, response);
              
                CurrentUser.removeUser();
                return;
            }
            // 检查用户是否已经登录
            boolean signedOn = false;

            if (hreq.getSession(false) != null) {
                if (hreq.getSession().getAttribute(
                        SystemParam.getMessage("SIGNED_ON_USER")) != null) {
                    signedOn = ((Boolean) hreq.getSession().getAttribute(
                            SystemParam.getMessage("SIGNED_ON_USER")))
                            .booleanValue();

                } else {
                    hreq.getSession().setAttribute(
                            SystemParam.getMessage("SIGNED_ON_USER"),
                            new Boolean(false));
                }
            }
            // System.out.println(signedOn);
            // 用户是否被停止使用
            boolean userStop = false;
            // 用户是否重复登录
            boolean loginagain = false;
            // 如果已经登录
            if (signedOn) {

                UserInfoPOJO user = (UserInfoPOJO) hreq.getSession()
                        .getAttribute(SystemParam.getMessage("USER_INFO"));
                String isStop = user.getStop();
                if (user.isLoginAgain()) {
                    loginagain = true;
                } else if (isStop.equalsIgnoreCase("n")) {

                    CurrentUser.putUser(user);
                    filterChain.doFilter(request, response);
                 
                    CurrentUser.removeUser();
                    return;
                } else {

                    userStop = true;

                }

            }

//            if (loginagain) {
//                String errorPage = hreq.getContextPath()+SystemParam.getPageError("LoginAgainError");
//                HttpServletResponse hres = (HttpServletResponse) response;
//                DispatchUtils.dispatch(hres, errorPage);
//                // hreq.getRequestDispatcher(errorPage).forward(hreq,hres);
//            } else if (userStop) {
//                String errorPage = hreq.getContextPath()+SystemParam.getPageError("UserStopError");
//                HttpServletResponse hres = (HttpServletResponse) response;
//                DispatchUtils.dispatch(hres, errorPage);
//
//            } else {
//                // jump to the signon page
//                String errorPage = hreq.getContextPath()+SystemParam
//                        .getPageError("SessionInvalidError");
//                HttpServletResponse hres = (HttpServletResponse) response;
//                DispatchUtils.dispatch(hres, errorPage);
//            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void destroy() {
        log.debug(this.getClass().getName() + "destroy!");
       // System.out.println(this.getClass().getName() + "destroy!");
        try {
            UserPool.destroy();
        } catch (Exception e) {
            e.printStackTrace();
            log.error(null,e);
        }
    }

    private static String getTargetURL(String currentURL,
            HttpServletRequest hreq) {
        String contextName = hreq.getContextPath();
        if (currentURL.startsWith(contextName + "/")) {
            currentURL = currentURL.substring(currentURL.indexOf(contextName)
                    + contextName.length() + 1);
            return currentURL;
        }

        return currentURL;
    }

    public void validateSession(HttpServletRequest hreq) {
       // System.out.println("validate session!!!");
        
        HttpSession session = hreq.getSession(false);
        if (session != null) {
            if (session.getAttribute(SystemParam.getMessage("SIGNED_ON_USER")) != null) {
               // System.out.println("invalidate session!!!");
                session.invalidate();

            }
        }

    }

    public static void main(String[] args) {

    }
}
