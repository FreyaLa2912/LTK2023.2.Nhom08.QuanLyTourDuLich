package com.example.QuanLyTourDuLich.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "NguoiDung")
public class NguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaNguoiDung")
    private int maNguoiDung;

    @Column(name = "TenDangNhap", nullable = false, unique = true)
    private String tenDangNhap;

    @Column(name = "MatKhau", nullable = false)
    private String matKhau;

    @Column(name = "HoTen", nullable = false)
    private String hoTen;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

    @Column(name = "SoDienThoai", nullable = false)
    private String soDienThoai;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "VaiTro", nullable = false)
    private int vaiTro;  // 1: Quản lý, 2: Nhân viên

    @Column(name = "NgayTaoTK", nullable = false)
    private LocalDateTime ngayTaoTK;

    public NguoiDung() {
    }

    public NguoiDung(int maNguoiDung, String tenDangNhap, String matKhau, String hoTen, String email,
            String soDienThoai, String diaChi, int vaiTro, LocalDateTime ngayTaoTK) {
        this.maNguoiDung = maNguoiDung;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.vaiTro = vaiTro;
        this.ngayTaoTK = ngayTaoTK;
    }

    public int getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(int maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(int vaiTro) {
        this.vaiTro = vaiTro;
    }

    public LocalDateTime getNgayTaoTK() {
        return ngayTaoTK;
    }

    public void setNgayTaoTK(LocalDateTime ngayTaoTK) {
        this.ngayTaoTK = ngayTaoTK;
    }

    // Constructor, getter và setter
    
}
