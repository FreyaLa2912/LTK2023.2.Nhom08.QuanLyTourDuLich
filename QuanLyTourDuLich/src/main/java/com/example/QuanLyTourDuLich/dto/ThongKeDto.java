package com.example.QuanLyTourDuLich.dto;

import java.util.List;
import java.util.Map;

public class ThongKeDto {
    private long tongSoTour;
    private long tongSoDiaDiem;
    private long tongSoHuongDanVien;
    private long tongSoNguoiDung;
    private long tongSoDonDatTour;
    private double tongDoanhThu;

    private double tyLeTangTruongDoanhThu;
    private double tyLeTangTruongLuotDat;
    private double tyLeTangTruongSoTour;
    private double tyLeTangTruongSoDiaDiem;

    private BieuDoDto bieuDoDoanhThu;
    private Map<String, Integer> tiLeLuotDatTheoTrangThai;
    private List<TopTourDto> topTourDuocDat;
    private List<Double> doanhThuTheoThang;


    // Constructor
    public ThongKeDto() {
    }


    // Getters và Setters
    public long getTongSoTour() {
        return tongSoTour;
    }

    public void setTongSoTour(long tongSoTour) {
        this.tongSoTour = tongSoTour;
    }

    public long getTongSoDiaDiem() {
        return tongSoDiaDiem;
    }

    public void setTongSoDiaDiem(long tongSoDiaDiem) {
        this.tongSoDiaDiem = tongSoDiaDiem;
    }

    public long getTongSoHuongDanVien() {
        return tongSoHuongDanVien;
    }

    public void setTongSoHuongDanVien(long tongSoHuongDanVien) {
        this.tongSoHuongDanVien = tongSoHuongDanVien;
    }

    public long getTongSoNguoiDung() {
        return tongSoNguoiDung;
    }

    public void setTongSoNguoiDung(long tongSoNguoiDung) {
        this.tongSoNguoiDung = tongSoNguoiDung;
    }

    public long getTongSoDonDatTour() {
        return tongSoDonDatTour;
    }

    public void setTongSoDonDatTour(long tongSoDonDatTour) {
        this.tongSoDonDatTour = tongSoDonDatTour;
    }

    public double getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(double tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    public double getTyLeTangTruongDoanhThu() {
        return tyLeTangTruongDoanhThu;
    }

    public void setTyLeTangTruongDoanhThu(double tyLeTangTruongDoanhThu) {
        this.tyLeTangTruongDoanhThu = tyLeTangTruongDoanhThu;
    }

    public double getTyLeTangTruongLuotDat() {
        return tyLeTangTruongLuotDat;
    }

    public void setTyLeTangTruongLuotDat(double tyLeTangTruongLuotDat) {
        this.tyLeTangTruongLuotDat = tyLeTangTruongLuotDat;
    }

    public double getTyLeTangTruongSoTour() {
        return tyLeTangTruongSoTour;
    }

    public void setTyLeTangTruongSoTour(double tyLeTangTruongSoTour) {
        this.tyLeTangTruongSoTour = tyLeTangTruongSoTour;
    }

    public double getTyLeTangTruongSoDiaDiem() {
        return tyLeTangTruongSoDiaDiem;
    }

    public void setTyLeTangTruongSoDiaDiem(double tyLeTangTruongSoDiaDiem) {
        this.tyLeTangTruongSoDiaDiem = tyLeTangTruongSoDiaDiem;
    }

    public BieuDoDto getBieuDoDoanhThu() {
        return bieuDoDoanhThu;
    }

    public void setBieuDoDoanhThu(BieuDoDto bieuDoDoanhThu) {
        this.bieuDoDoanhThu = bieuDoDoanhThu;
    }

    public Map<String, Integer> getTiLeLuotDatTheoTrangThai() {
        return tiLeLuotDatTheoTrangThai;
    }

    public void setTiLeLuotDatTheoTrangThai(Map<String, Integer> tiLeLuotDatTheoTrangThai) {
        this.tiLeLuotDatTheoTrangThai = tiLeLuotDatTheoTrangThai;
    }

    public List<TopTourDto> getTopTourDuocDat() {
        return topTourDuocDat;
    }

    public void setTopTourDuocDat(List<TopTourDto> topTourDuocDat) {
        this.topTourDuocDat = topTourDuocDat;
    }

    public List<Double> getDoanhThuTheoThang() {
        return doanhThuTheoThang;
    }

    public void setDoanhThuTheoThang(List<Double> doanhThuTheoThang) {
        this.doanhThuTheoThang = doanhThuTheoThang;
    }
}
