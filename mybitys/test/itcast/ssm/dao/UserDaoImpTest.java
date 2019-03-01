package itcast.ssm.dao;

import itcast.ssm.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImpTest {
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
    }

    @Test
    public void findUserById() {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        try {
            User user = userDao.findUserById(1);
            System.out.println(user);
        }catch (Exception e)
        {
            e.printStackTrace();
        }



    }
}