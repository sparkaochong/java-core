package com.ac.string;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestString3 {
    public static void main(String[] args) {
        // String 是使用 final 修饰的类
        // 1. 不能被继承
        // 2. 类不能被修改
        String str = "Hello";
        str += " World"; // 对字符串进行修改, 会产生一个新的对象
        str += "!!!"; // 又产生了一个新对象


        String s = "";
        for (int i = 0; i < 1000; i++) {
            s += i; // 会产生大量的中间对象，消耗了内存，性能不好
        }
        System.out.println(s);

        StringBuilder sb = new StringBuilder(); // StringBuilder 是一个可变的对象
        for (int i = 0; i < 1000; i++) {
            sb.append(i); // 拼接字符串，只会产生一个对象，就是 sb 这个对象
        }
        System.out.println(sb.toString());

        // 不变性
        // Hello + World -> HelloWorld
        // 可变的
        // HelloWorld
    }
}
