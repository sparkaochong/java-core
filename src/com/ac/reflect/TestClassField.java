package com.ac.reflect;

import com.ac.Person;

import java.lang.reflect.Field;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestClassField {
    public static void main(String[] args) {
        Class<Person> cls = Person.class;

        // 拿到一个类中所有的属性，包括私有属性
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("---------------------------------");

        // 根据属性名，拿到指定的属性
        try {
            Field nameField = cls.getDeclaredField("name");
            System.out.println(nameField);
            // 我们可以通过反射拿到指定属性的值
            Person person = new Person("李四", 120);
            // 解除封装
            nameField.setAccessible(true);
            Object obj = nameField.get(person); // 访问属性的值
            String name = (String)obj;
            System.out.println(name);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
