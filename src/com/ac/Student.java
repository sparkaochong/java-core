package com.ac;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class Student extends Person {
    public Student(String name,int age){
        super(name,age);
    }

    @Override
    public String toString(){
        return "Student{" +
                "name='" + super.getName() + "\'" +
                ", age=" + super.getAge() +
                "}";
    }
}
