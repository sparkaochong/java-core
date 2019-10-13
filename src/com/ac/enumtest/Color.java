package com.ac.enumtest;

// 一个枚举类实际上是 java.lang.Enum 的子类
/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public enum Color {
    // 枚举类中的定义表示一个对象，对象的类型都是 Color
    // 枚举对象的定义必须放在枚举类开始的位置
    RED("Red", "红色"),
    GREEN("Green", "绿色"),
    BLUE("Blue", "蓝色");

    private String name;
    private String cnName; // 中文名字

    private Color(String name, String cnName) { // 枚举类的构造方法必须是 private
        this.name = name;
        this.cnName = cnName;
    }

    public String getName() {
        return name;
    }

    public String getCnName() {
        return cnName;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", cnName='" + cnName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Color c = Color.BLUE;
        System.out.println(c.ordinal()); // 枚举对象在枚举类中定义的位置
        System.out.println(c); // 枚举对象的名字
        System.out.println(c.getName());

        System.out.println("------------------------");

        Color[] colors = Color.values(); // 得到所有的枚举对象
        for (Color color : colors) {
            System.out.println(color.ordinal()); // 枚举对象在枚举类中定义的位置
            System.out.println(color.name()); // 枚举对象的名字
            System.out.println(color.getName());
        }
    }
}
