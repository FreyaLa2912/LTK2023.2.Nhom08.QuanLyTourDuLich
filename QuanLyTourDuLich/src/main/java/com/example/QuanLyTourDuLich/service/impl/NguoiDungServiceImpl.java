package com.example.QuanLyTourDuLich.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyTourDuLich.entity.NguoiDung;
import com.example.QuanLyTourDuLich.repository.NguoiDungRepository;
import com.example.QuanLyTourDuLich.service.NguoiDungService;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @Override
    public List<NguoiDung> getAllNguoiDungs() {
        return nguoiDungRepository.findAll();
    }

    @Override
    public NguoiDung getNguoiDungById(int maNguoiDung) {
        return nguoiDungRepository.findById(maNguoiDung).orElse(null);
    }

    @Override
    public NguoiDung createNguoiDung(NguoiDung nguoiDung) {
        return nguoiDungRepository.save(nguoiDung);
    }

    @Override
    public NguoiDung updateNguoiDung(int maNguoiDung, NguoiDung nguoiDung) {
        NguoiDung existingNguoiDung = nguoiDungRepository.findById(maNguoiDung).orElse(null);
        if (existingNguoiDung != null) {
            // Cập nhật các thuộc tính của existingNguoiDung từ nguoiDung
            existingNguoiDung.setTenDangNhap(nguoiDung.getTenDangNhap());
            existingNguoiDung.setMatKhau(nguoiDung.getMatKhau());
            // ... cập nhật các thuộc tính khác
            return nguoiDungRepository.save(existingNguoiDung);
        } else {
            return null;
        }
    }

    @Override
    public void deleteNguoiDung(int maNguoiDung) {
        nguoiDungRepository.deleteById(maNguoiDung);
    }
}