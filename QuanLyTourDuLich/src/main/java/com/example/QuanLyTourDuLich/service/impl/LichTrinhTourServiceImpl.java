package com.example.QuanLyTourDuLich.service.impl;

import com.example.QuanLyTourDuLich.entity.LichTrinhTour;
import com.example.QuanLyTourDuLich.entity.LichTrinhTourId;
import com.example.QuanLyTourDuLich.repository.LichTrinhTourRepository;
import com.example.QuanLyTourDuLich.service.LichTrinhTourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LichTrinhTourServiceImpl implements LichTrinhTourService {

    @Autowired
    private LichTrinhTourRepository lichTrinhTourRepository;

    @Override
    public List<LichTrinhTour> getAllLichTrinhTours() {
        return lichTrinhTourRepository.findAll();
    }

    @Override
    public LichTrinhTour getLichTrinhTourById(int maTour, int thuTuThamQuan) {
        LichTrinhTourId id = new LichTrinhTourId(maTour, thuTuThamQuan);
        return lichTrinhTourRepository.findById(id).orElse(null);
    }

    @Override
    public LichTrinhTour createLichTrinhTour(LichTrinhTour lichTrinhTour) {
        return lichTrinhTourRepository.save(lichTrinhTour);
    }

    @Override
    public LichTrinhTour updateLichTrinhTour(int maTour, int thuTuThamQuan, LichTrinhTour lichTrinhTour) {
        LichTrinhTourId id = new LichTrinhTourId(maTour, thuTuThamQuan);
        LichTrinhTour existingLichTrinhTour = lichTrinhTourRepository.findById(id).orElse(null);
        if (existingLichTrinhTour != null) {
            // Cập nhật các thuộc tính của existingLichTrinhTour từ lichTrinhTour
            existingLichTrinhTour.setThuTuNgay(lichTrinhTour.getThuTuNgay());
            existingLichTrinhTour.setThoiGianDen(lichTrinhTour.getThoiGianDen());
            // ... cập nhật các thuộc tính khác
            return lichTrinhTourRepository.save(existingLichTrinhTour);
        } else {
            return null;
        }
    }

    @Override
    public void deleteLichTrinhTour(int maTour, int thuTuThamQuan) {
        LichTrinhTourId id = new LichTrinhTourId(maTour, thuTuThamQuan);
        lichTrinhTourRepository.deleteById(id);
    }
}
