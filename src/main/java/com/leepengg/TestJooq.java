package com.leepengg;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.jooq.*;
import org.jooq.impl.DSL;

import javax.sql.DataSource;

import static org.jooq.util.maven.example.Tables.AUTHOR;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by peng on 6/23/15.
 */
public class TestJooq {
    public static void main(String[] argv) throws Exception {
        String userName = "kaopu";
        String password = "P@password";
        String url = "jdbc:mysql://10.11.255.106:3306/library";

        Properties properties = new Properties();

        URL file = TestJooq.class.getClassLoader().getResource("mysql.properties");

        InputStream in = null;
        try {
            in = file.openStream();
            properties.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataSource ds = (DruidDataSource) DruidDataSourceFactory
                .createDataSource(properties);

        Connection conn = DriverManager.getConnection(url, userName, password);

        DSLContext create = DSL.using(ds, SQLDialect.MYSQL);


        Result<Record> result = create.select().from(AUTHOR).fetch();

        for (Record r : result) {
            Integer id = r.getValue(AUTHOR.ID).intValue();
            String firstName = r.getValue(AUTHOR.FIRST_NAME);
            String lastName = r.getValue(AUTHOR.LAST_NAME);

            System.out.println("ID:" + id + " first name: " + firstName + " last name: " + lastName);

        }

    }
}
