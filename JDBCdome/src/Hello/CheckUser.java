package Hello;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @program: JDBCdome
 * @description: checkuser test
 * @author: Huabuxiu
 * @create: 2018-10-23 21:46
 **/
public class CheckUser {
    public static void main(String[] args) {
        try(
                Connection c = Conn.GetConnect();
                Statement s = c.createStatement();
                ) {
            Scanner in = new Scanner(System.in);
            System.out.print("输入用户名：");
            String name = in.nextLine();
            System.out.print("输入密码：");
            String passwd = in.nextLine();
            //查询数据库
            String sql = "select * from user where name= '"+name+"' " +
                    "and password = '"+passwd+"'";
            ResultSet rs = s.executeQuery(sql);
            if (rs.next())
            {
                System.out.println("账号密码正确");
            }else
            {
                System.out.println("账号密码错误");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
