package com.ac.object;

import com.ac.Person;
import com.ac.Student;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestGetClass {
    public static void main(String[] args) {
        // 回顾：
        // 先将 java 源代码文件编译成 java 字节码文件
        // 不管是哪一个类的字节码文件都包含：
        // 1. 包名和类名
        // 2. 属性和方法(构造方法和普通方法等)
        // 在 Java 里面什么都是对象，Java 把字节码文件抽象成 Class 类型
        // 我们把 人 抽象成 Person
        Person person = new Student("张三", 30);
        // 获取到 person 这个对象的类型对应的字节码
        Class<? extends Person> cls = person.getClass();
        // 拿到 Person 类对应的字节码文件中的包名.类名
        System.out.println(cls.getName());

        // 反射
    }
}
