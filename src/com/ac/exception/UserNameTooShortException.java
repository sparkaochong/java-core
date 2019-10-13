package com.ac.exception;

/**
 * Description:
 * <p>
 * 在注册的时候，如果用户名太短的话，那么抛这个异常
 * 是一个 checked exception
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class UserNameTooShortException extends Exception {
    public UserNameTooShortException(String msg) {
        super(msg);
    }
}
