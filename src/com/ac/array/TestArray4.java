package com.ac.array;

import java.math.BigInteger;
import java.util.Random;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestArray4 {
    public static void main(String[] args) {
        int[] data = new int[5];
        data[2] = 4;
        data[4] = 10;
        data[1] = 2;
        data[2] = 5;
        // 当我们创建数组对象的时候，数组中的每一个元素都有默认初始值，
        // 这个我们称之为数组的动态初始化

        // 静态初始化
        // 创建了一个数组对象，我们初始化了这个数组的每一个元素的值
        int[] array = {1, 3, 5, 6};
        System.out.println(array.length);
        for (int a : array) {
            System.out.println(a);
        }

        // 静态初始化，我们推荐使用这种方式
        // 数据类型[] 数组名称 = new 数据类型[]{值，值，值.....}
        boolean[] a = new boolean[]{true, false, false, true};

        BigInteger bigInteger = BigInteger.probablePrime(7, new Random());
        System.out.println(bigInteger);
    }
}
