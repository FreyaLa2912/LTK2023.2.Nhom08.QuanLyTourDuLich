package com.example.QuanLyTourDuLich.service;

import com.example.QuanLyTourDuLich.entity.VaiTro;
import java.util.List;

public interface VaiTroService {
    List<VaiTro> getAllVaiTros();
    VaiTro getVaiTroById(int maVaiTro);
    VaiTro createVaiTro(VaiTro vaiTro);
    VaiTro updateVaiTro(int maVaiTro, VaiTro vaiTro);
    void deleteVaiTro(int maVaiTro);
    // Các phương thức khác cho nghiệp vụ liên quan đến VaiTro (nếu cần)
}