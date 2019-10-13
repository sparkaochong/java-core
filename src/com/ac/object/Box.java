package com.ac.object;

// ? extends 某类型，表示只能是这个类型或者这个类型的子类型
// 上界是 Person
public class Box<T> { // T 表示 Box 中存储的对象的类型
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
