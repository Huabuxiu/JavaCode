package Hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.*;

/**
 * @program: JDBCdome
 * @description: jdbc  connect
 * @author: Huabuxiu
 * @create: 2018-10-23 18:47
 **/
public class Conn {
    //数据库连接地址
    private static final String URL = "jdbc:mysql://localhost:3306/how2java";
    //用户名
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "123456";


    public static Connection GetConnect() {
        /**
    * @Description:获得数据库连接
    * @Param: []
    * @return: java.sql.Connection
    * @Author: Huabuxiu
    * @Date: 2018/10/23
    */
        try {
            forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection c = null;
        try {
            //连接数据库
            c = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }


    public static void close(Connection con)
    {  /**
    * @Description:  关闭数据库连接
    * @Param: [con]
    * @return: void
    * @Author: Huabuxiu
    * @Date: 2018/10/23
    */
        try{
            if(con != null)
            {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
