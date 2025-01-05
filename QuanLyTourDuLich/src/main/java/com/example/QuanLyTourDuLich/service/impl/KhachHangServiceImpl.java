package com.example.QuanLyTourDuLich.service.impl;

import com.example.QuanLyTourDuLich.entity.KhachHang;
import com.example.QuanLyTourDuLich.repository.KhachHangRepository;
import com.example.QuanLyTourDuLich.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> getAllKhachHangs() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang getKhachHangById(int maKH) {
        return khachHangRepository.findById(maKH).orElse(null);
    }

    @Override
    public KhachHang createKhachHang(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang updateKhachHang(int maKH, KhachHang khachHang) {
        KhachHang existingKhachHang = khachHangRepository.findById(maKH).orElse(null);
        if (existingKhachHang != null) {
            // Cập nhật các thuộc tính của existingKhachHang từ khachHang
            existingKhachHang.setHoTen(khachHang.getHoTen());
            existingKhachHang.setEmail(khachHang.getEmail());
            // ... cập nhật các thuộc tính khác
            return khachHangRepository.save(existingKhachHang);
        } else {
            return null;
        }
    }

    @Override
    public void deleteKhachHang(int maKH) {
        khachHangRepository.deleteById(maKH);
    }
}
