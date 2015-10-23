package com.leepengg;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
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

        List<Long> longList = Lists.newArrayList();

        longList.add(1l);
        longList.add(2l);

        Long[] la = longList.toArray(new Long[0]);

        System.out.println(la.length);

        long m = 1000l;
        System.out.println(Math.round(m / 100.0 + 0.49));

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
