package com.example.QuanLyTourDuLich.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "LichTrinhTour")
public class LichTrinhTour {
    @EmbeddedId
    private LichTrinhTourId id;


    @ManyToOne
    @MapsId("maTour")
    @JoinColumn(name = "MaTour")
    private Tour tour;

    @Column(name = "MaDiaDiem", nullable = false, insertable = false, updatable = false) // Thay đổi ở đây
    private int maDiaDiem;

    @Column(name = "ThuTuThamQuan", nullable = false, insertable = false, updatable = false) // Thay đổi ở đây
    private int thuTuThamQuan;

    @Column(name = "ThuTuNgay", nullable = false)
    private int thuTuNgay;

    @Column(name = "ThoiGianDen", nullable = false)
    private String thoiGianDen;

    @Column(name = "ThoiGianRoiDi", nullable = false)
    private String thoiGianRoiDi;

    @Column(name = "MoTa")
    private String moTa;

    public LichTrinhTour() {
    }

    public LichTrinhTour(LichTrinhTourId id, Tour tour, int maDiaDiem, int thuTuThamQuan, int thuTuNgay,
            String thoiGianDen, String thoiGianRoiDi, String moTa) {
        this.id = id;
        this.tour = tour;
        this.maDiaDiem = maDiaDiem;
        this.thuTuThamQuan = thuTuThamQuan;
        this.thuTuNgay = thuTuNgay;
        this.thoiGianDen = thoiGianDen;
        this.thoiGianRoiDi = thoiGianRoiDi;
        this.moTa = moTa;
    }

    public LichTrinhTourId getId() {
        return id;
    }
    

    public void setId(LichTrinhTourId id) {
        this.id = id;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public int getMaDiaDiem() {
        return maDiaDiem;
    }

    public void setMaDiaDiem(int maDiaDiem) {
        this.maDiaDiem = maDiaDiem;
    }

    public int getThuTuThamQuan() {
        return thuTuThamQuan;
    }

    public void setThuTuThamQuan(int thuTuThamQuan) {
        this.thuTuThamQuan = thuTuThamQuan;
    }

    public int getThuTuNgay() {
        return thuTuNgay;
    }

    public void setThuTuNgay(int thuTuNgay) {
        this.thuTuNgay = thuTuNgay;
    }

    public String getThoiGianDen() {
        return thoiGianDen;
    }

    public void setThoiGianDen(String thoiGianDen) {
        this.thoiGianDen = thoiGianDen;
    }

    public String getThoiGianRoiDi() {
        return thoiGianRoiDi;
    }

    public void setThoiGianRoiDi(String thoiGianRoiDi) {
        this.thoiGianRoiDi = thoiGianRoiDi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    
    
    // Constructor, getter và setter
}
