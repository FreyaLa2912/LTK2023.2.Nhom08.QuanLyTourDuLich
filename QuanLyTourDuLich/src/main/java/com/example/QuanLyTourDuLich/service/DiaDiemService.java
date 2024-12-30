package com.example.QuanLyTourDuLich.service;

import java.util.List;
import com.example.QuanLyTourDuLich.entity.DiaDiem;

public interface DiaDiemService {
    List<DiaDiem> findAll();
    DiaDiem findById(int id);
    DiaDiem save(DiaDiem diaDiem);
    void deleteById(int id);
}
