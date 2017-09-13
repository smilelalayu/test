package com.hm.bus.webservice.cnloan;

import org.apache.commons.lang.StringUtils;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.log4j.Logger;

import com.gep.util.PropertyUtils;

public class LoanClientCXF {
	private static final Logger LOG = Logger.getLogger(LoanClientCXF.class);
	private static JaxWsProxyFactoryBean factoryBean1 = null;

	static {
		LOG.info("正在初始化CXF相关连接开始...");
		// 贷后WSDL
		// "http://123.56.141.240:7097/webservice/cnLoanService?wsdl";
		String wsdlUrl2 = PropertyUtils.getConfig("bus", "wsdl.repayment.path");
		if (StringUtils.isBlank(wsdlUrl2)) {
			LOG.error("[wsdl.repayment.path] 配置为空。。。");
		}

		factoryBean1 = new JaxWsProxyFactoryBean();
		factoryBean1.getInInterceptors().add(new LoggingInInterceptor());
		factoryBean1.getOutInterceptors().add(new LoggingOutInterceptor());
		factoryBean1.setServiceClass(com.hm.bus.webservice.cnloan.CnLoanService.class);
		factoryBean1.setAddress(wsdlUrl2);

		LOG.info("正在初始化CXF相关连接完毕...");
	}

	public static com.hm.bus.webservice.cnloan.CnLoanService createCnLoanService() {
		return (com.hm.bus.webservice.cnloan.CnLoanService) factoryBean1.create();
	}

	/*
	 * public static void main(String[] args) {
	 * com.cn.loan.bus.service.TransHead transHead = new
	 * com.cn.loan.bus.service.TransHead(); transHead.setSourceClient("1");
	 * String transBody = ""; com.cn.loan.bus.service.TransModel model = null;
	 * 
	 * com.cn.loan.bus.service.LonApp app = new
	 * com.cn.loan.bus.service.LonApp(); model =
	 * LoanClientCXF.createLoanService().recordLoan(transHead, app);
	 * System.out.println(model.getTransHead().toString()); }
	 */
}
