/*
 * 创建日期 2006-6-2
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package com.times.acs.core.exception;

/**
 * @author Administrator
 *
 * 当给定的用户被暂停时抛出此异常。
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
