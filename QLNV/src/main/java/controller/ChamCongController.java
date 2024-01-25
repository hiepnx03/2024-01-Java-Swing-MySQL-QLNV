package controller;

import connect.MyConnection;
import model.Luong;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChamCongController {

//    public static List<Luong> getAllLuongData() {
//        List<Luong> luongList = new ArrayList<>();
//        Connection connection = MyConnection.getConnection();
//
//        if (connection == null) {
//            System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
//            return luongList;
//        }
//
//        try {
//            String sql = "SELECT nv.maNhanVien, nv.tenNhanVien, lc.chucVu, lc.luongCoBan, lc.soNgayLamViec " +
//                    "FROM NhanVien nv " +
//                    "INNER JOIN Luong lc ON nv.maNhanVien = lc.maNhanVien";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                int maNhanVien = resultSet.getInt("maNhanVien");
//                String tenNhanVien = resultSet.getString("tenNhanVien");
//                String chucVu = resultSet.getString("chucVu");
//                BigDecimal luongCoBan = resultSet.getBigDecimal("luongCoBan");
//                int soNgayLamViec = resultSet.getInt("soNgayLamViec");
//
//                Luong luong = new Luong(maNhanVien, tenNhanVien, chucVu, luongCoBan, soNgayLamViec);
//                luongList.add(luong);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return luongList;
//    }


}
