package com.example.QuanLyTourDuLich.repository;

import com.example.QuanLyTourDuLich.entity.LichTrinhTour;
import com.example.QuanLyTourDuLich.entity.LichTrinhTourId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LichTrinhTourRepository extends JpaRepository<LichTrinhTour, LichTrinhTourId> { 
    List<LichTrinhTour> findByTour_MaTour(int maTour);
}
