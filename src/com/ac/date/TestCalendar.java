package com.ac.date;

import java.util.Calendar;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestCalendar {
    public static void main(String[] args) {
        // java.util.Calendar 也是表示时间的类
        Calendar calendar = Calendar.getInstance(); // 创建一个 Calendar 对象，默认表示当前时间
        System.out.println(calendar);
        // 1. 获取时间(年、月、日、时、分、秒等)
        // 获取年
        int year = calendar.get(Calendar.YEAR);
        System.out.println("年是：" + year);
        // 获取月份
        // 月份的表示是 0 ~ 11。(0 表示 1 月份，1 表示 2 月份.....)
        int month = calendar.get(Calendar.MONTH);
        System.out.println("月份是：" + month);
        // 获取日
        int day = calendar.get(Calendar.DAY_OF_MONTH); // DATE 功能是一样
        System.out.println("日是：" + day);
        // 获取小时
        int hour = calendar.get(Calendar.HOUR); // 12小时制
        System.out.println("12小时制是：" + hour);
        hour = calendar.get(Calendar.HOUR_OF_DAY); // 24小时制
        System.out.println("24小时制是：" + hour);
        // 获取分钟
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println("分钟是：" + minute);
        // 获取秒
        int second = calendar.get(Calendar.SECOND);
        System.out.println("秒是：" + second);


        System.out.println("-------------------------------------");

        // 2. 设置时间
        calendar.set(2008, 8, 8);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));

        calendar.set(Calendar.YEAR, 1999);
        System.out.println(calendar.get(Calendar.YEAR));

        System.out.println("----------------------------------------------");

        // 3. 时间计算(相加或者相减)
        Calendar rightNow = Calendar.getInstance(); // 获取当前时间的对象
        // 得到明年的今天
        rightNow.add(Calendar.SECOND, 1);
        System.out.println(rightNow.get(Calendar.SECOND));

        // 拿到今年指定月份的最后一天
        System.out.println(lastDayOfAMonth(rightNow, 11));
    }

    private static int lastDayOfAMonth(Calendar calendar, int month) {
        calendar.set(Calendar.MONTH, month); // 设置为 6 月
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }


}
