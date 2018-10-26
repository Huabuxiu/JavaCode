package Hello;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: JDBCdome
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-23 22:07
 **/
public class count {
    public static void main(String[] args) {
        try (
                Connection c = Conn.GetConnect();
                Statement s = c.createStatement();
                ) {
            String sql = "select count(*) from hero";
            ResultSet rs = s.executeQuery(sql);
            int total = 0;
            while (rs.next())
            {
                total = rs.getInt(1);
            }
            System.out.println("总共有"+total+"条数据");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
