/*
 * �������� 2006-6-2
 *
 * author ��szhao
 * 
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.core.exception;

/**
 * @author Administrator
 *
 * ��ϵͳ��û�и�����Ȩ��ʱ�׳����쳣��
 */
public class NoExistPermissionException extends Exception {
    public NoExistPermissionException(String message) {

        super(message);

    }

    public NoExistPermissionException() {

    }

    public String getMessage() {

        return "permission is not exist!";
    }

}
