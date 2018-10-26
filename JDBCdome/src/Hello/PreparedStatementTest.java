package Hello;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

/**
 * @program: JDBCdome
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-25 15:47
 **/
public class PreparedStatementTest {
    public static void main(String[] args) {
        String sql = "insert into hero values (null,?,?,?)";
        try (
                Connection c = Conn.GetConnect();
                PreparedStatement ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ) {
            ps.setString(1,"盖伦");
            ps.setFloat(2,616);
            ps.setInt(3,100);
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next())
            {
                int id = rs.getInt(1);
                System.out.println(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
