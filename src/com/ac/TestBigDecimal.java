package com.ac;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestBigDecimal {
    public static void main(String[] args) {
        // 基本类型中的 double、float 在进行计算的时候得不到精确值
        // 我们将 1.03 元 - 0.42 元
        BigDecimal b1 = new BigDecimal("1.03"); // String -> BigDecimal
        BigDecimal b2 = new BigDecimal("0.42"); // String -> BigDecimal
        BigDecimal result = b1.subtract(b2);
        System.out.println(result); // 0.61

        // 假设你有 1 元钱，买一张纸需要 0.1 元，你买了 9 张，那么需要找多少零钱给你呢？
        BigDecimal d1 = new BigDecimal("1.0");
        BigDecimal d2 = new BigDecimal("9");
        BigDecimal d3 = new BigDecimal("0.1");
        BigDecimal change = d1.subtract(d2.multiply(d3));
        // double change = 1.0 - 9 * 0.1;
        System.out.println(change); // 0.1

        // 假设现在有很多种的糖果，每一种的糖果价钱不一样，
        // 第一种糖果的价钱是 0.10 元、第二种糖果的价钱是 0.20 元、第三种糖果的价钱是 0.30 元、
        // 第四种糖果的价钱是 0.40 元、第五种糖果的价钱是 0.50 元、第六种糖果的价钱是 0.60 元 ......
        // 以此类推，一直到价钱为 1 元的糖果
        // 假设你身上有 1 元钱，你现在从第一种糖果开始买，一直往后面不同的种类的糖果买，
        // 那么：你最多可以买到多少个糖果呢？最后你剩的零钱是多少呢？
        long funds = 10;
        int candies = 0;
        for (long price = 1; funds >= price; price += 1) {
            funds -= price;
            candies++;
        }
        System.out.println("买了 ：" + candies + " 种糖果"); // 买了 ：4 种糖果
        System.out.println("余额：" + funds); // 余额：0.00

        // BigDecimal 除了解决精确计算的问题，还可以表达非常大的数字或者说小数位非常多的数字
        BigDecimal d = new BigDecimal("1.1222222111111111111111111"); // double 最大的小数位是 15
        System.out.println(d);

        BigDecimal dou = new BigDecimal("23222334444322111123434445553332211111333333333.0");
        System.out.println(dou);

        // int(整型)	32	-2147483648 ~ 2147483647
        BigInteger i = new BigInteger("-22344522223344");
        System.out.println(i);
    }
}
