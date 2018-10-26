package Hello;

import java.sql.*;


/**
 * @program: JDBCdome
 * @description: insert test
 * @author: Huabuxiu
 * @create: 2018-10-23 19:30
 **/
public class Insert {
    //数据库连接地址
    private static final String URL = "jdbc:mysql://localhost:3306/how2java";
    //用户名
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        try(
                Connection connection =DriverManager.getConnection(URL,USER_NAME,PASSWORD);
                Statement statement = connection.createStatement();
                ) {
            for(int i=0;i<100;i++)
            {
                String SQL= "insert into hero values(null,"+"\"英雄"+i+"\""+","
                        +(float)i*100+3+","+50+")";
                statement.execute(SQL);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
