package com.example.QuanLyTourDuLich.entity;

import javax.persistence.*;
import org.locationtech.jts.geom.Geometry;

@Entity
public class DiaDiem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maDiaDiem;
    private String tenDiaDiem;
    private String moTa;
    private Geometry toaDo;
    private String hinhAnh;
    private String thanhPho;
    private String tinh;

    
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

    public Geometry getToaDo() {
        return toaDo;
    }

    public void setToaDo(Geometry toaDo) {
        this.toaDo = toaDo;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
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
