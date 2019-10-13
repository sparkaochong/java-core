package com.ac.date;

import java.util.Date;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestTimestamp {
    public static void main(String[] args) {
        // 时间戳(timestamp):
        // 从格林威治时间1970年01月01日00时00分00秒(北京时间1970年01月01日08时00分00秒)起
        // 至现在的总毫秒数。这个时间戳我们一般使用 long 类型来表达
        // 时间戳是一个毫秒数
        Date rightNow = new Date();
        // 从 Date 对象中获取时间戳
        long timestamp = rightNow.getTime(); // 获取当前的时间戳
        System.out.println(timestamp);

        long currentTimestamp = System.currentTimeMillis(); // 获取当前的时间戳
        System.out.println(currentTimestamp);

        // 使用一个时间戳来创建一个 Date 对象
        Date d = new Date(1560395004450L);
        d.getYear();
        d.getMonth();
        d.getDay();
    }
}
