
package connect;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestConnecttion {

    public static void main(String[] args) {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/java-swing-qlnv-2024-01";
            String userName = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, userName, password);
            if (conn != null) {
                System.out.println("Kết nối thành công");
            }else{
                System.out.println("Kết nối thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
