package com.itcast.mybatis.first.mybatis;

import com.itcast.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @program: mybitys
 * @description: 测试程序
 * @author: Huabuxiu
 * @create: 2018-11-05 22:03
 **/
public class MybatisFirst<sqlSession, fore> {
    public static void main(String[] args) throws IOException {

//        finduserbyid();
//        finduserbyname();
        User user = new User("李四",new Date(),"1","浙江温州");
        insertuser(user);
    }


    public static void insertuser(User user){
        String resource = "SqlMapConfig.xml";

        InputStream inputStream = null;

        try{
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //操作数据库

        sqlSession.insert("test.insertUser",user);

        //提交session
        sqlSession.commit();
        sqlSession.close();
    }

    public static void finduserbyid()
    {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //从工厂得到Sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过sqlsession操作数据库
        User user =  sqlSession.selectOne("test.findUserById",1);

        System.out.printf(String.valueOf(user));

        sqlSession.close();
    }

    public static void finduserbyname()
    {


    //从输入加载配置文件
        String resource = "SqlMapConfig.xml";
    //从配置文件创建会话工厂
    InputStream inputStream = null;

    {
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //从工厂获取会话
    SqlSession sqlSession = sessionFactory.openSession();
    //通过sqlsession 操作数据库
    List<User> list = sqlSession.selectList("test.findUserByName","张");
        for (User user1 :
                list) {
            System.out.println(user1);
        }


    //处理获取的数据
    }

}
