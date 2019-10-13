package com.ac;

import java.util.Calendar;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 可以设置任意时间
        calendar.set(2008, 8, 8);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));

        // 当然，我们也可以单独设置一个时间，比如设置年为 2012
        calendar.set(Calendar.YEAR, 2012);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));

        // 设置月
        // 设置 1 月份
        calendar.set(Calendar.MONTH, 0);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
    }

    private static int lastDayOfAMonth(Calendar calendar, int month) {
        // 先求出指定月份 + 1 的第一天，然后减去 1，就得到指定月份的最后一天
        calendar.set(calendar.get(Calendar.YEAR), month, 1);
        calendar.add(Calendar.DATE, -1);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }
}
