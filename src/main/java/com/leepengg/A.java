package com.leepengg;

import sun.security.jca.GetInstance;

/**
 * Created by peng on 7/1/15.
 */


public class A {
    private static B b;

    public static B getInstance() {
        return b;
    }

    static {
        System.out.println("init");
        b = new B();
    }

    public static void sayHello() {
        System.out.println(B.class.getTypeParameters());

    }
}
