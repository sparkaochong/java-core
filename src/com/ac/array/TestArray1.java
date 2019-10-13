package com.ac.array;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestArray1 {
    public static void main(String[] args) {
        // 定义了 100 个整型变量
        // 数组就是一组相关变量的集合
        int[] firstArray = new int[100];
        // int[] 表示数组的类型，是一个整型数组
        // firstArray 表示数组的名称，数组的变量
        // 数据也是引用类型，需要用 new 关键字来创建数组对象
        // 100 是数组的长度

        // 1. 元素：数组中的每一个数据，我们称之为数组中的一个元素(element)
        // 2. 下标(index)： 数组中每一个元素的位置，我们可以通过下标来访问每一个元素，也称为索引
        int firstElement = firstArray[0]; // 下标是从 0 开始的
        System.out.println(firstElement);
        int secondElement = firstArray[1]; // 访问第二个元素
        System.out.println(secondElement);
        int lastElement = firstArray[99]; // 访问数组的最后一个元素，下标等于数组的长度 - 1
        System.out.println(lastElement);

        // 数组初始化的值就是数组类型的默认值，比如 int -> 0

        // ArrayIndexOutOfBoundsException -> 数组下标越界异常 -> RuntimeException -> unchecked exception
        // 0 <= index <= 数组的长度 - 1， 0 <= index <= 99
        int index = 100;
        if (index >= 0 && index <= 99) {
            int temp = firstArray[index]; // 访问第 101 个元素的值
            System.out.println(temp);
        }

    }
}
