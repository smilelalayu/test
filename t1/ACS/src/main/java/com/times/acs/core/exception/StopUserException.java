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
 * ���������û�����ͣʱ�׳����쳣��
 */
public class StopUserException extends Exception {
    public StopUserException(String message) {

        super(message);

    }

    public StopUserException() {

    }

    public String getMessage() {

        return "user is stop!";
    }
}
