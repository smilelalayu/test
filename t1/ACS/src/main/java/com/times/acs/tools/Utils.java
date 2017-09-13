/*
 * 创建日期 2006-5-30
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.tools;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

public class Utils {

    public static void addMessage(String messageKey, Object param) {
        
//        FacesContext context = FacesContext.getCurrentInstance();
//        Application application = context.getApplication();
//        String messageBundleName = application.getMessageBundle();
//        HttpServletRequest request=(HttpServletRequest)context.getExternalContext().getRequest();
//        Locale locale = request.getLocale();
//        if (locale == null) {
//            locale = context.getApplication().getDefaultLocale();
//        }
//        ResourceBundle rb = ResourceBundle.getBundle(messageBundleName,locale);
//        String msgPattern = rb.getString(messageKey);
//        String msg = msgPattern;
//        if (param != null) {
//            Object[] params = { param };
//            msg = MessageFormat.format(msgPattern, params);
//        }
//        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
//                msg, msg);
//        context.addMessage(null, facesMsg);

    }
}
