/*
 * �������� 2006-6-29
 *
 * TODO Ҫ��Ĵ���ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.tools;

import com.times.j2ee.util.PropertyManager;

public class SystemParam {

    private static final String ACS_CONF_NAME = PropertyManager
            .getString("acs.config");

//    private static final String PAGE_ERROR = PropertyManager
//            .getString("page.error");

    public static String getMessage(String key) {
        String result = null;
        try {
            result = PropertyManager.getRB(ACS_CONF_NAME, key);
        } catch (Exception e) {
            e.printStackTrace();

        }

        return result;

    }

    public static String getPageError(String key) {
        String result = null;
        try {
            result = PropertyManager.getRB("", key);
        } catch (Exception e) {
            e.printStackTrace();

        }

        return result;
    }

}
