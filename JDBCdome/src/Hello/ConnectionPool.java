package Hello;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: JDBCdome
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-27 15:08
 **/
public class ConnectionPool {
    List<Connection> cs = new ArrayList<>();

    int size;

    public ConnectionPool(int size) {
        this.size = size;
        init();
    }

    public void init() {
        /** 
        * @Description: 建立连接池
        * @Param: [] 
        * @return: void 
        * @Author: Huabuxiu
        * @Date: 2018/10/27 
        */ 
        for (int i = 0; i < size; i++) {
            Connection c = Conn.GetConnect();
            cs.add(c);
        }
    }

    public synchronized Connection getConnection(){
        /** 
        * @Description: 从连接池获取一个连接池 
        * @Param: [] 
        * @return: java.sql.Connection 
        * @Author: Huabuxiu 
        * @Date: 2018/10/27 
        */ 
        while (cs.isEmpty())
        {
            try{
                this.wait();
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        //从队列里面取出来一个
        Connection c = cs.remove(0);
        return c;
    }

    public synchronized void returnConnection(Connection c){
        /** 
        * @Description: 归还用完的连接到连接池 
        * @Param: [c] 
        * @return: void 
        * @Author: Huabuxiu 
        * @Date: 2018/10/27 
        */ 
        cs.add(c);
        this.notifyAll();
    }
}

