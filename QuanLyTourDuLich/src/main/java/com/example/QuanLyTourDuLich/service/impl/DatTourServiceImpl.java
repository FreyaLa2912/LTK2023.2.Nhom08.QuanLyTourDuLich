package com.example.QuanLyTourDuLich.service.impl;

import com.example.QuanLyTourDuLich.entity.DatTour;
import com.example.QuanLyTourDuLich.repository.DatTourRepository;
import com.example.QuanLyTourDuLich.service.DatTourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatTourServiceImpl implements DatTourService {

    @Autowired
    private DatTourRepository datTourRepository;

    @Override
    public List<DatTour> getAllDatTours() {
        return datTourRepository.findAll();
    }

    @Override
    public DatTour getDatTourById(int maDatTour) {
        return datTourRepository.findById(maDatTour).orElse(null);
    }

    @Override
    public DatTour createDatTour(DatTour datTour) {
        return datTourRepository.save(datTour);
    }

    @Override
    public DatTour updateDatTour(int maDatTour, DatTour datTour) {
        DatTour existingDatTour = datTourRepository.findById(maDatTour).orElse(null);
        if (existingDatTour != null) {
            // Cập nhật các thuộc tính của existingDatTour từ datTour
            existingDatTour.setNgayDat(datTour.getNgayDat());
            existingDatTour.setSoLuongKhach(datTour.getSoLuongKhach());
            // ... cập nhật các thuộc tính khác
            return datTourRepository.save(existingDatTour);
        } else {
            return null;
        }
    }

    @Override
    public void deleteDatTour(int maDatTour) {
        datTourRepository.deleteById(maDatTour);
    }
}