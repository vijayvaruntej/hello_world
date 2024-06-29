package com.trainingmug.java.features.encapsulation.p1;

public class A {
    public int x = 100;
    private int y = 200;
    int z = 300;
    protected int value = 1000;

    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(a.z);
        System.out.println(a.value);
    }
}
