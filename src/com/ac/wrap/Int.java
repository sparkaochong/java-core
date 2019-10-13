package com.ac.wrap;

/**
 *  把基本类型中 int 类型包装成 Int 类
 */
public class Int {
    private int value;

    public Int(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Int add(Int i) {
        return new Int(i.getValue() + this.value);
    }
}
