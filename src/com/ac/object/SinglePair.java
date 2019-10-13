package com.ac.object;

public class SinglePair<F, S> implements Pair<F, S> {

    private F first;
    private S second;

    public SinglePair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public F getFirst() {
        return first;
    }

    @Override
    public S getSecond() {
        return second;
    }

    public static void main(String[] args) {
        SinglePair<String, String> pair = new SinglePair<>("first", "second");

        System.out.println(pair.getFirst());

        System.out.println(pair.getSecond());
    }

}
