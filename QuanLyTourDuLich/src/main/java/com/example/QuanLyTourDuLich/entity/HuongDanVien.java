package com.example.QuanLyTourDuLich.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "HuongDanVien")
public class HuongDanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHDV")
    private int maHDV;

    @Column(name = "TenHDV", nullable = false)
    private String tenHDV;

    @Column(name = "SoDienThoai", nullable = false)
    private String soDienThoai;

    public HuongDanVien() {
    }

    public HuongDanVien(int maHDV, String tenHDV, String soDienThoai) {
        this.maHDV = maHDV;
        this.tenHDV = tenHDV;
        this.soDienThoai = soDienThoai;
    }

    public int getMaHDV() {
        return maHDV;
    }

    public void setMaHDV(int maHDV) {
        this.maHDV = maHDV;
    }

    public String getTenHDV() {
        return tenHDV;
    }

    public void setTenHDV(String tenHDV) {
        this.tenHDV = tenHDV;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    // Constructor, getter và setter
    
}
