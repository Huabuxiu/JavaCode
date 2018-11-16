package com.itcast.mybatis.dao;

import com.itcast.mybatis.po.User;
import com.itcast.mybatis.po.UserCustom;
import com.itcast.mybatis.po.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    private  SqlSessionFactory sqlSessionFactory;
    @Before
    public void setup() throws IOException {
        //初始化会话工厂
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = null;

        inputStream = Resources.getResourceAsStream(resource);
        //建立会话工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserList() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        UserCustom userCustom = new UserCustom();
        userCustom.setSex("1");
        userCustom.setUsername("张");

        UserQueryVo userQueryVo  = new UserQueryVo(userCustom);
        List<UserCustom> list = userMapper.findUserList(userQueryVo);

        System.out.println(list);
    }

    @Test
    public void findUserCount() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        UserCustom userCustom = new UserCustom();
        userCustom.setSex("1");
        userCustom.setUsername("张");

        UserQueryVo userQueryVo  = new UserQueryVo(userCustom);
        int count = userMapper.findUserCount(userQueryVo);

        System.out.println(count);
    }
}