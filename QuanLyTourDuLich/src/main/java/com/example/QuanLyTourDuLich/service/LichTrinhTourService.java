package com.example.QuanLyTourDuLich.service;

import com.example.QuanLyTourDuLich.entity.LichTrinhTour;

import java.util.List;

public interface LichTrinhTourService {
    List<LichTrinhTour> getAllLichTrinhTours();
    LichTrinhTour getLichTrinhTourById(int maTour, int thuTuThamQuan);
    LichTrinhTour createLichTrinhTour(LichTrinhTour lichTrinhTour);
    LichTrinhTour updateLichTrinhTour(int maTour, int thuTuThamQuan, LichTrinhTour lichTrinhTour);
    void deleteLichTrinhTour(int maTour, int thuTuThamQuan);
    // Các phương thức khác cho nghiệp vụ liên quan đến LichTrinhTour (nếu cần)
}