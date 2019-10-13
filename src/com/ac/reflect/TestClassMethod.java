package com.ac.reflect;

import com.ac.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestClassMethod {
    public static void main(String[] args) {
        Class<Person> cls = Person.class;

        // 拿到 Person 类中所有的方法，包括这个类中父类中的方法
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("============================================");

        // 拿到指定的方法
        try {
            Method m = cls.getMethod("getName");
            System.out.println(m);

            m = cls.getMethod("ageDiv", int.class);
            System.out.println(m);

            // 拿到方法之后，我们可以直接调用这个方法
            // 通过方法调用两参构造方法创建一个对象
            Person p = cls.getConstructor(String.class, int.class)
                    .newInstance("张三", 40);
            Object obj = m.invoke(p, 4); // 通过反射直接调用方法
            int result = (Integer) obj; // Object -> Integer -> int
            System.out.println(result);

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
