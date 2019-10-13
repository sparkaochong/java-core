package com.ac.object;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class TestGeneric {
    public static void main(String[] args) {
        Box<Object> box = new Box<Object>();
        // 可以往箱子中放人
        // box.setObject(new Student("张三", 20));
        // 可以往箱子中放字符串
        box.setObject(new Object());

        printObject(box);
    }

    // ？ 表示通配符，表示任意类型
    // Box 没有指定泛型的话，那么默认的类型是 Object
    // ? super String 表示只能是 String 类型或者是String类型的父类型
    // 下界，下界是 String 类型
    public static void printObject(Box<? super String> box) {
        System.out.println(box.getObject());
    }

    // 在方法中也可以定义泛型
    // 方法中使用 <A> 来定义泛型
    // 这个泛型可以在方法的返回值类型中用，可以在参数类型中用，更可以在方法体中使用
    public static <A> int getObject(int object) {
        A s = null;
        return 3;
    }

}
