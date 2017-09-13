/*
 * �������� 2006-6-14
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.core.interceptor;

import java.io.Serializable;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

import com.times.acs.core.AccessControl;
import com.times.acs.core.exception.StopUserException;
import com.times.acs.tools.SystemParam;

import org.springframework.aop.support.RegexpMethodPointcutAdvisor;

public class MethodNameACInterceptor implements MethodInterceptor, Serializable {

    private static final Logger log = Logger
            .getLogger(MethodNameACInterceptor.class);

    private AccessControl ac;

    public AccessControl getAc() {
        return ac;
    }

    public void setAc(AccessControl ac) {
        this.ac = ac;
    }

    public Object invoke(MethodInvocation invocation) throws Throwable {

        String isInterceptor = SystemParam
                .getMessage("MethodName_ACInterceptor_FLAG");
        if (isInterceptor == null || !isInterceptor.equalsIgnoreCase("true")) {

            return invocation.proceed();
        }

        boolean flag = false;
        try {
            flag = ac.validate(invocation.getThis().getClass().getName() + "."
                    + invocation.getMethod().getName());
        } catch (StopUserException e) {

//            FacesContext.getCurrentInstance().responseComplete();
//            // FacesUtils.dispatch("NoPermission.html");
//            try {
//                String errorPage = SystemParam.getPageError("UserStopError");
//                FacesUtils.dispatch(errorPage);
//            } catch (Exception err) {
//                err.printStackTrace();
//                log.error(null, err);
//            }

            return null;

        } catch (Exception e) {
            e.printStackTrace();
            log.error(null, e);

        }

        if (flag) {
            Object result = invocation.proceed();

            return result;
        } else {

//            FacesContext.getCurrentInstance().responseComplete();
//            // FacesUtils.dispatch("NoPermission.html");
//            try {
//                String errorPage = SystemParam
//                        .getPageError("UserNoPermissionError");
//                FacesUtils.dispatch(errorPage);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

            return null;
        }

    }
}