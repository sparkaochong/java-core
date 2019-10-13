package com.ac.exception;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestFinally {
    public static void main(String[] args) {
        System.out.println("1. 开始执行");
        try {
            // 不一定需要放有异常的代码块
            System.out.println("try code block");
            int result = 10 / 0; // 抛出异常，按道理的话，程序就应该在这里停止
        } finally {
            // 不管 try 代码块中有没有发生异常
            // 不管，你有没有 catch 代码块
            // 实际上，仍然会执行 finally 代码块
            System.out.println("finally code block");
            // finally 更多的用于资源的释放
            // finally 代码块也可能发生异常，也可以使用 try catch 来捕获和处理异常
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            System.out.println("结束 finally");
        }
        System.out.println("2. 结束执行");
    }
}
