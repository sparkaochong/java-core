package com.ac.string;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestString1 {
    public static void main(String[] args) {
        String str1 = "Hello"; // 直接定义方式
        // 通过构造方法来定义 String 对象
        String str2 = new String("Hello");
        // 引用传递
        String str3 = str2;

        // 使用 == 来比较两个字符串对象是否相等
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // true

        // 结论：== 比较的是字符串对象的引用
        System.out.println("------------------------------------");

        // 使用 equals 方法来比较字符串
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str2.equals(str3)); // true

        // 结论：equals 方法比较的是字符串的内容

        // 每一个字符串都是一个匿名 String 对象
        // 所以我们可以直接使用字符串.方法，调用 String 类型中的所有方法
        System.out.println("Hello".equals(str2));

        // 技巧
        String str = null;
        // 比较 str 和 "Hello" 这个字符串内容是否相等
        // 把字符串放到前面，变量操作参数
        System.out.println("Hello".equals(str));
    }
}
