package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    private static String dbURL = "jdbc:mysql://localhost:3306/java-swing-qlnv-2024-01";
    private static String userName = "root";
    private static String password = "";
    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            if (conn == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(dbURL, userName, password);
            }
        } catch (Exception e) {
            System.out.println("Hê Lô");
        }
        return conn;
    }
}
