package com.itcast.mybatis.dao;

import com.itcast.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

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

//       User user =  findUserById();

//        System.out.println(user);

        User user = new User("计算机科学的帅哥",new Date(),"1","陕西西安");
        user.setId(21);
//        user.setBirthday(null);
//        insertUser(user);
//        updateUser(user);
          deleteById(user);
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
        User user;
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        user = userMapper.findUserById(1);
        sqlSession.commit();
        sqlSession.close();
        return user;
    }


    public static void insertUser(User user){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.insertUser(user);
        //千万不能忘了提交
        sqlSession.commit();
        sqlSession.close();
    }

    public static void updateUser(User user){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(user);

        sqlSession.commit();
        sqlSession.close();
    }

    public static void deleteById(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteById(user);

        sqlSession.commit();
        sqlSession.close();
    }
}
