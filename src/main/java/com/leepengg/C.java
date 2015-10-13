package com.leepengg;

import java.lang.reflect.ParameterizedType;

/**
 * Created by peng on 7/1/15.
 */
public class C {
    private B b = A.getInstance();

    public static void main(String argv[]) {

        B bb = new B<String>();

        System.out.println(bb.getClass().getTypeParameters()[0].getName());
        System.out.println(bb.getClass().getTypeParameters()[0].getBounds().length);
        System.out.println(((ParameterizedType) bb.getClass().getGenericSuperclass()).getActualTypeArguments()[0].getClass().getName());


        //B b;
        A a;
        C c = new C();
        c.b.sayB();
    }
}
