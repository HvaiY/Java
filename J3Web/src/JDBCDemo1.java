

import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDBCDemo1 {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        DriverManager.registerDriver(new Driver());
        // 2.获取连接对象
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "hai");
        //测试是否连接成功
        //    System.out.print(con);
        //3.通过连接对象获取操作SQL语句的Statement
        Statement st = con.createStatement();
        //4,需要执行的sql
        String sql = "select * from User";
        //5.执行 并返回 ResultSet
        ResultSet rs = st.executeQuery(sql);
        // 遍历
        while (rs.next()) {
            System.out.print(rs.getInt(1) + "   ");
            System.out.print(rs.getString(2) + "   ");
            System.out.print(rs.getString(3) + "   ");

            System.out.print(rs.getInt("id") + "   ");
            System.out.print(rs.getString("username") + "   ");
            System.out.print(rs.getString("paddword") + "   ");
            System.out.print(rs.getString("email"));
            System.out.println();
        }

        // 6.释放资源
        rs.close();
        st.close();
        con.close();

    }
}
