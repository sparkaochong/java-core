package com.ac.regex;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestStringRegex {
    public static void main(String[] args) {
        // 1. String 类里面的 matches 方法
        String email = "abaab";
        String regex = "a+b";

        // 字符串是否匹配某个指定的正则表达式，可以使用 matches 方法
        boolean isMatched = email.matches(regex);
        if (isMatched) {
            System.out.println("匹配成功");
        } else {
            System.out.println("匹配不成功");
        }
        System.out.println("----------------------------------------");

        // 2. String 类中字符串替换的方法 replace
        String str = "aa1bbb2ccccc3dddd5fffff6";
        // replace 不支持正则表达式
        System.out.println(str.replace("c", "_"));
        // replaceAll 支持正则表达式
        System.out.println(str.replaceAll("[a-zA-Z]+", "_"));
        // 替换第一个匹配的正则表达式字符串
        System.out.println(str.replaceFirst("[a-zA-Z]+", "*"));
        System.out.println("----------------------------------------");

        // 3. String 类中字符串拆分的方法 split
        String s = "Hello World The First Day";
        // 将字符串按照某种规则进行拆分(切割)
        String[] arr = s.split(" ", 3);

        String ip = "192|168|1|103";
        // 1. split 第一个参数是 regex，也就是说 split 支持的正则表达式
        // 2. . 在正则表达式中是指任意字符
        // 3. | 在正则表达式中是指逻辑或运算符
        arr = ip.split("\\|");

        str = "aa1bbb2ccccc3dddd5fffff6";
        // 使用数字进行切割
        // split 也是支持正则表达式的
        arr = str.split("\\d");
        System.out.println(arr.length);
        for (String temp : arr) {
            System.out.println(temp);
        }
    }
}
