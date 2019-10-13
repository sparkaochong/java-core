package com.ac.array;

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
        int[] data = new int[]{200, 32, 2, 4, 7};

        int target = 5;
        boolean isExist = isExist(data, target);

        if (isExist) {
            System.out.println("存在");
        } else {
            System.out.println("不存在");
        }
    }

    /**
     *  判断一个数字是否在一个数组中
     * @param data  数组
     * @param target    需要判断的数字
     * @return  true 表示存在，false 表示不存在
     */
    private static boolean isExist(int[] data, int target) {
        // 判断数组 data 中是否存在 target 这个数字
        // 循环遍历数组中的每一个元素，将每一个元素和 target 进行比较
        for (int ele : data) {
            // 判断每一个元素是否等于 target
            if (ele == target) {
                // 如果存在的话，那么直接返回
                return true;
            }
        }
        // 否在返回 false
        return false;
    }
}
