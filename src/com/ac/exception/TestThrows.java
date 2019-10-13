
package com.ac.exception;

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
public class TestThrows {
    public static void main(String[] args) { // 把异常抛给虚拟机
        Person person = new Person("张三", 40);
        //int result = getPersonAgeDiv(person, 0);
        //System.out.println(result);

        // 实际上，Java中的异常类型，我们说分为一个 RuntimeException 和 非 RuntimeException
        // RuntimeException 及其子类 -> unchecked exception (非检查型异常) -> 编译器不要求你去处理
        // 其他的 Exception 的话 -> checked exception (检查型异常) -> 必须要求对异常进行处理(如果不处理的话，那么编译不过)
        System.out.println(getConstructor(person));
    }

    public static int getPersonAgeDiv(Person person, int i) {
        return person.ageDiv(i);
    }

    public static String getConstructor(Person person) {
        Class<? extends Person> cls = person.getClass();
        Constructor<? extends Person> constructor = null;
        try {
            // 拿到默认的构造方法
            constructor = cls.getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null; // 直接返回
        }
        return  constructor.getName();
    }
}
