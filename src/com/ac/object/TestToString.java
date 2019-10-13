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
public class TestToString {
    public static void main(String[] args) {
        Person person = new Person("张三", 30);
        person.setName("李四");
        System.out.println(person); // 打印对象的时候，实际上是调用了 Object 中的 toString 方法
        System.out.println(person.toString());

        // 默认情况下，Object 类中的 toString 方法返回的字符串是由两部分组成：
        // 1. @ 前面的表示 包名.类名
        // 2. @ 后面的表示对象的 hashCode 值的十六进制
        System.out.println(person.hashCode());

        // 当我们打印对象的时候，打印对象的属性的值，需要覆写 toString 方法

    }
}
