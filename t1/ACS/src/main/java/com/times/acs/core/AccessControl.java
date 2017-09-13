/*
 * �������� 2006-6-2
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 * 
 */
package com.times.acs.core;

import java.io.Serializable;


public interface AccessControl extends Serializable {

    /**
     * @param resources ��������Դ��uri��classname,classname+methodname��
     * @return     �Ƿ���Ȩ��
     * @throws Exception
     */
    public boolean validate(String resources) throws Exception;

    /**
     * @param permission  Ȩ�޴���
     * @return        �Ƿ���Ȩ��
     * @throws Exception
     */
    public boolean validatePermissions(String permission) throws Exception;

}
