package com.ac.reflect;

import com.ac.Person;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestReflect {
    public static void main(String[] args) {
        Person person = new Person("张三", 40); // 由类得到对象

        // 1. 通过 Object 中的 getClass 方法获取到 java.lang.Class 对象（一般不用）
        Class<?> personClass = person.getClass(); // 由对象得到类，反着来的味道，反射
        // Class 就是所有反射的源头，你得知道怎么样获取到 Class 类型的对象
        // 2. 通过 类名.class 获取到 Class 类型对象
        Class<?> cls = Person.class;
        // 3. 通过 Class 类中静态方法 forName 来得到 Class 类型的对象
        Class<?> c = null;
        try {
            c = Class.forName("com.twq.corejava.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 有了 Class 类型的对象之后，我们可以使用它来创建对象
        try {
            // newInstance 默认会调用类的无参构造方法
            Object obj = c.newInstance(); // 使用 Class 类型的对象创建一个对象
            Person p = (Person)obj; // Object -> Person
            System.out.println(p);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
