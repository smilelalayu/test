package com.miitgxt.auth.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import com.times.acs.service.admin.PermissionService;

public class GxtSecurityMetadataSource implements
		FilterInvocationSecurityMetadataSource {

	private JdbcTemplate jdbcTemplate;
	private Integer systemId;
	// @Autowired
	private PermissionService permissionService;

	// 由spring调用
	public GxtSecurityMetadataSource(JdbcTemplate jdbcTemplate,
			Integer systemId, PermissionService permissionService)
			throws Exception {
		this.jdbcTemplate = jdbcTemplate;
		this.systemId = systemId;
		this.permissionService = permissionService;
		loadResourceDefine();
	}

	// 由spring调用
	public GxtSecurityMetadataSource(JdbcTemplate jdbcTemplate, Integer systemId)
			throws Exception {
		this.jdbcTemplate = jdbcTemplate;
		this.systemId = systemId;
		loadResourceDefine();
	}

	private static Map<String, Collection<ConfigAttribute>> resourceMap = null;

	private RequestMatcher pathMatcher;

	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return new ArrayList<ConfigAttribute>();
	}

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * 应当是资源为key， 权限为value。 资源通常为url， 权限就是那些以ROLE_为前缀的角色。 一个资源可以由多个权限来访问。
	 */
	private void loadResourceDefine() throws Exception {
		if (resourceMap == null) {
			resourceMap = new HashMap<String, Collection<ConfigAttribute>>();

		

			List<Map<String, Object>> permsList = jdbcTemplate
					.queryForList("select * from permissions where AppCode!='SS'");

			for (Map<String, Object> perm : permsList) {
				//
				if(perm.get("url")!=null && !perm.get("url").toString().trim().equals("")){
					
			
				Collection<ConfigAttribute> configAttributes = new ArrayList<ConfigAttribute>();
				ConfigAttribute configAttribute = new SecurityConfig(perm.get(
						"code").toString());
				configAttributes.add(configAttribute);

				// resource.getInterceptUrl() 格式必须是 拦截的包路径
				// 或者是 比如 /manager/**/*.jh 或者 /system/manager/**/*.jsp
				resourceMap.put(perm.get("url").toString(),
						configAttributes);
				}
			}
		}

	}

	// 返回所请求资源所需要的权限
	public Collection<ConfigAttribute> getAttributes(Object object)
			throws IllegalArgumentException {
		Iterator<String> it = resourceMap.keySet().iterator();
		while (it.hasNext()) {
			String resURL = it.next();
			pathMatcher = new AntPathRequestMatcher(resURL);
			if (pathMatcher.matches(((FilterInvocation) object).getRequest())) {
				Collection<ConfigAttribute> returnCollection = resourceMap
						.get(resURL);
				return returnCollection;
			}
		}
		return null;
	}

}
