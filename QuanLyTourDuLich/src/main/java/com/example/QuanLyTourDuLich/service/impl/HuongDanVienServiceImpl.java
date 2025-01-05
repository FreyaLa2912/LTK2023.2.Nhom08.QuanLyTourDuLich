package com.example.QuanLyTourDuLich.service.impl;

import com.example.QuanLyTourDuLich.service.HuongDanVienService;
import com.example.QuanLyTourDuLich.entity.HuongDanVien;
import com.example.QuanLyTourDuLich.repository.HuongDanVienRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuongDanVienServiceImpl implements HuongDanVienService {

    @Autowired
    private HuongDanVienRepository huongDanVienRepository;

    @Override
    public List<HuongDanVien> getAllHuongDanViens() {
        return huongDanVienRepository.findAll();
    }

    @Override
    public HuongDanVien getHuongDanVienById(int maHDV) {
        return huongDanVienRepository.findById(maHDV).orElse(null);
    }

    @Override
    public HuongDanVien createHuongDanVien(HuongDanVien huongDanVien) {
        return huongDanVienRepository.save(huongDanVien);
    }

    @Override
    public HuongDanVien updateHuongDanVien(int maHDV, HuongDanVien huongDanVien) {
        HuongDanVien existingHuongDanVien = huongDanVienRepository.findById(maHDV).orElse(null);
        if (existingHuongDanVien != null) {
            // Cập nhật các thuộc tính của existingHuongDanVien từ huongDanVien
            existingHuongDanVien.setTenHDV(huongDanVien.getTenHDV());
            existingHuongDanVien.setSoDienThoai(huongDanVien.getSoDienThoai());
            // ... cập nhật các thuộc tính khác
            return huongDanVienRepository.save(existingHuongDanVien);
        } else {
            return null;
        }
    }

    @Override
    public void deleteHuongDanVien(int maHDV) {
        huongDanVienRepository.deleteById(maHDV);
    }
}
