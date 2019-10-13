package com.ac.array;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestArrayOp {
    public static void main(String[] args) {
        int[] src = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] dest = insertElement(src, 3, 56);
        for (int i : dest) {
            System.out.print(i + "、");
        }
        System.out.println();
        System.out.println("---------------------------");
        dest = removeElement(src, 3);
        for (int i : dest) {
            System.out.print(i + "、");
        }

        // 总结一下：
        // 1. 不管是数组的插入操作还是删除操作，都需要申请额外的内存空间，这样的话，耗费了内存
        // 2. 不管是数组的插入操作还是删除操作，都有两次数组拷贝的操作，耗费了 CPU 时间
        // 不管是数组的插入操作还是删除操作，实际上都是非常慢的操作，我们不建议这么做
        // 优点：可以高效随机访问
        // 缺点：数组中元素的插入和删除动作非常的慢
        // 原因 -> 数组是一块连续的内存空间
    }

    /**
     *  往一个数组中的指定位置插入一个元素
     * @param src   需要插入数据的数组
     * @param index 插入的位置
     * @param element 插入的元素的值
     * @return 含有插入元素的数组
     */
    private static int[] insertElement(int[] src, int index, int element) {
        // 1. 创建一个新的数组对象，这个数组的大小是 src 数组的大小加 1
        int[] dest = new int[src.length + 1];
        // 2. 将原始数组中的前 index 个元素拷贝到新数组的前 index 个元素中
        System.arraycopy(src, 0, dest, 0, index);
        // 3. 将新数组中下标为 index 的元素的值设置为将要插入的元素
        dest[index] = element;
        // 4. 将原始数组中剩下的元素拷贝到新数组中剩下的位置
        System.arraycopy(src, index, dest, index + 1, src.length - index);

        return dest;
    }

    /**
     * 从数组中删除指定位置的元素
     * @param src   数组
     * @param index 指定的位置
     * @return 删除元素之后的数组
     */
    private static int[] removeElement(int[] src, int index) {
        // 1. 创建一个新的数组，数组的长度是原始数组的长度减 1
        int[] dest = new int[src.length - 1];
        // 2. 将要删除的元素之前的元素拷贝到新数组中
        System.arraycopy(src, 0, dest, 0, index);
        // 3. 将原始数组中除了需要删除的元素之外的元素拷贝到新数组中
        System.arraycopy(src, index + 1, dest, index, src.length - index - 1);

        return dest;
    }
}
