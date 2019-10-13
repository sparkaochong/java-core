package com.ac.string;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestStringMethod3 {
    public static void main(String[] args) {
        String str = "";
        // 如何判断一个字符串是不是空字符串
        boolean isEmpty = str.length() == 0;
        System.out.println(isEmpty);

        isEmpty = str.isEmpty();
        System.out.println(isEmpty);

        boolean isBlank = str.isBlank(); // 判断字符串是不是空白
        System.out.println(isBlank);

        // 可以通过 trim 这个 API 来实现去除空格
        // trim 这个方法(api) 是去掉字符串的前后的所有空格，中间的空格去不掉
        String s = "    He    llo      ";
        System.out.println("[" + s + "]");
        s = s.trim(); // 去掉了空格
        System.out.println("[" + s + "]");

        // 链式开发
        System.out.println(s.trim().length());
    }
}
