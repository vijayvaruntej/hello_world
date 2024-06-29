package com.trainingmug.java.features.encapsulation.p2;

import com.trainingmug.java.features.encapsulation.p1.A;

public class Y extends A {
    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println(a.x);
        //System.out.println(a.y);
        //System.out.println(a.z);
        Y y = new Y();
        System.out.println(y.value);
    }
}
