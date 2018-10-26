package Hello;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static Hello.Conn.GetConnect;

/**
 * @program: JDBCdome
 * @description: methodtest
 * @author: Huabuxiu
 * @create: 2018-10-23 19:55
 **/
public class MethodClass {
    public static void exeSQL(String SQL)
    {
            /**
            * @Description: 执行一条SQL语句
            * @Param: [SQL]
            * @return: void
            * @Author: Huabuxiu
            * @Date: 2018/10/23
            */
        try (Connection c = GetConnect()) {
            Statement s = c.createStatement();
            s.execute(SQL);
           // System.out.println("sql执行成功");
            s.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void list(int start,int count)
    {
        /** 
        * @Description: 查询数据库列表实现分页显示
        * @Param: [start, count] 
        * @return: void 
        * @Author: Huabuxiu 
        * @Date: 2018/10/23 
        */
        try(
                Connection c = Conn.GetConnect();
                Statement s = c.createStatement();
                )
        {
            String sql = "select * from hero limit "+start+","+count;
            ResultSet rs = s.executeQuery(sql);
            System.out.printf("id\tname\thp\tdamage\n");
            while(rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                float hp = rs.getFloat(3);
                String damage = rs.getString("damage");
                System.out.printf("%d\t %s\t %.1f\t%s\n",id,name,hp,damage);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
