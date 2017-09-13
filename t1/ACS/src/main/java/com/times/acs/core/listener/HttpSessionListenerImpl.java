/*
 * 创建日期 2006-6-6
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
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
