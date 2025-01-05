package com.example.QuanLyTourDuLich.repository;

import com.example.QuanLyTourDuLich.entity.Tour_Turn;
import com.example.QuanLyTourDuLich.entity.Tour_TurnId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tour_TurnRepository extends JpaRepository<Tour_Turn, Tour_TurnId> { 
    // Có thể thêm các phương thức truy vấn ở đây nếu cần, 
    // ví dụ tìm kiếm theo mã tour, turn, ...
}
