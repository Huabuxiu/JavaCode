package com.mybatistest;

import java.sql.*;

/**
 * @program: mybitys
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-05 20:35
 **/
public class mybatistest {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    //数据库连接地址
    private static final String URL = "jdbc:mysql://localhost:3306/mybatis";
    //用户名
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
        try
        {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "select * from user where username = ?";
//        System.out.printf("1");
        //4、获取预处理statement



        try(
                Connection connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
                PreparedStatement ps  = connection.prepareStatement(sql);
        ) {

            ps.setString(1,"王五");
            ResultSet rs = ps.executeQuery();
//            System.out.println("1");
            while (rs.next())
            {
                System.out.println(rs.getString("id")+rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
