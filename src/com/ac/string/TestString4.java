package com.ac.string;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestString4 {
    public static void main(String[] args) {
        // 字符串比较：== 和 equals
        String str1 = "hello world";
        String str2 = "HELLO WORLD";

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // false
        // equalsIgnoreCase : 表示忽略字符串的大小写进行比较
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        System.out.println(str1.compareTo(str2)); // 32 > 0

        // str1.compareTo(str2)
        // 如果返回值大于 0 的话，说明 str1 大于 str2
        // 如果返回值小于 0 的话，说明 str1 小于 str2
        // 如果返回值等于 0 的话，说明 str1 等于 str2

        System.out.println(str1.compareToIgnoreCase(str2)); // 0
    }
}
