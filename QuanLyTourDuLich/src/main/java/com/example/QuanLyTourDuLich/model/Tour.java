package com.example.QuanLyTourDuLich.model;


import java.math.BigDecimal;
import java.time.LocalDateTime;

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
}