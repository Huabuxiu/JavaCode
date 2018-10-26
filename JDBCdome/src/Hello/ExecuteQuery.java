package Hello;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: JDBCdome
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-23 21:32
 **/
public class ExecuteQuery {
    public static void main(String[] args) {
        try(
                Connection c = Conn.GetConnect();
                Statement s = c.createStatement();
                )
        {
            String sql = "select * from hero";
            ResultSet rs = s.executeQuery(sql);

            while(rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                System.out.printf("%d\t%s\t%.3f\t%d\n",id,name,hp,damage);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
