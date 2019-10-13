package com.ac.string;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestStringMethod1 {
    public static void main(String[] args) {
        // 1. 判断字符串的前后子字符串
        String str = "**@@hello##";
        // 判断字符串是不是以指定字符串开头
        boolean result = str.startsWith("hh");
        System.out.println(result);

        // 判断字符串是不是以指定字符串结尾
        result = str.endsWith("##");
        System.out.println(result);

        // 2. 判断字符串中是否包含某个指定的字符串
        result = str.contains("hello");
        System.out.println(result);

    }
}
