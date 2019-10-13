package com.ac.exception;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public interface IBank {
    /**
     *  登陆方法
     * @param userName  用户名(账号)
     * @param password  密码
     * @return  true 表示登陆成功，false 表示登陆失败
     * @throws AccountNotFoundException 如果用户名不存在的话，那么抛账号不存在的异常
     */
    public boolean login(String userName, String password) throws AccountNotFoundException;

    /**
     * 注册方法
     * @param userName  用户名
     * @param password  密码
     * @return true 表示注册成功，false 表示注册失败
     * @throws AccountAlreadyExistException 如果用户名已经存在，抛这个异常
     * @throws UserNameTooShortException    如果输入的用户名太短的话，抛这个异常
     */
    public boolean register(String userName, String password)
            throws AccountAlreadyExistException, UserNameTooShortException;

}
