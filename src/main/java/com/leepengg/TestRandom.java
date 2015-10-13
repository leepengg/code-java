package com.leepengg;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * Created by peng on 8/25/15.
 */
public class TestRandom {

    public static void main(String[] args) {

        Random random = new Random(100);

        int total = 0;
        int n = 10;

        long amount = 1000000;

        List<Integer> list = Lists.newArrayList();

        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(n));
        }

        for (Integer integer : list) {
            System.out.println(integer);
            total += integer;
        }
        System.out.println(total);

    }
}
