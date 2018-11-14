package com.itcast.mybatis.dao;

import com.itcast.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: mybitys
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-14 15:03
 **/
public class Daomain {

    private static SqlSessionFactory sqlSessionFactory;


    public static void main(String[] args) {
        try {
            setUp();
        } catch (IOException e) {
            e.printStackTrace();
        }

       User user =  findUserById();

        System.out.println(user);


    }

    public static void setUp() throws IOException {

        //初始化会话工厂
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = null;

        inputStream = Resources.getResourceAsStream(resource);
        //建立会话工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }


    public static User findUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        return userMapper.findUserById(1);


    }
}
