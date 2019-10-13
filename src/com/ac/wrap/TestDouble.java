package com.ac.wrap;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestDouble {
    public static void main(String[] args) {
        Double d = Double.valueOf(20.01); // 装箱
        double temp = d.doubleValue();

        System.out.println(d);
        System.out.println(temp);

        Double dou = 20.09;
        double t = Double.valueOf(20.08);
    }
}
