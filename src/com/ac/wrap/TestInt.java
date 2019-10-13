package com.ac.wrap;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestInt {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        System.out.println(i.intValue());

        // 10 + 20
        Integer result = i + Integer.valueOf(20); // 先将 i 自动拆箱成基本类型，然后将 new Integer(20) 自动拆箱成基本类型
        System.out.println(result.intValue());
    }
}
