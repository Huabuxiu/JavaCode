package itcast.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserMapperTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
    }

    @Test
    public void selectByPrimaryKey() {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        com.itcast.pojo.User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }
}