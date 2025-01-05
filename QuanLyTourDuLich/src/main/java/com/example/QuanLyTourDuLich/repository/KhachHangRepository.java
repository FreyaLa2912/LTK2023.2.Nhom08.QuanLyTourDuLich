package com.example.QuanLyTourDuLich.repository;

import com.example.QuanLyTourDuLich.entity.KhachHang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> { 
    // Có thể thêm các phương thức truy vấn ở đây nếu cần, 
    // ví dụ tìm kiếm theo tên khách hàng, email, số điện thoại, ...
}