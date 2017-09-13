package com.miitgxt.auth.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.miitgxt.common.security.GxtSessionUser;
import com.times.acs.core.usermanager.UserPool;
import com.times.acs.pojo.admin.PermissionsPOJO;
import com.times.acs.pojo.admin.UserInfoPOJO;
import com.times.acs.service.admin.UserinfoService;

@Service
public class GxtUserDetailService implements UserDetailsService {

	private static Logger logger = LoggerFactory
			.getLogger(GxtUserDetailService.class);

	@Autowired
	UserinfoService userinfoService;

	// @Autowired
	// PermissionService permissionService;
	@Autowired
	protected Boolean debug;
	
	
	protected Map<String,Object> parms=new HashMap<String,Object>();
	
	
//	private ;
	
	public void doRequest(HttpServletRequest request){
		//System.out.println(request.getParameterMap());
		if(request.getParameterMap().size()>0){
			parms.putAll(request.getParameterMap());
		}
		
	}

	public UserinfoService getUserinfoService() {
		return userinfoService;
	}

	public void setUserinfoService(UserinfoService userinfoService) {
		this.userinfoService = userinfoService;
	}

	// 登入默认会调整到这里
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		logger.info("username is :" + userName);
		UserInfoPOJO userInfo = null;
		try {
			userInfo = userinfoService.getUserinfoByLoginName(userName);
		} catch (Exception e) {
			if (this.debug) {
				e.printStackTrace();
			}
			throw new UsernameNotFoundException(userName);
		}
		if (userInfo == null) {
			throw new UsernameNotFoundException(userName);
		} else {
			// logger.info(StringUtils.<Character>
			// objectCompareTo(userInfo.getStop(), new Character('n')) + "");
			if (!(null != userInfo.getStop() && userInfo.getStop().equals("n"))) {
				throw new UsernameNotFoundException(userName);
			}
		}
		List<GrantedAuthority> grantedAuths = obtionGrantedAuthorities(userInfo);
		// Managers manager =
		// managerService.getManagerById(userInfo.getManagerId());
		// Managers manager =
		// managerService.getManagerById(userInfo.getManager().getId());

		//

		boolean enables = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

	

		GxtSessionUser userdetail = new GxtSessionUser(userInfo.getLoginName(),
				userInfo.getPassword(), enables, accountNonExpired,
				credentialsNonExpired, accountNonLocked, grantedAuths,
				userInfo.getUserId(), "");
		userdetail.setUserInfo(userInfo);
		return userdetail;
	}

	// 根据Token验证用户信息
	public UserDetails loadUserByToken(String token)
			throws UsernameNotFoundException {
		UserInfoPOJO userInfo = null;
		try {
			userInfo = userinfoService.getUserinfoByToken(token);
			
		} catch (Exception e) {
			if (this.debug) {
				e.printStackTrace();
			}
			throw new UsernameNotFoundException(token);
		}
		if (userInfo == null) {
			throw new UsernameNotFoundException(token);
		} else {
			// logger.info(StringUtils.<Character>
			// objectCompareTo(userInfo.getStop(), new Character('n')) + "");
			if (!(null != userInfo.getStop() && userInfo.getStop().equals("n"))) {
				throw new UsernameNotFoundException(token);
			}
			logger.info("username is :" + userInfo.getLoginName());
		}
		List<GrantedAuthority> grantedAuths = obtionGrantedAuthorities(userInfo);
		// Managers manager =
		// managerService.getManagerById(userInfo.getManagerId());
		// Managers manager =
		// managerService.getManagerById(userInfo.getManager().getId());

		//

		boolean enables = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

	

		GxtSessionUser userdetail = new GxtSessionUser(userInfo.getLoginName(),
				userInfo.getPassword(), enables, accountNonExpired,
				credentialsNonExpired, accountNonLocked, grantedAuths,
				userInfo.getUserId(), "");
		userdetail.setUserInfo(userInfo);
		return userdetail;
	}
	
	// 取得用户的权限
	private List<GrantedAuthority> obtionGrantedAuthorities(
			UserInfoPOJO userInfo) {
		List<GrantedAuthority> authSet = new ArrayList<GrantedAuthority>();

		if (userInfo != null) {

			Set<PermissionsPOJO> userPerms = new HashSet<PermissionsPOJO>();

			userPerms.addAll(UserPool.loadAllPermissions(userInfo.getUserId(),
					true));
			userInfo.setPermissions(userPerms);

			for (PermissionsPOJO perm : userPerms) {
				logger.info("loading perm: " + perm);
				authSet.add(new SimpleGrantedAuthority(String.valueOf(perm
						.getCode())));
			}

		}

		// //获取角色对应权限集合
		return authSet;
	}
}
