package com.example.QuanLyTourDuLich.service.impl;

import com.example.QuanLyTourDuLich.entity.DatTour;
import com.example.QuanLyTourDuLich.repository.DatTourRepository;
import com.example.QuanLyTourDuLich.service.DatTourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<DatTour> optionalDatTour = datTourRepository.findById(maDatTour);
        return optionalDatTour.orElse(null);
    }

    @Override
    public DatTour createDatTour(DatTour datTour) {
        return datTourRepository.save(datTour);
    }

    @Override
    public DatTour updateDatTour(int maDatTour, DatTour datTour) {
        Optional<DatTour> optionalExistingDatTour  =  datTourRepository.findById(maDatTour);
        if (optionalExistingDatTour.isPresent()) {
            DatTour existingDatTour = optionalExistingDatTour.get();
            // Cập nhật các thuộc tính của existingDatTour từ datTour (nếu cần)
            existingDatTour.setNguoiDung(datTour.getNguoiDung());
            existingDatTour.setTour_turn(datTour.getTour_turn());
            existingDatTour.setNgayDat(datTour.getNgayDat());
            existingDatTour.setSoLuongKhach(datTour.getSoLuongKhach());
            existingDatTour.setTongTien(datTour.getTongTien());
            existingDatTour.setTrangThai(datTour.getTrangThai());
            existingDatTour.setThongBao(datTour.getThongBao());

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