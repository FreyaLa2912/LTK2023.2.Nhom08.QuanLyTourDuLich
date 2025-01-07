package com.example.QuanLyTourDuLich.service;

import com.example.QuanLyTourDuLich.entity.Tour_Turn;
import java.util.List;

public interface Tour_TurnService {
    List<Tour_Turn> getAllTour_Turns();
    Tour_Turn getTour_TurnById(int maTour, int turn);
    Tour_Turn createTour_Turn(Tour_Turn tour_turn);
    Tour_Turn updateTour_Turn(int maTour, int turn, Tour_Turn tour_turn);
    void deleteTour_Turn(int maTour, int turn);
    List<Integer> getTurnsByMaTour(int maTour);
    // Các phương thức khác cho nghiệp vụ liên quan đến Tour_Turn (nếu cần)
}