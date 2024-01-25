package controller;

import connect.MyConnection;
import model.NhanVien;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhanVienController {
    public boolean addNhanVien(NhanVien nhanVien) {
        String sql = "INSERT INTO nhanvien (maNhanVien, tenNhanVien, diaChi, soDienThoai, gioiTinh, ngaySinh, ngayVaoLam, chucVu, chuThich) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = MyConnection.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setInt(1, nhanVien.getMaNhanVien()); // Sửa thành 1
            preparedStatement.setString(2, nhanVien.getTenNhanVien());
            preparedStatement.setString(3, nhanVien.getDiaChi());
            preparedStatement.setString(4, nhanVien.getSoDienThoai());
            preparedStatement.setString(5, nhanVien.getGioiTinh());
            preparedStatement.setDate(6, nhanVien.getNgaySinh());
            preparedStatement.setDate(7, nhanVien.getNgayVaoLam());
            preparedStatement.setString(8, nhanVien.getChucVu());
            preparedStatement.setString(9, nhanVien.getChuThich());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
    public boolean isMaNhanVienExists(int maNhanVien) {
        boolean exists = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Kết nối đến cơ sở dữ liệu
            connection = MyConnection.getConnection();

            // Truy vấn SQL kiểm tra sự tồn tại của MaNhanVien
            String query = "SELECT COUNT(*) FROM NhanVien WHERE MaNhanVien = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, maNhanVien);
            resultSet = preparedStatement.executeQuery();

            // Lấy kết quả
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                exists = (count > 0);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng tài nguyên
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return exists;
    }



    public boolean updateNhanVien(NhanVien nhanVien) {
        String sql = "UPDATE nhanvien SET tenNhanVien=?, diaChi=?, soDienThoai=?, gioiTinh=?, " +
                "ngaySinh=?, ngayVaoLam=?, chucVu=?, chuThich=? WHERE maNhanVien=?";

        try (Connection conn = MyConnection.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {

            preparedStatement.setString(1, nhanVien.getTenNhanVien());
            preparedStatement.setString(2, nhanVien.getDiaChi());
            preparedStatement.setString(3, nhanVien.getSoDienThoai());
            preparedStatement.setString(4, nhanVien.getGioiTinh());
            preparedStatement.setDate(5, nhanVien.getNgaySinh());
            preparedStatement.setDate(6, nhanVien.getNgayVaoLam());
            preparedStatement.setString(7, nhanVien.getChucVu());
            preparedStatement.setString(8, nhanVien.getChuThich());
            preparedStatement.setInt(9, nhanVien.getMaNhanVien());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteNhanVien(int maNhanVien) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Kết nối đến cơ sở dữ liệu
            connection = MyConnection.getConnection();

            // Truy vấn SQL để xóa nhân viên
            String query = "DELETE FROM NhanVien WHERE MaNhanVien = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, maNhanVien);

            // Thực hiện truy vấn xóa
            int rowsAffected = preparedStatement.executeUpdate();

            // Kiểm tra xem có dòng nào bị ảnh hưởng không
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Xóa thất bại
        } finally {
            // Đóng tài nguyên
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<NhanVien> getAllNhanVien() {
        List<NhanVien> nhanVienList = new ArrayList<>();
        String sql = "SELECT * FROM nhanvien";

        try (Connection conn = MyConnection.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNhanVien(resultSet.getInt("maNhanVien"));
                nhanVien.setTenNhanVien(resultSet.getString("tenNhanVien"));
                nhanVien.setDiaChi(resultSet.getString("diaChi"));
                nhanVien.setSoDienThoai(resultSet.getString("soDienThoai"));
                nhanVien.setGioiTinh(resultSet.getString("gioiTinh"));
                nhanVien.setNgaySinh(resultSet.getDate("ngaySinh"));
                nhanVien.setNgayVaoLam(resultSet.getDate("ngayVaoLam"));
                nhanVien.setChucVu(resultSet.getString("chucVu"));
                nhanVien.setChuThich(resultSet.getString("chuThich"));
                nhanVienList.add(nhanVien);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nhanVienList;
    }
    public static DefaultTableModel getAllNhanVienTableModel() {
        List<NhanVien> nhanVienList = getAllNhanVien();

        // Tạo model cho JTable
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("MaNhanVien");
        model.addColumn("TenNhanVien");
        model.addColumn("DiaChi");
        model.addColumn("SoDienThoai");
        model.addColumn("GioiTinh");
        model.addColumn("NgaySinh");
        model.addColumn("NgayVaoLam");
        model.addColumn("ChucVu");
        model.addColumn("ChuThich");

        // Đổ dữ liệu vào model
        for (NhanVien nhanVien : nhanVienList) {
            model.addRow(new Object[]{
                    nhanVien.getMaNhanVien(),
                    nhanVien.getTenNhanVien(),
                    nhanVien.getDiaChi(),
                    nhanVien.getSoDienThoai(),
                    nhanVien.getGioiTinh(),
                    nhanVien.getNgaySinh(),
                    nhanVien.getNgayVaoLam(),
                    nhanVien.getChucVu(),
                    nhanVien.getChuThich()
            });
        }

        return model;
    }
}
