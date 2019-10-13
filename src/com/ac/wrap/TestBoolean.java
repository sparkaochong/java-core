package com.ac.wrap;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestBoolean {
    public static void main(String[] args) {
        Boolean b = Boolean.valueOf("true"); // 装箱

        if (b) { // 把 Boolean -> boolean
            System.out.println("自动拆箱");
        }

        boolean temp = b.booleanValue(); // 拆箱

        System.out.println(b);
        System.out.println(temp);

        new Boolean("true");
        new Boolean("true");
        new Boolean("true");
        new Boolean("true");
        new Boolean("true");
        new Boolean("true");
        new Boolean("true");
        new Boolean("false");

        Boolean.valueOf("true"); // 创建一个表示 true 的包装类型的对象
        Boolean.valueOf("true");
        Boolean.valueOf("true");
        Boolean.valueOf("true");
        Boolean.valueOf("true");
        Boolean.valueOf("false"); // 创建一个表示 false 的包装类型的对象
        Boolean.valueOf("false");
        Boolean.valueOf("false");
        Boolean.valueOf("false");

    }
}
