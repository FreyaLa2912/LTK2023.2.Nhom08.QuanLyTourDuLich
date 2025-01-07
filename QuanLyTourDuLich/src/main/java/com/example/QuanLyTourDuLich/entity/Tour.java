package com.example.QuanLyTourDuLich.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Tour")
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaTour")
    private int maTour;

    @Column(name = "TenTour", nullable = false)
    private String tenTour;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "SoNgay", nullable = false)
    private int soNgay;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MaDiaDiem", nullable = false)
    private DiaDiem diaDiem;

    public Tour() {
    }

    public Tour(int maTour, String tenTour, String moTa, int soNgay, DiaDiem diaDiem) {
        this.maTour = maTour;
        this.tenTour = tenTour;
        this.moTa = moTa;
        this.soNgay = soNgay;
        this.diaDiem = diaDiem;
    }

    public int getMaTour() {
        return maTour;
    }

    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }

    public String getTenTour() {
        return tenTour;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public DiaDiem getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(DiaDiem diaDiem) {
        this.diaDiem = diaDiem;
    }

    // Constructor, getter và setter
}