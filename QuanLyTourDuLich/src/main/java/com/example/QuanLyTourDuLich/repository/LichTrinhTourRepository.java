package com.example.QuanLyTourDuLich.repository;

import com.example.QuanLyTourDuLich.entity.LichTrinhTour;
import com.example.QuanLyTourDuLich.entity.LichTrinhTourId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LichTrinhTourRepository extends JpaRepository<LichTrinhTour, LichTrinhTourId> { 
    // Có thể thêm các phương thức truy vấn ở đây nếu cần, 
    // ví dụ tìm kiếm theo mã tour, mã địa điểm, ...
}
