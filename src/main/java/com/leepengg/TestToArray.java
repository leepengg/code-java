package com.leepengg;

import java.util.Set;

import com.google.common.collect.Sets;

/**
 * Created by peng on 14-12-29.
 */
public class TestToArray {

    /**
     * @param args *
     */
    public static void main(String[] args) {

        Set<Long> set = Sets.newHashSet();

        set.add(100000l);


        System.out.println(set.contains(100000l));

        System.out.println(System.currentTimeMillis());


    }

    /**
     * @param a
     * @param b
     * @return
     */
    public int test(int a, int b) {

        return 1;
    }
}
