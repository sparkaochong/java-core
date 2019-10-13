package com.ac.reflect;

import com.ac.Person;

import java.lang.reflect.Constructor;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestClassConstructor {
    public static void main(String[] args) {
        // 拿到 Class 类型的对象
        Class<Person> cls = Person.class;

        Constructor<?>[] constructors = cls.getConstructors(); // 获取所有的构造方法

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // 获取指定的构造方法
        try {
            // 拿到默认无参的构造方法
            Constructor<Person> c1 = cls.getConstructor();
            System.out.println("无参构造方法：" + c1);

            System.out.println(cls.getConstructor(String.class));

            Constructor<Person> c2 = cls.getConstructor(String.class, int.class);
            System.out.println("两参构造方法：" + c2);

            // 有了构造方法，那么就可以创建对象
            // 使用构造器 Constructor 中的 newInstance 来代替 Class 类中的 newInstance
            Person person = c1.newInstance();
            person.setName("李四");
            person.setAge(100);
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
