package com.xiaoming.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

/**
 * @author xiaoming.dong
 * @create 2021-01-20 18:23
 */
public class JdbcUtils {

    public static DruidDataSource dataSource;


    static {
        try {
            InputStream jdbc = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");

            Properties properties = new Properties();
            properties.load(jdbc);
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnection(){
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return conn;
    }
    public static void close(Connection con){
        if (con != null) {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }
}
