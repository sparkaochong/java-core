package com.ac.string;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestStringMethod2 {
    public static void main(String[] args) {
        String str = "Hello World";
        // indexOf -> 左到右
        // lastIndexOf -> 右到左
        // 想知道字符串中第一次出现 o 的位置
        int index = str.indexOf("o");
        System.out.println(index); // 4
        // 如果需查找的字符串不在指定的字符串中，那么返回 -1
        index = str.indexOf("kkkk");
        System.out.println(index); // -1
        // 从指定的位置开始找字符串 o 出现的位置
        index = str.indexOf("o", 5);
        System.out.println(index); // 7
        // 找出最后一次出现 o 的位置
        index = str.lastIndexOf("o");
        System.out.println(index);
        index = str.lastIndexOf("o", 5);
        System.out.println(index); // 4

        // substring，字符串的截取
        String subStr = str.substring(0, 5); // 不包含 endIndex [fromIndex endIndex)
        System.out.println(subStr); // Hello

        subStr = str.substring(6); // endIndex 默认是最后
        System.out.println(subStr); // World

        // substring 会和 indexOf 配合起来使用
        String email = "tangwq_ok@163.com";
        // 想将用户名截取出来，将 @ 前面的字符串截取出来
        // 1. 确定 @ 字符所在的下标
        int aIndex = email.indexOf("@");
        // 2. 截取从 0 开始到 @ 所在的下标
        subStr = email.substring(0, aIndex);
        System.out.println(subStr); // tangwq_ok
    }
}
