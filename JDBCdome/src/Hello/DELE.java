package Hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @program: JDBCdome
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-23 19:42
 **/
public class DELE {

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
        try (
                Connection c = DriverManager.getConnection(URL, USER_NAME,PASSWORD);
                Statement s = c.createStatement();
                ) {
            String SQL = "DELETE FROM hero WHERE id=5";
            s.execute(SQL);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
