package com.ac.array;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestVarargs {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(2));
        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 5));
        System.out.println(add(5, 10, 5, 10));
        System.out.println(add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));

        // 可变参数的两个规则：
        // 1. 可变参数可以兼容数组参数，但数组参数无法兼容可变参数。
        //  也就是说，可以将数组传给可变参数，但是不能将可变参数传递给数组
        int[] arr = new int[]{1, 2, 3};
        add(arr);

        // 2. 一个方法只能有一个可变长参数，并且这个可变长参数必须是该方法的最后一个参数
    }

    private static int add(int... args) { // 变长参数
        int sum = 0;
        for (int a: args) {
            sum += a;
        }
        return sum;
    }

}
