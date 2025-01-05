package com.example.QuanLyTourDuLich.service.impl;

import com.example.QuanLyTourDuLich.entity.VaiTro;
import com.example.QuanLyTourDuLich.repository.VaiTroRepository;
import com.example.QuanLyTourDuLich.service.VaiTroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaiTroServiceImpl implements VaiTroService {

    @Autowired
    private VaiTroRepository vaiTroRepository;

    @Override
    public List<VaiTro> getAllVaiTros() {
        return vaiTroRepository.findAll();
    }

    @Override
    public VaiTro getVaiTroById(int maVaiTro) {
        return vaiTroRepository.findById(maVaiTro).orElse(null);
    }

    @Override
    public VaiTro createVaiTro(VaiTro vaiTro) {
        return vaiTroRepository.save(vaiTro);
    }

    @Override
    public VaiTro updateVaiTro(int maVaiTro, VaiTro vaiTro) {
        VaiTro existingVaiTro = vaiTroRepository.findById(maVaiTro).orElse(null);
        if (existingVaiTro != null) {
            // Cập nhật các thuộc tính của existingVaiTro từ vaiTro
            existingVaiTro.setTenVaiTro(vaiTro.getTenVaiTro());
            // ... cập nhật các thuộc tính khác
            return vaiTroRepository.save(existingVaiTro);
        } else {
            return null;
        }
    }

    @Override
    public void deleteVaiTro(int maVaiTro) {
        vaiTroRepository.deleteById(maVaiTro);
    }
}