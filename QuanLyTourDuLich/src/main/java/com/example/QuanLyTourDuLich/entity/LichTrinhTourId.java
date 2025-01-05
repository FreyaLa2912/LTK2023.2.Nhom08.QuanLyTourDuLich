package com.example.QuanLyTourDuLich.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LichTrinhTourId implements Serializable {
    

    @Column(name = "MaTour")
    private int maTour;

    @Column(name = "ThuTuThamQuan")
    private int thuTuThamQuan;

    // Constructor, getter và setter, equals và hashCode
    // Constructor, getter và setter

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LichTrinhTourId that = (LichTrinhTourId) o;
        return maTour == that.maTour && thuTuThamQuan == that.thuTuThamQuan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maTour, thuTuThamQuan);
    }

    public LichTrinhTourId() {
    }

    public LichTrinhTourId(int maTour, int thuTuThamQuan) {
        this.maTour = maTour;
        this.thuTuThamQuan = thuTuThamQuan;
    }

    public int getMaTour() {
        return maTour;
    }

    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }

    public int getThuTuThamQuan() {
        return thuTuThamQuan;
    }

    public void setThuTuThamQuan(int thuTuThamQuan) {
        this.thuTuThamQuan = thuTuThamQuan;
    }
    
}
