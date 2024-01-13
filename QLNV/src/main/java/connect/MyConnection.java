package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    private String dbURL = "jdbc:mysql://localhost:3306/java-swing-qlnv-2024-01";
    private String userName = "root";
    private String password = "";
    private Connection conn = null;

    public Connection getConnection() {
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
