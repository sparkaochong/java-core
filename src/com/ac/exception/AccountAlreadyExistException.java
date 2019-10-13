package com.ac.exception;

/**
 * Description:
 * 当你使用一个已经存在的账号去注册的话，那么就抛这个异常
 * 这个异常是一个 checked exception
 *
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class AccountAlreadyExistException extends Exception {
    public AccountAlreadyExistException(String msg) {
        super(msg);
    }
}
