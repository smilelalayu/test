/*
 * �������� 2006-6-6
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package com.times.acs.core.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

import com.times.acs.core.usermanager.UserPool;

public class HttpSessionListenerImpl implements HttpSessionListener {

    private static final Logger log = Logger
            .getLogger(HttpSessionListenerImpl.class);

    public void sessionCreated(HttpSessionEvent e) {

        // System.out.println("session created");
        log.info("session created!");

    }

    public void sessionDestroyed(HttpSessionEvent e) {
        log.info("session destroyed!");
        // System.out.println("session destroyed");
        UserPool.removeUser(e.getSession());

    }
}
