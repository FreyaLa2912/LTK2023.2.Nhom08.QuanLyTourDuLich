package com.example.QuanLyTourDuLich.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "DatTour")
public class DatTour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDatTour")
    private int maDatTour;

    @ManyToOne
    @JoinColumn(name = "MaKH", nullable = false)
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "MaTour", referencedColumnName = "MaTour"),
            @JoinColumn(name = "Turn", referencedColumnName = "Turn")
    })
    private Tour_Turn tour_turn;

    @Column(name = "NgayDat", nullable = false)
    private LocalDate ngayDat;

    @Column(name = "SoLuongKhach", nullable = false)
    private int soLuongKhach;

    @Column(name = "TongTien", nullable = false)
    private BigDecimal tongTien;

    @Column(name = "TrangThai")
    private String trangThai = "Đang chờ";

    @Column(name = "ThongBao")
    private String thongBao;

    public DatTour() {
    }

    public DatTour(int maDatTour, KhachHang khachHang, Tour_Turn tour_turn, LocalDate ngayDat, int soLuongKhach,
            BigDecimal tongTien, String trangThai, String thongBao) {
        this.maDatTour = maDatTour;
        this.khachHang = khachHang;
        this.tour_turn = tour_turn;
        this.ngayDat = ngayDat;
        this.soLuongKhach = soLuongKhach;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
        this.thongBao = thongBao;
    }

    public int getMaDatTour() {
        return maDatTour;
    }

    public void setMaDatTour(int maDatTour) {
        this.maDatTour = maDatTour;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Tour_Turn getTour_turn() {
        return tour_turn;
    }

    public void setTour_turn(Tour_Turn tour_turn) {
        this.tour_turn = tour_turn;
    }

    public LocalDate getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(LocalDate ngayDat) {
        this.ngayDat = ngayDat;
    }

    public int getSoLuongKhach() {
        return soLuongKhach;
    }

    public void setSoLuongKhach(int soLuongKhach) {
        this.soLuongKhach = soLuongKhach;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getThongBao() {
        return thongBao;
    }

    public void setThongBao(String thongBao) {
        this.thongBao = thongBao;
    }

    // Constructor, getter và setter
    
}