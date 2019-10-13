package com.ac.exception;

import com.ac.Person;
import com.ac.Student;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestException {
    public static void main(String[] args) {
        System.out.println("1. 开始除法计算");
        Person person = new Person("张三", 30);
        // 使用 try ... catch ... 来捕获和处理异常
        try { // try 代码块，放会出现异常的代码
            Person p = new Student("李四", 34);
            Student student = (Student)p; // 会抛出 ClassCastException （类型转换异常）
            System.out.println(student);

            int age = person.getAge(); // 抛出 NullPointerException

            int result = age / 0; // 抛出 ArithmeticException , 默认的情况下会终止程序的执行
            System.out.println("2. 除法计算的结果是：" + result);
        } catch (ClassCastException e) { // 将子类类型的异常放在父类类型异常的前面
            System.out.println("捕获处理类型转换异常");
        } catch (Exception exception) { // catch 代码块，这里放处理异常的代码
            // 简单的打印异常信息
            exception.printStackTrace();
        } finally { // finally 代码块，不管有没有发生异常，都是会执行的代码块
            System.out.println("finally 代码块，不管有没有发生异常，都是会执行的代码块");
        }
        System.out.println("3. 结束除法计算");
    }
}
