/*
 * �������� 2006-6-21
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 * 
 */
package com.times.acs.core.filter;

import javax.servlet.http.HttpServletResponse;
import com.times.acs.tools.SystemParam;

public class DispatchUtils {

    /**
     * @param hres ��Ӧ
     * @param url ҳ��ĵ�ַ
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
