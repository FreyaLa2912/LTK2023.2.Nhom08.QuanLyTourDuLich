package com.example.QuanLyTourDuLich.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "DanhGia")
public class DanhGia {

    @EmbeddedId
    private DanhGiaId id;

    @ManyToOne
    @MapsId("maKH")
    @JoinColumn(name = "MaKH")
    private KhachHang khachHang;

    @ManyToOne
    @MapsId("maDatTour")
    @JoinColumn(name = "MaDatTour")
    private DatTour datTour;

    @Column(name = "NoiDung")
    private String noiDung;

    @Column(name = "XepHang", nullable = false)
    private int xepHang;

    @Column(name = "NgayDanhGia", nullable = false)
    private LocalDateTime ngayDanhGia;

    public DanhGia() {
    }

    public DanhGia(DanhGiaId id, KhachHang khachHang, DatTour datTour, String noiDung, int xepHang,
            LocalDateTime ngayDanhGia) {
        this.id = id;
        this.khachHang = khachHang;
        this.datTour = datTour;
        this.noiDung = noiDung;
        this.xepHang = xepHang;
        this.ngayDanhGia = ngayDanhGia;
    }

    public DanhGiaId getId() {
        return id;
    }

    public void setId(DanhGiaId id) {
        this.id = id;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public DatTour getDatTour() {
        return datTour;
    }

    public void setDatTour(DatTour datTour) {
        this.datTour = datTour;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getXepHang() {
        return xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public LocalDateTime getNgayDanhGia() {
        return ngayDanhGia;
    }

    public void setNgayDanhGia(LocalDateTime ngayDanhGia) {
        this.ngayDanhGia = ngayDanhGia;
    }

    // Constructor, getter và setter
    
}
