package com.example.QuanLyTourDuLich.service;

import com.example.QuanLyTourDuLich.entity.DanhGia;
import java.util.List;

public interface DanhGiaService {
    List<DanhGia> getAllDanhGias();
    DanhGia getDanhGiaById(int maKH, int maDatTour);
    DanhGia createDanhGia(DanhGia danhGia);
    DanhGia updateDanhGia(int maKH, int maDatTour, DanhGia danhGia);
    void deleteDanhGia(int maKH, int maDatTour);
    // Các phương thức khác cho nghiệp vụ liên quan đến DanhGia (nếu cần)
}