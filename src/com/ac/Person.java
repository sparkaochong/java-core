package com.ac;

import java.util.Objects;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class Person {
    private String name;
    private int age;
    public String birthday;

    public Person() {
        System.out.println("Person无参构造方法调用");
    }

    public Person(String name) {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int ageDiv(int i) throws ArithmeticException {
        return age / i;
    }

    public String getName() {
        return name;
    }

    @Deprecated // 方法在以后的版本中会删除
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**覆写父类中的 equals 方法*/
    @Override
    public boolean equals(Object object) {
        // 1. 对象和 null 进行对比的话，直接返回 false
        if (object == null) {
            return false;
        }
        // 2. 如果当前的对象的引用和传进来对象的引用一样的话，肯定返回 true
        if (this == object) {
            return true;
        }
        // 3. 如果传进来的对象不是 Person 类型的实例，直接返回 false
        if (!(object instanceof Person)) {
            return false;
        }
        // 将对象强制转换成 Person 类型
        Person person = (Person)object;
        // 4. 业务判断，判断两个对象的属性值是否相等
        if (this.name == person.name && this.age == person.age) {
            return true;
        }
        return false;
    }

    /**覆写了 hashCode*/
    @Override
    public int hashCode() {
        // 注意：你要去看 equals 方法比较的是哪一些属性
        // name 和 age
        return Objects.hash(name, age);
    }

    /**覆写 toString 方法*/
    /**Override 注解，可以帮你在编译的时候检查是否真的覆写好了*/
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
