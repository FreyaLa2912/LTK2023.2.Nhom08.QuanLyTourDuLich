package com.example.QuanLyTourDuLich.service;

import com.example.QuanLyTourDuLich.entity.KhachHang;
import java.util.List;

public interface KhachHangService {
    List<KhachHang> getAllKhachHangs();
    KhachHang getKhachHangById(int maKH);
    KhachHang createKhachHang(KhachHang khachHang);
    KhachHang updateKhachHang(int maKH, KhachHang khachHang);
    void deleteKhachHang(int maKH);
    // Các phương thức khác cho nghiệp vụ liên quan đến KhachHang (nếu cần)
}
