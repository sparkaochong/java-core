package com.ac.string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestStringByte {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Hello";
        // 将字符串转成字节
        byte[] bytes = str.getBytes();
        System.out.println(bytes.length);
        for (byte b : bytes) {
            System.out.print(b + "、");
        }
        System.out.println();
        // byte 类型的数组 -> String
        String str2 = new String(bytes);
        System.out.println(str2);

        // 编码的问题
        // 默认的编码
        System.out.println(Charset.defaultCharset()); // 默认编码是 UTF-8
        String s = "严";
        bytes = s.getBytes();
        System.out.println(bytes.length); // 一个汉字在 UTF-8 编码下，使用 3 个字节来存储

        bytes = s.getBytes("GBK");
        System.out.println(bytes.length); // 一个汉字在 GBK 编码下，使用 2 个字节来存储

        // 对于中文，解码和编码需要保持一致，要不然会出现乱码
        String s1 = "你好";
        bytes = s1.getBytes("UTF-8"); // 解码的时候使用 GBK
        String s2 = new String(bytes, "GBK"); // 编码的时候使用 UTF-8
        System.out.println(s2);
    }
}
