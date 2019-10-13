package com.ac.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestDate {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // 表示时间的类 -> java.util.Date
        // 创建一个 java.util.Date 对象
        Date date = new Date(); // 表示当前时间
        System.out.println(date);

        // 1. Date 对象 --> 指定格式的字符串时间
        // 时间格式：2019-06-13 10:42:56， java.text.SimpleDateFormat 转换时间的格式
        // 先定义格式：
        // y --> 年
        // M --> 月
        // d --> 日
        // H --> 24小时制
        // h --> 12小时制
        // m --> 分钟
        // s --> 秒
        // S --> 毫秒
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);
        System.out.println(dateStr);

        // 2. 一定格式的字符串时间 --> Date 对象
        String str = "2019/06/13 10:42:56";
        Date d = null;
        try {
            // 转成 Date 类型的对象
            d = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);
        System.out.println("花了：" + (System.currentTimeMillis() - startTime) + " 毫秒");
    }
}
