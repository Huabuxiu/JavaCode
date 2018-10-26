package Hello;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @program: JDBCdome
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-25 22:29
 **/
public class HeroTest {
    public static Hero get(int id) {
        /**
         * @Description: 根据id查询一个英雄返回一个对象
         * @Param: [id]
         * @return: Hello.Hero
         * @Author: Huabuxiu
         * @Date: 2018/10/25
         */

        Hero hero = null;
        try (
                Connection c = Conn.GetConnect();
                Statement s = c.createStatement();
        ) {
            String sql = "select * from hero where id = " + id;
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                hero = new Hero();
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);

                hero.damage = damage;
                hero.hp = hp;
                hero.name = name;
                hero.id = id;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hero;
    }

    public static void add(Hero h) {
        /**
         * @Description: 增加一条数据的对象封装。
         * @Param: [h]
         * @return: void
         * @Author: Huabuxiu
         * @Date: 2018/10/25
         */
        String sql = "insert into hero values(?,?,?,?)";
        try (
                Connection c = Conn.GetConnect();
                Statement s = c.createStatement();
                PreparedStatement ps = c.prepareStatement(sql);
        ) {
            String name = h.name;
            int id = h.id;
            float hp = h.hp;
            int damage = h.damage;

            //设置参数
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setFloat(3, hp);
            ps.setInt(4, damage);

            //执行sql
            ps.execute();
            System.out.println("增加成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Hero h) {
        /**
        * @Description: 删除一个Hero对象
        * @Param: [h]
        * @return: void
        * @Author: Huabuxiu
        * @Date: 2018/10/26
        */


        try (
                Connection c = Conn.GetConnect();
                Statement s = c.createStatement();
        ) {
            String name = h.name;
            int id = h.id;
            float hp = h.hp;
            int damage = h.damage;

            String sql = "DELETE from hero where id ="+id;
            s.execute(sql);
            System.out.println("删除成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void update(Hero h)
                /** 
                * @Description:更新一个Hero对象
                * @Param: [h] 
                * @return: void 
                * @Author: Huabuxiu 
                * @Date: 2018/10/26 
                */ 
    {
        String name = h.name;
        int id = h.id;
        float hp = h.hp;
        int damage = h.damage;
        String SQL = "update hero  set name = ?,hp = ?,damage = ? where id ="+id;
        try (
                Connection c = Conn.GetConnect();
                Statement s = c.createStatement();
                PreparedStatement ps = c.prepareStatement(SQL);
        ) {

            ps.setInt(3,damage);
            ps.setFloat(2,hp);
            ps.setString(1,name);
            ps.execute();
            System.out.println("更新成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static List<Hero> list()
    {
        /**
        * @Description: 查询所有数据作为一个列表返回
        * @Param: []
        * @return: java.util.List<Hello.Hero>
        * @Author: Huabuxiu
        * @Date: 2018/10/26
        */
        List<Hero> res=null;
        res = new ArrayList<>();

        String sql = "select * from hero";
        try(
                Connection c = Conn.GetConnect();
                PreparedStatement ps = c.prepareStatement(sql);
                ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                String name = rs.getString("name");
                int id = rs.getInt(1);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                Hero h = new Hero(id,name,hp,damage);
                res.add(h);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }


        public static void main (String[]args){
            //Hero h = new Hero(106, "后羿", 103, 300);
           // add(h);
            //delete(h);
            //h.hp = 203;
            //update(h);

            List<Hero> heroList = list();
            System.out.printf("id\tname\thp\tdamage\n");
            for (Hero heros:
                 heroList)
            {
                System.out.printf("%d\t%s\t%.1f\t%d\n",heros.id,
                        heros.name,heros.hp,heros.damage);
            }
        }

    }

