

import java.sql.*;

public class JDBCDemo2_改进Demo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.注册驱动
        // DriverManager.registerDriver(new Driver());
        //DriverManager.registerDriver(new Driver()) 看源码发现 其实注册了两次
        //利用反射 拿到mySQL驱动  ，那么同样可以拿到Oracle 驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取连接对象
        // mysql url: jdbc:mysql://localhost:3306/数据库名称
        // Oracle url： jdbc:oracle:thin@localhost:1521:sid
        String url = "jdbc:mysql:///mydb"; //本地简写的成这个Url  这个url 后面可以有参数如 useUnicode=true&characterEncoding=UTF-8
        //Connection 是用来让程序与数据库进行连接的
        Connection con = DriverManager.getConnection(url, "root", "hai");
        //Connection 作用：
        //  1.获取操作sql 的tatement 对象
        // 获取预处理SQL的 preperStatement(sql) 对象
        // 获取执行存储过程的 CallableStatement(sql) 对象
        //  2.操作事务：setAutoCommit(boolean flag); 开启事务
        // commit() 提交事务 roolback() 回滚事务
        //测试是否连接成功
        //    System.out.print(con);
        //3.通过连接对象获取操作SQL语句的Statement
        Statement st = con.createStatement();
        //4,需要执行的sql
        //-------------执行sql
        String sql = "select * from User";
        //5.执行 并返回 ResultSet
        ResultSet rs = st.executeQuery(sql);

        /*
        //修改 返回值为int 返回值 判断非o 来判断执行结果
       int row =st.executeUpdate("update user set paddword='188'");
       System.out.println(row);
       */
        /*
        //批处理 添加到批处理
        st.addBatch("update user set paddword='166' where id='1'");
        st.addBatch("update user set paddword='199' where id='2'");
        // 批量执行
      int[] n=  st.executeBatch();
        //清空批处理
      for (int i: n){
       System.out.println(i);
        }
        st.clearBatch();
        */

        // 遍历
        while (rs.next()) {
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
