package com.example.QuanLyTourDuLich.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DanhGiaId implements Serializable {

    @Column(name = "MaKH")
    private int maKH;

    @Column(name = "MaDatTour")
    private int maDatTour;

    // Constructor, getter và setter, equals và hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DanhGiaId that = (DanhGiaId) o;
        return maKH == that.maKH && maDatTour == that.maDatTour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maKH, maDatTour);
    }

    public DanhGiaId() {
    }

    public DanhGiaId(int maKH, int maDatTour) {
        this.maKH = maKH;
        this.maDatTour = maDatTour;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getMaDatTour() {
        return maDatTour;
    }

    public void setMaDatTour(int maDatTour) {
        this.maDatTour = maDatTour;
    }
    
}