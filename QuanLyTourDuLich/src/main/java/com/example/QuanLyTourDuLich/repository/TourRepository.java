package com.example.QuanLyTourDuLich.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.QuanLyTourDuLich.entity.Tour;



@Repository
public interface TourRepository extends JpaRepository<Tour, Integer> { 
    // Có thể thêm các phương thức truy vấn ở đây nếu cần, 
    // ví dụ tìm kiếm theo tên tour, địa điểm, ...
}