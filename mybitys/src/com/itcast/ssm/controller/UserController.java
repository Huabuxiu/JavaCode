package itcast.ssm.controller;




import itcast.ssm.dao.UserDao;
import itcast.ssm.po.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: springmvc
 * @description:
 * @author: Huabuxiu
 * @create: 2019-02-25 11:19
 **/

@org.springframework.stereotype.Controller
public class UserController implements Controller {


    private ApplicationContext applicationContext;

    @RequestMapping("/queryUser")
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        applicationContext = new ClassPathXmlApplicationContext("spring-config/spring-mybatis.xml");

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user =  userDao.findUserById(1);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);

        modelAndView.setViewName("WEB-INF/jsp/Users/usersList.jsp");

        return modelAndView;
    }
}
