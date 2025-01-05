package com.example.QuanLyTourDuLich.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Tour_Turn")
public class Tour_Turn {

    @EmbeddedId
    private Tour_TurnId id;

    @ManyToOne
    @MapsId("maTour")
    @JoinColumn(name = "MaTour")
    private Tour tour;

    @Column(name = "MaHDV", nullable = false)
    private int maHDV;

    @Column(name = "SoLuongKhachToiThieu")
    private int soLuongKhachToiThieu;

    @Column(name = "SoLuongKhachToiDa")
    private int soLuongKhachToiDa;

    @Column(name = "SoLuongKhachDaDat")
    private int soLuongKhachDaDat = 0;

    @Column(name = "TrangThai", nullable = false)
    private String trangThai = "Đang chờ";

    @Column(name = "ThoiGianChot", nullable = false)
    private LocalDateTime thoiGianChot;

    @Column(name = "ThoiGianKhoiHanh", nullable = false)
    private LocalDateTime thoiGianKhoiHanh;

    @Column(name = "ThoiGianKetThuc", nullable = false)
    private LocalDateTime thoiGianKetThuc;

    @Column(name = "GiaTour", nullable = false)
    private BigDecimal giaTour;

    @Column(name = "DoanhThu")
    private BigDecimal doanhThu = BigDecimal.ZERO;

    public Tour_Turn() {
    }

    public Tour_Turn(Tour_TurnId id, Tour tour, int maHDV, int soLuongKhachToiThieu, int soLuongKhachToiDa,
            int soLuongKhachDaDat, String trangThai, LocalDateTime thoiGianChot, LocalDateTime thoiGianKhoiHanh,
            LocalDateTime thoiGianKetThuc, BigDecimal giaTour, BigDecimal doanhThu) {
        this.id = id;
        this.tour = tour;
        this.maHDV = maHDV;
        this.soLuongKhachToiThieu = soLuongKhachToiThieu;
        this.soLuongKhachToiDa = soLuongKhachToiDa;
        this.soLuongKhachDaDat = soLuongKhachDaDat;
        this.trangThai = trangThai;
        this.thoiGianChot = thoiGianChot;
        this.thoiGianKhoiHanh = thoiGianKhoiHanh;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.giaTour = giaTour;
        this.doanhThu = doanhThu;
    }

    public Tour_TurnId getId() {
        return id;
    }

    public void setId(Tour_TurnId id) {
        this.id = id;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public int getMaHDV() {
        return maHDV;
    }

    public void setMaHDV(int maHDV) {
        this.maHDV = maHDV;
    }

    public int getSoLuongKhachToiThieu() {
        return soLuongKhachToiThieu;
    }

    public void setSoLuongKhachToiThieu(int soLuongKhachToiThieu) {
        this.soLuongKhachToiThieu = soLuongKhachToiThieu;
    }

    public int getSoLuongKhachToiDa() {
        return soLuongKhachToiDa;
    }

    public void setSoLuongKhachToiDa(int soLuongKhachToiDa) {
        this.soLuongKhachToiDa = soLuongKhachToiDa;
    }

    public int getSoLuongKhachDaDat() {
        return soLuongKhachDaDat;
    }

    public void setSoLuongKhachDaDat(int soLuongKhachDaDat) {
        this.soLuongKhachDaDat = soLuongKhachDaDat;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public LocalDateTime getThoiGianChot() {
        return thoiGianChot;
    }

    public void setThoiGianChot(LocalDateTime thoiGianChot) {
        this.thoiGianChot = thoiGianChot;
    }

    public LocalDateTime getThoiGianKhoiHanh() {
        return thoiGianKhoiHanh;
    }

    public void setThoiGianKhoiHanh(LocalDateTime thoiGianKhoiHanh) {
        this.thoiGianKhoiHanh = thoiGianKhoiHanh;
    }

    public LocalDateTime getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(LocalDateTime thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public BigDecimal getGiaTour() {
        return giaTour;
    }

    public void setGiaTour(BigDecimal giaTour) {
        this.giaTour = giaTour;
    }

    public BigDecimal getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(BigDecimal doanhThu) {
        this.doanhThu = doanhThu;
    }

    // Constructor, getter và setter
}
