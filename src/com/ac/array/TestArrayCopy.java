package com.ac.array;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestArrayCopy {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};

        // b -> a
        // 五个参数：
        // src: source的缩写，表示源数组，就是要拷贝的数组，b
        // srcPos：表示要拷贝的开始的数据的下标
        // dest：表示拷贝的目标数组，a
        // destPos：表示要拷贝到 dest 数组中第一个位置的下标
        // length: 表示要拷贝的元素的个数
        System.arraycopy(b, 5, a, 2,3); // 数组元素的拷贝
        for (int i : a) {
            System.out.print(i + "、");
        }
    }
}
