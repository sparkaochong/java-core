package com.ac.array;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestReference {
    public static void main(String[] args) {
        int[] data = new int[3];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;
        printArray(data); // 调用打印数组的方法

        doubleIncrement(data); // 将数组 data 中的元素值增大两倍

        System.out.println();
        System.out.println("--------------------------------");

        printArray(data);

        System.out.println();
        System.out.println("--------------------------------");
        // 把 data 的引用传递给 temp
        int[] temp = data;
        temp[0] = 100;

        printArray(temp);
    }

    /**
     *  打印一个给定的数组中所有的元素
     * @param arr   指定的数组
     */
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "、");
        }
    }

    public static void doubleIncrement(int[] array) {
        for (int index = 0; index < array.length; index++) {
            array[index] *= 2;
        }
    }
}
