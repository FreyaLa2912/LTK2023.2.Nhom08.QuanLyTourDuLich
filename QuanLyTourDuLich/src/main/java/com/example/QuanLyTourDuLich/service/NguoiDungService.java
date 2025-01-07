package com.example.QuanLyTourDuLich.service;

import java.util.List;
import com.example.QuanLyTourDuLich.entity.NguoiDung;

public interface NguoiDungService {
    List<NguoiDung> getAllNguoiDungs();
    NguoiDung getNguoiDungById(int maNguoiDung);
    NguoiDung createNguoiDung(NguoiDung nguoiDung);
    NguoiDung updateNguoiDung(int maNguoiDung, NguoiDung nguoiDung);
    void deleteNguoiDung(int maNguoiDung);
    // Các phương thức khác cho nghiệp vụ liên quan đến NguoiDung (nếu cần)
}
