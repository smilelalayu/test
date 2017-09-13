package com.hm.bus.webservice;

import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.Conduit;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gep.util.PropertyUtils;

public class LoanClientCXF {
	private static final Logger LOG = LoggerFactory
			.getLogger(LoanClientCXF.class);

	private static JaxWsProxyFactoryBean factoryBean = null;

	static {
		LOG.info("正在初始化CXF相关连接开始...");
		// 贷前WSDL
		// "http://123.57.48.237:7082/webservice/loanService?wsdl";
		String wsdlUrl = PropertyUtils.getConfig("bus", "wsdl.loan.sendBus");
		if (StringUtils.isBlank(wsdlUrl)) {
			LOG.error("[wsdl.loan.sendBus] 配置为空。。。");
		}

		LOG.info("[wsdl.loan.sendBusName] = {}  [wsdl.loan.sendBus] = {}",
				PropertyUtils.getConfig("bus", "wsdl.loan.sendBusName"),
				wsdlUrl);

		factoryBean = new JaxWsProxyFactoryBean();
		factoryBean.getInInterceptors().add(new LoggingInInterceptor());
		factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
		factoryBean.setServiceClass(com.hm.bus.webservice.LoanService.class);
		factoryBean.setAddress(wsdlUrl);

		LOG.info("正在初始化CXF相关连接完毕...");
	}

	public static com.hm.bus.webservice.LoanService createLoanService() {
		LoanService loginService = null;
		
		try {
			loginService =  (LoanService) factoryBean.create();
			Conduit conduit = (ClientProxy.getClient(loginService).getConduit());
			HTTPConduit httpConduit = (HTTPConduit) conduit;
			HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
			int timeoutCnt = NumberUtils.toInt(PropertyUtils.getConfig("bus", "wsdl.loan.sendBus.timeout"));
			if(timeoutCnt == 0){
				timeoutCnt = 3;
			}
			httpClientPolicy.setReceiveTimeout(1000 * 60 * timeoutCnt); // 5分钟超时时间。 该时间为响应超时。
			httpClientPolicy.setConnectionTimeout(1000 * 60 * timeoutCnt);// 连接超时(毫秒)
			httpClientPolicy.setAllowChunking(false);// 取消块编码
			httpConduit.setClient(httpClientPolicy);
		} catch (Exception e) {
			LOG.error("Create  webservice for [com.hm.bus.webservice.LoanService]  failed", e);
		}
		
		return loginService;
	}
}
