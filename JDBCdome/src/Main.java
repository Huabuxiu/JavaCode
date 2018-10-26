import Hello.MethodClass;

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
        MethodClass.list(start,count);

    }
}
