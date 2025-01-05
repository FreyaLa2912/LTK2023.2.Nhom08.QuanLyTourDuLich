package com.example.QuanLyTourDuLich.service;

import com.example.QuanLyTourDuLich.entity.HuongDanVien;

import java.util.List;

public interface HuongDanVienService {
    List<HuongDanVien> getAllHuongDanViens();
    HuongDanVien getHuongDanVienById(int maHDV);
    HuongDanVien createHuongDanVien(HuongDanVien huongDanVien);
    HuongDanVien updateHuongDanVien(int maHDV, HuongDanVien huongDanVien);
    void deleteHuongDanVien(int maHDV);
    // Các phương thức khác cho nghiệp vụ liên quan đến HuongDanVien (nếu cần)
}