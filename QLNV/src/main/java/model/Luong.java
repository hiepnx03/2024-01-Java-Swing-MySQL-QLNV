package model;

import java.math.BigDecimal;

public class Luong {
    private int maNhanVien;
    private String chucVu;
    private BigDecimal luongCoBan;
    private int soNgayLamViec;

    public Luong(int maNhanVien, String tenNhanVien, String chucVu, BigDecimal luongCoBan, int soNgayLamViec) {
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public BigDecimal getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(BigDecimal luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public Luong(int maNhanVien, String chucVu, BigDecimal luongCoBan, int soNgayLamViec) {
        this.maNhanVien = maNhanVien;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayLamViec = soNgayLamViec;
    }
}
