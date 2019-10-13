package com.ac.string;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestStringMethod4 {
    public static void main(String[] args) {
        // 字符串拼接: + 、 concat
        // 一般的情况下，我们都会使用 + 来代替 concat
        String str = "Hello";
        str = str + " World";

        str = str.concat("!!!");
        System.out.println(str);

        // 大小写转换
        System.out.println(str.toUpperCase()); // 转成大写
        System.out.println(str.toLowerCase()); // 转成小写

        // 练习：将字符串的首字母进行大写
        // "hello world" -> "Hello world"
        String s = "hello world";
        // 1. 拿到第一个字符
        // 2. 将第一个字符大写
        // 3. 将大写的第一个字符和剩下的字符拼接起来
        String finalStr = s.substring(0, 1)
                .toUpperCase()
                .concat(s.substring(1));

        System.out.println(finalStr);

        String s1 = str.concat("");
    }
}
