package com.ac.object;

import com.ac.Person;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public class StringPersonPair implements Pair<String, Person> {
    private String first;
    private Person second;

    public StringPersonPair(String first, Person second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String getFirst() {
        return first;
    }

    @Override
    public Person getSecond() {
        return second;
    }

    public static void main(String[] args) {
        StringPersonPair pair = new StringPersonPair("str", new Person("张三", 30));

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
