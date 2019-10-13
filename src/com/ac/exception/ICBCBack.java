package com.ac.exception;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class ICBCBack implements IBank {
    @Override
    public boolean login(String userName, String password) throws AccountNotFoundException {
        if ("user1" == userName) {
            // 船建一个异常对象，然后往外抛
            throw new AccountNotFoundException("用户" + userName + "不存在");
        }
        System.out.println(userName + " 登陆成功");
        return true;
    }

    @Override
    public boolean register(String userName, String password)
            throws AccountAlreadyExistException, UserNameTooShortException {
        if ("user2" == userName) {
            throw new AccountAlreadyExistException("用户 " + userName + " 已经存在");
        }
        if (userName.length() <= 5) {
            throw new UserNameTooShortException("用户名 " + userName + " 太短了");
        }

        System.out.println("注册成功");
        return true;
    }
}
