package com.example.QuanLyTourDuLich.repository;

import com.example.QuanLyTourDuLich.entity.NguoiDung;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung, Integer> {
    // Các phương thức truy vấn tùy chỉnh (nếu cần)
    NguoiDung findByTenDangNhap(String tenDangNhap); // Thêm phương thức này
}