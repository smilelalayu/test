package com.miit.acs.code.spring;

import java.util.Properties;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import com.miit.acs.code.CodeUtils;

/**
 * @author 赵森
 *
 * @date 2013-8-31
 * 
 * 修改配置文件密码为密文
 */
public class MiitSpringPropertyConfig extends PropertyPlaceholderConfigurer {
	@Override
	protected void processProperties(
			ConfigurableListableBeanFactory beanFactory, Properties props)
			throws BeansException {


		String password = props.getProperty("master.jdbc.password");
		if (password != null) {
			props.setProperty("master.jdbc.password", CodeUtils.getDesString(password,""));
		}
		
		
		String slavepassword = props.getProperty("slave.jdbc.password");
		if (slavepassword != null) {
			props.setProperty("slave.jdbc.password", CodeUtils.getDesString(slavepassword,""));
		}
		
		super.processProperties(beanFactory, props);

	}

}
