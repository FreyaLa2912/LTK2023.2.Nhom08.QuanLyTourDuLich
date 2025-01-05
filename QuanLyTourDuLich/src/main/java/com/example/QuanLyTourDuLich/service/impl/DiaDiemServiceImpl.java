package com.example.QuanLyTourDuLich.service.impl;

import com.example.QuanLyTourDuLich.entity.DiaDiem;
import com.example.QuanLyTourDuLich.repository.DiaDiemRepository;
import com.example.QuanLyTourDuLich.service.DiaDiemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaDiemServiceImpl implements DiaDiemService {

    @Autowired
    private DiaDiemRepository diaDiemRepository;

    @Override
    public List<DiaDiem> getAllDiaDiems() {
        return diaDiemRepository.findAll();
    }

    @Override
    public DiaDiem getDiaDiemById(int maDiaDiem) {
        return diaDiemRepository.findById(maDiaDiem).orElse(null);
    }

    @Override
    public DiaDiem createDiaDiem(DiaDiem diaDiem) {
        return diaDiemRepository.save(diaDiem);
    }

    @Override
    public DiaDiem updateDiaDiem(int maDiaDiem, DiaDiem diaDiem) {
        DiaDiem existingDiaDiem = diaDiemRepository.findById(maDiaDiem).orElse(null);
        if (existingDiaDiem != null) {
            // Cập nhật các thuộc tính của existingDiaDiem từ diaDiem
            existingDiaDiem.setTenDiaDiem(diaDiem.getTenDiaDiem());
            existingDiaDiem.setMoTa(diaDiem.getMoTa());
            // ... cập nhật các thuộc tính khác
            return diaDiemRepository.save(existingDiaDiem);
        } else {
            return null;
        }
    }

    @Override
    public void deleteDiaDiem(int maDiaDiem) {
        diaDiemRepository.deleteById(maDiaDiem);
    }
}
