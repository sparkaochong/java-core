package com.ac.exception;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        IBank icbc = new ICBCBack();
        try {
            icbc.login("user1", "232");
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
        }


        try {
            icbc.register("user2", "123456");
        } catch (AccountAlreadyExistException | UserNameTooShortException e) {
            System.out.println("处理异常");
            e.printStackTrace();
        }
    }
}
