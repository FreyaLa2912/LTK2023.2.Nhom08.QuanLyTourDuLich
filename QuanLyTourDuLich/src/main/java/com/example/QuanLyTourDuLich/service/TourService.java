package com.example.QuanLyTourDuLich.service;

import com.example.QuanLyTourDuLich.entity.LichTrinhTour;
import com.example.QuanLyTourDuLich.entity.Tour;

import java.util.List;


public interface TourService {
    List<Tour> getAllTours();
    Tour getTourById(int maTour);
    Tour createTour(Tour tour);
    Tour updateTour(int maTour, Tour tour);
    void deleteTour(int maTour);
    // Trong TourService.java
    List<LichTrinhTour> getLichTrinhToursByMaTour(int maTour);
    // Các phương thức khác cho nghiệp vụ liên quan đến Tour

}
