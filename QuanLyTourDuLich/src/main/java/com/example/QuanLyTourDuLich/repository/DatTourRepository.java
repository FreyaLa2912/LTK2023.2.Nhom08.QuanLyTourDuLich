package com.example.QuanLyTourDuLich.repository;

import com.example.QuanLyTourDuLich.entity.DatTour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatTourRepository extends JpaRepository<DatTour, Integer> { 
    // Có thể thêm các phương thức truy vấn ở đây nếu cần, 
    // ví dụ tìm kiếm theo mã khách hàng, mã tour, trạng thái, ...
}