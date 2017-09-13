/*
 * 创建日期 2006-6-21
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 * 
 */
package com.times.acs.core.filter;

import javax.servlet.http.HttpServletResponse;
import com.times.acs.tools.SystemParam;

public class DispatchUtils {

    /**
     * @param hres 响应
     * @param url 页面的地址
     * @throws Exception
     */
    public static void dispatch(HttpServletResponse hres, String url) throws Exception {

        hres.setContentType("text/html");
        hres.getWriter().println("<script language='JavaScript'>");
        if(url.endsWith(SystemParam.getMessage("USER_NO_PERMISSION"))){
            hres.getWriter().println("window.open('" + url + "', '_blank');");
            
        }else{
        hres.getWriter().println("window.open('" + url + "', '_top');");
        }
        hres.getWriter().println("</script>");

    }

}
