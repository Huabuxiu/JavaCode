package com.itcast.mybatis.dao;

import com.itcast.mybatis.po.orderscustom;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class ordersCustomMapperTest {

    private SqlSessionFactory sqlSessionFactory;

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
    public void findOrdersUser() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建mapper代理对象
        ordersCustomMapper ordersCustomMapper = sqlSession.getMapper(ordersCustomMapper.class);
        //调用mapper方法
        List<orderscustom> list  = ordersCustomMapper.findOrdersUser();

        System.out.println(list);

        sqlSession.close();

    }
}