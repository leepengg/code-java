package com.leepengg;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");

        DateTime dt = new DateTime();
        StringBuilder sb = new StringBuilder();
        sb.append(dt.toString(fmt));

        System.out.println(sb.toString());
    }
}
