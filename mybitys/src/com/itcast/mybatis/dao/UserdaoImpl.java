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
 * @description: Dao接口实现类
 * @author: Huabuxiu
 * @create: 2018-11-13 19:50
 **/
public class UserdaoImpl implements UserDao{

    private  SqlSessionFactory sqlSessionFactory ;

    public UserdaoImpl(SqlSessionFactory sessionFactory) {
        this.sqlSessionFactory = sessionFactory;
    }

    @Override
    public User findUserById(int id) {
        User user = null;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        user =  sqlSession.selectOne("test.findUserById",id);
        //提交session
        sqlSession.commit();
        sqlSession.close();
        return user;
    }

    @Override
    public void insertUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //插入
        sqlSession.insert("test.insertUser",user);
        //提交session
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //删除
        sqlSession.insert("test.deleteById",user);
        //提交session
        sqlSession.commit();
        sqlSession.close();

    }
}
