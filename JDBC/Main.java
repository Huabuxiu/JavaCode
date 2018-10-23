import java.sql.*;

public class Main {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    //数据库连接地址
    private static final String URL = "jdbc:mysql://localhost:3306/EMP";
    //用户名
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {

        Connection connection = null;
        try{
            Class.forName(DRIVER_NAME);
            connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            String Sql = "SELECT * FROM Employees";

            PreparedStatement prst = connection.prepareStatement(Sql);

            ResultSet rs = prst.executeQuery();
            while(rs.next())
            {
                System.out.println("用户名："+rs.getString("first"));
                System.out.println("ID："+rs.getString("id"));
            }
            rs.close();
            prst.close();

        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            if (connection !=null)
                try{
                    connection.close();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
        }


    }
}
