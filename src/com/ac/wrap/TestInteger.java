package com.ac.wrap;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestInteger {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(10); // 将基本类型的数据转成包装类型的对象，装箱

        int tempValue = i.intValue(); // 将包装类型的对象转成基本类型的数据，拆箱

        System.out.println(i); // 10
        System.out.println(tempValue); // 10

        // 直接将 10 赋值给 Integer 类型的对象，
        Integer a = 10;  // 编译器将基本类型的数据自动转换成了包装类型的对象，自动装箱

        int b = Integer.valueOf(30); // 编译器将包装类型自动转换成了基本数据类型，自动拆箱

        int result = a * (a + b); // 先将 a 自动拆箱成基本类型
        System.out.println(result);

        // 可以将一个基本类型的数值直接赋值给 Object
        Object obj = 20; // int -> Integer -> Object
        int t = (Integer) obj; // Object -> Integer -> int
        System.out.println(t);

        // 很费内存的，性能很差
        new Integer(30); // 创建一个新对象
        new Integer(30); // 创建一个新对象
        new Integer(30); // 创建一个新对象
        new Integer(30); // 创建一个新对象
        new Integer(30); // 创建一个新对象
        new Integer(30); // 创建一个新对象
        new Integer(30); // 创建一个新对象
        new Integer(30); // 创建一个新对象

        // 对象的复用，占用内存少，性能变好
        Integer.valueOf(30); // 创建一个新对象
        Integer.valueOf(30); // 直接使用上面的对象
        Integer.valueOf(30); // 直接使用上面的对象
        Integer.valueOf(30); // 直接使用上面的对象
        Integer.valueOf(30); // 直接使用上面的对象
        Integer.valueOf(30); // 直接使用上面的对象
        Integer.valueOf(30); // 直接使用上面的对象

    }
}
