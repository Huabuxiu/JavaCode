package Hello;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: JDBCdome
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-27 15:21
 **/
public class ConnectionPoolTest {
    public static void main(String[] args) {
        ConnectionPool cp = new ConnectionPool(3);
        for (int i =0; i<100; i++)
        {
            new WorkingThread( cp,"Working Thread "+i).start();
        }
    }
}

class WorkingThread extends Thread{
    private ConnectionPool cp;
    public WorkingThread(ConnectionPool cp,String name) {
        super(name);
        this.cp = cp;
    }

    @Override
    public void run() {
        Connection c = cp.getConnection();
        System.out.println(this.getName()+":\t获取了一根连接，并开始工作");
        try(
                Statement s = c.createStatement();
                ) {
            //执行一秒的SQL语句
            Thread.sleep(1000);
            s.execute("select * from hero;");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cp.returnConnection(c);
    }
}
