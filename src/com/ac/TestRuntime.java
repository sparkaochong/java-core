package com.ac;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestRuntime {
    public static void main(String[] args) {
        // 获取一个 Runtime 对象
        Runtime runtime = Runtime.getRuntime();

        // JVM 最大内存
        System.out.println(runtime.maxMemory());

        // JVM 总内存
        System.out.println(runtime.totalMemory());

        // JVM 空闲的内存
        System.out.println(runtime.freeMemory());

        // 单位是 字节
    }
}
