package com.ac.wrap;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestStringWrap {
    public static void main(String[] args) {
        String str = "16.01";
        // 1. 把 String 类型的数据转成 int
        //int i = Integer.parseInt(str);
        //System.out.println(i);

        // 2. 把 String 类型的数据转成 double
        double d = Double.parseDouble(str);
        System.out.println(d);

        // 3. 把 String 类型的数据转成 boolean
        str = "ssswwww";
        boolean b = Boolean.parseBoolean(str); // 如果字符串不是 true 和 false 的话，那么直接返回 false
        System.out.println(b);

        // 4. 将基本类型转成 String 类型
        String s = 10 + ""; // 拼接空字符串的方式转成 String 类型

        s = String.valueOf(10); // 直接调用方法来转
    }
}
