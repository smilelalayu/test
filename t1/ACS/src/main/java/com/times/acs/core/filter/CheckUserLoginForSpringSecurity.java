package com.times.acs.core.filter;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.miitgxt.common.security.SecurityUtils;
import com.miitgxt.common.util.GxtConsts;
import com.times.acs.core.usermanager.CurrentUser;
import com.times.acs.core.usermanager.UserPool;
import com.times.acs.pojo.admin.SmLog;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.tools.SmLogUtils;
import com.times.acs.tools.SystemParam;
import com.times.j2ee.util.RequestUtils;

/**
 * @author 赵森
 * 
 *         检查用户是否登录filter
 * 
 */
public class CheckUserLoginForSpringSecurity extends HttpServlet implements
		Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger
			.getLogger(CheckUserLoginForSpringSecurity.class);

	public void init(FilterConfig filterConfig) {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) {
		try {

			HttpServletRequest hreq = (HttpServletRequest) request;
			String currentURL = hreq.getRequestURI();
			log.info("request url:" + currentURL);
			SmLogUtils.newCurrentLog();
			SmLogUtils.getCurrentLog().setLoginIp(RequestUtils.getIpAddr(hreq));
			SmLogUtils.getCurrentLog().setRequestStartTime(new Date());
			
//			SmLogUtils.getCurrentLog().setModuleName(
//					currentURL.substring(hreq.getContextPath().length() + 1,currentURL.indexOf("/",1)));
			SmLogUtils.getCurrentLog().setUrl(currentURL);
			// UserInfoPOJO user = (UserInfoPOJO) ;
			if (hreq.getSession(false) != null) {

				if (hreq.getSession().getAttribute(GxtConsts.LOGIN_FLAG) != null
						&& (Boolean) hreq.getSession().getAttribute(
								GxtConsts.LOGIN_FLAG)) {
					// SmLogUtils.getCurrentLog().setLoginName(user.getUserName());
				} else {
					SmLogUtils.getCurrentLog().setLoginName("匿名");
				}

			} else {
				SmLogUtils.getCurrentLog().setLoginName("匿名");
			}
			
			if (isIgnore(currentURL)) {
				SmLogUtils.getCurrentLog().setLoginName("匿名");
				filterChain.doFilter(request, response);
				SmLogUtils.saveLogToDB();
				return;
			}

			// 检查用户是否已经登录
			// boolean signedOn = false;

			if (hreq.getSession(false) != null) {

				if (hreq.getSession().getAttribute(GxtConsts.LOGIN_FLAG) != null
						&& (Boolean) hreq.getSession().getAttribute(
								GxtConsts.LOGIN_FLAG)) {

					log.info("sing on:" + true);

					UserInfoPOJO user = (UserInfoPOJO) SecurityUtils
							.getCurrentUser().getUserInfo();
					SmLogUtils.getCurrentLog()
							.setLoginName(user.getLoginName());
					CurrentUser.putUser(user);

					SmLogUtils.getCurrentLog().setAppCode(user.getAppCode());

					doWithCurrentUser(hreq);
					filterChain.doFilter(request, response);
					SmLogUtils.saveLogToDB();
					CurrentUser.removeUser();
					return;
				}
			} else {
				filterChain.doFilter(request, response);
				SmLogUtils.saveLogToDB();
			}

			// SmLogUtils.saveLogToDB();

		} catch (Exception ex) {
			ex.printStackTrace();
			log.error(ex.getMessage(), ex);
		}
	}

	public void destroy() {
		log.debug(this.getClass().getName() + "destroy!");
		// System.out.println(this.getClass().getName() + "destroy!");
		try {
			UserPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
			log.error(null, e);
		}
	}

	public static boolean isIgnore(String currentURL) {
		boolean result = false;
		String[] splits = SystemParam.getMessage("ignore_access_url")
				.split(",");
		for (String s : splits) {
			if (Pattern.matches(s, currentURL)) {
				return true;
			}
		}

		return result;
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

	protected void doWithCurrentUser(HttpServletRequest request) {

	}
}
