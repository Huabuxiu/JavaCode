package Hello;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * @program: JDBCdome
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-27 15:36
 **/
public class compareTest {
    public static void main(String[] args) {
        //ConnPollTest
        long start = System.currentTimeMillis();

        //这里是运行时间

        ConnectionPool cp = new ConnectionPool(10);
        for (int i =0;i<100;i++)
        {
            new ConnPool(cp).start();
        }

        long end = System.currentTimeMillis();
        System.out.printf("连接池运行了"+(end-start)+"毫秒");


        //OrdinaryConn

//        Date time2 = new Date();
//
        long start2 = System.currentTimeMillis();
        //这里是运行时间
        for (int i =99;i<200;i++)
        {
            new OrdinaryConn().start();
        }
        long end2 = System.currentTimeMillis();
        System.out.printf("普通运行了"+(end2-start2)+"毫秒");

    }



    static class OrdinaryConn extends Thread{

       // public String sql = "insert into hero values('null,"+"英雄"+num+","+(num*3+230)+",123')";
        @Override
        public void run() {

            try(
                    Connection c = Conn.GetConnect();
                    Statement s = c.createStatement();
                    ) {
                for (int i = 0 ; i<100 ; i++){
                    s.execute("select * from hero");
                }

                //System.out.println("执行了");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    static class ConnPool extends Thread{
        private ConnectionPool cp ;


        public ConnPool(ConnectionPool cp) {

            this.cp = cp;
        }

        @Override
        public void run() {
            Connection c = cp.getConnection();
//            System.out.printf(this.getName()+":\t获得了一个连接");
            try(
                    Statement s = c.createStatement()
            ) {
                for (int i = 0 ; i<100 ; i++){
                    s.execute("select * from hero");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            cp.returnConnection(c);
        }
    }
}
