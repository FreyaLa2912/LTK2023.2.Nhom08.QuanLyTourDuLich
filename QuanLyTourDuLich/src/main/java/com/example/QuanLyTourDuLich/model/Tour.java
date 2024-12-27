package com.example.QuanLyTourDuLich.model;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaTour")
    private Long maTour;

    @Column(name = "TenTour")
    private String tenTour;

    @Column(name = "GiaTour")
    private BigDecimal giaTour;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "ThoiGianKhoiHanh")
    private LocalDateTime thoiGianKhoiHanh;

    @Column(name = "ThoiGianKetThuc")
    private LocalDateTime thoiGianKetThuc;

    // Getters and setters
    public Long getMaTour() {
        return maTour;
    }

    public void setMaTour(Long maTour) {
        this.maTour = maTour;
    }

    public String getTenTour() {
        return tenTour;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public BigDecimal getGiaTour() {
        return giaTour;
    }

    public void setGiaTour(BigDecimal giaTour) {
        this.giaTour = giaTour;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
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

    public String getFormattedThoiGianKhoiHanh() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return thoiGianKhoiHanh.format(formatter);
    }

    public String getFormattedThoiGianKetThuc() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return thoiGianKetThuc.format(formatter);
    }
}