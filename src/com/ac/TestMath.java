package com.ac;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestMath {
    public static void main(String[] args) {
        double i = Math.pow(2, 10);
        System.out.println(i);

        int max = Math.min(10, 20);
        System.out.println(max);

        System.out.println(Math.E);
        System.out.println(Math.PI);

        // round
        // 当正数的时候，如果小数大于等于 0.5 的话，那么就入
        // 当小数的时候，如果小数大于 0.5 的话，那么就入
        System.out.println(Math.round(15.5));   // 输出 16
        System.out.println(Math.round(15.51));  // 输出 16
        System.out.println(Math.round(15.6));   // 输出 16
        System.out.println(Math.round(15.2356)); // 输出 15
        // 如果对负数进行四舍五入的话，当负数的小数等于 0.5 的时候，这个时候是舍
        System.out.println(Math.round(-15.5));  // 输出 -15
        System.out.println(Math.round(-15.51));  // 输出 -16
        System.out.println(Math.round(-15.6));   // 输出 -16
    }
}
