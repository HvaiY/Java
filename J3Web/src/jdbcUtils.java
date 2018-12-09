import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class jdbcUtils {

    private static final String DRIVERCLASS;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static{
        // 读取jdbc 配置文件  获取配置
        DRIVERCLASS= ResourceBundle.getBundle("jdbc").getString("driverClass");
        URL=ResourceBundle.getBundle("jdbc").getString("url");
        USERNAME=ResourceBundle.getBundle("jdbc").getString("username");
        PASSWORD=ResourceBundle.getBundle("jdbc").getString("password");
    }
    static {
        try{
            //放在静态代码块中  只执行一次
            Class.forName(DRIVERCLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws  SQLException {
      //  Class.forName("com.mysql.jdbc.Driver");
    // return   DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","hai");
        return   DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}
