import Hello.MethodClass;

import java.util.Date;

public class Main {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    //数据库连接地址
    private static final String URL = "jdbc:mysql://localhost:3306/EMP";
    //用户名
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
//测试分页查询
        int start = 0;
        int count = 5;
        //MethodClass.list(start,count);

        Date time = new Date();

        //这里是运行时间
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date timeNow = new Date();
        System.out.printf(String.valueOf(timeNow.compareTo(time))+"s");

    }
}
