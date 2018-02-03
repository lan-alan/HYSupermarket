package com.alan.hysupermarket.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

    private static String DRIVER;
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    static {
        Properties properties = new Properties();
        InputStream inputStream = ConnectionFactory.class.getResourceAsStream("jdbcinfo.properties");
        try {

            System.out.println("1111");
            properties.load(inputStream);
            DRIVER = properties.getProperty("oracle.driver");
            URL = properties.getProperty("oracle.url");
            USER = properties.getProperty("oracle.user");
            PASSWORD = properties.getProperty("oracle.password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("加载驱动成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        System.out.println("你好！");
        System.out.println(ConnectionFactory.getConnection());
    }

}
