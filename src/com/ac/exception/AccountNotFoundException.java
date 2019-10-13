package com.ac.exception;

/**
 * Description:
 * 当你使用一个不存在的账号登陆银行系统的时候，就会抛这个异常
 * 这个是一个 runtime exception -> unchecked exception
 *
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String msg) {
        super(msg); // 调用父类中的单参构造方法
    }
}
