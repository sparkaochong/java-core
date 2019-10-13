package com.ac.array;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestMainArgs {
    public static void main(String[] args) {
        // args 更多的用于传递参数
        if (args == null || args.length == 0) {
            System.out.println("参数为空");
            System.out.println("你需要传递的参数是 -h 或者 -g");
        } else if (args[0].equals("-h")) {
            System.out.println("Hello");
        } else if (args[0].equals("-g")) {
            System.out.println("GoodBye");
        }
        System.out.println(args[1]);
    }
}
