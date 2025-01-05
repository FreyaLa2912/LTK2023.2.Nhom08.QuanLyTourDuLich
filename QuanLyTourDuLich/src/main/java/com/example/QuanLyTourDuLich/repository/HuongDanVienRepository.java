package com.example.QuanLyTourDuLich.repository;

import com.example.QuanLyTourDuLich.entity.HuongDanVien;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HuongDanVienRepository extends JpaRepository<HuongDanVien, Integer> { 
    // Có thể thêm các phương thức truy vấn ở đây nếu cần, 
    // ví dụ tìm kiếm theo tên hướng dẫn viên, số điện thoại, ...
}
