package com.ac.array;

import com.ac.Employee;
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
public class TestObjectArray {
    public static void main(String[] args) {
        Person[] per = new Person[3];
        per[0] = new Person("张三", 20);
        per[1] = new Person("李四", 30);
        per[2] = new Person("王五", 40);
        // 1. 如果数据是引用类型的话，那么数组中的每一个元素保存的是引用类型的对象的引用(或者说是对象在堆内存空间的地址)

        // 2. 引用类型的数组中的元素的多态性
        Person[] perArray = new Person[3];
        perArray[0] = new Person("张三", 20); // 第一个元素的编译时类型和运行时类型都是 Person
        perArray[1] = new Student("李四", 22); // 第二个元素的编译时类型是 Person，但是运行时类型是 Student
        perArray[2] = new Employee("王五", 40); //第三个元素的编译时类型是 Person，但是运行时类型是 Employee

        for (Person p : perArray) {
            System.out.println(p);
        }
    }
}
