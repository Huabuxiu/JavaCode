package Hello;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: JDBCdome
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-25 20:11
 **/
public class testJDBC {
    public static void main(String[] args) {
         try(
                 Connection c = Conn.GetConnect();
                 Statement s = c.createStatement();
                 ) {
             //没有事务的前提下
             //假设业务操作时，加血，减血各做一次
             //结束后，英雄的血量不变
             c.setAutoCommit(false);

             //加血的SQL
             String sql1 = "update hero set hp = hp +1 where id = 22";
             s.execute(sql1);

             //减血的SQL
             //不小心写错写成了 updata(而非update)

             String sql2 = "update hero set hp = hp -1 where id = 22";
             s.execute(sql2);
             c.commit();
         } catch (SQLException e) {
             e.printStackTrace();
         }
    }
}
