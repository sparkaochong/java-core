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
public class TestRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w[a-zA-Z_0-9\\.]*@[a-zA-Z_0-9\\.]+\\.(com|cn|net)");
        Matcher matcher = pattern.matcher("_angwq_ok@gridsum.net");

        boolean isFound = false;
        // find()：判断在字符串中是否有子字符串匹配到了正则表达式
        while (matcher.find()) {
            // group()：返回在字符串中匹配到的子字符串
            // start()：得到匹配到的子字符串的开始下标值
            // end()：得到匹配到的子字符串的结束下标值
            System.out.println("找到的字符串是：" + matcher.group() +
                    "，开始的下标位置是：" + matcher.start() +
                    "，结束的下标位置是：" + matcher.end());
            isFound = true;
        }
        if (!isFound) {
            System.out.println("无法成功匹配!!!");
        }
    }

    /**
     * 判断一个字符串是否是数字
     * @param str
     * @return
     */
    private static boolean isNumber(String str) {
        // 使用正则表达式 "\d+" 来实现
        // 1. 我们需要把字符串类型的正则表达式编译成一个正则模式
        //Pattern pattern = Pattern.compile("\\d+"); // 得到一个正则模式， \d+ 就是一个正则表达式
        // 2. 使用这个正则模式去匹配指定的字符串，得到了一个匹配者
        //Matcher matcher = pattern.matcher(str); // 向上转型 String -> CharSequence
        // 3. 使用匹配者执行匹配
        //boolean isMatched = matcher.matches();
        boolean isMatched = Pattern.matches("\\d+", str);
        return isMatched;
    }
}
