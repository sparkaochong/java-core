package com.ac.string;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestStringChar {
    public static void main(String[] args) {
        // 字符串实际上是由若干个字符组成的
        // 1. 将若干个字符转成字符串
        char[] chars = new char[]{'h', 'i', ',', '!'};
        String str1 = new String(chars);
        System.out.println(str1);

        // 2. 将字符串转成若干个字符
        String str = "Hello";
        char[] arr = str.toCharArray();
        for (char c : arr) {
            System.out.print(c + "、");
        }
        System.out.println();
        System.out.println("-----------------------------");

        // 3. 练习一：将一个字符串中的大写字母转小写，小写字母转大写
        // HelloWorld -> hELLOwORLD
        System.out.println(toLowerUpper("HelloWorld"));

        // 4. 练习二：判断一个字符串是数字
        // "123" -> 数字；"12a3" -> 不是数字
        System.out.println(isNumber("123"));

        // 5. 练习三：判断一个字符串是否是回文字符串
        // 回文字符串：abccba -> 回文字符串；abcba -> 回文
        // abcde -> 不是回文了
        System.out.println(isHuiWen3("abcde"));

    }

    private static boolean isHuiWen3(String str) {
        // 使用字符串反转的方式
        // 判断字符串和反转之后的字符串相等就可以
        StringBuilder sb = new StringBuilder(str); // String -> StringBuilder
        // 反转之后的字符串
        String reverseStr = sb.reverse().toString(); // StringBuilder -> String

        return str.equals(reverseStr);
    }

    private static boolean isHuiWen2(String str) {
        // 使用 while 循环来做
        int lowIndex = 0;
        int highIndex = str.length() - 1;
        while (lowIndex < highIndex) {
            if (str.charAt(lowIndex) != str.charAt(highIndex)) {
                return false; // 不是回文
            }
            lowIndex++; // 向前移一位
            highIndex--; // 向后移一位
        }
        return true;
    }

    private static boolean isHuiWen(String str) {
        int length = str.length();
        // 循环遍历字符数组的一半
        for (int index = 0; index < length / 2; index++) {
            // 判断对应的字符是否相等
            if (str.charAt(index) != str.charAt(length - index - 1)) { // 如果不相等的话
                return false; // 不是回文
            }
        }
        return true; // 是回文
    }

    /**
     * 判断一个字符串是否是数字
     * @param str
     * @return
     */
    private static boolean isNumber(String str) {
        // 1. 拿到字符串的所有字符
        char[] chars = str.toCharArray();
        // 2. 遍历所有的字符并判断
        for (char c : chars) {
            // 2.1 判断当前字符是否是数字
            if (c < '0' || c > '9') { // 如果不是数字的话，直接返回 false
                return false;
            }
        }
        return true; // 所有的字符都是数字
    }

    /**
     *  将一个字符串中的大写字母转小写，小写字母转大写
     * @param str
     * @return
     */
    private static String toLowerUpper(String str) {
        // 1. 拿到字符串中的每一个字符，就是将字符串转成字符数组
        char[] chars = str.toCharArray();

        // 2. 循环遍历每一个字符
        for (int index = 0; index < chars.length; index++) {
            char currentChar = chars[index]; // 当前循环的字符
            // 2.1 如果当前的字符是大写的话
            if (currentChar >= 65 && currentChar <= 90) {
                // 将大写的字符转成小写
                chars[index] += 32; // 类型会帮你自动转成 char
            }

            // 2.2 如果当前的字符是小写的话
            if (currentChar >= 97 && currentChar <= 122) {
                // 将小写转成大写
                chars[index] -= 32;
            }
        }
        return new String(chars);
    }
}
