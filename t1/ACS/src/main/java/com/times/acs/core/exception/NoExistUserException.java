/*
 * �������� 2006-6-2
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.core.exception;

/**
 * @author Administrator
 *
 * ��ϵͳ��û�и������û�ʱ�׳����쳣��
 * 
 */
public class NoExistUserException extends Exception {

    public NoExistUserException(String message) {

        super(message);

    }

    public NoExistUserException() {

    }

    public String getMessage() {
        return "user is not exist!";
    }

}
