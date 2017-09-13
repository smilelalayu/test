/*
 * 创建日期 2006-6-8
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.core.interceptor;

import java.io.Serializable;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

import com.times.acs.core.AccessControl;
import com.times.acs.core.exception.StopUserException;
import com.times.acs.tools.SystemParam;

public class ClassNameACInterceptor implements MethodInterceptor, Serializable {

    private static final Logger log = Logger
            .getLogger(ClassNameACInterceptor.class);

    private AccessControl ac;

    public AccessControl getAc() {
        return ac;
    }

    public void setAc(AccessControl ac) {
        this.ac = ac;
    }

    public Object invoke(MethodInvocation invocation) throws Throwable {

        String isInterceptor = SystemParam
                .getMessage("ClassName_ACInterceptor_FLAG");
        if (isInterceptor == null || !isInterceptor.equalsIgnoreCase("true")) {

            return invocation.proceed();
        }

        boolean flag = false;

        try {
            flag = ac.validate(invocation.getThis().getClass().getName());
        } catch (StopUserException e) {

//            FacesContext.getCurrentInstance().responseComplete();
//            // FacesUtils.dispatch("NoPermission.html");
//            try {
//                String errorPage = SystemParam.getPageError("UserStopError");
//                FacesUtils.dispatch(errorPage);
//            } catch (Exception err) {
//                err.printStackTrace();
//            }

            return null;

        } catch (Exception e) {
            e.printStackTrace();
            log.error(null, e);

        }

        log.info("interceptor  method :" + invocation.getMethod().getName()
                + "  valide result:    " + flag);

        if (flag) {
            Object result = invocation.proceed();

            return result;
        } else {

//            FacesContext.getCurrentInstance().responseComplete();
//            // FacesUtils.dispatch("NoPermission.html");
//            try {
//                String errorPage = SystemParam
//                        .getPageError("UserNoPermissionError");
//
//                FacesUtils.dispatch(errorPage);
//            } catch (Exception e) {
//                e.printStackTrace();
//                log.error(null, e);
//            }

            return null;
        }

    }
}
