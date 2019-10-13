package com.ac.array;

import com.ac.Person;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class SecondPractice {
    public static void main(String[] args) {
        Person per1 = new Person("张三", 6);
        Person per2 = new Person("李四", 10);
        Person per3 = new Person("王五", 3);
        Person per4 = new Person("汤七", 8);
        Person per5 = new Person("钱八", 15);
        Person per6 = new Person("刘十", 12);

        Person[] personArr = new Person[] {per1, per2, per3, per4, per5, per6};
        PersonAgeStat result = statAge(personArr);
        System.out.println("最大的年龄是：" + result.getMaxAge());
        System.out.println("最小的年龄是：" + result.getMinAge());
        System.out.println("年龄总和是：" + result.getSumAge());
        System.out.println("年龄的平均值是：" + result.getAvgAge());

        // 可以写一个方法来代替四个方法，在这个方法里面只需要循环一次就可以求出 4 个指标
        // 需要解决的问题：这个方法需要返回多个值。我们可以使用数组来解决

        // 这种方式有两个缺点：
        // 1. 在使用返回数组的时候，你一定要清洗明白数组中每一个元素对应的含义
        // 2. 需要所有的返回值必须是相同类型的

        // 终极解决方案：使用面向对象的思想来解决
    }

    private static PersonAgeStat statAge(Person[] arr) {
        PersonAgeStat personAgeStat = new PersonAgeStat();
        personAgeStat.setMaxAge(arr[0].getAge());
        personAgeStat.setMinAge(arr[0].getAge());

        // 一次循环求出最大值、最小值以及总值三个指标的值
        for (Person person: arr) {
            if (person.getAge() > personAgeStat.getMaxAge()) { // 求最大值
                personAgeStat.setMaxAge(person.getAge());
            }

            if (person.getAge() < personAgeStat.getMinAge()) { // 求最小值
                personAgeStat.setMinAge(person.getAge());
            }

            personAgeStat.setSumAge(personAgeStat.getSumAge() + person.getAge()); // 求总值
        }
        personAgeStat.setAvgAge(personAgeStat.getSumAge() / arr.length); // 求平均值
        return personAgeStat;
    }

    /**
     *  求最大年龄
     * @param arr 所有的人
     * @return 最大的年龄
     */
    private static int maxAge(Person[] arr) {
        int max = arr[0].getAge(); // 将第一个人的年龄赋值给 max
        for (int index = 1; index < arr.length; index++) {
            Person currentPerson = arr[index]; // 当前的人对象
            if (currentPerson.getAge() > max) { // 如果遍历的当前人的年龄大于 max 的话
                max = currentPerson.getAge();   // 将当前人的年龄赋值给 max
            }
        }
        return max;
    }

    /**
     *  最小年龄
     * @param arr
      * @return
     */
    private static int minAge(Person[] arr) {
        int min = arr[0].getAge();
        for (int index = 1; index < arr.length; index++) {
            Person currentPerson = arr[index];
            if (currentPerson.getAge() < min) {
                min = currentPerson.getAge();
            }
        }
        return min;
    }

    /**
     *  求年龄总和
     * @param arr
     * @return
     */
    private static int sumAge(Person[] arr) {
        int sum = 0;
        for (Person person : arr) {
            sum += person.getAge();
        }
        return sum;
    }

    /**
     *  平均值
     * @param arr
     * @return
     */
    private static double avgAge(Person[] arr) {
        int totalAge = sumAge(arr);
        return totalAge / arr.length;
    }
}
