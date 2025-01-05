package com.example.QuanLyTourDuLich.repository;

import com.example.QuanLyTourDuLich.entity.DanhGia;
import com.example.QuanLyTourDuLich.entity.DanhGiaId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhGiaRepository extends JpaRepository<DanhGia, DanhGiaId> { 
    // Có thể thêm các phương thức truy vấn ở đây nếu cần, 
    // ví dụ tìm kiếm theo mã khách hàng, mã đặt tour, ...
}