/*
 * 创建日期 2006-6-14
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
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

import org.apache.log4j.Logger;

import com.times.acs.core.AccessControl;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.tools.SystemParam;
import com.times.framework.service.ServiceLocator;

public class UriACFilter extends HttpServlet implements Filter {

    private static final Logger log = Logger.getLogger(UriACFilter.class);

    private AccessControl ac;

    public void init(FilterConfig filterConfig) {
        // String acSpringBeanName=
        // filterConfig.getInitParameter("accessControl");
        // ac =(AccessControl)ServiceLocator.getService(acSpringBeanName);
        // System.out.println("init uriacfilter");
        try {
            log.info("init uriacfilter");
            ac = (AccessControl) ServiceLocator
                    .getService("accessControDefaultlImpl");
        } catch (Exception e) {
            // TODO 自动生成 catch 块
            e.printStackTrace();
        }

    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain filterChain) {

        try {
            boolean flag = false;

            HttpServletRequest hreq = (HttpServletRequest) request;
            String currentURL = hreq.getRequestURI();

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

                filterChain.doFilter(request, response);
             
                return;
            }
            String isFilter = SystemParam.getMessage("URI_FILTER_FLAG");
            if (isFilter == null || !isFilter.equalsIgnoreCase("true")) {
                filterChain.doFilter(request, response);
                return;
            }
            UserInfoPOJO user = (UserInfoPOJO) hreq.getSession().getAttribute(
                    SystemParam.getMessage("USER_INFO"));
            if (user != null) {

                String currentURI = getTargetURL(hreq.getRequestURI(), hreq);
               // System.out.println("UriACFilter currentURI=" + currentURI);
                log.info("UriACFilter currentURI=" + currentURI);
                flag = ac.validate(currentURI);
                log.info("current user permissions=" + user.getStrPermissions());
                log.info("url fiter flag=" + flag);
               // System.out.println(user.getStrPermissions());
              //  System.out.println("url fiter flag=" + flag);
                // flag = true;
                if (flag) {

                    filterChain.doFilter(request, response);
                } else {

                    try {
                        String errorPage = "";
                        		
                        		
//                        		hreq.getContextPath()
//                                + SystemParam
//                                        .getPageError("UserNoPermissionError");

                        HttpServletResponse hres = (HttpServletResponse) response;
                        DispatchUtils.dispatch(hres, errorPage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    return;
                }
            } else {

                filterChain.doFilter(request, response);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void destory() {

    }

    /**
     * @param currentURL
     *            url
     * @return
     */
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
}
