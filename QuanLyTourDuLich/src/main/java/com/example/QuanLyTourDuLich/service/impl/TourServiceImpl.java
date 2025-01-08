package com.example.QuanLyTourDuLich.service.impl;

import com.example.QuanLyTourDuLich.entity.LichTrinhTour;
import com.example.QuanLyTourDuLich.entity.Tour;
import com.example.QuanLyTourDuLich.repository.TourRepository;
import com.example.QuanLyTourDuLich.service.TourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private TourRepository tourRepository;


    @Override
    public List<Tour> getAllTours() {
        return tourRepository.findAll();
    }

    @Override
    public Tour getTourById(int maTour) {
        return tourRepository.findById(maTour).orElse(null);
    }

    @Override
    public Tour createTour(Tour tour) {
        return tourRepository.save(tour);
    }

    @Override
    public Tour updateTour(int maTour, Tour tour) {
        // Xử lý logic cập nhật tour
        return null;
    }

    @Override
    public void deleteTour(int maTour) {
        tourRepository.deleteById(maTour);
    }

    @Override
    public List<LichTrinhTour> getLichTrinhToursByMaTour(int maTour) {
        // Sử dụng TourRepository hoặc LichTrinhTourRepository để lấy danh sách lịch trình của tour
        // Ví dụ: return lichTrinhTourRepository.findByTour_MaTour(maTour);
        return null; // Thay thế bằng code thực tế
    }
    
}
