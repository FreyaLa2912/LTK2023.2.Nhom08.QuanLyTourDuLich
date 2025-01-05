package com.example.QuanLyTourDuLich.service;

import com.example.QuanLyTourDuLich.entity.DiaDiem;

import java.util.List;

public interface DiaDiemService {
    List<DiaDiem> getAllDiaDiems();
    DiaDiem getDiaDiemById(int maDiaDiem);
    DiaDiem createDiaDiem(DiaDiem diaDiem);
    DiaDiem updateDiaDiem(int maDiaDiem, DiaDiem diaDiem);
    void deleteDiaDiem(int maDiaDiem);
    // Các phương thức khác cho nghiệp vụ liên quan đến DiaDiem (nếu cần)
}
