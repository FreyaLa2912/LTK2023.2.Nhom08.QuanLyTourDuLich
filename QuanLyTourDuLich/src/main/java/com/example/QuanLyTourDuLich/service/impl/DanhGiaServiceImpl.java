package com.example.QuanLyTourDuLich.service.impl;

import com.example.QuanLyTourDuLich.service.DanhGiaService;
import com.example.QuanLyTourDuLich.entity.DanhGia;
import com.example.QuanLyTourDuLich.entity.DanhGiaId;
import com.example.QuanLyTourDuLich.repository.DanhGiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhGiaServiceImpl implements DanhGiaService {

    @Autowired
    private DanhGiaRepository danhGiaRepository;

    @Override
    public List<DanhGia> getAllDanhGias() {
        return danhGiaRepository.findAll();
    }

    @Override
    public DanhGia getDanhGiaById(int maKH, int maDatTour) {
        DanhGiaId id = new DanhGiaId(maKH, maDatTour);
        return danhGiaRepository.findById(id).orElse(null);
    }

    @Override
    public DanhGia createDanhGia(DanhGia danhGia) {
        return danhGiaRepository.save(danhGia);
    }

    @Override
    public DanhGia updateDanhGia(int maKH, int maDatTour, DanhGia danhGia) {
        DanhGiaId id = new DanhGiaId(maKH, maDatTour);
        DanhGia existingDanhGia = danhGiaRepository.findById(id).orElse(null);
        if (existingDanhGia != null) {
            // Cập nhật các thuộc tính của existingDanhGia từ danhGia
            existingDanhGia.setNoiDung(danhGia.getNoiDung());
            existingDanhGia.setXepHang(danhGia.getXepHang());
            // ... cập nhật các thuộc tính khác
            return danhGiaRepository.save(existingDanhGia);
        } else {
            return null;
        }
    }

    @Override
    public void deleteDanhGia(int maKH, int maDatTour) {
        DanhGiaId id = new DanhGiaId(maKH, maDatTour);
        danhGiaRepository.deleteById(id);
    }
}
