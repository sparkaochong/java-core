package com.ac;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class Employee extends Person {
    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
