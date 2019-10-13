package com.ac.string;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestString2 {
    public static void main(String[] args) {
        // 通过直接方式
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Hello";

        // == 比较对象引用的
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // true
        System.out.println(str2 == str3); // true

        // 实际上，在Jvm中，字符串数据是直接保存在 字符串常量池(也是一块内存空间，属于堆内存)

        System.out.println("----------------------------");

        // "Hello" 实际上就是一个匿名字符串对象，它保存在 字符串常量池 中
        String str = new String("Hello"); // 产生 1 到 2 个字符串对象

        // 手工入池，提高性能
        // 如果 字符串常量池 中已经存在了定义的字符串，那么直接引用
        // 否则的话， 在字符串常量池中会创建一个字符串对象
        str = str.intern(); // str 这个引用是直接指向了 字符串常量池中的 "Hello"
        System.out.println(str == str1); // true
        System.out.println(str == str2); // true
        System.out.println(str == str3); // true
    }
}
