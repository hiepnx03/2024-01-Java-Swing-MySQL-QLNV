package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maNhanVien;
    private String tenNhanVien;
    private String diaChi;
    private String soDienThoai;
    private String gioiTinh;
    private Date ngaySinh;
    private Date ngayVaoLam;
    private String chucVu;
    private String chuThich;
}
