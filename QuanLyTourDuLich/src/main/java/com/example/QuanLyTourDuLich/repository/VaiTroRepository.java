package com.example.QuanLyTourDuLich.repository;

import com.example.QuanLyTourDuLich.entity.VaiTro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaiTroRepository extends JpaRepository<VaiTro, Integer> { 
    // Có thể thêm các phương thức truy vấn ở đây nếu cần, 
    // ví dụ tìm kiếm theo tên vai trò, ...
}