import org.junit.Test;

import java.sql.*;

public class JDBCDemo3 {
    // 对异常处理
    // Idea  快捷键 https://www.cnblogs.com/zhangpengshou/p/5366413.html
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "hai");
            st = conn.createStatement();
            String sql = "select * from User";

            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("username") + "  " + rs.getString("email"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void UpdateTest() {
        try {
            Connection conn = jdbcUtils.getConnection();
            Statement st = conn.createStatement();
            int n = st.executeUpdate("update user set email='188@123.com' where id=1");
            if (n > 0) {
                System.out.print("修改成功");
            }
            conn.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
