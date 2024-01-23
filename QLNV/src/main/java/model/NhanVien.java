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
    @Column(name = "maNhanVien")
    private int maNhanVien;

    @Column(name = "tenNhanVien")
    private String tenNhanVien;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "soDienThoai")
    private String soDienThoai;

    @Column(name = "gioiTinh")
    private String gioiTinh;

    @Column(name = "ngaySinh")
    private Date ngaySinh;

    @Column(name = "ngayVaoLam")
    private Date ngayVaoLam;

    @Column(name = "chucVu")
    private String chucVu;

    @Column(name = "chuThich")
    private String chuThich;
}
