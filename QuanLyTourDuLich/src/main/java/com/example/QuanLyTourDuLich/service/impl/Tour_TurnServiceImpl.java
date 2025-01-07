package com.example.QuanLyTourDuLich.service.impl;

import com.example.QuanLyTourDuLich.entity.Tour_Turn;
import com.example.QuanLyTourDuLich.entity.Tour_TurnId;
import com.example.QuanLyTourDuLich.repository.Tour_TurnRepository;
import com.example.QuanLyTourDuLich.service.Tour_TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Tour_TurnServiceImpl implements Tour_TurnService {

    @Autowired
    private Tour_TurnRepository tour_turnRepository;

    @Override
    public List<Tour_Turn> getAllTour_Turns() {
        return tour_turnRepository.findAll();
    }

    @Override
    public Tour_Turn getTour_TurnById(int maTour, int turn) {
        Tour_TurnId id = new Tour_TurnId(maTour, turn);
        return tour_turnRepository.findById(id).orElse(null);
    }

    @Override
    public Tour_Turn createTour_Turn(Tour_Turn tour_turn) {
        return tour_turnRepository.save(tour_turn);
    }

    @Override
    public List<Integer> getTurnsByMaTour(int maTour) {
        return tour_turnRepository.findTurnsByMaTour(maTour); // Sử dụng phương thức đã được định nghĩa trong repository
    }

    @Override
    public Tour_Turn updateTour_Turn(int maTour, int turn, Tour_Turn tour_turn) {
        Tour_TurnId id = new Tour_TurnId(maTour, turn);
        Tour_Turn existingTour_Turn = tour_turnRepository.findById(id).orElse(null);
        if (existingTour_Turn != null) {
            // Cập nhật các thuộc tính của existingTour_Turn từ tour_turn
            existingTour_Turn.setMaHDV(tour_turn.getMaHDV());
            existingTour_Turn.setSoLuongKhachToiThieu(tour_turn.getSoLuongKhachToiThieu());
            // ... cập nhật các thuộc tính khác
            return tour_turnRepository.save(existingTour_Turn);
        } else {
            return null;
        }
    }

    @Override
    public void deleteTour_Turn(int maTour, int turn) {
        Tour_TurnId id = new Tour_TurnId(maTour, turn);
        tour_turnRepository.deleteById(id);
    }
}