package com.ac.array;

import com.ac.Person;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestArray3 {
    public static void main(String[] args) {
        // 语法一：数据类型[] 数组名称 = new 数据类型[数组长度]
        int[] firstArray = new int[100];

        // 语法二：数据类型 数组名称[] = new 数据类型[数组长度]
        int secondArray[] = new int[30];

        // 语法三：
        // 数据类型[] 数组名称 = null
        // 数组名称 = new 数据类型[数组长度]
        int[] thirdArray = null; // 声明一个数组
        thirdArray = new int[20]; // 实例化一个数组对象

        // 定义一个 double 类型的数组
        double[] doubleArray = new double[3]; // 所有元素的默认值是 0.0
        for (double d : doubleArray) {
            System.out.println(d);
        }

        // 定义一个 boolean 类型的数组
        boolean[] booleanArray = new boolean[3]; // 默认值是 false
        for (boolean b : booleanArray) {
            System.out.println(b);
        }

        // 定义一个引用类型的数组
        Person[] perArray = new Person[2]; // 每个元素的默认值是 null
        perArray[0] = new Person("张三", 20);
        perArray[1] = new Person("李四", 30);
        for (Person p : perArray) {
            System.out.println(p);
        }
    }
}
