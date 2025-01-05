package com.example.QuanLyTourDuLich.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "KhachHang")
public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKH")
    private int maKH;

    @Column(name = "HoTen", nullable = false)
    private String hoTen;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

    @Column(name = "MatKhau", nullable = false)
    private String matKhau;

    @Column(name = "SoDienThoai", nullable = false)
    private String soDienThoai;

    @Column(name = "DiaChi", nullable = false)
    private String diaChi;

    @ManyToOne
    @JoinColumn(name = "MaVaiTro", nullable = false)
    private VaiTro vaiTro;

    @Column(name = "NgayTaoTK", nullable = false)
    private LocalDateTime ngayTaoTK;

    public KhachHang() {
    }

    public KhachHang(int maKH, String hoTen, String email, String matKhau, String soDienThoai, String diaChi,
            VaiTro vaiTro, LocalDateTime ngayTaoTK) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.email = email;
        this.matKhau = matKhau;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.vaiTro = vaiTro;
        this.ngayTaoTK = ngayTaoTK;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
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

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
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

    public VaiTro getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(VaiTro vaiTro) {
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