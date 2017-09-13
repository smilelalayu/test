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
 * 当系统中没有给定的用户时抛出此异常。
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
