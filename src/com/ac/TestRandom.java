package com.ac;

import java.util.Random;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestRandom {
    public static void main(String[] args) {
        // 产生随机数的类
        Random random = new Random();
        // 返回的值是在 [0, 30)
        int i = random.nextInt(100);
        System.out.println(i);
    }
}
