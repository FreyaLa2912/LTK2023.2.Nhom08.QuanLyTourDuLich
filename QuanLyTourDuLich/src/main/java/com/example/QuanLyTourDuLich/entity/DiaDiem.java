package com.example.QuanLyTourDuLich.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DiaDiem")
public class DiaDiem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDiaDiem")
    private Long maDiaDiem;

    @Column(name = "TenDiaDiem", nullable = false)
    private String tenDiaDiem;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "ToaDo", nullable = false)
    private String toaDo;


    @Column(name = "ThanhPho")
    private String thanhPho;

    @Column(name = "Tinh")
    private String tinh;

    // Constructor, getter và setter
    public DiaDiem() {
    }

    public DiaDiem(Long maDiaDiem, String tenDiaDiem, String moTa, String toaDo, String thanhPho, String tinh) {
        this.maDiaDiem = maDiaDiem;
        this.tenDiaDiem = tenDiaDiem;
        this.moTa = moTa;
        this.toaDo = toaDo;
        this.thanhPho = thanhPho;
        this.tinh = tinh;
    }

    public Long getMaDiaDiem() {
        return maDiaDiem;
    }

    public void setMaDiaDiem(Long maDiaDiem) {
        this.maDiaDiem = maDiaDiem;
    }

    public String getTenDiaDiem() {
        return tenDiaDiem;
    }

    public void setTenDiaDiem(String tenDiaDiem) {
        this.tenDiaDiem = tenDiaDiem;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getToaDo() {
        return toaDo;
    }

    public void setToaDo(String toaDo) {
        this.toaDo = toaDo;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    
    
}
