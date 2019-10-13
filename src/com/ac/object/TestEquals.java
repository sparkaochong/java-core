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
public class TestEquals {
    public static void main(String[] args) {
        // Person 类继承了 java.lang.Object
        // Object 类中的 equals 是对比两个对象的引用地址的
        Person firstPerson = new Person("张三", 20);
        Person secondPerson = new Person("张三", 20);

        boolean result = firstPerson.equals("Hello");
        // System.out.println(result); // 不是同一个引用的话，那么肯定返回 false

        Person person = firstPerson;
        result = firstPerson.equals(person);
        // System.out.println(result); // 两个对象是统一个引用的话，那么肯定返回 true

        // Object 中的 equals 实际上是比较引用(对象堆内存地址)
        // 在业务开发中，我们需要去比较对象的属性的值，来确定对象是否相等
        // 重写 equals 方法的时候需要遵循的 5 个规则：
        // 1. 自反性：对于任何非空引用 x，x.equals(x) 应该返回 true
        System.out.println(firstPerson.equals(firstPerson)); // true

        // 2. 对称性：对于任何引用 x 和 y ，当且仅当 y.equals(x) 返回 true，那么 x.equals(y) 也应该返回 true
        System.out.println(firstPerson.equals(secondPerson)); // true
        System.out.println(secondPerson.equals(firstPerson)); // true

        // 3. 传递性：对于任何引用 x、y 和 z，如果 x.equals(y) 返回 true，y.equals(z) 返回 true，
        //那么 x.equals(z) 也应该返回 true
        Person thirdPerson = new Person("张三", 20);
        System.out.println(firstPerson.equals(secondPerson)); // true
        System.out.println(secondPerson.equals(thirdPerson)); // true
        System.out.println(firstPerson.equals(thirdPerson)); // true

        // 4. 一致性：如果 x 和 y 引用的对象没有发生变化，反复调用 x.equals(y) 应该返回同样的结果
        System.out.println(firstPerson.equals(secondPerson)); // true
        System.out.println(firstPerson.equals(secondPerson)); // true
        System.out.println(firstPerson.equals(secondPerson)); // true
        System.out.println(firstPerson.equals(secondPerson)); // true
        System.out.println(firstPerson.equals(secondPerson)); // true
        System.out.println(firstPerson.equals(secondPerson)); // true

        // 5. 对于任意非空引用 x，x.equals(null) 应该返回 false
        System.out.println(firstPerson.equals(null)); // false

        // 如果没有实例化的对象调用 equals 的时候会抛出空指针异常
        Person p = new Person("李四", 30);
        System.out.println(p.equals(firstPerson));

    }
}
