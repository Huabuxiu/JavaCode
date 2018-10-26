package Class;

import java.lang.reflect.Method;

/**
 * @program: Experiment
 * @description: this is a test
 * @author: Huabuxiu
 * @create: 2018-10-22 16:59
 **/
public class ClassTest {

    public static void printClassMessage(Object obj)
    {
        /**
        * @Description: 输出类的信息
        * @Param: [obj]
        * @return: void
        * @Author: Huabuxiu
        * @Date: 2018/10/22
        */
        Class c = obj.getClass();
        System.out.println("类的名称是："+c.getName());
        Method[] ms = c.getMethods();

    }

}

