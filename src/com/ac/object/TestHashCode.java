package com.ac.object;

import com.ac.Person;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestHashCode {
    public static void main(String[] args) {
        // 1. hashCode 是对象导出来的一个整型值(可以是负数，也可以是正数)
        Person firstPerson = new Person("李四", 20);
        int hashCode = firstPerson.hashCode();
        System.out.println(hashCode);
        // 默认情况下，Object 类中的 hashCode() 方法返回的值是对象在堆内存中存储的地址

        // 2. 如果对象不同，那么 hashCode 一般是不相等
        Person secondPerson = new Person("张三", 30);
        System.out.println(secondPerson.hashCode());

        // 3. 记住：如果两个对象 x 和 y，x.equals(y) 返回 true 的话，
        // 那么 x 和 y 这两个对象的 hashCode 必须相同
        Person p1 = new Person("张三", 20);
        Person p2 = new Person("张三", 20);
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.hashCode()); // 24022540
        System.out.println(p2.hashCode()); // 24022540

        // 如果你的类覆写了 equals 方法的话，那么肯定要覆写 hashCode 方法
        // 如果覆写了 hashCode 的话，那么它返回的值就不是对象在堆内存中的引用地址

        // 4. 如果两个对象的 hashCode 相等的话，那么它们 equals 的时候不一定返回 true
    }
}
