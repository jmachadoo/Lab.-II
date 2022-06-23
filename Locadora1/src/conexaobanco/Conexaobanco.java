package conexaobanco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexaobanco {
    static String url = "jdbc:mysql://localhost:3306/locadora";
    static String user = "root";
    static String password = "Root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

}