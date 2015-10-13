package com.leepengg;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Created by peng on 9/22/15.
 */

class Param {
    List<String> params;
}

public class TestJson {

    static String param = "[8615899098788, 18676766875]";

    public static void main(String[] args) {

        List<String> list = JSON.parseArray(param, String.class);

        for (String s : list) {
            System.out.println(s);
        }
    }


}
