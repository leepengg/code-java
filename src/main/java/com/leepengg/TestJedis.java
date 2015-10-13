package com.leepengg;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

/**
 * Created by peng on 8/26/15.
 */
public class TestJedis {
    public static void main(String[] argv) {

        Jedis jedis = new Jedis("10.11.255.106", 7979);

        Pipeline pipeline = jedis.pipelined();

        pipeline.set("test", "test");

        pipeline.sync();

        String result = jedis.get("test");

        System.out.println(result);

    }
}
