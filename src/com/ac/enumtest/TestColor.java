package com.ac.enumtest;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestColor {
    public static void main(String[] args) {
        Color c = Color.BLUE;
        System.out.println(c.ordinal()); // 枚举对象在枚举类中定义的位置
        System.out.println(c); // 枚举对象的名字
        System.out.println(c.getName());

        System.out.println("------------------------");

        Color[] colors = Color.values(); // 得到所有的枚举对象
        for (Color color : colors) {
            System.out.println(color.ordinal()); // 枚举对象在枚举类中定义的位置
            System.out.println(color.name()); // 枚举对象的名字
            System.out.println(color.getName());
        }
    }
}
