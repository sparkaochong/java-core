package com.ac.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class FirstPractice {
    public static void main(String[] args) {
        // 练习一：匹配任意多个任意字符  (.*)
        // 练习二：判断字符串是否匹配 年-月-日 时:分:秒.毫秒 的形式，比如：1998-02-03 10:21:09.100
        //     \\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}
        // 练习三：一个字符串只能由字母、数字、_ 组成，其长度只能是 6~15 位
        //      \\w{6,15}
        // 练习四：验证一个字符串是否是小数(需要兼容整数)
        //      \\d+(\\.\\d+)?
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher("10");
        boolean isFound = false;
        while (matcher.find()) {
            System.out.println("找到的字符串是：" + matcher.group() +
                    "，开始的下标位置是：" + matcher.start() +
                    "，结束的下标位置是：" + matcher.end());
            isFound = true;
        }

        if (!isFound) {
            System.out.println("无法成功匹配！！！");
        }
    }
}
