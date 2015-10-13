package com.leepengg;


import com.google.common.base.Charsets;

public class AppTest2 {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testMain() throws Exception {

        byte[] b1 = new byte[]{1, 2, 3, 4, 5, 6, 7};

        String s = new String(b1, Charsets.UTF_8);

        System.out.println(s);

        byte[] b2 = s.getBytes(Charsets.UTF_8);

        
    }
}