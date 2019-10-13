package com.ac.array;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestArray2 {
    public static void main(String[] args) {
        // 数据的遍历
        int[] firstArray = new int[10];
        int length = firstArray.length; // 这个属性表示数组的长度
        // System.out.println(length);

        // 通过下标对数据元素赋值
        firstArray[1] = 10; // 将第二个元素的值赋值为 10
        firstArray[9] = 2;  // 将第十个元素的值赋值为 2

        // 想访问数组中的每一个元素，通 for 循环来实现
        for(int index = 0; index < firstArray.length; index++) {
            System.out.println("第 " + (index + 1) + " 个元素的值是：" + firstArray[index]);
        }

        System.out.println("-----------------------------------");

        // 通过 foreach 来实现循环遍历数组中的每一个元素的值
        // foreach 语句的话实际上是普通 for 循环的增强
        // 如果在 for 循环体中不用 index 信息的话，我们优先选择使用 foreach 循环
        for(int value : firstArray) { // 每一次遍历的时候，将当前当前的元素值赋值给 value
            System.out.println(value);
        }



    }
}
