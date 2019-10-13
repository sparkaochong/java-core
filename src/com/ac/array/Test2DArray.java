package com.ac.array;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class Test2DArray {
    public static void main(String[] args) {
        // 1. 定义一个二维数组：数据类型[][] 数组名称 = new 数据类型[row][column]
        int[][] arr = new int[5][4]; // 是一个 5 行 4 列的二维数组
        System.out.println(arr.length); // 表示行数

        // 给二维数组的元素赋值
        arr[1][2] = 4;
        arr[3][3] = 10;

        // 2. 遍历二维数组
        for (int row = 0; row < arr.length; row++) { // 遍历行
            int[] rowArr = arr[row]; // 表示每一行的数据，实际上是一个一维数组
            for (int column = 0; column < rowArr.length; column++) { // 遍历每一行中的元素
                System.out.print(arr[row][column] + "、");
            }
            System.out.println();
        }

        // 3. 二维数组的静态初始化
        // 二维数组中每一行的元素的个数可以不一样
        // 以下我们实际上定义了不规则的二维数组
        int[][] data = new int[][] {
                {2, 4, 7},
                {8},
                {10, 11, 23, 21, 11}
        };
        for (int[] row : data) { // 遍历行
            for (int element : row) { // 遍历列
                System.out.print(element + "、");
            }
            System.out.println(); // 换行符
        }
    }
}
