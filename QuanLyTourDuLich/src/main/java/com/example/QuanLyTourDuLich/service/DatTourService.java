package com.example.QuanLyTourDuLich.service;

import com.example.QuanLyTourDuLich.entity.DatTour;

import java.util.List;

public interface DatTourService {
    List<DatTour> getAllDatTours();
    DatTour getDatTourById(int maDatTour);
    DatTour createDatTour(DatTour datTour);
    DatTour updateDatTour(int maDatTour, DatTour datTour);
    void deleteDatTour(int maDatTour);
    // Các phương thức khác cho nghiệp vụ liên quan đến DatTour (nếu cần)
}