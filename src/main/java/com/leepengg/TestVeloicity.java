package com.leepengg;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.jooq.util.derby.sys.Sys;

import java.io.StringWriter;

/**
 * Created by peng on 7/16/15.
 */
public class TestVeloicity {
    public static void main(String[] argv) {

        VelocityContext context = new VelocityContext();
        context.put("test", "://hello.world");

        StringWriter stringWriter = new StringWriter();

        Velocity.evaluate(context, stringWriter, "coupon", "#if($test.contains(\"http\"))\n" +
                "hello\n" +
                "#else\n" +
                "world\n" +
                "#end");

        System.out.println(stringWriter.toString());
    }
}
