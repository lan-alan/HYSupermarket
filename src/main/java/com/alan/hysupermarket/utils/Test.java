package com.alan.hysupermarket.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Test {

    public static void main(String[] args) {
        String DRIVER;
        String URL;
        String USER;
        String PASSWORD;
        Connection connection = null;
        //Properties properties = new Properties();
        //InputStream inputStream = ConnectionFactory.class.getResourceAsStream("jdbcinfo.properties");
        try {
            //properties.load(inputStream);
            DRIVER = "oracle.jdbc.driver.OracleDriver";
            URL = "jdbc:oracle:thin:@localhost:1521:XE";
            USER = "hysupermarket";
            PASSWORD = "123456";
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("加载驱动成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(connection);
    }

}
